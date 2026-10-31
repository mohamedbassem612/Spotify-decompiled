package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xxg1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jye1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xxg1(jye1 jye1Var, byte b) {
        super(2);
        this.a = b;
        this.b = jye1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        jye1 jye1Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    qgo1.f((vnr0) ((wxg1) jye1Var.c).a.invoke(x340Var2, 0), (qim0) null, (a0e1) null, 0, false, (iu30) null, x340Var2, 8, 62);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    qgo1.f((vnr0) ((wxg1) jye1Var.c).c.invoke(x340Var4, 0), (qim0) null, (a0e1) null, 0, false, (iu30) null, x340Var4, 8, 62);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    qgo1.f((vnr0) ((wxg1) jye1Var.c).d.invoke(x340Var6, 0), (qim0) null, (a0e1) null, 0, false, (iu30) null, x340Var6, 8, 62);
                }
                break;
        }
        return rih1Var;
    }
}
