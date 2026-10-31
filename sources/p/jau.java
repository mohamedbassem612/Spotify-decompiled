package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class jau implements Init {
    /* JADX WARN: Code duplicated, block: B:18:0x0048  */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    public final First e0(Object obj) {
        pau pauVar;
        p5j1 p5j1Var;
        wt91 wt91Var;
        String strO;
        qau qauVar = (qau) obj;
        boolean z = qauVar.S0;
        s9l1 s9l1Var = qauVar.g;
        if (s9l1Var == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        List list = s9l1Var.b;
        Integer numD = zp8.d(qauVar.c, s9l1Var);
        String strE = qauVar.R0;
        if (strE.length() > 0) {
            Iterator it = list.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                z0i z0iVar = (z0i) it.next();
                if (z0iVar instanceof w8l1) {
                    w8l1 w8l1Var = (w8l1) z0iVar;
                    strO = w8l1Var.getItemId();
                    if (strO == null) {
                        strO = w8l1Var.getUri();
                        if (strO == null) {
                            strO = "";
                        }
                    } else {
                        if (strO.length() <= 0) {
                            strO = null;
                        }
                        if (strO == null) {
                            strO = w8l1Var.getUri();
                            if (strO == null) {
                                strO = "";
                            }
                        }
                    }
                } else {
                    strO = rc11.a.b(z0iVar.getClass()).o();
                    if (strO == null) {
                        hhg1.n("Required value was null.");
                        return null;
                    }
                }
                if (strO.equals(strE)) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                strE = null;
            }
        } else {
            strE = null;
        }
        if (strE == null) {
            strE = zp8.e((z0i) o7h.q0(list));
        }
        String str = strE;
        if (z || (wt91Var = s9l1Var.g) == null) {
            pauVar = null;
        } else {
            pauVar = new pau(numD != null ? numD.intValue() : 0, wt91Var);
        }
        int iIntValue = numD != null ? numD.intValue() : 0;
        boolean z2 = qauVar.Y;
        boolean z3 = qauVar.Z;
        cbq0 cbq0Var = s9l1Var.f;
        qau qauVarA = qau.a(qauVar, null, Integer.valueOf(iIntValue), null, false, false, null, s9l1Var, null, false, false, (z2 || ((cbq0Var == null || (p5j1Var = cbq0Var.a) == null) ? false : p5j1Var.c)) && !z3, false, null, false, false, pauVar, str, false, 588732);
        abu abuVar = qauVar.N0;
        if (abuVar == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        HashSet hashSetA = Effects.a(new d9u[0]);
        hashSetA.add(zp8.a(abuVar, s9l1Var));
        if (!z) {
            boolean z4 = abuVar instanceof xau;
            xau xauVar = z4 ? (xau) abuVar : null;
            if ((xauVar != null ? xauVar.e : null) != null) {
                xau xauVar2 = z4 ? (xau) abuVar : null;
                hashSetA.add(new b9u(xauVar2 != null ? u890.j(xauVar2.e, Boolean.TRUE) : false));
            }
        }
        if (numD == null || numD.intValue() == -1) {
            hashSetA.add(new z8u(zp8.c(qauVarA, 0)));
        }
        return First.c(qauVarA, hashSetA);
    }
}
