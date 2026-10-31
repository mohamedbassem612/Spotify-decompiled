package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class stg {
    public final long a;
    public final long b;

    public stg(long j, long j2) {
        this.a = j;
        this.b = j2;
        if (0 > j || j >= 4294967296L || 0 > j2 || j2 >= 4294967296L) {
            hhg1.n("Failed requirement.");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof stg)) {
            return false;
        }
        stg stgVar = (stg) obj;
        return this.a == stgVar.a && this.b == stgVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
