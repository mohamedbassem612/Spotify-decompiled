package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rkv extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rkv(qj0 qj0Var, byte b) {
        super(1);
        this.a = b;
        this.b = qj0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        qj0 qj0Var = this.b;
        switch (b) {
            case 0:
                return new m441(new rzu(qj0Var, (okv) obj, (lnm) null, (byte) 3));
            default:
                ((qtr) obj).b(new skv(qj0Var, null, (byte) 0));
                return rih1.a;
        }
    }
}
