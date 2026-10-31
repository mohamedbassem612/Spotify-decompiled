package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mjv0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ njv0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mjv0(njv0 njv0Var, byte b) {
        super(1);
        this.a = b;
        this.b = njv0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        njv0 njv0Var = this.b;
        switch (b) {
            case 0:
                uiv0 uiv0Var = (uiv0) obj;
                drj0 drj0Var = njv0Var.b;
                String str = uiv0Var.a;
                mr20 mr20VarR = o4p1.r(new lt20(yoi1.g(((w4h) drj0Var.b).c(drj0.l(str)).map(as10.P0)), new cpw(str, (lnm) null, (byte) 2), (byte) 0), (q8n) drj0Var.c);
                hyy0 hyy0Var = njv0Var.c;
                return new x010(mr20VarR, o4p1.r(new m441(new xkd0(uiv0Var.b, hyy0Var, (lnm) null)), (q8n) hyy0Var.c), new irp0(3, (lnm) null, (byte) 11), (byte) 1);
            case 1:
                return njv0Var.e(new ljv0(false, false), (uiv0) obj);
            default:
                ((qtr) obj).b(new u08(njv0Var, (lnm) null, (byte) 14));
                return rih1.a;
        }
    }
}
