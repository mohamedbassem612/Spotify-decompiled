package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class un9 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nl9 b;
    public final /* synthetic */ qim0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ un9(nl9 nl9Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = nl9Var;
        this.c = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.c;
        nl9 nl9Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                nl9Var.e(qim0Var, b0kVar, czo1.p(1));
                break;
            default:
                nl9Var.f(qim0Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
