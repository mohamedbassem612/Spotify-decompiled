package p;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class gwa1 {
    public static final List a = p7h.M(new Integer[]{-30, -20, -10, 0, 10, 20, 30});

    public static final void a(Float f, float f2, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-416449347);
        int i2 = i | (x340Var.g(f) ? 4 : 2) | (x340Var.d(f2) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            float f3 = (f2 - 1.0f) * 100.0f;
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
            hzj.A.getClass();
            String str = null;
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (f == null) {
                x340Var.i0(1456379572);
                x340Var.r(false);
            } else {
                x340Var.i0(1456379573);
                int iU = jch0.U(f.floatValue());
                str = "\u2066" + cwl1.U(2131820931, iU, new Object[]{Integer.valueOf(iU)}, x340Var) + "\u2069";
                x340Var.r(false);
            }
            if (str == null) {
                str = "--";
            }
            uwr uwrVar = cbx.a;
            uwo1.e(str, (qim0) null, cbx.d(x340Var).a, cbx.a(x340Var).b.c, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 4.0f));
            uwo1.e(f4i1.f("\u2066", cwl1.n0(2131962833, new Object[]{Float.valueOf(f3)}, x340Var), "\u2069"), (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rz2(f, f2, i, (byte) 11);
        }
    }

    public static final void b(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        long jB;
        long j;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1020577173);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = ktd.n(x340Var);
            }
            idn0 idn0Var = (idn0) objT;
            ven0 ven0VarM = k1u.m(idn0Var, x340Var, 0);
            if (z) {
                x340Var.i0(-1522109513);
                uwr uwrVar = cbx.a;
                jB = cbx.a(x340Var).b.c;
                x340Var.r(false);
            } else if (((Boolean) ven0VarM.getValue()).booleanValue()) {
                x340Var.i0(-1522108098);
                x340Var.r(false);
                jB = u7h.b(u7h.f, 0.16f, 0.0f, 0.0f, 0.0f, 14);
            } else {
                x340Var.i0(-1522106626);
                x340Var.r(false);
                jB = u7h.b(u7h.f, 0.1f, 0.0f, 0.0f, 0.0f, 14);
            }
            if (z) {
                x340Var.i0(-1522103857);
                uwr uwrVar2 = cbx.a;
                j = cbx.a(x340Var).a.c;
            } else {
                x340Var.i0(-1522102865);
                uwr uwrVar3 = cbx.a;
                j = cbx.a(x340Var).b.a;
            }
            x340Var.r(false);
            long j2 = j;
            qim0 qim0VarV = bin.v(dug.f(i1p1.q(d7e.r(1.0f, qim0Var, false), er31.a), jB, d4o1.a), idn0Var, (ga80) null, false, (String) null, (pm31) null, function0, 28);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarV);
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
            uwo1.e(str, (qim0) null, cbx.d(x340Var).j, j2, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var, i2 & 14, 0, 1778);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pfg(str, z, function0, qim0Var, i, (byte) 9);
        }
    }

    public static final void c(float f, Float f2, boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(390180951);
        int i2 = i | (x340Var.d(f) ? 4 : 2) | (x340Var.g(f2) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.i(iu30Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            x340Var.i0(-1874260102);
            Iterator it = a.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                float f3 = (iIntValue / 100.0f) + 1.0f;
                boolean z2 = z && (f2 == null ? Math.abs(f - f3) < 5.0E-4f : jch0.U(f2.floatValue() * f) == jch0.U(f2.floatValue() * f3));
                String str = iIntValue == 0 ? "0%" : String.format("\u2066%+d%%\u2069", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue)}, 1));
                boolean zH = x340Var.h(z2) | ((i2 & 7168) == 2048) | x340Var.e(iIntValue);
                Object objT = x340Var.T();
                if (zH || objT == fkj0.X) {
                    objT = new fwa1(z2, iu30Var, iIntValue);
                    x340Var.s0(objT);
                }
                b(0, str, (Function0) objT, x340Var, new wnb0(1.0f, true), z2);
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l3a(f, f2, z, iu30Var, i);
        }
    }
}
