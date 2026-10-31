package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pcz implements qcz {
    public final long a;

    public pcz(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pcz) && this.a == ((pcz) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (Long.hashCode(this.a) * 31);
    }
}
