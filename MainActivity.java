package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
    EditText inputBar;
    TextView resultBar;
    Button buttonCE;
    Button buttonC;
    Button buttonBS;
    Button buttonDivide;
    Button button7;
    Button button8;
    Button button9;
    Button buttonMultiply;
    Button button4;
    Button button5;
    Button button6;
    Button buttonMinus;
    Button button1;
    Button button2;
    Button button3;
    Button buttonPlus;
    Button button;
    Button button0;
    Button buttonDot;
    Button buttonEqual;


    String memory = "";
    String resultMemory = "";
    String num0 = "0";
    String num1 = "1";
    String num2 = "2";
    String num3 = "3";
    String num4 = "4";
    String num5 = "5";
    String num6 = "6";
    String num7 = "7";
    String num8 = "8";
    String num9 = "9";
    String butPlus = "+";
    String butMinus = "-";
    String butDivide = "/";
    String butMultiply = "x";
    String butDot = ".";







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputBar = findViewById(R.id.inputBar);
        resultBar = findViewById(R.id.resultBar);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonCE = findViewById(R.id.buttonCE);
        buttonC = findViewById(R.id.buttonC);
        buttonBS = findViewById(R.id.buttonBS);
        buttonDivide = findViewById(R.id.buttonDivide);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonEqual = findViewById(R.id.buttonEqual);
        buttonDot = findViewById(R.id.buttonDot);
        button = findViewById(R.id.button);

    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.button0:
                memory += num0;
                inputBar.setText(memory);
                break;
            case R.id.button1:
                memory += num1;
                inputBar.setText(memory);
                break;
            case R.id.button2:
                memory += num2;
                inputBar.setText(memory);
                break;
            case R.id.button3:
                memory += num3;
                inputBar.setText(memory);
                break;
            case R.id.button4:
                memory += num4;
                inputBar.setText(memory);
                break;
            case R.id.button5:
                memory += num5;
                inputBar.setText(memory);
                break;
            case R.id.button6:
                memory += num6;
                inputBar.setText(memory);
                break;
            case R.id.button7:
                memory += num7;
                inputBar.setText(memory);
                break;
            case R.id.button8:
                memory += num8;
                inputBar.setText(memory);
                break;
            case R.id.button9:
                memory += num9;
                inputBar.setText(memory);
                break;
            case R.id.buttonPlus:
                memory += butPlus;
                inputBar.setText(memory);
                break;
            case R.id.buttonMinus:
                memory += butMinus;
                inputBar.setText(memory);
                break;
            case R.id.buttonDivide:
                memory += butDivide;
                inputBar.setText(memory);
                break;
            case R.id.buttonMultiply:
                memory += butMultiply;
                inputBar.setText(memory);
                break;
            case R.id.buttonDot:
                memory += butDot;
                inputBar.setText(memory);
                break;

            case R.id.buttonEqual:
                try {
                    if (memory.contains(butPlus)) {
                        if (memory.contains(butDot)) {
                            double sum = 0.0;
                            String[] number = memory.split("\\+");
                            for (String s : number) {
                                double nu = Double.parseDouble(s.trim().replace(",", "."));
                                sum += nu;
                            }
                            resultMemory = String.valueOf(sum);
                        } else {
                            int sum = 0;
                            String[] number = memory.split("\\+");
                            for (String s : number) {
                                int nu = Integer.parseInt(s.trim());
                                sum += nu;
                            }
                            resultMemory = String.valueOf(sum);
                            Log.d("abc",resultMemory);
                        }
                        resultBar.setText(resultMemory.trim().replace(".", ","));

                    }
                    else if (memory.contains(butMinus)) {
                        if (memory.contains(butDot)) {
                            double minus = 0.0;
                            String[] number = memory.split("-");
                            for (String s : number) {
                                double nu = Double.parseDouble(s.trim().replace(",", "."));
                                if (minus == 0.0) {
                                    minus = nu;
                                } else {
                                    minus -= nu;
                                }
                            }
                            resultMemory = String.valueOf(minus);
                        } else {
                            int minus = 0;
                            String[] number = memory.split("-");
                            for (String s : number) {
                                int nu = Integer.parseInt(s.trim());
                                if (minus == 0) {
                                    minus = nu;
                                } else {
                                    minus -= nu;
                                }
                            }
                            resultMemory = String.valueOf(minus);
                        }
                        resultBar.setText(resultMemory.trim().replace(".", ","));
                    }
                    else if(memory.contains(butMultiply)) {
                        if (memory.contains(butDot)) {
                            double multiply = 1.0;
                            String[] number = memory.split("x");
                            for (String s : number) {
                                double nu = Double.parseDouble(s.trim().replace(",", "."));
                                if (multiply == 1.0) {
                                    multiply = nu;
                                } else {
                                    multiply *= nu;
                                }
                            }
                            resultMemory = String.valueOf(multiply);
                        } else {
                            int multiply = 1;
                            String[] number = memory.split("x");
                            for (String s : number) {
                                int nu = Integer.parseInt(s.trim());
                                if (multiply == 1) {
                                    multiply = nu;
                                } else {
                                    multiply *= nu;
                                }
                            }
                            resultMemory = String.valueOf(multiply);
                        }
                        resultBar.setText(resultMemory.trim().replace(".", ","));
                    }
                    else if(memory.contains(butDivide)) {
                        try {
                            if (memory.contains(butDot)) {
                                double divide = 0.0;
                                String[] number = memory.split("/");
                                for (String s : number) {
                                    double nu = Double.parseDouble(s.trim().replace(",", "."));
                                    if (divide == 0.0) {
                                        divide = nu;
                                    } else {
                                        divide /= nu;
                                    }
                                }
                                resultMemory = String.valueOf(divide);
                            } else {
                                int divide = 0;
                                String[] number = memory.split("/");
                                for (String s : number) {
                                    int nu = Integer.parseInt(s.trim());
                                    if (divide == 0) {
                                        divide = nu;
                                    } else {
                                        divide /= nu;
                                    }
                                }
                                resultMemory = String.valueOf(divide);
                            }
                            resultBar.setText(resultMemory.trim().replace(".", ","));
                        } catch (ArithmeticException e) {
                            resultBar.setText("Math Error");
                        }
                    }

                } catch (Exception e) {
                    resultBar.setText("Syntax Error");
                    break;
                }
                break;

            case R.id.buttonBS:
                try {
                    Editable result = inputBar.getText();
                    int startIndex = result.length() - 1;
                    int endIndex = result.length();
                    result = result.delete(startIndex, endIndex);
                    memory = result.toString();
                    inputBar.setText(result);
                    resultBar.setText("");
                } catch (Exception e) {
                    break;
                }
                break;
            case R.id.buttonC:
                inputBar.getText().clear();

            default:
                break;
        }
    }
}