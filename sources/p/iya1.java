package p;

import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class iya1 extends WebViewClient {
    public final iu30 a;
    public final Function0 b;
    public final ry71 c;
    public final iu30 d;

    public iya1(iu30 iu30Var, Function0 function0, ry71 ry71Var, iu30 iu30Var2) {
        this.a = iu30Var;
        this.b = function0;
        this.c = ry71Var;
        this.d = iu30Var2;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        super.doUpdateVisitedHistory(webView, str, z);
        if (str != null) {
            this.a.invoke(str);
        }
        boolean z2 = false;
        if (webView != null && webView.canGoBack()) {
            z2 = true;
        }
        this.c.invoke(Boolean.valueOf(z2));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (str != null) {
            this.a.invoke(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
            return;
        }
        this.b.invoke();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        int statusCode;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest == null || !webResourceRequest.isForMainFrame() || webResourceResponse == null || 400 > (statusCode = webResourceResponse.getStatusCode()) || statusCode >= 600) {
            return;
        }
        this.b.invoke();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        this.b.invoke();
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        String string;
        if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || (string = url.toString()) == null) {
            return false;
        }
        if (((Boolean) this.d.invoke(string)).booleanValue()) {
            return true;
        }
        return !URLUtil.isNetworkUrl(string);
    }
}
