package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ogx0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ugx0 b;
    public final /* synthetic */ iix0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ogx0(ugx0 ugx0Var, iix0 iix0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = ugx0Var;
        this.c = iix0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iix0 iix0Var = this.c;
        ugx0 ugx0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                ugx0Var.f(iix0Var, b0kVar, czo1.p(1));
                break;
            case 1:
                ugx0Var.i(iix0Var, b0kVar, czo1.p(1));
                break;
            default:
                ugx0Var.j(iix0Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
