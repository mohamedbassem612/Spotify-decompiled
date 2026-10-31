package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sqj0 implements uqj0 {
    public final short a;

    /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
    public sqj0(long j) {
        this.a = (int) j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sqj0) && ((long) this.a) == ((long) ((sqj0) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
