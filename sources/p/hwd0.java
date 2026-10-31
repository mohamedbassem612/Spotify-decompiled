package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hwd0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lb50 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hwd0(lb50 lb50Var, byte b) {
        super(1);
        this.a = b;
        this.b = lb50Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lb50 lb50Var = this.b;
        switch (b) {
            case 0:
                lb50Var.invoke(new yxd0((String) obj, null));
                break;
            default:
                lb50Var.invoke(new jyd0((String) obj, null));
                break;
        }
        return rih1Var;
    }
}
