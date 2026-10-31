package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class la2 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ na2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ la2(na2 na2Var, byte b) {
        super(2);
        this.a = b;
        this.b = na2Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        na2 na2Var = this.b;
        switch (b) {
            case 0:
                na2Var.j.c(new z5o0((h0r0) obj, (c7r0) obj2));
                break;
            case 1:
                na2Var.j.c(new z5o0((h0r0) obj, (c7r0) obj2));
                break;
            case 2:
                ((Number) obj2).intValue();
                na2Var.c((b0k) obj, czo1.p(1));
                break;
            case 3:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    na2Var.c(x340Var2, 0);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    sgc1.G(x340Var4).c("key", apo.r(1668904422, new la2(na2Var, (byte) 3), x340Var4), x340Var4, 54);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la2(na2 na2Var, int i) {
        super(2);
        this.a = (byte) 2;
        this.b = na2Var;
    }
}
