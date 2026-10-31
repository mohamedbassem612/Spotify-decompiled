package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uue1 implements yq80 {
    public final tue1 a;
    public final String b;
    public final String c;
    public final int d;
    public final Long e;
    public final String f;
    public final uqe1 g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final pje1 l;
    public final int m;

    public uue1(tue1 tue1Var, String str, String str2, int i, Long l, String str3, uqe1 uqe1Var, boolean z, boolean z2, boolean z3, boolean z4, pje1 pje1Var, int i2) {
        this.a = tue1Var;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = l;
        this.f = str3;
        this.g = uqe1Var;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = pje1Var;
        this.m = i2;
    }

    public final pje1 a() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uue1)) {
            return false;
        }
        uue1 uue1Var = (uue1) obj;
        return this.a.equals(uue1Var.a) && u890.j(this.b, uue1Var.b) && u890.j(this.c, uue1Var.c) && this.d == uue1Var.d && u890.j(this.e, uue1Var.e) && u890.j(this.f, uue1Var.f) && u890.j(this.g, uue1Var.g) && this.h == uue1Var.h && this.i == uue1Var.i && this.j == uue1Var.j && this.k == uue1Var.k && u890.j(this.l, uue1Var.l) && this.m == uue1Var.m;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iK = ab80.k(this.d, (iD + (str == null ? 0 : str.hashCode())) * 31, 31);
        Long l = this.e;
        int iHashCode = (iK + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        uqe1 uqe1Var = this.g;
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g((iHashCode2 + (uqe1Var == null ? 0 : uqe1Var.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k);
        pje1 pje1Var = this.l;
        return l1d.C(this.m) + ((iG + (pje1Var != null ? pje1Var.hashCode() : 0)) * 31);
    }
}
