package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bc8 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dc8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bc8(dc8 dc8Var, byte b) {
        super(1);
        this.a = b;
        this.b = dc8Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        dc8 dc8Var = this.b;
        switch (b) {
            case 0:
                return d3p1.F(dc8Var.a, dc8Var.d, (wb8) obj);
            default:
                ((qtr) obj).b(new ep0(dc8Var, (lnm) null, (byte) 4));
                return rih1.a;
        }
    }
}
