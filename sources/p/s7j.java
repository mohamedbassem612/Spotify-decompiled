package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class s7j extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7j(float f, hux huxVar, long j) {
        super(3);
        this.a = (byte) 4;
        this.b = f;
        this.d = huxVar;
        this.c = j;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        long j = this.c;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.d;
        float f = this.b;
        nim0 nim0Var = nim0.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x340Var2.b0();
                } else {
                    t1c.a(cwl1.l0(u291.h(u291.f(nim0Var, 0.46f), f), j, (cr31) obj4, 12), x340Var2, 0);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x340Var4.b0();
                } else {
                    t1c.a(cwl1.l0(u291.h(u291.f(nim0Var, 0.63f), f), j, (cr31) obj4, 12), x340Var4, 0);
                }
                break;
            case 2:
                x340 x340Var5 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x340Var6.b0();
                } else {
                    t1c.a(cwl1.l0(u291.h(u291.f(nim0Var, 0.4f), f), j, (cr31) obj4, 12), x340Var6, 0);
                }
                break;
            case 3:
                x340 x340Var7 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                x340 x340Var8 = x340Var7;
                if (!x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x340Var8.b0();
                } else {
                    t1c.a(cwl1.l0(u291.h(u291.f(nim0Var, 0.6f), f), j, (cr31) obj4, 12), x340Var8, 0);
                }
                break;
            default:
                x340 x340Var9 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                x340 x340Var10 = x340Var9;
                if (!x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x340Var10.b0();
                } else {
                    w0h1.a((hux) obj4, isl.a, u291.r(nim0Var, f), this.c, 0L, false, x340Var10, 56, 48);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s7j(float f, long j, cr31 cr31Var, byte b) {
        super(3);
        this.a = b;
        this.b = f;
        this.c = j;
        this.d = cr31Var;
    }
}
