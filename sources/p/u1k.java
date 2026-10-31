package p;

import com.spotify.kodiak.table.table.DataSourceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u1k implements cmh1 {
    public final ArrayList a;
    public final v1k b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    public u1k(ArrayList arrayList, v1k v1kVar) {
        this.a = arrayList;
        this.b = v1kVar;
    }

    @Override // p.cmh1
    public final Map a(Set set) {
        ArrayList arrayList = this.a;
        ConcurrentHashMap concurrentHashMap = this.c;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : set) {
                Integer num = (Integer) concurrentHashMap.computeIfAbsent((jh5) obj, new t1k(this));
                Object arrayList2 = linkedHashMap.get(num);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(num, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
            tr80 tr80VarK = p7h.K(arrayList);
            ArrayList<Map.Entry> arrayList3 = new ArrayList();
            Iterator it = tr80VarK.iterator();
            while (((sr80) it).c) {
                int iNextInt = ((lr80) it).nextInt();
                cmh1 cmh1Var = (cmh1) ((mmr0) arrayList.get(iNextInt)).b;
                List list = (List) linkedHashMap.get(Integer.valueOf(iNextInt));
                r7h.W(cmh1Var.a(list != null ? o7h.p1(list) : w7x.a).entrySet(), arrayList3);
            }
            int iS = zno1.s(q7h.U(arrayList3, 10));
            if (iS < 16) {
                iS = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS);
            for (Map.Entry entry : arrayList3) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
            return linkedHashMap2;
        } finally {
            concurrentHashMap.keySet().retainAll(set);
        }
    }

    @Override // p.cmh1
    public final void b(Set set) {
        ArrayList<mmr0> arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            jh5 jh5Var = (jh5) it.next();
            Integer numG = (Integer) this.c.get(jh5Var);
            mmr0 mmr0VarN = (numG == null && (numG = this.b.G(jh5Var)) == null) ? null : oqn1.n(Integer.valueOf(numG.intValue()), jh5Var);
            if (mmr0VarN != null) {
                arrayList.add(mmr0VarN);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (mmr0 mmr0Var : arrayList) {
            Integer numValueOf = Integer.valueOf(((Number) mmr0Var.a).intValue());
            Object arrayList2 = linkedHashMap.get(numValueOf);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList2);
            }
            ((List) arrayList2).add((jh5) mmr0Var.b);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ((cmh1) ((mmr0) this.a.get(((Number) entry.getKey()).intValue())).b).b(o7h.p1((List) entry.getValue()));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.kodiak.table.table.DataSourceException$UnsupportedKey */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.cmh1
    public final Object c(List list, onm onmVar) throws DataSourceException.UnsupportedKey {
        s1k s1kVar;
        Iterator it;
        int i;
        jh5 jh5Var;
        if (onmVar instanceof s1k) {
            s1kVar = (s1k) onmVar;
            int i2 = s1kVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s1kVar.e = i2 - Integer.MIN_VALUE;
            } else {
                s1kVar = new s1k(this, onmVar);
            }
        } else {
            s1kVar = new s1k(this, onmVar);
        }
        Object obj = s1kVar.c;
        int i3 = s1kVar.e;
        if (i3 == 0) {
            hm5.M(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : list) {
                Object obj3 = ((mmr0) obj2).a;
                Integer numG = (Integer) this.c.get(obj3);
                if (numG == null && (numG = this.b.G((jh5Var = (jh5) obj3))) == null) {
                    throw new DataSourceException.UnsupportedKey(jh5Var);
                }
                Integer numP = yah0.p(numG.intValue());
                Object arrayList = linkedHashMap.get(numP);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(numP, arrayList);
                }
                ((List) arrayList).add(obj2);
            }
            it = linkedHashMap.entrySet().iterator();
            i = 0;
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = s1kVar.b;
            it = s1kVar.a;
            hm5.M(obj);
        }
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            List list2 = (List) entry.getValue();
            cmh1 cmh1Var = (cmh1) ((mmr0) this.a.get(iIntValue)).b;
            s1kVar.a = it;
            s1kVar.b = i;
            s1kVar.e = 1;
            Object objC = cmh1Var.c(list2, s1kVar);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        }
        return rih1.a;
    }

    @Override // p.cmh1
    public final void dispose() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((cmh1) ((mmr0) it.next()).b).dispose();
        }
    }
}
