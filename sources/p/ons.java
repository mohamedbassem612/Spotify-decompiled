package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ons extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pns b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ons(pns pnsVar, byte b) {
        super(1);
        this.a = b;
        this.b = pnsVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        pns pnsVar = this.b;
        switch (b) {
            case 0:
                return d3p1.F((d0r) pnsVar.b.b, t7c0.a, rih1Var);
            default:
                ((qtr) obj).b(new ep0(pnsVar, (lnm) null, (byte) 28));
                return rih1Var;
        }
    }
}
