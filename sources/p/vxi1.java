package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vxi1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uxi1 b;
    public final /* synthetic */ qim0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vxi1(uxi1 uxi1Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = uxi1Var;
        this.c = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.c;
        uxi1 uxi1Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                ryo1.l(uxi1Var, qim0Var, b0kVar, czo1.p(1));
                break;
            default:
                ryo1.n(uxi1Var, qim0Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
