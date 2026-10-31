package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ev01 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ fv01 b;
    public final /* synthetic */ au01 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev01(fv01 fv01Var, au01 au01Var) {
        super(2);
        this.b = fv01Var;
        this.c = au01Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        au01 au01Var = this.c;
        fv01 fv01Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                fv01Var.a(au01Var, (b0k) obj, czo1.p(1));
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    fv01Var.a(au01Var, x340Var2, 0);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev01(fv01 fv01Var, au01 au01Var, int i) {
        super(2);
        this.b = fv01Var;
        this.c = au01Var;
    }
}
