package com.example.groupbotton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText text, text2;
    private TextView result;
    private RadioButton radio, radio2, radio3, radio4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (EditText) findViewById(R.id.text);
        text2 = (EditText) findViewById(R.id.text2);
        result = (TextView) findViewById(R.id.result);
        radio = (RadioButton) findViewById(R.id.radio);
        radio2 = (RadioButton) findViewById(R.id.radio2);
        radio3 = (RadioButton) findViewById(R.id.radio3);
        radio4 = (RadioButton) findViewById(R.id.radio4);
    }

    public void Calculate(View v)
    {
        int num, num2, suma, resta, mult, div;

        num = Integer.parseInt(text.getText().toString());
        num2 = Integer.parseInt(text2.getText().toString());

        if(radio.isChecked() == true)
        {
            suma = num + num2;
            String resultado = String.valueOf(suma);
            result.setText(resultado);
        }else if(radio2.isChecked() == true)
        {
        resta = num - num2;
        String resultado = String.valueOf(resta);
        result.setText(resultado);
        }else if(radio3.isChecked() == true)
        {
            mult = num * num2;
            String resultado = String.valueOf(mult);
            result.setText(resultado);
        }else if(radio4.isChecked() == true)
        {
            div = num / num2;
            String resultado = String.valueOf(div);
            result.setText(resultado);
        }

    }
}
