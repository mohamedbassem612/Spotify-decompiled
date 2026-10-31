package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qd20 {
    public final List a;
    public final xo20 b;

    public qd20(List list, xo20 xo20Var) {
        this.a = list;
        this.b = xo20Var;
    }

    public final aa80 a(String str) {
        Object next;
        ca80 it = o7h.u1(this.a).iterator();
        do {
            ca80 ca80Var = it;
            if (!((Iterator) ca80Var.c).hasNext()) {
                next = null;
                break;
            }
            next = ca80Var.next();
        } while (!u890.j(((xo20) ((aa80) next).b).a, str));
        return (aa80) next;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd20)) {
            return false;
        }
        qd20 qd20Var = (qd20) obj;
        return this.a.equals(qd20Var.a) && u890.j(this.b, qd20Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        xo20 xo20Var = this.b;
        return iHashCode + (xo20Var == null ? 0 : xo20Var.hashCode());
    }
}
