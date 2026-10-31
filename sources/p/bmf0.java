package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bmf0 {
    public final int a;
    public final String b;
    public final flb0 c;
    public final int d;
    public final String e;
    public final flb0 f;
    public final boolean g;
    public final long h;
    public final long i;
    public final amf0 j;
    public final Boolean k;
    public final int l;
    public final String m;
    public final boolean n;

    public bmf0(int i, String str, flb0 flb0Var, int i2, String str2, flb0 flb0Var2, boolean z, long j, long j2, amf0 amf0Var, Boolean bool, int i3, String str3, boolean z2) {
        this.a = i;
        this.b = str;
        this.c = flb0Var;
        this.d = i2;
        this.e = str2;
        this.f = flb0Var2;
        this.g = z;
        this.h = j;
        this.i = j2;
        this.j = amf0Var;
        this.k = bool;
        this.l = i3;
        this.m = str3;
        this.n = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmf0)) {
            return false;
        }
        bmf0 bmf0Var = (bmf0) obj;
        if (this.a != bmf0Var.a || !u890.j(this.b, bmf0Var.b) || this.c != bmf0Var.c || this.d != bmf0Var.d || !this.e.equals(bmf0Var.e) || this.f != bmf0Var.f || this.g != bmf0Var.g) {
            return false;
        }
        long j = bmf0Var.h;
        int i = u7h.l;
        return z4h1.b(this.h, j) && z4h1.b(this.i, bmf0Var.i) && this.j.equals(bmf0Var.j) && u890.j(this.k, bmf0Var.k) && this.l == bmf0Var.l && u890.j(this.m, bmf0Var.m) && this.n == bmf0Var.n;
    }

    public final int hashCode() {
        int iG = xcg1.g((this.f.hashCode() + cy30.d(kaa0.f(this.d, (this.c.hashCode() + cy30.d(Integer.hashCode(this.a) * 31, 31, this.b)) * 31, 31), 31, this.e)) * 31, 31, this.g);
        int i = u7h.l;
        int iHashCode = (this.j.hashCode() + cy30.f(cy30.f(iG, this.h, 31), this.i, 31)) * 31;
        Boolean bool = this.k;
        return Boolean.hashCode(this.n) + cy30.d(ab80.k(this.l, (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31), 31, this.m);
    }
}
