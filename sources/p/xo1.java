package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xo1 implements cq1 {
    public final Set a;
    public final Set b;

    public xo1(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xo1)) {
            return false;
        }
        xo1 xo1Var = (xo1) obj;
        return u890.j(this.a, xo1Var.a) && u890.j(this.b, xo1Var.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + gvg.c(this.a.hashCode() * 31, 31, this.b);
    }
}
