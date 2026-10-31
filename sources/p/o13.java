package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o13 implements q13 {
    public final lik1 a;
    public final String b;

    public o13(String str, lik1 lik1Var) {
        this.a = lik1Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o13)) {
            return false;
        }
        o13 o13Var = (o13) obj;
        return u890.j(this.a, o13Var.a) && u890.j(this.b, o13Var.b);
    }

    @Override // p.q13
    public final lik1 getViewUri() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }
}
