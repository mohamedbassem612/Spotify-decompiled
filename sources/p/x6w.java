package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x6w {
    public final uu00 a;

    public x6w(uu00 uu00Var) {
        this.a = uu00Var;
    }

    public final mr20 a(List list) {
        if (list.isEmpty()) {
            return new huz(new n6w(z6x.a), (byte) 10);
        }
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (String str : list2) {
            arrayList.add(new mmr0(str, l1d.m("spotify:user:", str)));
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((mmr0) it.next()).b);
        }
        return new w6w(yoi1.g(this.a.b(new oi("editorial-header-creator", false, new ib5(arrayList2, (byte) 13)))), arrayList, (byte) 0);
    }
}
