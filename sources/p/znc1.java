package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class znc1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ coc1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ znc1(coc1 coc1Var, byte b) {
        super(2);
        this.a = b;
        this.b = coc1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        coc1 coc1Var = this.b;
        switch (b) {
            case 0:
                return new u7h(xxq0.c(coc1Var.h.h));
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p60 p60Var = coc1Var.h;
                    uwo1.e(p60Var.c, (qim0) null, (lee1) null, xxq0.c(p60Var.h), (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2038);
                } else {
                    x340Var2.b0();
                }
                return rih1.a;
        }
    }
}
