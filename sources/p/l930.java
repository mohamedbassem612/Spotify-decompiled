package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class l930 {
    public static final ye90 a = ye90.m(new String[]{"fFamily", "fName", "fStyle", "ascent"});

    public static z830 a(nha0 nha0Var) {
        nha0Var.c();
        String strM = null;
        String strM2 = null;
        String strM3 = null;
        while (nha0Var.g()) {
            int iQ = nha0Var.q(a);
            if (iQ == 0) {
                strM = nha0Var.m();
            } else if (iQ == 1) {
                strM2 = nha0Var.m();
            } else if (iQ == 2) {
                strM3 = nha0Var.m();
            } else if (iQ != 3) {
                nha0Var.u();
                nha0Var.v();
            } else {
                nha0Var.i();
            }
        }
        nha0Var.e();
        return new z830(strM, strM2, strM3);
    }
}
