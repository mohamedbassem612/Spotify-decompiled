package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class lvi0 {
    public static final ye90 a = ye90.m(new String[]{"nm", "mm", "hd"});

    public static jvi0 a(nha0 nha0Var) {
        int i = 0;
        String strM = null;
        boolean zH = false;
        while (nha0Var.g()) {
            int iQ = nha0Var.q(a);
            if (iQ == 0) {
                strM = nha0Var.m();
            } else if (iQ == 1) {
                int iJ = nha0Var.j();
                if (iJ != 1) {
                    if (iJ != 2) {
                        int i2 = 3;
                        if (iJ != 3) {
                            i2 = 4;
                            if (iJ != 4) {
                                i2 = 5;
                                if (iJ != 5) {
                                }
                            }
                        }
                        i = i2;
                    } else {
                        i = 2;
                    }
                }
                i = 1;
            } else if (iQ != 2) {
                nha0Var.u();
                nha0Var.v();
            } else {
                zH = nha0Var.h();
            }
        }
        return new jvi0(strM, i, zH);
    }
}
