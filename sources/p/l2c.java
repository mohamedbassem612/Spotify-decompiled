package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l2c implements z0i {
    public final String X;
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final x2g0 f;
    public final String g;
    public final boolean h;
    public final String i;
    public final z0i t;

    public l2c(String str, String str2, boolean z, boolean z2, String str3, x2g0 x2g0Var, String str4, boolean z3, String str5, z0i z0iVar, String str6) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = str3;
        this.f = x2g0Var;
        this.g = str4;
        this.h = z3;
        this.i = str5;
        this.t = z0iVar;
        this.X = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2c)) {
            return false;
        }
        l2c l2cVar = (l2c) obj;
        return this.a.equals(l2cVar.a) && this.b.equals(l2cVar.b) && this.c == l2cVar.c && this.d == l2cVar.d && this.e.equals(l2cVar.e) && u890.j(this.f, l2cVar.f) && this.g.equals(l2cVar.g) && this.h == l2cVar.h && u890.j(this.i, l2cVar.i) && u890.j(this.t, l2cVar.t) && this.X.equals(l2cVar.X);
    }

    public final int hashCode() {
        int iD = cy30.d(xcg1.g(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        x2g0 x2g0Var = this.f;
        int iG = xcg1.g(cy30.d((iD + (x2g0Var == null ? 0 : x2g0Var.hashCode())) * 31, 31, this.g), 31, this.h);
        String str = this.i;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        z0i z0iVar = this.t;
        return this.X.hashCode() + ((iHashCode + (z0iVar != null ? z0iVar.hashCode() : 0)) * 31);
    }
}
