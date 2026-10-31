package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class alk1 {
    public static final Set a = c13.i(xkk1.class);

    public static final String a(String str) {
        return ihc1.Y0(str, '?');
    }

    public static final Set b(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(ihc1.Y0((String) it.next(), '?'));
        }
        return dm61.v0(o7h.p1(arrayList2), o7h.p1(arrayList));
    }

    public static final LinkedHashSet c(Collection collection) {
        Collection collection2 = collection;
        Set setP1 = o7h.p1(collection2);
        ArrayList arrayList = new ArrayList(q7h.U(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(ihc1.Y0((String) it.next(), '?'));
        }
        return dm61.y0(setP1, arrayList);
    }
}
