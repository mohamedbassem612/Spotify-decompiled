package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class w8w0 {
    public final buk1 a;
    public final hez b;
    public final fa20 c;
    public final px30 d;
    public final taa0 e;
    public final k7f0 f;

    public w8w0(buk1 buk1Var, hez hezVar, fa20 fa20Var, px30 px30Var, taa0 taa0Var, k7f0 k7f0Var) {
        this.a = buk1Var;
        this.b = hezVar;
        this.c = fa20Var;
        this.d = px30Var;
        this.e = taa0Var;
        this.f = k7f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8w0)) {
            return false;
        }
        w8w0 w8w0Var = (w8w0) obj;
        return this.a.equals(w8w0Var.a) && this.b.equals(w8w0Var.b) && this.c.equals(w8w0Var.c) && this.d.equals(w8w0Var.d) && this.e.equals(w8w0Var.e) && this.f.equals(w8w0Var.f);
    }

    public final int hashCode() {
        return this.f.a.hashCode() + ((this.e.a.hashCode() + ((this.d.a.hashCode() + ((this.c.a.hashCode() + ((this.b.a.hashCode() + (this.a.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
