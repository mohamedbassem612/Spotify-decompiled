package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fgs extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tjq b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fgs(tjq tjqVar, String str, byte b) {
        super(2);
        this.a = b;
        this.b = tjqVar;
        this.c = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.c;
        tjq tjqVar = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    Object objT = x340Var2.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = v8r.q(Boolean.FALSE);
                        x340Var2.s0(objT);
                    }
                    ven0 ven0Var = (ven0) objT;
                    boolean zI = x340Var2.i(ven0Var) | x340Var2.i(tjqVar);
                    Object objT2 = x340Var2.T();
                    if (zI || objT2 == m4cVar) {
                        objT2 = new nxr(tjqVar, ven0Var, (byte) 18);
                        x340Var2.s0(objT2);
                    }
                    fbp1.c((Function0) objT2, x340Var2, 0);
                    if (!((Boolean) ven0Var.getValue()).booleanValue()) {
                        x340Var2.i0(1376587595);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(1376287763);
                        boolean zI2 = x340Var2.i(ven0Var);
                        Object objT3 = x340Var2.T();
                        if (zI2 || objT3 == m4cVar) {
                            objT3 = new iwr(ven0Var, (byte) 2);
                            x340Var2.s0(objT3);
                        }
                        Function0 function0 = (Function0) objT3;
                        boolean zI3 = x340Var2.i(ven0Var) | x340Var2.i(tjqVar) | x340Var2.g(str);
                        Object objT4 = x340Var2.T();
                        if (zI3 || objT4 == m4cVar) {
                            objT4 = new ssm((Object) tjqVar, (Object) ven0Var, str, (byte) 12);
                            x340Var2.s0(objT4);
                        }
                        fbp1.b(function0, (Function0) objT4, x340Var2, 0);
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
                    nyx.a(2, (wux) null, apo.r(8552215, new fgs(tjqVar, str, b2), x340Var4), x340Var4, 3078, 6);
                }
                break;
        }
        return rih1Var;
    }
}
