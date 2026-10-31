package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class aka1 {
    public static final aka1 b = new aka1(b7x.a);
    public final Map a;

    public aka1(Map map) {
        this.a = map;
    }

    public final Set a() {
        ArrayList arrayListV = q7h.V(this.a.values());
        ArrayList arrayList = new ArrayList(q7h.U(arrayListV, 10));
        Iterator it = arrayListV.iterator();
        while (it.hasNext()) {
            arrayList.add(((rvt0) it.next()).a);
        }
        return o7h.p1(arrayList);
    }
}
