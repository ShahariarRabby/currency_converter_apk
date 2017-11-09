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
        Double dollars = 0.0, takas = 0.0;
        String t = taka.getText().toString();
        String d = dollar.getText().toString();
        if (d.length() != 0) {
            dollars = Double.valueOf(d);
        }
        if (t.length() != 0) {
            takas = Double.valueOf(t);
        }
        Double out = takas * dollars;
        textView.setText(out.toString());
    }
}
