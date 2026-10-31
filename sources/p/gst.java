package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gst extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tst b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gst(tst tstVar, byte b) {
        super(2);
        this.a = b;
        this.b = tstVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        tst tstVar = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    uwr uwrVar = cbx.a;
                    lee1 lee1Var = cbx.d(x340Var2).h;
                    String strO0 = tstVar.e;
                    if (strO0 == null) {
                        x340Var2.i0(-1793333653);
                        strO0 = cwl1.o0(x340Var2, tstVar.d);
                    } else {
                        x340Var2.i0(-1793334738);
                    }
                    x340Var2.r(false);
                    uwo1.e(strO0, (qim0) null, lee1Var, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2042);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    uwr uwrVar2 = cbx.a;
                    lee1 lee1Var2 = cbx.d(x340Var4).h;
                    String strK = tstVar.f;
                    if (strK == null) {
                        strK = x0d.k(x340Var4, 833267585, 2131954948, x340Var4, false);
                    } else {
                        x340Var4.i0(833266531);
                        x340Var4.r(false);
                    }
                    uwo1.e(strK, (qim0) null, lee1Var2, cbx.a(x340Var4).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2034);
                }
                break;
        }
        return rih1Var;
    }
}
