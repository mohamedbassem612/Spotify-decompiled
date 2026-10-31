package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class uci0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hob1 b;
    public final /* synthetic */ znb0 c;
    public final /* synthetic */ i091 d;
    public final /* synthetic */ yqg e;
    public final /* synthetic */ iu30 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uci0(hob1 hob1Var, znb0 znb0Var, i091 i091Var, yqg yqgVar, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = hob1Var;
        this.c = znb0Var;
        this.d = i091Var;
        this.e = yqgVar;
        this.f = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        i091 i091Var;
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
                    hob1 hob1Var = this.b;
                    if (!hob1Var.n.b) {
                        x340Var2.i0(1976013536);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(1975387925);
                        maa maaVar = (maa) this.c.getValue();
                        set0 set0Var = hob1Var.n;
                        boolean z = hob1Var.E;
                        boolean z2 = hob1Var.D;
                        vm1 vm1Var = set0Var.h;
                        if (z && (i091Var = this.d) != null) {
                            vm1Var = new vm1(z2, i091Var, this.e, (byte) 18);
                        } else if (!z) {
                            vm1Var = null;
                        }
                        iu30 iu30Var = this.f;
                        boolean zG = x340Var2.g(iu30Var);
                        Object objT = x340Var2.T();
                        if (zG || objT == fkj0.X) {
                            objT = new msh0(iu30Var, (byte) 14);
                            x340Var2.s0(objT);
                        }
                        otw.c(maaVar, set0.a(set0Var, (Function0) objT, vm1Var, 1903), (qim0) null, (ipb1) null, x340Var2, 0, 12);
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
                    rpo1.k(this.b, this.c, this.d, this.e, this.f, x340Var4);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    rpo1.k(this.b, this.c, this.d, this.e, this.f, x340Var6);
                }
                break;
        }
        return rih1Var;
    }
}
