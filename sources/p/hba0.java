package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hba0 {
    public final qo90 a;
    public final xea0 b;
    public final boolean c;

    public hba0(qo90 qo90Var, xea0 xea0Var, boolean z) {
        this.a = qo90Var;
        this.b = xea0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hba0)) {
            return false;
        }
        hba0 hba0Var = (hba0) obj;
        return u890.j(this.a, hba0Var.a) && this.b == hba0Var.b && this.c == hba0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
