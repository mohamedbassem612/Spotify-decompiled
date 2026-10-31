package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class u0h1 {
    public static final s0h1 a;
    public static final q0h1 b;
    public static final t0h1 c;
    public static final r0h1 d;
    public static final /* synthetic */ u0h1[] e;

    static {
        s0h1 s0h1Var = new s0h1();
        a = s0h1Var;
        q0h1 q0h1Var = new q0h1();
        b = q0h1Var;
        t0h1 t0h1Var = new t0h1();
        c = t0h1Var;
        r0h1 r0h1Var = new r0h1();
        d = r0h1Var;
        e = new u0h1[]{s0h1Var, q0h1Var, t0h1Var, r0h1Var};
    }

    public static u0h1 b(gmh1 gmh1Var) {
        if (gmh1Var.u0()) {
            return b;
        }
        return jto1.x(c4x0.N0.r0(), i3p1.C(gmh1Var), g0h1.d) ? d : c;
    }

    public static u0h1 valueOf(String str) {
        return (u0h1) Enum.valueOf(u0h1.class, str);
    }

    public static u0h1[] values() {
        return (u0h1[]) e.clone();
    }

    public u0h1 a(gmh1 gmh1Var) {
        return b(gmh1Var);
    }
}
