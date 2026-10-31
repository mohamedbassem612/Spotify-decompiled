package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gea1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iea1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gea1(iea1 iea1Var, byte b) {
        super(1);
        this.a = b;
        this.b = iea1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        iea1 iea1Var = this.b;
        switch (b) {
            case 0:
                dea1 dea1Var = (dea1) obj;
                d0r d0rVar = iea1Var.a;
                return h5p1.s(d3p1.F(d0rVar, iea1Var.d, dea1Var), d3p1.F(d0rVar, iea1Var.e, dea1Var), d3p1.F(d0rVar, iea1Var.f, dea1Var.a), new sv8(dea1Var, iea1Var, (lnm) null, (byte) 9));
            case 1:
                dea1 dea1Var2 = (dea1) obj;
                String str = dea1Var2.a;
                d0r d0rVar2 = iea1Var.a;
                return new fea1(str, hqq0.k0(hqq0.g0(d0rVar2, iea1Var.d, dea1Var2), hqq0.e0(hqq0.g0(d0rVar2, iea1Var.e, dea1Var2)), h9a1.R0), (qtt0) u890.G(d0rVar2.b(iea1Var.f.a(str))));
            default:
                ((qtr) obj).b(new k8y0(iea1Var, (lnm) null, (byte) 19));
                return rih1.a;
        }
    }
}
