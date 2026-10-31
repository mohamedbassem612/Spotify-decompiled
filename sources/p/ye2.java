package p;

import android.view.ViewGroup;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ye2 implements byf0 {
    public final b7n a;
    public final zwz0 b;
    public final ov20 c;
    public final vb2 d;
    public final ze2 e;
    public final k7d f;
    public final kly0 g;
    public xab1 h;
    public final llm i;

    public ye2(b7n b7nVar, zwz0 zwz0Var, ov20 ov20Var, vb2 vb2Var, q8n q8nVar, ze2 ze2Var, k7d k7dVar, gbp gbpVar) {
        this.a = b7nVar;
        this.b = zwz0Var;
        this.c = ov20Var;
        this.d = vb2Var;
        this.e = ze2Var;
        this.f = k7dVar;
        this.g = gbpVar;
        this.i = smo1.e(q8nVar);
    }

    public final void c() {
        xab1 xab1Var = this.h;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.h = fn31.T(this.i, (o8n) null, 0, new xe2(this, (lnm) null, (byte) 0), 3);
    }

    public final void d() {
        xab1 xab1Var = this.h;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
    }

    public final void g(ViewGroup viewGroup) {
    }
}
