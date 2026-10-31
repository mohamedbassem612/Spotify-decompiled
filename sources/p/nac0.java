package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nac0 {
    public final yir0 a;

    public nac0(yir0 yir0Var) {
        this.a = yir0Var;
    }

    public final void a(h0r0 h0r0Var, b0k b0kVar, int i) {
        n6r0 n6r0Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-32787330);
        int i2 = (x340Var.i(h0r0Var) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            bn70 bn70VarA = h0r0Var.a().b0(bn70.class).a();
            if (bn70VarA == null || (n6r0Var = bn70VarA.a) == null) {
                eg.m("MonitorVisibility can only be used with page properties that contain an Identifier");
                return;
            }
            boolean zI = x340Var.i(this) | x340Var.i(n6r0Var);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new lac0(this, n6r0Var, (byte) 0);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            boolean zI2 = x340Var.i(this) | x340Var.i(n6r0Var);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new lac0(this, n6r0Var, (byte) 1);
                x340Var.s0(objT2);
            }
            Function0 function1 = (Function0) objT2;
            k8c0 k8c0Var = k8c0.ON_CREATE;
            boolean zG = x340Var.g(function1);
            Object objT3 = x340Var.T();
            if (zG || objT3 == m4cVar) {
                objT3 = new aba0(function1, (byte) 8);
                x340Var.s0(objT3);
            }
            cso1.j(k8c0Var, (iac0) null, (Function0) objT3, x340Var, 6);
            k8c0 k8c0Var2 = k8c0.ON_START;
            boolean zG2 = x340Var.g(function1);
            Object objT4 = x340Var.T();
            if (zG2 || objT4 == m4cVar) {
                objT4 = new aba0(function1, (byte) 10);
                x340Var.s0(objT4);
            }
            cso1.j(k8c0Var2, (iac0) null, (Function0) objT4, x340Var, 6);
            k8c0 k8c0Var3 = k8c0.ON_STOP;
            boolean zG3 = x340Var.g(function0);
            Object objT5 = x340Var.T();
            if (zG3 || objT5 == m4cVar) {
                objT5 = new aba0(function0, (byte) 12);
                x340Var.s0(objT5);
            }
            cso1.j(k8c0Var3, (iac0) null, (Function0) objT5, x340Var, 6);
            Object objK = x340Var.k(jfe0.a);
            boolean zG4 = x340Var.g(function0);
            Object objT6 = x340Var.T();
            if (zG4 || objT6 == m4cVar) {
                objT6 = new xet(function0, (byte) 22);
                x340Var.s0(objT6);
            }
            qxd0.i(objK, (iu30) objT6, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vx90(this, h0r0Var, i, (byte) 16);
        }
    }
}
