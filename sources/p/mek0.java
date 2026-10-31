package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mek0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pek0 b;
    public final /* synthetic */ qim0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mek0(pek0 pek0Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = pek0Var;
        this.c = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.c;
        pek0 pek0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                pek0Var.e(qim0Var, b0kVar, czo1.p(1));
                break;
            default:
                pek0Var.j(qim0Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
