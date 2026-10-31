package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wr11 extends xr11 {
    public final id2 a;
    public final String b;

    public wr11(id2 id2Var, String str) {
        this.a = id2Var;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wr11)) {
            return false;
        }
        wr11 wr11Var = (wr11) obj;
        return u890.j(this.a, wr11Var.a) && u890.j(this.b, wr11Var.b);
    }

    public final int hashCode() {
        id2 id2Var = this.a;
        int iHashCode = (id2Var == null ? 0 : id2Var.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
