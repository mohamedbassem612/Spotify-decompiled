package p;

import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mb5 implements bar {
    public final boolean a;

    public mb5() {
        this.a = Build.VERSION.SDK_INT < 34;
    }

    @Override // p.bar
    public final car a(oka1 oka1Var, dqq0 dqq0Var) {
        gbc gbcVarD1 = oka1Var.a.d1();
        if (!gbcVarD1.i0(0L, z9r.b) && !gbcVarD1.i0(0L, z9r.a) && (!gbcVarD1.i0(0L, z9r.c) || !gbcVarD1.i0(8L, z9r.d) || !gbcVarD1.i0(12L, z9r.e) || !gbcVarD1.request(21L) || ((byte) (gbcVarD1.k().g(20L) & 2)) <= 0)) {
            if (Build.VERSION.SDK_INT < 30 || !gbcVarD1.i0(4L, z9r.f)) {
                return null;
            }
            if (!gbcVarD1.i0(8L, z9r.g) && !gbcVarD1.i0(8L, z9r.h) && !gbcVarD1.i0(8L, z9r.i)) {
                return null;
            }
        }
        return new rb5(oka1Var.a, dqq0Var, this.a);
    }
}
