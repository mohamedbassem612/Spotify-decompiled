package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hga implements f1r {
    public final ArrayList a;
    public final ArrayList b;

    public hga(ArrayList arrayList) {
        this.a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r7h.W(((f1r) it.next()).getItems(), arrayList2);
        }
        this.b = arrayList2;
    }

    public final k1r a(Map map) {
        ArrayList arrayList = this.a;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((f1r) it.next()).a(map));
        }
        return new i1r(arrayList2, (Integer) null);
    }

    public final List getItems() {
        return this.b;
    }
}
