package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fxj extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ rrj0 b;
    public final /* synthetic */ txj c;
    public final /* synthetic */ cxc0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxj(txj txjVar, rrj0 rrj0Var, cxc0 cxc0Var, int i, int i2) {
        super(3);
        this.c = txjVar;
        this.b = rrj0Var;
        this.d = cxc0Var;
        this.e = i;
        this.f = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                b0k b0kVar2 = (x340) b0kVar;
                if (!b0kVar2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    b0kVar2.b0();
                } else {
                    rrj0 rrj0Var = this.b;
                    this.c.e(rrj0Var.b, this.d, this.e + rrj0Var.a + this.f, b0kVar2, 0);
                }
                break;
            default:
                x340 x340Var = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x340Var2.b0();
                } else {
                    kiv kivVar = qrj0.a;
                    rrj0 rrj0Var2 = this.b;
                    mod.b(kivVar.a(Integer.valueOf(rrj0Var2.a)), apo.r(1695409605, new nk0(this.c, rrj0Var2, this.d, this.e, this.f, (byte) 3), x340Var2), x340Var2, 56);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxj(rrj0 rrj0Var, txj txjVar, cxc0 cxc0Var, int i, int i2) {
        super(3);
        this.b = rrj0Var;
        this.c = txjVar;
        this.d = cxc0Var;
        this.e = i;
        this.f = i2;
    }
}
