package p;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jzg {
    public final rok0 a;
    public final d7p0 b;

    public jzg(rok0 rok0Var, d7p0 d7p0Var) {
        this.a = rok0Var;
        this.b = d7p0Var;
    }

    public final void a(t6p0 t6p0Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        Object obj = fkj0.X;
        Function0 function0 = t6p0Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1494092869);
        int i2 = i | (x340Var.g(t6p0Var) ? 4 : 2) | 48 | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            View view = (View) x340Var.k(AndroidCompositionLocals_androidKt.f);
            int i3 = i2 & 14;
            boolean zI = x340Var.i(this) | (i3 == 4);
            Object objT = x340Var.T();
            if (zI || objT == obj) {
                objT = new w9f(this, t6p0Var, (byte) 17);
                x340Var.s0(objT);
            }
            qxd0.i(function0, (iu30) objT, x340Var);
            Object objT2 = x340Var.T();
            if (objT2 == obj) {
                objT2 = this.a.h(function0 != null);
                x340Var.s0(objT2);
            }
            ven0 ven0VarI = xto.i((mr20) objT2, (Object) null, x340Var, 48);
            Object[] objArr = new Object[0];
            boolean z = i3 == 4;
            Object objT3 = x340Var.T();
            if (z || objT3 == obj) {
                objT3 = new lwe(t6p0Var, (byte) 25);
                x340Var.s0(objT3);
            }
            err0 err0Var = (hdn0) k5p1.s(objArr, (Function0) objT3, x340Var, 0);
            Object objT4 = x340Var.T();
            if (objT4 == obj) {
                objT4 = gio1.b(Integer.valueOf(err0Var.s()));
                x340Var.s0(objT4);
            }
            wen0 wen0Var = (wen0) objT4;
            Integer num = t6p0Var.b;
            if (num != null) {
                int iIntValue = num.intValue();
                err0Var.t(iIntValue);
                Integer numValueOf = Integer.valueOf(iIntValue);
                bpb1 bpb1Var = (bpb1) wen0Var;
                bpb1Var.getClass();
                bpb1Var.m(null, numValueOf);
            }
            boolean zI2 = x340Var.i(wen0Var) | x340Var.i(view);
            Object objT5 = x340Var.T();
            if (zI2 || objT5 == obj) {
                objT5 = new w9f(wen0Var, view, (byte) 18);
                x340Var.s0(objT5);
            }
            qxd0.i(rih1.a, (iu30) objT5, x340Var);
            float fM0 = ((wat) x340Var.k(t4k.h)).M0(err0Var.s());
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarJ = u291.j(fM0, 0.0f, 2, qim0Var3);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(tgp1.l(x340Var));
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarJ);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            p0p0 p0p0Var = (p0p0) ven0VarI.getValue();
            if (p0p0Var == null) {
                x340Var.i0(-1998707269);
                x340Var.r(false);
            } else {
                x340Var.i0(-1998707268);
                x340Var.f0(-543926139, p0p0Var);
                m5n1.a(((wdg) p0p0Var.a).n(), u291.f(qim0Var3, 1.0f), (pi30) null, p0p0Var.b, (w8c0) null, (iu30) null, x340Var, 48, 52);
                x340Var.r(false);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new swc(this, t6p0Var, qim0Var2, i, (byte) 21);
        }
    }
}
