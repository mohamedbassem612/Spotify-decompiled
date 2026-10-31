package p;

import android.webkit.WebView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ees0 implements eds0 {
    public final /* synthetic */ gpv0 a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ hds0 c;
    public final /* synthetic */ iu30 d;

    public ees0(gpv0 gpv0Var, ven0 ven0Var, hds0 hds0Var, iu30 iu30Var) {
        this.a = gpv0Var;
        this.b = ven0Var;
        this.c = hds0Var;
        this.d = iu30Var;
    }

    public final void b() {
        this.d.invoke(zds0.a);
    }

    public final void d(String str, String str2) {
        boolean z = this.c.f;
        iu30 iu30Var = this.d;
        if (z) {
            iu30Var.invoke(new aes0(str, (String) null));
        } else {
            iu30Var.invoke(new aes0(str, str2));
        }
    }

    public final void f(double d) {
        this.d.invoke(new vds0(d));
    }

    public final void h(double d) {
        WebView webView = (WebView) this.b.getValue();
        iu30 iu30Var = this.d;
        if (webView == null || this.a != null) {
            iu30Var.invoke(new uds0(d));
        } else {
            webView.postVisualStateCallback(0L, new des0(iu30Var, d, (byte) 0));
        }
    }

    public final void i() {
        this.d.invoke(yds0.a);
    }

    public final void j(String str) {
        this.d.invoke(new wds0(str));
    }

    public final void k(String str, String str2) {
        this.d.invoke(new bes0(str, str2));
    }

    public final void l() {
        WebView webView;
        if (this.a == null && (webView = (WebView) this.b.getValue()) != null) {
            webView.evaluateJavascript("window.PciBridge.init(" + w0h1.d(k8b0.b).b(hds0.Companion.serializer(), this.c) + ");", null);
        }
    }
}
