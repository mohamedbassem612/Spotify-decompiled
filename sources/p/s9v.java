package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s9v {
    public static final ye90 f = ye90.m(new String[]{"ef"});
    public static final ye90 g = ye90.m(new String[]{"nm", "v"});
    public p95 a;
    public q95 b;
    public q95 c;
    public q95 d;
    public q95 e;

    public final tjq a(nha0 nha0Var, fcf0 fcf0Var) {
        q95 q95Var;
        q95 q95Var2;
        q95 q95Var3;
        q95 q95Var4;
        while (nha0Var.g()) {
            if (nha0Var.q(f) != 0) {
                nha0Var.u();
                nha0Var.v();
            } else {
                nha0Var.a();
                while (nha0Var.g()) {
                    nha0Var.c();
                    String strM = "";
                    while (nha0Var.g()) {
                        int iQ = nha0Var.q(g);
                        if (iQ == 0) {
                            strM = nha0Var.m();
                        } else if (iQ == 1) {
                            strM.getClass();
                            switch (strM) {
                                case "Distance":
                                    this.d = xpn1.y(nha0Var, fcf0Var, true);
                                    break;
                                case "Opacity":
                                    this.b = xpn1.y(nha0Var, fcf0Var, false);
                                    break;
                                case "Direction":
                                    this.c = xpn1.y(nha0Var, fcf0Var, false);
                                    break;
                                case "Shadow Color":
                                    this.a = xpn1.v(nha0Var, fcf0Var);
                                    break;
                                case "Softness":
                                    this.e = xpn1.y(nha0Var, fcf0Var, true);
                                    break;
                                default:
                                    nha0Var.v();
                                    break;
                            }
                        } else {
                            nha0Var.u();
                            nha0Var.v();
                        }
                    }
                    nha0Var.e();
                }
                nha0Var.d();
            }
        }
        p95 p95Var = this.a;
        if (p95Var == null || (q95Var = this.b) == null || (q95Var2 = this.c) == null || (q95Var3 = this.d) == null || (q95Var4 = this.e) == null) {
            return null;
        }
        return new tjq(p95Var, q95Var, q95Var2, q95Var3, q95Var4);
    }
}
