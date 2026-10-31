package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iv50 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ne91 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iv50(ne91 ne91Var, byte b) {
        super(2);
        this.a = b;
        this.b = ne91Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        rih1 rih1Var;
        byte b = this.a;
        rih1 rih1Var2 = rih1.a;
        ne91 ne91Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    vu30 vu30Var = ne91Var.b;
                    if (vu30Var == null) {
                        x340Var2.i0(-223848170);
                        x340Var2.r(false);
                        rih1Var = null;
                    } else {
                        c13.o(x340Var2, -284315573, 0, vu30Var, x340Var2);
                        x340Var2.r(false);
                        rih1Var = rih1Var2;
                    }
                    if (rih1Var == null) {
                        x340Var2.i0(-284315185);
                        ujo1.i(x340Var2, 0);
                    } else {
                        x340Var2.i0(-284316456);
                    }
                    x340Var2.r(false);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    vu30 vu30Var2 = ne91Var.b;
                    if (vu30Var2 == null) {
                        x340Var4.i0(-1663061728);
                    } else {
                        c13.o(x340Var4, 1608920833, 0, vu30Var2, x340Var4);
                    }
                    x340Var4.r(false);
                }
                break;
        }
        return rih1Var2;
    }
}
