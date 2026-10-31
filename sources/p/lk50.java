package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lk50 {
    public final qk50 a;
    public final String b;
    public final g0u c;
    public final String d;
    public final mk50 e;
    public final gq50 f;
    public final rk50 g;

    public lk50(qk50 qk50Var, String str, g0u g0uVar, String str2, mk50 mk50Var, gq50 gq50Var, rk50 rk50Var) {
        this.a = qk50Var;
        this.b = str;
        this.c = g0uVar;
        this.d = str2;
        this.e = mk50Var;
        this.f = gq50Var;
        this.g = rk50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk50)) {
            return false;
        }
        lk50 lk50Var = (lk50) obj;
        return this.a.equals(lk50Var.a) && this.b.equals(lk50Var.b) && this.c == lk50Var.c && this.d.equals(lk50Var.d) && this.e.equals(lk50Var.e) && this.f == lk50Var.f && u890.j(this.g, lk50Var.g);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + cy30.d((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d)) * 31)) * 31;
        rk50 rk50Var = this.g;
        return iHashCode + (rk50Var == null ? 0 : rk50Var.hashCode());
    }
}
