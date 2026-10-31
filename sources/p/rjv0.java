package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rjv0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ziv0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rjv0(ziv0 ziv0Var, byte b) {
        super(2);
        this.a = b;
        this.b = ziv0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        hux huxVar;
        hux huxVar2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ziv0 ziv0Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    int iC = l1d.C(ziv0Var.a);
                    if (iC == 0) {
                        huxVar = jpx.c;
                    } else if (iC == 1) {
                        huxVar = ilx.c;
                    } else {
                        if (iC != 2) {
                            eg.o();
                            return null;
                        }
                        huxVar = xpx.c;
                    }
                    w0h1.a(huxVar, new jsl(ziv0Var.b), (qim0) null, 0L, 0L, false, x340Var2, 8, 60);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    int iC2 = l1d.C(ziv0Var.a);
                    if (iC2 == 0) {
                        huxVar2 = jpx.c;
                    } else if (iC2 == 1) {
                        huxVar2 = klx.c;
                    } else {
                        if (iC2 != 2) {
                            eg.o();
                            return null;
                        }
                        huxVar2 = xpx.c;
                    }
                    w0h1.a(huxVar2, isl.a, (qim0) null, 0L, 0L, false, x340Var4, 56, 60);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    uwo1.e(ziv0Var.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var6, 0, 0, 1726);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
        }
    }
}
