package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mp1 implements cq1 {
    public final Set a;
    public final Set b;

    public mp1(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mp1)) {
            return false;
        }
        mp1 mp1Var = (mp1) obj;
        return u890.j(this.a, mp1Var.a) && u890.j(this.b, mp1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
