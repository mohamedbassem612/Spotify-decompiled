package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class hf21 {
    public static final ye90 a = ye90.m(new String[]{"nm", "c", "o", "tr", "hd"});

    public static u511 a(nha0 nha0Var, fcf0 fcf0Var) {
        String strM = null;
        q95 q95VarY = null;
        q95 q95VarY2 = null;
        w95 w95VarA = null;
        boolean zH = false;
        while (nha0Var.g()) {
            int iQ = nha0Var.q(a);
            if (iQ == 0) {
                strM = nha0Var.m();
            } else if (iQ == 1) {
                q95VarY = xpn1.y(nha0Var, fcf0Var, false);
            } else if (iQ == 2) {
                q95VarY2 = xpn1.y(nha0Var, fcf0Var, false);
            } else if (iQ == 3) {
                w95VarA = x95.a(nha0Var, fcf0Var);
            } else if (iQ != 4) {
                nha0Var.v();
            } else {
                zH = nha0Var.h();
            }
        }
        return new u511(strM, q95VarY, q95VarY2, w95VarA, zH);
    }
}
