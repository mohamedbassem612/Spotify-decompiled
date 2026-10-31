package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jlz0 {
    public static final jlz0 i = new jlz0(z4p1.g(4278845733L), z4p1.g(4282060727L), z4p1.g(4291818858L), z4p1.g(4294942357L), z4p1.g(4289704447L), z4p1.g(4280722176L), z4p1.g(4294944512L), z4p1.g(4291887655L));
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    public jlz0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlz0)) {
            return false;
        }
        jlz0 jlz0Var = (jlz0) obj;
        long j = jlz0Var.a;
        int i2 = u7h.l;
        return z4h1.b(this.a, j) && z4h1.b(this.b, jlz0Var.b) && z4h1.b(this.c, jlz0Var.c) && z4h1.b(this.d, jlz0Var.d) && z4h1.b(this.e, jlz0Var.e) && z4h1.b(this.f, jlz0Var.f) && z4h1.b(this.g, jlz0Var.g) && z4h1.b(this.h, jlz0Var.h);
    }

    public final int hashCode() {
        int i2 = u7h.l;
        return Long.hashCode(this.h) + cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31);
    }
}
