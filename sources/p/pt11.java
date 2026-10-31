package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pt11 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tt11 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pt11(tt11 tt11Var, byte b) {
        super(1);
        this.a = b;
        this.b = tt11Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        tt11 tt11Var = this.b;
        switch (b) {
            case 0:
                tt11Var.Y.c = (xe) obj;
                tt11Var.c();
                break;
            case 1:
                tt11Var.Y.d = (xe) obj;
                tt11Var.c();
                break;
            case 2:
                tt11Var.Y.e = (xe) obj;
                tt11Var.c();
                break;
            case 3:
                tt11Var.Y.f = (xe) obj;
                tt11Var.c();
                break;
            case 4:
                tt11Var.Y.a = (xe) obj;
                tt11Var.c();
                break;
            default:
                tt11Var.Y.b = (xe) obj;
                tt11Var.c();
                break;
        }
        return rih1Var;
    }
}
