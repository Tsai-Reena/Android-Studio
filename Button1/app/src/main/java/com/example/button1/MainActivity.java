package com.example.button1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static int size = 30;
    public void bigger(View v) {
        TextView txv = (TextView) findViewById(R.id.txv);
        txv.setTextSize(++size);
    }
}