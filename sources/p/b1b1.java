package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b1b1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c1b1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1b1(c1b1 c1b1Var, byte b) {
        super(1);
        this.a = b;
        this.b = c1b1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        c1b1 c1b1Var = this.b;
        switch (b) {
            case 0:
                return new a1b1(yoi1.g(c1b1Var.a), c1b1Var, (byte) 0);
            default:
                ((qtr) obj).b(new eri0(c1b1Var, (lnm) null, (byte) 15));
                return rih1.a;
        }
    }
}
