package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ndc0 {
    public final Map a;
    public final g3d0 b;
    public final boolean c;

    public ndc0(Map map, g3d0 g3d0Var, boolean z) {
        this.a = map;
        this.b = g3d0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ndc0)) {
            return false;
        }
        ndc0 ndc0Var = (ndc0) obj;
        return u890.j(this.a, ndc0Var.a) && u890.j(this.b, ndc0Var.b) && this.c == ndc0Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        g3d0 g3d0Var = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (g3d0Var == null ? 0 : g3d0Var.hashCode())) * 31);
    }
}
