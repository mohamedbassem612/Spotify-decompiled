package p;

import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class km21 extends WebViewClient {
    public final Map a;
    public final r9y0 b;

    public km21(Map map, r9y0 r9y0Var) {
        this.a = map;
        this.b = r9y0Var;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        this.b.invoke(Boolean.valueOf(webView.canGoBack()));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (wl21.c(str)) {
            wl21.b(webView, this.a);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (wl21.c(str)) {
            wl21.b(webView, this.a);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return !wl21.c(webResourceRequest.getUrl().toString());
    }
}
