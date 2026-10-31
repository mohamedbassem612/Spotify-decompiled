package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bw50 {
    public final qx50 a;
    public final long b;

    public bw50(qx50 qx50Var, long j) {
        this.a = qx50Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw50)) {
            return false;
        }
        bw50 bw50Var = (bw50) obj;
        if (!u890.j(this.a, bw50Var.a)) {
            return false;
        }
        long j = bw50Var.b;
        int i = u7h.l;
        return z4h1.b(this.b, j);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = u7h.l;
        return Long.hashCode(this.b) + iHashCode;
    }
}
