package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x951 extends q1o1 {
    public final String e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final Integer i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;

    public x951(String str, int i, boolean z, boolean z2, Integer num, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.e = str;
        this.f = i;
        this.g = z;
        this.h = z2;
        this.i = num;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.n = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x951)) {
            return false;
        }
        x951 x951Var = (x951) obj;
        return u890.j(this.e, x951Var.e) && this.f == x951Var.f && this.g == x951Var.g && this.h == x951Var.h && u890.j(this.i, x951Var.i) && this.j == x951Var.j && this.k == x951Var.k && this.l == x951Var.l && this.m == x951Var.m && this.n == x951Var.n;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(ab80.k(this.f, this.e.hashCode() * 31, 31), 31, this.g), 31, false), 31, this.h);
        Integer num = this.i;
        return Boolean.hashCode(this.n) + xcg1.g(xcg1.g(xcg1.g(xcg1.g((iG + (num != null ? num.hashCode() : 0)) * 31, 31, this.j), 31, this.k), 31, this.l), 31, this.m);
    }

    public final Integer i() {
        return this.i;
    }

    public final int j() {
        return this.f;
    }

    public final boolean o() {
        return this.h;
    }

    public final String p() {
        return this.e;
    }

    public final boolean q() {
        return this.n;
    }

    public final boolean r() {
        return this.g;
    }
}
