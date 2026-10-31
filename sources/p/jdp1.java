package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jdp1 extends pno1 {
    public final kap1 d;

    public jdp1(kap1 kap1Var) {
        w(kap1Var, a2x0.c1);
        this.d = kap1Var;
    }

    public static void w(kap1 kap1Var, a2x0 a2x0Var) {
        gap1 gap1Var = (gap1) kap1Var.c;
        if (gap1Var == gap1.d || gap1Var == gap1.e) {
            a2x0.a(a2x0Var);
        }
    }

    @Override // p.pno1
    public final w9p1 u() {
        kap1 kap1Var = this.d;
        return new gdp1((String) kap1Var.a, (clv) kap1Var.d);
    }

    @Override // p.pno1
    public final Integer v() {
        return (Integer) this.d.e;
    }
}
