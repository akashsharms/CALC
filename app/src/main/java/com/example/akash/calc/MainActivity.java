package com.example.akash.calc;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tv1, tv2;
    Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10, bt11, bt12, bt13, bt14, bt15, bt16;
    String a = "";
    float op1, op2;
    int x = 0;
    boolean flag1 = false, flag2 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        bt1 = (Button) findViewById(R.id.buttone);
        bt2 = (Button) findViewById(R.id.button1);
        bt3 = (Button) findViewById(R.id.button2);
        bt4 = (Button) findViewById(R.id.button3);
        bt5 = (Button) findViewById(R.id.button4);
        bt6 = (Button) findViewById(R.id.button5);
        bt7 = (Button) findViewById(R.id.button6);
        bt8 = (Button) findViewById(R.id.button7);
        bt9 = (Button) findViewById(R.id.button8);
        bt10 = (Button) findViewById(R.id.button9);
        bt11 = (Button) findViewById(R.id.buttonp);
        bt12 = (Button) findViewById(R.id.buttons);
        bt13 = (Button) findViewById(R.id.buttona);
        bt14 = (Button) findViewById(R.id.buttond);
        bt15 = (Button) findViewById(R.id.button0);
        bt16 = (Button) findViewById(R.id.buttonm);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);
        bt10.setOnClickListener(this);
        bt11.setOnClickListener(this);
        bt12.setOnClickListener(this);
        bt13.setOnClickListener(this);
        bt14.setOnClickListener(this);
        bt15.setOnClickListener(this);
        bt16.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {


        try {
            switch (view.getId()) {

                case R.id.buttone:
                    if (a.length() == 0) {
                        tv2.setText("0");
                        break;
                    } else {
                        if (x == 1) {
                                op2 = Float.parseFloat(a);
                            flag2 = true;
                            int c = (int) (op1 + op2);
                            tv2.setText("");
                            tv1.setText("Total:" + c + "");
                            op1 = c;
                            flag2 = false;
                        }
                        if (x == 2) {

                                op2 = Float.parseFloat(a);
                            int c = (int) (op1 - op2);
                            tv2.setText("");
                            tv1.setText("Total:" + c + "");
                            op1 = c;
                            flag2 = false;
                        }
                        if (x == 3) {
                                op2 = Float.parseFloat(a);
                            int c = (int) (op1 * op2);
                            tv2.setText("");
                            tv1.setText("Total:" + c + "");
                            op1 = c;
                            flag2 = false;
                        }
                        if (x == 4) {
                                op2 = Float.parseFloat(a);
                            float c = ((float) op1 / op2);
                            tv2.setText("");
                            tv1.setText("Total:" + c + "");
                            op1 = c;
                            flag2 = false;
                        }
                        tv2.setText("0");

                        break;
                    }
                case R.id.buttonp:
                    if (a.length() == 0) {
                        a = a + "+";
                        tv2.setText(a);
                        break;
                    }
                    tv2.setText("+");
                    if(op1==0)
                    op1 =  Float.parseFloat(a);

                    flag1 = true;
                    a = "";
                    x = 1;

                    break;

                case R.id.buttond:
                    if (a.length() == 0) {
                        tv2.setText("0");
                        break;
                    }
                    tv2.setText("/");
                    if (tv1.length() == 6)
                        op1 = Float.parseFloat(a);
                    else op2 = Float.parseFloat(a);
                    flag1 = true;
                    x = 4;
                    a = "";
                    break;
                case R.id.buttonm:
                    if (a.length() == 0) {
                        tv2.setText("0");
                        break;
                    }

                    tv2.setText("*");
                    if(op1==0)
                   op1 = Float.parseFloat(a);
                    flag1 = true;
                    x = 3;
                    a = "";
                    break;
                case R.id.buttons:
                    if (a.length() == 0) {
                        a = a + "-";
                        tv2.setText(a);
                        break;
                    }
                    tv2.setText("-");
                    if (op1 == 0)
                        op1 = Float.parseFloat(a);
                   // else op1 = op1 - Float.parseFloat(a);
                    flag1 = true;
                    x = 2;
                    a = "";
                    break;
                case R.id.buttona:
                    tv1.setText("Total:");
                    a = "";
                    tv2.setText("0");
                    a = "";
                    op1 = 0;
                    op2 = 0;
                    break;
                case R.id.button0:
                    a = a + "0";
                    tv2.setText(a);
                    break;
                case R.id.button1:
                    a = a + "1";
                    tv2.setText(a);
                    break;
                case R.id.button2:
                    a = a + "2";
                    tv2.setText(a);
                    break;
                case R.id.button3:
                    a = a + "3";
                    tv2.setText(a);
                    break;
                case R.id.button4:
                    a = a + "4";
                    tv2.setText(a);
                    break;
                case R.id.button5:
                    a = a + "5";
                    tv2.setText(a);
                    break;
                case R.id.button6:
                    a = a + "6";
                    tv2.setText(a);
                    break;
                case R.id.button7:
                    a = a + "7";
                    tv2.setText(a);
                    break;
                case R.id.button8:
                    a = a + "8";
                    tv2.setText(a);
                    break;
                case R.id.button9:
                    a = a + "9";
                    tv2.setText(a);
                    break;

            }
        } catch (Exception e) {
            tv2.setText("Syntax Error");
        }
    }
    }
