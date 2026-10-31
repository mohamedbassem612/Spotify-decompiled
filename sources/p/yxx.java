package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yxx {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;

    public yxx(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yxx)) {
            return false;
        }
        yxx yxxVar = (yxx) obj;
        long j = yxxVar.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && z4h1.b(this.b, yxxVar.b) && z4h1.b(this.c, yxxVar.c) && z4h1.b(this.d, yxxVar.d) && z4h1.b(this.e, yxxVar.e) && z4h1.b(this.f, yxxVar.f) && z4h1.b(this.g, yxxVar.g);
    }

    public final int hashCode() {
        int i = u7h.l;
        return z4h1.c(this.g) + c13.f(c13.f(c13.f(c13.f(c13.f(z4h1.c(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31);
    }
}
