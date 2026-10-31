package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zl11 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final boolean i;

    public zl11(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = str5;
        this.h = z3;
        this.i = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl11)) {
            return false;
        }
        zl11 zl11Var = (zl11) obj;
        return u890.j(this.a, zl11Var.a) && u890.j(this.b, zl11Var.b) && this.c.equals(zl11Var.c) && u890.j(this.d, zl11Var.d) && this.e == zl11Var.e && this.f == zl11Var.f && u890.j(this.g, zl11Var.g) && this.h == zl11Var.h && this.i == zl11Var.i;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iG = xcg1.g(xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f);
        String str2 = this.g;
        return Boolean.hashCode(this.i) + xcg1.g((iG + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.h);
    }
}
