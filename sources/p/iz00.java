package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class iz00 {
    public final pv00 a;

    public iz00(pv00 pv00Var) {
        this.a = pv00Var;
    }

    public final ArrayList a(Set set) {
        Set set2 = set;
        ArrayList arrayList = new ArrayList(q7h.U(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(((tka0) it.next()).n());
        }
        Set setP1 = o7h.p1(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = setP1.iterator();
        while (it2.hasNext()) {
            ov00 ov00VarA = this.a.a((Class) it2.next());
            Integer numValueOf = ov00VarA != null ? Integer.valueOf(ov00VarA.b()) : null;
            if (numValueOf != null) {
                arrayList2.add(numValueOf);
            }
        }
        return arrayList2;
    }
}
