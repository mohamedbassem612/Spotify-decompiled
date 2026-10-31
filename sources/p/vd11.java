package p;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class vd11 {
    public static final kua0 a = new kua0(3, (Boolean) null, 0, 7, 118);

    public static final void a(y7e1 y7e1Var, Function0 function0, qim0 qim0Var, qim0 qim0Var2, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(313094613);
        int i2 = i | (x340Var.i(y7e1Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128) | (x340Var.i(qim0Var2) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            long jC = cbx.a(x340Var).a.a.c();
            int length = y7e1Var.d().d.length();
            qim0 qim0VarF = dug.f(i1p1.q(qim0Var, er31.d(20.0f, 20.0f, 0.0f, 0.0f, 12)), jC, d4o1.a);
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarF, 16.0f, 12.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
            hzj.A.getClass();
            j2i j2iVar = null;
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
            qim0 qim0VarN = anm1.N("reflection_text_input_field", u291.f(qim0Var2, 1.0f));
            String strO0 = cwl1.o0(x340Var, 2131961005);
            cvx cvxVar3 = cbx.b(x340Var).b;
            pqf pqfVar = new pqf(uyn1.h(1, 0.0f, 4.0f));
            lee1 lee1Var = cbx.d(x340Var).g;
            if (length > 0) {
                j2iVar = new j2i(-1171377507, new p4g0(length, (byte) 14), true);
            }
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new uy5(function0, (byte) 4);
                x340Var.s0(objT);
            }
            pwo1.a(y7e1Var, qim0VarN, (max) null, strO0, pqfVar, lee1Var, j2iVar, a, (yta0) objT, (mqf) null, nqf.a, (vu30) null, false, cwg1.a, x340Var, (i2 & 14) | 32768, 3072, 6660);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pby0(i, y7e1Var, function0, qim0Var, qim0Var2, (byte) 10);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void b(int i, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        int i3;
        long j;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1487542242);
        int i4 = (x340Var.e(i) ? 4 : 2) | i2;
        if (x340Var.Y(i4 & 1, (i4 & 3) != 2)) {
            String strU = cwl1.U(2131820877, i, new Object[]{Integer.valueOf(i)}, x340Var);
            String strValueOf = String.valueOf(i);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).m;
            if (i < 10) {
                i3 = 3;
            } else {
                i3 = i < 30 ? 2 : 1;
            }
            int iC = l1d.C(i3);
            if (iC == 0) {
                x340Var.i0(208096097);
                j = cbx.a(x340Var).c.b;
                x340Var.r(false);
            } else if (iC == 1) {
                x340Var.i0(208098305);
                j = cbx.a(x340Var).c.e;
                x340Var.r(false);
            } else {
                if (iC != 2) {
                    throw p3d1.k(x340Var, 208093947, false);
                }
                x340Var.i0(208100546);
                j = cbx.a(x340Var).c.d;
                x340Var.r(false);
            }
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarN = anm1.N("reflection_text_input_counter", uyn1.B(nim0.a, 8.0f, 0.0f, 0.0f, 0.0f, 14));
            boolean zG = x340Var.g(strU);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new q4z0(strU, (byte) 18);
                x340Var.s0(objT);
            }
            uwo1.e(strValueOf, s161.b(qim0VarN, false, (iu30) objT), lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p4g0((byte) 13, i, i2);
        }
    }
}
