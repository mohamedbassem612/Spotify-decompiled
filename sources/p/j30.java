package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j30 {
    public final ioj0 a;
    public final Set b;

    public j30(ioj0 ioj0Var, Set set) {
        this.a = ioj0Var;
        this.b = set;
    }

    public final Set a() {
        return this.b;
    }

    public final ioj0 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j30)) {
            return false;
        }
        j30 j30Var = (j30) obj;
        return u890.j(this.a, j30Var.a) && u890.j(this.b, j30Var.b);
    }

    public final int hashCode() {
        ioj0 ioj0Var = this.a;
        return this.b.hashCode() + ((ioj0Var == null ? 0 : ioj0Var.a.hashCode()) * 31);
    }
}
