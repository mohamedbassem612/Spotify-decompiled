package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r7y0 implements anc0 {
    public final q8n a;
    public final koc0 b;
    public final h3y0 c;
    public final i5y0 d;
    public final u6y0 e;
    public xab1 f;

    public r7y0(q8n q8nVar, koc0 koc0Var, h3y0 h3y0Var, i5y0 i5y0Var, u6y0 u6y0Var) {
        this.a = q8nVar;
        this.b = koc0Var;
        this.c = h3y0Var;
        this.d = i5y0Var;
        this.e = u6y0Var;
    }

    @Override // p.anc0
    public final void n() {
        if (this.d.c()) {
            return;
        }
        xab1 xab1Var = this.f;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.f = fn31.T(smo1.e(this.a), (o8n) null, 0, new ciw0(this, null, (byte) 1), 3);
    }

    @Override // p.anc0
    public final void q() {
        xab1 xab1Var = this.f;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
    }
}
