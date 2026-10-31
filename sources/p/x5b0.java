package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x5b0 {
    public final jd6 a;
    public final rhg0 b;
    public final LinkedHashMap c = new LinkedHashMap();

    public x5b0(v6q v6qVar, d0r d0rVar) {
        this.a = v6qVar.a(d0rVar, new bz0(3, (lnm) null, (byte) 14));
        this.b = new rhg0(d0rVar, (ukj0) null);
    }

    public final void a(String str, List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.a.c.a(new r7k0((String) it.next())));
        }
        Set setP1 = o7h.p1(arrayList);
        LinkedHashMap linkedHashMap = this.c;
        linkedHashMap.put(str, setP1);
        this.b.a(o7h.p1(q7h.V(linkedHashMap.values())), (ArrayList) null, (ArrayList) null);
    }
}
