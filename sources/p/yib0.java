package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yib0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bjb0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yib0(bjb0 bjb0Var, byte b) {
        super(1);
        this.a = b;
        this.b = bjb0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        bjb0 bjb0Var = this.b;
        switch (b) {
            case 0:
                return new x010(d3p1.H(bjb0Var.a, bjb0Var.f, (wib0) obj), bjb0Var.b.l, new vv70(3, (lnm) null, (byte) 6), (byte) 1);
            default:
                ((qtr) obj).b(new skv(bjb0Var, (lnm) null, (byte) 16));
                return rih1.a;
        }
    }
}
