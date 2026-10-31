package p;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class r6h1 implements eri1, Serializable {
    public static final r6h1 c = new r6h1(z6x.a, null);
    public final List a;
    public final u8h1 b;

    public r6h1(List list, u8h1 u8h1Var) {
        this.a = list;
        this.b = u8h1Var;
    }

    @Override // p.eri1
    public final List a() {
        return gxo1.r(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r6h1.class.equals(obj.getClass())) {
            r6h1 r6h1Var = (r6h1) obj;
            if (u890.j(this.a, r6h1Var.a) && u890.j(this.b, r6h1Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        u8h1 u8h1Var = this.b;
        return iHashCode + (u8h1Var != null ? u8h1Var.hashCode() : 0);
    }

    public final String toString() {
        List list = this.a;
        return list.isEmpty() ? "" : o7h.y0(list, "/", "{", "}", null, 56);
    }
}
