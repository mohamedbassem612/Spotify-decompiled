package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sb8 implements tb8 {
    public final long a;

    public sb8(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sb8) && this.a == ((sb8) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
