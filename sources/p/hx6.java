package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hx6 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final g90 g;

    public hx6(String str, String str2, String str3, String str4, boolean z, boolean z2, g90 g90Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = g90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hx6) {
            hx6 hx6Var = (hx6) obj;
            return u890.j(this.a, hx6Var.a) && u890.j(this.b, hx6Var.b) && this.c.equals(hx6Var.c) && this.d.equals(hx6Var.d) && this.e == hx6Var.e && this.f == hx6Var.f && this.g == hx6Var.g;
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode() + xcg1.g(xcg1.g(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }
}
