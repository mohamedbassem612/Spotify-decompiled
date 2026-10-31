package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kqz0 {
    public final float a;
    public final int b;
    public final t2k1 c;
    public final String d;
    public final long e;
    public final long f;
    public final boolean g;
    public final boolean h;
    public final long i;
    public final long j;

    public kqz0(float f, int i, t2k1 t2k1Var, String str, long j, long j2, boolean z) {
        this.a = f;
        this.b = i;
        this.c = t2k1Var;
        this.d = str;
        this.e = j;
        this.f = j2;
        this.g = z;
        boolean z2 = j2 != -1;
        this.h = z2;
        long j3 = z2 ? j2 - j : 0L;
        this.i = j3;
        this.j = f > 0.0f ? (long) (j3 / f) : 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kqz0)) {
            return false;
        }
        kqz0 kqz0Var = (kqz0) obj;
        return Float.compare(this.a, kqz0Var.a) == 0 && this.b == kqz0Var.b && u890.j(this.c, kqz0Var.c) && u890.j(this.d, kqz0Var.d) && this.e == kqz0Var.e && this.f == kqz0Var.f && this.g == kqz0Var.g;
    }

    public final int hashCode() {
        int iK = ab80.k(this.b, Float.hashCode(this.a) * 31, 31);
        t2k1 t2k1Var = this.c;
        return Boolean.hashCode(this.g) + cy30.f(cy30.f(cy30.d((iK + (t2k1Var == null ? 0 : t2k1Var.hashCode())) * 31, 31, this.d), this.e, 31), this.f, 31);
    }

    public /* synthetic */ kqz0(float f, int i, t2k1 t2k1Var, String str, long j, boolean z) {
        this(f, i, t2k1Var, str, j, -1L, z);
    }
}
