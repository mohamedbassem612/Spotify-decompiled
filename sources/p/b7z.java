package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b7z {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final k4m h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final k540 l;
    public final String m;
    public final d2k1 n;

    public b7z(String str, String str2, String str3, String str4, String str5, String str6, String str7, k4m k4mVar, int i, boolean z, boolean z2, k540 k540Var, String str8, d2k1 d2k1Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = k4mVar;
        this.i = i;
        this.j = z;
        this.k = z2;
        this.l = k540Var;
        this.m = str8;
        this.n = d2k1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7z)) {
            return false;
        }
        b7z b7zVar = (b7z) obj;
        return this.a.equals(b7zVar.a) && u890.j(this.b, b7zVar.b) && this.c.equals(b7zVar.c) && u890.j(this.d, b7zVar.d) && u890.j(this.e, b7zVar.e) && u890.j(this.f, b7zVar.f) && u890.j(this.g, b7zVar.g) && this.h == b7zVar.h && this.i == b7zVar.i && this.j == b7zVar.j && this.k == b7zVar.k && u890.j(this.l, b7zVar.l) && u890.j(this.m, b7zVar.m) && u890.j(this.n, b7zVar.n);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iD = cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        int iHashCode2 = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int iG = p3d1.g(this.h, (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
        int i = this.i;
        int iG2 = xcg1.g(xcg1.g(xcg1.g(xcg1.g((iG + (i == 0 ? 0 : l1d.C(i))) * 31, 31, true), 31, false), 31, this.j), 31, this.k);
        k540 k540Var = this.l;
        int iHashCode5 = (iG2 + (k540Var == null ? 0 : k540Var.hashCode())) * 31;
        String str6 = this.m;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        d2k1 d2k1Var = this.n;
        return iHashCode6 + (d2k1Var != null ? d2k1Var.hashCode() : 0);
    }
}
