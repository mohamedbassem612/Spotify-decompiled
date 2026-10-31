package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class of6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ xgm1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ of6(int i, xgm1 xgm1Var, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = i;
        this.c = xgm1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        xgm1 xgm1Var = this.c;
        int i = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                wgo1.p(i, xgm1Var, b0kVar, czo1.p(1));
                break;
            default:
                ine1.b(i, xgm1Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
