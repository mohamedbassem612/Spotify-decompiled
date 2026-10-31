package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j04 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yxb0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j04(yxb0 yxb0Var, byte b) {
        super(1);
        this.a = b;
        this.b = yxb0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        yxb0 yxb0Var = this.b;
        switch (b) {
            case 0:
                f04 f04Var = (f04) obj;
                return q601.b(f04Var instanceof e04 ? new gk((bpb1) yxb0Var.d, f04Var, (byte) 29) : new m441(new sd0(2, (lnm) null, (byte) 10)));
            default:
                ((qtr) obj).b(new k1(yxb0Var, (lnm) null, (byte) 3));
                return rih1.a;
        }
    }
}
