package com.operator.operatorv10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    private TextView textView5;
    private TextView textView6;
    private Button button6;
    private Button button7;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);

    }
    public void start (View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void start2(View view){
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }
}