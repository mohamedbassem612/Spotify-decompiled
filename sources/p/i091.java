package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class i091 {
    public final lsm0 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final float f;
    public final boolean g;
    public final o091 h;
    public final p091 i;

    public i091(lsm0 lsm0Var, int i, long j, long j2, long j3, float f, boolean z, o091 o091Var, p091 p091Var) {
        this.a = lsm0Var;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = f;
        this.g = z;
        this.h = o091Var;
        this.i = p091Var;
    }

    public static i091 a(i091 i091Var, long j, float f, boolean z, int i) {
        lsm0 lsm0Var = i091Var.a;
        int i2 = i091Var.b;
        long j2 = i091Var.c;
        if ((i & 8) != 0) {
            j = i091Var.d;
        }
        long j3 = j;
        long j4 = i091Var.e;
        float f2 = (i & 32) != 0 ? i091Var.f : f;
        boolean z2 = (i & 64) != 0 ? i091Var.g : z;
        o091 o091Var = i091Var.h;
        p091 p091Var = i091Var.i;
        i091Var.getClass();
        return new i091(lsm0Var, i2, j2, j3, j4, f2, z2, o091Var, p091Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i091)) {
            return false;
        }
        i091 i091Var = (i091) obj;
        return u890.j(this.a, i091Var.a) && this.b == i091Var.b && this.c == i091Var.c && this.d == i091Var.d && this.e == i091Var.e && Float.compare(this.f, i091Var.f) == 0 && this.g == i091Var.g && u890.j(this.h, i091Var.h) && u890.j(this.i, i091Var.i);
    }

    public final int hashCode() {
        lsm0 lsm0Var = this.a;
        int iHashCode = (lsm0Var == null ? 0 : lsm0Var.hashCode()) * 31;
        int i = this.b;
        int iHashCode2 = (this.h.hashCode() + xcg1.g(x0d.f(cy30.f(cy30.f(cy30.f((iHashCode + (i == 0 ? 0 : l1d.C(i))) * 31, this.c, 31), this.d, 31), this.e, 31), 31, this.f), 31, this.g)) * 31;
        p091 p091Var = this.i;
        return iHashCode2 + (p091Var != null ? p091Var.hashCode() : 0);
    }

    public /* synthetic */ i091() {
        this(null, 0, 0L, 0L, 0L, 0.0f, true, l091.a, null);
    }
}
