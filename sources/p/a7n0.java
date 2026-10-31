package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class a7n0 extends c7n0 {
    public final ela1 a;
    public final u771 b;
    public final int c;

    public a7n0(ela1 ela1Var, u771 u771Var, int i) {
        this.a = ela1Var;
        this.b = u771Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7n0)) {
            return false;
        }
        a7n0 a7n0Var = (a7n0) obj;
        return u890.j(this.a, a7n0Var.a) && u890.j(this.b, a7n0Var.b) && this.c == a7n0Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + cfm0.g(this.b, this.a.hashCode() * 31, 31);
    }
}
