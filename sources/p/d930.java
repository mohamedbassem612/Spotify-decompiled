package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class d930 {
    public static final ye90 a = ye90.m(new String[]{"ch", "size", "w", "style", "fFamily", "data"});
    public static final ye90 b = ye90.m(new String[]{"shapes"});

    public static c930 a(nha0 nha0Var, fcf0 fcf0Var) {
        ArrayList arrayList = new ArrayList();
        nha0Var.c();
        String strM = null;
        String strM2 = null;
        double dI = 0.0d;
        char cCharAt = 0;
        while (nha0Var.g()) {
            int iQ = nha0Var.q(a);
            if (iQ == 0) {
                cCharAt = nha0Var.m().charAt(0);
            } else if (iQ == 1) {
                nha0Var.i();
            } else if (iQ == 2) {
                dI = nha0Var.i();
            } else if (iQ == 3) {
                strM = nha0Var.m();
            } else if (iQ == 4) {
                strM2 = nha0Var.m();
            } else if (iQ != 5) {
                nha0Var.u();
                nha0Var.v();
            } else {
                nha0Var.c();
                while (nha0Var.g()) {
                    if (nha0Var.q(b) != 0) {
                        nha0Var.u();
                        nha0Var.v();
                    } else {
                        nha0Var.a();
                        while (nha0Var.g()) {
                            arrayList.add(nyl.a(nha0Var, fcf0Var));
                        }
                        nha0Var.d();
                    }
                }
                nha0Var.e();
            }
        }
        nha0Var.e();
        return new c930(arrayList, cCharAt, dI, strM, strM2);
    }
}
