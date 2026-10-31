package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class wcv0 {
    public static final ye90 a = ye90.m(new String[]{"nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd", "d"});

    /* JADX WARN: Multi-variable type inference failed */
    public static vcv0 a(nha0 nha0Var, fcf0 fcf0Var, int i) {
        boolean z;
        boolean z2 = false;
        boolean z3 = true;
        int i2 = 3;
        int i3 = 0;
        boolean zH = false;
        boolean z4 = i == 3;
        String strM = null;
        q95 q95VarY = null;
        y95 y95VarB = null;
        q95 q95VarY2 = null;
        q95 q95VarY3 = null;
        q95 q95VarY4 = null;
        q95 q95VarY5 = null;
        q95 q95VarY6 = null;
        while (nha0Var.g()) {
            switch (nha0Var.q(a)) {
                case 0:
                    strM = nha0Var.m();
                    break;
                case 1:
                    int iJ = nha0Var.j();
                    int[] iArrH = l1d.H(2);
                    int length = iArrH.length;
                    int i4 = 0;
                    boolean z5 = z3;
                    while (true) {
                        if (i4 >= length) {
                            i3 = 0;
                        } else {
                            int i5 = iArrH[i4];
                            if (i5 != z5) {
                                if (i5 != 2) {
                                    throw null;
                                }
                                z = 2;
                            }
                            if (z == iJ) {
                                i3 = i5;
                            } else {
                                i4++;
                                z5 = true;
                            }
                        }
                        break;
                    }
                    break;
                case 2:
                    q95VarY = xpn1.y(nha0Var, fcf0Var, z2);
                    continue;
                case 3:
                    y95VarB = s95.b(nha0Var, fcf0Var);
                    continue;
                case 4:
                    q95VarY2 = xpn1.y(nha0Var, fcf0Var, z2);
                    continue;
                case 5:
                    q95VarY4 = xpn1.y(nha0Var, fcf0Var, z3);
                    continue;
                case 6:
                    q95VarY6 = xpn1.y(nha0Var, fcf0Var, z2);
                    continue;
                case 7:
                    q95VarY3 = xpn1.y(nha0Var, fcf0Var, z3);
                    continue;
                case 8:
                    q95VarY5 = xpn1.y(nha0Var, fcf0Var, z2);
                    continue;
                case 9:
                    zH = nha0Var.h();
                    continue;
                case 10:
                    if (nha0Var.j() == i2) {
                        z4 = z3 ? 1 : 0;
                    } else {
                        z4 = z2;
                        continue;
                    }
                    break;
                default:
                    nha0Var.u();
                    nha0Var.v();
                    continue;
            }
            z2 = false;
            z3 = true;
            i2 = 3;
        }
        return new vcv0(strM, i3, q95VarY, y95VarB, q95VarY2, q95VarY3, q95VarY4, q95VarY5, q95VarY6, zH, z4);
    }
}
