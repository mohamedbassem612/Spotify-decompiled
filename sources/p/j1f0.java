package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j1f0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k1f0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ dxo1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1f0(k1f0 k1f0Var, String str, dxo1 dxo1Var, byte b) {
        super(2);
        this.a = b;
        this.b = k1f0Var;
        this.c = str;
        this.d = dxo1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        Function0 function0;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.c;
        k1f0 k1f0Var = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    vy71 vy71VarF = dem0.f(6, 2, x340Var2, (iu30) null, true);
                    g1f0 g1f0Var = k1f0Var.M1;
                    if (g1f0Var == null) {
                        u890.C("loginFlowRemoteProperties");
                        throw null;
                    }
                    if (g1f0Var.e()) {
                        x340Var2.i0(472913609);
                        x340Var2.r(false);
                        function0 = null;
                    } else {
                        x340Var2.i0(472938627);
                        boolean zI = x340Var2.i(k1f0Var) | x340Var2.g(str);
                        Object objT = x340Var2.T();
                        if (zI || objT == m4cVar) {
                            objT = new bsc0(k1f0Var, str, (byte) 14);
                            x340Var2.s0(objT);
                        }
                        x340Var2.r(false);
                        function0 = (Function0) objT;
                    }
                    g1f0 g1f0Var2 = k1f0Var.M1;
                    if (g1f0Var2 == null) {
                        u890.C("loginFlowRemoteProperties");
                        throw null;
                    }
                    boolean zQ = g1f0Var2.q();
                    boolean zBooleanValue = ((Boolean) k1f0Var.P1.getValue()).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) k1f0Var.Q1.getValue()).booleanValue();
                    boolean zI2 = x340Var2.i(k1f0Var) | x340Var2.g(str);
                    Object objT2 = x340Var2.T();
                    if (zI2 || objT2 == m4cVar) {
                        objT2 = new j2d0(k1f0Var, str, (byte) 12);
                        x340Var2.s0(objT2);
                    }
                    iu30 iu30Var = (iu30) objT2;
                    boolean zI3 = x340Var2.i(k1f0Var);
                    Object objT3 = x340Var2.T();
                    if (zI3 || objT3 == m4cVar) {
                        objT3 = new i1f0(k1f0Var, (byte) 0);
                        x340Var2.s0(objT3);
                    }
                    Function0 function1 = (Function0) objT3;
                    boolean zI4 = x340Var2.i(k1f0Var);
                    Object objT4 = x340Var2.T();
                    if (zI4 || objT4 == m4cVar) {
                        objT4 = new i1f0(k1f0Var, (byte) 1);
                        x340Var2.s0(objT4);
                    }
                    Function0 function2 = (Function0) objT4;
                    boolean zI5 = x340Var2.i(k1f0Var);
                    Object objT5 = x340Var2.T();
                    if (zI5 || objT5 == m4cVar) {
                        objT5 = new i1f0(k1f0Var, (byte) 2);
                        x340Var2.s0(objT5);
                    }
                    Function0 function3 = (Function0) objT5;
                    boolean zI6 = x340Var2.i(k1f0Var);
                    Object objT6 = x340Var2.T();
                    if (zI6 || objT6 == m4cVar) {
                        objT6 = new i1f0(k1f0Var, (byte) 3);
                        x340Var2.s0(objT6);
                    }
                    upf.a(iu30Var, (qim0) null, function0, zBooleanValue, this.d, function1, function2, function3, (Function0) objT6, zQ, vy71VarF, zBooleanValue2, x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    nyx.a(2, (wux) null, apo.r(-600740364, new j1f0(k1f0Var, str, this.d, b2), x340Var4), x340Var4, 3078, 6);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
