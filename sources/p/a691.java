package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a691 {
    public final r591 a;
    public final vu30 b;

    public a691(r591 r591Var, vu30 vu30Var) {
        this.a = r591Var;
        this.b = vu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a691)) {
            return false;
        }
        a691 a691Var = (a691) obj;
        return this.a == a691Var.a && this.b.equals(a691Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
