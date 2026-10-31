package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w1f0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uzg1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1f0(uzg1 uzg1Var, byte b) {
        super(2);
        this.a = b;
        this.b = uzg1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        uzg1 uzg1Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    String str = uzg1Var.c;
                    uwr uwrVar = cbx.a;
                    uwo1.e(str, (qim0) null, cbx.d(x340Var2).h, cbx.a(x340Var2).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2034);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    String str2 = uzg1Var.c;
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(str2, (qim0) null, cbx.d(x340Var4).h, cbx.a(x340Var4).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2034);
                }
                break;
        }
        return rih1Var;
    }
}
