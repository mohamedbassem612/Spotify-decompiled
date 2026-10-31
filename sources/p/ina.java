package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ina {
    public final jgc1 a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public final float e;
    public final float f;
    public final int g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final int m;
    public final int n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f27p;
    public final String q;
    public final String r;

    public ina(jgc1 jgc1Var, long j, boolean z, boolean z2, float f, float f2, int i, int i2, boolean z3, boolean z4, boolean z5, boolean z6, int i3, int i4, String str, int i5, String str2, String str3) {
        this.a = jgc1Var;
        this.b = j;
        this.c = z;
        this.d = z2;
        this.e = f;
        this.f = f2;
        this.g = i;
        this.h = i2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = i3;
        this.n = i4;
        this.o = str;
        this.f27p = i5;
        this.q = str2;
        this.r = str3;
    }

    public static ina a(ina inaVar, jgc1 jgc1Var, long j, boolean z, boolean z2, float f, float f2, int i, int i2, boolean z3, boolean z4, boolean z5, boolean z6, int i3, int i4, String str, int i5, String str2, String str3, int i6) {
        jgc1 jgc1Var2 = (i6 & 1) != 0 ? inaVar.a : jgc1Var;
        long j2 = (i6 & 2) != 0 ? inaVar.b : j;
        boolean z7 = (i6 & 4) != 0 ? inaVar.c : z;
        boolean z8 = (i6 & 8) != 0 ? inaVar.d : z2;
        float f3 = (i6 & 16) != 0 ? inaVar.e : f;
        float f4 = (i6 & 32) != 0 ? inaVar.f : f2;
        int i7 = (i6 & 64) != 0 ? inaVar.g : i;
        int i8 = (i6 & 128) != 0 ? inaVar.h : i2;
        boolean z9 = (i6 & 256) != 0 ? inaVar.i : z3;
        boolean z10 = (i6 & 512) != 0 ? inaVar.j : z4;
        boolean z11 = (i6 & 1024) != 0 ? inaVar.k : z5;
        boolean z12 = (i6 & 2048) != 0 ? inaVar.l : z6;
        int i9 = (i6 & 4096) != 0 ? inaVar.m : i3;
        jgc1 jgc1Var3 = jgc1Var2;
        int i10 = (i6 & 8192) != 0 ? inaVar.n : i4;
        String str4 = (i6 & 16384) != 0 ? inaVar.o : str;
        int i11 = (i6 & 32768) != 0 ? inaVar.f27p : i5;
        String str5 = (i6 & 65536) != 0 ? inaVar.q : str2;
        String str6 = (i6 & 131072) != 0 ? inaVar.r : str3;
        inaVar.getClass();
        return new ina(jgc1Var3, j2, z7, z8, f3, f4, i7, i8, z9, z10, z11, z12, i9, i10, str4, i11, str5, str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ina)) {
            return false;
        }
        ina inaVar = (ina) obj;
        return this.a == inaVar.a && this.b == inaVar.b && this.c == inaVar.c && this.d == inaVar.d && Float.compare(this.e, inaVar.e) == 0 && Float.compare(this.f, inaVar.f) == 0 && this.g == inaVar.g && this.h == inaVar.h && this.i == inaVar.i && this.j == inaVar.j && this.k == inaVar.k && this.l == inaVar.l && this.m == inaVar.m && this.n == inaVar.n && this.o.equals(inaVar.o) && this.f27p == inaVar.f27p && this.q.equals(inaVar.q) && this.r.equals(inaVar.r);
    }

    public final int hashCode() {
        return this.r.hashCode() + cy30.d(ab80.k(this.f27p, cy30.d(kaa0.f(this.n, kaa0.f(this.m, xcg1.g(xcg1.g(xcg1.g(xcg1.g(kaa0.f(this.h, kaa0.f(this.g, x0d.f(x0d.f(xcg1.g(xcg1.g(cy30.f(this.a.hashCode() * 31, this.b, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31), 31), 31, this.o), 31), 31, this.q);
    }
}
