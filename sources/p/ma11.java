package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ma11 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oa11 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ma11(oa11 oa11Var, byte b) {
        super(1);
        this.a = b;
        this.b = oa11Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        oa11 oa11Var = this.b;
        switch (b) {
            case 0:
                ka11 ka11Var = (ka11) obj;
                return new ht20(new fu20(new f5y0(d3p1.F(oa11Var.a, oa11Var.i, ka11Var), ka11Var, (byte) 18), new i3y0(oa11Var, ka11Var, (lnm) null, (byte) 11), (byte) 1), new b201(oa11Var, (lnm) null, (byte) 21));
            case 1:
                ((qtr) obj).b(new gz0(oa11Var, (lnm) null, (byte) 19));
                return rih1.a;
            default:
                return new xwm0(oa11Var, (byte) 16);
        }
    }
}
