package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xr70 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Double g;
    public final String h;

    public xr70(int i, String str, String str2, String str3, String str4, String str5, Double d, String str6) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = d;
        this.h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr70)) {
            return false;
        }
        xr70 xr70Var = (xr70) obj;
        return this.a == xr70Var.a && u890.j(this.b, xr70Var.b) && u890.j(this.c, xr70Var.c) && u890.j(this.d, xr70Var.d) && u890.j(this.e, xr70Var.e) && u890.j(this.f, xr70Var.f) && u890.j(this.g, xr70Var.g) && u890.j(this.h, xr70Var.h);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.g;
        int iG = xcg1.g((iHashCode2 + (d == null ? 0 : d.hashCode())) * 31, 31, true);
        String str3 = this.h;
        return iG + (str3 != null ? str3.hashCode() : 0);
    }
}
