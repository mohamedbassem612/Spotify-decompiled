package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i490 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ f490 c;
    public final /* synthetic */ f490 d;
    public final /* synthetic */ p350 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i490(String str, f490 f490Var, f490 f490Var2, p350 p350Var, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = f490Var;
        this.d = f490Var2;
        this.e = p350Var;
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
                    s110.f(this.b, this.c, this.d, this.e, x340Var2, 0);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(1097509276, new i490(this.b, this.c, this.d, this.e, (byte) 0), x340Var4), x340Var4, 3078, 6);
                }
                break;
            default:
                ((Number) obj2).intValue();
                s110.f(this.b, this.c, this.d, this.e, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i490(String str, f490 f490Var, f490 f490Var2, p350 p350Var, int i) {
        super(2);
        this.a = (byte) 2;
        this.b = str;
        this.c = f490Var;
        this.d = f490Var2;
        this.e = p350Var;
    }
}
