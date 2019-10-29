package com.example.hw2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStructure;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn_0,btn_1,btn_2,btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_Add, btn_Sub, btn_Mul, btn_Div, btn_equal, btn_dec, btn_clear;
    EditText edit1;
    float Value1, Value2;
    boolean add, sub, mul, div ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 =  findViewById(R.id.btn_9);
        btn_dec = findViewById(R.id.btn_dec);
        btn_clear = findViewById(R.id.btn_clear);
        btn_Mul = findViewById(R.id.btn_Mul);
        btn_Div = findViewById(R.id.btn_Div);
        btn_Sub = findViewById(R.id.btn_Sub);
        btn_Add = findViewById(R.id.btn_Add);
        btn_equal = findViewById(R.id.btn_equal);
        btn_clear = findViewById(R.id.btn_clear);
        edit1 = findViewById(R.id.edit1);


        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"0");
            }
        });
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"4");
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"5");
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"6");
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"7");
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"8");
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"9");
            }
        });

        btn_dec.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String value = edit1.getText().toString();
                if(!value.contains(".")){ edit1.setText(value+".");} //check to make sure the decimal is not already added
            }
        });

        btn_Add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                add= true;
                Value1 = Float.valueOf(edit1.getText().toString());
                edit1.setText("");
            }
        });
        btn_Sub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                sub= true;
                Value1 = Float.valueOf(edit1.getText().toString());
                edit1.setText("");
            }
        });
        btn_Mul.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mul= true;
                Value1 = Float.valueOf(edit1.getText().toString());
                edit1.setText("");
            }
        });
        btn_Div.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                div= true;
                Value1 = Float.valueOf(edit1.getText().toString());
                edit1.setText("");
            }
        });



        btn_equal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Value2 = Float.valueOf(edit1.getText().toString());

                if(mul == true)
                {
                    mul = false;
                    edit1.setText(Value1*Value2+"");
                };
                if(div==true)
                {
                    div = false;
                    edit1.setText(Value1/Value2+"");
                }
                if(add==true)
                {
                    add = false;
                    edit1.setText(Value1+Value2+"");
                }
                if(sub==true)
                {
                    sub = false;
                    edit1.setText(Value1-Value2+"");
                }

            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText("");
            }
        });
    }
}
