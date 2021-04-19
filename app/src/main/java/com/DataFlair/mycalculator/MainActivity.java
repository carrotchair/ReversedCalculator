package com.DataFlair.mycalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    int in1 = 0, i2 = 0;
    TextView edittext1;
    TextView edittext2;
    TextView edittext3;
    TextView edittext4;
    boolean Multiply, deci;
    Button button_0, button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8, button_9,
            button_Mul, button_Rand, button_Equ, button_Del;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_0 = (Button) findViewById(R.id.b0);
        button_1 = (Button) findViewById(R.id.b1);
        button_2 = (Button) findViewById(R.id.b2);
        button_3 = (Button) findViewById(R.id.b3);
        button_4 = (Button) findViewById(R.id.b4);
        button_5 = (Button) findViewById(R.id.b5);
        button_6 = (Button) findViewById(R.id.b6);
        button_7 = (Button) findViewById(R.id.b7);
        button_8 = (Button) findViewById(R.id.b8);
        button_9 = (Button) findViewById(R.id.b9);
        button_Mul = (Button) findViewById(R.id.bmul);
        button_Rand = (Button) findViewById(R.id.brand);
        button_Del = (Button) findViewById(R.id.buttonDel);
        button_Equ = (Button) findViewById(R.id.buttoneql);

        edittext1 = (TextView) findViewById(R.id.display);
        edittext2 = (TextView) findViewById(R.id.display2);
        edittext3 = (TextView) findViewById(R.id.display4);
        //edittext4 = (TextView) findViewById(R.id.display5);

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext2.setText(edittext2.getText() + "1");
            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext2.setText(edittext2.getText() + "2");
            }
        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext2.setText(edittext2.getText() + "3");
            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext2.setText(edittext2.getText() + "4");
            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext2.setText(edittext2.getText() + "5");
            }
        });

        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext2.setText(edittext2.getText() + "6");
            }
        });

        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext2.setText(edittext2.getText() + "7");
            }
        });

        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext2.setText(edittext2.getText() + "8");
            }
        });

        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext2.setText(edittext2.getText() + "9");
            }
        });

        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext2.setText(edittext2.getText() + "0");
            }
        });

        button_Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edittext1.getText().length() != 0) {
                    in1 = Integer.parseInt(edittext1.getText() + "");
                    Multiply = true;
                    deci = false;
                    edittext1.setText(null);
                }
            }
        });

        button_Rand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Integer> givenList = Arrays.asList(2,3,4,5,6,7,8,9);
                Random rand = new Random();
                Integer randomElement = givenList.get(rand.nextInt(givenList.size()));
                edittext1.setText(edittext1.getText() + "" + randomElement);
            }
        });

        button_Equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Multiply) {
                    i2 = Integer.parseInt(edittext1.getText() + "");
                }
                if (Multiply) {
                    edittext1.setText(in1 * i2 + "");
                    Multiply = false;
                }
                if (edittext1.getText().equals(edittext2.getText())) {
                    edittext3.setText("Correct! :)");
                } else {
                    edittext3.setText("Wrong! :(");
                }
            }
        });

        button_Del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText("");
                edittext2.setText("");
                edittext3.setText("");
                in1 = 0;
                i2 = 0;
            }
        });

    }
}
