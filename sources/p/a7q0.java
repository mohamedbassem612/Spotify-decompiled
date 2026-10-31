package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class a7q0 implements ez00 {
    public final w6q0 a;
    public final Long b;
    public final long c;
    public final y6q0 d;
    public final Long e;
    public final z6q0 f;

    public a7q0(w6q0 w6q0Var, Long l, long j, y6q0 y6q0Var, Long l2, z6q0 z6q0Var) {
        this.a = w6q0Var;
        this.b = l;
        this.c = j;
        this.d = y6q0Var;
        this.e = l2;
        this.f = z6q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7q0)) {
            return false;
        }
        a7q0 a7q0Var = (a7q0) obj;
        return u890.j(this.a, a7q0Var.a) && u890.j(this.b, a7q0Var.b) && this.c == a7q0Var.c && u890.j(this.d, a7q0Var.d) && u890.j(this.e, a7q0Var.e) && u890.j(this.f, a7q0Var.f);
    }

    public final int hashCode() {
        w6q0 w6q0Var = this.a;
        int iHashCode = (w6q0Var == null ? 0 : w6q0Var.hashCode()) * 31;
        Long l = this.b;
        int iF = cy30.f((iHashCode + (l == null ? 0 : l.hashCode())) * 31, this.c, 31);
        y6q0 y6q0Var = this.d;
        int iHashCode2 = (iF + (y6q0Var == null ? 0 : y6q0Var.hashCode())) * 31;
        Long l2 = this.e;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        z6q0 z6q0Var = this.f;
        return iHashCode3 + (z6q0Var != null ? z6q0Var.hashCode() : 0);
    }
}
