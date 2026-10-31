package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class u840 {
    public static final Set a;
    public static final Set b;
    public static final Set c;
    public static final Set d;

    static {
        d1q0 d1q0Var = d1q0.e;
        d1q0 d1q0Var2 = d1q0.f;
        d1q0 d1q0Var3 = d1q0.g;
        a = f46.S0(new d1q0[]{d1q0Var, d1q0Var2, d1q0Var3});
        d1q0 d1q0Var4 = d1q0.a;
        d1q0 d1q0Var5 = d1q0.b;
        d1q0 d1q0Var6 = d1q0.h;
        b = f46.S0(new d1q0[]{d1q0Var4, d1q0Var5, d1q0Var6});
        c = f46.S0(new d1q0[]{d1q0Var6, d1q0Var3});
        d = f46.S0(new d1q0[]{d1q0Var4, d1q0Var5});
    }

    public static final String a(j1q0 j1q0Var) {
        if (j1q0Var instanceof e1q0) {
            return ((e1q0) j1q0Var).a;
        }
        if (j1q0Var instanceof g1q0) {
            return null;
        }
        if (j1q0Var instanceof i1q0) {
            return ((i1q0) j1q0Var).b;
        }
        if (j1q0Var instanceof h1q0) {
            return ((h1q0) j1q0Var).a;
        }
        eg.o();
        return null;
    }
}
