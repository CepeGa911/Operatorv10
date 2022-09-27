package com.operator.operatorv10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
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
        textView2.addTextChangedListener(new CurrencyTextWatcher());


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Toast.makeText(MainActivity.this, "Введите номер банковской карты Тинькофф или закажите новую карту", Toast.LENGTH_LONG).show();


            }
        });
    }

    public void start (View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void start2 (View view) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }

    private class CurrencyTextWatcher implements TextWatcher {
        StringBuilder sb = new StringBuilder();
        boolean ignore;

        private final char numPlace = 'X';

        @Override
        public void beforeTextChanged (CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged (CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged (Editable editable) {
            if (!ignore) {
                removeFormat(editable.toString());
                applyFormat(sb.toString());
                ignore = true;
                editable.replace(0, editable.length(), sb.toString());
                ignore = false;
            }

        }

        private void applyFormat (String text) {
            String template = getTemplate(text);
            sb.setLength(0);
            for (int i = 0, textIndex = 0; i < template.length() && textIndex < text.length(); i++) {
                if (template.charAt(i) == numPlace) {
                    sb.append(text.charAt(textIndex));
                    textIndex++;
                } else {
                    sb.append(template.charAt(i));
                }
            }
        }

        private void removeFormat (String text) {
            sb.setLength(0);
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                if (isNumberChar(c)) {
                    sb.append(c);
                }
            }
        }
        private boolean isNumberChar(char c) {
            return c >= '0' && c <= '9';
        }

        private String getTemplate(String text) {
            if (text.startsWith("")) {
                return "XXXX XXXX XXXX XXXX";
            }
            if (text.startsWith("")) {
                return "XXXX XXXX XXXX XXXX";
            }
            if (text.startsWith("")) {
                return "XXXX XXXX XXXX XXXX";
            }
            return  "XXXX XXXX XXXX XXXX";
        }
    }
}




