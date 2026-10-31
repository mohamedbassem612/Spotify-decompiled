package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k4d0 implements l4d0 {
    public final ddd1 a;
    public final Set b;

    public k4d0(ddd1 ddd1Var, Set set) {
        this.a = ddd1Var;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4d0)) {
            return false;
        }
        k4d0 k4d0Var = (k4d0) obj;
        return this.a == k4d0Var.a && this.b.equals(k4d0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
