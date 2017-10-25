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
    Double dollars = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        taka = (EditText) findViewById(R.id.taka);
        dollar = (EditText) findViewById(R.id.dollar);
        textView = (TextView) findViewById(R.id.textView);
    }

    public void ok(View view) {
        Double takas = Double.valueOf(taka.getText().toString());
        String d = dollar.getText().toString();
        if (d.length() != 0){
            dollars = Double.valueOf(d);
        }
        Double out = takas * dollars;
        textView.setText(out.toString());
    }
}
