package p;

import android.graphics.Insets;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x0g0 implements rjp0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fkk1 b;

    public /* synthetic */ x0g0(fkk1 fkk1Var, byte b) {
        this.a = b;
        this.b = fkk1Var;
    }

    public final void b(Object obj) {
        byte b = this.a;
        jkk1 jkk1Var = this.b;
        switch (b) {
            case 0:
                Insets insetsB = mna0.b(obj);
                z0g0 z0g0Var = (z0g0) jkk1Var;
                z0g0Var.d.c(z0g0.f[1], z0g0Var, nk80.c(jah.b(insetsB), jah.l(insetsB), jah.n(insetsB), jah.o(insetsB)));
                break;
            default:
                Insets insetsB2 = mna0.b(obj);
                jkk1 jkk1Var2 = jkk1Var;
                jkk1Var2.n.c(jkk1.t[2], jkk1Var2, nk80.c(jah.b(insetsB2), jah.l(insetsB2), jah.n(insetsB2), jah.o(insetsB2)));
                break;
        }
    }
}
