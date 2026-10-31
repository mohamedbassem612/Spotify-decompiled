package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g5g1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i5g1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g5g1(i5g1 i5g1Var, byte b) {
        super(1);
        this.a = b;
        this.b = i5g1Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    public final Object invoke(Object obj) {
        e5g1 e5g1Var;
        i1r i1rVarN;
        byte b = this.a;
        i5g1 i5g1Var = this.b;
        switch (b) {
            case 0:
                return hu20.e(((w2c1) i5g1Var.a).U(x5g1.class), new afb1((lnm) null, i5g1Var, (byte) 6));
            case 1:
                y4g1 y4g1Var = (y4g1) obj;
                w5g1 w5g1Var = (x5g1) ((w2c1) i5g1Var.a).U(x5g1.class).getValue();
                w5g1 w5g1Var2 = w5g1Var instanceof w5g1 ? w5g1Var : null;
                o5g1 o5g1Var = w5g1Var2 != null ? w5g1Var2.a : null;
                if (o5g1Var == null || (i1rVarN = x2p1.n(i5g1Var.b, i5g1Var.t, new g1q0(o5g1Var.a))) == null) {
                    e5g1Var = null;
                } else {
                    i1r i1rVar = i1rVarN instanceof i1r ? i1rVarN : null;
                    if (i1rVar != null) {
                        e5g1Var = (e5g1) i1rVar.a;
                    } else {
                        e5g1Var = null;
                    }
                }
                if (w5g1Var instanceof w5g1) {
                    return new a5g1(w5g1Var.a, e5g1Var != null ? e5g1Var.d : null, e5g1Var != null ? e5g1Var.a : ast0.c, e5g1Var != null ? e5g1Var.b : v4m.a, e5g1Var != null ? e5g1Var.c : p840.a, y4g1Var.a);
                }
                return z4g1.a;
            default:
                ((qtr) obj).b(new nqg1(i5g1Var, null, (byte) 1));
                return rih1.a;
        }
    }
}
