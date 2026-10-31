package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bq51 implements tsc, iui1 {
    public final int a;
    public int b;
    public final long c;
    public long d;
    public final Object e;

    public bq51(int i, hui1 hui1Var, int i2, long j) {
        this.a = i;
        this.e = hui1Var;
        this.b = i2;
        if (i < 1) {
            hhg1.n("Iterations count can't be less than 1");
            throw null;
        }
        this.c = ((long) (hui1Var.f() + hui1Var.h())) * 1000000;
        this.d = j * 1000000;
    }

    public void a(long j, long j2, long j3) {
        long j4 = this.d + j3;
        this.d = j4;
        ((vxu) this.e).f(c(), this.c, j4);
    }

    public float c() {
        long j = this.c;
        if (j != -1 && j != 0) {
            return zoi1.a0(this.d, j);
        }
        int i = this.a;
        if (i != 0) {
            return zoi1.a0(this.b, i);
        }
        return -1.0f;
    }

    public long d(long j) {
        long j2 = j + this.d;
        if (j2 <= 0) {
            return 0L;
        }
        long j3 = this.c;
        long jMin = Math.min(j2 / j3, ((long) this.a) - 1);
        return (this.b == 1 || jMin % 2 == 0) ? j2 - (jMin * j3) : ((jMin + 1) * j3) - j2;
    }

    public long e(oe5 oe5Var, oe5 oe5Var2, oe5 oe5Var3) {
        return (((long) this.a) * this.c) - this.d;
    }

    public oe5 g(long j, oe5 oe5Var, oe5 oe5Var2, oe5 oe5Var3) {
        return ((hui1) this.e).g(d(j), oe5Var, oe5Var2, i(j, oe5Var, oe5Var3, oe5Var2));
    }

    public oe5 i(long j, oe5 oe5Var, oe5 oe5Var2, oe5 oe5Var3) {
        long j2 = this.d;
        long j3 = j + j2;
        long j4 = this.c;
        return j3 > j4 ? g(j4 - j2, oe5Var, oe5Var2, oe5Var3) : oe5Var2;
    }

    public oe5 n(long j, oe5 oe5Var, oe5 oe5Var2, oe5 oe5Var3) {
        return ((hui1) this.e).n(d(j), oe5Var, oe5Var2, i(j, oe5Var, oe5Var3, oe5Var2));
    }

    public bq51(vxu vxuVar, long j, int i, long j2, int i2) {
        this.e = vxuVar;
        this.c = j;
        this.a = i;
        this.d = j2;
        this.b = i2;
    }
}
