package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mu70 {
    public final String a;
    public final int b;
    public final String c;
    public final au70 d;
    public final n1x e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final l0x0 k;
    public final boolean l;
    public final Integer m;

    public /* synthetic */ mu70(String str, int i, String str2, au70 au70Var, n1x n1xVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, l0x0 l0x0Var, boolean z6, int i2) {
        this(str, i, str2, au70Var, n1xVar, z, z2, z3, (i2 & 256) != 0 ? false : z4, z5, l0x0Var, z6, (Integer) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mu70)) {
            return false;
        }
        mu70 mu70Var = (mu70) obj;
        return u890.j(this.a, mu70Var.a) && this.b == mu70Var.b && u890.j(this.c, mu70Var.c) && u890.j(this.d, mu70Var.d) && u890.j(this.e, mu70Var.e) && this.f == mu70Var.f && this.g == mu70Var.g && this.h == mu70Var.h && this.i == mu70Var.i && this.j == mu70Var.j && u890.j(this.k, mu70Var.k) && this.l == mu70Var.l && u890.j(this.m, mu70Var.m);
    }

    public final int hashCode() {
        int iD = cy30.d(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        this.d.getClass();
        int iC = (l1d.C(2) + iD) * 31;
        n1x n1xVar = this.e;
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((iC + (n1xVar == null ? 0 : n1xVar.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        l0x0 l0x0Var = this.k;
        int iG2 = xcg1.g((iG + (l0x0Var == null ? 0 : l0x0Var.hashCode())) * 31, 31, this.l);
        Integer num = this.m;
        return iG2 + (num != null ? num.hashCode() : 0);
    }

    public mu70(String str, int i, String str2, au70 au70Var, n1x n1xVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, l0x0 l0x0Var, boolean z6, Integer num) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = au70Var;
        this.e = n1xVar;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = l0x0Var;
        this.l = z6;
        this.m = num;
    }
}
