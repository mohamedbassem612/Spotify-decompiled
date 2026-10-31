package p;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class v0h1 {
    public static final v0h1 a = new v0h1();

    public static ArrayList a(AbstractCollection abstractCollection, vu30 vu30Var) {
        ArrayList<qx81> arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qx81 qx81Var = (qx81) it.next();
            if (!arrayList.isEmpty()) {
                for (qx81 qx81Var2 : arrayList) {
                    if (qx81Var2 != qx81Var) {
                        qx81Var2.getClass();
                        qx81Var.getClass();
                        if (((Boolean) vu30Var.invoke(qx81Var2, qx81Var)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [p.e0h1] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [p.e0h1] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v16, types: [p.qx81] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, p.a8b0, p.qx81] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.Set] */
    public final qx81 b(ArrayList arrayList) {
        qx81 qx81VarA;
        arrayList.size();
        ArrayList<qx81> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qx81 qx81Var = (qx81) it.next();
            if (qx81Var.t0() instanceof e890) {
                Collection<a8b0> collectionD = qx81Var.t0().d();
                ArrayList arrayList3 = new ArrayList(q7h.U(collectionD, 10));
                for (a8b0 a8b0Var : collectionD) {
                    a8b0Var.getClass();
                    qx81 qx81VarI = i3p1.I(a8b0Var);
                    if (qx81Var.u0()) {
                        qx81VarI = qx81VarI.x0(true);
                    }
                    arrayList3.add(qx81VarI);
                }
                arrayList2.addAll(arrayList3);
            } else {
                arrayList2.add(qx81Var);
            }
        }
        Iterator it2 = arrayList2.iterator();
        u0h1 u0h1VarA = u0h1.a;
        while (it2.hasNext()) {
            u0h1VarA = u0h1VarA.a((gmh1) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (qx81 qx81VarX0 : arrayList2) {
            if (u0h1VarA == u0h1.d) {
                if (qx81VarX0 instanceof w8o0) {
                    w8o0 w8o0Var = (w8o0) qx81VarX0;
                    qx81VarX0 = new w8o0(w8o0Var.b, w8o0Var.c, w8o0Var.d, w8o0Var.e, w8o0Var.f, true);
                }
                qx81 qx81VarP = l7c.p(qx81VarX0, false);
                qx81VarX0 = (qx81VarP == null && (qx81VarP = mue1.N(qx81VarX0)) == null) ? qx81VarX0.x0(false) : qx81VarP;
            }
            linkedHashSet.add(qx81VarX0);
        }
        ArrayList arrayList4 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((qx81) it3.next()).s0());
        }
        Iterator it4 = arrayList4.iterator();
        qx81 qx81Var2 = null;
        if (!it4.hasNext()) {
            hhg1.h("Empty collection can't be reduced.");
            return null;
        }
        ?? next = it4.next();
        while (it4.hasNext()) {
            e0h1 e0h1Var = (e0h1) it4.next();
            next = (e0h1) next;
            ffe1 ffe1Var = e0h1.b;
            if (!next.isEmpty() || !e0h1Var.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                Iterator it5 = ((ConcurrentHashMap) ffe1Var.b).values().iterator();
                while (it5.hasNext()) {
                    int iIntValue = ((Number) it5.next()).intValue();
                    ig5 ig5Var = (ig5) next.a.get(iIntValue);
                    ig5 ig5Var2 = (ig5) e0h1Var.a.get(iIntValue);
                    if (ig5Var != null) {
                        if (!u890.j(ig5Var2, ig5Var)) {
                            ig5Var = null;
                        }
                        ig5Var2 = ig5Var;
                    } else if (ig5Var2 == null || !u890.j(ig5Var, ig5Var2)) {
                        ig5Var2 = null;
                    }
                    h4p1.d(arrayList5, ig5Var2);
                }
                next = ffe1.d(arrayList5);
            }
        }
        e0h1 e0h1Var2 = (e0h1) next;
        if (linkedHashSet.size() == 1) {
            qx81VarA = (qx81) o7h.U0(linkedHashSet);
        } else {
            ArrayList arrayListA = a(linkedHashSet, new lda1(2, this, v0h1.class, "isStrictSupertype", "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0, (byte) 5));
            arrayListA.isEmpty();
            if (!arrayListA.isEmpty()) {
                Iterator it6 = arrayListA.iterator();
                if (!it6.hasNext()) {
                    hhg1.h("Empty collection can't be reduced.");
                    return null;
                }
                ?? next2 = it6.next();
                while (it6.hasNext()) {
                    qx81 qx81Var3 = (qx81) it6.next();
                    next2 = (qx81) next2;
                    if (next2 != 0 && qx81Var3 != null) {
                        h0h1 h0h1VarT0 = next2.t0();
                        h0h1 h0h1VarT1 = qx81Var3.t0();
                        boolean z = h0h1VarT0 instanceof bs80;
                        if (z && (h0h1VarT1 instanceof bs80)) {
                            bs80 bs80Var = new bs80(o7h.r1(((bs80) h0h1VarT0).a, ((bs80) h0h1VarT1).a));
                            e0h1.b.getClass();
                            next2 = y3o1.j0(z6x.a, bkz.a(2, true, "unknown integer literal type"), e0h1.c, bs80Var, false);
                        } else if (z) {
                            if (((bs80) h0h1VarT0).a.contains(qx81Var3)) {
                                next2 = qx81Var3;
                            }
                        } else if (!(h0h1VarT1 instanceof bs80) || !((bs80) h0h1VarT1).a.contains(next2)) {
                        }
                    }
                    next2 = 0;
                }
                qx81Var2 = (qx81) next2;
            }
            if (qx81Var2 != null) {
                qx81VarA = qx81Var2;
            } else {
                bao0.b.getClass();
                ArrayList arrayListA2 = a(arrayListA, new lda1(2, aao0.b, cao0.class, "equalTypes", "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0, (byte) 6));
                arrayListA2.isEmpty();
                qx81VarA = arrayListA2.size() < 2 ? (qx81) o7h.U0(arrayListA2) : new e890(linkedHashSet).a();
            }
        }
        return qx81VarA.z0(e0h1Var2);
    }
}
