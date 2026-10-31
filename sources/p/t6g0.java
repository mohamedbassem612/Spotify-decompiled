package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t6g0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z6g0 b;
    public final /* synthetic */ r6g0 c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t6g0(z6g0 z6g0Var, r6g0 r6g0Var, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = z6g0Var;
        this.c = r6g0Var;
        this.d = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        r6g0 r6g0Var = this.c;
        z6g0 z6g0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                z6g0Var.d(r6g0Var, iu30Var, (b0k) obj, czo1.p(1));
                break;
            case 1:
                ((Number) obj2).intValue();
                z6g0Var.e(r6g0Var, iu30Var, (b0k) obj, czo1.p(1));
                break;
            case 2:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    r6g0Var.getClass();
                    z6g0Var.d(r6g0Var, iu30Var, x340Var2, 0);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    r6g0Var.getClass();
                    z6g0Var.e(r6g0Var, iu30Var, x340Var4, 0);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t6g0(z6g0 z6g0Var, r6g0 r6g0Var, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = z6g0Var;
        this.c = r6g0Var;
        this.d = iu30Var;
    }
}
