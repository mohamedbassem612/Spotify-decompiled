package p;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dya1 extends WebChromeClient {
    public final /* synthetic */ iu30 a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ iu30 c;

    public dya1(iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3) {
        this.a = iu30Var;
        this.b = iu30Var2;
        this.c = iu30Var3;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        this.b.invoke(Integer.valueOf(i));
        this.c.invoke(Boolean.valueOf(i < 100));
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        if (str != null) {
            this.a.invoke(str);
        }
    }
}
