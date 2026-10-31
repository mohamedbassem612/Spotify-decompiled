package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nlj extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wlc1 b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nlj(wlc1 wlc1Var, long j, byte b) {
        super(3);
        this.a = b;
        this.b = wlc1Var;
        this.c = j;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        wlc1 wlc1Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x340Var2.b0();
                } else {
                    w0h1.a(wlc1Var.a, isl.a, (qim0) null, this.c, 0L, false, x340Var2, 56, 52);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x340Var4.b0();
                } else {
                    String str = wlc1Var.b;
                    uwr uwrVar = cbx.a;
                    uwo1.e(str, (qim0) null, cbx.d(x340Var4).e, this.c, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2034);
                }
                break;
        }
        return rih1Var;
    }
}
