package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pcc0 {
    public final Set a;
    public final qxc0 b;

    public pcc0(Set set, qxc0 qxc0Var) {
        this.a = set;
        this.b = qxc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pcc0)) {
            return false;
        }
        pcc0 pcc0Var = (pcc0) obj;
        return this.a.equals(pcc0Var.a) && this.b.equals(pcc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
