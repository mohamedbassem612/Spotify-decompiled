package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class y3h1 {
    public final m6m a;
    public final aul b;
    public final xu30 c;
    public final vu30 d;

    public y3h1(m6m m6mVar, aul aulVar, xu30 xu30Var, vu30 vu30Var) {
        this.a = m6mVar;
        this.b = aulVar;
        this.c = xu30Var;
        this.d = vu30Var;
    }

    public static y3h1 a(y3h1 y3h1Var, m6m m6mVar, xu30 xu30Var, vu30 vu30Var, int i) {
        if ((i & 1) != 0) {
            m6mVar = y3h1Var.a;
        }
        aul aulVar = y3h1Var.b;
        if ((i & 4) != 0) {
            xu30Var = y3h1Var.c;
        }
        if ((i & 8) != 0) {
            vu30Var = y3h1Var.d;
        }
        return new y3h1(m6mVar, aulVar, xu30Var, vu30Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3h1)) {
            return false;
        }
        y3h1 y3h1Var = (y3h1) obj;
        return u890.j(this.a, y3h1Var.a) && u890.j(this.b, y3h1Var.b) && u890.j(this.c, y3h1Var.c) && u890.j(this.d, y3h1Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        xu30 xu30Var = this.c;
        int iHashCode2 = (iHashCode + (xu30Var == null ? 0 : xu30Var.hashCode())) * 31;
        vu30 vu30Var = this.d;
        return iHashCode2 + (vu30Var != null ? vu30Var.hashCode() : 0);
    }
}
