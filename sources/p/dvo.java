package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dvo extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ evo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvo(evo evoVar, int i) {
        super(2);
        this.a = (byte) 1;
        this.b = evoVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        byte b2 = 2;
        rih1 rih1Var = rih1.a;
        evo evoVar = this.b;
        switch (b) {
            case 0:
                evoVar.i.c(new z5o0((h0r0) obj, (c7r0) obj2));
                break;
            case 1:
                ((Number) obj2).intValue();
                evoVar.c((b0k) obj, czo1.p(1));
                break;
            case 2:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    evoVar.c(x340Var2, 0);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    sgc1.G(x340Var4).c("key", apo.r(1097875610, new dvo(evoVar, b2), x340Var4), x340Var4, 54);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dvo(evo evoVar, byte b) {
        super(2);
        this.a = b;
        this.b = evoVar;
    }
}
