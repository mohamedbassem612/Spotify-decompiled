package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ksb1 {
    public final btb1 a;
    public final xsb1 b;
    public final pks0 c;
    public final int d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public ksb1(btb1 btb1Var, xsb1 xsb1Var, pks0 pks0Var, int i, String str, boolean z, boolean z2) {
        this.a = btb1Var;
        this.b = xsb1Var;
        this.c = pks0Var;
        this.d = i;
        this.e = str;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksb1)) {
            return false;
        }
        ksb1 ksb1Var = (ksb1) obj;
        return u890.j(this.a, ksb1Var.a) && this.b == ksb1Var.b && u890.j(this.c, ksb1Var.c) && this.d == ksb1Var.d && u890.j(this.e, ksb1Var.e) && this.f == ksb1Var.f && this.g == ksb1Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + xcg1.g(cy30.d(ab80.k(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31), 31, this.e), 31, this.f);
    }
}
