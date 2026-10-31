package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class szy {
    public static final long a;

    static {
        int i = u7h.l;
        a = u7h.b;
    }

    public static final void a(List list, qim0 qim0Var, b0k b0kVar, int i) {
        byte b;
        qim0 qim0Var2;
        cr31 cr31VarB;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1933528111);
        int i2 = 2;
        int i3 = ((i & 6) == 0 ? (x340Var.g(list) ? 4 : 2) | i : i) | 48;
        boolean z = true;
        boolean z2 = false;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            float f = -8.0f;
            jw31 jw31VarA = ew31.a(new d36(-8.0f, true, new um5(false)), een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
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
            x340Var.i0(748489619);
            int i4 = 0;
            for (Object obj : o7h.d1(list, 4)) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    p7h.T();
                    throw null;
                }
                xu21 xu21Var = (xu21) obj;
                if (xu21Var.b) {
                    x340Var.i0(1065659595);
                    x340Var.r(z2);
                    cr31VarB = er31.a;
                } else {
                    x340Var.i0(1065660440);
                    uwr uwrVar = cbx.a;
                    cua cuaVar = cbx.b(x340Var).f;
                    cr31VarB = er31.b(4.0f);
                    x340Var.r(z2);
                }
                float f2 = 0.0f;
                if (!xu21Var.b) {
                    if (i4 == i2) {
                        f2 = f;
                    } else if (i4 == 3) {
                        f2 = -2.0f;
                    }
                }
                eso1.e(Uri.parse(xu21Var.a), isl.a, i1p1.q(k1u.u(u291.r(qim0Var3, 56.0f), f2), cr31VarB), (p3v) null, (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 224304, 0, 3968);
                z = true;
                z2 = z2;
                i4 = i5;
                qim0Var3 = qim0Var3;
                f = f;
                i2 = i2;
            }
            x340Var.r(z2);
            b = 1;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b = 1;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new y6h(list, qim0Var2, i, b);
        }
    }

    public static final void b(List list, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        Object obj;
        m4c m4cVar = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(359476965);
        j06 j06Var = ((x340) b0kVar2).a;
        int i2 = i | (b0kVar2.g(list) ? 4 : 2) | (b0kVar2.i(qim0Var) ? 32 : 16) | (b0kVar2.i(function0) ? 256 : 128);
        if (b0kVar2.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar2).f;
            qim0 qim0VarF = dug.f(i1p1.q(u291.f(qim0Var, 1.0f), er31.b(8.0f)), ((yex) zex.a.d).e, d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            h2c h2cVar = h2c.a;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = h2cVar.b(nim0Var);
            Float fValueOf = Float.valueOf(0.9f);
            long j = u7h.b;
            t1c.a(dug.e(qim0VarB, v9c.t(new mmr0[]{new mmr0(fValueOf, new u7h(j)), new mmr0(Float.valueOf(1.0f), new u7h(j))}, 0.0f, 0.0f, 14), (hw61) null, 0.6f, 2), b0kVar2, 0);
            qim0 qim0VarB2 = h2cVar.b(nim0Var);
            Object objT = b0kVar2.T();
            if (objT == m4cVar) {
                objT = lyy.c;
                b0kVar2.s0(objT);
            }
            t1c.a(exd0.q(qim0VarB2, (iu30) objT), b0kVar2, 0);
            qim0 qim0VarY = uyn1.y(nim0Var, 16.0f, 24.0f);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, b0kVar2, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarY);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            if (list.isEmpty()) {
                obj = null;
                b0kVar2.i0(-1566462247);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(-1566560269);
                obj = null;
                a(list, null, b0kVar2, i2 & 14);
                x0d.s(nim0Var, 8.0f, b0kVar2, false);
            }
            uwo1.e(cwl1.o0(b0kVar2, 2131960653), (qim0) null, cbx.d(b0kVar2).e, cbx.a(b0kVar2).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2034);
            uwo1.e(ydh.g(4.0f, 2131960652, b0kVar2, b0kVar2, nim0Var), (qim0) null, cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2034);
            b0kVar2 = b0kVar2;
            op71.g(b0kVar2, u291.h(nim0Var, 16.0f));
            c((i2 >> 3) & 112, function0, b0kVar2, null);
            b0kVar2.r(true);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new g6w(list, qim0Var, function0, i, (byte) 23);
        }
    }

    public static final void c(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1918719809);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            d36 d36Var = new d36(8.0f, true, new um5(false));
            fra fraVar = een.N0;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarJ = u291.j(40.0f, 0.0f, 2, u291.f(qim0Var3, 1.0f));
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarJ, cbx.a(x340Var).a.b.a(), er31.b(20.0f));
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new ivw(function0, (byte) 10);
                x340Var.s0(objT);
            }
            qim0 qim0VarY = uyn1.y(bin.x(qim0VarF, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15), 16.0f, 8.0f);
            jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
            qim0Var2 = qim0Var3;
            uwo1.e(cwl1.o0(x340Var, 2131960650), new wnb0(1.0f, true), cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(5), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2016);
            w0h1.a(xox.c, isl.a, u291.h(qim0Var2, 16.0f), cbx.a(x340Var).b.b, 0L, false, x340Var, xox.d | 48, 48);
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tx1(qim0Var2, function0, i, (byte) 12);
        }
    }
}
