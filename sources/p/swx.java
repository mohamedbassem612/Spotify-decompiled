package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class swx {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    public swx(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
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
        if (!(obj instanceof swx)) {
            return false;
        }
        swx swxVar = (swx) obj;
        long j = swxVar.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && z4h1.b(this.b, swxVar.b) && z4h1.b(this.c, swxVar.c) && z4h1.b(this.d, swxVar.d) && z4h1.b(this.e, swxVar.e) && z4h1.b(this.f, swxVar.f) && z4h1.b(this.g, swxVar.g) && z4h1.b(this.h, swxVar.h);
    }

    public final int hashCode() {
        int i = u7h.l;
        return Long.hashCode(this.h) + cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31);
    }
}
