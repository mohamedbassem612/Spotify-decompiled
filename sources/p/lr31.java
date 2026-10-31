package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class lr31 {
    public static final ye90 a = ye90.m(new String[]{"nm", "r", "hd"});

    public static jr31 a(nha0 nha0Var, fcf0 fcf0Var) {
        boolean zH = false;
        String strM = null;
        q95 q95VarY = null;
        while (nha0Var.g()) {
            int iQ = nha0Var.q(a);
            if (iQ == 0) {
                strM = nha0Var.m();
            } else if (iQ == 1) {
                q95VarY = xpn1.y(nha0Var, fcf0Var, true);
            } else if (iQ != 2) {
                nha0Var.v();
            } else {
                zH = nha0Var.h();
            }
        }
        if (zH) {
            return null;
        }
        return new jr31(strM, q95VarY);
    }
}
