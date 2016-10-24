package com.example.xroms.homework1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.xroms.homework1.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String KEY_FIRST_VALUE = "firstValue";
    private static final String KEY_FIRST_BOOL = "firstempty";
    private static final String KEY_SECOND_VALUE = "secondValue";
    private static final String KEY_SECOND_BOOL = "secondempty";
    private static final String KEY_RESULT = "result";
    private static final String KEY_RESULT_BOOL = "resultempty";
    private static final String KEY_OPER = "op";
    private static final String KEY_OPER_BOOL = "opempty";
    private static final String KEY_ERROR = "error";



    double MIN = Integer.MIN_VALUE;
    double MAX = Integer.MAX_VALUE;
    double firstValue;
    boolean firstempty;
    double secondValue;
    boolean secondempty;
    double result;
    boolean resultempty;
    char op;
    boolean opempty;
    boolean error;

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button0;
    Button buttonSum;
    Button buttonSub;
    Button buttonMul;
    Button buttonDiv;
    Button buttonClear;
    Button buttonEqal;
    TextView viewresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        button1 = (Button) findViewById(R.id.d1);
        button2 = (Button) findViewById(R.id.d2);
        button3 = (Button) findViewById(R.id.d3);
        button4 = (Button) findViewById(R.id.d4);
        button5 = (Button) findViewById(R.id.d5);
        button6 = (Button) findViewById(R.id.d6);
        button7 = (Button) findViewById(R.id.d7);
        button8 = (Button) findViewById(R.id.d8);
        button9 = (Button) findViewById(R.id.d9);
        button0 = (Button) findViewById(R.id.d0);
        buttonSub = (Button) findViewById(R.id.sub);
        buttonMul = (Button) findViewById(R.id.mul);
        buttonDiv = (Button) findViewById(R.id.div);
        buttonSum = (Button) findViewById(R.id.sum);
        buttonEqal = (Button) findViewById(R.id.eqv);
        buttonClear = (Button) findViewById(R.id.clear);
        viewresult = (TextView) findViewById(R.id.result);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button0.setOnClickListener(this);
        buttonSum.setOnClickListener(this);
        buttonSub.setOnClickListener(this);
        buttonMul.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
        buttonEqal.setOnClickListener(this);
        buttonClear.setOnClickListener(this);

        firstValue = 0;
        firstempty = true;
        secondValue = 0;
        secondempty = true;
        op = ' ';
        opempty = true;
        resultempty = true;
        error = false;

        if (savedInstanceState != null) {
            firstValue = savedInstanceState.getDouble(KEY_FIRST_VALUE);
            firstempty = savedInstanceState.getBoolean(KEY_FIRST_BOOL);
            secondValue = savedInstanceState.getDouble(KEY_SECOND_VALUE);
            secondempty = savedInstanceState.getBoolean(KEY_SECOND_BOOL);
            op = savedInstanceState.getChar(KEY_OPER);
            opempty = savedInstanceState.getBoolean(KEY_OPER_BOOL);
            result = savedInstanceState.getDouble(KEY_RESULT);
            resultempty = savedInstanceState.getBoolean(KEY_RESULT_BOOL);
            error = savedInstanceState.getBoolean(KEY_ERROR);
        }

        refresh();
    }

    private String sout(double x) {
        double y = (double)(int)x;
        if (y == x) {
            return Integer.toString((int)x);
        }
        else {
            return Double.toString(x);
        }
    }

    public void refresh() {
        if (error) {
            viewresult.setText("ERROR");
            error = false;
            return;
        }
        if (!resultempty) {
            viewresult.setText(sout(result));
            return;
        }
        if (firstempty) {
            viewresult.setText("");
            return;
        }
        if (opempty) {
            viewresult.setText(sout(firstValue));
            return;
        }
        if (secondempty) {
            viewresult.setText(Character.toString(op));
            return;
        }
        viewresult.setText(sout(firstValue));
        return;
    }

    @Override
    public void onClick(View v) {
        if (v == button1) {
            resultempty = true;
            if ((firstValue * 10 + 1) <= MAX) {
                firstValue = firstValue * 10 + 1;
            }
            if (opempty) {
                firstempty = false;
            }
            else {
                secondempty = false;
            }
            refresh();
            return;
        }
        if (v == button2) {
            resultempty = true;
            if ((firstValue * 10 + 2) <= MAX) {
                firstValue = firstValue * 10 + 2;
            }
            if (opempty) {
                firstempty = false;
            }
            else {
                secondempty = false;
            }
            refresh();
            return;
        }
        if (v == button3) {
            resultempty = true;
            if ((firstValue * 10 + 3) <= MAX) {
                firstValue = firstValue * 10 + 3;
            }
            if (opempty) {
                firstempty = false;
            }
            else {
                secondempty = false;
            }
            refresh();
            return;
        }
        if (v == button4) {
            resultempty = true;
            if ((firstValue * 10 + 4) <= MAX) {
                firstValue = firstValue * 10 + 4;
            }
            if (opempty) {
                firstempty = false;
            }
            else {
                secondempty = false;
            }
            refresh();
            return;
        }
        if (v == button5) {
            resultempty = true;
            if ((firstValue * 10 + 5) <= MAX) {
                firstValue = firstValue * 10 + 5;
            }
            if (opempty) {
                firstempty = false;
            }
            else {
                secondempty = false;
            }
            refresh();
            return;
        }
        if (v == button6) {
            resultempty = true;
            if ((firstValue * 10 + 6) <= MAX) {
                firstValue = firstValue * 10 + 6;
            }
            if (opempty) {
                firstempty = false;
            }
            else {
                secondempty = false;
            }
            refresh();
            return;
        }
        if (v == button7) {
            resultempty = true;
            if ((firstValue * 10 + 7) <= MAX) {
                firstValue = firstValue * 10 + 7;
            }
            if (opempty) {
                firstempty = false;
            }
            else {
                secondempty = false;
            }
            refresh();
            return;
        }
        if (v == button8) {
            resultempty = true;
            if ((firstValue * 10 + 8) <= MAX) {
                firstValue = firstValue * 10 + 8;
            }
            if (opempty) {
                firstempty = false;
            }
            else {
                secondempty = false;
            }
            refresh();
            return;
        }
        if (v == button9) {
            resultempty = true;
            if ((firstValue * 10 + 9) <= MAX) {
                firstValue = firstValue * 10 + 9;
            }
            if (opempty) {
                firstempty = false;
            }
            else {
                secondempty = false;
            }
            refresh();
            return;
        }
        if (v == button0) {
            resultempty = true;
            if ((firstValue * 10 + 0) <= MAX) {
                firstValue = firstValue * 10 + 0;
            }
            if (opempty) {
                firstempty = false;
            }
            else {
                secondempty = false;
            }
            refresh();
            return;
        }
        if (v == buttonClear) {
            op = ' ';
            firstValue = 0;
            secondValue = 0;
            result = 0;
            opempty = true;
            firstempty = true;
            secondempty = true;
            resultempty = true;
            error = false;
            refresh();
            return;
        }
        if (v == buttonEqal) {
            if (op == '+') {
                result = firstValue + secondValue;
                secondValue = 0;
                firstValue = result;
                op = '=';
                resultempty = false;
                firstempty = false;
                opempty = true;
                secondempty = true;
            }
            if (op == '-') {
                result = secondValue - firstValue;
                secondValue = 0;
                firstValue = result;
                op = '=';
                resultempty = false;
                firstempty = false;
                opempty = true;
                secondempty = true;
            }
            if (op == '*') {
                result = firstValue * secondValue;
                secondValue = 0;
                firstValue = result;
                op = '=';
                resultempty = false;
                firstempty = false;
                opempty = true;
                secondempty = true;
            }
            if (op == '/') {
                if (firstValue == 0) {
                    error = true;
                }
                else {
                    result = secondValue / firstValue;
                    secondValue = 0;
                    firstValue = result;
                    op = '=';
                    resultempty = false;
                    firstempty = false;
                    opempty = true;
                    secondempty = true;
                }
            }
            if ((result > MAX) || (result < MIN)) {
                error = true;
            }
            refresh();
            return;
        }
        if (firstempty) {
            return;
        }
        if (v == buttonSum) {
            secondValue = firstValue;
            firstValue = 0;
            op = '+';
            opempty = false;
            secondempty = true;
        }
        if (v == buttonSub) {
            secondValue = firstValue;
            firstValue = 0;
            op = '-';
            opempty = false;
            secondempty = true;
        }
        if (v == buttonMul) {
            secondValue = firstValue;
            firstValue = 0;
            op = '*';
            opempty = false;
            secondempty = true;
        }
        if (v == buttonDiv) {
            secondValue = firstValue;
            firstValue = 0;
            op = '/';
            opempty = false;
            secondempty = true;
        }
        refresh();
    }

    @Override
    protected void onSaveInstanceState(Bundle state) {
        super.onSaveInstanceState(state);
        state.putDouble(KEY_RESULT, result);
        state.putDouble(KEY_FIRST_VALUE, firstValue);
        state.putDouble(KEY_SECOND_VALUE, secondValue);
        state.putBoolean(KEY_RESULT_BOOL, resultempty);
        state.putBoolean(KEY_SECOND_BOOL, secondempty);
        state.putBoolean(KEY_FIRST_BOOL, firstempty);
        state.putBoolean(KEY_ERROR, error);
        state.putBoolean(KEY_OPER_BOOL, opempty);
        state.putChar(KEY_OPER, op);
    }

}
