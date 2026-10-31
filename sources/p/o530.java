package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class o530 {
    public final Set a;
    public final g3d0 b;

    public o530(Set set, g3d0 g3d0Var) {
        this.a = set;
        this.b = g3d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o530)) {
            return false;
        }
        o530 o530Var = (o530) obj;
        return u890.j(this.a, o530Var.a) && u890.j(this.b, o530Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        g3d0 g3d0Var = this.b;
        return iHashCode + (g3d0Var == null ? 0 : g3d0Var.hashCode());
    }
}
