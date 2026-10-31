package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class ix61 {
    public static final ye90 a = ye90.m(new String[]{"s", "e", "o", "nm", "m", "hd"});

    public static hx61 a(nha0 nha0Var, fcf0 fcf0Var) {
        int i = 0;
        boolean zH = false;
        String strM = null;
        q95 q95VarY = null;
        q95 q95VarY2 = null;
        q95 q95VarY3 = null;
        while (nha0Var.g()) {
            int iQ = nha0Var.q(a);
            if (iQ == 0) {
                q95VarY = xpn1.y(nha0Var, fcf0Var, false);
            } else if (iQ == 1) {
                q95VarY2 = xpn1.y(nha0Var, fcf0Var, false);
            } else if (iQ == 2) {
                q95VarY3 = xpn1.y(nha0Var, fcf0Var, false);
            } else if (iQ == 3) {
                strM = nha0Var.m();
            } else if (iQ == 4) {
                int iJ = nha0Var.j();
                if (iJ == 1) {
                    i = 1;
                } else {
                    if (iJ != 2) {
                        hhg1.n(f4i1.c(iJ, "Unknown trim path type "));
                        return null;
                    }
                    i = 2;
                }
            } else if (iQ != 5) {
                nha0Var.v();
            } else {
                zH = nha0Var.h();
            }
        }
        return new hx61(strM, i, q95VarY, q95VarY2, q95VarY3, zH);
    }
}
