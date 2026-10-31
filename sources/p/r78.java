package p;

import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class r78 {
    public final ajg a;
    public final qd8 b;
    public final q78 c = new q78(this, (byte) 0);
    public final p78 d = new p78(this, (byte) 0);

    public r78(ajg ajgVar, qd8 qd8Var) {
        this.a = ajgVar;
        this.b = qd8Var;
    }

    public final void a(WebView webView) {
        webView.setWebViewClient(this.c);
        webView.setWebChromeClient(this.d);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowContentAccess(false);
        settings.setUserAgentString("Spotify-Android-Checkout/" + this.a.e() + "/" + v7n0.b);
        settings.setAllowFileAccess(false);
        settings.setDomStorageEnabled(true);
        settings.setGeolocationEnabled(false);
        if (Build.VERSION.SDK_INT >= 26) {
            settings.setSafeBrowsingEnabled(true);
        }
    }
}
