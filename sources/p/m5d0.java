package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m5d0 {
    public final uf6 a;
    public final int b;
    public final String c;
    public final tf6 d;

    public m5d0(uf6 uf6Var, int i, String str, tf6 tf6Var) {
        this.a = uf6Var;
        this.b = i;
        this.c = str;
        this.d = tf6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5d0)) {
            return false;
        }
        m5d0 m5d0Var = (m5d0) obj;
        return this.a == m5d0Var.a && this.b == m5d0Var.b && this.c.equals(m5d0Var.c) && this.d == m5d0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }
}
