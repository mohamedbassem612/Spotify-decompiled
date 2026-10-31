package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class trf1 {
    public final String a;
    public final c380 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final String m;

    public trf1(String str, c380 c380Var, boolean z, boolean z2, boolean z3, String str2, String str3, String str4, boolean z4, boolean z5, boolean z6, boolean z7, String str5) {
        this.a = str;
        this.b = c380Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = z4;
        this.j = z5;
        this.k = z6;
        this.l = z7;
        this.m = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof trf1)) {
            return false;
        }
        trf1 trf1Var = (trf1) obj;
        return u890.j(this.a, trf1Var.a) && u890.j(this.b, trf1Var.b) && this.c == trf1Var.c && this.d == trf1Var.d && this.e == trf1Var.e && this.f.equals(trf1Var.f) && this.g.equals(trf1Var.g) && u890.j(this.h, trf1Var.h) && this.i == trf1Var.i && this.j == trf1Var.j && this.k == trf1Var.k && this.l == trf1Var.l && this.m.equals(trf1Var.m);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(xcg1.g(xcg1.g(xcg1.g(kk0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        return this.m.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }
}
