package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pc51 {
    public final f951 a;
    public final int b;
    public final String c;
    public final String d;
    public final m131 e;
    public final xrt0 f;
    public final ue20 g;
    public final e7r0 h;
    public final int i;
    public final fw41 j;
    public final val k;

    public pc51(f951 f951Var, int i, String str, String str2, m131 m131Var, xrt0 xrt0Var, ue20 ue20Var, e7r0 e7r0Var, int i2, fw41 fw41Var, val valVar) {
        this.a = f951Var;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = m131Var;
        this.f = xrt0Var;
        this.g = ue20Var;
        this.h = e7r0Var;
        this.i = i2;
        this.j = fw41Var;
        this.k = valVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pc51)) {
            return false;
        }
        pc51 pc51Var = (pc51) obj;
        return u890.j(this.a, pc51Var.a) && this.b == pc51Var.b && u890.j(this.c, pc51Var.c) && u890.j(this.d, pc51Var.d) && u890.j(this.e, pc51Var.e) && u890.j(this.f, pc51Var.f) && u890.j(this.g, pc51Var.g) && u890.j(this.h, pc51Var.h) && this.i == pc51Var.i && u890.j(this.j, pc51Var.j) && u890.j(this.k, pc51Var.k);
    }

    public final int hashCode() {
        int iD = cy30.d(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        return this.k.hashCode() + ((this.j.hashCode() + ab80.k(this.i, (this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31, 31)) * 31);
    }
}
