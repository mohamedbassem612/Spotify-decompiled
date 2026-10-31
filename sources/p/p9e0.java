package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class p9e0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cr31 b;
    public final /* synthetic */ qim0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p9e0(cr31 cr31Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = cr31Var;
        this.c = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.c;
        cr31 cr31Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                x4p1.e(cr31Var, qim0Var, b0kVar, czo1.p(1));
                break;
            default:
                uah1.e(cr31Var, qim0Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
