package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zbw0 implements pcw0 {
    public final lsm0 a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final tv80 f;
    public final boolean g;
    public final long h;

    public /* synthetic */ zbw0(lsm0 lsm0Var, String str, String str2, long j, long j2, tv80 tv80Var, boolean z, int i) {
        this(lsm0Var, str, str2, j, (i & 16) != 0 ? 0L : j2, tv80Var, z, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbw0)) {
            return false;
        }
        zbw0 zbw0Var = (zbw0) obj;
        return u890.j(this.a, zbw0Var.a) && u890.j(this.b, zbw0Var.b) && u890.j(this.c, zbw0Var.c) && this.d == zbw0Var.d && this.e == zbw0Var.e && u890.j(this.f, zbw0Var.f) && this.g == zbw0Var.g && this.h == zbw0Var.h;
    }

    public final int hashCode() {
        int iF = cy30.f(cy30.f(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31), this.e, 31);
        tv80 tv80Var = this.f;
        return Long.hashCode(this.h) + xcg1.g((iF + (tv80Var == null ? 0 : tv80Var.hashCode())) * 31, 31, this.g);
    }

    public zbw0(lsm0 lsm0Var, String str, String str2, long j, long j2, tv80 tv80Var, boolean z, long j3) {
        this.a = lsm0Var;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = j2;
        this.f = tv80Var;
        this.g = z;
        this.h = j3;
    }
}
