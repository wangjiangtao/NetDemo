package cforcustomer.lovesheep.com.webviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private WebView mWebView;
    private WebAppInterface mMyJavaScriptInterface;
    private TextView tv_bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWebView =  findViewById(R.id.webView);
        tv_bottom =  findViewById(R.id.tv_bottom);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mMyJavaScriptInterface = new WebAppInterface();
        mWebView.addJavascriptInterface(mMyJavaScriptInterface, "AndroidFunction");
        mWebView.setWebViewClient(new WebClient());
        mWebView.loadUrl("http://exploiter.ivydad.com/invite/newFriend/e2cf0e15547711e68ed590e2baab7e5c");
    }

    class WebClient extends WebViewClient {

        @Override
        public void onPageFinished(WebView view, String url) {
            view.loadUrl("javascript:AndroidFunction.resize(document.body.scrollHeight)");
        }
    }

    /**
     * WebView interface to communicate with Javascript
     */
    public class WebAppInterface {

        @JavascriptInterface
        public void resize(final float height) {
            float webViewHeight = (height * getResources().getDisplayMetrics().density);
            tv_bottom.setText("webView 高度为 : " + webViewHeight);
        }
    }
}
