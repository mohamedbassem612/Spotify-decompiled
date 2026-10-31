package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fju {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final mr20 k;
    public final mr20 l;
    public final boolean m;

    public fju(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, String str, mr20 mr20Var, mr20 mr20Var2, boolean z10) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
        this.j = str;
        this.k = mr20Var;
        this.l = mr20Var2;
        this.m = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fju)) {
            return false;
        }
        fju fjuVar = (fju) obj;
        return this.a == fjuVar.a && this.b == fjuVar.b && this.c == fjuVar.c && this.d == fjuVar.d && this.e == fjuVar.e && this.f == fjuVar.f && this.g == fjuVar.g && this.h == fjuVar.h && this.i == fjuVar.i && u890.j(this.j, fjuVar.j) && u890.j(this.k, fjuVar.k) && u890.j(this.l, fjuVar.l) && this.m == fjuVar.m;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        String str = this.j;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        mr20 mr20Var = this.k;
        int iHashCode2 = (iHashCode + (mr20Var == null ? 0 : mr20Var.hashCode())) * 31;
        mr20 mr20Var2 = this.l;
        return Boolean.hashCode(this.m) + ((iHashCode2 + (mr20Var2 != null ? mr20Var2.hashCode() : 0)) * 31);
    }
}
