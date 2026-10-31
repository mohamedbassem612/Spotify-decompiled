package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface qav {
    static LinkedHashMap c(qav qavVar) {
        LinkedHashMap linkedHashMapH = rav.h(((rav) qavVar).d);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMapH.entrySet()) {
            String str = (String) entry.getKey();
            ba80 ba80VarV0 = f46.V0(((td00) entry.getValue()).a);
            ArrayList<aa80> arrayList2 = new ArrayList();
            ca80 it = ba80VarV0.iterator();
            while (true) {
                ca80 ca80Var = it;
                if (!((Iterator) ca80Var.c).hasNext()) {
                    break;
                }
                arrayList2.add(ca80Var.next());
            }
            ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
            for (aa80 aa80Var : arrayList2) {
                nav navVar = (nav) aa80Var.b;
                long j = navVar.a;
                long j2 = j - navVar.b;
                LinkedHashMap linkedHashMap = qd00.b;
                arrayList3.add(new oav(str, j, j2, s3o1.o(aa80Var.a)));
            }
            r7h.W(arrayList3, arrayList);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj : arrayList) {
            String str2 = ((oav) obj).a;
            Object objH = linkedHashMap2.get(str2);
            if (objH == null) {
                objH = cfm0.h(str2, linkedHashMap2);
            }
            ((List) objH).add(obj);
        }
        return linkedHashMap2;
    }
}
