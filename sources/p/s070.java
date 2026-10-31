package p;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s070 extends WebViewClient {
    public final /* synthetic */ bz60 a;
    public final /* synthetic */ boolean b;

    public s070(bz60 bz60Var, boolean z) {
        this.a = bz60Var;
        this.b = z;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        String string;
        if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null && (string = url.toString()) != null) {
            this.a.b(string, 2, this.b, webResourceRequest.isRedirect());
            if (webView != null) {
                webView.destroy();
            }
        }
        return true;
    }
}
