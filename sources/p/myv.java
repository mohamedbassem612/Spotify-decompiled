package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class myv {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;
    public final String g;
    public final String h;
    public final Boolean i;
    public final boolean j;
    public final lrz0 k;
    public final String l;
    public final boolean m;

    public /* synthetic */ myv(String str, String str2, String str3, String str4, boolean z, int i, String str5, String str6, Boolean bool) {
        this(str, str2, str3, str4, z, i, str5, str6, bool, false, new lrz0(0, 0, 7, 0), null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof myv)) {
            return false;
        }
        myv myvVar = (myv) obj;
        return u890.j(this.a, myvVar.a) && u890.j(this.b, myvVar.b) && u890.j(this.c, myvVar.c) && u890.j(this.d, myvVar.d) && this.e == myvVar.e && this.f == myvVar.f && u890.j(this.g, myvVar.g) && u890.j(this.h, myvVar.h) && u890.j(this.i, myvVar.i) && this.j == myvVar.j && u890.j(this.k, myvVar.k) && u890.j(this.l, myvVar.l) && this.m == myvVar.m;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iD = cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        int iF = kaa0.f(this.f, xcg1.g((iD + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e), 31);
        String str3 = this.g;
        int iHashCode2 = (iF + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.i;
        int iHashCode4 = (this.k.hashCode() + xcg1.g((iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.j)) * 31;
        String str5 = this.l;
        return Boolean.hashCode(this.m) + ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public myv(String str, String str2, String str3, String str4, boolean z, int i, String str5, String str6, Boolean bool, boolean z2, lrz0 lrz0Var, String str7, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = i;
        this.g = str5;
        this.h = str6;
        this.i = bool;
        this.j = z2;
        this.k = lrz0Var;
        this.l = str7;
        this.m = z3;
    }
}
