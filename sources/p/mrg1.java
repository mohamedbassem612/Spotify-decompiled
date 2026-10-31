package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mrg1 implements ayl {
    public final dqm1 a;
    public final hce1 b;
    public final c9n c;
    public faa0 d;

    public mrg1(dqm1 dqm1Var, hce1 hce1Var, c9n c9nVar) {
        this.a = dqm1Var;
        this.b = hce1Var;
        this.c = c9nVar;
    }

    @Override // p.ayl
    public final void a(String str, String str2) {
        this.a.a(str, str2);
    }

    @Override // p.ayl
    public final void d(String str, String str2) {
        this.a.d(str, str2);
        faa0 faa0Var = this.d;
        if (faa0Var != null) {
            faa0Var.d((CancellationException) null);
        }
        this.d = c921.y(this.c, (o8n) null, 0, new k6g1(this, str, (lnm) null, (byte) 5), 3);
    }
}
