package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wr00 {
    public final iac0 a;
    public final ynb0 b;
    public faa0 c;
    public final vr00 d = new vr00(this);

    public wr00(iac0 iac0Var, ynb0 ynb0Var) {
        this.a = iac0Var;
        this.b = ynb0Var;
    }

    public final void a(String str) {
        faa0 faa0Var = this.c;
        if (faa0Var != null) {
            faa0Var.d((CancellationException) null);
        }
        this.c = c921.y(zso1.H(this.a.getLifecycle()), (o8n) null, 0, new ymu(this, str, (lnm) null, (byte) 29), 3);
    }
}
