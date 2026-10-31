package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mu31 extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ fu31 b;
    public final /* synthetic */ ru31 c;
    public final /* synthetic */ hu31 d;
    public final /* synthetic */ iu30 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu31(fu31 fu31Var, ru31 ru31Var, hu31 hu31Var, iu30 iu30Var) {
        super(3);
        this.b = fu31Var;
        this.c = ru31Var;
        this.d = hu31Var;
        this.e = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.e;
        hu31 hu31Var = this.d;
        ru31 ru31Var = this.c;
        fu31 fu31Var = this.b;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var.h(zBooleanValue) ? 4 : 2;
                }
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 19) != 18)) {
                    x340Var2.b0();
                } else if (!zBooleanValue) {
                    x340Var2.i0(15938624);
                    ru31Var.f(fu31Var.b, iu30Var, x340Var2, 0);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(15832511);
                    ru31Var.m(hu31Var, iu30Var, x340Var2, 0);
                    x340Var2.r(false);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                    x340Var4.b0();
                } else {
                    eth.a(Boolean.valueOf(fu31Var.h), (qim0) null, (ni20) null, "leading-slot", apo.r(1145142526, new mu31(ru31Var, hu31Var, iu30Var, fu31Var), x340Var4), x340Var4, 27648, 6);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu31(ru31 ru31Var, hu31 hu31Var, iu30 iu30Var, fu31 fu31Var) {
        super(3);
        this.c = ru31Var;
        this.d = hu31Var;
        this.e = iu30Var;
        this.b = fu31Var;
    }
}
