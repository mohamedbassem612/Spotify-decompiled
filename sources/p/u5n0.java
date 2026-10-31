package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u5n0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final s5n0 e;
    public final h5n0 f;
    public final String g;
    public final int h;
    public final String i;
    public final int j;

    public u5n0(String str, String str2, String str3, String str4, s5n0 s5n0Var, h5n0 h5n0Var, String str5, int i, String str6, int i2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = s5n0Var;
        this.f = h5n0Var;
        this.g = str5;
        this.h = i;
        this.i = str6;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5n0)) {
            return false;
        }
        u5n0 u5n0Var = (u5n0) obj;
        return this.a.equals(u5n0Var.a) && this.b.equals(u5n0Var.b) && this.c.equals(u5n0Var.c) && this.d.equals(u5n0Var.d) && this.e.equals(u5n0Var.e) && this.f.equals(u5n0Var.f) && u890.j(this.g, u5n0Var.g) && this.h == u5n0Var.h && u890.j(this.i, u5n0Var.i) && this.j == u5n0Var.j;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31;
        String str = this.g;
        int iK = ab80.k(this.h, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.i;
        int iHashCode2 = (iK + (str2 == null ? 0 : str2.hashCode())) * 31;
        int i = this.j;
        return iHashCode2 + (i != 0 ? l1d.C(i) : 0);
    }
}
