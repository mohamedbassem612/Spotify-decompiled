package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class z951 extends q1o1 {
    public final String e;
    public final int f;
    public final boolean g;
    public final p7w h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final Integer l;
    public final boolean m;
    public final w951 n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f107p;
    public final String q;
    public final boolean r;
    public final int s;
    public final boolean t;
    public final boolean u;
    public final boolean v;

    public /* synthetic */ z951(String str, int i, boolean z, p7w p7wVar, boolean z2, boolean z3, Integer num, boolean z4, w951 w951Var, String str2, String str3, String str4, boolean z5, int i2, boolean z6, boolean z7, boolean z8, int i3) {
        this(str, i, z, p7wVar, false, (i3 & 32) != 0 ? false : z2, (i3 & 64) != 0 ? false : z3, (i3 & 128) != 0 ? null : num, (i3 & 256) != 0 ? false : z4, w951Var, (i3 & 1024) != 0 ? null : str2, str3, (i3 & 4096) != 0 ? null : str4, (i3 & 8192) != 0 ? false : z5, (i3 & 16384) != 0 ? 1 : i2, (32768 & i3) != 0 ? false : z6, (65536 & i3) != 0 ? false : z7, (i3 & 131072) != 0 ? false : z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z951)) {
            return false;
        }
        z951 z951Var = (z951) obj;
        return u890.j(this.e, z951Var.e) && this.f == z951Var.f && this.g == z951Var.g && u890.j(this.h, z951Var.h) && this.i == z951Var.i && this.j == z951Var.j && this.k == z951Var.k && u890.j(this.l, z951Var.l) && this.m == z951Var.m && u890.j(this.n, z951Var.n) && u890.j(this.o, z951Var.o) && u890.j(this.f107p, z951Var.f107p) && u890.j(this.q, z951Var.q) && this.r == z951Var.r && this.s == z951Var.s && this.t == z951Var.t && this.u == z951Var.u && this.v == z951Var.v;
    }

    public final int hashCode() {
        int iG = xcg1.g(ab80.k(this.f, this.e.hashCode() * 31, 31), 31, this.g);
        p7w p7wVar = this.h;
        int iG2 = xcg1.g(xcg1.g(xcg1.g((iG + (p7wVar == null ? 0 : p7wVar.hashCode())) * 31, 31, this.i), 31, this.j), 31, this.k);
        Integer num = this.l;
        int iHashCode = (this.n.hashCode() + xcg1.g((iG2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.m)) * 31;
        String str = this.o;
        int iD = cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f107p);
        String str2 = this.q;
        return Boolean.hashCode(this.v) + xcg1.g(xcg1.g(ab80.k(this.s, xcg1.g((iD + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.r), 31), 31, this.t), 31, this.u);
    }

    public final Integer i() {
        return this.l;
    }

    public final int j() {
        return this.f;
    }

    public final boolean o() {
        return this.k;
    }

    public final String p() {
        return this.e;
    }

    public final boolean q() {
        return this.v;
    }

    public final boolean r() {
        return this.g;
    }

    public z951(String str, int i, boolean z, p7w p7wVar, boolean z2, boolean z3, boolean z4, Integer num, boolean z5, w951 w951Var, String str2, String str3, String str4, boolean z6, int i2, boolean z7, boolean z8, boolean z9) {
        this.e = str;
        this.f = i;
        this.g = z;
        this.h = p7wVar;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = num;
        this.m = z5;
        this.n = w951Var;
        this.o = str2;
        this.f107p = str3;
        this.q = str4;
        this.r = z6;
        this.s = i2;
        this.t = z7;
        this.u = z8;
        this.v = z9;
    }
}
