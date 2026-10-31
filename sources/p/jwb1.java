package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jwb1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lwb1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jwb1(lwb1 lwb1Var, byte b) {
        super(1);
        this.a = b;
        this.b = lwb1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        lwb1 lwb1Var = this.b;
        switch (b) {
            case 0:
                return d3p1.F(lwb1Var.a, lwb1Var.f, (bwb1) obj);
            default:
                qtr qtrVar = (qtr) obj;
                qtrVar.d(cgb1.S0, nva1.S0);
                qtrVar.b(new bnn(lwb1Var, (lnm) null, (byte) 1));
                return rih1.a;
        }
    }
}
