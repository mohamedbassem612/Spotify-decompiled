package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cs11 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public cs11(int i, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        str4 = (i & 8) != 0 ? null : str4;
        boolean z3 = (i & 16) == 0;
        z = (i & 32) != 0 ? false : z;
        z2 = (i & 64) != 0 ? false : z2;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z3;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs11)) {
            return false;
        }
        cs11 cs11Var = (cs11) obj;
        return u890.j(this.a, cs11Var.a) && u890.j(this.b, cs11Var.b) && this.c.equals(cs11Var.c) && u890.j(this.d, cs11Var.d) && this.e == cs11Var.e && this.f == cs11Var.f && this.g == cs11Var.g;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.g) + xcg1.g(xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f);
    }
}
