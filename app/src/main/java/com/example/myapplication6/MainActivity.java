  package com.example.myapplication6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

  public class MainActivity extends AppCompatActivity {
    double sum = 0.0;
    double temp = 0.0;
    int op = -1;
    double step = 1;
    boolean positive = true;
    boolean flag = true;
    TextView tv = null;
    Button sqrt = null;
    Button C = null;
    Button CE = null;
    Button dot = null;
    Button num1 = null;
    Button num2 = null;
    Button num3 = null;
    Button num4 = null;
    Button num5 = null;
    Button num6 = null;
    Button num7 = null;
    Button num8 = null;
    Button num9 = null;
    Button num0 = null;
    Button plus = null;
    Button subtract = null;
    Button multiply = null;
    Button divide = null;
    Button equal = null;
    NumUtil numUtil = new NumUtil();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tv=(TextView) findViewById(R.id.tv_result);
        num0 = (Button) findViewById(R.id.btn_zero);
        num0.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(temp < 0.00000001 && temp > 0.0)
                    tv.setText("0");
                else{
                    if(flag){
                        temp *= 10;
                    }else {
                        step /= 10;
                    }
                    tv.setText(numUtil._tv(temp));
                }
            }
        });
        num1 = (Button) findViewById(R.id.btn_one);
        num1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(flag){
                    temp *= 10;
                    temp += 1;
                }else {
                    step /= 10;
                    temp += step * 1.0;
                }
                tv.setText(numUtil._tv(temp));
            }
        });
        num2 = (Button) findViewById(R.id.btn_two);
        num2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(flag){
                    temp *= 10;
                    temp += 2;
                }else {
                    step /= 10;
                    temp += step * 2;
                }
                tv.setText(numUtil._tv(temp));
            }
        });
        num3 = (Button) findViewById(R.id.btn_three);
        num3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(flag){
                    temp *= 10;
                    temp += 3;
                }else {
                    step /= 10;
                    temp += step * 3;
                }
                tv.setText(numUtil._tv(temp));
            }
        });
        num4 = (Button) findViewById(R.id.btn_four);
        num4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(flag){
                    temp *= 10;
                    temp += 4;
                }else {
                    step /= 10;
                    temp += step * 4;
                }
                tv.setText(numUtil._tv(temp));
            }
        });
        num5 = (Button) findViewById(R.id.btn_five);
        num5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(flag){
                    temp *= 10;
                    temp += 5;
                }else {
                    step /= 10;
                    temp += step * 5;
                }
                tv.setText(numUtil._tv(temp));
            }
        });
        num6 = (Button) findViewById(R.id.btn_six);
        num6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(flag){
                    temp *= 10;
                    temp += 6;
                }else {
                    step /= 10;
                    temp += step * 6;
                }
                tv.setText(numUtil._tv(temp));
            }
        });
        num7 = (Button) findViewById(R.id.btn_seven);
        num7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(flag){
                    temp *= 10;
                    temp += 7;
                }else {
                    step /= 10;
                    temp += step * 7;
                }
                tv.setText(numUtil._tv(temp));
            }
        });
        num8 = (Button) findViewById(R.id.btn_eight);
        num8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(flag){
                    temp *= 10;
                    temp += 8;
                }else {
                    step /= 10;
                    temp += step * 8;
                }
                tv.setText(numUtil._tv(temp));
            }
        });
        num9 = (Button) findViewById(R.id.btn_nine);
        num9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(flag){
                    temp *= 10;
                    temp += 9;
                }else {
                    step /= 10;
                    temp += step * 9;
                }
                tv.setText(numUtil._tv(temp));
            }
        });
        dot = (Button) findViewById(R.id.btn_dot);
        dot.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(flag){
                    flag = false;
                    tv.setText(numUtil._tv(temp)+".");
                }
            }
        });
        equal = (Button) findViewById(R.id.btn_equal);
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(op == -1){
                    sum = temp;
                }else if(op == 1){
                    sum += temp;
                }else if(op == 2){
                    sum -= temp;
                }else if(op == 3){
                    sum *= temp;
                }else if(op == 4){
                    sum /= temp;
                }
                tv.setText(numUtil._tv(sum));
                positive = true;
                flag = true;
                sum = 0.0;
                temp = 0.0;
                step = 1.0;
                op = -1;
            }
        });
        plus = (Button) findViewById(R.id.btn_plus);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tv.setText("+");
                if(op == -1){
                    sum = temp;
                    temp = 0.0;
                }else{
                    if(op == 1){
                        sum += temp;
                    }else if(op == 2){
                        sum -= temp;
                    }else if(op == 3){
                        sum *= temp;
                    }else if(op == 4){
                        sum /= temp;
                    }
                }
                op = 1;
                temp = 0.0;
                positive = true;
                flag = true;
            }
        });
        subtract = (Button) findViewById(R.id.btn_minus);
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tv.setText("-");
                if(op == -1){
                    sum = temp;
                    temp = 0.0;
                }else{
                    if(op == 1){
                        sum += temp;
                    }else if(op == 2){
                        sum -= temp;
                    }else if(op == 3){
                        sum *= temp;
                    }else if(op == 4){
                        sum /= temp;
                    }
                }
                op = 2;
                temp = 0.0;
                positive = true;
                flag = true;
            }
        });
        multiply = (Button) findViewById(R.id.btn_multiply);
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tv.setText("×");
                if(op == -1){
                    sum = temp;
                    temp = 0.0;
                }else{
                    if(op == 1){
                        sum += temp;
                    }else if(op == 2){
                        sum -= temp;
                    }else if(op == 3){
                        sum *= temp;
                    }else if(op == 4){
                        sum /= temp;
                    }
                }
                op = 3;
                temp = 0.0;
                positive = true;
                flag = true;
            }
        });
        divide = (Button) findViewById(R.id.btn_divide);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tv.setText("÷");
                if(op == -1){
                    sum = temp;
                    temp = 0.0;
                }else{
                    if(op == 1){
                        sum += temp;
                    }else if(op == 2){
                        sum -= temp;
                    }else if(op == 3){
                        sum *= temp;
                    }else if(op == 4){
                        sum /= temp;
                    }
                }
                op = 4;
                temp = 0.0;
                positive = true;
                flag = true;
            }
        });
        C = (Button) findViewById(R.id.btn_cancel);
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tv.setText(" ");
                positive = true;
                flag = true;
                temp = 0.0;
            }
        });
        CE = (Button) findViewById(R.id.btn_clear);
        CE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tv.setText(" ");
                positive = true;
                flag = true;
                sum = 0.0;
                temp = 0.0;
                step = 1.0;
                op = -1;
            }
        });
        sqrt = (Button) findViewById(R.id.btn_sqrt);
        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(op == -1){
                    sum = temp;
                }else if(op == 1){
                    sum += temp;
                }else if(op == 2){
                    sum -= temp;
                }else if(op == 3){
                    sum *= temp;
                }else if(op == 4){
                    sum /= temp;
                }
                sum = Math.sqrt(sum);
                tv.setText(numUtil._tv(sum));
                positive = true;
                flag = true;
                sum = 0.0;
                temp = 0.0;
                step = 1.0;
                op = -1;
            }
        });
    }

}
