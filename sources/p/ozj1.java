package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ozj1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pzj1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ozj1(pzj1 pzj1Var, byte b) {
        super(1);
        this.a = b;
        this.b = pzj1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        pzj1 pzj1Var = this.b;
        switch (b) {
            case 0:
                return d3p1.H(pzj1Var.a, pzj1Var.d, (lzj1) obj);
            default:
                ((qtr) obj).b(new eri0(pzj1Var, (lnm) null, (byte) 23));
                return rih1.a;
        }
    }
}
