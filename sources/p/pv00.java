package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pv00 {
    public final LinkedHashMap a;

    public pv00(Set set) {
        Set set2 = set;
        dqu dquVar = new dqu(set2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator itF = dquVar.f();
        while (itF.hasNext()) {
            Object next = itF.next();
            Object objA = dquVar.a(next);
            Object obj = linkedHashMap.get(objA);
            if (obj != null || linkedHashMap.containsKey(objA)) {
                String name = ((ov00) next).getClass().getName();
                String name2 = ((Class) objA).getName();
                hhg1.j(gvg.n("ExtendedMetadataPlugin '", name, "' duplicates type '", name2, "' provided by ExtendedMetadataPlugin '"), ((ov00) obj).getClass(), "'");
                throw null;
            }
            linkedHashMap.put(objA, next);
        }
        this.a = linkedHashMap;
        qim qimVar = new qim(set2, (byte) 2);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator itF2 = qimVar.f();
        while (itF2.hasNext()) {
            Object next2 = itF2.next();
            Object objA2 = qimVar.a(next2);
            Object obj2 = linkedHashMap2.get(objA2);
            if (obj2 != null || linkedHashMap2.containsKey(objA2)) {
                int iIntValue = ((Number) objA2).intValue();
                String name3 = ((ov00) next2).getClass().getName();
                hhg1.j(l1d.s(iIntValue, "ExtendedMetadataPlugin '", name3, "' duplicates Extension Kind '", "' provided by ExtendedMetadataPlugin '"), ((ov00) obj2).getClass(), "'");
                throw null;
            }
            linkedHashMap2.put(objA2, next2);
        }
    }

    public final ov00 a(Class cls) {
        ov00 ov00Var = (ov00) this.a.get(cls);
        if (ov00Var != null) {
            return ov00Var;
        }
        n57.e("No ExtendedMetadataPlugin registered for '" + cls.getName() + "'. Registered plugins:\n" + b());
        return null;
    }

    public final String b() {
        Collection<ov00> collectionValues = this.a.values();
        ArrayList arrayList = new ArrayList();
        for (ov00 ov00Var : collectionValues) {
            arrayList.add(ov00Var.getClass().getName() + " for Extension Kind: " + ov00Var.b());
        }
        return o7h.y0(o7h.Z0(arrayList), "\n", "\t", null, null, 60);
    }
}
