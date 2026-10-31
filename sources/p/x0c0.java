package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x0c0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0c0(hx hxVar, byte b) {
        super(3);
        this.a = b;
        this.b = hxVar;
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
                    otw.c(this.b, new gx(3, false), (qim0) null, (ipb1) null, x340Var2, 6, 12);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x340Var4.b0();
                } else {
                    otw.c(this.b, new gx(1, false), (qim0) null, (ipb1) null, x340Var4, 6, 12);
                }
                break;
        }
        return rih1Var;
    }
}
