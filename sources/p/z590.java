package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z590 {
    public final lsm0 a;
    public final boolean b;
    public final o091 c;
    public final boolean d;
    public final long e;
    public final long f;
    public final float g;
    public final long h;
    public final y1k1 i;

    public z590(lsm0 lsm0Var, boolean z, o091 o091Var, boolean z2, long j, long j2, float f, long j3, y1k1 y1k1Var) {
        this.a = lsm0Var;
        this.b = z;
        this.c = o091Var;
        this.d = z2;
        this.e = j;
        this.f = j2;
        this.g = f;
        this.h = j3;
        this.i = y1k1Var;
    }

    public static z590 a(z590 z590Var, lsm0 lsm0Var, boolean z, o091 o091Var, boolean z2, long j, long j2, float f, long j3, y1k1 y1k1Var, int i) {
        if ((i & 1) != 0) {
            lsm0Var = z590Var.a;
        }
        lsm0 lsm0Var2 = lsm0Var;
        if ((i & 2) != 0) {
            z = z590Var.b;
        }
        boolean z3 = z;
        o091 o091Var2 = (i & 4) != 0 ? z590Var.c : o091Var;
        boolean z4 = (i & 8) != 0 ? z590Var.d : z2;
        long j4 = (i & 16) != 0 ? z590Var.e : j;
        long j5 = (i & 32) != 0 ? z590Var.f : j2;
        float f2 = (i & 64) != 0 ? z590Var.g : f;
        long j6 = (i & 128) != 0 ? z590Var.h : j3;
        y1k1 y1k1Var2 = (i & 256) != 0 ? z590Var.i : y1k1Var;
        z590Var.getClass();
        return new z590(lsm0Var2, z3, o091Var2, z4, j4, j5, f2, j6, y1k1Var2);
    }

    public final lsm0 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z590)) {
            return false;
        }
        z590 z590Var = (z590) obj;
        return u890.j(this.a, z590Var.a) && this.b == z590Var.b && this.c.equals(z590Var.c) && this.d == z590Var.d && this.e == z590Var.e && this.f == z590Var.f && Float.compare(this.g, z590Var.g) == 0 && this.h == z590Var.h && u890.j(this.i, z590Var.i);
    }

    public final int hashCode() {
        lsm0 lsm0Var = this.a;
        int iF = cy30.f(x0d.f(cy30.f(cy30.f(xcg1.g((this.c.hashCode() + xcg1.g((lsm0Var == null ? 0 : lsm0Var.hashCode()) * 31, 31, this.b)) * 31, 31, this.d), this.e, 31), this.f, 31), 31, this.g), this.h, 31);
        y1k1 y1k1Var = this.i;
        return iF + (y1k1Var != null ? y1k1Var.hashCode() : 0);
    }
}
