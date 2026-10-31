package p;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.spotify.base.java.logging.Logger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class l3n extends WebViewClient {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public l3n(zgl1 zgl1Var, g0l1 g0l1Var) {
        this.a = (byte) 2;
        this.b = zgl1Var;
        this.c = g0l1Var;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((Function0) obj).invoke();
                break;
            case 1:
                ((iu30) obj).invoke(new dhj0(str));
                break;
            default:
                super.onPageFinished(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        switch (this.a) {
            case 1:
                ((iu30) this.c).invoke(ehj0.a);
                break;
            default:
                super.onPageStarted(webView, str, bitmap);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        switch (this.a) {
            case 0:
                Logger.d("Error received loading the COPPA page: " + (webResourceError != null ? Integer.valueOf(webResourceError.getErrorCode()) : null) + " - " + ((Object) (webResourceError != null ? webResourceError.getDescription() : null)), new Object[0]);
                ((Function0) this.b).invoke();
                break;
            case 1:
                if (webResourceRequest.isForMainFrame()) {
                    ((iu30) this.c).invoke(new ihj0(webResourceError.getErrorCode() + ": " + ((Object) webResourceError.getDescription())));
                    break;
                }
                break;
            default:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        switch (this.a) {
            case 1:
                ((iu30) this.c).invoke(new ihj0(ab80.n("SSL Error: ", ": ", sslError.getPrimaryError(), sslError.getUrl())));
                sslErrorHandler.cancel();
                break;
            default:
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        boolean z = false;
        switch (b) {
            case 0:
                String strValueOf = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
                return !ihc1.y0(strValueOf) && nhc1.Y(strValueOf, "https://www.spotify.com/us/legal/managed-accounts-coppa-notice/plain/", false);
            case 1:
                iu30 iu30Var = (iu30) obj;
                j9s j9sVar = (j9s) obj2;
                if (j9sVar.b.length() > 0 && ihc1.h0(webResourceRequest.getUrl().toString(), j9sVar.b, false)) {
                    iu30Var.invoke(new jhj0(webResourceRequest.getUrl().toString()));
                    return true;
                }
                if (j9sVar.a) {
                    return ((ayf) j9sVar.c.getValue()).a.c(webResourceRequest.getUrl());
                }
                iu30Var.invoke(fhj0.a);
                return false;
            default:
                zgl1 zgl1Var = (zgl1) obj2;
                String string = webResourceRequest.getUrl().toString();
                ayf ayfVar = ((g0l1) obj).e;
                if (ayfVar != null) {
                    if (ayfVar.a.a(webResourceRequest.getUrl())) {
                        z = true;
                    }
                }
                zgl1Var.invoke(new s1l1(string, z));
                return true;
        }
    }

    public /* synthetic */ l3n(byte b, Object obj, cv30 cv30Var) {
        this.a = b;
        this.b = obj;
        this.c = cv30Var;
    }
}
