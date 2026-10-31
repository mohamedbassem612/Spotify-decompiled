package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sa0 implements k650 {
    public final l0l a;
    public final kx7 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public sa0(l0l l0lVar, kx7 kx7Var, boolean z, boolean z2, boolean z3) {
        this.a = l0lVar;
        this.b = kx7Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    @Override // p.k650
    public final boolean a() {
        return this.e;
    }

    @Override // p.k650
    public final kx7 b() {
        return this.b;
    }

    @Override // p.k650
    public final l0l c() {
        return this.a;
    }

    @Override // p.k650
    public final boolean d() {
        return this.c;
    }

    @Override // p.k650
    public final boolean e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa0)) {
            return false;
        }
        sa0 sa0Var = (sa0) obj;
        return this.a.equals(sa0Var.a) && u890.j(this.b, sa0Var.b) && this.c == sa0Var.c && this.d == sa0Var.d && this.e == sa0Var.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        kx7 kx7Var = this.b;
        return Boolean.hashCode(this.e) + xcg1.g(xcg1.g((iHashCode + (kx7Var == null ? 0 : kx7Var.hashCode())) * 31, 31, this.c), 31, this.d);
    }
}
