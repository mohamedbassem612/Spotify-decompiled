package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qqu0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rqu0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qqu0(rqu0 rqu0Var, byte b) {
        super(1);
        this.a = b;
        this.b = rqu0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rqu0 rqu0Var = this.b;
        switch (b) {
            case 0:
                return d3p1.F(rqu0Var.b, rqu0.h, (nqu0) obj);
            default:
                ((qtr) obj).b(new pnp0(rqu0Var, (lnm) null, (byte) 9));
                return rih1.a;
        }
    }
}
