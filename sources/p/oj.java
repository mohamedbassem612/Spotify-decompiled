package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oj extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mj b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ gw70 d;
    public final /* synthetic */ qim0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oj(mj mjVar, iu30 iu30Var, gw70 gw70Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = mjVar;
        this.c = iu30Var;
        this.d = gw70Var;
        this.e = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                qim0 qim0Var = this.e;
                int iP = czo1.p(1);
                dxo1.a(this.b, this.c, this.d, qim0Var, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                qim0 qim0Var2 = this.e;
                int iP2 = czo1.p(1);
                dxo1.d(this.b, this.c, this.d, qim0Var2, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
