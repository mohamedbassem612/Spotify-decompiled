package p;

import androidx.car.app.model.Alert;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bys {
    public static final bys a = new bys();

    /* JADX WARN: Code duplicated, block: B:102:0x0250  */
    /* JADX WARN: Code duplicated, block: B:103:0x0254  */
    /* JADX WARN: Code duplicated, block: B:108:0x026f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0283  */
    /* JADX WARN: Code duplicated, block: B:122:0x0316  */
    /* JADX WARN: Code duplicated, block: B:123:0x0318  */
    /* JADX WARN: Code duplicated, block: B:130:0x0327  */
    public final void a(szg1 szg1Var, b0k b0kVar, int i) {
        szg1 szg1Var2;
        qim0 qim0Var;
        qim0 qim0VarB;
        a8f1 a8f1Var;
        int iK;
        Object objT;
        a8f1 a8f1Var2;
        qim0 qim0VarR;
        boolean z;
        Object objT2;
        b8f1 state;
        qim0 qim0VarU;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1640665680);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(szg1Var) ? 4 : 2);
        byte b = 0;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            float f = szg1Var.k;
            x7f1 x7f1Var = szg1Var.n;
            erl1 erl1Var = szg1Var.m;
            a8f1 a8f1Var3 = szg1Var.o;
            float f2 = szg1Var.l;
            if (Float.isNaN(f) || (Float.floatToRawIntBits(f) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040) {
                hhg1.n("The collapsedHeight is expected to be specified and finite");
                return;
            }
            if (Float.isNaN(f2) || (Float.floatToRawIntBits(f2) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040) {
                hhg1.n("The expandedHeight is expected to be specified and finite");
                return;
            }
            if (p3v.b(f2, f) < 0) {
                hhg1.n("The expandedHeight is expected to be greater or equal to the collapsedHeight");
                return;
            }
            int iI0 = ((wat) x340Var.k(t4k.h)).i0(szg1Var.d);
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            Object objT3 = x340Var.T();
            if (z2 || objT3 == obj) {
                objT3 = new hx4(szg1Var, (byte) 26);
                x340Var.s0(objT3);
            }
            Function0 function0 = (Function0) objT3;
            boolean zG = (i3 == 4) | x340Var.g(function0);
            Object objT4 = x340Var.T();
            if (zG || objT4 == obj) {
                objT4 = new na(szg1Var, function0, (byte) 8);
                x340Var.s0(objT4);
            }
            Function0 function1 = (Function0) objT4;
            j2i j2iVarR = apo.r(-1333673671, new x94(szg1Var, (byte) 5), x340Var);
            boolean zG2 = x340Var.g(function0);
            Object objT5 = x340Var.T();
            if (zG2 || objT5 == obj) {
                objT5 = new zxs(function0, b);
                x340Var.s0(objT5);
            }
            Function0 function2 = (Function0) objT5;
            boolean zG3 = x340Var.g(function0);
            Object objT6 = x340Var.T();
            if (zG3 || objT6 == obj) {
                objT6 = new zxs(function0, (byte) 1);
                x340Var.s0(objT6);
            }
            Function0 function3 = (Function0) objT6;
            boolean zG4 = x340Var.g(function0);
            Object objT7 = x340Var.T();
            if (zG4 || objT7 == obj) {
                objT7 = yv91.a(new zxs(function0, (byte) 2));
                x340Var.s0(objT7);
            }
            tob1 tob1Var = (tob1) objT7;
            boolean z3 = !((Boolean) tob1Var.getValue()).booleanValue();
            qim0 qim0Var2 = nim0.a;
            if (a8f1Var3 == null || a8f1Var3.b()) {
                j06Var = j06Var;
                qim0Var = qim0Var2;
                x340Var.i0(-340499894);
                x340Var.r(false);
                qim0VarB = qim0Var;
            } else {
                x340Var.i0(-341140385);
                boolean z4 = i3 == 4;
                Object objT8 = x340Var.T();
                if (z4 || objT8 == obj) {
                    objT8 = new j6(szg1Var, (byte) 21);
                    x340Var.s0(objT8);
                }
                r6v r6vVarC = k6v.c((iu30) objT8, x340Var);
                boolean z5 = i3 == 4;
                Object objT9 = x340Var.T();
                if (z5 || objT9 == obj) {
                    objT9 = new wps(szg1Var, null, (byte) 1);
                    x340Var.s0(objT9);
                }
                qim0VarB = k6v.b(qim0Var2, r6vVarC, qqq0.a, false, null, false, null, (xu30) objT9, false, 188);
                qim0Var = qim0Var2;
                x340Var.r(false);
            }
            qim0 qim0VarThen = szg1Var.a.then(qim0VarB);
            boolean zG5 = x340Var.g(function1);
            Object objT10 = x340Var.T();
            if (zG5 || objT10 == obj) {
                objT10 = new ki5(function1, (byte) 1);
                x340Var.s0(objT10);
            }
            qim0 qim0VarQ = exd0.q(qim0VarThen, (iu30) objT10);
            Object objT11 = x340Var.T();
            if (objT11 == obj) {
                objT11 = new u1c((byte) 16);
                x340Var.s0(objT11);
            }
            qim0 qim0VarB2 = s161.b(qim0VarQ, false, (iu30) objT11);
            Object objT12 = x340Var.T();
            if (objT12 == obj) {
                objT12 = mia.j;
                x340Var.s0(objT12);
            }
            qim0 qim0VarB3 = f8d1.b(qim0VarB2, rih1.a, (PointerInputEventHandler) objT12);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iK2 = tgp1.k(x340Var);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB3);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z6 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z6) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            llj lljVar3 = y580.R0;
            if (x340Var.S) {
                a8f1Var = a8f1Var3;
            } else {
                a8f1Var = a8f1Var3;
                if (!u890.j(x340Var.T(), Integer.valueOf(iK2))) {
                }
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar4);
                era eraVar = een.P0;
                mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 0);
                iK = tgp1.k(x340Var);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0Var);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                if (x340Var.S || !u890.j(x340Var.T(), Integer.valueOf(iK))) {
                    z5c.f(iK, x340Var, iK, lljVar3);
                }
                nko1.H(qim0VarE2, x340Var, lljVar4);
                qim0 qim0VarR2 = i1p1.r(too1.y(qim0Var, erl1Var));
                objT = x340Var.T();
                if (objT == obj) {
                    objT = new ays();
                    x340Var.s0(objT);
                }
                a8f1Var2 = a8f1Var;
                ti5.e(qim0VarR2, (dr20) objT, x7f1Var.c, x7f1Var.d, x7f1Var.f, x7f1Var.e, szg1Var.e, szg1Var.f, szg1Var.h, function2, h36.e, eraVar, 0, ((Boolean) tob1Var.getValue()).booleanValue(), szg1Var.i, j2iVarR, szg1Var.k, x340Var, 0, 1575984);
                qim0VarR = i1p1.r(too1.y(qim0Var, new bgc0(erl1Var, rqt0.h)));
                if (a8f1Var2 != null && (state = a8f1Var2.getState()) != null && (qim0VarU = lrn1.u(qim0VarR, new mi5(state, (byte) 0))) != null) {
                    qim0VarR = qim0VarU;
                }
                if (i3 == 4) {
                    z = true;
                } else {
                    z = false;
                }
                objT2 = x340Var.T();
                if (!z || objT2 == obj) {
                    szg1Var2 = szg1Var;
                    objT2 = new vps(szg1Var2, (byte) 1);
                    x340Var.s0(objT2);
                } else {
                    szg1Var2 = szg1Var;
                }
                ti5.e(qim0VarR, (dr20) objT2, x7f1Var.c, x7f1Var.d, x7f1Var.f, x7f1Var.e, szg1Var2.b, szg1Var2.c, szg1Var2.g, function3, h36.d, eraVar, iI0, z3, l6i.e, l6i.f, f2 - f, x340Var, 0, 1769520);
                x340Var = x340Var;
                x340Var.r(true);
                x340Var.r(true);
            }
            z5c.f(iK2, x340Var, iK2, lljVar3);
            llj lljVar5 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar5);
            era eraVar2 = een.P0;
            mbh mbhVarA2 = jbh.a(h36.c, eraVar2, x340Var, 0);
            iK = tgp1.k(x340Var);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            if (x340Var.S) {
                z5c.f(iK, x340Var, iK, lljVar3);
            } else {
                z5c.f(iK, x340Var, iK, lljVar3);
            }
            nko1.H(qim0VarE3, x340Var, lljVar5);
            qim0 qim0VarR3 = i1p1.r(too1.y(qim0Var, erl1Var));
            objT = x340Var.T();
            if (objT == obj) {
                objT = new ays();
                x340Var.s0(objT);
            }
            a8f1Var2 = a8f1Var;
            ti5.e(qim0VarR3, (dr20) objT, x7f1Var.c, x7f1Var.d, x7f1Var.f, x7f1Var.e, szg1Var.e, szg1Var.f, szg1Var.h, function2, h36.e, eraVar2, 0, ((Boolean) tob1Var.getValue()).booleanValue(), szg1Var.i, j2iVarR, szg1Var.k, x340Var, 0, 1575984);
            qim0VarR = i1p1.r(too1.y(qim0Var, new bgc0(erl1Var, rqt0.h)));
            if (a8f1Var2 != null) {
                qim0VarR = qim0VarU;
            }
            if (i3 == 4) {
                z = true;
            } else {
                z = false;
            }
            objT2 = x340Var.T();
            if (z) {
                szg1Var2 = szg1Var;
                objT2 = new vps(szg1Var2, (byte) 1);
                x340Var.s0(objT2);
            } else {
                szg1Var2 = szg1Var;
                objT2 = new vps(szg1Var2, (byte) 1);
                x340Var.s0(objT2);
            }
            ti5.e(qim0VarR, (dr20) objT2, x7f1Var.c, x7f1Var.d, x7f1Var.f, x7f1Var.e, szg1Var2.b, szg1Var2.c, szg1Var2.g, function3, h36.d, eraVar2, iI0, z3, l6i.e, l6i.f, f2 - f, x340Var, 0, 1769520);
            x340Var = x340Var;
            x340Var.r(true);
            x340Var.r(true);
        } else {
            szg1Var2 = szg1Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f14(this, szg1Var2, i, (byte) 12);
        }
    }
}
