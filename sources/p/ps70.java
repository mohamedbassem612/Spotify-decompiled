package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ps70 {
    public final int a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Double h;
    public final boolean i;
    public final String j;

    public ps70(int i, String str, int i2, String str2, String str3, String str4, String str5, Double d, boolean z, String str6) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = d;
        this.i = z;
        this.j = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps70)) {
            return false;
        }
        ps70 ps70Var = (ps70) obj;
        return this.a == ps70Var.a && u890.j(this.b, ps70Var.b) && this.c == ps70Var.c && u890.j(this.d, ps70Var.d) && u890.j(this.e, ps70Var.e) && u890.j(this.f, ps70Var.f) && u890.j(this.g, ps70Var.g) && u890.j(this.h, ps70Var.h) && this.i == ps70Var.i && u890.j(this.j, ps70Var.j);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(kaa0.f(this.c, cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.h;
        int iG = xcg1.g((iHashCode2 + (d == null ? 0 : d.hashCode())) * 31, 31, this.i);
        String str3 = this.j;
        return iG + (str3 != null ? str3.hashCode() : 0);
    }
}
