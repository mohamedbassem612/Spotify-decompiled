package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xxl1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ suh1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xxl1(suh1 suh1Var, byte b) {
        super(1);
        this.a = b;
        this.b = suh1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        suh1 suh1Var = this.b;
        switch (b) {
            case 0:
                return ((iz31) suh1Var.f).c();
            default:
                ((qtr) obj).b(new efj1(suh1Var, null, (byte) 6));
                return rih1.a;
        }
    }
}
