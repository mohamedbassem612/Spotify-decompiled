package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jxj extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ cxc0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ txj d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jxj(cxc0 cxc0Var, String str, txj txjVar, int i) {
        super(3);
        this.b = cxc0Var;
        this.c = str;
        this.d = txjVar;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x340Var2.b0();
                } else {
                    this.d.e(this.c, this.b, this.e, x340Var2, 0);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x340Var4.b0();
                } else {
                    this.d.e(this.c, this.b, this.e, x340Var4, 0);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jxj(cxc0 cxc0Var, txj txjVar, String str, int i) {
        super(3);
        this.b = cxc0Var;
        this.d = txjVar;
        this.c = str;
        this.e = i;
    }
}
