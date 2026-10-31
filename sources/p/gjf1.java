package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gjf1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final j380 k;

    public gjf1(String str, String str2, String str3, String str4, String str5, String str6, int i, boolean z, boolean z2, boolean z3, j380 j380Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = i;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = j380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gjf1)) {
            return false;
        }
        gjf1 gjf1Var = (gjf1) obj;
        return this.a.equals(gjf1Var.a) && this.b.equals(gjf1Var.b) && this.c.equals(gjf1Var.c) && this.d.equals(gjf1Var.d) && u890.j(this.e, gjf1Var.e) && u890.j(this.f, gjf1Var.f) && this.g == gjf1Var.g && this.h == gjf1Var.h && this.i == gjf1Var.i && this.j == gjf1Var.j && this.k.equals(gjf1Var.k);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return this.k.hashCode() + xcg1.g(xcg1.g(xcg1.g(ab80.k(this.g, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31, this.h), 31, this.i), 31, this.j);
    }
}
