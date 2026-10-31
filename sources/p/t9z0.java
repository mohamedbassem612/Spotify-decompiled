package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t9z0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p9z0 b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ vu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t9z0(p9z0 p9z0Var, qim0 qim0Var, vu30 vu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = p9z0Var;
        this.c = qim0Var;
        this.d = vu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vu30 vu30Var = this.d;
        qim0 qim0Var = this.c;
        p9z0 p9z0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                ijo1.g(p9z0Var, qim0Var, vu30Var, b0kVar, czo1.p(1));
                break;
            default:
                ijo1.o(p9z0Var, qim0Var, vu30Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
