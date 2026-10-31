package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j7n0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jlw0 b;
    public final /* synthetic */ qim0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j7n0(jlw0 jlw0Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = jlw0Var;
        this.c = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.c;
        jlw0 jlw0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                w361.e(jlw0Var, qim0Var, b0kVar, czo1.p(1));
                break;
            default:
                l2p1.d(jlw0Var, qim0Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
