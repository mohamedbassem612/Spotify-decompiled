package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xag0 {
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;
    public final int e;
    public final boolean f;
    public final int g;
    public final ndg0 h;
    public final kdg0 i;
    public final odg0 j;
    public final p9g0 k;

    public xag0(String str, String str2, String str3, Integer num, int i, boolean z, int i2, ndg0 ndg0Var, kdg0 kdg0Var, odg0 odg0Var, p9g0 p9g0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
        this.e = i;
        this.f = z;
        this.g = i2;
        this.h = ndg0Var;
        this.i = kdg0Var;
        this.j = odg0Var;
        this.k = p9g0Var;
    }

    public static xag0 a(xag0 xag0Var, ndg0 ndg0Var, int i) {
        String str = xag0Var.a;
        String str2 = xag0Var.b;
        String str3 = xag0Var.c;
        Integer num = xag0Var.d;
        int i2 = xag0Var.e;
        boolean z = xag0Var.f;
        int i3 = xag0Var.g;
        if ((i & 128) != 0) {
            ndg0Var = xag0Var.h;
        }
        return new xag0(str, str2, str3, num, i2, z, i3, ndg0Var, (i & 256) != 0 ? xag0Var.i : null, xag0Var.j, xag0Var.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xag0)) {
            return false;
        }
        xag0 xag0Var = (xag0) obj;
        return this.a.equals(xag0Var.a) && this.b.equals(xag0Var.b) && u890.j(this.c, xag0Var.c) && u890.j(this.d, xag0Var.d) && this.e == xag0Var.e && this.f == xag0Var.f && this.g == xag0Var.g && u890.j(this.h, xag0Var.h) && u890.j(this.i, xag0Var.i) && u890.j(this.j, xag0Var.j) && this.k.equals(xag0Var.k);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        int iF = kaa0.f(this.g, xcg1.g(ab80.k(this.e, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31, this.f), 31);
        ndg0 ndg0Var = this.h;
        int iHashCode2 = (iF + (ndg0Var == null ? 0 : ndg0Var.hashCode())) * 31;
        kdg0 kdg0Var = this.i;
        int iHashCode3 = (iHashCode2 + (kdg0Var == null ? 0 : Integer.hashCode(kdg0Var.a))) * 31;
        odg0 odg0Var = this.j;
        return l1d.C(this.k.a) + ((iHashCode3 + (odg0Var != null ? odg0Var.hashCode() : 0)) * 31);
    }
}
