package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x260 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v260 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x260(v260 v260Var, byte b) {
        super(1);
        this.a = b;
        this.b = v260Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        v260 v260Var = this.b;
        switch (b) {
            case 0:
                ((kd31) obj).b(((Number) v260Var.b.getValue()).floatValue());
                break;
            case 1:
                ((kd31) obj).b(((Number) v260Var.a.getValue()).floatValue());
                break;
            default:
                ((kd31) obj).b(((Number) v260Var.a.getValue()).floatValue());
                break;
        }
        return rih1Var;
    }
}
