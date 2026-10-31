package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o4i0 implements v4i0 {
    public final long a;

    public o4i0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o4i0) && this.a == ((o4i0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
