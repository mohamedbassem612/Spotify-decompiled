package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y5p0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ poj0 b;
    public final /* synthetic */ qim0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y5p0(poj0 poj0Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = poj0Var;
        this.c = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.c;
        poj0 poj0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                poj0Var.c(qim0Var, b0kVar, czo1.p(1));
                break;
            default:
                poj0Var.c(qim0Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
