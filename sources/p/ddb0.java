package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ddb0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ edb0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ddb0(edb0 edb0Var, byte b) {
        super(2);
        this.a = b;
        this.b = edb0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        edb0 edb0Var = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    int i = edb0.W0;
                    kcb0 kcb0Var = (kcb0) edb0Var.U0.getValue();
                    if (kcb0Var != null) {
                        x340Var2.i0(-1793224256);
                        boolean zI = x340Var2.i(edb0Var) | x340Var2.i(kcb0Var);
                        Object objT = x340Var2.T();
                        if (zI || objT == fkj0.X) {
                            objT = new x680(edb0Var, kcb0Var, (byte) 18);
                            x340Var2.s0(objT);
                        }
                        edb0Var.F(kcb0Var, (Function0) objT, x340Var2, 0);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1793224257);
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
                    edb0Var.E(6, apo.r(1450001269, new ddb0(edb0Var, b2), x340Var4), x340Var4);
                }
                break;
        }
        return rih1Var;
    }
}
