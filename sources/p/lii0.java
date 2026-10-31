package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lii0 {
    public final ioj0 a;
    public final Set b;

    public lii0(ioj0 ioj0Var, Set set) {
        this.a = ioj0Var;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lii0)) {
            return false;
        }
        lii0 lii0Var = (lii0) obj;
        return u890.j(this.a, lii0Var.a) && u890.j(this.b, lii0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }
}
