package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kui1 implements fui1 {
    public final hui1 a;
    public final int b;
    public final long c;
    public final long d;

    public kui1(hui1 hui1Var, int i, long j) {
        this.a = hui1Var;
        this.b = i;
        this.c = ((long) (hui1Var.f() + hui1Var.h())) * 1000000;
        this.d = j * 1000000;
    }

    public final long a(long j) {
        long j2 = j + this.d;
        if (j2 <= 0) {
            return 0L;
        }
        long j3 = this.c;
        long j4 = j2 / j3;
        return (this.b == 1 || j4 % 2 == 0) ? j2 - (j4 * j3) : ((j4 + 1) * j3) - j2;
    }

    public final boolean b() {
        return true;
    }

    public final oe5 c(long j, oe5 oe5Var, oe5 oe5Var2, oe5 oe5Var3) {
        long j2 = this.d;
        long j3 = j + j2;
        long j4 = this.c;
        return j3 > j4 ? this.a.g(j4 - j2, oe5Var, oe5Var3, oe5Var2) : oe5Var2;
    }

    public final long e(oe5 oe5Var, oe5 oe5Var2, oe5 oe5Var3) {
        return Long.MAX_VALUE;
    }

    public final oe5 g(long j, oe5 oe5Var, oe5 oe5Var2, oe5 oe5Var3) {
        return this.a.g(a(j), oe5Var, oe5Var2, c(j, oe5Var, oe5Var3, oe5Var2));
    }

    public final oe5 n(long j, oe5 oe5Var, oe5 oe5Var2, oe5 oe5Var3) {
        return this.a.n(a(j), oe5Var, oe5Var2, c(j, oe5Var, oe5Var3, oe5Var2));
    }
}
