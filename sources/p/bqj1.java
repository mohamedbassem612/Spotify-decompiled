package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bqj1 {
    public final hll a;
    public final String b;

    public bqj1(hll hllVar, String str) {
        this.a = hllVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqj1)) {
            return false;
        }
        bqj1 bqj1Var = (bqj1) obj;
        return u890.j(this.a, bqj1Var.a) && u890.j(this.b, bqj1Var.b);
    }

    public final int hashCode() {
        hll hllVar = this.a;
        int iHashCode = (hllVar == null ? 0 : hllVar.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
