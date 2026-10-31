package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class c2k1 implements d2k1 {
    public final long a;

    public c2k1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c2k1) && this.a == ((c2k1) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
