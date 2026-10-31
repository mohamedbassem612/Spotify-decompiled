package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yr21 implements zr21 {
    public final long a;

    public yr21(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yr21) && this.a == ((yr21) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
