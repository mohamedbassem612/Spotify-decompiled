package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a5g1 implements b5g1 {
    public final o5g1 a;
    public final iix0 b;
    public final ast0 c;
    public final y4m d;
    public final r840 e;
    public final String f;

    public a5g1(o5g1 o5g1Var, iix0 iix0Var, ast0 ast0Var, y4m y4mVar, r840 r840Var, String str) {
        this.a = o5g1Var;
        this.b = iix0Var;
        this.c = ast0Var;
        this.d = y4mVar;
        this.e = r840Var;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5g1)) {
            return false;
        }
        a5g1 a5g1Var = (a5g1) obj;
        return this.a.equals(a5g1Var.a) && u890.j(this.b, a5g1Var.b) && this.c == a5g1Var.c && this.d.equals(a5g1Var.d) && this.e.equals(a5g1Var.e) && u890.j(this.f, a5g1Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        iix0 iix0Var = this.b;
        return l1d.C(2) + cy30.d((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (iix0Var == null ? 0 : iix0Var.hashCode())) * 31)) * 31)) * 31)) * 31, 31, this.f);
    }
}
