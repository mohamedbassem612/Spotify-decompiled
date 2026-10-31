package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ch1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yg1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ch1(yg1 yg1Var, byte b) {
        super(3);
        this.a = b;
        this.b = yg1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        yg1 yg1Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                uwo1.e(yg1Var.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (b0k) obj2, 0, 0, 2046);
                break;
            case 1:
                ((Number) obj3).intValue();
                m6p1.a(yg1Var, uyn1.z(16.0f, 0.0f, 2, nim0Var), (b0k) obj2, 0);
                break;
            case 2:
                ((Number) obj3).intValue();
                l6p1.a(yg1Var, uyn1.z(16.0f, 0.0f, 2, nim0Var), (b0k) obj2, 0);
                break;
            default:
                ((Number) obj3).intValue();
                w6p1.a(yg1Var, uyn1.z(16.0f, 0.0f, 2, nim0Var), (b0k) obj2, 0);
                break;
        }
        return rih1Var;
    }
}
