package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hpq0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    public hpq0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, String str2, String str3, String str4, String str5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpq0)) {
            return false;
        }
        hpq0 hpq0Var = (hpq0) obj;
        return this.a == hpq0Var.a && this.b == hpq0Var.b && this.c == hpq0Var.c && this.d == hpq0Var.d && this.e == hpq0Var.e && u890.j(this.f, hpq0Var.f) && u890.j(this.g, hpq0Var.g) && u890.j(this.h, hpq0Var.h) && u890.j(this.i, hpq0Var.i) && u890.j(this.j, hpq0Var.j);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.j;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
