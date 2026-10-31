package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class meh1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ whb1 b;
    public final /* synthetic */ leh1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ meh1(whb1 whb1Var, leh1 leh1Var, byte b) {
        super(2);
        this.a = b;
        this.b = whb1Var;
        this.c = leh1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        leh1 leh1Var = this.c;
        whb1 whb1Var = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                ago1.i(whb1Var, leh1Var, (b0k) obj, czo1.p(1));
                break;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    ggo1.t(whb1Var, leh1Var, x340Var2, 0);
                }
                break;
            case 2:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    aym.e((gt40) null, leh1Var != null ? new u8h(new oxe1(leh1Var.b)) : null, x340Var4, 64);
                    j2h1.b(dm5.I(et40.a), ql3.k, apo.r(-1391563248, new meh1(whb1Var, leh1Var, b2), x340Var4), x340Var4, 384, 0);
                }
                break;
            case 3:
                ((Number) obj2).intValue();
                ggo1.c(whb1Var, leh1Var, (b0k) obj, czo1.p(1));
                break;
            case 4:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    ggo1.t(whb1Var, leh1Var, x340Var6, 0);
                }
                break;
            case 5:
                ((Number) obj2).intValue();
                ggo1.q(whb1Var, leh1Var, (b0k) obj, czo1.p(1));
                break;
            default:
                ((Number) obj2).intValue();
                ggo1.t(whb1Var, leh1Var, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ meh1(whb1 whb1Var, leh1 leh1Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = whb1Var;
        this.c = leh1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public meh1(leh1 leh1Var, whb1 whb1Var) {
        super(2);
        this.a = (byte) 2;
        this.c = leh1Var;
        this.b = whb1Var;
    }
}
