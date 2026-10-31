package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class bc9 implements fn51 {
    public final /* synthetic */ byte a;
    public final long b;
    public final Object c;

    public bc9(long j, long j2) {
        this.a = (byte) 2;
        this.b = j;
        pn51 pn51Var = j2 == 0 ? pn51.c : new pn51(0L, j2);
        this.c = new en51(pn51Var, pn51Var);
    }

    @Override // p.fn51
    public final en51 b(long j) {
        byte b = this.a;
        int i = 1;
        Object obj = this.c;
        switch (b) {
            case 0:
                dc9 dc9Var = (dc9) obj;
                en51 en51VarB = dc9Var.i[0].b(j);
                while (true) {
                    bbg[] bbgVarArr = dc9Var.i;
                    if (i >= bbgVarArr.length) {
                        return en51VarB;
                    }
                    en51 en51VarB2 = bbgVarArr[i].b(j);
                    if (en51VarB2.a.b < en51VarB.a.b) {
                        en51VarB = en51VarB2;
                    }
                    i++;
                }
                break;
            case 1:
                xn20 xn20Var = (xn20) obj;
                xn20Var.k.getClass();
                t7y t7yVar = xn20Var.k;
                long[] jArr = (long[]) t7yVar.b;
                long[] jArr2 = (long[]) t7yVar.c;
                int iF = zoi1.f(jArr, zoi1.k((((long) xn20Var.e) * j) / 1000000, 0L, xn20Var.j - 1), false);
                long j2 = iF == -1 ? 0L : jArr[iF];
                long j3 = iF != -1 ? jArr2[iF] : 0L;
                int i2 = xn20Var.e;
                long j4 = (j2 * 1000000) / ((long) i2);
                long j5 = this.b;
                pn51 pn51Var = new pn51(j4, j3 + j5);
                if (j4 == j || iF == jArr.length - 1) {
                    return new en51(pn51Var, pn51Var);
                }
                int i3 = iF + 1;
                return new en51(pn51Var, new pn51((jArr[i3] * 1000000) / ((long) i2), j5 + jArr2[i3]));
            default:
                return (en51) obj;
        }
    }

    @Override // p.fn51
    public final boolean d() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // p.fn51
    public final long g() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return ((xn20) this.c).b();
            default:
                return this.b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bc9(long j) {
        this(j, 0L);
        this.a = (byte) 2;
    }

    public /* synthetic */ bc9(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }
}
