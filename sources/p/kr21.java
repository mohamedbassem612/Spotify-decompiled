package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kr21 extends hab0 implements vu30 {
    public final /* synthetic */ String N0;
    public final /* synthetic */ cr21 O0;
    public final /* synthetic */ long P0;
    public final /* synthetic */ yqg Q0;
    public final /* synthetic */ long R0;
    public final /* synthetic */ fr21 S0;
    public final /* synthetic */ ven0 T0;
    public final /* synthetic */ xpw X;
    public final /* synthetic */ rr21 Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;
    public final /* synthetic */ String d;
    public final /* synthetic */ long e;
    public final /* synthetic */ nr21 f;
    public final /* synthetic */ jkr0 g;
    public final /* synthetic */ ven0 h;
    public final /* synthetic */ ven0 i;
    public final /* synthetic */ c9n t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kr21(int i, List list, String str, long j, nr21 nr21Var, jkr0 jkr0Var, ven0 ven0Var, ven0 ven0Var2, c9n c9nVar, xpw xpwVar, rr21 rr21Var, String str2, String str3, cr21 cr21Var, long j2, yqg yqgVar, long j3, fr21 fr21Var, ven0 ven0Var3, byte b) {
        super(2);
        this.a = b;
        this.b = i;
        this.c = list;
        this.d = str;
        this.e = j;
        this.f = nr21Var;
        this.g = jkr0Var;
        this.h = ven0Var;
        this.i = ven0Var2;
        this.t = c9nVar;
        this.X = xpwVar;
        this.Y = rr21Var;
        this.Z = str2;
        this.N0 = str3;
        this.O0 = cr21Var;
        this.P0 = j2;
        this.Q0 = yqgVar;
        this.R0 = j3;
        this.S0 = fr21Var;
        this.T0 = ven0Var3;
    }

    public final Object invoke(Object obj, Object obj2) {
        List list;
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
                    yqg yqgVar = this.Q0;
                    nim0 nim0Var = nim0.a;
                    int i = this.b;
                    if (i == 0) {
                        x340Var2.i0(-1869970273);
                        fbp1.d(48, apo.r(-545532043, new jr21(this.X, this.Y, this.Z, this.N0, this.O0, this.P0, yqgVar, this.e, this.R0), x340Var2), x340Var2, anm1.N("reserved_onboarding_illustration_" + i, nim0Var));
                        x340Var2.r(false);
                    } else if (i == 1) {
                        x340Var2.i0(-1869933035);
                        jkr0 jkr0Var = this.g;
                        boolean z = jkr0Var.o() == 1 && !jkr0Var.k.b();
                        boolean zI = x340Var2.i(jkr0Var) | x340Var2.i(this.h) | x340Var2.i(this.f);
                        List list2 = this.c;
                        boolean zI2 = zI | x340Var2.i(list2) | x340Var2.i(this.i) | x340Var2.i(this.t);
                        Object objT = x340Var2.T();
                        if (zI2 || objT == fkj0.X) {
                            list = list2;
                            t3t0 t3t0Var = new t3t0(this.g, this.h, this.f, list, this.t, this.i);
                            x340Var2.s0(t3t0Var);
                            objT = t3t0Var;
                        } else {
                            list = list2;
                        }
                        pdp1.g(list, this.d, this.e, this.f, z, (iu30) objT, x340Var2, 0);
                        x340Var2.r(false);
                    } else if (i == 2) {
                        x340Var2.i0(-1869909976);
                        fbp1.d(48, apo.r(601644461, new u960(this.P0, this.e, this.R0, this.S0, yqgVar), x340Var2), x340Var2, anm1.N("reserved_onboarding_illustration_" + i, nim0Var));
                        x340Var2.r(false);
                    } else if (i == 3) {
                        x340Var2.i0(-1869826239);
                        fbp1.d(48, apo.r(144151982, new tc11(this.N0, this.T0), x340Var2), x340Var2, anm1.N("reserved_onboarding_illustration_" + i, nim0Var));
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-2128863721);
                        x340Var2.r(false);
                    }
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    int i2 = this.b;
                    qr21.b(i2, apo.r(1061740107, new kr21(i2, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, this.O0, this.P0, this.Q0, this.R0, this.S0, this.T0, (byte) 0), x340Var4), x340Var4, 48);
                }
                break;
        }
        return rih1Var;
    }
}
