package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class f8b0 extends tto1 {
    public static final f8b0 b = new f8b0();

    public static qx81 w(qx81 qx81Var) {
        a8b0 a8b0VarB;
        h0h1 h0h1VarT0 = qx81Var.t0();
        e890 e890Var = null;
        if (h0h1VarT0 instanceof tod) {
            tod todVar = (tod) h0h1VarT0;
            e1h1 e1h1Var = todVar.a;
            e1h1 e1h1Var2 = e1h1Var.a() == 2 ? e1h1Var : null;
            gmh1 gmh1VarW0 = (e1h1Var2 == null || (a8b0VarB = e1h1Var2.b()) == null) ? null : a8b0VarB.w0();
            x8o0 x8o0Var = todVar.b;
            if (x8o0Var == null) {
                Collection collectionD = todVar.d();
                ArrayList arrayList = new ArrayList(q7h.U(collectionD, 10));
                Iterator it = collectionD.iterator();
                while (it.hasNext()) {
                    arrayList.add(((a8b0) it.next()).w0());
                }
                x8o0Var = new x8o0(e1h1Var, new rht(arrayList, (byte) 1), (y0h1) null, 8);
                todVar.b = x8o0Var;
            }
            return new w8o0(1, x8o0Var, gmh1VarW0, qx81Var.s0(), qx81Var.u0(), 32);
        }
        if (!(h0h1VarT0 instanceof e890) || !qx81Var.u0()) {
            return qx81Var;
        }
        e890 e890Var2 = (e890) h0h1VarT0;
        LinkedHashSet linkedHashSet = e890Var2.b;
        ArrayList arrayList2 = new ArrayList(q7h.U(linkedHashSet, 10));
        Iterator it2 = linkedHashSet.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            arrayList2.add(o1h1.g((a8b0) it2.next(), true));
            z = true;
        }
        if (z) {
            a8b0 a8b0Var = e890Var2.a;
            gmh1 gmh1VarG = a8b0Var != null ? o1h1.g(a8b0Var, true) : null;
            arrayList2.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList2);
            linkedHashSet2.hashCode();
            e890 e890Var3 = new e890(linkedHashSet2);
            e890Var3.a = gmh1VarG;
            e890Var = e890Var3;
        }
        if (e890Var != null) {
            e890Var2 = e890Var;
        }
        return e890Var2.a();
    }

    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final gmh1 r(e8b0 e8b0Var) {
        gmh1 gmh1VarZ;
        if (!(e8b0Var instanceof a8b0)) {
            hhg1.n("Failed requirement.");
            return null;
        }
        gmh1 gmh1VarW0 = ((a8b0) e8b0Var).w0();
        if (gmh1VarW0 instanceof qx81) {
            gmh1VarZ = w((qx81) gmh1VarW0);
        } else {
            if (!(gmh1VarW0 instanceof dq20)) {
                eg.o();
                return null;
            }
            dq20 dq20Var = (dq20) gmh1VarW0;
            qx81 qx81Var = dq20Var.c;
            qx81 qx81Var2 = dq20Var.b;
            qx81 qx81VarW = w(qx81Var2);
            qx81 qx81VarW2 = w(qx81Var);
            gmh1VarZ = (qx81VarW == qx81Var2 && qx81VarW2 == qx81Var) ? gmh1VarW0 : y3o1.Z(qx81VarW, qx81VarW2);
        }
        ft30 ft30Var = new ft30(1, this, f8b0.class, "prepareType", "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;", 0, (byte) 22);
        a8b0 a8b0VarL = vzn1.l(gmh1VarW0);
        return vzn1.q(gmh1VarZ, a8b0VarL != null ? (a8b0) ft30Var.invoke(a8b0VarL) : null);
    }
}
