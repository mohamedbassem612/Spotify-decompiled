package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xxe0 {
    public final String a;
    public final lik1 b;
    public final int c;
    public final zzy d;
    public final Boolean e;

    public xxe0(String str, lik1 lik1Var, int i, zzy zzyVar, Boolean bool) {
        this.a = str;
        this.b = lik1Var;
        this.c = i;
        this.d = zzyVar;
        this.e = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxe0)) {
            return false;
        }
        xxe0 xxe0Var = (xxe0) obj;
        return u890.j(this.a, xxe0Var.a) && u890.j(this.b, xxe0Var.b) && this.c == xxe0Var.c && u890.j(this.d, xxe0Var.d) && u890.j(this.e, xxe0Var.e);
    }

    public final int hashCode() {
        int iK = ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b.a), 31);
        zzy zzyVar = this.d;
        int iHashCode = (iK + (zzyVar == null ? 0 : zzyVar.hashCode())) * 31;
        Boolean bool = this.e;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}
