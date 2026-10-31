package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w4u0 {
    public final Set a;
    public final g3d0 b;

    public w4u0(Set set, g3d0 g3d0Var) {
        this.a = set;
        this.b = g3d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4u0)) {
            return false;
        }
        w4u0 w4u0Var = (w4u0) obj;
        return u890.j(this.a, w4u0Var.a) && u890.j(this.b, w4u0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        g3d0 g3d0Var = this.b;
        return iHashCode + (g3d0Var == null ? 0 : g3d0Var.hashCode());
    }
}
