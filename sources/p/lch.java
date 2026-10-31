package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lch implements f1r {
    public final List a;
    public final ArrayList b;
    public final int c;

    public lch(List list) {
        this.a = list;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r7h.W(((f1r) it.next()).getItems(), arrayList);
        }
        this.b = arrayList;
        this.c = arrayList.hashCode();
    }

    @Override // p.f1r
    public final k1r a(Map map) {
        Iterator it = this.a.iterator();
        ArrayList arrayList = null;
        int iHashCode = 1;
        while (it.hasNext()) {
            k1r k1rVarA = ((f1r) it.next()).a(map);
            iHashCode = (iHashCode * 31) + k1rVarA.hashCode();
            if (k1rVarA instanceof j1r) {
                return j1r.a;
            }
            if (k1rVarA instanceof h1r) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(((h1r) k1rVarA).a);
            }
        }
        return arrayList != null ? new h1r(new uyq(arrayList)) : new i1r(rih1.a, Integer.valueOf(iHashCode));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1r) || this.c != obj.hashCode()) {
            return false;
        }
        return this.b.equals(((f1r) obj).getItems());
    }

    @Override // p.f1r
    public final List getItems() {
        return this.b;
    }

    public final int hashCode() {
        return this.c;
    }
}
