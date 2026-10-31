package p;

import android.webkit.WebView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class d9s extends WebView.VisualStateCallback {
    public final /* synthetic */ WebView a;
    public final /* synthetic */ iu30 b;

    public d9s(WebView webView, iu30 iu30Var) {
        this.a = webView;
        this.b = iu30Var;
    }

    @Override // android.webkit.WebView.VisualStateCallback
    public final void onComplete(long j) {
        WebView webView = this.a;
        boolean zIsAttachedToWindow = webView.isAttachedToWindow();
        iu30 iu30Var = this.b;
        if (zIsAttachedToWindow) {
            iu30Var.invoke(lgj0.a);
        } else {
            webView.addOnAttachStateChangeListener(new c9s(webView, iu30Var, (byte) 0));
        }
    }
}
