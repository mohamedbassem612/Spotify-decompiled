package p;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qhp0 implements byf0, ViewTreeObserver.OnScrollChangedListener {
    public final bbr0 a;
    public nif1 b;
    public xab1 c;
    public ViewGroup d;
    public final llm e;
    public xab1 f;

    public qhp0(bbr0 bbr0Var) {
        this.a = bbr0Var;
        hhp0 hhp0Var = hhp0.a;
        fns fnsVar = igu.a;
        bs50 bs50Var = pyf0.a;
        j0d1 j0d1VarB = guo1.B();
        bs50Var.getClass();
        this.e = smo1.e(flo1.l(bs50Var, j0d1VarB).y(new z8n("ObservationPlatformPlugin.scroll")));
    }

    public final void a() {
        xab1 xab1Var = this.c;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        nif1 nif1Var = this.b;
        if (nif1Var != null) {
            nif1Var.e("ui.scrolling");
        }
        nif1 nif1Var2 = this.b;
        if (nif1Var2 != null) {
            nif1Var2.stop();
        }
        this.b = null;
    }

    public final void c() {
        ViewTreeObserver viewTreeObserver;
        ViewGroup viewGroup = this.d;
        if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnScrollChangedListener(this);
        }
        xab1 xab1Var = this.f;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.f = fn31.T(this.e, (o8n) null, 0, new nhp0(this, null, (byte) 1), 3);
    }

    public final void d() {
        ViewTreeObserver viewTreeObserver;
        xab1 xab1Var = this.f;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.f = null;
        ViewGroup viewGroup = this.d;
        if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnScrollChangedListener(this);
        }
        a();
    }

    public final void g(ViewGroup viewGroup) {
        this.d = viewGroup;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        if (this.b == null) {
            nif1 nif1VarL = ihp0.l(hhp0.a, "ui.scrolling", (Object) null, 6);
            this.b = nif1VarL;
            if (nif1VarL != null) {
                nif1VarL.c((Long) null, "ui.scrolling");
            }
        }
        xab1 xab1Var = this.c;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.c = fn31.T(this.e, (o8n) null, 0, new nhp0(this, null, (byte) 0), 3);
    }
}
