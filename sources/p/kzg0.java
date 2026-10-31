package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kzg0 implements k0h0 {
    public final long a;

    public kzg0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kzg0) && this.a == ((kzg0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
