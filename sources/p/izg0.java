package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class izg0 implements k0h0 {
    public final long a;

    public izg0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof izg0) && this.a == ((izg0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
