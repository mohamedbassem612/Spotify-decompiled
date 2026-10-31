package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class say0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ say0(vu30 vu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = vu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vu30 vu30Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    vu30Var.invoke(x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                vu30Var.invoke((String) obj, bool);
                return rih1Var;
            case 2:
                Boolean bool2 = (Boolean) obj2;
                bool2.booleanValue();
                vu30Var.invoke((String) obj, bool2);
                return rih1Var;
            case 3:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    if (vu30Var == null) {
                        x340Var4.i0(1790853906);
                    } else {
                        c13.o(x340Var4, -1881893169, 0, vu30Var, x340Var4);
                    }
                    x340Var4.r(false);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    vu30Var.invoke(x340Var6, 0);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    if (vu30Var == null) {
                        x340Var8.i0(-2094694360);
                    } else {
                        c13.o(x340Var8, -1314496775, 0, vu30Var, x340Var8);
                    }
                    x340Var8.r(false);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            default:
                String str = (String) obj;
                return t5p1.j(rqt0.u(new pvf1(((kwn) vu30Var.invoke(str, (String) obj2)).a(), str, (byte) 1)), 3);
        }
    }
}
