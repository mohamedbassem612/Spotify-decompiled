package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vra0 {
    public final rq2 a;
    public final boolean b;
    public final c380 c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;
    public final boolean h;
    public final String i;
    public final String j;
    public final c380 k;
    public final lpu l;
    public final boolean m;

    public vra0(rq2 rq2Var, boolean z, c380 c380Var, String str, String str2, int i, String str3, boolean z2, String str4, String str5, c380 c380Var2, lpu lpuVar, boolean z3) {
        this.a = rq2Var;
        this.b = z;
        this.c = c380Var;
        this.d = str;
        this.e = str2;
        this.f = i;
        this.g = str3;
        this.h = z2;
        this.i = str4;
        this.j = str5;
        this.k = c380Var2;
        this.l = lpuVar;
        this.m = z3;
    }

    public static vra0 a(vra0 vra0Var, rq2 rq2Var, boolean z, c380 c380Var, String str, String str2, int i, String str3, boolean z2, String str4, String str5, c380 c380Var2, lpu lpuVar, boolean z3, int i2) {
        if ((i2 & 1) != 0) {
            rq2Var = vra0Var.a;
        }
        return new vra0(rq2Var, (i2 & 2) != 0 ? vra0Var.b : z, (i2 & 4) != 0 ? vra0Var.c : c380Var, (i2 & 8) != 0 ? vra0Var.d : str, (i2 & 16) != 0 ? vra0Var.e : str2, (i2 & 32) != 0 ? vra0Var.f : i, (i2 & 64) != 0 ? vra0Var.g : str3, (i2 & 128) != 0 ? vra0Var.h : z2, (i2 & 256) != 0 ? vra0Var.i : str4, (i2 & 512) != 0 ? vra0Var.j : str5, (i2 & 1024) != 0 ? vra0Var.k : c380Var2, (i2 & 2048) != 0 ? vra0Var.l : lpuVar, (i2 & 4096) != 0 ? vra0Var.m : z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vra0)) {
            return false;
        }
        vra0 vra0Var = (vra0) obj;
        return this.a == vra0Var.a && this.b == vra0Var.b && u890.j(this.c, vra0Var.c) && this.d.equals(vra0Var.d) && this.e.equals(vra0Var.e) && this.f == vra0Var.f && u890.j(this.g, vra0Var.g) && this.h == vra0Var.h && u890.j(this.i, vra0Var.i) && u890.j(this.j, vra0Var.j) && u890.j(this.k, vra0Var.k) && this.l.equals(vra0Var.l) && this.m == vra0Var.m;
    }

    public final int hashCode() {
        int iK = ab80.k(this.f, cy30.d(cy30.d(kk0.f(this.c, xcg1.g(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31);
        String str = this.g;
        int iG = xcg1.g((iK + (str == null ? 0 : str.hashCode())) * 31, 31, this.h);
        String str2 = this.i;
        int iHashCode = (iG + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        return Boolean.hashCode(this.m) + ((this.l.hashCode() + kk0.f(this.k, (iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31, 31)) * 31);
    }
}
