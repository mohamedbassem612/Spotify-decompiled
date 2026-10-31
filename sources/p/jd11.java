package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class jd11 {
    public tka0 b(Class cls) {
        return new meg(cls);
    }

    public kla0 c(Class cls) {
        return new kzq0(cls);
    }

    public oma0 d(oma0 oma0Var) {
        g1h1 g1h1Var = (g1h1) oma0Var;
        return new g1h1(oma0Var.k(), oma0Var.v(), g1h1Var.n(), g1h1Var.l() | 2);
    }

    public String k(jv30 jv30Var) {
        String string = jv30Var.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String l(hab0 hab0Var) {
        return k(hab0Var);
    }

    public oma0 m(tka0 tka0Var, List list, boolean z) {
        return new g1h1(tka0Var, list, z);
    }

    public nla0 a(sv30 sv30Var) {
        return sv30Var;
    }

    public vla0 e(den0 den0Var) {
        return den0Var;
    }

    public xla0 f(een0 een0Var) {
        return een0Var;
    }

    public yla0 g(fen0 fen0Var) {
        return fen0Var;
    }

    public ima0 h(bey0 bey0Var) {
        return bey0Var;
    }

    public kma0 i(cey0 cey0Var) {
        return cey0Var;
    }

    public lma0 j(dey0 dey0Var) {
        return dey0Var;
    }
}
