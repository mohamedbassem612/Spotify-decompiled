package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lhv extends nhv {
    public final long a;
    public final long b;

    public lhv(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhv)) {
            return false;
        }
        lhv lhvVar = (lhv) obj;
        return this.a == lhvVar.a && this.b == lhvVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
