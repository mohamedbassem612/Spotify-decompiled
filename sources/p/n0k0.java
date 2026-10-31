package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class n0k0 implements k1k0 {
    public final String a;
    public final String b;
    public final String c;
    public final double d;
    public final double e;
    public final int f;
    public final String g;

    public n0k0(String str, String str2, String str3, double d, double d2, int i, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = d;
        this.e = d2;
        this.f = i;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0k0)) {
            return false;
        }
        n0k0 n0k0Var = (n0k0) obj;
        return u890.j(this.a, n0k0Var.a) && u890.j(this.b, n0k0Var.b) && u890.j(this.c, n0k0Var.c) && Double.compare(this.d, n0k0Var.d) == 0 && Double.compare(this.e, n0k0Var.e) == 0 && this.f == n0k0Var.f && u890.j(this.g, n0k0Var.g);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iF = kaa0.f(this.f, xcg1.e(this.e, xcg1.e(this.d, (iD + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31);
        String str2 = this.g;
        return iF + (str2 != null ? str2.hashCode() : 0);
    }
}
