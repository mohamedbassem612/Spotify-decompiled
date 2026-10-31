package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class up51 {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final hy50 g;
    public final boolean h;
    public final Long i;

    public up51(String str, int i, String str2, String str3, int i2, String str4, hy50 hy50Var, boolean z, Long l) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = i2;
        this.f = str4;
        this.g = hy50Var;
        this.h = z;
        this.i = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up51)) {
            return false;
        }
        up51 up51Var = (up51) obj;
        return u890.j(this.a, up51Var.a) && this.b == up51Var.b && u890.j(this.c, up51Var.c) && u890.j(this.d, up51Var.d) && this.e == up51Var.e && u890.j(this.f, up51Var.f) && this.g.equals(up51Var.g) && this.h == up51Var.h && u890.j(this.i, up51Var.i);
    }

    public final int hashCode() {
        int iK = ab80.k(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int iHashCode = (iK + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iK2 = ab80.k(this.e, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f;
        int iG = xcg1.g((this.g.hashCode() + ((iK2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31, 31, this.h);
        Long l = this.i;
        return iG + (l != null ? l.hashCode() : 0);
    }
}
