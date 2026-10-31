package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v040 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ qtg e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v040(boolean z, boolean z2, boolean z3, qtg qtgVar) {
        super(2);
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = qtgVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    lyg.h(this.b, this.c, this.d, this.e, x340Var2, 0);
                }
                break;
            default:
                ((Number) obj2).intValue();
                lyg.h(this.b, this.c, this.d, this.e, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v040(boolean z, boolean z2, boolean z3, qtg qtgVar, int i) {
        super(2);
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = qtgVar;
    }
}
