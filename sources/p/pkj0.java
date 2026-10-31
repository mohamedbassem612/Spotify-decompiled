package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pkj0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ lee1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pkj0(int i, String str, lee1 lee1Var, byte b) {
        super(2);
        this.a = b;
        this.b = i;
        this.c = str;
        this.d = lee1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nim0 nim0Var = nim0.a;
        int i = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    uwr uwrVar = cbx.a;
                    uwo1.e(this.c, anm1.N("share.card.subtitle", nim0Var), this.d, cbx.a(x340Var2).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(i), 0, (qx8) null, x340Var2, 1572912, 0, 1712);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    uwo1.e(this.c, anm1.N("share.card.title", nim0Var), this.d, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(i), 0, (qx8) null, x340Var4, 1572912, 0, 1720);
                }
                break;
        }
        return rih1Var;
    }
}
