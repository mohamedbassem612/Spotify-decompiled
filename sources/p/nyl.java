package p;

import android.graphics.Path;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class nyl {
    public static final ye90 a = ye90.m(new String[]{"ty", "d"});

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.kga0 */
    /* JADX INFO: Thrown type has an unknown type hierarchy: p.meh */
    public static myl a(nha0 nha0Var, fcf0 fcf0Var) throws kga0, meh, EOFException {
        hx61 hx61VarA;
        String strM;
        hx61 qw61Var;
        nha0Var.c();
        int iJ = 2;
        while (true) {
            hx61VarA = null;
            if (!nha0Var.g()) {
                strM = null;
                break;
            }
            int iQ = nha0Var.q(a);
            if (iQ == 0) {
                strM = nha0Var.m();
                break;
            }
            if (iQ != 1) {
                nha0Var.u();
                nha0Var.v();
            } else {
                iJ = nha0Var.j();
            }
        }
        if (strM == null) {
            return null;
        }
        boolean zH = false;
        int iJ2 = 0;
        switch (strM) {
            case "el":
                hx61VarA = hcg.a(nha0Var, fcf0Var, iJ);
                break;
            case "fl":
                ye90 ye90Var = pw61.a;
                int iJ3 = 1;
                String strM2 = null;
                p95 p95VarV = null;
                boolean zH2 = false;
                boolean zH3 = false;
                while (nha0Var.g()) {
                    int iQ2 = nha0Var.q(pw61.a);
                    if (iQ2 == 0) {
                        strM2 = nha0Var.m();
                    } else if (iQ2 == 1) {
                        p95VarV = xpn1.v(nha0Var, fcf0Var);
                    } else if (iQ2 == 2) {
                        hx61VarA = xpn1.B(nha0Var, fcf0Var);
                    } else if (iQ2 == 3) {
                        zH2 = nha0Var.h();
                    } else if (iQ2 == 4) {
                        iJ3 = nha0Var.j();
                    } else if (iQ2 != 5) {
                        nha0Var.u();
                        nha0Var.v();
                    } else {
                        zH3 = nha0Var.h();
                    }
                }
                if (hx61VarA == null) {
                    hx61VarA = new p95(Collections.singletonList(new sua0(100)), (byte) 2);
                }
                hx61VarA = new ow61(strM2, zH2, iJ3 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, p95VarV, hx61VarA, zH3);
                break;
            case "gf":
                hx61VarA = a750.a(nha0Var, fcf0Var);
                break;
            case "gr":
                ye90 ye90Var2 = rw61.a;
                ArrayList arrayList = new ArrayList();
                while (nha0Var.g()) {
                    int iQ3 = nha0Var.q(rw61.a);
                    if (iQ3 == 0) {
                        hx61VarA = nha0Var.m();
                    } else if (iQ3 == 1) {
                        zH = nha0Var.h();
                    } else if (iQ3 != 2) {
                        nha0Var.v();
                    } else {
                        nha0Var.a();
                        while (nha0Var.g()) {
                            myl mylVarA = a(nha0Var, fcf0Var);
                            if (mylVarA != null) {
                                arrayList.add(mylVarA);
                            }
                        }
                        nha0Var.d();
                    }
                }
                qw61Var = new qw61(hx61VarA, arrayList, zH);
                hx61VarA = qw61Var;
                break;
            case "gs":
                hx61VarA = g750.a(nha0Var, fcf0Var);
                break;
            case "mm":
                hx61VarA = lvi0.a(nha0Var);
                fcf0Var.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case "rc":
                hx61VarA = v511.a(nha0Var, fcf0Var);
                break;
            case "rd":
                hx61VarA = lr31.a(nha0Var, fcf0Var);
                break;
            case "rp":
                hx61VarA = hf21.a(nha0Var, fcf0Var);
                break;
            case "sh":
                ye90 ye90Var3 = dx61.a;
                p95 p95VarE = null;
                boolean zH4 = false;
                while (nha0Var.g()) {
                    int iQ4 = nha0Var.q(dx61.a);
                    if (iQ4 == 0) {
                        hx61VarA = nha0Var.m();
                    } else if (iQ4 == 1) {
                        iJ2 = nha0Var.j();
                    } else if (iQ4 == 2) {
                        p95VarE = xpn1.E(nha0Var, fcf0Var);
                    } else if (iQ4 != 3) {
                        nha0Var.v();
                    } else {
                        zH4 = nha0Var.h();
                    }
                }
                qw61Var = new cx61(hx61VarA, iJ2, p95VarE, zH4);
                hx61VarA = qw61Var;
                break;
            case "sr":
                hx61VarA = wcv0.a(nha0Var, fcf0Var, iJ);
                break;
            case "st":
                hx61VarA = fx61.a(nha0Var, fcf0Var);
                break;
            case "tm":
                hx61VarA = ix61.a(nha0Var, fcf0Var);
                break;
            case "tr":
                hx61VarA = x95.a(nha0Var, fcf0Var);
                break;
            default:
                nue0.c("Unknown shape type ".concat(strM));
                break;
        }
        while (nha0Var.g()) {
            nha0Var.v();
        }
        nha0Var.e();
        return hx61VarA;
    }
}
