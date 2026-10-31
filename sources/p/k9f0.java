package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k9f0 implements g1r0 {
    public final w9f0 a;
    public final llm b;
    public xab1 c;

    public k9f0(q8n q8nVar, w9f0 w9f0Var) {
        this.a = w9f0Var;
        this.b = smo1.e(flo1.l(new z8n("LosslessRemoteDeviceMessageBoxPlugin"), q8nVar).y(new v62(olj0.T0, (byte) 13)));
    }

    public final void c() {
        this.c = fn31.T(this.b, (o8n) null, 0, new p6d0(this, (lnm) null, (byte) 20), 3);
    }

    public final void d() {
        xab1 xab1Var = this.c;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.c = null;
    }
}
