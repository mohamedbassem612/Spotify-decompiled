package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tib1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yxb0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tib1(yxb0 yxb0Var, byte b) {
        super(1);
        this.a = b;
        this.b = yxb0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        yxb0 yxb0Var = this.b;
        switch (b) {
            case 0:
                return new a1b1(((c9c0) yxb0Var.d).b.current(), (qib1) obj, (byte) 4);
            default:
                ((qtr) obj).b(new bgb1(yxb0Var, (lnm) null, (byte) 1));
                return rih1.a;
        }
    }
}
