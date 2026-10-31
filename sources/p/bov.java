package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bov {
    public final Set a;
    public final g3d0 b;

    public bov(Set set, g3d0 g3d0Var) {
        this.a = set;
        this.b = g3d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bov)) {
            return false;
        }
        bov bovVar = (bov) obj;
        return u890.j(this.a, bovVar.a) && u890.j(this.b, bovVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        g3d0 g3d0Var = this.b;
        return iHashCode + (g3d0Var == null ? 0 : g3d0Var.hashCode());
    }
}
