package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f2h0 implements e4h0 {
    public final long a;

    public f2h0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f2h0) && this.a == ((f2h0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
