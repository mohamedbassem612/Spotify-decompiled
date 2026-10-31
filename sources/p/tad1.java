package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tad1 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final long m;
    public final long n;
    public final long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f33p;

    public tad1(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
        this.k = j11;
        this.l = j12;
        this.m = j13;
        this.n = j14;
        this.o = j15;
        this.f33p = j16;
    }

    public final long a() {
        return this.c;
    }

    public final long b() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof tad1)) {
            return false;
        }
        tad1 tad1Var = (tad1) obj;
        long j = tad1Var.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && z4h1.b(this.b, tad1Var.b) && z4h1.b(this.c, tad1Var.c) && z4h1.b(this.d, tad1Var.d) && z4h1.b(this.e, tad1Var.e) && z4h1.b(this.f, tad1Var.f) && z4h1.b(this.g, tad1Var.g) && z4h1.b(this.h, tad1Var.h) && z4h1.b(this.i, tad1Var.i) && z4h1.b(this.j, tad1Var.j) && z4h1.b(this.k, tad1Var.k) && z4h1.b(this.l, tad1Var.l) && z4h1.b(this.m, tad1Var.m) && z4h1.b(this.n, tad1Var.n) && z4h1.b(this.o, tad1Var.o) && z4h1.b(this.f33p, tad1Var.f33p);
    }

    public final int hashCode() {
        int i = u7h.l;
        return Long.hashCode(this.f33p) + cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31), this.h, 31), this.i, 31), this.j, 31), this.k, 31), this.l, 31), this.m, 31), this.n, 31), this.o, 31);
    }

    public /* synthetic */ tad1(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, int i) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16);
    }
}
