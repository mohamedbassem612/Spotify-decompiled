package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h8l1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final k4m f;
    public final o17 g;
    public final boolean h;
    public final Float i;
    public final String j;

    public /* synthetic */ h8l1(String str, String str2, String str3, String str4, String str5, k4m k4mVar, Float f, String str6, int i) {
        this(str, str2, (i & 4) != 0 ? null : str3, str4, str5, (i & 32) != 0 ? k4m.d : k4mVar, null, false, (i & 256) != 0 ? null : f, (i & 512) != 0 ? null : str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8l1)) {
            return false;
        }
        h8l1 h8l1Var = (h8l1) obj;
        return u890.j(this.a, h8l1Var.a) && u890.j(this.b, h8l1Var.b) && u890.j(this.c, h8l1Var.c) && u890.j(this.d, h8l1Var.d) && u890.j(this.e, h8l1Var.e) && this.f == h8l1Var.f && u890.j(this.g, h8l1Var.g) && this.h == h8l1Var.h && u890.j(this.i, h8l1Var.i) && u890.j(this.j, h8l1Var.j);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iG = p3d1.g(this.f, cy30.d(cy30.d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d), 31, this.e), 31);
        o17 o17Var = this.g;
        int iG2 = xcg1.g((iG + (o17Var == null ? 0 : o17Var.hashCode())) * 31, 31, this.h);
        Float f = this.i;
        int iHashCode3 = (iG2 + (f == null ? 0 : f.hashCode())) * 31;
        String str3 = this.j;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public h8l1(String str, String str2, String str3, String str4, String str5, k4m k4mVar, o17 o17Var, boolean z, Float f, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = k4mVar;
        this.g = o17Var;
        this.h = z;
        this.i = f;
        this.j = str6;
    }
}
