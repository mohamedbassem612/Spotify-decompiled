package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class hxh {
    public static final LinkedHashSet a;

    static {
        Set set = tnw0.e;
        ArrayList arrayList = new ArrayList(q7h.U(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(sfb1.l.a(((tnw0) it.next()).a));
        }
        ArrayList arrayListO0 = o7h.O0(rfb1.j.i(), o7h.O0(rfb1.h.i(), o7h.O0(rfb1.f.i(), arrayList)));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = arrayListO0.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(mka.n((kf30) it2.next()));
        }
        a = linkedHashSet;
    }
}
