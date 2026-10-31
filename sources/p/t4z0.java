package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t4z0 extends ajo1 {
    public final List d;
    public final int e;

    public t4z0(List list, int i) {
        this.d = list;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4z0)) {
            return false;
        }
        t4z0 t4z0Var = (t4z0) obj;
        return this.d.equals(t4z0Var.d) && this.e == t4z0Var.e;
    }

    public final int hashCode() {
        return l1d.C(this.e) + (this.d.hashCode() * 31);
    }
}
