package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wpi extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ us30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wpi(us30 us30Var, byte b) {
        super(2);
        this.a = b;
        this.b = us30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        long j;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        us30 us30Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    String strK = us30Var.f;
                    if (strK == null) {
                        strK = x0d.k(x340Var2, 1168722060, 2131957822, x340Var2, false);
                    } else {
                        x340Var2.i0(1168720479);
                        x340Var2.r(false);
                    }
                    eqr0.b(0, 2, strK, x340Var2, (qim0) null);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    uwr uwrVar = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var4).g;
                    qim0 qim0VarR = u291.r(nim0.a, 24.0f);
                    mtx mtxVar = mtx.c;
                    boolean z = us30Var.b;
                    if (z) {
                        x340Var4.i0(-246717434);
                        j = cbx.a(x340Var4).c.c;
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(-246716667);
                        x340Var4.r(false);
                        j = u7h.k;
                    }
                    w0h1.a(mtxVar, isl.a, qim0VarR, j, 0L, z, x340Var4, mtx.d | 48, 16);
                }
                break;
        }
        return rih1Var;
    }
}
