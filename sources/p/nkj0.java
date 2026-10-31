package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nkj0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ String c;
    public final /* synthetic */ lee1 d;
    public final /* synthetic */ n811 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ nkj0(int i, String str, lee1 lee1Var, n811 n811Var, byte b) {
        super(2);
        this.a = b;
        this.b = i;
        this.c = str;
        this.d = lee1Var;
        this.e = n811Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        n811 n811Var = this.e;
        byte b2 = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    uwo1.e(this.c, (qim0) null, this.d, 0L, (a0e1) null, new ps20(n811Var, (byte) 1), 2, false, new cjc0(b2 - 1), 0, (qx8) null, x340Var2, 1572864, 0, 1690);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    uwr uwrVar = cbx.a;
                    uwo1.e(this.c, (qim0) null, this.d, cbx.a(x340Var4).b.a, (a0e1) null, new ps20(n811Var, (byte) 2), 2, false, new cjc0(b2 - 1), 0, (qx8) null, x340Var4, 1572864, 0, 1682);
                }
                break;
        }
        return rih1Var;
    }
}
