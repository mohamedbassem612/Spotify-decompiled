package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tx01 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;

    public tx01(String str, String str2, String str3, String str4, Long l, boolean z, boolean z2, boolean z3, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = l;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx01)) {
            return false;
        }
        tx01 tx01Var = (tx01) obj;
        return u890.j(this.a, tx01Var.a) && u890.j(this.b, tx01Var.b) && u890.j(this.c, tx01Var.c) && u890.j(this.d, tx01Var.d) && u890.j(this.e, tx01Var.e) && this.f == tx01Var.f && this.g == tx01Var.g && this.h == tx01Var.h && u890.j(this.i, tx01Var.i);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.e;
        int iG = xcg1.g(xcg1.g(xcg1.g((iHashCode2 + (l == null ? 0 : l.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h);
        String str3 = this.i;
        return iG + (str3 != null ? str3.hashCode() : 0);
    }
}
