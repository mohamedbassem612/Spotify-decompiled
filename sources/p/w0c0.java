package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class w0c0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fkn0 b;
    public final /* synthetic */ fli0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0c0(fkn0 fkn0Var, fli0 fli0Var, byte b) {
        super(3);
        this.a = b;
        this.b = fkn0Var;
        this.c = fli0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        fli0 fli0Var = this.c;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x340Var2.b0();
                } else {
                    otw.c(this.b, new ekn0(fli0Var.b), (qim0) null, (ipb1) null, x340Var2, 6, 12);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x340Var4.b0();
                } else {
                    otw.c(this.b, new ekn0(fli0Var.b, new bkn0(fli0Var.a)), (qim0) null, (ipb1) null, x340Var4, 6, 12);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x340Var6.b0();
                } else {
                    otw.c(this.b, new ekn0(fli0Var.b), (qim0) null, (ipb1) null, x340Var6, 6, 12);
                }
                break;
        }
        return rih1Var;
    }
}
