package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u6g1 {
    public final q4r a;
    public final an01 b;
    public final int c;
    public final bm20 d;
    public final int e;
    public final Integer f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public u6g1(q4r q4rVar, an01 an01Var, int i, bm20 bm20Var, int i2, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = q4rVar;
        this.b = an01Var;
        this.c = i;
        this.d = bm20Var;
        this.e = i2;
        this.f = num;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6g1)) {
            return false;
        }
        u6g1 u6g1Var = (u6g1) obj;
        return this.a.equals(u6g1Var.a) && this.b.equals(u6g1Var.b) && this.c == u6g1Var.c && this.d.equals(u6g1Var.d) && this.e == u6g1Var.e && u890.j(this.f, u6g1Var.f) && this.g == u6g1Var.g && this.h == u6g1Var.h && this.i == u6g1Var.i && this.j == u6g1Var.j && this.k == u6g1Var.k;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = this.c;
        int iK = ab80.k(this.e, (this.d.hashCode() + ((iHashCode + (i == 0 ? 0 : l1d.C(i))) * 31)) * 31, 31);
        Integer num = this.f;
        return Boolean.hashCode(this.k) + xcg1.g(xcg1.g(xcg1.g(xcg1.g((iK + (num != null ? num.hashCode() : 0)) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }
}
