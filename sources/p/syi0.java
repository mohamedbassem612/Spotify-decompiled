package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class syi0 implements uyi0 {
    public final long a;

    public syi0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof syi0) && this.a == ((syi0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
