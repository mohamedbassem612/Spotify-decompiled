package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pp91 {
    public final nn61 a;
    public final qp91 b;
    public final boolean c;
    public final int d;
    public final ywv0 e;

    public pp91(nn61 nn61Var, qp91 qp91Var, int i, ywv0 ywv0Var, int i2) {
        nn61Var = (i2 & 1) != 0 ? null : nn61Var;
        qp91Var = (i2 & 2) != 0 ? null : qp91Var;
        boolean z = (i2 & 8) != 0;
        i = (i2 & 16) != 0 ? 4 : i;
        ywv0Var = (i2 & 32) != 0 ? null : ywv0Var;
        this.a = nn61Var;
        this.b = qp91Var;
        this.c = z;
        this.d = i;
        this.e = ywv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pp91)) {
            return false;
        }
        pp91 pp91Var = (pp91) obj;
        return u890.j(this.a, pp91Var.a) && u890.j(this.b, pp91Var.b) && this.c == pp91Var.c && this.d == pp91Var.d && u890.j(this.e, pp91Var.e);
    }

    public final int hashCode() {
        nn61 nn61Var = this.a;
        int iHashCode = (nn61Var == null ? 0 : nn61Var.hashCode()) * 31;
        qp91 qp91Var = this.b;
        int iK = ab80.k(this.d, xcg1.g((iHashCode + (qp91Var == null ? 0 : qp91Var.hashCode())) * 961, 31, this.c), 31);
        ywv0 ywv0Var = this.e;
        return (iK + (ywv0Var != null ? ywv0Var.hashCode() : 0)) * 31;
    }
}
