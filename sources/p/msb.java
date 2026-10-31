package p;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class msb {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        ytw0 ytw0Var = jfv.b;
        a = jfv.r(2, fdg1.k0(200, ngv.d));
    }

    public static final LinkedHashMap a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            drb drbVar = ((x2g) it.next()).b;
            drb drbVar2 = drbVar instanceof drb ? drbVar : null;
            if (drbVar2 != null) {
                arrayList.add(drbVar2);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((drb) obj).v())) {
                arrayList2.add(obj);
            }
        }
        int iS = zno1.s(q7h.U(arrayList2, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj2 : arrayList2) {
            linkedHashMap.put(((drb) obj2).v(), obj2);
        }
        return linkedHashMap;
    }
}
