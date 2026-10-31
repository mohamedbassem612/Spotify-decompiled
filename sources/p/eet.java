package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class eet implements fet {
    public final long a;

    public eet(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eet) && this.a == ((eet) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
