package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class af71 implements anc0 {
    public final u9c0 a;
    public final koc0 b;
    public final hq41 c;
    public final q8n d;
    public xab1 e;

    public af71(hd71 hd71Var, u9c0 u9c0Var, koc0 koc0Var, hq41 hq41Var, q8n q8nVar) {
        this.a = u9c0Var;
        this.b = koc0Var;
        this.c = hq41Var;
        this.d = q8nVar;
    }

    public final void n() {
        xab1 xab1Var = this.e;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.e = fn31.T(this.a, this.d, 0, new b751(this, null, (byte) 14), 2);
    }

    public final void q() {
        xab1 xab1Var = this.e;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
    }
}
