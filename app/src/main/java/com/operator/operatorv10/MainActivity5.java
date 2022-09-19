package com.operator.operatorv10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    private TextView textView7;
    private TextView textView8;
    private Button button8;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }

    public void start (View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}