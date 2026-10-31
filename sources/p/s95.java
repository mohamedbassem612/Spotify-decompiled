package p;

import java.io.EOFException;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class s95 {
    public static final ye90 a = ye90.m(new String[]{"k", "x", "y"});

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.kga0 */
    /* JADX INFO: Thrown type has an unknown type hierarchy: p.meh */
    public static r95 a(nha0 nha0Var, fcf0 fcf0Var) throws kga0, meh, EOFException {
        ArrayList arrayList = new ArrayList();
        if (nha0Var.o() == 1) {
            nha0Var.a();
            while (nha0Var.g()) {
                arrayList.add(too1.t(nha0Var, fcf0Var));
            }
            nha0Var.d();
            vua0.b(arrayList);
        } else {
            arrayList.add(new sua0(pha0.b(nha0Var, qpi1.c())));
        }
        return new r95(arrayList);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.kga0 */
    /* JADX INFO: Thrown type has an unknown type hierarchy: p.meh */
    public static y95 b(nha0 nha0Var, fcf0 fcf0Var) throws kga0, meh, EOFException {
        nha0Var.c();
        r95 r95VarA = null;
        q95 q95VarZ = null;
        boolean z = false;
        q95 q95VarZ2 = null;
        while (nha0Var.o() != 4) {
            int iQ = nha0Var.q(a);
            if (iQ == 0) {
                r95VarA = a(nha0Var, fcf0Var);
            } else if (iQ != 1) {
                if (iQ != 2) {
                    nha0Var.u();
                    nha0Var.v();
                } else if (nha0Var.o() == 6) {
                    nha0Var.v();
                    z = true;
                } else {
                    q95VarZ = xpn1.z(nha0Var, fcf0Var);
                }
            } else if (nha0Var.o() == 6) {
                nha0Var.v();
                z = true;
            } else {
                q95VarZ2 = xpn1.z(nha0Var, fcf0Var);
            }
        }
        nha0Var.e();
        if (z) {
            fcf0Var.a("Lottie doesn't support expressions.");
        }
        return r95VarA != null ? r95VarA : new t95(q95VarZ2, q95VarZ);
    }
}
