package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gzg1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lcf1 b;
    public final /* synthetic */ qim0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gzg1(lcf1 lcf1Var, qim0 qim0Var, byte b) {
        super(2);
        this.a = b;
        this.b = lcf1Var;
        this.c = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lcf1 lcf1Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    qgo1.f((vnr0) ((czg1) lcf1Var.e).invoke(x340Var2, 0), this.c, (a0e1) null, 0, false, (iu30) null, x340Var2, 8, 60);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    qgo1.f((vnr0) ((czg1) lcf1Var.f).invoke(x340Var4, 0), this.c, (a0e1) null, 0, false, (iu30) null, x340Var4, 8, 60);
                }
                break;
        }
        return rih1Var;
    }
}
