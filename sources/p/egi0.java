package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class egi0 {
    public final ioj0 a;
    public final Set b;

    public egi0(ioj0 ioj0Var, Set set) {
        this.a = ioj0Var;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egi0)) {
            return false;
        }
        egi0 egi0Var = (egi0) obj;
        return u890.j(this.a, egi0Var.a) && u890.j(this.b, egi0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public /* synthetic */ egi0(ioj0 ioj0Var) {
        this(ioj0Var, w7x.a);
    }
}
