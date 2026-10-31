package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zxx {
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

    /* JADX WARN: Illegal instructions before constructor call */
    public zxx(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i) {
        long j9 = u7h.j;
        this(j, j2, j3, j4, j5, j6, j7, j9, j9, (i & 512) != 0 ? j9 : j8);
    }

    public static zxx a(zxx zxxVar, long j, long j2, long j3, long j4, int i) {
        return new zxx(zxxVar.a, zxxVar.b, zxxVar.c, zxxVar.d, j, (i & 32) != 0 ? zxxVar.f : j2, zxxVar.g, (i & 128) != 0 ? zxxVar.h : j3, (i & 256) != 0 ? zxxVar.i : j4, zxxVar.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zxx)) {
            return false;
        }
        zxx zxxVar = (zxx) obj;
        long j = zxxVar.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && z4h1.b(this.b, zxxVar.b) && z4h1.b(this.c, zxxVar.c) && z4h1.b(this.d, zxxVar.d) && z4h1.b(this.e, zxxVar.e) && z4h1.b(this.f, zxxVar.f) && z4h1.b(this.g, zxxVar.g) && z4h1.b(this.h, zxxVar.h) && z4h1.b(this.i, zxxVar.i) && z4h1.b(this.j, zxxVar.j);
    }

    public final int hashCode() {
        int i = u7h.l;
        return Long.hashCode(this.j) + cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31), this.h, 31), this.i, 31);
    }

    public zxx(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
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
    }
}
