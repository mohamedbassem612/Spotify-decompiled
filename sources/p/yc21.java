package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yc21 {
    public final b2a a;
    public final ArrayList b;
    public final oqt0 c;
    public final boolean d;
    public final ed21 e;

    public yc21(b2a b2aVar, ArrayList arrayList, oqt0 oqt0Var, boolean z) {
        k2a k2aVar;
        this.a = b2aVar;
        this.b = arrayList;
        this.c = oqt0Var;
        this.d = z;
        Set set = b2aVar != null ? b2aVar.a : null;
        Set set2 = set == null ? w7x.a : set;
        ArrayList arrayList2 = new ArrayList(q7h.U(set2, 10));
        Iterator it = set2.iterator();
        while (true) {
            if (!it.hasNext()) {
                this.e = new ed21(b2aVar != null ? xyn1.o(new wcr(arrayList2, (byte) 28)) : null, this.b.size(), this.c != null, a());
                return;
            }
            z1a z1aVar = (z1a) it.next();
            if (u890.j(z1aVar, w1a.b)) {
                k2aVar = new k2a(1, null);
            } else if (z1aVar instanceof v1a) {
                k2aVar = new k2a(2, null);
            } else if (z1aVar instanceof y1a) {
                k2aVar = new k2a(3, null);
            } else if (z1aVar instanceof x1a) {
                k2aVar = new k2a(4, null);
            } else if (u890.j(z1aVar, w1a.d)) {
                k2aVar = new k2a(5, null);
            } else if (u890.j(z1aVar, w1a.c)) {
                k2aVar = new k2a(6, null);
            } else {
                if (!(z1aVar instanceof u1a)) {
                    eg.o();
                    throw null;
                }
                k2aVar = new k2a(7, (u1a) z1aVar);
            }
            arrayList2.add(k2aVar);
        }
    }

    public final boolean a() {
        oqt0 oqt0Var;
        return (this.b.isEmpty() || (oqt0Var = this.c) == null || !oqt0Var.a || oqt0Var.d == 3) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yc21)) {
            return false;
        }
        yc21 yc21Var = (yc21) obj;
        return u890.j(this.a, yc21Var.a) && this.b.equals(yc21Var.b) && u890.j(this.c, yc21Var.c) && this.d == yc21Var.d;
    }

    public final int hashCode() {
        b2a b2aVar = this.a;
        int iF = p3d1.f(this.b, (b2aVar == null ? 0 : b2aVar.a.hashCode()) * 31, 31);
        oqt0 oqt0Var = this.c;
        return Boolean.hashCode(this.d) + ((iF + (oqt0Var != null ? oqt0Var.hashCode() : 0)) * 31);
    }
}
