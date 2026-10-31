package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tim {
    public final Set a;
    public final LinkedHashMap b;

    public tim(t380 t380Var) {
        tka0 tka0Var;
        this.a = t380Var;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : t380Var) {
            a83 a83Var = (a83) obj;
            switch (a83Var.a) {
                case 0:
                    tka0Var = a83Var.c;
                    break;
                case 1:
                    tka0Var = a83Var.c;
                    break;
                case 2:
                    tka0Var = a83Var.c;
                    break;
                case 3:
                    tka0Var = a83Var.c;
                    break;
                case 4:
                    tka0Var = a83Var.c;
                    break;
                case 5:
                    tka0Var = a83Var.c;
                    break;
                case 6:
                    tka0Var = a83Var.c;
                    break;
                case 7:
                    tka0Var = a83Var.c;
                    break;
                case 8:
                    tka0Var = a83Var.c;
                    break;
                case 9:
                    tka0Var = a83Var.c;
                    break;
                case 10:
                    tka0Var = a83Var.c;
                    break;
                case 11:
                    tka0Var = a83Var.c;
                    break;
                case 12:
                    tka0Var = a83Var.c;
                    break;
                case 13:
                    tka0Var = a83Var.c;
                    break;
                case 14:
                    tka0Var = a83Var.c;
                    break;
                case 15:
                    tka0Var = a83Var.c;
                    break;
                case 16:
                    tka0Var = a83Var.c;
                    break;
                case 17:
                    tka0Var = a83Var.c;
                    break;
                default:
                    tka0Var = a83Var.c;
                    break;
            }
            Object arrayList = linkedHashMap.get(tka0Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(tka0Var, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.b = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((List) entry.getValue()).size() > 1) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        if (!linkedHashMap2.isEmpty()) {
            Set setKeySet = linkedHashMap2.keySet();
            ArrayList arrayList2 = new ArrayList(q7h.U(setKeySet, 10));
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList2.add(((tka0) it.next()).r());
            }
            n57.e("Duplicate ContextMenuRegistration keys: " + arrayList2);
        }
        Set set = this.a;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Object obj2 : set) {
            a1l0 a1l0VarB = ((a83) obj2).b();
            Object arrayList3 = linkedHashMap3.get(a1l0VarB);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap3.put(a1l0VarB, arrayList3);
            }
            ((List) arrayList3).add(obj2);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
            if (((List) entry2.getValue()).size() > 1) {
                linkedHashMap4.put(entry2.getKey(), entry2.getValue());
            }
        }
        if (linkedHashMap4.isEmpty()) {
            return;
        }
        n57.e("Duplicate ContextMenuRegistration UBI IDs: " + linkedHashMap4.keySet());
    }
}
