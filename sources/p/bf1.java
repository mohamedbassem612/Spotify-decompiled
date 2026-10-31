package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bf1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yg1 b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bf1(yg1 yg1Var, qim0 qim0Var, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = yg1Var;
        this.c = qim0Var;
        this.d = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        qim0 qim0Var = this.c;
        yg1 yg1Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                z5p1.a(yg1Var, qim0Var, iu30Var, b0kVar, czo1.p(1));
                break;
            default:
                b6p1.a(yg1Var, qim0Var, iu30Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
