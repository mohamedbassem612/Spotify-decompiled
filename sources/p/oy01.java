package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class oy01 {
    public final List a;
    public final t45 b;

    public oy01(List list, t45 t45Var) {
        this.a = list;
        this.b = t45Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oy01)) {
            return false;
        }
        oy01 oy01Var = (oy01) obj;
        return u890.j(this.a, oy01Var.a) && u890.j(this.b, oy01Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        t45 t45Var = this.b;
        return iHashCode + (t45Var == null ? 0 : t45Var.hashCode());
    }
}
