package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qw11 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hce1 b;
    public final /* synthetic */ qim0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qw11(hce1 hce1Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = hce1Var;
        this.c = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.c;
        hce1 hce1Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                z4p1.n(hce1Var, qim0Var, b0kVar, czo1.p(1));
                break;
            default:
                z4p1.o(hce1Var, qim0Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
