package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fpi0 {
    public final String a;
    public final vni0 b;
    public final npi0 c;
    public final wxn0 d;

    public fpi0(String str, vni0 vni0Var, npi0 npi0Var, wxn0 wxn0Var) {
        this.a = str;
        this.b = vni0Var;
        this.c = npi0Var;
        this.d = wxn0Var;
    }

    public static fpi0 a(fpi0 fpi0Var, npi0 npi0Var) {
        return new fpi0(fpi0Var.a, fpi0Var.b, npi0Var, fpi0Var.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpi0)) {
            return false;
        }
        fpi0 fpi0Var = (fpi0) obj;
        return u890.j(this.a, fpi0Var.a) && u890.j(this.b, fpi0Var.b) && this.c.equals(fpi0Var.c) && this.d == fpi0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
