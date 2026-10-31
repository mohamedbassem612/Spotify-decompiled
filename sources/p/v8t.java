package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class v8t extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ umf0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v8t(umf0 umf0Var, byte b) {
        super(2);
        this.a = b;
        this.b = umf0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    uwo1.e(cwl1.n0(2131955210, new Object[]{(String) this.b.e}, x340Var2), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2046);
                } else {
                    x340Var2.b0();
                }
                return rih1.a;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                boolean zY = x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2);
                rih1 rih1Var = rih1.a;
                if (zY) {
                    otw.c(this.b, rih1Var, (qim0) null, (ipb1) null, x340Var4, 48, 12);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
