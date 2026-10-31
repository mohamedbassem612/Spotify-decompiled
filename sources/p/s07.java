package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class s07 extends o17 {
    public final g07 a;
    public final rk70 b;
    public final y5t0 c;

    public s07(g07 g07Var, rk70 rk70Var) {
        this.a = g07Var;
        this.b = rk70Var;
        this.c = rk70Var != null ? new y5t0(rk70Var) : null;
    }

    @Override // p.o17
    public final g07 a() {
        return this.a;
    }

    @Override // p.o17
    public final m5n1 b() {
        return this.c;
    }

    @Override // p.o17
    public final boolean c() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s07)) {
            return false;
        }
        s07 s07Var = (s07) obj;
        return this.a.equals(s07Var.a) && u890.j(this.b, s07Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        rk70 rk70Var = this.b;
        return iHashCode + (rk70Var == null ? 0 : rk70Var.hashCode());
    }
}
