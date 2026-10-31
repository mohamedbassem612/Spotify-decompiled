package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lza {
    public final long a;

    public lza(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lza)) {
            return false;
        }
        long j = ((lza) obj).a;
        int i = u7h.l;
        return z4h1.b(this.a, j);
    }

    public final int hashCode() {
        int i = u7h.l;
        return Long.hashCode(this.a);
    }
}
