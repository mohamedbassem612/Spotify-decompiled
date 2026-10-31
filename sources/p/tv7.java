package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tv7 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vv7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv7(vv7 vv7Var) {
        super(2);
        this.a = (byte) 3;
        this.b = vv7Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vv7 vv7Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                vv7Var.c((b0k) obj, czo1.p(1));
                break;
            case 1:
                ((Number) obj2).intValue();
                vv7Var.d((b0k) obj, czo1.p(1));
                break;
            case 2:
                ((Number) obj2).intValue();
                vv7Var.e((b0k) obj, czo1.p(1));
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    vv7Var.e(x340Var2, 0);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tv7(vv7 vv7Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = vv7Var;
    }
}
