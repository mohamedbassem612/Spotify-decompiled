package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g820 implements dk80 {
    public final dk80 a;
    public final dk80 b;

    public g820(dk80 dk80Var, dk80 dk80Var2) {
        this.a = dk80Var;
        this.b = dk80Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g820.class != obj.getClass()) {
            return false;
        }
        g820 g820Var = (g820) obj;
        return this.a.equals(g820Var.a) && this.b.equals(g820Var.b) && u890.j(h(), g820Var.h());
    }

    @Override // p.dk80
    public final void g(e261 e261Var) {
        this.a.g(e261Var);
        this.b.g(e261Var);
    }

    @Override // p.dk80
    public final kua0 h() {
        kua0 kua0VarH = this.b.h();
        dk80 dk80Var = this.a;
        return kua0VarH != null ? kua0VarH.b(dk80Var.h()) : dk80Var.h();
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 32;
        kua0 kua0VarH = h();
        return iHashCode + (kua0VarH != null ? kua0VarH.hashCode() : 0);
    }

    @Override // p.dk80
    public final void i(h4e1 h4e1Var) {
        this.a.i(h4e1Var);
        this.b.i(h4e1Var);
    }

    public final String toString() {
        return this.a + ".then(" + this.b + ")";
    }
}
