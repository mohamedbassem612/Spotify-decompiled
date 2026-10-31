package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class k3t {
    public final List a;
    public final nsn0 b;

    public k3t(List list, nsn0 nsn0Var) {
        this.a = list;
        this.b = nsn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3t)) {
            return false;
        }
        k3t k3tVar = (k3t) obj;
        return this.a.equals(k3tVar.a) && u890.j(this.b, k3tVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        nsn0 nsn0Var = this.b;
        return iHashCode + (nsn0Var == null ? 0 : nsn0Var.hashCode());
    }
}
