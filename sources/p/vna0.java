package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vna0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ va51 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vna0(va51 va51Var, byte b) {
        super(3);
        this.a = b;
        this.b = va51Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x340Var2.b0();
                } else {
                    bmq0.c(this.b, (qim0) null, (xu30) null, x340Var2, 0, 6);
                }
                break;
            default:
                ((Number) obj3).intValue();
                bmq0.c(this.b, (qim0) null, (xu30) null, (b0k) obj2, 0, 6);
                break;
        }
        return rih1Var;
    }
}
