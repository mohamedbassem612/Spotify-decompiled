package p;

import android.view.ViewGroup;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lh91 implements byf0 {
    public final oqs a;
    public final c9n b;
    public final q8n c;
    public final mhc d;
    public final axn0 e;
    public ViewGroup f;
    public xab1 g;

    public lh91(oqs oqsVar, c9n c9nVar, q8n q8nVar, mhc mhcVar, axn0 axn0Var) {
        this.a = oqsVar;
        this.b = c9nVar;
        this.c = q8nVar;
        this.d = mhcVar;
        this.e = axn0Var;
    }

    public final void c() {
        ViewGroup viewGroup = this.f;
        if (viewGroup == null) {
            return;
        }
        this.g = fn31.T(this.b, this.c, 0, new sb91(this, viewGroup, null, (byte) 1), 2);
    }

    public final void d() {
        xab1 xab1Var = this.g;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.g = null;
        this.a.a.m((Object) null, kh91.b);
    }

    public final void g(ViewGroup viewGroup) {
        this.f = viewGroup;
    }
}
