package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rk90 {
    public final maa a;
    public final vu30 b;
    public final xu30 c;

    public rk90(maa maaVar, vu30 vu30Var, xu30 xu30Var) {
        this.a = maaVar;
        this.b = vu30Var;
        this.c = xu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rk90)) {
            return false;
        }
        rk90 rk90Var = (rk90) obj;
        return this.a.equals(rk90Var.a) && u890.j(this.b, rk90Var.b) && u890.j(this.c, rk90Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        vu30 vu30Var = this.b;
        return this.c.hashCode() + ((iHashCode + (vu30Var == null ? 0 : vu30Var.hashCode())) * 31);
    }
}
