package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class aof0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vef0 b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aof0(vef0 vef0Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = vef0Var;
        this.c = qim0Var;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        qim0 qim0Var = this.c;
        vef0 vef0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                bof0.f(vef0Var, qim0Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                bof0.i(vef0Var, qim0Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
