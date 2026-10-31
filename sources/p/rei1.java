package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rei1 implements sei1 {
    public final long a;

    public rei1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rei1) && vve1.a(this.a, ((rei1) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
