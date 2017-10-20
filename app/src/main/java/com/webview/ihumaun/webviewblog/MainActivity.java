package com.webview.ihumaun.webviewblog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView hkWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hkWeb = (WebView)findViewById(R.id.webSite);
        WebSettings webSettings=hkWeb.getSettings();
        webSettings.setJavaScriptEnabled(true);
        hkWeb.loadUrl("https://oasiscse.github.io");
        hkWeb.setWebViewClient(new WebViewClient());

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            switch (keyCode) {
                case KeyEvent.KEYCODE_BACK:
                    if (hkWeb.canGoBack()) {
                        hkWeb.goBack();
                    } else {
                        finish();
                    }
                    return true;
            }

        }
        return super.onKeyDown(keyCode, event);
    }
}
