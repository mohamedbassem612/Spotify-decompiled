package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class una0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pa51 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ una0(pa51 pa51Var, byte b) {
        super(3);
        this.a = b;
        this.b = pa51Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        pa51 pa51Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x340Var2.b0();
                } else {
                    u890.c(pa51Var, (qim0) null, x340Var2, 0);
                }
                break;
            default:
                ((Number) obj3).intValue();
                u890.c(pa51Var, (qim0) null, (b0k) obj2, 0);
                break;
        }
        return rih1Var;
    }
}
