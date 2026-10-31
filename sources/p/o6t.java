package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o6t extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p6t b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o6t(p6t p6tVar, byte b) {
        super(1);
        this.a = b;
        this.b = p6tVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        p6t p6tVar = this.b;
        switch (b) {
            case 0:
                cxl0 cxl0Var = (cxl0) p6tVar.d.getValue();
                cxl0Var.getClass();
                return new bxl0(cxl0Var);
            case 1:
                return new vm61(2131962193, 2131962192, 2131962191, new n6t(p6tVar, null, (byte) 1), new um61(new o6t(p6tVar, (byte) 3), d0t.X0, d0t.Y0));
            case 2:
                return new xm61(2131962197, (String) null, 2131962196, (String) null, 2131962195, (String) null, 2131962194, (String) null, new mnl(p6tVar, (lnm) null, (byte) 15), new n6t(p6tVar, null, (byte) 0), new wm61(new o6t(p6tVar, (byte) 0), d0t.T0, d0t.U0), 170);
            default:
                cxl0 cxl0Var2 = (cxl0) p6tVar.d.getValue();
                cxl0Var2.getClass();
                return new bxl0(cxl0Var2);
        }
    }
}
