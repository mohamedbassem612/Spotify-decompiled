package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fp11 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hp11 b;
    public final /* synthetic */ q381 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fp11(hp11 hp11Var, q381 q381Var, byte b) {
        super(1);
        this.a = b;
        this.b = hp11Var;
        this.c = q381Var;
    }

    public final Object invoke(Object obj) {
        yw50 yw50Var;
        yw50 yw50Var2;
        dx50 dx50Var;
        vu30 eyVar;
        byte b = this.a;
        q381 q381Var = this.c;
        hp11 hp11Var = this.b;
        switch (b) {
            case 0:
                t90 t90Var = hp11Var.a;
                String str = q381Var.a;
                boolean z = t90Var.j;
                n2 n2Var = new n2(t90Var, str, (byte) 6);
                boolean z2 = t90Var.k;
                if (z2) {
                    yw50Var = new yw50((bx50) null, n2Var, new m90(t90Var, (byte) 13), new m90(t90Var, (byte) 14), new m90(t90Var, (byte) 15), new m90(t90Var, (byte) 16), 1);
                } else {
                    yw50Var = new yw50((bx50) null, n2Var, new m90(t90Var, (byte) 9), new m90(t90Var, (byte) 10), new m90(t90Var, (byte) 11), z ? null : new m90(t90Var, (byte) 12), 1);
                }
                yw50 yw50Var3 = yw50Var;
                if (z2) {
                    yw50Var2 = new yw50((bx50) null, new m90(t90Var, (byte) 4), new m90(t90Var, (byte) 5), new m90(t90Var, (byte) 6), new m90(t90Var, (byte) 7), z ? null : new m90(t90Var, (byte) 8), 1);
                } else {
                    yw50Var2 = new yw50((bx50) null, new m90(t90Var, (byte) 0), new m90(t90Var, (byte) 1), new m90(t90Var, (byte) 2), z ? null : new m90(t90Var, (byte) 3), (vu30) null, 33);
                }
                vu30 vu30Var = yw50Var3.b;
                vu30 vu30Var2 = yw50Var2.b;
                if (vu30Var == null && vu30Var2 == null) {
                    dx50Var = null;
                    eyVar = null;
                } else {
                    dx50Var = null;
                    eyVar = new ey(t90Var, vu30Var, vu30Var2, str, true);
                }
                if (eyVar != null) {
                    return new fx50(new yw50((bx50) null, eyVar, t90.f(t90Var, str, yw50Var3.c, yw50Var2.c), t90.f(t90Var, str, yw50Var3.d, yw50Var2.d), t90.f(t90Var, str, yw50Var3.e, yw50Var2.e), t90.f(t90Var, str, yw50Var3.f, yw50Var2.f), 1), dx50Var, t90Var.m);
                }
                hhg1.n("Required value was null.");
                return dx50Var;
            default:
                return ggo1.B(hp11Var.k, q381Var.a, hp11Var.l, false, 8);
        }
    }
}
