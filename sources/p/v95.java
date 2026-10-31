package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class v95 {
    public static final ye90 a = ye90.m(new String[]{"a"});
    public static final ye90 b = ye90.m(new String[]{"fc", "sc", "sw", "t"});

    public static yu3 a(nha0 nha0Var, fcf0 fcf0Var) {
        nha0Var.c();
        yu3 yu3Var = null;
        while (nha0Var.g()) {
            if (nha0Var.q(a) != 0) {
                nha0Var.u();
                nha0Var.v();
            } else {
                nha0Var.c();
                p95 p95VarV = null;
                p95 p95VarV2 = null;
                q95 q95VarY = null;
                q95 q95VarY2 = null;
                while (nha0Var.g()) {
                    int iQ = nha0Var.q(b);
                    if (iQ == 0) {
                        p95VarV = xpn1.v(nha0Var, fcf0Var);
                    } else if (iQ == 1) {
                        p95VarV2 = xpn1.v(nha0Var, fcf0Var);
                    } else if (iQ == 2) {
                        q95VarY = xpn1.y(nha0Var, fcf0Var, true);
                    } else if (iQ != 3) {
                        nha0Var.u();
                        nha0Var.v();
                    } else {
                        q95VarY2 = xpn1.y(nha0Var, fcf0Var, true);
                    }
                }
                nha0Var.e();
                yu3Var = new yu3(p95VarV, p95VarV2, q95VarY, q95VarY2, (byte) 3);
            }
        }
        nha0Var.e();
        return yu3Var == null ? new yu3((Object) null, (Object) null, (Object) null, (Object) null, (byte) 3) : yu3Var;
    }
}
