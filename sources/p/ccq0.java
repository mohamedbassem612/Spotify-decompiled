package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ccq0 implements jcq0 {
    public final Set a;
    public final ept b;

    public ccq0(Set set, ept eptVar) {
        this.a = set;
        this.b = eptVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccq0)) {
            return false;
        }
        ccq0 ccq0Var = (ccq0) obj;
        return this.a.equals(ccq0Var.a) && u890.j(this.b, ccq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
