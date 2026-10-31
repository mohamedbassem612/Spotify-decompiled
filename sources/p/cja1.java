package p;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class cja1 {
    public static final LinkedHashMap a;

    static {
        idd1 idd1Var = o571.c;
        List listI = jyo1.i();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listI) {
            if (((o571) obj).b != null) {
                arrayList.add(obj);
            }
        }
        int iS = zno1.s(q7h.U(arrayList, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj2 : arrayList) {
            linkedHashMap.put(((o571) obj2).a, obj2);
        }
        a = linkedHashMap;
    }
}
