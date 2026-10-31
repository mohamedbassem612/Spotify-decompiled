package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xeo {
    public final long a;
    public final float b;
    public final int c;
    public final double d;

    public xeo(long j, float f, int i, double d) {
        this.a = j;
        this.b = f;
        this.c = i;
        this.d = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xeo)) {
            return false;
        }
        xeo xeoVar = (xeo) obj;
        return this.a == xeoVar.a && Float.compare(this.b, xeoVar.b) == 0 && this.c == xeoVar.c && Double.compare(this.d, xeoVar.d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.d) + ab80.k(this.c, x0d.f(Long.hashCode(this.a) * 31, 31, this.b), 31);
    }
}
