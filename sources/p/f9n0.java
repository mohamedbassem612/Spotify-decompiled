package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f9n0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z8n0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f9n0(z8n0 z8n0Var, byte b) {
        super(3);
        this.a = b;
        this.b = z8n0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        y8n0 y8n0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                ha71.h(y8n0Var, (b0k) obj2, 0);
                break;
            default:
                ((Number) obj3).intValue();
                ha71.j(y8n0Var.a, (b0k) obj2, 0);
                break;
        }
        return rih1Var;
    }
}
