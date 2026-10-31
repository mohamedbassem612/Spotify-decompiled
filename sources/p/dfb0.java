package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dfb0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ng20 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dfb0(ng20 ng20Var, byte b) {
        super(3);
        this.a = b;
        this.b = ng20Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ng20 ng20Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                ng20Var.f((b0k) obj2, 0);
                break;
            case 1:
                ((Number) obj3).intValue();
                ng20Var.i((b0k) obj2, 0);
                break;
            default:
                ((Number) obj3).intValue();
                ng20Var.j((b0k) obj2, 0);
                break;
        }
        return rih1Var;
    }
}
