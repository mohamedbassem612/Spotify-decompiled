package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yzf0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ zzf0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yzf0(zzf0 zzf0Var) {
        super(2);
        this.b = zzf0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        zzf0 zzf0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                zzf0Var.c((b0k) obj, czo1.p(1));
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    zzf0Var.c(x340Var2, 0);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yzf0(zzf0 zzf0Var, int i) {
        super(2);
        this.b = zzf0Var;
    }
}
