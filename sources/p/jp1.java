package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jp1 implements cq1 {
    public final Set a;
    public final Set b;

    public jp1(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp1)) {
            return false;
        }
        jp1 jp1Var = (jp1) obj;
        return u890.j(this.a, jp1Var.a) && u890.j(this.b, jp1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
