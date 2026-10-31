package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lc7 {
    public final i a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final sfu0 h;
    public final Object i;
    public final boolean j;

    public lc7(i iVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, sfu0 sfu0Var, Object obj, boolean z6) {
        this.a = iVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = i;
        this.h = sfu0Var;
        this.i = obj;
        this.j = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc7)) {
            return false;
        }
        lc7 lc7Var = (lc7) obj;
        return this.a.equals(lc7Var.a) && this.b == lc7Var.b && this.c == lc7Var.c && this.d == lc7Var.d && this.e == lc7Var.e && this.f == lc7Var.f && this.g == lc7Var.g && this.h.equals(lc7Var.h) && u890.j(this.i, lc7Var.i) && this.j == lc7Var.j;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        int i = this.g;
        int iHashCode = (this.h.hashCode() + ((iG + (i == 0 ? 0 : l1d.C(i))) * 31)) * 31;
        Object obj = this.i;
        return Boolean.hashCode(this.j) + ((iHashCode + (obj != null ? obj.hashCode() : 0)) * 31);
    }
}
