package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xcu0 {
    public final String a;
    public final long b;
    public final boolean c;
    public final long d;
    public final String e;
    public final float f;
    public final float g;
    public final String h;
    public final String i;
    public final int j;
    public final boolean k;
    public final String l;
    public final int m;
    public final boolean n;

    public xcu0(String str, long j, boolean z, long j2, String str2, float f, float f2, String str3, String str4, int i, boolean z2, String str5, int i2, boolean z3) {
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = j2;
        this.e = str2;
        this.f = f;
        this.g = f2;
        this.h = str3;
        this.i = str4;
        this.j = i;
        this.k = z2;
        this.l = str5;
        this.m = i2;
        this.n = z3;
    }

    public final int a() {
        return this.m;
    }

    public final int b() {
        return this.j;
    }

    public final long c() {
        return this.b;
    }

    public final String d() {
        return this.h;
    }

    public final long e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xcu0)) {
            return false;
        }
        xcu0 xcu0Var = (xcu0) obj;
        return this.a.equals(xcu0Var.a) && this.b == xcu0Var.b && this.c == xcu0Var.c && this.d == xcu0Var.d && this.e.equals(xcu0Var.e) && Float.compare(this.f, xcu0Var.f) == 0 && Float.compare(this.g, xcu0Var.g) == 0 && this.h.equals(xcu0Var.h) && this.i.equals(xcu0Var.i) && this.j == xcu0Var.j && this.k == xcu0Var.k && u890.j(this.l, xcu0Var.l) && this.m == xcu0Var.m && this.n == xcu0Var.n;
    }

    public final String f() {
        return this.a;
    }

    public final float g() {
        return this.f;
    }

    public final String h() {
        return this.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.n) + kaa0.f(this.m, cy30.d(xcg1.g(kaa0.f(this.j, cy30.d(cy30.d(x0d.f(x0d.f(cy30.d(cy30.f(xcg1.g(cy30.f(this.a.hashCode() * 31, this.b, 31), 31, this.c), this.d, 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31), 31, this.k), 31, this.l), 31);
    }

    public final String i() {
        return this.e;
    }

    public final String j() {
        return this.l;
    }

    public final float k() {
        return this.g;
    }

    public final boolean l() {
        return this.k;
    }

    public final boolean m() {
        return this.c;
    }

    public final boolean n() {
        return this.n;
    }
}
