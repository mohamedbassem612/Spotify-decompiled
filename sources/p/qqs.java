package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qqs implements o5s {
    public final kt91 a;
    public final q8n b;
    public xab1 c;

    public qqs(gj5 gj5Var, kt91 kt91Var, q8n q8nVar) {
        this.a = kt91Var;
        this.b = q8nVar;
        ((f0i) gj5Var).a.a(this);
    }

    public final void a(er91 er91Var) {
        xab1 xab1Var = this.c;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.c = fn31.T(smo1.e(this.b), (o8n) null, 0, new n5s(this, er91Var, null, (byte) 10), 3);
    }

    public final void onStop(iac0 iac0Var) {
        xab1 xab1Var = this.c;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
    }
}
