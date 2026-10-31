package p;

import android.view.View;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class bfm0 {
    public static final kiv a = new kiv(z7i0.b1, (byte) 1);

    public static final void a(svh0 svh0Var, j2i j2iVar, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-790184685);
        int i2 = (x340Var.i(svh0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            k8c0 k8c0Var = k8c0.ON_RESUME;
            boolean zI = x340Var.i(svh0Var);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new zem0(svh0Var, (byte) 0);
                x340Var.s0(objT);
            }
            cso1.j(k8c0Var, (iac0) null, (Function0) objT, x340Var, 6);
            boolean zI2 = x340Var.i(svh0Var);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new r7j0(svh0Var, (byte) 25);
                x340Var.s0(objT2);
            }
            mod.b(a.a(objT2), apo.r(-366809005, new ak10(j2iVar, (byte) 26), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new loi0(svh0Var, j2iVar, i, (byte) 13);
        }
    }

    public static final void b(b0k b0kVar, int i) {
        Window window;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1530232648);
        if (x340Var.Y(i & 1, i != 0)) {
            iu30 iu30Var = (iu30) x340Var.k(a);
            if (iu30Var == null) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new afm0(i, (byte) 2);
                    return;
                }
                return;
            }
            a4u parent = ((View) x340Var.k(AndroidCompositionLocals_androidKt.f)).getParent();
            a4u a4uVar = parent instanceof a4u ? parent : null;
            if (a4uVar == null || (window = a4uVar.getWindow()) == null) {
                h311 h311VarV2 = x340Var.v();
                if (h311VarV2 != null) {
                    h311VarV2.d = new afm0(i, (byte) 1);
                    return;
                }
                return;
            }
            boolean zG = x340Var.g(iu30Var) | x340Var.i(window);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new dvg0(iu30Var, window, (byte) 20);
                x340Var.s0(objT);
            }
            qxd0.S((Function0) objT, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV3 = x340Var.v();
        if (h311VarV3 != null) {
            h311VarV3.d = new afm0(i, (byte) 0);
        }
    }
}
