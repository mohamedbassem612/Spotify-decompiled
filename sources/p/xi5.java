package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xi5 implements k650 {
    public final l0l a;
    public final kx7 b;
    public final boolean c;
    public final boolean d;

    public xi5(l0l l0lVar, kx7 kx7Var, boolean z, boolean z2) {
        this.a = l0lVar;
        this.b = kx7Var;
        this.c = z;
        this.d = z2;
    }

    @Override // p.k650
    public final boolean a() {
        return true;
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
        if (!(obj instanceof xi5)) {
            return false;
        }
        xi5 xi5Var = (xi5) obj;
        return this.a.equals(xi5Var.a) && u890.j(this.b, xi5Var.b) && this.c == xi5Var.c && this.d == xi5Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        kx7 kx7Var = this.b;
        return Boolean.hashCode(this.d) + xcg1.g((iHashCode + (kx7Var == null ? 0 : kx7Var.hashCode())) * 31, 31, this.c);
    }
}
