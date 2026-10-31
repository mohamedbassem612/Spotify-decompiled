package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vr30 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wr30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vr30(wr30 wr30Var, byte b) {
        super(1);
        this.a = b;
        this.b = wr30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        wr30 wr30Var = this.b;
        switch (b) {
            case 0:
                return new tr30(((ur30) obj).a, wr30Var.e);
            default:
                ((qtr) obj).b(new skv(wr30Var, (lnm) null, (byte) 10));
                return rih1.a;
        }
    }
}
