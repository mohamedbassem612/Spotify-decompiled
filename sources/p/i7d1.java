package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i7d1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k7d1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i7d1(k7d1 k7d1Var, byte b) {
        super(2);
        this.a = b;
        this.b = k7d1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2) {
        Object[] objArr = 0;
        byte b = 1;
        switch (this.a) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    k7d1 k7d1Var = this.b;
                    int i = k7d1.h1;
                    j6d1 j6d1Var = (j6d1) k7d1Var.a1.getValue();
                    x6d1 x6d1Var = (x6d1) this.b.d1.getValue();
                    if (j6d1Var == null || x6d1Var == null) {
                        x340Var2.i0(415763130);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(415537760);
                        uic uicVar = r7d1.c;
                        r7d1 r7d1Var = r7d1.d;
                        if (r7d1Var == null) {
                            synchronized (uicVar) {
                                r7d1Var = r7d1.d;
                                if (r7d1Var == null) {
                                    r7d1Var = new r7d1();
                                    r7d1.d = r7d1Var;
                                }
                            }
                        }
                        otw.c(j6d1Var, x6d1Var, u291.d(nim0.a, 1.0f), r7d1Var, x340Var2, 0, 0);
                        x340Var2.r(false);
                    }
                    break;
                } else {
                    x340Var2.b0();
                }
                return rih1.a;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nyx.a(2, (wux) null, apo.r(-229937144, new i7d1(this.b, objArr == true ? 1 : 0), x340Var4), x340Var4, 3078, 6);
                } else {
                    x340Var4.b0();
                }
                return rih1.a;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    qsw.a(apo.r(967325493, new i7d1(this.b, b), x340Var6), x340Var6);
                } else {
                    x340Var6.b0();
                }
                return rih1.a;
        }
    }
}
