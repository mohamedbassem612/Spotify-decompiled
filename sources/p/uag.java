package p;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class uag extends WebViewClient {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public uag(ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, ven0 ven0Var4, ven0 ven0Var5) {
        this.b = ven0Var;
        this.c = ven0Var2;
        this.d = ven0Var3;
        this.e = ven0Var4;
        this.f = ven0Var5;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        byte b = this.a;
        Object obj = this.d;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                super.onPageFinished(webView, str);
                Uri uri = str != null ? Uri.parse(str) : null;
                if (o7h.i0(xag.a, uri != null ? uri.getHost() : null)) {
                    if (u890.j(uri != null ? uri.getScheme() : null, "https") && webView != null) {
                        webView.evaluateJavascript((String) obj, null);
                    }
                }
                ven0Var.setValue(Boolean.FALSE);
                break;
            default:
                ven0 ven0Var2 = (ven0) this.e;
                Boolean bool = Boolean.FALSE;
                ven0Var.setValue(bool);
                ven0 ven0Var3 = (ven0) obj;
                if (!((Boolean) ven0Var3.getValue()).booleanValue()) {
                    ((ven0) this.c).setValue(Boolean.TRUE);
                    if (((ckl1) ven0Var2.getValue()) == ckl1.c && !((Boolean) ((ven0) this.f).getValue()).booleanValue()) {
                        ven0Var2.setValue(ckl1.b);
                        break;
                    }
                } else {
                    ven0Var3.setValue(bool);
                    break;
                }
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        byte b = this.a;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                super.onPageStarted(webView, str, bitmap);
                Set set = xag.a;
                ven0Var.setValue(Boolean.TRUE);
                break;
            default:
                ven0 ven0Var2 = (ven0) this.f;
                Boolean bool = Boolean.FALSE;
                ven0Var2.setValue(bool);
                ((ven0) this.c).setValue(bool);
                ven0 ven0Var3 = (ven0) this.e;
                if (((ckl1) ven0Var3.getValue()) != ckl1.c) {
                    ven0Var3.setValue(ckl1.b);
                }
                ven0Var.setValue(Boolean.TRUE);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        switch (this.a) {
            case 0:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (webResourceError != null) {
                    webResourceError.getErrorCode();
                }
                Objects.toString(webResourceError != null ? webResourceError.getDescription() : null);
                if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                    Set set = xag.a;
                    this.b.setValue(Boolean.FALSE);
                    break;
                }
                break;
            default:
                if (webResourceRequest.isForMainFrame()) {
                    ((ven0) this.e).setValue(ckl1.c);
                    ((ven0) this.f).setValue(Boolean.TRUE);
                    break;
                }
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        switch (this.a) {
            case 0:
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                if (webResourceResponse != null) {
                    webResourceResponse.getStatusCode();
                }
                if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                    Set set = xag.a;
                    this.b.setValue(Boolean.FALSE);
                    break;
                }
                break;
            default:
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        switch (this.a) {
            case 1:
                ((ven0) this.e).setValue(ckl1.c);
                ((ven0) this.f).setValue(Boolean.TRUE);
                sslErrorHandler.cancel();
                break;
            default:
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e5, code lost:
    
        if (r2.equals("HEAD") == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ec, code lost:
    
        if (r2.equals("GET") == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f3, code lost:
    
        if (r13.isForMainFrame() == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f5, code lost:
    
        r1 = (java.lang.String) r11.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fa, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:?, code lost:
    
        return ((p.csj1) r11.e).d(r0, r2, r1, r13.getRequestHeaders());
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
    
        return null;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r12, android.webkit.WebResourceRequest r13) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.uag.shouldInterceptRequest(android.webkit.WebView, android.webkit.WebResourceRequest):android.webkit.WebResourceResponse");
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        switch (this.a) {
            case 0:
                if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
                    String scheme = url.getScheme();
                    String lowerCase = scheme != null ? scheme.toLowerCase(Locale.ROOT) : null;
                    if (!o7h.i0(xag.c, lowerCase)) {
                        if (o7h.i0(xag.a, url.getHost()) && u890.j(lowerCase, "https")) {
                            return false;
                        }
                        if (u890.j(lowerCase, "spotify")) {
                            ((gag) this.f).navigate(url.toString());
                        }
                    }
                }
                return true;
            default:
                Boolean bool = Boolean.TRUE;
                this.b.setValue(bool);
                ven0 ven0Var = (ven0) this.c;
                if (!((Boolean) ven0Var.getValue()).booleanValue()) {
                    ((ven0) this.d).setValue(bool);
                }
                ven0Var.setValue(Boolean.FALSE);
                return false;
        }
    }

    public uag(String str, String str2, csj1 csj1Var, ven0 ven0Var, gag gagVar) {
        this.c = str;
        this.d = str2;
        this.e = csj1Var;
        this.b = ven0Var;
        this.f = gagVar;
    }
}
