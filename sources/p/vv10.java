package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vv10 {
    public final uv10 a;
    public final String b;
    public final Long c;
    public final boolean d;
    public final int e;
    public final int f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;
    public final boolean k;

    public vv10(uv10 uv10Var, String str, Long l, boolean z, int i, int i2, String str2, String str3, String str4, boolean z2, int i3) {
        l = (i3 & 4) != 0 ? null : l;
        z = (i3 & 8) != 0 ? false : z;
        i = (i3 & 16) != 0 ? 0 : i;
        i2 = (i3 & 32) != 0 ? 0 : i2;
        str3 = (i3 & 128) != 0 ? "" : str3;
        str4 = (i3 & 256) != 0 ? null : str4;
        z2 = (i3 & 512) != 0 ? false : z2;
        boolean z3 = (i3 & 1024) == 0;
        this.a = uv10Var;
        this.b = str;
        this.c = l;
        this.d = z;
        this.e = i;
        this.f = i2;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = z2;
        this.k = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv10)) {
            return false;
        }
        vv10 vv10Var = (vv10) obj;
        return this.a.equals(vv10Var.a) && u890.j(this.b, vv10Var.b) && u890.j(this.c, vv10Var.c) && this.d == vv10Var.d && this.e == vv10Var.e && this.f == vv10Var.f && u890.j(this.g, vv10Var.g) && this.h.equals(vv10Var.h) && u890.j(this.i, vv10Var.i) && this.j == vv10Var.j && this.k == vv10Var.k;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        Long l = this.c;
        int iF = kaa0.f(this.f, kaa0.f(this.e, xcg1.g((iD + (l == null ? 0 : l.hashCode())) * 31, 31, this.d), 31), 31);
        String str = this.g;
        int iD2 = cy30.d((iF + (str == null ? 0 : str.hashCode())) * 31, 31, this.h);
        String str2 = this.i;
        return Boolean.hashCode(this.k) + xcg1.g((iD2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.j);
    }
}
