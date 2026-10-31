package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cgg0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cgg0(qj0 qj0Var, byte b) {
        super(1);
        this.a = b;
        this.b = qj0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        qj0 qj0Var = this.b;
        switch (b) {
            case 0:
                return ((czr0) qj0Var.e).d;
            default:
                ((qtr) obj).b(new kr(qj0Var, (lnm) null, (byte) 28));
                return rih1.a;
        }
    }
}
