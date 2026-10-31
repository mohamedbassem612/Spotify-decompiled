package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nt51 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lt51 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nt51(lt51 lt51Var, byte b) {
        super(2);
        this.a = b;
        this.b = lt51Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lt51 lt51Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    w0h1.a(lt51Var.b ? gux.c : jlx.c, isl.a, (qim0) null, 0L, 0L, false, x340Var2, 196664, 28);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    eqr0.b(0, 2, cwl1.o0(x340Var4, lt51Var.b ? 2131959934 : 2131959936), x340Var4, (qim0) null);
                }
                break;
        }
        return rih1Var;
    }
}
