package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z24 {
    public final ioj0 a;
    public final Set b;

    public z24(ioj0 ioj0Var, Set set) {
        this.a = ioj0Var;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z24)) {
            return false;
        }
        z24 z24Var = (z24) obj;
        return u890.j(this.a, z24Var.a) && u890.j(this.b, z24Var.b);
    }

    public final int hashCode() {
        ioj0 ioj0Var = this.a;
        return this.b.hashCode() + ((ioj0Var == null ? 0 : ioj0Var.a.hashCode()) * 31);
    }
}
