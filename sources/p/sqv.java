package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sqv extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ glh1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sqv(glh1 glh1Var, byte b) {
        super(2);
        this.a = b;
        this.b = glh1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
                rih1 rih1Var = rih1.a;
                if (zY) {
                    otw.c(this.b, rih1Var, (qim0) null, (ipb1) null, x340Var2, 48, 12);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                boolean zY2 = x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2);
                rih1 rih1Var2 = rih1.a;
                if (zY2) {
                    otw.c(this.b, rih1Var2, (qim0) null, (ipb1) null, x340Var4, 48, 12);
                } else {
                    x340Var4.b0();
                }
                return rih1Var2;
        }
    }
}
