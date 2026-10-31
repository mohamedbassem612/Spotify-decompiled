package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qsd {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public qsd(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final qsd a(long j, long j2, long j3, long j4) {
        return new qsd(j != 16 ? j : this.a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof qsd)) {
            return false;
        }
        qsd qsdVar = (qsd) obj;
        long j = qsdVar.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && z4h1.b(this.b, qsdVar.b) && z4h1.b(this.c, qsdVar.c) && z4h1.b(this.d, qsdVar.d);
    }

    public final int hashCode() {
        int i = u7h.l;
        return Long.hashCode(this.d) + cy30.f(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }
}
