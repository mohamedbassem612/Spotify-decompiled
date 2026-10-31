package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class giz0 {
    public final gfi1 a;
    public final jlz0 b;
    public final ilz0 c;

    public giz0(gfi1 gfi1Var, jlz0 jlz0Var, ilz0 ilz0Var) {
        this.a = gfi1Var;
        this.b = jlz0Var;
        this.c = ilz0Var;
    }

    public final gfi1 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof giz0)) {
            return false;
        }
        giz0 giz0Var = (giz0) obj;
        return u890.j(this.a, giz0Var.a) && u890.j(this.b, giz0Var.b) && u890.j(this.c, giz0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ilz0 ilz0Var = this.c;
        return iHashCode + (ilz0Var == null ? 0 : ilz0Var.hashCode());
    }
}
