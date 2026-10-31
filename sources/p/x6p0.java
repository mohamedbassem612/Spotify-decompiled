package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x6p0 implements yyf0 {
    public final int a;
    public final int b;
    public final int c;
    public final long d;

    public x6p0(long j, int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
    }

    public final yyf0 a(yyf0 yyf0Var, float f) {
        x6p0 x6p0Var = (x6p0) yyf0Var;
        return new x6p0(z4p1.A(f, this.d, x6p0Var.d), dm5.U(this.a, x6p0Var.a, f), dm5.U(this.b, x6p0Var.b, f), dm5.U(this.c, x6p0Var.c, f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6p0)) {
            return false;
        }
        x6p0 x6p0Var = (x6p0) obj;
        if (this.a != x6p0Var.a || this.b != x6p0Var.b || this.c != x6p0Var.c) {
            return false;
        }
        long j = x6p0Var.d;
        int i = u7h.l;
        return z4h1.b(this.d, j);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        int i = u7h.l;
        return Long.hashCode(this.d) + iF;
    }
}
