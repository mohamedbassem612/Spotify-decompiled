package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pdm {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f62p;

    public pdm(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, int i) {
        boolean z14 = (i & 1) != 0 ? false : z;
        boolean z15 = (i & 4) != 0 ? true : z2;
        boolean z16 = (i & 8) != 0 ? true : z3;
        boolean z17 = (i & 16) != 0 ? false : z4;
        boolean z18 = (i & 32) != 0 ? false : z5;
        boolean z19 = (i & 64) != 0 ? false : z6;
        boolean z20 = (i & 128) != 0 ? true : z7;
        boolean z21 = (i & 256) != 0 ? true : z8;
        boolean z22 = (i & 1024) != 0 ? false : z9;
        boolean z23 = (i & 2048) == 0;
        boolean z24 = (i & 4096) != 0 ? false : z10;
        boolean z25 = (i & 16384) != 0 ? false : z11;
        boolean z26 = (i & 32768) != 0;
        boolean z27 = (i & 65536) != 0 ? false : z12;
        boolean z28 = (i & 131072) != 0 ? false : z13;
        this.a = z14;
        this.b = z15;
        this.c = z16;
        this.d = z17;
        this.e = z18;
        this.f = z19;
        this.g = z20;
        this.h = z21;
        this.i = z22;
        this.j = z23;
        this.k = z24;
        this.l = false;
        this.m = z25;
        this.n = z26;
        this.o = z27;
        this.f62p = z28;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdm)) {
            return false;
        }
        pdm pdmVar = (pdm) obj;
        return this.a == pdmVar.a && this.b == pdmVar.b && this.c == pdmVar.c && this.d == pdmVar.d && this.e == pdmVar.e && this.f == pdmVar.f && this.g == pdmVar.g && this.h == pdmVar.h && this.i == pdmVar.i && this.j == pdmVar.j && this.k == pdmVar.k && this.l == pdmVar.l && this.m == pdmVar.m && this.n == pdmVar.n && this.o == pdmVar.o && this.f62p == pdmVar.f62p;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f62p) + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, true), 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, true), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o);
    }
}
