package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class p13 implements q13 {
    public final lik1 a;
    public final String b;
    public final String c;

    public p13(String str, String str2, lik1 lik1Var) {
        this.a = lik1Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p13)) {
            return false;
        }
        p13 p13Var = (p13) obj;
        return u890.j(this.a, p13Var.a) && u890.j(this.b, p13Var.b) && u890.j(this.c, p13Var.c);
    }

    @Override // p.q13
    public final lik1 getViewUri() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.a.hashCode() * 31, 31, this.b);
    }
}
