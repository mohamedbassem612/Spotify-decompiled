package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class oot0 {
    public final long a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public final hu7 e;
    public final tne1 f;
    public final boolean g;

    public /* synthetic */ oot0(long j, long j2, boolean z, boolean z2, hu7 hu7Var, tne1 tne1Var, boolean z3, int i) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? true : z, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? null : hu7Var, (i & 64) != 0 ? null : tne1Var, (i & 128) != 0 ? true : z3);
    }

    public static oot0 a(oot0 oot0Var) {
        long j = oot0Var.a;
        long j2 = oot0Var.b;
        boolean z = oot0Var.d;
        hu7 hu7Var = oot0Var.e;
        oot0Var.getClass();
        tne1 tne1Var = oot0Var.f;
        boolean z2 = oot0Var.g;
        oot0Var.getClass();
        return new oot0(j, j2, true, z, hu7Var, tne1Var, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oot0)) {
            return false;
        }
        oot0 oot0Var = (oot0) obj;
        return this.a == oot0Var.a && this.b == oot0Var.b && this.c == oot0Var.c && this.d == oot0Var.d && u890.j(this.e, oot0Var.e) && u890.j(this.f, oot0Var.f) && this.g == oot0Var.g;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), 31, this.c), 31, this.d);
        hu7 hu7Var = this.e;
        int iHashCode = (iG + (hu7Var == null ? 0 : hu7Var.hashCode())) * 961;
        tne1 tne1Var = this.f;
        return Boolean.hashCode(this.g) + ((iHashCode + (tne1Var != null ? tne1Var.hashCode() : 0)) * 31);
    }

    public oot0(long j, long j2, boolean z, boolean z2, hu7 hu7Var, tne1 tne1Var, boolean z3) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = z2;
        this.e = hu7Var;
        this.f = tne1Var;
        this.g = z3;
    }
}
