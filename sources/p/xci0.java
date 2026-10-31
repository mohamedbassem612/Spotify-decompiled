package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xci0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hob1 b;
    public final /* synthetic */ znb0 c;
    public final /* synthetic */ znb0 d;
    public final /* synthetic */ Function0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xci0(hob1 hob1Var, znb0 znb0Var, znb0 znb0Var2, Function0 function0, byte b) {
        super(2);
        this.a = b;
        this.b = hob1Var;
        this.c = znb0Var;
        this.d = znb0Var2;
        this.e = function0;
    }

    public final Object invoke(Object obj, Object obj2) {
        rih1 rih1Var;
        rih1 rih1Var2;
        byte b = this.a;
        Function0 function0 = this.e;
        znb0 znb0Var = this.d;
        znb0 znb0Var2 = this.c;
        hob1 hob1Var = this.b;
        rih1 rih1Var3 = null;
        rih1 rih1Var4 = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    String str = hob1Var.s;
                    if (str == null) {
                        x340Var2.i0(2145685548);
                        x340Var2.r(false);
                        rih1Var = null;
                    } else {
                        x340Var2.i0(2145685549);
                        bth.d(null, str, null, 0, x340Var2, 0, 13);
                        x340Var2.r(false);
                        rih1Var = rih1Var4;
                    }
                    if (rih1Var == null) {
                        x340Var2.i0(2145800032);
                        v9n v9nVar = hob1Var.v;
                        if (znb0Var2 != null && v9nVar != null) {
                            otw.c((maa) znb0Var2.getValue(), v9nVar, (qim0) null, (ipb1) null, x340Var2, 8, 12);
                            rih1Var3 = rih1Var4;
                        }
                        x340Var2.r(false);
                        rih1Var = rih1Var3;
                    } else {
                        x340Var2.i0(-1870447727);
                        x340Var2.r(false);
                    }
                    if (rih1Var != null) {
                        x340Var2.i0(-1870447366);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(2146023604);
                        yaw0 yaw0Var = hob1Var.l;
                        if (znb0Var != null && yaw0Var != null) {
                            otw.c((maa) znb0Var.getValue(), yaw0.a(yaw0Var, function0, 7167), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                        }
                        x340Var2.r(false);
                    }
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    String str2 = hob1Var.s;
                    if (str2 == null) {
                        x340Var4.i0(1361263011);
                        x340Var4.r(false);
                        rih1Var2 = null;
                    } else {
                        x340Var4.i0(1361263012);
                        bth.d(null, str2, null, 0, x340Var4, 0, 13);
                        x340Var4.r(false);
                        rih1Var2 = rih1Var4;
                    }
                    if (rih1Var2 == null) {
                        x340Var4.i0(1361377495);
                        v9n v9nVar2 = hob1Var.v;
                        if (znb0Var2 != null && v9nVar2 != null) {
                            otw.c((maa) znb0Var2.getValue(), v9nVar2, (qim0) null, (ipb1) null, x340Var4, 8, 12);
                            rih1Var3 = rih1Var4;
                        }
                        x340Var4.r(false);
                        rih1Var2 = rih1Var3;
                    } else {
                        x340Var4.i0(43910970);
                        x340Var4.r(false);
                    }
                    if (rih1Var2 != null) {
                        x340Var4.i0(43911439);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(1361604415);
                        yaw0 yaw0Var2 = hob1Var.l;
                        if (znb0Var != null && yaw0Var2 != null) {
                            otw.c((maa) znb0Var.getValue(), yaw0.a(yaw0Var2, function0, 5119), (qim0) null, (ipb1) null, x340Var4, 0, 12);
                        }
                        x340Var4.r(false);
                    }
                }
                break;
        }
        return rih1Var4;
    }
}
