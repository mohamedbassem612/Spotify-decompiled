package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class my91 {
    public final n381 a;
    public final ymm0 b;
    public final dot c;
    public final u210 d;
    public final k9r e;
    public final yrg0 f;
    public final b0a0 g;
    public final q8n h;

    public my91(n381 n381Var, ymm0 ymm0Var, dot dotVar, u210 u210Var, k9r k9rVar, yrg0 yrg0Var, b0a0 b0a0Var, q8n q8nVar) {
        this.a = n381Var;
        this.b = ymm0Var;
        this.c = dotVar;
        this.d = u210Var;
        this.e = k9rVar;
        this.f = yrg0Var;
        this.g = b0a0Var;
        this.h = q8nVar;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00fb A[LOOP:0: B:44:0x00f5->B:46:0x00fb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(f1a0 f1a0Var, onm onmVar) {
        jy91 jy91Var;
        List list;
        Map map;
        mif1 mif1Var;
        ArrayList arrayList;
        Iterator it;
        if (onmVar instanceof jy91) {
            jy91Var = (jy91) onmVar;
            int i = jy91Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                jy91Var.e = i - Integer.MIN_VALUE;
            } else {
                jy91Var = new jy91(this, onmVar);
            }
        } else {
            jy91Var = new jy91(this, onmVar);
        }
        Object obj = jy91Var.c;
        int i2 = jy91Var.e;
        if (i2 == 0) {
            hm5.M(obj);
            if (f1a0Var instanceof d1a0) {
                return f1a0Var;
            }
            if (!(f1a0Var instanceof e1a0)) {
                eg.o();
                return null;
            }
            mif1 mif1Var2 = mif1.f1;
            list = (List) ((e1a0) f1a0Var).a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                List listB = ((qo90) it2.next()).b();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : listB) {
                    if (!((po90) obj2).c()) {
                        arrayList3.add(obj2);
                    }
                }
                ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(((po90) it3.next()).b());
                }
                r7h.W(arrayList4, arrayList2);
            }
            List listJ0 = o7h.j0(arrayList2);
            if (!((no4) this.g.a.get()).N() || listJ0.isEmpty()) {
                map = b7x.a;
                mif1Var = mif1Var2;
            } else {
                jy91Var.a = list;
                jy91Var.b = mif1Var2;
                jy91Var.e = 1;
                Object objC = c(listJ0, jy91Var);
                Object obj3 = d9n.a;
                if (objC == obj3) {
                    return obj3;
                }
                obj = objC;
                mif1Var = mif1Var2;
            }
            List list2 = list;
            arrayList = new ArrayList(q7h.U(list2, 10));
            it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(o0p1.s((qo90) it.next(), map));
            }
            mif1Var.getClass();
            return new e1a0(arrayList);
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        mif1Var = jy91Var.b;
        list = jy91Var.a;
        hm5.M(obj);
        map = (Map) obj;
        List list3 = list;
        arrayList = new ArrayList(q7h.U(list3, 10));
        it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(o0p1.s((qo90) it.next(), map));
        }
        mif1Var.getClass();
        return new e1a0(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object b(u0a0 u0a0Var, onm onmVar) {
        ky91 ky91Var;
        k9r k9rVar;
        ArrayList arrayList;
        if (onmVar instanceof ky91) {
            ky91Var = (ky91) onmVar;
            int i = ky91Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ky91Var.d = i - Integer.MIN_VALUE;
            } else {
                ky91Var = new ky91(this, onmVar);
            }
        } else {
            ky91Var = new ky91(this, onmVar);
        }
        Object objQ = ky91Var.b;
        int i2 = ky91Var.d;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objQ);
            iu30 iu30VarCreate = this.c.create();
            int i3 = ny91.b;
            xj61 xj61Var = new xj61();
            Map map = u0a0Var.a;
            Map map2 = u0a0Var.b;
            Set<Map.Entry> setEntrySet = map.entrySet();
            ArrayList<mmr0> arrayList2 = new ArrayList();
            for (Map.Entry entry : setEntrySet) {
                y0a0 y0a0Var = (y0a0) entry.getKey();
                Set set = (Set) entry.getValue();
                ArrayList arrayList3 = new ArrayList(q7h.U(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList3.add(oqn1.n(y0a0Var, (ko90) it.next()));
                }
                r7h.W(arrayList3, arrayList2);
            }
            ArrayList arrayList4 = new ArrayList(q7h.U(arrayList2, 10));
            for (mmr0 mmr0Var : arrayList2) {
                y0a0 y0a0Var2 = (y0a0) mmr0Var.a;
                arrayList4.add(new cot(y0a0Var2.a, ny91.a((ko90) mmr0Var.b), y0a0Var2.b));
            }
            xj61Var.addAll(arrayList4);
            LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map2.size()));
            for (Map.Entry entry2 : map2.entrySet()) {
                linkedHashMap.put(((ip90) entry2.getKey()).c(), entry2.getValue());
            }
            Set<Map.Entry> setEntrySet2 = linkedHashMap.entrySet();
            ArrayList<mmr0> arrayList5 = new ArrayList();
            for (Map.Entry entry3 : setEntrySet2) {
                String str = (String) entry3.getKey();
                Set set2 = (Set) entry3.getValue();
                ArrayList arrayList6 = new ArrayList(q7h.U(set2, 10));
                Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    arrayList6.add(oqn1.n(str, (ko90) it2.next()));
                }
                r7h.W(arrayList6, arrayList5);
            }
            ArrayList arrayList7 = new ArrayList(q7h.U(arrayList5, 10));
            for (mmr0 mmr0Var2 : arrayList5) {
                arrayList7.add(new cot((String) mmr0Var2.a, ny91.a((ko90) mmr0Var2.b), b7x.a));
            }
            xj61Var.addAll(arrayList7);
            xj61 xj61VarJ = cwl1.j(xj61Var);
            ArrayList arrayList8 = new ArrayList(q7h.U(xj61VarJ, 10));
            g0y it3 = xj61VarJ.iterator();
            while (it3.hasNext()) {
                arrayList8.add(iu30VarCreate.invoke(((wkg0) it3).next()));
            }
            Iterator it4 = u0a0Var.a.entrySet().iterator();
            while (true) {
                boolean zHasNext = it4.hasNext();
                k9rVar = this.e;
                if (!zHasNext) {
                    break;
                }
                Map.Entry entry4 = (Map.Entry) it4.next();
                y0a0 y0a0Var3 = (y0a0) entry4.getKey();
                Iterator it5 = ((Set) entry4.getValue()).iterator();
                while (it5.hasNext()) {
                    k9rVar.t(y0a0Var3.a, (ko90) it5.next());
                }
            }
            for (Map.Entry entry5 : map2.entrySet()) {
                String strC = ((ip90) entry5.getKey()).c();
                Iterator it6 = ((Set) entry5.getValue()).iterator();
                while (it6.hasNext()) {
                    k9rVar.t(strC, (ko90) it6.next());
                }
            }
            if (arrayList8.isEmpty()) {
                return new e1a0(z6x.a);
            }
            ob01 ob01Var = new ob01(this, arrayList8, (lnm) null, (byte) 17);
            ky91Var.a = arrayList8;
            ky91Var.d = 1;
            objQ = fc11.Q(ob01Var, ky91Var);
            if (objQ != obj) {
                arrayList = arrayList8;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objQ);
                return objQ;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        arrayList = ky91Var.a;
        hm5.M(objQ);
        f1a0 e1a0Var = (f1a0) objQ;
        d dVar = new d(arrayList, this, (byte) 23);
        boolean z = e1a0Var instanceof e1a0;
        if (z) {
            dVar.invoke(((e1a0) e1a0Var).a);
        } else if (!(e1a0Var instanceof d1a0)) {
            eg.o();
            return null;
        }
        iv81 iv81Var = new iv81(this, arrayList, (byte) 9);
        boolean z2 = e1a0Var instanceof d1a0;
        if (z2) {
            iv81Var.invoke(e1a0Var);
        } else if (!z) {
            eg.o();
            return null;
        }
        if (!z2) {
            if (!z) {
                eg.o();
                return null;
            }
            List listA = ((ru21) ((e1a0) e1a0Var).a).a();
            ArrayList arrayList9 = new ArrayList(q7h.U(listA, 10));
            Iterator it7 = listA.iterator();
            while (it7.hasNext()) {
                arrayList9.add(this.b.a((lv21) it7.next()));
            }
            e1a0Var = new e1a0(arrayList9);
        }
        ky91Var.a = null;
        ky91Var.d = 2;
        Object objA = a(e1a0Var, ky91Var);
        return objA == obj ? obj : objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object c(List list, onm onmVar) {
        ly91 ly91Var;
        if (onmVar instanceof ly91) {
            ly91Var = (ly91) onmVar;
            int i = ly91Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ly91Var.d = i - Integer.MIN_VALUE;
            } else {
                ly91Var = new ly91(this, onmVar);
            }
        } else {
            ly91Var = new ly91(this, onmVar);
        }
        Object objP = ly91Var.b;
        int i2 = ly91Var.d;
        b7x b7xVar = b7x.a;
        try {
            if (i2 == 0) {
                hm5.M(objP);
                long j = ny91.a;
                sb91 sb91Var = new sb91(this, list, (lnm) null, (byte) 10);
                ly91Var.a = list;
                ly91Var.d = 1;
                objP = rc2.P(j, sb91Var, ly91Var);
                d9n d9nVar = d9n.a;
                if (objP == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = ly91Var.a;
                hm5.M(objP);
            }
            Map map = (Map) objP;
            if (map == null) {
                n57.s("Profile resolution timed out for " + list.size() + " usernames");
                return b7xVar;
            }
            Collection collectionValues = map.values();
            int i3 = 0;
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    if ((((pv21) it.next()) instanceof nv21) && (i3 = i3 + 1) < 0) {
                        p7h.S();
                        throw null;
                    }
                }
            }
            if (i3 < list.size()) {
                n57.s("Profile resolution resolved " + i3 + "/" + list.size() + " usernames");
            }
            return map;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            n57.g("Failed to resolve profiles for available jams", e2);
            return b7xVar;
        }
    }
}
