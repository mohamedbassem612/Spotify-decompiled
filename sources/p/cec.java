package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cec {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public cec(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof cec)) {
            return false;
        }
        cec cecVar = (cec) obj;
        long j = cecVar.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && z4h1.b(this.b, cecVar.b) && z4h1.b(this.c, cecVar.c) && z4h1.b(this.d, cecVar.d);
    }

    public final int hashCode() {
        int i = u7h.l;
        return Long.hashCode(this.d) + cy30.f(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }
}
