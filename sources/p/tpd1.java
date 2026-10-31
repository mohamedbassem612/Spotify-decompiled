package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tpd1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t6k0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tpd1(t6k0 t6k0Var, byte b) {
        super(1);
        this.a = b;
        this.b = t6k0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        t6k0 t6k0Var = this.b;
        switch (b) {
            case 0:
                rpd1 rpd1Var = (rpd1) obj;
                d0r d0rVar = (d0r) t6k0Var.f;
                String str = rpd1Var.a;
                int iC = l1d.C(rpd1Var.b);
                if (iC == 0) {
                    return d3p1.F(d0rVar, ma10.b, str);
                }
                if (iC == 1) {
                    return d3p1.F(d0rVar, ma10.c, str);
                }
                eg.o();
                return null;
            default:
                ((qtr) obj).b(new eri0(t6k0Var, (lnm) null, (byte) 17));
                return rih1.a;
        }
    }
}
