package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hx21 {
    public final zw21 a;
    public final zw21 b;
    public final String c;
    public final zw21 d;
    public final boolean e;
    public final String f;
    public final hx21 g;

    public /* synthetic */ hx21(zw21 zw21Var, zw21 zw21Var2, String str, ynb ynbVar, int i) {
        this(zw21Var, zw21Var2, str, (i & 8) != 0 ? null : ynbVar, (i & 16) == 0, null, null);
    }

    public static hx21 a(hx21 hx21Var, String str, String str2, hx21 hx21Var2) {
        zw21 zw21Var = hx21Var.a;
        zw21 zw21Var2 = hx21Var.b;
        zw21 zw21Var3 = hx21Var.d;
        boolean z = hx21Var.e;
        hx21Var.getClass();
        return new hx21(zw21Var, zw21Var2, str, zw21Var3, z, str2, hx21Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hx21)) {
            return false;
        }
        hx21 hx21Var = (hx21) obj;
        return u890.j(this.a, hx21Var.a) && u890.j(this.b, hx21Var.b) && u890.j(this.c, hx21Var.c) && u890.j(this.d, hx21Var.d) && this.e == hx21Var.e && u890.j(this.f, hx21Var.f) && u890.j(this.g, hx21Var.g);
    }

    public final int hashCode() {
        int iD = cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        zw21 zw21Var = this.d;
        int iG = xcg1.g((iD + (zw21Var == null ? 0 : zw21Var.hashCode())) * 31, 31, this.e);
        String str = this.f;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        hx21 hx21Var = this.g;
        return iHashCode + (hx21Var != null ? hx21Var.hashCode() : 0);
    }

    public hx21(zw21 zw21Var, zw21 zw21Var2, String str, zw21 zw21Var3, boolean z, String str2, hx21 hx21Var) {
        this.a = zw21Var;
        this.b = zw21Var2;
        this.c = str;
        this.d = zw21Var3;
        this.e = z;
        this.f = str2;
        this.g = hx21Var;
    }
}
