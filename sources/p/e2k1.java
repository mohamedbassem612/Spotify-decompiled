package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class e2k1 implements ez00 {
    public final long a;

    public e2k1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e2k1) && this.a == ((e2k1) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
