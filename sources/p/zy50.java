package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zy50 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ az50 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zy50(az50 az50Var, byte b) {
        super(2);
        this.a = b;
        this.b = az50Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        az50 az50Var = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    ven0 ven0VarH = rwq.h(az50Var.f, x340Var2, 0);
                    Object objT = x340Var2.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = az50Var.X;
                        x340Var2.s0(objT);
                    }
                    ven0 ven0Var = (ven0) objT;
                    boolean zI = x340Var2.i(az50Var);
                    Object objT2 = x340Var2.T();
                    if (zI || objT2 == m4cVar) {
                        objT2 = new zi50(az50Var, (byte) 6);
                        x340Var2.s0(objT2);
                    }
                    lro1.g((zn60) ven0Var.getValue(), (iu30) objT2, az50Var.b, dsa0.m(x340Var2, 2131166023), az50Var.d, az50Var.e, az50Var.g, az50Var.h, ((Boolean) ven0VarH.getValue()).booleanValue(), (qim0) null, az50Var.i, (vzq0) null, x340Var2, 0);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(933070231, new zy50(az50Var, b2), x340Var4), x340Var4, 3078, 6);
                }
                break;
        }
        return rih1Var;
    }
}
