package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zq0 {
    public final ki0 a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final i6h1 f;

    public zq0(ki0 ki0Var, String str, boolean z, String str2, String str3, i6h1 i6h1Var) {
        this.a = ki0Var;
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = str3;
        this.f = i6h1Var;
    }

    public final ki0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zq0)) {
            return false;
        }
        zq0 zq0Var = (zq0) obj;
        return u890.j(this.a, zq0Var.a) && u890.j(this.b, zq0Var.b) && this.c == zq0Var.c && u890.j(this.d, zq0Var.d) && u890.j(this.e, zq0Var.e) && u890.j(this.f, zq0Var.f);
    }

    public final int hashCode() {
        ki0 ki0Var = this.a;
        int iHashCode = (ki0Var == null ? 0 : ki0Var.hashCode()) * 31;
        String str = this.b;
        int iG = xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        int iHashCode2 = (iG + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        i6h1 i6h1Var = this.f;
        return iHashCode3 + (i6h1Var != null ? i6h1Var.hashCode() : 0);
    }
}
