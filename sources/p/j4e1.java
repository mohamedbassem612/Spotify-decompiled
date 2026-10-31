package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class j4e1 {
    public final long A;
    public final long B;
    public final long C;
    public final long D;
    public final long E;
    public final long F;
    public final long G;
    public final long H;
    public final long I;
    public final long J;
    public final long K;
    public final long L;
    public final long M;
    public final long N;
    public final long O;
    public final long P;
    public final long Q;
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
    public final rce1 k;
    public final long l;
    public final long m;
    public final long n;
    public final long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f15p;
    public final long q;
    public final long r;
    public final long s;
    public final long t;
    public final long u;
    public final long v;
    public final long w;
    public final long x;
    public final long y;
    public final long z;

    public j4e1(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, rce1 rce1Var, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42) {
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
        this.k = rce1Var;
        this.l = j11;
        this.m = j12;
        this.n = j13;
        this.o = j14;
        this.f15p = j15;
        this.q = j16;
        this.r = j17;
        this.s = j18;
        this.t = j19;
        this.u = j20;
        this.v = j21;
        this.w = j22;
        this.x = j23;
        this.y = j24;
        this.z = j25;
        this.A = j26;
        this.B = j27;
        this.C = j28;
        this.D = j29;
        this.E = j30;
        this.F = j31;
        this.G = j32;
        this.H = j33;
        this.I = j34;
        this.J = j35;
        this.K = j36;
        this.L = j37;
        this.M = j38;
        this.N = j39;
        this.O = j40;
        this.P = j41;
        this.Q = j42;
    }

    public final j4e1 a(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, rce1 rce1Var, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42) {
        return new j4e1(j != 16 ? j : this.a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d, j5 != 16 ? j5 : this.e, j6 != 16 ? j6 : this.f, j7 != 16 ? j7 : this.g, j8 != r1 ? j8 : this.h, j9 != r1 ? j9 : this.i, j10 != r1 ? j10 : this.j, rce1Var == null ? this.k : rce1Var, j11 != 16 ? j11 : this.l, j12 != 16 ? j12 : this.m, j13 != 16 ? j13 : this.n, j14 != 16 ? j14 : this.o, j15 != 16 ? j15 : this.f15p, j16 != 16 ? j16 : this.q, j17 != 16 ? j17 : this.r, j18 != 16 ? j18 : this.s, j19 != 16 ? j19 : this.t, j20 != 16 ? j20 : this.u, j21 != 16 ? j21 : this.v, j22 != 16 ? j22 : this.w, j23 != 16 ? j23 : this.x, j24 != 16 ? j24 : this.y, j25 != 16 ? j25 : this.z, j26 != 16 ? j26 : this.A, j27 != 16 ? j27 : this.B, j28 != 16 ? j28 : this.C, j29 != 16 ? j29 : this.D, j30 != 16 ? j30 : this.E, j31 != 16 ? j31 : this.F, j32 != 16 ? j32 : this.G, j33 != 16 ? j33 : this.H, j34 != 16 ? j34 : this.I, j35 != 16 ? j35 : this.J, j36 != 16 ? j36 : this.K, j37 != 16 ? j37 : this.L, j38 != 16 ? j38 : this.M, j39 != 16 ? j39 : this.N, j40 != 16 ? j40 : this.O, j41 != 16 ? j41 : this.P, j42 != 16 ? j42 : this.Q);
    }

    public final long c(boolean z, boolean z2, boolean z3) {
        if (!z) {
            return this.n;
        }
        if (z2) {
            return this.o;
        }
        return z3 ? this.l : this.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j4e1)) {
            return false;
        }
        j4e1 j4e1Var = (j4e1) obj;
        long j = j4e1Var.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && z4h1.b(this.b, j4e1Var.b) && z4h1.b(this.c, j4e1Var.c) && z4h1.b(this.d, j4e1Var.d) && z4h1.b(this.e, j4e1Var.e) && z4h1.b(this.f, j4e1Var.f) && z4h1.b(this.g, j4e1Var.g) && z4h1.b(this.h, j4e1Var.h) && z4h1.b(this.i, j4e1Var.i) && z4h1.b(this.j, j4e1Var.j) && u890.j(this.k, j4e1Var.k) && z4h1.b(this.l, j4e1Var.l) && z4h1.b(this.m, j4e1Var.m) && z4h1.b(this.n, j4e1Var.n) && z4h1.b(this.o, j4e1Var.o) && z4h1.b(this.f15p, j4e1Var.f15p) && z4h1.b(this.q, j4e1Var.q) && z4h1.b(this.r, j4e1Var.r) && z4h1.b(this.s, j4e1Var.s) && z4h1.b(this.t, j4e1Var.t) && z4h1.b(this.u, j4e1Var.u) && z4h1.b(this.v, j4e1Var.v) && z4h1.b(this.w, j4e1Var.w) && z4h1.b(this.x, j4e1Var.x) && z4h1.b(this.y, j4e1Var.y) && z4h1.b(this.z, j4e1Var.z) && z4h1.b(this.A, j4e1Var.A) && z4h1.b(this.B, j4e1Var.B) && z4h1.b(this.C, j4e1Var.C) && z4h1.b(this.D, j4e1Var.D) && z4h1.b(this.E, j4e1Var.E) && z4h1.b(this.F, j4e1Var.F) && z4h1.b(this.G, j4e1Var.G) && z4h1.b(this.H, j4e1Var.H) && z4h1.b(this.I, j4e1Var.I) && z4h1.b(this.J, j4e1Var.J) && z4h1.b(this.K, j4e1Var.K) && z4h1.b(this.L, j4e1Var.L) && z4h1.b(this.M, j4e1Var.M) && z4h1.b(this.N, j4e1Var.N) && z4h1.b(this.O, j4e1Var.O) && z4h1.b(this.P, j4e1Var.P) && z4h1.b(this.Q, j4e1Var.Q);
    }

    public final int hashCode() {
        int i = u7h.l;
        return Long.hashCode(this.Q) + cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f((this.k.hashCode() + cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31), this.h, 31), this.i, 31), this.j, 31)) * 31, this.l, 31), this.m, 31), this.n, 31), this.o, 31), this.f15p, 31), this.q, 31), this.r, 31), this.s, 31), this.t, 31), this.u, 31), this.v, 31), this.w, 31), this.x, 31), this.y, 31), this.z, 31), this.A, 31), this.B, 31), this.C, 31), this.D, 31), this.E, 31), this.F, 31), this.G, 31), this.H, 31), this.I, 31), this.J, 31), this.K, 31), this.L, 31), this.M, 31), this.N, 31), this.O, 31), this.P, 31);
    }
}
