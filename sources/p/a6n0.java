package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a6n0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b6n0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a6n0(b6n0 b6n0Var, byte b) {
        super(1);
        this.a = b;
        this.b = b6n0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        b6n0 b6n0Var = this.b;
        switch (b) {
            case 0:
                return b6n0Var.e;
            default:
                ((qtr) obj).b(new skv(b6n0Var, (lnm) null, (byte) 27));
                return rih1.a;
        }
    }
}
