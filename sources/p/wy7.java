package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wy7 extends tto1 {
    public final long b;

    public wy7(long j) {
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wy7) && this.b == ((wy7) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }
}
