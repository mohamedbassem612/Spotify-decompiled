package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dp6 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ep6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dp6(ep6 ep6Var, byte b) {
        super(1);
        this.a = b;
        this.b = ep6Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ep6 ep6Var = this.b;
        switch (b) {
            case 0:
                return d3p1.F(ep6Var.a, ep6Var.c, (bp6) obj);
            default:
                ((qtr) obj).b(new lu(ep6Var, (lnm) null, (byte) 4));
                return rih1.a;
        }
    }
}
