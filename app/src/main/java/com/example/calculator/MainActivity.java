package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textDisplay, currentOperation;
    private Button button1, button2,
            button3, button4, button5,
            button6, button7,
            button8, button9, button0,
            buttonPlus, buttonMinus,
            buttonDivide, buttonCE,
            buttonMultiply, buttonC;

    private String input1 = "";
    private String input2 = "";
    private double input1DoubleForm = 0;
    private double getInput2DoubleForm = 0;
    private String operation = "";

    private boolean isFirst = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textDisplay = findViewById(R.id.display_text);
        currentOperation = findViewById(R.id.current_operation);
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
        buttonPlus = findViewById(R.id.buttonplus);
        buttonMinus = findViewById(R.id.buttonminus);
        buttonMultiply = findViewById(R.id.buttonmulti);
        buttonDivide = findViewById(R.id.buttondivide);
        buttonC = findViewById(R.id.buttonc);
        buttonCE = findViewById(R.id.buttonce);

        textDisplay.setText(input1);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFirst) {
                    input1 += "0";
                    textDisplay.setText(input1);
                } else {
                    input2 += "0";
                    textDisplay.setText(input2);
                }
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFirst) {
                    input1 += "1";
                    textDisplay.setText(input1);
                } else {
                    input2 += "1";
                    textDisplay.setText(input2);
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFirst) {
                    input1 += "2";
                    textDisplay.setText(input1);
                } else {
                    input2 += "2";
                    textDisplay.setText(input2);
                }
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textDisplay.setText(input2);
                isFirst = false;
                operation = "+";
                currentOperation.setText("+");
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isFirst = true;
                input2 = "";
                input1 = "";
                operation = "";
                textDisplay.setText(input1);
                currentOperation.setText("");
            }
        });

        buttonCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1DoubleForm = Double.parseDouble(input1);
                getInput2DoubleForm = Double.parseDouble(input2);

                if (operation.equals("+")) {
                    textDisplay.setText(input1DoubleForm + getInput2DoubleForm + "");
                }

                currentOperation.setText("=");

            }
        });
    }
}