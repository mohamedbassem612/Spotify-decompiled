package p;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class u070 extends WebViewClient {
    public final /* synthetic */ bz60 a;
    public final /* synthetic */ bju b;
    public final /* synthetic */ iu30 c;

    public u070(bz60 bz60Var, bju bjuVar, iu30 iu30Var) {
        this.a = bz60Var;
        this.b = bjuVar;
        this.c = iu30Var;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        bju bjuVar = this.b;
        t45 t45Var = bjuVar.b;
        if (t45Var != null) {
            t45Var.g(kx40.f(2));
        }
        t45 t45Var2 = bjuVar.b;
        if (t45Var2 != null) {
            bjuVar.a.b(t45Var2.e());
        }
        bjuVar.b = null;
        this.c.invoke(m070.a);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        t45 t45Var = this.b.b;
        if (t45Var != null) {
            t45.m(t45Var, kx40.f(2), 4);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        String string;
        Uri url;
        if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || (string = url.toString()) == null) {
            string = "unknown";
        }
        bju bjuVar = this.b;
        t45 t45Var = bjuVar.b;
        if (t45Var != null) {
            bjuVar.a.b(t45Var.e());
        }
        bjuVar.b = null;
        this.c.invoke(new p070(string, i));
        if (Build.VERSION.SDK_INT < 27 || safeBrowsingResponse == null) {
            return;
        }
        safeBrowsingResponse.backToSafety(true);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        String string;
        if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null && (string = url.toString()) != null) {
            this.a.b(string, 1, webResourceRequest.hasGesture(), webResourceRequest.isRedirect());
        }
        return true;
    }
}
