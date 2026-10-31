package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ho30 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kp5 b;
    public final /* synthetic */ hrr0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ Integer i;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ho30(kp5 kp5Var, hrr0 hrr0Var, Function0 function0, Function0 function1, String str, String str2, String str3, Integer num, String str4, byte b) {
        super(2);
        this.a = b;
        this.b = kp5Var;
        this.c = hrr0Var;
        this.d = function0;
        this.e = function1;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = num;
        this.t = str4;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        kp5 kp5Var = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    hrr0 hrr0Var = this.c;
                    if (!((Boolean) hrr0Var.getValue()).booleanValue()) {
                        x340Var2.i0(1498042686);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(1496362858);
                        boolean zI = x340Var2.i(kp5Var) | x340Var2.e(l1d.C(1)) | x340Var2.i(hrr0Var);
                        Function0 function0 = this.d;
                        boolean zG = zI | x340Var2.g(function0);
                        Object objT = x340Var2.T();
                        if (zG || objT == fkj0.X) {
                            objT = new go30(kp5Var, function0, hrr0Var, (byte) 0);
                            x340Var2.s0(objT);
                        }
                        x74.f((Function0) objT, (scx) null, (mfx) null, false, false, 0.0f, false, Boolean.TRUE, false, false, (vu30) null, apo.r(-2010790070, new ri1(hrr0Var, this.b, this.e, this.f, this.g, this.h, this.i, this.t, (byte) 3), x340Var2), x340Var2, 12582912, 48, 1918);
                        x340Var2.r(false);
                    }
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    mod.b(oi7.a.a((gw70) kp5Var.b), apo.r(-336874972, new ho30(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, (byte) 0), x340Var4), x340Var4, 56);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(-259539228, new ho30(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, (byte) 1), x340Var6), x340Var6, 3078, 6);
                }
                break;
        }
        return rih1Var;
    }
}
