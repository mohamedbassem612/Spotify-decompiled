package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class odc0 {
    public final List a;
    public final g3d0 b;

    public odc0(List list, g3d0 g3d0Var) {
        this.a = list;
        this.b = g3d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof odc0)) {
            return false;
        }
        odc0 odc0Var = (odc0) obj;
        return u890.j(this.a, odc0Var.a) && u890.j(this.b, odc0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        g3d0 g3d0Var = this.b;
        return iHashCode + (g3d0Var == null ? 0 : g3d0Var.hashCode());
    }
}
