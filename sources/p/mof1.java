package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mof1 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final l4m f;
    public final boolean g;
    public final gqa1 h;
    public final boolean i;
    public final String j;
    public final String k;
    public final String l;

    public mof1(String str, String str2, String str3, boolean z, boolean z2, l4m l4mVar, boolean z3, gqa1 gqa1Var, boolean z4, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = l4mVar;
        this.g = z3;
        this.h = gqa1Var;
        this.i = z4;
        this.j = str4;
        this.k = str5;
        this.l = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mof1)) {
            return false;
        }
        mof1 mof1Var = (mof1) obj;
        return u890.j(this.a, mof1Var.a) && this.b.equals(mof1Var.b) && this.c.equals(mof1Var.c) && this.d == mof1Var.d && this.e == mof1Var.e && this.f == mof1Var.f && this.g == mof1Var.g && u890.j(this.h, mof1Var.h) && this.i == mof1Var.i && u890.j(this.j, mof1Var.j) && u890.j(this.k, mof1Var.k) && u890.j(this.l, mof1Var.l);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g((this.h.hashCode() + xcg1.g((this.f.hashCode() + xcg1.g(xcg1.g(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31, 31, this.g)) * 31, 31, this.i), 31, false);
        String str = this.j;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.l;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
