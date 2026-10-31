package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class poe1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nue1 b;
    public final /* synthetic */ qim0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ poe1(nue1 nue1Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = nue1Var;
        this.c = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.c;
        nue1 nue1Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                roe1.c(nue1Var, qim0Var, b0kVar, czo1.p(1));
                break;
            default:
                roe1.c(nue1Var, qim0Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
