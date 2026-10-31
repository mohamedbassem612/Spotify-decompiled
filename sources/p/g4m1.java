package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g4m1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i4m1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g4m1(i4m1 i4m1Var, byte b) {
        super(2);
        this.a = b;
        this.b = i4m1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        i4m1 i4m1Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(-1018625967, new f4m1(i4m1Var, new zxl1(cwl1.H(((cir0) x340Var2.k(k2r0.a)).g()), i4m1Var.h, (byte) 1), (byte) 0), x340Var2), x340Var2, 3078, 6);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(-398720478, new f4m1(i4m1Var, new zxl1(cwl1.H(((cir0) x340Var4.k(k2r0.a)).g()), i4m1Var.h, (byte) 1), (byte) 1), x340Var4), x340Var4, 3078, 6);
                }
                break;
        }
        return rih1Var;
    }
}
