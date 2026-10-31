package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a4g1 {
    public final uf6 a;
    public final int b;
    public final String c;
    public final tf6 d;

    public a4g1(uf6 uf6Var, int i, String str, tf6 tf6Var) {
        this.a = uf6Var;
        this.b = i;
        this.c = str;
        this.d = tf6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4g1)) {
            return false;
        }
        a4g1 a4g1Var = (a4g1) obj;
        return this.a == a4g1Var.a && this.b == a4g1Var.b && this.c.equals(a4g1Var.c) && this.d == a4g1Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }
}
