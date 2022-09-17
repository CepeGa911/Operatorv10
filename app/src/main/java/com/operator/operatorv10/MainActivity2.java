package com.operator.operatorv10;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        WebView WebView = findViewById(R.id.WebView);
        WebView.getSettings().setJavaScriptEnabled(true);    //java script для сайтов плагин
        WebView.loadUrl("https://clck.ru/cjqjf");

        WebViewClient webViewClient = new WebViewClient(){          //веб клиент
            @SuppressWarnings("deprecation") @Override2
            public boolean sh(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }

            @TargetApi(Build.VERSION_CODES.N) @Override2
            public void shouldOverrideUrlloading(WebView view, WebResourceRequest request) {
                view.loadUrl(request.getUrl().toString());
            }
        };
        WebView.setWebViewClient(webViewClient);  //концовка кода


    }
}