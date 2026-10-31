package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cnd {
    public final hpc1 a;
    public final List b;

    public cnd(List list, hpc1 hpc1Var) {
        this.a = hpc1Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnd)) {
            return false;
        }
        cnd cndVar = (cnd) obj;
        return u890.j(this.a, cndVar.a) && u890.j(this.b, cndVar.b);
    }

    public final int hashCode() {
        hpc1 hpc1Var = this.a;
        return this.b.hashCode() + ((hpc1Var == null ? 0 : hpc1Var.hashCode()) * 31);
    }
}
