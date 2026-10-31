package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r7j extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cr31 b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r7j(long j, cr31 cr31Var, byte b) {
        super(3);
        this.a = b;
        this.c = j;
        this.b = cr31Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        cr31 cr31Var = this.b;
        long j = this.c;
        nim0 nim0Var = nim0.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    t1c.a(cwl1.l0(i1p1.q(d7e.r(1.0f, u291.f(nim0Var, 1.0f), false), cr31Var), j, cr31Var, 12), x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    t1c.a(cwl1.l0(i1p1.q(u291.d(nim0Var, 1.0f), cr31Var), j, cr31Var, 12), x340Var4, 0);
                } else {
                    x340Var4.b0();
                }
                break;
            case 2:
                ((Number) obj3).intValue();
                t1c.a(cwl1.l0(dug.f(u291.d(nim0Var, 1.0f), j, cr31Var), j, cr31Var, 12), (b0k) obj2, 0);
                break;
            case 3:
                x340 x340Var5 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    for (int i = 0; i < 5; i++) {
                        t1c.a(cwl1.l0(u291.h(u291.v(nim0Var, 80.0f + ((i % 3) * 20)), 32.0f), j, cr31Var, 12), x340Var6, 0);
                    }
                } else {
                    x340Var6.b0();
                }
                break;
            default:
                ((Number) obj3).intValue();
                t1c.a(cwl1.l0(dug.f(u291.d(nim0Var, 1.0f), j, cr31Var), j, cr31Var, 12), (b0k) obj2, 0);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r7j(cr31 cr31Var, long j, byte b) {
        super(3);
        this.a = b;
        this.b = cr31Var;
        this.c = j;
    }
}
