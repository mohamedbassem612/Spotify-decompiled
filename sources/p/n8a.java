package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n8a {
    public final float a;
    public final long b;

    public n8a(float f, long j) {
        this.a = f;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8a)) {
            return false;
        }
        n8a n8aVar = (n8a) obj;
        if (Float.compare(this.a, n8aVar.a) != 0) {
            return false;
        }
        long j = n8aVar.b;
        int i = u7h.l;
        return z4h1.b(this.b, j);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.a) * 31;
        int i = u7h.l;
        return Long.hashCode(this.b) + iHashCode;
    }
}
