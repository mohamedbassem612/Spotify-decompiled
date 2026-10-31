package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v8k0 extends x7e0 {
    public final d0r d;
    public final s24 e;
    public final q8n f;
    public final wik0 g;
    public xab1 h;

    public v8k0(d0r d0rVar, s24 s24Var, q8n q8nVar, wik0 wik0Var) {
        this.d = d0rVar;
        this.e = s24Var;
        this.f = q8nVar;
        this.g = wik0Var;
    }

    public final void e() {
        j();
        this.h = fn31.T(smo1.e(this.f), (o8n) null, 0, new uug0((Object) this, (lnm) null, (byte) 8), 3);
    }

    public final void f() {
        xab1 xab1Var = this.h;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
    }
}
