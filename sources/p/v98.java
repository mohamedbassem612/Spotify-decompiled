package p;

import android.view.ViewGroup;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class v98 implements iyf0, byf0 {
    public final dg30 a;
    public final i1r0 b;
    public final mr20 c;
    public final q8n d;
    public xab1 e;

    public v98(dg30 dg30Var, i1r0 i1r0Var, mr20 mr20Var, q8n q8nVar) {
        this.a = dg30Var;
        this.b = i1r0Var;
        this.c = mr20Var;
        this.d = q8nVar;
    }

    public final void c() {
        this.e = l4p1.u(cto1.q(this.a), f5p1.q(o4p1.r(this.c, this.d), new u98(this)));
    }

    public final void d() {
        xab1 xab1Var = this.e;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
    }

    public final void g(ViewGroup viewGroup) {
    }
}
