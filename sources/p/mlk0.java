package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mlk0 {
    public final String a;
    public final lhg1 b;
    public final boolean c;
    public final Float d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final int h;

    public mlk0(String str, lhg1 lhg1Var, boolean z, Float f, int i, boolean z2, int i2) {
        z = (i2 & 4) != 0 ? true : z;
        f = (i2 & 8) != 0 ? null : f;
        i = (i2 & 16) != 0 ? 0 : i;
        boolean z3 = (i2 & 32) == 0;
        z2 = (i2 & 128) != 0 ? false : z2;
        this.a = str;
        this.b = lhg1Var;
        this.c = z;
        this.d = f;
        this.e = i;
        this.f = z3;
        this.g = z2;
        this.h = 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mlk0)) {
            return false;
        }
        mlk0 mlk0Var = (mlk0) obj;
        return u890.j(this.a, mlk0Var.a) && u890.j(this.b, mlk0Var.b) && this.c == mlk0Var.c && u890.j(this.d, mlk0Var.d) && this.e == mlk0Var.e && this.f == mlk0Var.f && this.g == mlk0Var.g && this.h == mlk0Var.h;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        lhg1 lhg1Var = this.b;
        int iG = xcg1.g((iHashCode + (lhg1Var == null ? 0 : lhg1Var.hashCode())) * 31, 31, this.c);
        Float f = this.d;
        int iHashCode2 = (iG + (f == null ? 0 : f.hashCode())) * 31;
        int i = this.e;
        return l1d.C(this.h) + xcg1.g(xcg1.g(xcg1.g((iHashCode2 + (i == 0 ? 0 : l1d.C(i))) * 31, 31, this.f), 31, false), 31, this.g);
    }
}
