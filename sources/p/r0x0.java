package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r0x0 {
    public final long a;

    public r0x0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0x0) && this.a == ((r0x0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
