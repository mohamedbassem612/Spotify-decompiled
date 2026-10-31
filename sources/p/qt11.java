package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qt11 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dtw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qt11(dtw dtwVar, byte b) {
        super(2);
        this.a = b;
        this.b = dtwVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        dtw dtwVar = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    boolean zI = x340Var2.i(dtwVar);
                    Object objT = x340Var2.T();
                    if (zI || objT == fkj0.X) {
                        objT = new btw(dtwVar, (byte) 1);
                        x340Var2.s0(objT);
                    }
                    dm5.a((iu30) objT, (qim0) null, (iu30) null, x340Var2, 0, 6);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    boolean zI2 = x340Var4.i(dtwVar);
                    Object objT2 = x340Var4.T();
                    if (zI2 || objT2 == fkj0.X) {
                        objT2 = new btw(dtwVar, (byte) 2);
                        x340Var4.s0(objT2);
                    }
                    dm5.a((iu30) objT2, (qim0) null, (iu30) null, x340Var4, 0, 6);
                }
                break;
        }
        return rih1Var;
    }
}
