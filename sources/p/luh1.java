package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class luh1 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final z740 k;
    public final z740 l;

    public luh1(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, z740 z740Var, z740 z740Var2) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
        this.j = z9;
        this.k = z740Var;
        this.l = z740Var2;
    }

    public static luh1 a(luh1 luh1Var, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, z740 z740Var, z740 z740Var2, int i) {
        if ((i & 1) != 0) {
            str = luh1Var.a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            z = luh1Var.b;
        }
        return new luh1(str2, z, (i & 4) != 0 ? luh1Var.c : z2, (i & 8) != 0 ? luh1Var.d : z3, (i & 16) != 0 ? luh1Var.e : z4, (i & 32) != 0 ? luh1Var.f : z5, (i & 64) != 0 ? luh1Var.g : z6, (i & 128) != 0 ? luh1Var.h : z7, (i & 256) != 0 ? luh1Var.i : z8, (i & 512) != 0 ? luh1Var.j : z9, (i & 1024) != 0 ? luh1Var.k : z740Var, (i & 2048) != 0 ? luh1Var.l : z740Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof luh1)) {
            return false;
        }
        luh1 luh1Var = (luh1) obj;
        return this.a.equals(luh1Var.a) && this.b == luh1Var.b && this.c == luh1Var.c && this.d == luh1Var.d && this.e == luh1Var.e && this.f == luh1Var.f && this.g == luh1Var.g && this.h == luh1Var.h && this.i == luh1Var.i && this.j == luh1Var.j && u890.j(this.k, luh1Var.k) && u890.j(this.l, luh1Var.l);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        z740 z740Var = this.k;
        int iHashCode = (iG + (z740Var == null ? 0 : z740Var.hashCode())) * 31;
        z740 z740Var2 = this.l;
        return iHashCode + (z740Var2 != null ? z740Var2.hashCode() : 0);
    }
}
