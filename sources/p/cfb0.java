package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cfb0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ng20 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cfb0(ng20 ng20Var, byte b) {
        super(1);
        this.a = b;
        this.b = ng20Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ng20 ng20Var = this.b;
        switch (b) {
            case 0:
                return ((ffb0) ng20Var.b).a();
            default:
                ((qtr) obj).b(new kr(ng20Var, (lnm) null, (byte) 23));
                return rih1.a;
        }
    }
}
