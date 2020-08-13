package sg.edu.rp.soi.demomywebbrowserenhanced;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnLoadURL;
    WebView wvMyPage;
    EditText etURL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            btnLoadURL=findViewById(R.id.buttonLoad);
            etURL=findViewById(R.id.URL);
            wvMyPage = findViewById(R.id.webViewMyPage);
            wvMyPage.setWebViewClient(new WebViewClient());
            btnLoadURL.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String url = etURL.getText().toString();
                    etURL.setVisibility(View.GONE);
                    wvMyPage.loadUrl(url);
                }
            });
    }
}
