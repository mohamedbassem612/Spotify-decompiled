package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eg6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yj41 b;
    public final /* synthetic */ qim0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eg6(yj41 yj41Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = yj41Var;
        this.c = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.c;
        yj41 yj41Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                fho1.i(yj41Var, qim0Var, b0kVar, czo1.p(9));
                break;
            default:
                uj6.a(yj41Var, qim0Var, b0kVar, czo1.p(57));
                break;
        }
        return rih1Var;
    }
}
