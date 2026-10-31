package p;

import androidx.car.app.model.Alert;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xps {
    public static final xps a = new xps();

    public final void a(i191 i191Var, b0k b0kVar, int i) {
        qim0 qim0Var;
        qim0 qim0VarB;
        b8f1 state;
        qim0 qim0VarU;
        float f = i191Var.h;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2137486921);
        int i2 = i | (x340Var.g(i191Var) ? 4 : 2);
        byte b = 0;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            x7f1 x7f1Var = i191Var.j;
            a8f1 a8f1Var = i191Var.k;
            if (Float.isNaN(f) || (Float.floatToRawIntBits(f) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040) {
                hhg1.n("The expandedHeight is expected to be specified and finite");
                return;
            }
            boolean zG = x340Var.g(x7f1Var) | x340Var.g(a8f1Var);
            Object objT = x340Var.T();
            if (zG || objT == obj) {
                objT = yv91.a(new ka(i191Var, (byte) 18));
                x340Var.s0(objT);
            }
            tob1 tob1VarA = w191.a(((u7h) ((tob1) objT).getValue()).a, t890.w(x340Var, 4), (String) null, x340Var, 0, 12);
            j2i j2iVarR = apo.r(-1658896622, new x94(i191Var, (byte) 4), x340Var);
            qim0 qim0Var2 = nim0.a;
            lnm lnmVar = null;
            if (a8f1Var == null || a8f1Var.b()) {
                qim0Var = qim0Var2;
                x340Var.i0(690108113);
                x340Var.r(false);
                qim0VarB = qim0Var;
            } else {
                x340Var.i0(689467622);
                int i3 = i2 & 14;
                boolean z = i3 == 4;
                Object objT2 = x340Var.T();
                if (z || objT2 == obj) {
                    objT2 = new j6(i191Var, (byte) 20);
                    x340Var.s0(objT2);
                }
                r6v r6vVarC = k6v.c((iu30) objT2, x340Var);
                boolean z2 = i3 == 4;
                Object objT3 = x340Var.T();
                if (z2 || objT3 == obj) {
                    objT3 = new wps(i191Var, lnmVar, b);
                    x340Var.s0(objT3);
                }
                qim0VarB = k6v.b(qim0Var2, r6vVarC, qqq0.a, false, null, false, null, (xu30) objT3, false, 188);
                qim0Var = qim0Var2;
                x340Var.r(false);
            }
            qim0 qim0VarThen = i191Var.a.then(qim0VarB);
            boolean zG2 = x340Var.g(tob1VarA);
            Object objT4 = x340Var.T();
            if (zG2 || objT4 == obj) {
                objT4 = new ups(tob1VarA, (byte) 0);
                x340Var.s0(objT4);
            }
            qim0 qim0VarQ = exd0.q(qim0VarThen, (iu30) objT4);
            Object objT5 = x340Var.T();
            if (objT5 == obj) {
                objT5 = new u1c((byte) 15);
                x340Var.s0(objT5);
            }
            qim0 qim0VarB2 = s161.b(qim0VarQ, false, (iu30) objT5);
            Object objT6 = x340Var.T();
            if (objT6 == obj) {
                objT6 = mia.i;
                x340Var.s0(objT6);
            }
            qim0 qim0VarB3 = f8d1.b(qim0VarB2, rih1.a, (PointerInputEventHandler) objT6);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iK = tgp1.k(x340Var);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB3);
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
            llj lljVar = y580.R0;
            if (x340Var.S || !u890.j(x340Var.T(), Integer.valueOf(iK))) {
                z5c.f(iK, x340Var, iK, lljVar);
            }
            nko1.H(qim0VarE, x340Var, y580.Y);
            qim0 qim0VarR = i1p1.r(too1.y(qim0Var, i191Var.i));
            kiv kivVar = ti5.a;
            if (a8f1Var != null && (state = a8f1Var.getState()) != null && (qim0VarU = lrn1.u(qim0VarR, new mi5(state, (byte) 0))) != null) {
                qim0VarR = qim0VarU;
            }
            boolean z3 = (i2 & 14) == 4;
            Object objT7 = x340Var.T();
            if (z3 || objT7 == obj) {
                objT7 = new vps(i191Var, (byte) 0);
                x340Var.s0(objT7);
            }
            dr20 dr20Var = (dr20) objT7;
            long j = x7f1Var.c;
            long j2 = x7f1Var.d;
            long j3 = x7f1Var.e;
            long j4 = x7f1Var.f;
            vu30 vu30Var = i191Var.b;
            lee1 lee1Var = i191Var.c;
            lee1 lee1Var2 = i191Var.d;
            era eraVar = i191Var.e;
            vu30 vu30Var2 = i191Var.f;
            float f2 = i191Var.h;
            Object objT8 = x340Var.T();
            if (objT8 == obj) {
                objT8 = new xh3((byte) 19);
                x340Var.s0(objT8);
            }
            ti5.e(qim0VarR, dr20Var, j, j2, j4, j3, vu30Var, lee1Var, lee1Var2, (Function0) objT8, h36.e, eraVar, 0, false, vu30Var2, j2iVarR, f2, x340Var, 0, 1600566);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f14(this, i191Var, i, (byte) 9);
        }
    }
}
