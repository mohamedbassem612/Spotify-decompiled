package p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class a0z0 {
    public final boolean a;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Serializable f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;

    public a0z0(ov20 ov20Var, m7y0 m7y0Var, q8n q8nVar, boolean z, boolean z2) {
        this.c = ov20Var;
        this.d = m7y0Var;
        this.e = q8nVar;
        this.a = z;
        this.b = z2;
        this.f = new idd1(new wzy0(this, (byte) 5));
        this.g = new idd1(new wzy0(this, (byte) 6));
        this.h = new idd1(new wzy0(this, (byte) 4));
        this.i = new idd1(new wzy0(this, (byte) 1));
        this.j = new idd1(new wzy0(this, (byte) 3));
        this.k = new idd1(new wzy0(this, (byte) 2));
        this.l = new idd1(new wzy0(this, (byte) 0));
        this.m = new idd1(new wzy0(this, (byte) 7));
    }

    public static mmr0 i(ioj0 ioj0Var, ioj0 ioj0Var2, ioj0 ioj0Var3) {
        ioj0 ioj0VarA;
        cqs0 cqs0Var = ioj0Var2 != null ? ioj0Var2.a : null;
        cqs0 cqs0Var2 = b7x.a;
        if (cqs0Var == null) {
            cqs0Var = cqs0Var2;
        }
        ioj0 ioj0VarA2 = ioj0Var.a(cqs0Var, false).a(ioj0Var3.a, false);
        if ((ioj0Var2 == null || !ioj0Var2.b()) && !ioj0Var3.b()) {
            ioj0VarA = ioj0VarA2;
        } else {
            cqs0 cqs0Var3 = ioj0Var2 != null ? ioj0Var2.a : null;
            if (cqs0Var3 != null) {
                cqs0Var2 = cqs0Var3;
            }
            ioj0VarA = ioj0Var.a(cqs0Var2, true).a(ioj0Var3.a, true);
        }
        return new mmr0(ioj0VarA2, ioj0VarA);
    }

    public static s280 j(ioj0 ioj0Var) {
        LinkedHashMap linkedHashMap;
        if (ioj0Var != null) {
            try {
                Map mapC = vyo1.C(ioj0Var);
                linkedHashMap = new LinkedHashMap(zno1.s(mapC.size()));
                for (Object obj : mapC.entrySet()) {
                    linkedHashMap.put(((Map.Entry) obj).getKey(), new j3r(((Map.Entry) obj).getValue()));
                }
            } catch (ClassCastException unused) {
                linkedHashMap = null;
            }
        } else {
            linkedHashMap = null;
        }
        if (linkedHashMap == null || linkedHashMap.isEmpty()) {
            return null;
        }
        return new s280(linkedHashMap);
    }

    public void a(smc0 smc0Var, b0z0 b0z0Var) {
        jgb1 jgb1VarM;
        d7 d7Var = new d7(rzy0.t, (byte) 0);
        while (d7Var.hasNext()) {
            rzy0 rzy0Var = (rzy0) d7Var.next();
            f5y0 f5y0Var = new f5y0((mr20) ((idd1) this.m).getValue(), rzy0Var, (byte) 6);
            switch (rzy0Var.ordinal()) {
                case 0:
                    jgb1VarM = b0z0Var.m(f5y0Var);
                    break;
                case 1:
                    jgb1VarM = b0z0Var.a(f5y0Var);
                    break;
                case 2:
                    jgb1VarM = b0z0Var.h(f5y0Var);
                    break;
                case 3:
                    jgb1VarM = b0z0Var.b(f5y0Var);
                    break;
                case 4:
                    jgb1VarM = b0z0Var.f(f5y0Var);
                    break;
                case 5:
                    jgb1VarM = b0z0Var.i(f5y0Var);
                    break;
                case 6:
                    jgb1VarM = b0z0Var.j(f5y0Var);
                    break;
                case 7:
                    jgb1VarM = b0z0Var.e(f5y0Var);
                    break;
                default:
                    eg.o();
                    return;
            }
            smc0Var.add(jgb1VarM);
        }
    }

    public wz81 b(wz81 wz81Var, ioj0 ioj0Var, d0r d0rVar, Set set) {
        boolean z;
        boolean z2;
        vz81 vz81VarC;
        ioj0 ioj0Var2 = wz81Var.a;
        Map map = wz81Var.j;
        List list = wz81Var.f;
        List list2 = wz81Var.i;
        List list3 = wz81Var.c;
        List list4 = wz81Var.h;
        ioj0 ioj0VarA = ioj0Var2.a(ioj0Var.a, false);
        boolean zB = ioj0Var.b();
        if (set != null && !this.a && ((cc9) this.j).c == 0 && list4.size() == list3.size() && list2.size() == list3.size()) {
            if (set.isEmpty()) {
                vz81VarC = new vz81(list, list4, list2, map);
                z = zB;
            } else {
                ArrayList arrayList = new ArrayList(list4);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    int[] iArr = (int[]) map.get((jh5) it.next());
                    if (iArr != null) {
                        for (int i : iArr) {
                            linkedHashSet.add(Integer.valueOf(i));
                        }
                    }
                    zB = zB;
                }
                z = zB;
                Iterator it2 = linkedHashSet.iterator();
                boolean z3 = false;
                while (it2.hasNext()) {
                    int iIntValue = ((Number) it2.next()).intValue();
                    Iterator it3 = it2;
                    ArrayList arrayList2 = arrayList;
                    boolean z4 = z3;
                    boolean zC = zz81.c((Map) this.c, (Map) this.d, (LinkedHashMap) this.f, (h8k1) list3.get(iIntValue), ioj0VarA, d0rVar, 1);
                    if (((Boolean) arrayList2.get(iIntValue)).booleanValue() != zC) {
                        arrayList2.set(iIntValue, Boolean.valueOf(zC));
                        z3 = true;
                    } else {
                        z3 = z4;
                    }
                    arrayList = arrayList2;
                    it2 = it3;
                }
                ArrayList arrayList3 = arrayList;
                if (z3) {
                    ArrayList arrayList4 = new ArrayList();
                    int i2 = 0;
                    for (Object obj : list3) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            p7h.T();
                            throw null;
                        }
                        if (((Boolean) arrayList3.get(i2)).booleanValue()) {
                            arrayList4.add(obj);
                        }
                        i2 = i3;
                    }
                    vz81VarC = new vz81(arrayList4, arrayList3, list2, map);
                } else {
                    vz81VarC = new vz81(list, list4, list2, map);
                }
            }
            z2 = true;
        } else {
            z = zB;
            d0rVar = d0rVar;
            z2 = true;
            vz81VarC = c(list3, ioj0VarA, d0rVar, true);
        }
        List list5 = vz81VarC.a;
        boolean zEquals = list5.equals(list);
        if (z) {
            ioj0VarA = ioj0Var2.a(ioj0Var.a, z2);
        }
        boolean z5 = ioj0VarA != ioj0Var2 ? z2 : false;
        List list6 = vz81VarC.b;
        List list7 = vz81VarC.c;
        Map map2 = vz81VarC.d;
        int i4 = wz81Var.d;
        if (!zEquals) {
            i4++;
        }
        int i5 = wz81Var.e;
        if (z5) {
            i5++;
        }
        return wz81.a(wz81Var, ioj0VarA, d0rVar, (List) null, i4, i5, list5, (tr80) null, list6, list7, map2, (LinkedHashMap) null, (s280) null, 1092);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:53:0x010b A[LOOP:2: B:51:0x0105->B:53:0x010b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x0139 A[LOOP:3: B:55:0x0133->B:57:0x0139, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x0154  */
    /* JADX WARN: Code duplicated, block: B:66:0x016e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x014e A[SYNTHETIC] */
    public vz81 c(List list, ioj0 ioj0Var, d0r d0rVar, boolean z) {
        int size;
        h8k1 h8k1Var;
        boolean z2;
        z6x z6xVar;
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        Iterator it2;
        ArrayList arrayList3;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f;
        Map map = (Map) this.d;
        Map map2 = (Map) this.c;
        boolean z3 = false;
        if (this.a) {
            Iterator it3 = list.iterator();
            size = 0;
            while (true) {
                if (!it3.hasNext()) {
                    size = -1;
                    break;
                }
                if (!zz81.c(map2, map, linkedHashMap, (h8k1) it3.next(), ioj0Var, d0rVar, (this.b && z) ? 3 : 1)) {
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = list.size();
            }
        } else {
            int i = ((cc9) this.j).c;
            if (i > 0) {
                Collection collectionQ = yoi1.Q(0, Math.min(i, list.size()));
                if (!(collectionQ instanceof Collection) || !collectionQ.isEmpty()) {
                    lr80 it4 = collectionQ.iterator();
                    while (true) {
                        if (!((sr80) it4).c) {
                            size = list.size();
                            break;
                        }
                        if (!zz81.c(map2, map, linkedHashMap, (h8k1) list.get(it4.nextInt()), ioj0Var, d0rVar, 2)) {
                            size = 0;
                            break;
                        }
                    }
                } else {
                    size = list.size();
                    break;
                }
            } else {
                size = list.size();
            }
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        ArrayList arrayList5 = new ArrayList(size);
        ArrayList arrayList6 = new ArrayList(list.size());
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                p7h.T();
                throw null;
            }
            h8k1 h8k1Var2 = (h8k1) obj;
            if (i2 < size) {
                h8k1Var = h8k1Var2;
                if (zz81.c(map2, map, linkedHashMap, h8k1Var, ioj0Var, d0rVar, 1)) {
                    z2 = true;
                }
                arrayList4.add(Boolean.valueOf(z2));
                z6xVar = (List) ((Map) this.e).get(h8k1Var.a.getClass());
                if (z6xVar == null) {
                    z6xVar = z6x.a;
                }
                arrayList = new ArrayList();
                it = ((Iterable) z6xVar).iterator();
                while (it.hasNext()) {
                    r7h.W(((f4r) it.next()).a(h8k1Var.a).getItems(), arrayList);
                }
                arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((e1r) it2.next()).a);
                }
                arrayList3 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    if (!((jh5) obj2).a()) {
                        arrayList3.add(obj2);
                    }
                }
                arrayList6.add(o7h.p1(arrayList3));
                if (z2) {
                    arrayList5.add(h8k1Var);
                }
                i2 = i3;
                z3 = false;
            } else {
                h8k1Var = h8k1Var2;
            }
            z2 = z3;
            arrayList4.add(Boolean.valueOf(z2));
            z6xVar = (List) ((Map) this.e).get(h8k1Var.a.getClass());
            if (z6xVar == null) {
                z6xVar = z6x.a;
            }
            arrayList = new ArrayList();
            it = ((Iterable) z6xVar).iterator();
            while (it.hasNext()) {
                r7h.W(((f4r) it.next()).a(h8k1Var.a).getItems(), arrayList);
            }
            arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((e1r) it2.next()).a);
            }
            arrayList3 = new ArrayList();
            while (r8.hasNext()) {
                if (!((jh5) obj2).a()) {
                    arrayList3.add(obj2);
                }
            }
            arrayList6.add(o7h.p1(arrayList3));
            if (z2) {
                arrayList5.add(h8k1Var);
            }
            i2 = i3;
            z3 = false;
        }
        return new vz81(arrayList5, arrayList4, arrayList6, zz81.e(arrayList6));
    }

    public mz81 d() {
        return (mz81) this.m;
    }

    public Set e(wz81 wz81Var) {
        smc0 smc0VarK;
        List list = wz81Var.c;
        tr80 tr80Var = wz81Var.g;
        if (tr80Var.isEmpty() || list.isEmpty()) {
            smc0VarK = z6x.a;
        } else {
            tr80 tr80VarK = p7h.K(list);
            q8n q8nVar = zz81.a;
            int iQ = yoi1.q(((rr80) tr80Var).a, tr80VarK);
            tr80 tr80Var2 = new tr80(iQ, yoi1.q(((rr80) tr80Var).b, tr80VarK), 1);
            smc0 smc0VarN = k4p1.n();
            int i = ((rr80) tr80Var2).b;
            if (iQ <= i) {
                while (true) {
                    Object obj = ((h8k1) list.get(iQ)).a;
                    List list2 = (List) ((Map) this.e).get(obj.getClass());
                    if (list2 != null) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            smc0VarN.add(((f4r) it.next()).a(obj));
                        }
                    }
                    if (iQ == i) {
                        break;
                    }
                    iQ++;
                }
            }
            smc0VarK = k4p1.k(smc0VarN);
        }
        return Collections.singleton(new oz81(smc0VarK));
    }

    public List f(wz81 wz81Var, int i) {
        if (((guh0) this.k) == null) {
            return z6x.a;
        }
        int i2 = i - 5;
        tr80 tr80Var = new tr80(i2, i + 5, 1);
        List list = wz81Var.c;
        Set setP1 = o7h.p1(wz81Var.f);
        tr80 tr80VarK = p7h.K(list);
        q8n q8nVar = zz81.a;
        tr80 tr80Var2 = new tr80(yoi1.q(i2, tr80VarK), yoi1.q(((rr80) tr80Var).b, tr80VarK), 1);
        ArrayList arrayList = new ArrayList();
        lr80 it = tr80Var2.iterator();
        while (((sr80) it).c) {
            Object obj = list.get(it.nextInt());
            if (!setP1.contains((h8k1) obj)) {
                obj = null;
            }
            h8k1 h8k1Var = (h8k1) obj;
            if (h8k1Var != null) {
                arrayList.add(h8k1Var);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    public Set g(List list, wz81 wz81Var) {
        yrw yrwVarA;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                h8k1 h8k1Var = (h8k1) it.next();
                Map map = (Map) this.h;
                Object obj = h8k1Var.a;
                List list2 = (List) map.get(obj.getClass());
                yrw yrwVar = null;
                if (list2 == null) {
                    yrwVarA = null;
                } else {
                    if (list2.isEmpty()) {
                        list2 = null;
                    }
                    if (list2 != null) {
                        ruh0 ruh0Var = (ruh0) o7h.q0(list2);
                        d0r d0rVar = wz81Var.b;
                        f4r f4rVarB = ruh0Var.b();
                        if (f4rVarB != null) {
                            k1r k1rVarB = d0rVar.b(f4rVarB.a(obj));
                            k1rVarB.getClass();
                            if (k1rVarB instanceof i1r) {
                                yrwVarA = ruh0Var.a(obj, u890.k(k1rVarB, (d0r) null, (n4r) null));
                            } else {
                                yrwVarA = null;
                            }
                        } else {
                            yrwVarA = ruh0Var.a(obj, (Object) null);
                        }
                    } else {
                        yrwVarA = null;
                    }
                }
                vu30 vu30Var = (vu30) ((Map) this.g).get(obj.getClass());
                if (vu30Var != null) {
                    yrwVar = (yrw) vu30Var.invoke(obj, wz81Var.a);
                }
                r7h.W(f46.i0(new yrw[]{yrwVarA, yrwVar}), arrayList);
            }
            List listJ0 = o7h.j0(arrayList);
            if (!listJ0.isEmpty()) {
                return Collections.singleton(new nz81(listJ0));
            }
        }
        return w7x.a;
    }

    public dq7 h() {
        return (dq7) this.l;
    }

    public a0z0(Map map, Map map2, Map map3, LinkedHashMap linkedHashMap, Map map4, Map map5, d0r d0rVar, boolean z, boolean z2, rhg0 rhg0Var, cc9 cc9Var, guh0 guh0Var) {
        this.c = map;
        this.d = map2;
        this.e = map3;
        this.f = linkedHashMap;
        this.g = map4;
        this.h = map5;
        this.i = d0rVar;
        this.a = z;
        this.b = z2;
        this.j = cc9Var;
        this.k = guh0Var;
        this.l = new dq7(this, (byte) 26);
        this.m = new mz81(d0rVar, rhg0Var, guh0Var);
    }
}
