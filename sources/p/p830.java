package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p830 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final say g;

    public p830(String str, String str2, String str3, String str4, boolean z, boolean z2, say sayVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = sayVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p830) {
            p830 p830Var = (p830) obj;
            return u890.j(this.a, p830Var.a) && u890.j(this.b, p830Var.b) && this.c.equals(p830Var.c) && this.d.equals(p830Var.d) && this.e == p830Var.e && this.f == p830Var.f && this.g == p830Var.g;
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode() + xcg1.g(xcg1.g(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }
}
