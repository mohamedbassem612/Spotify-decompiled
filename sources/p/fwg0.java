package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fwg0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final twg0 l;
    public final String m;
    public final mgc n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f19p;

    public fwg0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, twg0 twg0Var, String str12, mgc mgcVar, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
        this.l = twg0Var;
        this.m = str12;
        this.n = mgcVar;
        this.o = z;
        this.f19p = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fwg0) {
            fwg0 fwg0Var = (fwg0) obj;
            if (u890.j(this.a, fwg0Var.a) && u890.j(this.b, fwg0Var.b) && u890.j(this.c, fwg0Var.c) && u890.j(this.d, fwg0Var.d) && u890.j(this.e, fwg0Var.e) && u890.j(this.f, fwg0Var.f) && u890.j(this.g, fwg0Var.g) && u890.j(this.h, fwg0Var.h) && u890.j(this.i, fwg0Var.i) && u890.j(this.j, fwg0Var.j) && u890.j(this.k, fwg0Var.k) && this.l == fwg0Var.l && u890.j(this.m, fwg0Var.m) && this.n == fwg0Var.n && this.o == fwg0Var.o && this.f19p == fwg0Var.f19p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        String str2 = this.h;
        int iD2 = cy30.d(cy30.d((iD + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.i), 31, this.j);
        String str3 = this.k;
        int iHashCode2 = (iD2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        twg0 twg0Var = this.l;
        int iHashCode3 = (iHashCode2 + (twg0Var == null ? 0 : twg0Var.hashCode())) * 31;
        String str4 = this.m;
        return Boolean.hashCode(this.f19p) + xcg1.g((this.n.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31)) * 31, 31, this.o);
    }
}
