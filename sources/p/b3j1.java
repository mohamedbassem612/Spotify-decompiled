package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b3j1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hw2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b3j1(hw2 hw2Var, byte b) {
        super(1);
        this.a = b;
        this.b = hw2Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        hw2 hw2Var = this.b;
        switch (b) {
            case 0:
                h3j1 h3j1Var = (h3j1) obj;
                d0r d0rVar = hw2Var.b;
                return new x010(d3p1.H(d0rVar, hw2Var.c, h3j1Var), d3p1.H(d0rVar, (o3r) hw2Var.h, h3j1Var), new bu51(3, (lnm) null, (byte) 19), (byte) 1);
            default:
                ((qtr) obj).b(new eri0(hw2Var, (lnm) null, (byte) 22));
                return rih1.a;
        }
    }
}
