package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vyg0 {
    public final String a;
    public final boolean b;
    public final k1r c;
    public final gzg0 d;

    public vyg0(String str, boolean z, k1r k1rVar, gzg0 gzg0Var) {
        this.a = str;
        this.b = z;
        this.c = k1rVar;
        this.d = gzg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vyg0)) {
            return false;
        }
        vyg0 vyg0Var = (vyg0) obj;
        return this.a.equals(vyg0Var.a) && this.b == vyg0Var.b && u890.j(this.c, vyg0Var.c) && u890.j(this.d, vyg0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b)) * 31;
        gzg0 gzg0Var = this.d;
        return iHashCode + (gzg0Var == null ? 0 : gzg0Var.hashCode());
    }
}
