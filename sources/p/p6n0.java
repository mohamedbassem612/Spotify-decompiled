package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p6n0 extends bs51 {
    public final ela1 b;
    public final u771 c;
    public final int d;
    public final boolean e;

    public p6n0(ela1 ela1Var, u771 u771Var, int i, boolean z) {
        this.b = ela1Var;
        this.c = u771Var;
        this.d = i;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6n0)) {
            return false;
        }
        p6n0 p6n0Var = (p6n0) obj;
        return u890.j(this.b, p6n0Var.b) && u890.j(this.c, p6n0Var.c) && this.d == p6n0Var.d && this.e == p6n0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ab80.k(this.d, cfm0.g(this.c, this.b.hashCode() * 31, 31), 31);
    }
}
