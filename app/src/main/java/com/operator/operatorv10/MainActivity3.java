package com.operator.operatorv10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private Button button4;
    private Button button;
    private Button button5;
    private TextView textView3;
    private TextView textView4;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        button4 = findViewById(R.id.button4);
        button = findViewById(R.id.button);
        button5 = findViewById(R.id.button5);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
    }

    public void start (View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void start2 (View view) {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
}