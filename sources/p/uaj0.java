package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uaj0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ taj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uaj0(vaj0 vaj0Var, taj0 taj0Var, byte b) {
        super(2);
        this.a = b;
        this.b = taj0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        taj0 taj0Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                    return rih1Var;
                }
                int iOrdinal = taj0Var.a.ordinal();
                if (iOrdinal == 0) {
                    i = 2131958789;
                } else if (iOrdinal == 1) {
                    i = 2131958791;
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    i = 2131958790;
                }
                uwo1.e(cwl1.o0(x340Var2, i), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2046);
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                    return rih1Var;
                }
                int iOrdinal2 = taj0Var.a.ordinal();
                if (iOrdinal2 == 0) {
                    i2 = 2131958784;
                } else if (iOrdinal2 == 1) {
                    i2 = 2131958786;
                } else {
                    if (iOrdinal2 != 2) {
                        eg.o();
                        return null;
                    }
                    i2 = 2131958785;
                }
                uwo1.e(cwl1.o0(x340Var4, i2), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2046);
                return rih1Var;
        }
    }
}
