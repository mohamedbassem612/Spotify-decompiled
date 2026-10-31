package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ohw0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ phw0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ohw0(phw0 phw0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = phw0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        phw0 phw0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                gm50.l(phw0Var, b0kVar, czo1.p(1));
                break;
            default:
                gm50.m(phw0Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
