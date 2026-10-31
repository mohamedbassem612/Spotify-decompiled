package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hua1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Float e;
    public final Float f;
    public final float g;
    public final boolean h;
    public final boolean i;
    public final ltt0 j;
    public final boolean k;
    public final boolean l;
    public final qig1 m;
    public final fxa1 n;
    public final nmw0 o;

    public hua1(String str, String str2, String str3, String str4, Float f, Float f2, float f3, boolean z, boolean z2, ltt0 ltt0Var, boolean z3, boolean z4, qig1 qig1Var, fxa1 fxa1Var, nmw0 nmw0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.h = z;
        this.i = z2;
        this.j = ltt0Var;
        this.k = z3;
        this.l = z4;
        this.m = qig1Var;
        this.n = fxa1Var;
        this.o = nmw0Var;
    }

    public static hua1 a(hua1 hua1Var, String str, String str2, String str3, String str4, Float f, Float f2, float f3, boolean z, boolean z2, ltt0 ltt0Var, boolean z3, boolean z4, qig1 qig1Var, fxa1 fxa1Var, nmw0 nmw0Var, int i) {
        return new hua1((i & 1) != 0 ? hua1Var.a : str, (i & 2) != 0 ? hua1Var.b : str2, (i & 4) != 0 ? hua1Var.c : str3, (i & 8) != 0 ? hua1Var.d : str4, (i & 16) != 0 ? hua1Var.e : f, (i & 32) != 0 ? hua1Var.f : f2, (i & 64) != 0 ? hua1Var.g : f3, (i & 128) != 0 ? hua1Var.h : z, (i & 256) != 0 ? hua1Var.i : z2, (i & 512) != 0 ? hua1Var.j : ltt0Var, (i & 1024) != 0 ? hua1Var.k : z3, (i & 2048) != 0 ? hua1Var.l : z4, (i & 4096) != 0 ? hua1Var.m : qig1Var, (i & 8192) != 0 ? hua1Var.n : fxa1Var, (i & 16384) != 0 ? hua1Var.o : nmw0Var);
    }

    public final boolean b() {
        ltt0 ltt0Var = ltt0.c;
        ltt0 ltt0Var2 = this.j;
        return ltt0Var2 == ltt0Var || ltt0Var2 == ltt0.d || ltt0Var2 == ltt0.e || ltt0Var2 == ltt0.f || this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hua1)) {
            return false;
        }
        hua1 hua1Var = (hua1) obj;
        return u890.j(this.a, hua1Var.a) && u890.j(this.b, hua1Var.b) && u890.j(this.c, hua1Var.c) && u890.j(this.d, hua1Var.d) && u890.j(this.e, hua1Var.e) && u890.j(this.f, hua1Var.f) && Float.compare(this.g, hua1Var.g) == 0 && this.h == hua1Var.h && this.i == hua1Var.i && this.j == hua1Var.j && this.k == hua1Var.k && this.l == hua1Var.l && u890.j(this.m, hua1Var.m) && u890.j(this.n, hua1Var.n) && u890.j(this.o, hua1Var.o);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Float f = this.e;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.f;
        int iG = xcg1.g(xcg1.g((this.j.hashCode() + xcg1.g(xcg1.g(x0d.f((iHashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i)) * 31, 31, this.k), 31, this.l);
        qig1 qig1Var = this.m;
        int iHashCode3 = (this.n.hashCode() + ((iG + (qig1Var == null ? 0 : qig1Var.hashCode())) * 31)) * 31;
        nmw0 nmw0Var = this.o;
        return iHashCode3 + (nmw0Var != null ? nmw0Var.hashCode() : 0);
    }
}
