package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class od51 {
    public final lw41 a;
    public final boolean b;
    public final String c;
    public final ue20 d;
    public final b851 e;
    public final a851 f;
    public final fw41 g;
    public final e7r0 h;

    public od51(lw41 lw41Var, boolean z, String str, ue20 ue20Var, b851 b851Var, a851 a851Var, fw41 fw41Var, e7r0 e7r0Var) {
        this.a = lw41Var;
        this.b = z;
        this.c = str;
        this.d = ue20Var;
        this.e = b851Var;
        this.f = a851Var;
        this.g = fw41Var;
        this.h = e7r0Var;
    }

    public final lw41 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od51)) {
            return false;
        }
        od51 od51Var = (od51) obj;
        return u890.j(this.a, od51Var.a) && this.b == od51Var.b && u890.j(this.c, od51Var.c) && u890.j(this.d, od51Var.d) && this.e.equals(od51Var.e) && this.f == od51Var.f && u890.j(this.g, od51Var.g) && u890.j(this.h, od51Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + cy30.d(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31)) * 31)) * 31);
    }
}
