package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yei0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yxb0 b;
    public final /* synthetic */ mey0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yei0(yxb0 yxb0Var, mey0 mey0Var, byte b) {
        super(2);
        this.a = b;
        this.b = yxb0Var;
        this.c = mey0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        mey0 mey0Var = this.c;
        yxb0 yxb0Var = this.b;
        switch (b) {
            case 0:
                tka0 tka0Var = (tka0) obj;
                xuh1 xuh1VarV = (xuh1) obj2;
                p731 p731Var = (p731) yxb0Var.d;
                if (p731Var != null) {
                    String str = mey0Var.c;
                    if (tka0Var != null) {
                        xuh1VarV = dko1.v(tka0Var);
                    }
                    p731Var.b(str, xuh1VarV);
                }
                break;
            default:
                tka0 tka0Var2 = (tka0) obj;
                xuh1 xuh1VarV2 = (xuh1) obj2;
                p731 p731Var2 = (p731) yxb0Var.d;
                if (p731Var2 != null) {
                    String str2 = mey0Var.c;
                    if (tka0Var2 != null) {
                        xuh1VarV2 = dko1.v(tka0Var2);
                    }
                    p731Var2.b(str2, xuh1VarV2);
                }
                break;
        }
        return rih1Var;
    }
}
