package com.operator.operatorv10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText textView2;
    private Button button2;
    private TextView textView;
    private Button button3;
    private Button button9;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView2 = findViewById(R.id.textView2);
        button2 = findViewById(R.id.button2);
        textView = findViewById(R.id.textView);
        button3 = findViewById(R.id.button3);
        button9 = findViewById(R.id.button9);


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Toast.makeText(MainActivity.this, "Введите номер банковской карты Тинькофф или закажите новую карту", Toast.LENGTH_LONG).show();


            }
        });
    }

    public void start(View view){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void start2(View view){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}