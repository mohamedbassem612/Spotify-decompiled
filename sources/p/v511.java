package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class v511 {
    public static final ye90 a = ye90.m(new String[]{"nm", "p", "s", "r", "hd"});

    public static u511 a(nha0 nha0Var, fcf0 fcf0Var) {
        String strM = null;
        y95 y95VarB = null;
        p95 p95VarC = null;
        q95 q95VarY = null;
        boolean zH = false;
        while (nha0Var.g()) {
            int iQ = nha0Var.q(a);
            if (iQ == 0) {
                strM = nha0Var.m();
            } else if (iQ == 1) {
                y95VarB = s95.b(nha0Var, fcf0Var);
            } else if (iQ == 2) {
                p95VarC = xpn1.C(nha0Var, fcf0Var);
            } else if (iQ == 3) {
                q95VarY = xpn1.y(nha0Var, fcf0Var, true);
            } else if (iQ != 4) {
                nha0Var.v();
            } else {
                zH = nha0Var.h();
            }
        }
        return new u511(strM, y95VarB, p95VarC, q95VarY, zH);
    }
}
