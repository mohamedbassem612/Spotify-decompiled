package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xxm0 implements igb1 {
    public final List a;
    public final Map b;
    public final pxm0 c;
    public final vxm0 d;
    public final mxm0 e;

    public xxm0(List list, Map map, pxm0 pxm0Var, vxm0 vxm0Var, mxm0 mxm0Var, int i) {
        map = (i & 2) != 0 ? b7x.a : map;
        mxm0Var = (i & 16) != 0 ? null : mxm0Var;
        this.a = list;
        this.b = map;
        this.c = pxm0Var;
        this.d = vxm0Var;
        this.e = mxm0Var;
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((qxm0) it.next()).a));
        }
        if (o7h.p1(arrayList).size() == this.a.size()) {
            return;
        }
        hhg1.n("All options must have a unique value");
        throw null;
    }

    @Override // p.igb1
    public final hgb1 a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxm0)) {
            return false;
        }
        xxm0 xxm0Var = (xxm0) obj;
        return this.a.equals(xxm0Var.a) && this.b.equals(xxm0Var.b) && this.c.equals(xxm0Var.c) && this.d.equals(xxm0Var.d) && u890.j(this.e, xxm0Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + cy30.e(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        mxm0 mxm0Var = this.e;
        return iHashCode + (mxm0Var == null ? 0 : mxm0Var.hashCode());
    }
}
