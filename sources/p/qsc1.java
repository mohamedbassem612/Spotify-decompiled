package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qsc1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hdn0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qsc1(hdn0 hdn0Var, byte b) {
        super(1);
        this.a = b;
        this.b = hdn0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        err0 err0Var = this.b;
        switch (b) {
            case 0:
                err0Var.t((int) (((elb0) obj).b() & 4294967295L));
                break;
            case 1:
                err0Var.t((int) (((yr80) obj).a & 4294967295L));
                break;
            case 2:
                err0Var.t((int) (((yr80) obj).a >> 32));
                break;
            case 3:
                err0Var.t((int) (((yr80) obj).a >> 32));
                break;
            case 4:
                err0Var.t((int) (((yr80) obj).a >> 32));
                break;
            case 5:
                err0Var.t(((y9e1) obj).b.f);
                break;
            case 6:
                err0Var.t((int) (((yr80) obj).a & 4294967295L));
                break;
            default:
                err0Var.t((int) (((yr80) obj).a & 4294967295L));
                break;
        }
        return rih1Var;
    }
}
