package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wfr0 extends x7e0 implements c9n {
    public final no2 d;
    public final o3e0 e;
    public final boolean f;
    public final o8n g;
    public Object h;

    public wfr0(no2 no2Var, q8n q8nVar, o3e0 o3e0Var, boolean z) {
        this.d = no2Var;
        this.e = o3e0Var;
        this.f = z;
        this.g = flo1.l(op71.f(), q8nVar);
    }

    public final o8n J() {
        return this.g;
    }

    public final void e() {
        if (d()) {
            return;
        }
        j();
        fn31.T(this, (o8n) null, 0, new ofk0(this, (lnm) null), 3);
    }

    public final void f() {
        op71.q(this.g, (CancellationException) null);
    }
}
