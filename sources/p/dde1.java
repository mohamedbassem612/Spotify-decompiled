package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dde1 {
    public final Set a;
    public final Set b;

    public dde1(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dde1)) {
            return false;
        }
        dde1 dde1Var = (dde1) obj;
        return u890.j(this.a, dde1Var.a) && u890.j(this.b, dde1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
