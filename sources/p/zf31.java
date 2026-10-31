package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zf31 implements bg31 {
    public final long a;

    public zf31(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zf31) && this.a == ((zf31) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
