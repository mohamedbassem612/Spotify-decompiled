package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w4h0 implements h5h0 {
    public final long a;

    public w4h0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w4h0) && this.a == ((w4h0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
