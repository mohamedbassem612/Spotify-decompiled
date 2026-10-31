package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pw00 implements ww00 {
    public final long a;

    public pw00(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pw00) && this.a == ((pw00) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
