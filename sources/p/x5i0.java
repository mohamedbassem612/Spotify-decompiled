package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x5i0 {
    public final wzd1 a;
    public final long b;
    public final long c;
    public final long d;
    public final sm51 e;
    public final zge1 f;
    public final o6i0 g;
    public final boolean h;
    public final String i;
    public final boolean j;
    public final long k;
    public final long l;

    public x5i0(wzd1 wzd1Var, long j, long j2, long j3, sm51 sm51Var, zge1 zge1Var, o6i0 o6i0Var, boolean z, String str, boolean z2, long j4, long j5) {
        this.a = wzd1Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = sm51Var;
        this.f = zge1Var;
        this.g = o6i0Var;
        this.h = z;
        this.i = str;
        this.j = z2;
        this.k = j4;
        this.l = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5i0)) {
            return false;
        }
        x5i0 x5i0Var = (x5i0) obj;
        return u890.j(this.a, x5i0Var.a) && this.b == x5i0Var.b && this.c == x5i0Var.c && this.d == x5i0Var.d && u890.j(this.e, x5i0Var.e) && u890.j(this.f, x5i0Var.f) && this.g == x5i0Var.g && this.h == x5i0Var.h && u890.j(this.i, x5i0Var.i) && this.j == x5i0Var.j && this.k == x5i0Var.k && this.l == x5i0Var.l;
    }

    public final int hashCode() {
        wzd1 wzd1Var = this.a;
        int iF = cy30.f(cy30.f(cy30.f((wzd1Var == null ? 0 : wzd1Var.hashCode()) * 31, this.b, 31), this.c, 31), this.d, 31);
        sm51 sm51Var = this.e;
        int iHashCode = (iF + (sm51Var == null ? 0 : sm51Var.hashCode())) * 31;
        zge1 zge1Var = this.f;
        int iG = xcg1.g((this.g.hashCode() + ((iHashCode + (zge1Var == null ? 0 : zge1Var.hashCode())) * 31)) * 31, 31, this.h);
        String str = this.i;
        return Long.hashCode(this.l) + cy30.f(xcg1.g((iG + (str != null ? str.hashCode() : 0)) * 31, 31, this.j), this.k, 31);
    }
}
