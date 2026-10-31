package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dhz0 {
    public final iec a;
    public final vu30 b;
    public final u7h c;
    public final Integer d;

    public dhz0(iec iecVar, vu30 vu30Var, u7h u7hVar, Integer num) {
        this.a = iecVar;
        this.b = vu30Var;
        this.c = u7hVar;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhz0)) {
            return false;
        }
        dhz0 dhz0Var = (dhz0) obj;
        return this.a.equals(dhz0Var.a) && this.b.equals(dhz0Var.b) && u890.j(this.c, dhz0Var.c) && u890.j(this.d, dhz0Var.d);
    }

    public final int hashCode() {
        int iG = hrt.g(this.a.hashCode() * 31, 31, this.b);
        u7h u7hVar = this.c;
        int iHashCode = (iG + (u7hVar == null ? 0 : Long.hashCode(u7hVar.a))) * 31;
        Integer num = this.d;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }
}
