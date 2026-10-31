package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final enum y770 extends g870 {
    public final int h(y570 y570Var) {
        String strB = y570Var.g().B("style");
        if (jhc1.F(strB)) {
            if (jhc1.F(((id70) y570Var.n()).a.b)) {
                f870[] f870VarArr = f870.c;
                return 2131429165;
            }
            f870[] f870VarArr2 = f870.c;
            return 2131429170;
        }
        for (f870 f870Var : f870.values()) {
            if (f870Var.b.equals(strB)) {
                return f870Var.a;
            }
        }
        hhg1.n(l1d.m("Unknown style: ", strB));
        return 0;
    }
}
