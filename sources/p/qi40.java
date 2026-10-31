package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qi40 {
    public final long a;

    public qi40(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qi40) && this.a == ((qi40) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
