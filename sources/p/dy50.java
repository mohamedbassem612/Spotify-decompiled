package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dy50 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final mr20 i;
    public final mr20 j;
    public final boolean k;

    public dy50(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, boolean z7, int i) {
        z = (i & 1) != 0 ? false : z;
        z2 = (i & 2) != 0 ? false : z2;
        z3 = (i & 4) != 0 ? true : z3;
        z4 = (i & 8) != 0 ? false : z4;
        boolean z8 = (i & 16) != 0;
        z5 = (i & 32) != 0 ? true : z5;
        z6 = (i & 64) != 0 ? false : z6;
        str = (i & 128) != 0 ? null : str;
        z7 = (i & 1024) != 0 ? false : z7;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z8;
        this.f = z5;
        this.g = z6;
        this.h = str;
        this.i = null;
        this.j = null;
        this.k = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy50)) {
            return false;
        }
        dy50 dy50Var = (dy50) obj;
        return this.a == dy50Var.a && this.b == dy50Var.b && this.c == dy50Var.c && this.d == dy50Var.d && this.e == dy50Var.e && this.f == dy50Var.f && this.g == dy50Var.g && u890.j(this.h, dy50Var.h) && u890.j(this.i, dy50Var.i) && u890.j(this.j, dy50Var.j) && this.k == dy50Var.k;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        mr20 mr20Var = this.i;
        int iHashCode2 = (iHashCode + (mr20Var == null ? 0 : mr20Var.hashCode())) * 31;
        mr20 mr20Var2 = this.j;
        return Boolean.hashCode(this.k) + ((iHashCode2 + (mr20Var2 != null ? mr20Var2.hashCode() : 0)) * 31);
    }
}
