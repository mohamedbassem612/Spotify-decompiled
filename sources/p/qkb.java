package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class qkb {
    public static final ye90 a = ye90.m(new String[]{"ef"});
    public static final ye90 b = ye90.m(new String[]{"ty", "v"});

    public static dp5 a(nha0 nha0Var, fcf0 fcf0Var) {
        dp5 dp5Var = null;
        while (nha0Var.g()) {
            if (nha0Var.q(a) != 0) {
                nha0Var.u();
                nha0Var.v();
            } else {
                nha0Var.a();
                while (nha0Var.g()) {
                    nha0Var.c();
                    dp5 dp5Var2 = null;
                    while (true) {
                        boolean z = false;
                        while (true) {
                            if (!nha0Var.g()) {
                                break;
                            }
                            int iQ = nha0Var.q(b);
                            if (iQ != 0) {
                                if (iQ != 1) {
                                    nha0Var.u();
                                    nha0Var.v();
                                } else if (z) {
                                    dp5Var2 = new dp5(xpn1.y(nha0Var, fcf0Var, true), (byte) 5);
                                } else {
                                    nha0Var.v();
                                }
                            } else if (nha0Var.j() == 0) {
                                z = true;
                            }
                        }
                    }
                    nha0Var.e();
                    if (dp5Var2 != null) {
                        dp5Var = dp5Var2;
                    }
                }
                nha0Var.d();
            }
        }
        return dp5Var;
    }
}
