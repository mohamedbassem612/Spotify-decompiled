package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vs11 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ys11 b;
    public final /* synthetic */ maa c;
    public final /* synthetic */ uv11 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs11(ys11 ys11Var, maa maaVar, uv11 uv11Var, int i) {
        super(2);
        this.a = (byte) 0;
        this.b = ys11Var;
        this.c = maaVar;
        this.d = uv11Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        uv11 uv11Var = this.d;
        maa maaVar = this.c;
        ys11 ys11Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                ys11Var.h(maaVar, uv11Var, (b0k) obj, czo1.p(1));
                break;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    ys11Var.h(maaVar, uv11Var, x340Var2, 0);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    ys11Var.h(maaVar, uv11Var, x340Var4, 0);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vs11(ys11 ys11Var, maa maaVar, uv11 uv11Var, byte b) {
        super(2);
        this.a = b;
        this.b = ys11Var;
        this.c = maaVar;
        this.d = uv11Var;
    }
}
