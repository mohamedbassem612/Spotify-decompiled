package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v8k implements z8k {
    public final String a;
    public final wr21 b;

    public v8k(String str, wr21 wr21Var) {
        this.a = str;
        this.b = wr21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8k)) {
            return false;
        }
        v8k v8kVar = (v8k) obj;
        return this.a.equals(v8kVar.a) && u890.j(this.b, v8kVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        wr21 wr21Var = this.b;
        return iHashCode + (wr21Var == null ? 0 : wr21Var.hashCode());
    }
}
