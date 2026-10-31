package p;

import android.graphics.Path;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class a750 {
    public static final ye90 a = ye90.m(new String[]{"nm", "g", "o", "t", "s", "e", "r", "hd"});
    public static final ye90 b = ye90.m(new String[]{"p", "k"});

    public static y650 a(nha0 nha0Var, fcf0 fcf0Var) {
        p95 p95Var = null;
        Path.FillType fillType = Path.FillType.WINDING;
        int i = 0;
        boolean zH = false;
        String strM = null;
        p95 p95VarA = null;
        p95 p95VarC = null;
        p95 p95VarC2 = null;
        while (nha0Var.g()) {
            switch (nha0Var.q(a)) {
                case 0:
                    strM = nha0Var.m();
                    break;
                case 1:
                    nha0Var.c();
                    int iJ = -1;
                    while (nha0Var.g()) {
                        int iQ = nha0Var.q(b);
                        if (iQ == 0) {
                            iJ = nha0Var.j();
                        } else if (iQ != 1) {
                            nha0Var.u();
                            nha0Var.v();
                        } else {
                            p95VarA = xpn1.A(nha0Var, fcf0Var, iJ);
                        }
                    }
                    nha0Var.e();
                    break;
                case 2:
                    p95Var = xpn1.B(nha0Var, fcf0Var);
                    break;
                case 3:
                    i = nha0Var.j() != 1 ? 2 : 1;
                    break;
                case 4:
                    p95VarC = xpn1.C(nha0Var, fcf0Var);
                    break;
                case 5:
                    p95VarC2 = xpn1.C(nha0Var, fcf0Var);
                    break;
                case 6:
                    fillType = nha0Var.j() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    zH = nha0Var.h();
                    break;
                default:
                    nha0Var.u();
                    nha0Var.v();
                    break;
            }
        }
        if (p95Var == null) {
            p95Var = new p95(Collections.singletonList(new sua0(100)), false);
        }
        return new y650(strM, i, fillType, p95VarA, p95Var, p95VarC, p95VarC2, zH);
    }
}
