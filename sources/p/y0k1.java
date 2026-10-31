package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class y0k1 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public y0k1(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
    }

    public static y0k1 a(y0k1 y0k1Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i) {
        boolean z7 = z;
        String str = y0k1Var.a;
        if ((i & 2) != 0) {
            z7 = y0k1Var.b;
        }
        if ((i & 4) != 0) {
            z2 = y0k1Var.c;
        }
        if ((i & 8) != 0) {
            z3 = y0k1Var.d;
        }
        if ((i & 16) != 0) {
            z4 = y0k1Var.e;
        }
        if ((i & 32) != 0) {
            z5 = y0k1Var.f;
        }
        if ((i & 64) != 0) {
            z6 = y0k1Var.g;
        }
        boolean z8 = z6;
        boolean z9 = z5;
        boolean z10 = z4;
        boolean z11 = z3;
        return new y0k1(str, z7, z2, z11, z10, z9, z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0k1)) {
            return false;
        }
        y0k1 y0k1Var = (y0k1) obj;
        return this.a.equals(y0k1Var.a) && this.b == y0k1Var.b && this.c == y0k1Var.c && this.d == y0k1Var.d && this.e == y0k1Var.e && this.f == y0k1Var.f && this.g == y0k1Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }
}
