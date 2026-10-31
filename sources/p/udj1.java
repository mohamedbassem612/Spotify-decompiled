package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class udj1 {
    public final long a;

    public udj1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof udj1) && this.a == ((udj1) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
