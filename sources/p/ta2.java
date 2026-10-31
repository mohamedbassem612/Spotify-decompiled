package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ta2 implements qyo0 {
    public final lzn0 a;
    public final ov20 b;
    public final llm c;
    public boolean d;
    public xab1 e;

    public ta2(lzn0 lzn0Var, ov20 ov20Var, q8n q8nVar) {
        this.a = lzn0Var;
        this.b = ov20Var;
        this.c = smo1.e(q8nVar);
    }

    @Override // p.qyo0
    public final void c() {
        if (this.d) {
            return;
        }
        this.e = fn31.T(this.c, (o8n) null, 0, new qm(this, (lnm) null, (byte) 10), 3);
    }

    @Override // p.qyo0
    public final void d() {
        xab1 xab1Var = this.e;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
    }
}
