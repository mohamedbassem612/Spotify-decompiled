package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nlg0 implements plg0 {
    public final clg0 a;
    public final clg0 b;
    public final grn1 c;
    public final boolean d;
    public final long e;
    public final boolean f;
    public final long g;
    public final Integer h;
    public final Integer i;
    public final xm6 j;

    public nlg0(clg0 clg0Var, clg0 clg0Var2, grn1 grn1Var, boolean z, long j, boolean z2, long j2, Integer num, Integer num2, xm6 xm6Var) {
        this.a = clg0Var;
        this.b = clg0Var2;
        this.c = grn1Var;
        this.d = z;
        this.e = j;
        this.f = z2;
        this.g = j2;
        this.h = num;
        this.i = num2;
        this.j = xm6Var;
    }

    public final long a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nlg0)) {
            return false;
        }
        nlg0 nlg0Var = (nlg0) obj;
        if (!this.a.equals(nlg0Var.a) || !this.b.equals(nlg0Var.b) || !this.c.equals(nlg0Var.c) || this.d != nlg0Var.d) {
            return false;
        }
        long j = nlg0Var.e;
        int i = u7h.l;
        return z4h1.b(this.e, j) && this.f == nlg0Var.f && z4h1.b(this.g, nlg0Var.g) && u890.j(this.h, nlg0Var.h) && u890.j(this.i, nlg0Var.i) && u890.j(this.j, nlg0Var.j);
    }

    public final int hashCode() {
        int iG = xcg1.g((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        int i = u7h.l;
        int iF = cy30.f(xcg1.g(cy30.f(iG, this.e, 31), 31, this.f), this.g, 31);
        Integer num = this.h;
        int iHashCode = (iF + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.i;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        xm6 xm6Var = this.j;
        return iHashCode2 + (xm6Var != null ? xm6Var.hashCode() : 0);
    }
}
