package com.gtappdevelopers.project1;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebView;

public class Second_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        WebView mywebview = (WebView) findViewById(R.id.webview);
        mywebview.loadUrl("https://www.poltekssn.ac.id");
    }
}
