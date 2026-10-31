package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mqf {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public mqf(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mqf)) {
            return false;
        }
        mqf mqfVar = (mqf) obj;
        long j = mqfVar.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && z4h1.b(this.b, mqfVar.b) && z4h1.b(this.c, mqfVar.c) && z4h1.b(this.d, mqfVar.d);
    }

    public final int hashCode() {
        int i = u7h.l;
        return Long.hashCode(this.d) + cy30.f(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }
}
