package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y5u0 implements b6u0 {
    public final long a;

    public y5u0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y5u0) && this.a == ((y5u0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
