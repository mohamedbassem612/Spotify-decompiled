package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jam {
    public final hux a;
    public final long b;
    public final int c;
    public final int d;

    public jam(hux huxVar, long j, int i, int i2) {
        this.a = huxVar;
        this.b = j;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jam)) {
            return false;
        }
        jam jamVar = (jam) obj;
        if (!u890.j(this.a, jamVar.a)) {
            return false;
        }
        long j = jamVar.b;
        int i = u7h.l;
        return z4h1.b(this.b, j) && this.c == jamVar.c && this.d == jamVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = u7h.l;
        return Integer.hashCode(this.d) + kaa0.f(this.c, cy30.f(iHashCode, this.b, 31), 31);
    }
}
