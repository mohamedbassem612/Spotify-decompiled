package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class ukv {
    public static final long a;
    public static final float b;
    public static final float c;

    static {
        int i = u7h.l;
        a = u7h.b;
        b = 200.0f;
        c = 40.0f;
    }

    public static final void a(int i, String str, Function0 function0, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-866986719);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            hc01 hc01Var = hc01.f;
            long j = hc01Var.a;
            long j2 = hc01Var.b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF2 = dug.f(i1p1.q(qim0VarF, er31.b(16.0f)), j, d4o1.a);
            pm31 pm31Var = new pm31(0);
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new z9t(function0, (byte) 17);
                x340Var.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarF2, false, (String) null, pm31Var, (idn0) null, (Function0) objT, 11);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarX2 = uyn1.x(qim0VarX, 16.0f);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX2);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            c(0, j2, x340Var, u291.f(nim0Var, 1.0f));
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 12.0f));
            b(str, j2, j, x340Var, i2 & 14);
            String strO0 = cwl1.o0(x340Var, 2131955653);
            qim0 qim0VarE2 = d1u.E(1.0f, j2, nim0Var, er31.a(50));
            cvx cvxVar3 = cbx.b(x340Var).b;
            cvx cvxVar4 = cbx.b(x340Var).b;
            uwo1.e(strO0, uyn1.y(qim0VarE2, 16.0f, 8.0f), lee1.a(cbx.d(x340Var).h, j2, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214), 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2040);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ql(str, function0, i, (byte) 6);
        }
    }

    public static final void b(String str, long j, long j2, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1701280353);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.f(j) ? 32 : 16) | (x340Var.f(j2) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarH = u291.h(u291.f(nim0Var, 1.0f), b);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarH);
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
            jch0.c(str, (qim0) null, new lee1(j, fc11.G(16), (FontWeight) null, FontFamily.c, 0L, 0L, 0, 0, fc11.G(28), (shc0) null, 0, 16646108), (iu30) null, 1, false, 0, 0, (x9h) null, (m0e1) null, x340Var, i2 & 14, 1002);
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            float f = c;
            qim0 qim0VarH2 = u291.h(qim0VarF, f);
            gra graVar = een.e;
            h2c h2cVar = h2c.a;
            qim0 qim0VarA = h2cVar.a(qim0VarH2, graVar);
            u7h u7hVar = new u7h(j2);
            long j3 = u7h.j;
            t1c.a(dug.e(qim0VarA, v9c.s(p7h.M(new u7h[]{u7hVar, new u7h(j3)}), 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6), x340Var, 0);
            t1c.a(dug.e(h2cVar.a(u291.h(u291.f(nim0Var, 1.0f), f), een.X), v9c.s(p7h.M(new u7h[]{new u7h(j3), new u7h(j2)}), 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6), x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tv51(j, j2, str, i);
        }
    }

    public static final void c(int i, long j, b0k b0kVar, qim0 qim0Var) {
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(844225919);
        int i2 = i | (b0kVar2.f(j) ? 4 : 2) | (b0kVar2.i(qim0Var) ? 32 : 16);
        if (b0kVar2.Y(i2 & 1, (i2 & 19) != 18)) {
            jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0Var);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(jw31VarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            String strO0 = cwl1.o0(b0kVar2, 2131955654);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, (qim0) null, lee1.a(cbx.d(b0kVar2).h, j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214), 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2042);
            b0kVar2 = b0kVar2;
            cvx cvxVar = cbx.b(b0kVar2).b;
            nim0 nim0Var = nim0.a;
            op71.g(b0kVar2, u291.v(nim0Var, 8.0f));
            String strO1 = cwl1.o0(b0kVar2, 2131955652);
            cua cuaVar = cbx.b(b0kVar2).f;
            qim0 qim0VarF = dug.f(i1p1.q(nim0Var, er31.b(4.0f)), cbx.a(b0kVar2).d.a, d4o1.a);
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            jch0.c(strO1, uyn1.y(qim0VarF, 6.0f, 2.0f), new lee1(a, fc11.G(11), (FontWeight) null, FontFamily.b, 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777180), (iu30) null, 0, false, 0, 0, (x9h) null, (m0e1) null, b0kVar2, 0, 1016);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new e82(j, qim0Var, i, (byte) 3);
        }
    }
}
