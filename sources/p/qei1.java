package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qei1 implements sei1 {
    public final long a;

    public qei1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qei1) && vve1.a(this.a, ((qei1) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
