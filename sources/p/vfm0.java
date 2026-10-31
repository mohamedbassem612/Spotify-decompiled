package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vfm0 {
    public final jx11 a;
    public final Set b;
    public final g3d0 c;

    public vfm0(jx11 jx11Var, Set set, g3d0 g3d0Var) {
        this.a = jx11Var;
        this.b = set;
        this.c = g3d0Var;
    }

    public static vfm0 a(vfm0 vfm0Var, Set set, g3d0 g3d0Var, int i) {
        jx11 jx11Var = vfm0Var.a;
        if ((i & 2) != 0) {
            set = vfm0Var.b;
        }
        if ((i & 4) != 0) {
            g3d0Var = vfm0Var.c;
        }
        vfm0Var.getClass();
        return new vfm0(jx11Var, set, g3d0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfm0)) {
            return false;
        }
        vfm0 vfm0Var = (vfm0) obj;
        return this.a == vfm0Var.a && u890.j(this.b, vfm0Var.b) && u890.j(this.c, vfm0Var.c);
    }

    public final int hashCode() {
        int iC = gvg.c(this.a.hashCode() * 31, 31, this.b);
        g3d0 g3d0Var = this.c;
        return iC + (g3d0Var == null ? 0 : g3d0Var.hashCode());
    }

    public /* synthetic */ vfm0(jx11 jx11Var) {
        this(jx11Var, w7x.a, null);
    }
}
