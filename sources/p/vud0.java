package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vud0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yud0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vud0(yud0 yud0Var, byte b) {
        super(1);
        this.a = b;
        this.b = yud0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        yud0 yud0Var = this.b;
        switch (b) {
            case 0:
                return yud0Var.d;
            default:
                ((qtr) obj).b(new skv(yud0Var, null, (byte) 22));
                return rih1.a;
        }
    }
}
