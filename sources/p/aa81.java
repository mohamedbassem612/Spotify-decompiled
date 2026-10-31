package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class aa81 {
    public final long a;

    public aa81(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aa81) && this.a == ((aa81) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
