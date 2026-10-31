package p;

import io.reactivex.rxjava3.core.Flowable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ngd0 implements sxz0 {
    public final opm a;
    public final uu00 b;
    public final Flowable c;
    public final kly0 d;

    public ngd0(opm opmVar, uu00 uu00Var, Flowable flowable, caq caqVar) {
        this.a = opmVar;
        this.b = uu00Var;
        this.c = flowable;
        this.d = caqVar;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:76:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v2 */
    @Override // p.sxz0
    public final Object a(frd1 frd1Var, String str, String str2, onm onmVar) {
        lgd0 lgd0Var;
        ?? arrayList;
        ?? r7;
        ArrayList arrayList2;
        Iterator it;
        num numVarC;
        num numVar;
        lfi1 lfi1Var;
        String strJ;
        String strB;
        yp70 yp70Var;
        if (onmVar instanceof lgd0) {
            lgd0Var = (lgd0) onmVar;
            int i = lgd0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                lgd0Var.e = i - Integer.MIN_VALUE;
            } else {
                lgd0Var = new lgd0(this, onmVar);
            }
        } else {
            lgd0Var = new lgd0(this, onmVar);
        }
        Object objI = lgd0Var.c;
        int i2 = lgd0Var.e;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objI);
            lgd0Var.a = str;
            lgd0Var.e = 1;
            objI = i(frd1Var, lgd0Var);
            if (objI != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            str = lgd0Var.a;
            hm5.M(objI);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list = lgd0Var.b;
            hm5.M(objI);
            r7 = list;
        }
        Map map = (Map) objI;
        arrayList2 = new ArrayList();
        it = ((Iterable) r7).iterator();
        while (true) {
            String strC = "";
            if (it.hasNext()) {
                return new blr0(arrayList2, "");
            }
            som somVar = (som) it.next();
            numVarC = somVar.c();
            if (numVarC instanceof num) {
                numVar = numVarC;
            } else {
                numVar = null;
            }
            if (numVar != null || (strJ = numVar.J()) == null || (strB = somVar.b()) == null) {
                lfi1Var = null;
            } else {
                String strH0 = ihc1.H0(strB, "spotify:user:");
                zei1 zei1Var = (zei1) map.get(strB);
                String str3 = zei1Var != null ? zei1Var.b : strH0;
                if (zei1Var != null && (yp70Var = (yp70) o7h.s0(zei1Var.e)) != null) {
                    strC = yp70Var.c();
                }
                ifi1 ifi1Var = new ifi1(str3, strH0, strC);
                Long lA = somVar.a();
                lfi1Var = new lfi1(ifi1Var, strJ, lA != null ? lA.longValue() : 0L);
            }
            if (lfi1Var != null) {
                arrayList2.add(lfi1Var);
            }
        }
        List list2 = (List) objI;
        if (str != null) {
            arrayList = new ArrayList();
            for (Object obj : list2) {
                num numVarC2 = ((som) obj).c();
                num numVar2 = numVarC2 instanceof num ? numVarC2 : null;
                if (u890.j(numVar2 != null ? numVar2.J() : null, str)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = list2;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = ((Iterable) arrayList).iterator();
        while (it2.hasNext()) {
            String strB2 = ((som) it2.next()).b();
            if (strB2 != null) {
                arrayList3.add(strB2);
            }
        }
        List listJ0 = o7h.j0(arrayList3);
        lgd0Var.a = null;
        lgd0Var.b = (List) arrayList;
        lgd0Var.e = 2;
        objI = j(listJ0, lgd0Var);
        if (objI != d9nVar) {
            r7 = arrayList;
            Map map2 = (Map) objI;
            arrayList2 = new ArrayList();
            it = ((Iterable) r7).iterator();
            while (true) {
                String strC2 = "";
                if (it.hasNext()) {
                    return new blr0(arrayList2, "");
                }
                som somVar2 = (som) it.next();
                numVarC = somVar2.c();
                if (numVarC instanceof num) {
                    numVar = numVarC;
                } else {
                    numVar = null;
                }
                if (numVar != null) {
                    lfi1Var = null;
                } else {
                    lfi1Var = null;
                }
                if (lfi1Var != null) {
                    arrayList2.add(lfi1Var);
                }
            }
        }
        return d9nVar;
    }

    @Override // p.sxz0
    public final Object b(frd1 frd1Var, String str, a8d1 a8d1Var) {
        return rih1.a;
    }

    @Override // p.sxz0
    public final boolean c() {
        return false;
    }

    @Override // p.sxz0
    public final Object d(frd1 frd1Var, lnm lnmVar) {
        return rih1.a;
    }

    @Override // p.sxz0
    public final List e() {
        return z6x.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.sxz0
    public final Serializable f(frd1 frd1Var, onm onmVar) {
        mgd0 mgd0Var;
        if (onmVar instanceof mgd0) {
            mgd0Var = (mgd0) onmVar;
            int i = mgd0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mgd0Var.c = i - Integer.MIN_VALUE;
            } else {
                mgd0Var = new mgd0(this, onmVar);
            }
        } else {
            mgd0Var = new mgd0(this, onmVar);
        }
        Object objI = mgd0Var.a;
        int i2 = mgd0Var.c;
        if (i2 == 0) {
            hm5.M(objI);
            mgd0Var.c = 1;
            objI = i(frd1Var, mgd0Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objI);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Iterable) objI).iterator();
        while (it.hasNext()) {
            num numVarC = ((som) it.next()).c();
            num numVar = numVarC instanceof num ? numVarC : null;
            String strJ = numVar != null ? numVar.J() : null;
            if (strJ != null) {
                arrayList.add(strJ);
            }
        }
        Map mapO = xyn1.o(new g4r(arrayList));
        ArrayList arrayList2 = new ArrayList(mapO.size());
        for (Map.Entry entry : mapO.entrySet()) {
            arrayList2.add(new pxz0((String) entry.getKey(), ((Number) entry.getValue()).intValue()));
        }
        return arrayList2;
    }

    @Override // p.sxz0
    public final v060 g(frd1 frd1Var, a601 a601Var) {
        return new v060(new i001(ihc1.Z0(ihc1.H0(frd1Var.a(), "spotify:listeningactivity:"), "?")), (xpw) this.d.get());
    }

    @Override // p.sxz0
    public final boolean h(frd1 frd1Var) {
        return nhc1.Y(frd1Var.a(), "spotify:listeningactivity:", false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c2, code lost:
    
        if (r1 == r9) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(p.frd1 r17, p.onm r18) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ngd0.i(p.frd1, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(List list, onm onmVar) {
        kgd0 kgd0Var;
        if (onmVar instanceof kgd0) {
            kgd0Var = (kgd0) onmVar;
            int i = kgd0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kgd0Var.c = i - Integer.MIN_VALUE;
            } else {
                kgd0Var = new kgd0(this, onmVar);
            }
        } else {
            kgd0Var = new kgd0(this, onmVar);
        }
        Object objO = kgd0Var.a;
        int i2 = kgd0Var.c;
        if (i2 == 0) {
            hm5.M(objO);
            if (!list.isEmpty()) {
                q4d0 q4d0Var = new q4d0(this, list, (lnm) null, (byte) 8);
                kgd0Var.c = 1;
                objO = rc2.O(5000L, q4d0Var, kgd0Var);
                d9n d9nVar = d9n.a;
                if (objO == d9nVar) {
                    return d9nVar;
                }
            }
            return b7x.a;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objO);
        uv00 uv00Var = (uv00) objO;
        if (uv00Var != null) {
            List<tv00> listB = uv00Var.b(zei1.class);
            ArrayList arrayList = new ArrayList();
            for (tv00 tv00Var : listB) {
                zei1 zei1Var = (zei1) tv00Var.b;
                mmr0 mmr0VarN = zei1Var != null ? oqn1.n(tv00Var.a, zei1Var) : null;
                if (mmr0VarN != null) {
                    arrayList.add(mmr0VarN);
                }
            }
            return sqg0.T(arrayList);
        }
        return b7x.a;
    }
}
