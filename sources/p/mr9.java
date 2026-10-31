package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mr9 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ or9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mr9(or9 or9Var, byte b) {
        super(1);
        this.a = b;
        this.b = or9Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        or9 or9Var = this.b;
        switch (b) {
            case 0:
                or9Var.a.t(((Number) ((o95) obj).e()).floatValue());
                break;
            default:
                or9Var.b = (int) (((yr80) obj).a & 4294967295L);
                break;
        }
        return rih1Var;
    }
}
