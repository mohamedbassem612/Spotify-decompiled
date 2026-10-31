package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pei1 implements sei1 {
    public final long a;

    public pei1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pei1) && tve1.b(this.a, ((pei1) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
