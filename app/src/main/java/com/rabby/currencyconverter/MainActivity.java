package com.rabby.currencyconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText taka;
    EditText dollar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        taka = (EditText) findViewById(R.id.taka);
        dollar = (EditText) findViewById(R.id.dollar);
        dollar.requestFocus();
        textView = (TextView) findViewById(R.id.textView);
    }

    public void ok(View view) {
        try{
           Double dollars = Double.valueOf(taka.getText().toString());
           Double takas = Double.valueOf(dollar.getText().toString());
            Double out = takas * dollars;
            textView.setText(out.toString());
        }catch (Exception e){
            textView.setText("");
        }

    }
}
