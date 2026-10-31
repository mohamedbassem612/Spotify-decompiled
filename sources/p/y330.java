package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y330 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ng20 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y330(ng20 ng20Var, byte b) {
        super(1);
        this.a = b;
        this.b = ng20Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ng20 ng20Var = this.b;
        switch (b) {
            case 0:
                return new p3t(yoi1.g(((sd41) ng20Var.b).c(((o330) obj).a)), (byte) 24);
            default:
                ((qtr) obj).b(new js(ng20Var, (lnm) null, (byte) 10));
                return rih1.a;
        }
    }
}
