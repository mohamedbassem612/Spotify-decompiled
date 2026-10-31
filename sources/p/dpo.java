package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dpo {
    public final c9n a;
    public final hrr0 b = v8r.q((Object) null);
    public final hrr0 c = v8r.q((Object) null);
    public xab1 d;

    public dpo(c9n c9nVar) {
        this.a = c9nVar;
    }

    public final void a() {
        xab1 xab1Var = this.d;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.d = null;
        this.b.setValue((Object) null);
        this.c.setValue((Object) null);
    }

    public final void b() {
        cpo cpoVarC = c();
        this.c.setValue((Object) null);
        if (cpoVarC == null) {
            return;
        }
        xab1 xab1Var = this.d;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.d = fn31.T(this.a, (o8n) null, 0, new clo(this, cpoVarC, (lnm) null, (byte) 3), 3);
    }

    public final cpo c() {
        return (cpo) this.b.getValue();
    }
}
