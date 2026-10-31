package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dig1 {
    public final go1 a;
    public final Set b;

    public dig1(go1 go1Var, Set set) {
        this.a = go1Var;
        this.b = set;
    }

    public final Set a() {
        return this.b;
    }

    public final go1 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dig1)) {
            return false;
        }
        dig1 dig1Var = (dig1) obj;
        return u890.j(this.a, dig1Var.a) && u890.j(this.b, dig1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
