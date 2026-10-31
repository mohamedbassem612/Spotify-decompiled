package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lu01 {
    public final qxc0 a;
    public final List b;

    public lu01(List list, qxc0 qxc0Var) {
        this.a = qxc0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu01)) {
            return false;
        }
        lu01 lu01Var = (lu01) obj;
        return this.a.equals(lu01Var.a) && this.b.equals(lu01Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
