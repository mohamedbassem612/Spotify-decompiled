package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vza {
    public final long a;

    public vza(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vza)) {
            return false;
        }
        long j = ((vza) obj).a;
        int i = u7h.l;
        return z4h1.b(this.a, j);
    }

    public final int hashCode() {
        int i = u7h.l;
        return Long.hashCode(this.a);
    }
}
