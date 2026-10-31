package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dn20 {
    public final va51 a;
    public final ta51 b;
    public final pa51 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final qa51 g;
    public final boolean h;
    public final za51 i;

    public dn20(va51 va51Var, ta51 ta51Var, pa51 pa51Var, boolean z, boolean z2, boolean z3, qa51 qa51Var, boolean z4, za51 za51Var) {
        this.a = va51Var;
        this.b = ta51Var;
        this.c = pa51Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = qa51Var;
        this.h = z4;
        this.i = za51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn20)) {
            return false;
        }
        dn20 dn20Var = (dn20) obj;
        return this.a.equals(dn20Var.a) && this.b.equals(dn20Var.b) && this.c.equals(dn20Var.c) && this.d == dn20Var.d && this.e == dn20Var.e && this.f == dn20Var.f && u890.j(this.g, dn20Var.g) && this.h == dn20Var.h && this.i.equals(dn20Var.i);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f);
        qa51 qa51Var = this.g;
        return this.i.a.hashCode() + xcg1.g((iG + (qa51Var == null ? 0 : Boolean.hashCode(qa51Var.a))) * 961, 31, this.h);
    }
}
