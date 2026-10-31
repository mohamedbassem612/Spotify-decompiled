package p;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class g750 {
    public static final ye90 a = ye90.m(new String[]{"nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d"});
    public static final ye90 b = ye90.m(new String[]{"p", "k"});
    public static final ye90 c = ye90.m(new String[]{"n", "v"});

    public static e750 a(nha0 nha0Var, fcf0 fcf0Var) {
        p95 p95Var;
        p95 p95Var2;
        ArrayList arrayList = new ArrayList();
        p95 p95VarA = null;
        String strM = null;
        p95 p95VarC = null;
        p95 p95VarC2 = null;
        q95 q95VarY = null;
        q95 q95Var = null;
        float fI = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean zH = false;
        p95 p95VarB = null;
        while (nha0Var.g()) {
            switch (nha0Var.q(a)) {
                case 0:
                    strM = nha0Var.m();
                    continue;
                case 1:
                    nha0Var.c();
                    int iJ = -1;
                    while (nha0Var.g()) {
                        p95 p95Var3 = p95VarA;
                        int iQ = nha0Var.q(b);
                        if (iQ != 0) {
                            p95Var = p95VarB;
                            if (iQ != 1) {
                                nha0Var.u();
                                nha0Var.v();
                            } else {
                                p95VarA = xpn1.A(nha0Var, fcf0Var, iJ);
                            }
                            p95VarB = p95Var;
                        } else {
                            p95Var = p95VarB;
                            iJ = nha0Var.j();
                        }
                        p95VarA = p95Var3;
                        p95VarB = p95Var;
                    }
                    nha0Var.e();
                    continue;
                case 2:
                    p95VarB = xpn1.B(nha0Var, fcf0Var);
                    continue;
                case 3:
                    p95Var2 = p95VarA;
                    i = nha0Var.j() != 1 ? 2 : 1;
                    break;
                case 4:
                    p95VarC = xpn1.C(nha0Var, fcf0Var);
                    continue;
                case 5:
                    p95VarC2 = xpn1.C(nha0Var, fcf0Var);
                    continue;
                case 6:
                    p95Var2 = p95VarA;
                    q95VarY = xpn1.y(nha0Var, fcf0Var, true);
                    break;
                case 7:
                    p95Var2 = p95VarA;
                    i2 = l1d.H(3)[nha0Var.j() - 1];
                    break;
                case 8:
                    p95Var2 = p95VarA;
                    i3 = l1d.H(3)[nha0Var.j() - 1];
                    break;
                case 9:
                    p95Var2 = p95VarA;
                    fI = (float) nha0Var.i();
                    break;
                case 10:
                    zH = nha0Var.h();
                    continue;
                case 11:
                    nha0Var.a();
                    while (nha0Var.g()) {
                        nha0Var.c();
                        String strM2 = null;
                        q95 q95VarY2 = null;
                        while (nha0Var.g()) {
                            int iQ2 = nha0Var.q(c);
                            if (iQ2 != 0) {
                                p95 p95Var4 = p95VarA;
                                if (iQ2 != 1) {
                                    nha0Var.u();
                                    nha0Var.v();
                                } else {
                                    q95VarY2 = xpn1.y(nha0Var, fcf0Var, true);
                                }
                                p95VarA = p95Var4;
                            } else {
                                strM2 = nha0Var.m();
                            }
                        }
                        p95 p95Var5 = p95VarA;
                        nha0Var.e();
                        String str = strM2;
                        if (str.equals("o")) {
                            q95Var = q95VarY2;
                        } else {
                            if (str.equals("d") || str.equals("g")) {
                                fcf0Var.o = true;
                                arrayList.add(q95VarY2);
                            }
                            p95VarA = p95Var5;
                        }
                        p95VarA = p95Var5;
                    }
                    p95Var2 = p95VarA;
                    nha0Var.d();
                    if (arrayList.size() == 1) {
                        arrayList.add((q95) arrayList.get(0));
                    }
                    break;
                default:
                    nha0Var.u();
                    nha0Var.v();
                    continue;
            }
            p95VarA = p95Var2;
        }
        p95 p95Var6 = p95VarB;
        return new e750(strM, i, p95VarA, p95Var6 == null ? new p95(Collections.singletonList(new sua0(100)), false) : p95Var6, p95VarC, p95VarC2, q95VarY, i2, i3, fI, arrayList, q95Var, zH);
    }
}
