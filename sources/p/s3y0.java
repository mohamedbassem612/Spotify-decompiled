package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s3y0 {
    public final tv80 a;
    public final Set b;
    public final g3d0 c;

    public s3y0(tv80 tv80Var, Set set, g3d0 g3d0Var) {
        this.a = tv80Var;
        this.b = set;
        this.c = g3d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3y0)) {
            return false;
        }
        s3y0 s3y0Var = (s3y0) obj;
        return this.a.equals(s3y0Var.a) && u890.j(this.b, s3y0Var.b) && u890.j(this.c, s3y0Var.c);
    }

    public final int hashCode() {
        int iC = gvg.c(this.a.hashCode() * 31, 31, this.b);
        g3d0 g3d0Var = this.c;
        return iC + (g3d0Var == null ? 0 : g3d0Var.hashCode());
    }
}
