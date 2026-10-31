package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hal1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tfx0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hal1(tfx0 tfx0Var, byte b) {
        super(1);
        this.a = b;
        this.b = tfx0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        tfx0 tfx0Var = this.b;
        switch (b) {
            case 0:
                tfx0Var.e.t((int) (((yr80) obj).a >> 32));
                break;
            default:
                tfx0Var.d.t((int) (((yr80) obj).a >> 32));
                break;
        }
        return rih1Var;
    }
}
