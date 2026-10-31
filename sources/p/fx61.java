package p;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class fx61 {
    public static final ye90 a = ye90.m(new String[]{"nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d"});
    public static final ye90 b = ye90.m(new String[]{"n", "v"});

    public static ex61 a(nha0 nha0Var, fcf0 fcf0Var) {
        ArrayList arrayList = new ArrayList();
        p95 p95VarV = null;
        String strM = null;
        String str = null;
        q95 q95VarY = null;
        String strY = null;
        float fI = 0.0f;
        int i = 0;
        int i2 = 0;
        boolean zH = false;
        p95 p95Var = null;
        while (nha0Var.g()) {
            switch (nha0Var.q(a)) {
                case 0:
                    strM = nha0Var.m();
                    break;
                case 1:
                    p95VarV = xpn1.v(nha0Var, fcf0Var);
                    break;
                case 2:
                    q95VarY = xpn1.y(nha0Var, fcf0Var, true);
                    break;
                case 3:
                    p95Var = xpn1.B(nha0Var, fcf0Var);
                    break;
                case 4:
                    i = l1d.H(3)[nha0Var.j() - 1];
                    break;
                case 5:
                    i2 = l1d.H(3)[nha0Var.j() - 1];
                    break;
                case 6:
                    fI = (float) nha0Var.i();
                    break;
                case 7:
                    zH = nha0Var.h();
                    break;
                case 8:
                    nha0Var.a();
                    while (nha0Var.g()) {
                        nha0Var.c();
                        String strM2 = strY;
                        while (nha0Var.g()) {
                            int iQ = nha0Var.q(b);
                            if (iQ == 0) {
                                strM2 = nha0Var.m();
                            } else if (iQ != 1) {
                                nha0Var.u();
                                nha0Var.v();
                            } else {
                                strY = xpn1.y(nha0Var, fcf0Var, true);
                            }
                        }
                        nha0Var.e();
                        strM2.getClass();
                        switch (strM2) {
                            case "d":
                            case "g":
                                fcf0Var.o = true;
                                arrayList.add(strY);
                                break;
                            case "o":
                                str = strY;
                                break;
                        }
                        strY = null;
                    }
                    nha0Var.d();
                    if (arrayList.size() == 1) {
                        arrayList.add((q95) arrayList.get(0));
                    }
                    break;
                default:
                    nha0Var.v();
                    continue;
            }
            strY = null;
        }
        if (p95Var == null) {
            p95Var = new p95(Collections.singletonList(new sua0(100)), false);
        }
        if (i == 0) {
            i = 1;
        }
        if (i2 == 0) {
            i2 = 1;
        }
        int i3 = i2;
        return new ex61(strM, str, arrayList, p95VarV, p95Var, q95VarY, i, i3, fI, zH);
    }
}
