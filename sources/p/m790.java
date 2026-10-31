package p;

import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class m790 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final long l;
    public final long m;
    public final boolean n;
    public final long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f72p;

    public m790(boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5, long j, boolean z6, boolean z7, boolean z8, boolean z9, long j2, long j3, boolean z10, long j4, long j5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
        this.e = z4;
        this.f = z5;
        this.g = j;
        this.h = z6;
        this.i = z7;
        this.j = z8;
        this.k = z9;
        this.l = j2;
        this.m = j3;
        this.n = z10;
        this.o = j4;
        this.f72p = j5;
    }

    public static m790 a(m790 m790Var, boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5, long j, boolean z6, boolean z7, boolean z8, boolean z9, long j2, long j3, boolean z10, long j4, long j5, int i2) {
        boolean z11 = (i2 & 1) != 0 ? m790Var.a : z;
        boolean z12 = (i2 & 2) != 0 ? m790Var.b : z2;
        boolean z13 = (i2 & 4) != 0 ? m790Var.c : z3;
        int i3 = (i2 & 8) != 0 ? m790Var.d : i;
        boolean z14 = (i2 & 16) != 0 ? m790Var.e : z4;
        boolean z15 = (i2 & 32) != 0 ? m790Var.f : z5;
        long j6 = (i2 & 64) != 0 ? m790Var.g : j;
        boolean z16 = (i2 & 128) != 0 ? m790Var.h : z6;
        boolean z17 = (i2 & 256) != 0 ? m790Var.i : z7;
        boolean z18 = (i2 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 ? m790Var.j : z8;
        boolean z19 = (i2 & 1024) != 0 ? m790Var.k : z9;
        long j7 = (i2 & 2048) != 0 ? m790Var.l : j2;
        boolean z20 = z11;
        boolean z21 = z12;
        long j8 = (i2 & 4096) != 0 ? m790Var.m : j3;
        boolean z22 = (i2 & 8192) != 0 ? m790Var.n : z10;
        long j9 = (i2 & 16384) != 0 ? m790Var.o : j4;
        long j10 = (i2 & 32768) != 0 ? m790Var.f72p : j5;
        m790Var.getClass();
        return new m790(z20, z21, z13, i3, z14, z15, j6, z16, z17, z18, z19, j7, j8, z22, j9, j10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m790)) {
            return false;
        }
        m790 m790Var = (m790) obj;
        return this.a == m790Var.a && this.b == m790Var.b && this.c == m790Var.c && this.d == m790Var.d && this.e == m790Var.e && this.f == m790Var.f && this.g == m790Var.g && this.h == m790Var.h && this.i == m790Var.i && this.j == m790Var.j && this.k == m790Var.k && this.l == m790Var.l && this.m == m790Var.m && this.n == m790Var.n && this.o == m790Var.o && this.f72p == m790Var.f72p;
    }

    public final int hashCode() {
        return Long.hashCode(this.f72p) + cy30.f(xcg1.g(cy30.f(cy30.f(xcg1.g(xcg1.g(xcg1.g(xcg1.g(cy30.f(xcg1.g(xcg1.g(kaa0.f(this.d, xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f), this.g, 31), 31, this.h), 31, this.i), 31, this.j), 31, this.k), this.l, 31), this.m, 31), 31, this.n), this.o, 31);
    }
}
