package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class v161 {
    public final pim0 a;
    public final boolean b;
    public final hmb0 c;
    public final o161 d;
    public v161 e;
    public final int f;

    public v161(pim0 pim0Var, boolean z, hmb0 hmb0Var, o161 o161Var) {
        this.a = pim0Var;
        this.b = z;
        this.c = hmb0Var;
        this.d = o161Var;
        this.f = hmb0Var.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final n511 a(ndo0 ndo0Var) {
        ?? E;
        v161 v161VarL = l();
        if (v161VarL == null) {
            return n511.e;
        }
        pim0 pim0Var = (pim0) v161VarL.c.e1.g;
        if ((pim0Var.d & 8) == 0) {
            E = 0;
            break;
        }
        loop0: while (true) {
            if (pim0Var != null) {
                if ((pim0Var.c & 8) != 0) {
                    E = pim0Var;
                    ?? bfn0Var = 0;
                    while (E != 0) {
                        if (E instanceof t161) {
                            if (((t161) E).k()) {
                                break loop0;
                            }
                        } else if ((E.c & 8) != 0 && (E instanceof l5t)) {
                            pim0 pim0Var2 = ((l5t) E).P0;
                            int i = 0;
                            while (pim0Var2 != null) {
                                if ((pim0Var2.c & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        E = E;
                                        bfn0Var = bfn0Var;
                                        bfn0Var = bfn0Var;
                                        E = pim0Var2;
                                    } else {
                                        if (bfn0Var == 0) {
                                            bfn0Var = new bfn0(0, new pim0[16]);
                                        }
                                        if (E != 0) {
                                            bfn0Var.b(E);
                                            E = 0;
                                        }
                                        bfn0Var.b(pim0Var2);
                                    }
                                } else {
                                    E = E;
                                    bfn0Var = bfn0Var;
                                }
                                pim0Var2 = pim0Var2.f;
                                E = E;
                                bfn0Var = bfn0Var;
                            }
                            if (i == 1) {
                                E = E;
                                bfn0Var = bfn0Var;
                            } else {
                                E = E;
                                bfn0Var = bfn0Var;
                            }
                        }
                        E = oap1.e((bfn0) bfn0Var);
                    }
                }
                if ((pim0Var.d & 8) != 0) {
                    pim0Var = pim0Var.f;
                }
            }
            E = 0;
            break;
        }
        t161 t161Var = (t161) E;
        ndo0 ndo0VarW = t161Var != null ? oap1.w(t161Var, 8) : null;
        return ndo0VarW == null ? v161VarL.a(ndo0Var) : ndo0VarW.M(ndo0Var, true);
    }

    public final v161 b(pm31 pm31Var, iu30 iu30Var) {
        o161 o161Var = new o161();
        o161Var.c = false;
        o161Var.d = false;
        iu30Var.invoke(o161Var);
        v161 v161Var = new v161(new u161(iu30Var), false, new hmb0(this.f + (pm31Var != null ? 1000000000 : 2000000000), true), o161Var);
        v161Var.e = this;
        return v161Var;
    }

    public final void c(hmb0 hmb0Var, ArrayList arrayList) {
        bfn0 bfn0VarZ = hmb0Var.z();
        Object[] objArr = bfn0VarZ.a;
        int i = bfn0VarZ.c;
        for (int i2 = 0; i2 < i; i2++) {
            hmb0 hmb0Var2 = (hmb0) objArr[i2];
            if (hmb0Var2.I() && !hmb0Var2.p1) {
                if (hmb0Var2.e1.k(8)) {
                    arrayList.add(w0h1.e(hmb0Var2, this.b));
                } else {
                    c(hmb0Var2, arrayList);
                }
            }
        }
    }

    public final ndo0 d() {
        if (!n()) {
            t161 t161VarF = f();
            return t161VarF != null ? oap1.w(t161VarF, 8) : (sh80) this.c.e1.d;
        }
        v161 v161VarL = l();
        if (v161VarL != null) {
            return v161VarL.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            v161 v161Var = (v161) arrayList.get(size2);
            if (v161Var.o()) {
                arrayList2.add(v161Var);
            } else if (!v161Var.d.d) {
                v161Var.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v3, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final t161 f() {
        ?? E;
        boolean z;
        ?? r0;
        boolean z2 = this.d.c;
        ?? r4 = 0;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        hmb0 hmb0Var = this.c;
        if (!z2) {
            pim0 pim0Var = (pim0) hmb0Var.e1.g;
            if ((pim0Var.d & 8) != 0) {
                loop3: while (pim0Var != null) {
                    if ((pim0Var.c & 8) != 0) {
                        E = pim0Var;
                        ?? bfn0Var = 0;
                        while (true) {
                            if (E != 0) {
                                if (E instanceof t161) {
                                    if (((t161) E).k()) {
                                        r4 = E;
                                    }
                                } else if ((E.c & 8) != 0 && (E instanceof l5t)) {
                                    pim0 pim0Var2 = ((l5t) E).P0;
                                    int i = 0;
                                    while (pim0Var2 != null) {
                                        if ((pim0Var2.c & 8) != 0) {
                                            i++;
                                            if (i == 1) {
                                                E = E;
                                                bfn0Var = bfn0Var;
                                                bfn0Var = bfn0Var;
                                                E = pim0Var2;
                                            } else {
                                                if (bfn0Var == 0) {
                                                    bfn0Var = new bfn0(0, new pim0[16]);
                                                }
                                                if (E != 0) {
                                                    bfn0Var.b(E);
                                                    E = 0;
                                                }
                                                bfn0Var.b(pim0Var2);
                                            }
                                        } else {
                                            E = E;
                                            bfn0Var = bfn0Var;
                                        }
                                        pim0Var2 = pim0Var2.f;
                                        E = E;
                                        bfn0Var = bfn0Var;
                                    }
                                    if (i == 1) {
                                        E = E;
                                        bfn0Var = bfn0Var;
                                    } else {
                                        E = E;
                                        bfn0Var = bfn0Var;
                                    }
                                }
                                E = oap1.e((bfn0) bfn0Var);
                            }
                        }
                    }
                    if ((pim0Var.d & 8) == 0) {
                        break;
                    }
                    pim0Var = pim0Var.f;
                }
            }
        } else {
            pim0 pim0Var3 = (pim0) hmb0Var.e1.g;
            if ((pim0Var3.d & 8) != 0) {
                E = 0;
                while (pim0Var3 != null) {
                    if ((pim0Var3.c & 8) != 0) {
                        pim0 pim0VarE = pim0Var3;
                        bfn0 bfn0Var2 = null;
                        while (pim0VarE != null) {
                            if (pim0VarE instanceof t161) {
                                t161 t161Var = (t161) pim0VarE;
                                if (t161Var.k()) {
                                    if (t161Var.q1()) {
                                        r0 = E;
                                        r0 = E;
                                        return t161Var;
                                    }
                                    if (E == 0) {
                                        r0 = t161Var;
                                    }
                                }
                                r0 = E;
                                z = false;
                                E = r0;
                            } else {
                                z = true;
                            }
                            if (z) {
                                E = E;
                                if ((pim0VarE.c & 8) != 0 && (pim0VarE instanceof l5t)) {
                                    int i2 = 0;
                                    for (pim0 pim0Var4 = ((l5t) pim0VarE).P0; pim0Var4 != null; pim0Var4 = pim0Var4.f) {
                                        if ((pim0Var4.c & 8) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                pim0VarE = pim0Var4;
                                            } else {
                                                if (bfn0Var2 == null) {
                                                    bfn0Var2 = new bfn0(0, new pim0[16]);
                                                }
                                                if (pim0VarE != null) {
                                                    bfn0Var2.b(pim0VarE);
                                                    pim0VarE = null;
                                                }
                                                bfn0Var2.b(pim0Var4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                            } else {
                                E = E;
                            }
                            pim0VarE = oap1.e(bfn0Var2);
                        }
                    }
                    if ((pim0Var3.d & 8) == 0) {
                        break;
                    }
                    pim0Var3 = pim0Var3.f;
                    E = E;
                }
                r4 = E;
            }
        }
        return (t161) r4;
    }

    public final n511 g() {
        ndo0 ndo0VarD = d();
        if (ndo0VarD != null) {
            if (!ndo0VarD.f1().N0) {
                ndo0VarD = null;
            }
            if (ndo0VarD != null) {
                return nho1.m(ndo0VarD);
            }
        }
        return n511.e;
    }

    public final n511 h() {
        ndo0 ndo0VarD = d();
        if (ndo0VarD != null) {
            if (!ndo0VarD.f1().N0) {
                ndo0VarD = null;
            }
            if (ndo0VarD != null) {
                return nho1.o(ndo0VarD);
            }
        }
        return n511.e;
    }

    public final List i(boolean z, boolean z2) {
        if (!z && this.d.d) {
            return z6x.a;
        }
        ArrayList arrayList = new ArrayList();
        if (!o()) {
            return q(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final o161 k() {
        boolean zO = o();
        o161 o161Var = this.d;
        if (!zO) {
            return o161Var;
        }
        o161 o161VarC = o161Var.c();
        p(new ArrayList(), o161VarC);
        return o161VarC;
    }

    public final v161 l() {
        hmb0 hmb0VarV;
        v161 v161Var = this.e;
        if (v161Var != null) {
            return v161Var;
        }
        hmb0 hmb0Var = this.c;
        boolean z = this.b;
        if (!z) {
            hmb0VarV = null;
            break;
        }
        hmb0VarV = hmb0Var.v();
        while (true) {
            if (hmb0VarV == null) {
                hmb0VarV = null;
                break;
            }
            o161 o161VarX = hmb0VarV.x();
            if (o161VarX != null && o161VarX.c) {
                break;
            }
            hmb0VarV = hmb0VarV.v();
        }
        if (hmb0VarV == null) {
            for (hmb0 hmb0VarV2 = hmb0Var.v(); hmb0VarV2 != null; hmb0VarV2 = hmb0VarV2.v()) {
                if (hmb0VarV2.e1.k(8)) {
                    hmb0VarV = hmb0VarV2;
                }
            }
            hmb0VarV = null;
        }
        if (hmb0VarV == null) {
            return null;
        }
        return w0h1.e(hmb0VarV, z);
    }

    public final n511 m() {
        Object objF = f();
        return objF == null ? ((sh80) this.c.e1.d).J1() : nko1.y(((pim0) objF).a, nko1.A(this.d), true);
    }

    public final boolean n() {
        return this.e != null;
    }

    public final boolean o() {
        return this.b && this.d.c;
    }

    public final void p(ArrayList arrayList, o161 o161Var) {
        if (this.d.d) {
            return;
        }
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            v161 v161Var = (v161) arrayList.get(size2);
            if (!v161Var.o()) {
                o161Var.e(v161Var.d);
                v161Var.p(arrayList, o161Var);
            }
        }
    }

    public final List q(ArrayList arrayList, boolean z) {
        if (n()) {
            return z6x.a;
        }
        c(this.c, arrayList);
        if (z) {
            d261 d261Var = z161.z;
            o161 o161Var = this.d;
            pm31 pm31Var = (pm31) eko1.v(o161Var, d261Var);
            if (pm31Var != null && o161Var.c && !arrayList.isEmpty()) {
                arrayList.add(b(pm31Var, new waq0(pm31Var, (byte) 16)));
            }
            d261 d261Var2 = z161.a;
            if (o161Var.a.c(d261Var2) && !arrayList.isEmpty() && o161Var.c) {
                List list = (List) eko1.v(o161Var, d261Var2);
                String str = list != null ? (String) o7h.s0(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new jfa(str, (byte) 11)));
                }
            }
        }
        return arrayList;
    }
}
