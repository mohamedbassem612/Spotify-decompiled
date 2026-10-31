package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class l7a0 {
    public static final ajn0 a = ajn0.e("message");
    public static final ajn0 b = ajn0.e("allowedTargets");
    public static final ajn0 c = ajn0.e("value");
    public static final Map d = sqg0.J(new mmr0[]{new mmr0(rfb1.t, eia0.c), new mmr0(rfb1.w, eia0.d), new mmr0(rfb1.x, eia0.f)});

    public static igv0 a(kf30 kf30Var, m7a0 m7a0Var, o860 o860Var) {
        cb11 cb11VarA;
        cb11 cb11VarA2;
        if (kf30Var.equals(rfb1.m) && (cb11VarA2 = m7a0Var.a(eia0.e)) != null) {
            return new x7a0(cb11VarA2, o860Var);
        }
        kf30 kf30Var2 = (kf30) d.get(kf30Var);
        if (kf30Var2 == null || (cb11VarA = m7a0Var.a(kf30Var2)) == null) {
            return null;
        }
        return b(o860Var, cb11VarA, false);
    }

    public static igv0 b(o860 o860Var, cb11 cb11Var, boolean z) {
        heg hegVarA = bb11.a(j2h1.s(cb11Var.a).n());
        kf30 kf30Var = eia0.c;
        if (hegVarA.equals(new heg(kf30Var.b(), kf30Var.a.g()))) {
            return new h8a0(cb11Var, o860Var);
        }
        kf30 kf30Var2 = eia0.d;
        if (hegVarA.equals(new heg(kf30Var2.b(), kf30Var2.a.g()))) {
            return new g8a0(cb11Var, o860Var);
        }
        kf30 kf30Var3 = eia0.f;
        if (hegVarA.equals(new heg(kf30Var3.b(), kf30Var3.a.g()))) {
            return new k7a0(o860Var, cb11Var, rfb1.x);
        }
        kf30 kf30Var4 = eia0.e;
        if (hegVarA.equals(new heg(kf30Var4.b(), kf30Var4.a.g()))) {
            return null;
        }
        return new dqb0(o860Var, cb11Var, z);
    }
}
