package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class n08 {
    public final k1r a;
    public final i091 b;

    public n08(k1r k1rVar, i091 i091Var) {
        this.a = k1rVar;
        this.b = i091Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n08)) {
            return false;
        }
        n08 n08Var = (n08) obj;
        return u890.j(this.a, n08Var.a) && u890.j(this.b, n08Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        i091 i091Var = this.b;
        return iHashCode + (i091Var == null ? 0 : i091Var.hashCode());
    }
}
