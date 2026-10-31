package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uf40 {
    public final String a;
    public final boolean b;
    public final vhx0 c;
    public final zob1 d;

    public uf40(String str, boolean z, vhx0 vhx0Var, wen0 wen0Var) {
        this.a = str;
        this.b = z;
        this.c = vhx0Var;
        this.d = wen0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uf40)) {
            return false;
        }
        uf40 uf40Var = (uf40) obj;
        return this.a.equals(uf40Var.a) && this.b == uf40Var.b && u890.j(this.c, uf40Var.c) && this.d.equals(uf40Var.d);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        vhx0 vhx0Var = this.c;
        return this.d.hashCode() + ((iG + (vhx0Var == null ? 0 : vhx0Var.hashCode())) * 31);
    }
}
