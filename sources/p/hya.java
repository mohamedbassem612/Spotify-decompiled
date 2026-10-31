package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hya {
    public static final tr80 b = new tr80(0, 30, 1);
    public final List a;

    public hya(List list) {
        this.a = list;
        ArrayList<mmr0> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Integer num = ((o571) next).b;
            mmr0 mmr0Var = num != null ? new mmr0(Integer.valueOf(num.intValue()), next) : null;
            if (mmr0Var != null) {
                arrayList.add(mmr0Var);
            }
        }
        for (mmr0 mmr0Var2 : arrayList) {
            int iIntValue = ((Number) mmr0Var2.a).intValue();
            Object obj = mmr0Var2.b;
            tr80 tr80Var = b;
            int i = ((rr80) tr80Var).a;
            if (iIntValue > ((rr80) tr80Var).b || i > iIntValue) {
                throw new IllegalArgumentException(("Bitmask index " + iIntValue + " of " + ((Object) ((o571) obj).a) + " is outside " + tr80Var).toString());
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (mmr0 mmr0Var3 : arrayList) {
            Integer numValueOf = Integer.valueOf(((Number) mmr0Var3.a).intValue());
            Object arrayList2 = linkedHashMap.get(numValueOf);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList2);
            }
            ((List) arrayList2).add(((o571) mmr0Var3.b).a);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((List) entry.getValue()).size() > 1) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap2.isEmpty()) {
            return;
        }
        bhn0.s(linkedHashMap2, "Bitmask indices used by more than one value: ");
        throw null;
    }
}
