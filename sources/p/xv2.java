package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xv2 {
    public final String a;
    public final c380 b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final long f;

    public xv2(String str, c380 c380Var, boolean z, boolean z2, String str2, long j) {
        this.a = str;
        this.b = c380Var;
        this.c = z;
        this.d = z2;
        this.e = str2;
        this.f = j;
    }

    public static xv2 a(xv2 xv2Var, String str, c380 c380Var, boolean z, boolean z2, long j, int i) {
        if ((i & 2) != 0) {
            c380Var = xv2Var.b;
        }
        c380 c380Var2 = c380Var;
        if ((i & 4) != 0) {
            z = xv2Var.c;
        }
        boolean z3 = z;
        String str2 = xv2Var.e;
        if ((i & 32) != 0) {
            j = xv2Var.f;
        }
        xv2Var.getClass();
        return new xv2(str, c380Var2, z3, z2, str2, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xv2)) {
            return false;
        }
        xv2 xv2Var = (xv2) obj;
        return this.a.equals(xv2Var.a) && u890.j(this.b, xv2Var.b) && this.c == xv2Var.c && this.d == xv2Var.d && u890.j(this.e, xv2Var.e) && this.f == xv2Var.f;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(kk0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
        String str = this.e;
        return Long.hashCode(this.f) + ((iG + (str == null ? 0 : str.hashCode())) * 31);
    }
}
