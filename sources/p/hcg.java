package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class hcg {
    public static final ye90 a = ye90.m(new String[]{"nm", "p", "s", "hd", "d"});

    public static fcg a(nha0 nha0Var, fcf0 fcf0Var, int i) {
        boolean z = i == 3;
        boolean zH = false;
        String strM = null;
        y95 y95VarB = null;
        p95 p95VarC = null;
        while (nha0Var.g()) {
            int iQ = nha0Var.q(a);
            if (iQ == 0) {
                strM = nha0Var.m();
            } else if (iQ == 1) {
                y95VarB = s95.b(nha0Var, fcf0Var);
            } else if (iQ == 2) {
                p95VarC = xpn1.C(nha0Var, fcf0Var);
            } else if (iQ == 3) {
                zH = nha0Var.h();
            } else if (iQ != 4) {
                nha0Var.u();
                nha0Var.v();
            } else {
                z = nha0Var.j() == 3;
            }
        }
        return new fcg(strM, y95VarB, p95VarC, z, zH);
    }
}
