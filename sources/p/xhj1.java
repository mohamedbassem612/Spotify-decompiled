package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xhj1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yxb0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xhj1(yxb0 yxb0Var, byte b) {
        super(1);
        this.a = b;
        this.b = yxb0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        yxb0 yxb0Var = this.b;
        switch (b) {
            case 0:
                return new cly0(d3p1.F((d0r) yxb0Var.c, (o3r) yxb0Var.f, rih1Var), (byte) 18);
            default:
                ((qtr) obj).b(new psm(yxb0Var, (lnm) null, (byte) 7));
                return rih1Var;
        }
    }
}
