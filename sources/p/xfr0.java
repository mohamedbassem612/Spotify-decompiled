package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xfr0 {
    public final Set a;
    public final yfr0 b;

    public xfr0(Set set, yfr0 yfr0Var) {
        this.a = set;
        this.b = yfr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xfr0)) {
            return false;
        }
        xfr0 xfr0Var = (xfr0) obj;
        return this.a.equals(xfr0Var.a) && this.b.equals(xfr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
