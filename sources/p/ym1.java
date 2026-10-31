package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ym1 {
    public final qxc0 a;
    public final qp31 b;
    public final boolean c;

    public ym1(qxc0 qxc0Var, qp31 qp31Var, boolean z) {
        this.a = qxc0Var;
        this.b = qp31Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym1)) {
            return false;
        }
        ym1 ym1Var = (ym1) obj;
        return this.a.equals(ym1Var.a) && u890.j(this.b, ym1Var.b) && this.c == ym1Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        qp31 qp31Var = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (qp31Var == null ? 0 : Boolean.hashCode(qp31Var.a))) * 31);
    }
}
