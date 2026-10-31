package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class j0k0 implements k1k0 {
    public final lhg1 a;
    public final lhg1 b;
    public final tv80 c;

    public j0k0(lhg1 lhg1Var, lhg1 lhg1Var2, tv80 tv80Var) {
        this.a = lhg1Var;
        this.b = lhg1Var2;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0k0)) {
            return false;
        }
        j0k0 j0k0Var = (j0k0) obj;
        return u890.j(this.a, j0k0Var.a) && u890.j(this.b, j0k0Var.b) && u890.j(this.c, j0k0Var.c);
    }

    public final int hashCode() {
        lhg1 lhg1Var = this.a;
        int iHashCode = (this.b.hashCode() + ((lhg1Var == null ? 0 : lhg1Var.hashCode()) * 31)) * 31;
        tv80 tv80Var = this.c;
        return iHashCode + (tv80Var != null ? tv80Var.hashCode() : 0);
    }

    public final String toString() {
        lhg1 lhg1Var = this.a;
        return cy30.p("DuplicateMix(currentTransition=", lhg1Var != null ? lhg1Var.b() : null, ", autoTransition=", this.b.b(), ")");
    }
}
