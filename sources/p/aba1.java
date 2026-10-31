package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class aba1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cba1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aba1(cba1 cba1Var, byte b) {
        super(1);
        this.a = b;
        this.b = cba1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        cba1 cba1Var = this.b;
        switch (b) {
            case 0:
                xaa1 xaa1Var = (xaa1) obj;
                d0r d0rVar = cba1Var.a;
                return new x010(d3p1.F(d0rVar, cba1Var.c, xaa1Var), d3p1.F(d0rVar, cba1Var.d, xaa1Var), new t83(xaa1Var, cba1Var, (lnm) null, (byte) 11), (byte) 1);
            case 1:
                xaa1 xaa1Var2 = (xaa1) obj;
                d0r d0rVar2 = cba1Var.a;
                return new zaa1(xaa1Var2, hqq0.k0(hqq0.g0(d0rVar2, cba1Var.c, xaa1Var2), hqq0.e0(hqq0.g0(d0rVar2, cba1Var.d, xaa1Var2)), h9a1.Z));
            default:
                ((qtr) obj).b(new k8y0(cba1Var, (lnm) null, (byte) 18));
                return rih1.a;
        }
    }
}
