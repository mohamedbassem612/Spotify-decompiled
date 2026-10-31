package p;

import android.graphics.Bitmap;
import android.os.Handler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ja00 extends WebViewClient {
    public final Handler a;
    public final iu30 b;
    public final g0l1 c;
    public final HashMap d = new HashMap();

    public ja00(Handler handler, iu30 iu30Var, g0l1 g0l1Var) {
        this.a = handler;
        this.b = iu30Var;
        this.c = g0l1Var;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        HashMap map = this.d;
        Runnable runnable = (Runnable) map.remove(str);
        if (runnable != null) {
            this.a.removeCallbacks(runnable);
        }
        map.put(str, new xwn1(str, this, (byte) 19));
        this.b.invoke(new h2l1(str));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.getProgress();
        if (webView.getProgress() == 100) {
            HashMap map = this.d;
            if (map.containsKey(str)) {
                this.b.invoke(new z1l1(str));
                Runnable runnable = (Runnable) map.remove(str);
                if (runnable != null) {
                    this.a.removeCallbacks(runnable);
                }
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        HashMap map = this.d;
        if (map.containsKey(str)) {
            return;
        }
        this.b.invoke(new y1l1(str));
        Runnable xwn1Var = new xwn1(str, this, (byte) 19);
        map.put(str, xwn1Var);
        this.a.postDelayed(xwn1Var, 10000L);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (webResourceRequest.isForMainFrame()) {
            String string = webResourceRequest.getUrl().toString();
            this.b.invoke(new x1l1(string));
            Runnable runnable = (Runnable) this.d.remove(string);
            if (runnable != null) {
                this.a.removeCallbacks(runnable);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (webResourceRequest.isForMainFrame()) {
            String string = webResourceRequest.getUrl().toString();
            this.b.invoke(new x1l1(string, "http", Integer.valueOf(webResourceResponse.getStatusCode())));
            Runnable runnable = (Runnable) this.d.remove(string);
            if (runnable != null) {
                this.a.removeCallbacks(runnable);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String string = webResourceRequest.getUrl().toString();
        ayf ayfVarA = this.c.a();
        boolean z = false;
        if (ayfVarA != null && ayfVarA.a(webResourceRequest.getUrl())) {
            z = true;
        }
        this.b.invoke(new r1l1(string, z));
        return true;
    }
}
