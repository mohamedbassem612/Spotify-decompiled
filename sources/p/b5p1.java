package p;

import android.content.Context;
import android.net.Uri;
import android.text.format.Formatter;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;
import java.util.WeakHashMap;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class b5p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(bb1 bb1Var, iu30 iu30Var, em0 em0Var, d0r d0rVar, g5l0 g5l0Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        m4c m4cVar;
        String str = bb1Var.N0;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-44271195);
        int i2 = i | (b0kVar3.i(bb1Var) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | (b0kVar3.i(em0Var) ? 256 : 128) | (b0kVar3.i(d0rVar) ? 2048 : 1024) | (b0kVar3.i(g5l0Var) ? 16384 : 8192) | 196608;
        if (b0kVar3.Y(i2 & 1, (74899 & i2) != 74898)) {
            az20 az20Var = (az20) b0kVar3.k(t4k.i);
            k6a1 k6a1Var = (k6a1) b0kVar3.k(t4k.q);
            WeakHashMap weakHashMap = osl1.x;
            u85 u85Var = lhc.g(b0kVar3).c;
            boolean z = u85Var.e().d > 0;
            ven0 ven0VarS = v8r.s(iu30Var, b0kVar3);
            Object objT = b0kVar3.T();
            m4c m4cVar2 = fkj0.X;
            if (objT == m4cVar2) {
                m4cVar = m4cVar2;
                p251 p251Var = new p251(new xj0(ven0VarS, (byte) 4), new d4((Object) ven0VarS, (Object) az20Var, (byte) 13), new ma0(ven0VarS, (byte) 5), true, ((qq) ((wwo) em0Var.g).a.c).e());
                b0kVar3.s0(p251Var);
                objT = p251Var;
            } else {
                m4cVar = m4cVar2;
            }
            p251 p251Var2 = (p251) objT;
            boolean zG = b0kVar3.g(d0rVar);
            Object objT2 = b0kVar3.T();
            if (zG || objT2 == m4cVar) {
                u16 u16Var = new u16(d0rVar, new ma0(ven0VarS, (byte) 3), new ma0(ven0VarS, (byte) 4));
                b0kVar3.s0(u16Var);
                objT2 = u16Var;
            }
            u16 u16Var2 = (u16) objT2;
            Object objT3 = b0kVar3.T();
            byte b2 = 1;
            if (objT3 == m4cVar) {
                objT3 = new fb1(p251Var2, null, (byte) 1);
                b0kVar3.s0(objT3);
            }
            qxd0.t(rih1.a, b0kVar3, (vu30) objT3);
            boolean zI = b0kVar3.i(bb1Var) | b0kVar3.i(az20Var) | b0kVar3.g(k6a1Var);
            Object objT4 = b0kVar3.T();
            if (zI || objT4 == m4cVar) {
                hb1 hb1Var = new hb1(bb1Var, az20Var, k6a1Var, (lnm) null, (byte) 0);
                b0kVar3.s0(hb1Var);
                objT4 = hb1Var;
            }
            qxd0.t(str, b0kVar3, (vu30) objT4);
            qti1 qti1Var = voo1.f;
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            irn1.u(voo1.y(qim0Var3, qti1Var), apo.r(-64088936, new ib1(bb1Var, b2), b0kVar3), apo.r(1761546841, new gb1(p251Var2, bb1Var, (byte) 2), b0kVar3), null, apo.r(-390013986, new jb1((Object) bb1Var, (Object) iu30Var, (Object) em0Var, (Object) d0rVar, (Object) g5l0Var, (byte) 0), b0kVar3), b0kVar2, 25008, 8);
            if (str == null || z) {
                str = null;
            }
            if (str == null) {
                b0kVar2.i0(-324404905);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(-324404904);
                boolean zI2 = b0kVar2.i(g5l0Var);
                Object objT5 = b0kVar2.T();
                if (zI2 || objT5 == m4cVar) {
                    objT5 = new kb1(g5l0Var, (byte) 1);
                    b0kVar2.s0(objT5);
                }
                dgo1.c("artistApprovalConfirmationDialog", (iu30) objT5, apo.r(-2120272021, new lb1(u16Var2, str, (byte) 0), b0kVar2), b0kVar2, 390);
                b0kVar2.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new k40(bb1Var, iu30Var, em0Var, d0rVar, g5l0Var, qim0Var2, i);
        }
    }

    public static final void b(llw0 llw0Var, float f, jlw0 jlw0Var, g2z g2zVar, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        qim0 qim0Var3;
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1991859966);
        int i2 = i | (x340Var.i(llw0Var) ? 4 : 2) | (x340Var.d(f) ? 32 : 16) | (x340Var.i(jlw0Var) ? 256 : 128) | (x340Var.i(g2zVar) ? 2048 : 1024) | 24576;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            boolean zG = x340Var.g(g2zVar);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = g2z.x(g2zVar, (xwa) null, 7);
                x340Var.s0(objT);
            }
            ka71 ka71Var = (ka71) objT;
            int i3 = 2;
            if (jlw0Var != null) {
                i3 = 1;
            }
            z971 z971Var = new z971(llw0Var, 1, i3);
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarR = d7e.r(f, u291.v(qim0Var4, 192.0f), false);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarQ = i1p1.q(qim0VarR, er31.b(16.0f));
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarQ);
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
            otw.c(ka71Var, z971Var, u291.d(qim0Var4, 1.0f), (ipb1) null, x340Var, 0, 8);
            if (jlw0Var == null) {
                x340Var.i0(-1906090703);
                x340Var.r(false);
                z = true;
                qim0Var3 = qim0Var4;
            } else {
                x340Var.i0(-1906090702);
                Uri uri = Uri.parse(jlw0Var.a);
                qim0 qim0VarD = u291.d(qim0Var4, 1.0f);
                cvx cvxVar = cbx.b(x340Var).b;
                qim0Var3 = qim0Var4;
                z = true;
                eso1.e(uri, isl.a, uyn1.x(qim0VarD, 12.0f), (p3v) null, (zvx) null, (ecx) null, mif1.Q0, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 224304, 0, 3968);
                x340Var = x340Var;
                x340Var.r(false);
            }
            x340Var.r(z);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e0a(llw0Var, f, jlw0Var, g2zVar, qim0Var2, i);
        }
    }

    public static final void c(int i, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1372393467);
        j06 j06Var = x340Var.a;
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                x340Var.s0(iu30Var);
                objT = iu30Var;
            }
            iu30 iu30Var2 = (iu30) objT;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarB = uyn1.B(qim0Var3, 16.0f, 0.0f, 16.0f, 8.0f, 2);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            long jA = cbx.a(x340Var).a.a.a();
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF2 = dug.f(qim0VarF, jA, er31.b(8.0f));
            cvx cvxVar4 = cbx.b(x340Var).b;
            cvx cvxVar5 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarF2, 12.0f, 12.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarY);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            qim0Var2 = qim0Var3;
            uwo1.e(cwl1.o0(x340Var, 2131954845), kk0.q(x340Var, qim0VarE2, lljVar4, 1.0f, true), cbx.d(x340Var).j, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
            cvx cvxVar6 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.v(qim0Var2, 4.0f));
            gfx.g(8, apo.r(-688864100, new v0j(iu30Var2, (byte) 19), x340Var), x340Var, 54);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n52(qim0Var2, iu30Var, i, (byte) 8);
        }
    }

    public static final void d(int i, int i2, b0k b0kVar, qim0 qim0Var) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1929911336);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                qim0Var = nim0.a;
            }
            qim0 qim0VarD = u291.d(qim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
            xto1.e(null, 3, 0L, 0L, x340Var, 48, 13);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kx9((byte) 2, i, i2, qim0Var);
        }
    }

    public static final void e(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1490870195);
        if (x340Var.Y(i & 1, i != 0)) {
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            cua cuaVar = cbx.b(x340Var).f;
            t1c.a(cwl1.l0(dug.f(qim0VarD, jA, er31.b(4.0f)), 0L, (hw61) null, 15), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fk01(i, (byte) 22);
        }
    }

    public static final void f(boolean z, c380 c380Var, c380 c380Var2, nde1 nde1Var, int i, ggv ggvVar, iu30 iu30Var, qim0 qim0Var, int i2, fde1 fde1Var, List list, String str, long j, boolean z2, b0k b0kVar, int i3) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1511289793);
        int i4 = i3 | (x340Var.h(z) ? 4 : 2) | (x340Var.g(c380Var) ? 32 : 16) | (x340Var.g(c380Var2) ? 256 : 128) | (x340Var.i(nde1Var) ? 2048 : 1024) | (x340Var.e(i) ? 16384 : 8192) | (x340Var.i(ggvVar) ? 131072 : 65536) | (x340Var.i(iu30Var) ? 1048576 : 524288) | (x340Var.i(qim0Var) ? 8388608 : 4194304) | (x340Var.e(i2 == 0 ? -1 : l1d.C(i2)) ? 67108864 : 33554432) | (x340Var.e(fde1Var != null ? fde1Var.ordinal() : -1) ? 536870912 : 268435456);
        char c = 128;
        int i5 = (x340Var.g(list) ? (char) 4 : (char) 2) | (x340Var.g(str) ? ' ' : (char) 16);
        if (x340Var.f(j)) {
            c = 256;
        }
        if (!x340Var.Y(i4 & 1, ((i4 & 306783379) == 306783378 && (((i5 | c) | (x340Var.h(z2) ? 2048 : 1024)) & 1171) == 1170) ? false : true)) {
            x340Var.b0();
        } else if (c380Var.isEmpty()) {
            x340Var.i0(1308568736);
            uwr uwrVar = cbx.a;
            l4o1.g(nde1Var.a, anm1.N("no_text_content", uyn1.y(qim0Var, cbx.b(x340Var).b.b, cbx.b(x340Var).b.d)), x340Var, 0);
            x340Var.r(false);
        } else {
            x340Var.i0(1308900808);
            flb0 flb0Var = flb0.a;
            mod.b(t4k.n.a(flb0Var), apo.r(1972743259, new qae1(i2, i, j, str, list, ggvVar, iu30Var, c380Var, c380Var2, z ? flb0.b : flb0Var, qim0Var, fde1Var, z2), x340Var), x340Var, 56);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rae1(z, c380Var, c380Var2, nde1Var, i, ggvVar, iu30Var, qim0Var, i2, fde1Var, list, str, j, z2, i3);
        }
    }

    public static final void g(Long l, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        String strN0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1466250839);
        int i2 = (x340Var.g(l) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            if (l == null || l.longValue() <= 0) {
                x340Var.i0(-1260991115);
                x340Var.r(false);
                strN0 = "";
            } else {
                x340Var.i0(-1261147043);
                String shortFileSize = Formatter.formatShortFileSize(context, l.longValue());
                shortFileSize.getClass();
                strN0 = cwl1.n0(2131963786, new Object[]{shortFileSize}, x340Var);
                x340Var.r(false);
            }
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).j;
            long j = cbx.a(x340Var).b.b;
            qim0Var2 = nim0.a;
            uwo1.e(strN0, qim0Var2, lee1Var, j, null, null, 0, false, null, 0, null, x340Var, 48, 0, 2032);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new eii1(l, qim0Var2, i, (byte) 16);
        }
    }

    public static c9 h(bff0 bff0Var) {
        uwr uwrVar = cbx.a;
        zsc zscVar = zex.a;
        int iG = z4p1.G(((vex) zscVar.b).a);
        yex yexVar = (yex) zscVar.d;
        int iG2 = z4p1.G(yexVar.a);
        int iG3 = z4p1.G(yexVar.c);
        int iG4 = z4p1.G(yexVar.i);
        int i = bff0Var.a;
        int i2 = bff0Var.b;
        int i3 = bff0Var.f ? bff0Var.c : bff0Var.d;
        int i4 = bff0Var.d;
        int i5 = bff0Var.e;
        return mqo1.s(new k9h(i, i2, i3, iG4, i4, i5), new k9h(i4, i4, i, iG4, i4, i5), new k9h(iG3, iG2, bff0Var.c, iG4, i4, i5), new k9h(iG4, iG4, iG, iG, iG, iG));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object i(mr20 mr20Var, lnm lnmVar) throws AbortFlowException {
        ku20 ku20Var;
        p811 p811VarU;
        AbortFlowException e;
        iu20 iu20Var;
        if (lnmVar instanceof ku20) {
            ku20Var = (ku20) lnmVar;
            int i = ku20Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ku20Var.d = i - Integer.MIN_VALUE;
            } else {
                ku20Var = new ku20(lnmVar);
            }
        } else {
            ku20Var = new ku20(lnmVar);
        }
        Object obj = ku20Var.c;
        int i2 = ku20Var.d;
        jm jmVar = wqn1.a;
        if (i2 == 0) {
            p811VarU = cy30.u(obj);
            p811VarU.a = jmVar;
            iu20 iu20Var2 = new iu20(p811VarU, (byte) 0);
            try {
                ku20Var.a = p811VarU;
                ku20Var.b = iu20Var2;
                ku20Var.d = 1;
                Object objCollect = mr20Var.collect(iu20Var2, ku20Var);
                d9n d9nVar = d9n.a;
                if (objCollect == d9nVar) {
                    return d9nVar;
                }
            } catch (AbortFlowException e2) {
                e = e2;
                iu20Var = iu20Var2;
                if (e.a == iu20Var) {
                    throw e;
                }
                op71.x(ku20Var.getContext());
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iu20Var = ku20Var.b;
            p811VarU = ku20Var.a;
            try {
                hm5.M(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                if (e.a == iu20Var) {
                    throw e;
                }
                op71.x(ku20Var.getContext());
            }
        }
        Object obj2 = p811VarU.a;
        if (obj2 != jmVar) {
            return obj2;
        }
        bhn0.t("Expected at least one element");
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object j(mr20 mr20Var, vu30 vu30Var, lnm lnmVar) throws AbortFlowException {
        lu20 lu20Var;
        p811 p811Var;
        AbortFlowException e;
        mib mibVar;
        if (lnmVar instanceof lu20) {
            lu20Var = (lu20) lnmVar;
            int i = lu20Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                lu20Var.d = i - Integer.MIN_VALUE;
            } else {
                lu20Var = new lu20(lnmVar);
            }
        } else {
            lu20Var = new lu20(lnmVar);
        }
        Object obj = lu20Var.c;
        int i2 = lu20Var.d;
        jm jmVar = wqn1.a;
        if (i2 == 0) {
            p811 p811VarU = cy30.u(obj);
            p811VarU.a = jmVar;
            mib mibVar2 = new mib(vu30Var, p811VarU, (byte) 11);
            try {
                lu20Var.a = p811VarU;
                lu20Var.b = mibVar2;
                lu20Var.d = 1;
                Object objCollect = mr20Var.collect(mibVar2, lu20Var);
                d9n d9nVar = d9n.a;
                if (objCollect == d9nVar) {
                    return d9nVar;
                }
                p811Var = p811VarU;
            } catch (AbortFlowException e2) {
                p811Var = p811VarU;
                e = e2;
                mibVar = mibVar2;
                if (e.a == mibVar) {
                    throw e;
                }
                op71.x(lu20Var.getContext());
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mibVar = lu20Var.b;
            p811Var = lu20Var.a;
            try {
                hm5.M(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                if (e.a == mibVar) {
                    throw e;
                }
                op71.x(lu20Var.getContext());
            }
        }
        Object obj2 = p811Var.a;
        if (obj2 != jmVar) {
            return obj2;
        }
        bhn0.t("Expected at least one element matching the predicate");
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object k(mr20 mr20Var, lnm lnmVar) throws AbortFlowException {
        nu20 nu20Var;
        p811 p811VarU;
        AbortFlowException e;
        iu20 iu20Var;
        if (lnmVar instanceof nu20) {
            nu20Var = (nu20) lnmVar;
            int i = nu20Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nu20Var.d = i - Integer.MIN_VALUE;
            } else {
                nu20Var = new nu20(lnmVar);
            }
        } else {
            nu20Var = new nu20(lnmVar);
        }
        Object obj = nu20Var.c;
        int i2 = nu20Var.d;
        if (i2 == 0) {
            p811VarU = cy30.u(obj);
            iu20 iu20Var2 = new iu20(p811VarU, (byte) 1);
            try {
                nu20Var.a = p811VarU;
                nu20Var.b = iu20Var2;
                nu20Var.d = 1;
                Object objCollect = mr20Var.collect(iu20Var2, nu20Var);
                d9n d9nVar = d9n.a;
                if (objCollect == d9nVar) {
                    return d9nVar;
                }
            } catch (AbortFlowException e2) {
                e = e2;
                iu20Var = iu20Var2;
                if (e.a == iu20Var) {
                    throw e;
                }
                op71.x(nu20Var.getContext());
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iu20Var = nu20Var.b;
            p811VarU = nu20Var.a;
            try {
                hm5.M(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                if (e.a == iu20Var) {
                    throw e;
                }
                op71.x(nu20Var.getContext());
            }
        }
        return p811VarU.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object l(mr20 mr20Var, vu30 vu30Var, lnm lnmVar) throws AbortFlowException {
        ou20 ou20Var;
        p811 p811Var;
        AbortFlowException e;
        u5z u5zVar;
        if (lnmVar instanceof ou20) {
            ou20Var = (ou20) lnmVar;
            int i = ou20Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ou20Var.d = i - Integer.MIN_VALUE;
            } else {
                ou20Var = new ou20(lnmVar);
            }
        } else {
            ou20Var = new ou20(lnmVar);
        }
        Object obj = ou20Var.c;
        int i2 = ou20Var.d;
        if (i2 == 0) {
            p811 p811VarU = cy30.u(obj);
            u5z u5zVar2 = new u5z(vu30Var, p811VarU, (byte) 15);
            try {
                ou20Var.a = p811VarU;
                ou20Var.b = u5zVar2;
                ou20Var.d = 1;
                Object objCollect = mr20Var.collect(u5zVar2, ou20Var);
                d9n d9nVar = d9n.a;
                if (objCollect == d9nVar) {
                    return d9nVar;
                }
                p811Var = p811VarU;
            } catch (AbortFlowException e2) {
                p811Var = p811VarU;
                e = e2;
                u5zVar = u5zVar2;
                if (e.a == u5zVar) {
                    throw e;
                }
                op71.x(ou20Var.getContext());
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            u5zVar = ou20Var.b;
            p811Var = ou20Var.a;
            try {
                hm5.M(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                if (e.a == u5zVar) {
                    throw e;
                }
                op71.x(ou20Var.getContext());
            }
        }
        return p811Var.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object m(lt20 lt20Var, onm onmVar) {
        pu20 pu20Var;
        p811 p811Var;
        if (onmVar instanceof pu20) {
            pu20Var = (pu20) onmVar;
            int i = pu20Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pu20Var.c = i - Integer.MIN_VALUE;
            } else {
                pu20Var = new pu20(onmVar);
            }
        } else {
            pu20Var = new pu20(onmVar);
        }
        Object obj = pu20Var.b;
        int i2 = pu20Var.c;
        if (i2 == 0) {
            p811 p811VarU = cy30.u(obj);
            iu20 iu20Var = new iu20(p811VarU, (byte) 2);
            pu20Var.a = p811VarU;
            pu20Var.c = 1;
            Object objCollect = lt20Var.collect(iu20Var, pu20Var);
            d9n d9nVar = d9n.a;
            if (objCollect == d9nVar) {
                return d9nVar;
            }
            p811Var = p811VarU;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p811Var = pu20Var.a;
            hm5.M(obj);
        }
        return p811Var.a;
    }

    public static bqk0 n(String str) {
        return new bqk0(str, (byte) 9);
    }

    public static final lvl0 o(urk0 urk0Var, fhu0 fhu0Var) {
        d8r0 d8r0Var = fhu0Var.f;
        return new lvl0(new mjl0(new mjl0(urk0Var, d8r0Var.b, d8r0Var.a, d8r0Var.e), d8r0Var.d), fhu0Var.e, (byte) 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object p(wt20 wt20Var, onm onmVar) {
        qu20 qu20Var;
        p811 p811Var;
        if (onmVar instanceof qu20) {
            qu20Var = (qu20) onmVar;
            int i = qu20Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qu20Var.c = i - Integer.MIN_VALUE;
            } else {
                qu20Var = new qu20(onmVar);
            }
        } else {
            qu20Var = new qu20(onmVar);
        }
        Object obj = qu20Var.b;
        int i2 = qu20Var.c;
        jm jmVar = wqn1.a;
        if (i2 == 0) {
            p811 p811VarU = cy30.u(obj);
            p811VarU.a = jmVar;
            cff cffVar = new cff(p811VarU, (byte) 9);
            qu20Var.a = p811VarU;
            qu20Var.c = 1;
            Object objCollect = wt20Var.collect(cffVar, qu20Var);
            d9n d9nVar = d9n.a;
            if (objCollect == d9nVar) {
                return d9nVar;
            }
            p811Var = p811VarU;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p811Var = qu20Var.a;
            hm5.M(obj);
        }
        Object obj2 = p811Var.a;
        if (obj2 != jmVar) {
            return obj2;
        }
        bhn0.t("Flow is empty");
        return null;
    }
}
