package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class exi1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gxi1 b;
    public final /* synthetic */ tob1 c;
    public final /* synthetic */ tob1 d;
    public final /* synthetic */ xfx e;
    public final /* synthetic */ tob1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exi1(tob1 tob1Var, tob1 tob1Var2, gxi1 gxi1Var, xfx xfxVar, tob1 tob1Var3) {
        super(2);
        this.a = (byte) 0;
        this.c = tob1Var;
        this.d = tob1Var2;
        this.b = gxi1Var;
        this.e = xfxVar;
        this.f = tob1Var3;
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
                    kyi1 kyi1Var = (kyi1) this.c.getValue();
                    q1a q1aVar = (q1a) this.d.getValue();
                    gxi1 gxi1Var = this.b;
                    qyo1.m(kyi1Var, q1aVar, gxi1Var.a, this.e, gxi1Var.d, (iu30) this.f.getValue(), (qim0) null, x340Var2, 0);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    kiv kivVar = oi7.a;
                    gxi1 gxi1Var2 = this.b;
                    mod.b(kivVar.a(gxi1Var2.c), apo.r(-200836362, new exi1(this.c, this.d, gxi1Var2, this.e, this.f), x340Var4), x340Var4, 56);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(617670582, new exi1(this.b, this.c, this.d, this.e, this.f, (byte) 1), x340Var6), x340Var6, 3078, 6);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ exi1(gxi1 gxi1Var, tob1 tob1Var, tob1 tob1Var2, xfx xfxVar, tob1 tob1Var3, byte b) {
        super(2);
        this.a = b;
        this.b = gxi1Var;
        this.c = tob1Var;
        this.d = tob1Var2;
        this.e = xfxVar;
        this.f = tob1Var3;
    }
}
