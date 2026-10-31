package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fvi1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ evi1 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ qim0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fvi1(evi1 evi1Var, iu30 iu30Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = evi1Var;
        this.c = iu30Var;
        this.d = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.d;
        iu30 iu30Var = this.c;
        evi1 evi1Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                gyo1.D(evi1Var, iu30Var, qim0Var, b0kVar, czo1.p(1));
                break;
            default:
                gyo1.E(evi1Var, iu30Var, qim0Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
