package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z3y0 {
    public final boolean a;
    public final Set b;
    public final g3d0 c;
    public final cio d;

    public z3y0(boolean z, Set set, g3d0 g3d0Var, cio cioVar) {
        this.a = z;
        this.b = set;
        this.c = g3d0Var;
        this.d = cioVar;
    }

    public static z3y0 a(z3y0 z3y0Var, boolean z, g3d0 g3d0Var, cio cioVar, int i) {
        if ((i & 1) != 0) {
            z = z3y0Var.a;
        }
        Set set = (i & 2) != 0 ? z3y0Var.b : w7x.a;
        if ((i & 4) != 0) {
            g3d0Var = z3y0Var.c;
        }
        if ((i & 8) != 0) {
            cioVar = z3y0Var.d;
        }
        return new z3y0(z, set, g3d0Var, cioVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3y0)) {
            return false;
        }
        z3y0 z3y0Var = (z3y0) obj;
        return this.a == z3y0Var.a && u890.j(this.b, z3y0Var.b) && u890.j(this.c, z3y0Var.c) && u890.j(this.d, z3y0Var.d);
    }

    public final int hashCode() {
        int iC = gvg.c(Boolean.hashCode(this.a) * 31, 31, this.b);
        g3d0 g3d0Var = this.c;
        int iHashCode = (iC + (g3d0Var == null ? 0 : g3d0Var.hashCode())) * 31;
        cio cioVar = this.d;
        return iHashCode + (cioVar != null ? cioVar.hashCode() : 0);
    }
}
