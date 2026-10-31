package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zvj0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wvj0 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ qlb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zvj0(wvj0 wvj0Var, iu30 iu30Var, qlb qlbVar, byte b) {
        super(2);
        this.a = b;
        this.b = wvj0Var;
        this.c = iu30Var;
        this.d = qlbVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qlb qlbVar = this.d;
        iu30 iu30Var = this.c;
        wvj0 wvj0Var = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    p1p1.s(wvj0Var, iu30Var, (xsk) qlbVar.c, x340Var2, 0);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    p1p1.a(6, apo.r(-357299356, new zvj0(wvj0Var, iu30Var, qlbVar, b2), x340Var4), x340Var4);
                }
                break;
        }
        return rih1Var;
    }
}
