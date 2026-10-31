package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class utk1 {
    public final double a;
    public final double b;
    public final l0l c;
    public final nnr d;
    public final h06 e;
    public final String f;
    public final boolean g;
    public double h;
    public int i;

    public utk1(double d, double d2, l0l l0lVar, nnr nnrVar, h06 h06Var, String str, boolean z) {
        this.a = d;
        this.b = d2;
        this.c = l0lVar;
        this.d = nnrVar;
        this.e = h06Var;
        this.f = str;
        this.g = z;
    }

    public final l0l a() {
        return this.c;
    }

    public final h06 b() {
        return this.e;
    }

    public final nnr c() {
        return this.d;
    }

    public final double d() {
        return this.a;
    }

    public final String e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof utk1)) {
            return false;
        }
        utk1 utk1Var = (utk1) obj;
        return Double.compare(this.a, utk1Var.a) == 0 && Double.compare(this.b, utk1Var.b) == 0 && u890.j(this.c, utk1Var.c) && u890.j(this.d, utk1Var.d) && this.e == utk1Var.e && u890.j(this.f, utk1Var.f) && this.g == utk1Var.g;
    }

    public final double f() {
        return this.b;
    }

    public final int g() {
        return this.i;
    }

    public final double h() {
        return this.h;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + xcg1.e(this.b, Double.hashCode(this.a) * 31, 31)) * 31;
        nnr nnrVar = this.d;
        return Boolean.hashCode(this.g) + cy30.d((this.e.hashCode() + ((iHashCode + (nnrVar == null ? 0 : nnrVar.hashCode())) * 31)) * 31, 31, this.f);
    }

    public final boolean i() {
        return this.g;
    }

    public final void j(int i) {
        this.i = i;
    }

    public final void k(double d) {
        this.h = d;
    }
}
