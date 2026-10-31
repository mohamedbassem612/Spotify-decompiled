package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class v7q0 {
    public final s1m1 a;
    public final Set b;

    public v7q0(s1m1 s1m1Var, Set set) {
        this.a = s1m1Var;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7q0)) {
            return false;
        }
        v7q0 v7q0Var = (v7q0) obj;
        return u890.j(this.a, v7q0Var.a) && u890.j(this.b, v7q0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public /* synthetic */ v7q0(s1m1 s1m1Var) {
        this(s1m1Var, w7x.a);
    }
}
