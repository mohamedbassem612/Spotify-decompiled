package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class arm0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uqm0 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ qim0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ arm0(uqm0 uqm0Var, iu30 iu30Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = uqm0Var;
        this.c = iu30Var;
        this.d = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.d;
        iu30 iu30Var = this.c;
        uqm0 uqm0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                crm0.h(uqm0Var, iu30Var, qim0Var, b0kVar, czo1.p(1));
                break;
            default:
                u7n0.i(uqm0Var, iu30Var, qim0Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
