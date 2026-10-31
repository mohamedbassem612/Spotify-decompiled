package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a9f1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b9f1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a9f1(b9f1 b9f1Var, byte b) {
        super(1);
        this.a = b;
        this.b = b9f1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        b9f1 b9f1Var = this.b;
        switch (b) {
            case 0:
                return b9f1Var.a;
            default:
                ((qtr) obj).b(new bgb1(b9f1Var, (lnm) null, (byte) 5));
                return rih1.a;
        }
    }
}
