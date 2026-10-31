package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dr11 {
    public final String a;
    public final Set b;
    public final g3d0 c;
    public final mqz0 d;

    public dr11(String str, Set set, g3d0 g3d0Var, mqz0 mqz0Var) {
        this.a = str;
        this.b = set;
        this.c = g3d0Var;
        this.d = mqz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dr11)) {
            return false;
        }
        dr11 dr11Var = (dr11) obj;
        return u890.j(this.a, dr11Var.a) && u890.j(this.b, dr11Var.b) && u890.j(this.c, dr11Var.c) && u890.j(this.d, dr11Var.d);
    }

    public final int hashCode() {
        int iC = gvg.c(this.a.hashCode() * 31, 31, this.b);
        g3d0 g3d0Var = this.c;
        return this.d.hashCode() + ((iC + (g3d0Var == null ? 0 : g3d0Var.hashCode())) * 31);
    }

    public /* synthetic */ dr11(String str, Set set, g3d0 g3d0Var) {
        this(str, set, g3d0Var, hqz0.a);
    }
}
