package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class smv0 implements pua0 {
    public final /* synthetic */ tmv0 a;
    public final /* synthetic */ ArrayList b;

    public smv0(tmv0 tmv0Var, ArrayList arrayList) {
        this.a = tmv0Var;
        this.b = arrayList;
    }

    public final Map a(Set set) {
        tmv0 tmv0Var = this.a;
        LinkedHashMap linkedHashMapG = tmv0Var.g(set);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = tmv0Var.b.size();
        for (int i = 0; i < size; i++) {
            pua0 pua0Var = (pua0) this.b.get(i);
            w7x w7xVar = (Set) linkedHashMapG.get(Integer.valueOf(i));
            if (w7xVar == null) {
                w7xVar = w7x.a;
            }
            linkedHashMap.putAll(pua0Var.a(w7xVar));
        }
        return linkedHashMap;
    }

    public final void b(Set set) {
        for (Map.Entry entry : this.a.g(set).entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            ((pua0) this.b.get(iIntValue)).b((Set) entry.getValue());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(List list, onm onmVar) {
        rmv0 rmv0Var;
        Iterator it;
        List list2;
        int i;
        if (onmVar instanceof rmv0) {
            rmv0Var = (rmv0) onmVar;
            int i2 = rmv0Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rmv0Var.f = i2 - Integer.MIN_VALUE;
            } else {
                rmv0Var = new rmv0(this, onmVar);
            }
        } else {
            rmv0Var = new rmv0(this, onmVar);
        }
        Object obj = rmv0Var.d;
        int i3 = rmv0Var.f;
        if (i3 == 0) {
            hm5.M(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : list) {
                Integer num = new Integer(this.a.f(((mmr0) obj2).a));
                Object arrayList = linkedHashMap.get(num);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(num, arrayList);
                }
                ((List) arrayList).add(obj2);
            }
            it = linkedHashMap.entrySet().iterator();
            list2 = this.b;
            i = 0;
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = rmv0Var.c;
            it = rmv0Var.b;
            list2 = rmv0Var.a;
            hm5.M(obj);
        }
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            List list3 = (List) entry.getValue();
            pua0 pua0Var = (pua0) list2.get(iIntValue);
            rmv0Var.a = list2;
            rmv0Var.b = it;
            rmv0Var.c = i;
            rmv0Var.f = 1;
            Object objC = pua0Var.c(list3, rmv0Var);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        }
        return rih1.a;
    }

    public final void dispose() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((pua0) it.next()).dispose();
        }
    }
}
