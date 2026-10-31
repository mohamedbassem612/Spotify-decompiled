package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gue0 {
    public final void a(qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-719279200);
        if (x340Var.Y(i & 1, (i & 3) != 2)) {
            bab1 bab1VarR = prn1.r(eue0.a, x340Var, 6);
            boolean zA = bab1VarR.a();
            boolean zG = x340Var.g(bab1VarR);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new fue0(bab1VarR, (byte) 0);
                x340Var.s0(objT);
            }
            q3p1.b(0, 0, (Function0) objT, x340Var, zA);
            qim0Var2 = qim0Var;
            w9b1.a(bab1VarR, qim0Var2, rxi.a, x340Var, 432, 0);
        } else {
            qim0Var2 = qim0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d0e0(this, qim0Var2, i, (byte) 8);
        }
    }
}
