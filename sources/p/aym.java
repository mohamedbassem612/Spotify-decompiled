package p;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.mobius.MobiusLoop;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class aym {
    public static b180 a;
    public static b180 b;

    public static final void a(int i, String str, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1216756129);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            uwo1.e(str, qim0Var, cbx.d(x340Var).j, ((vex) zex.a.e).m, (a0e1) null, (iu30) null, 0, false, new cjc0(2), 0, (qx8) null, x340Var, i2 & 126, 0, 1776);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rj(str, qim0Var, i, (byte) 13);
        }
    }

    public static final void b(int i, b0k b0kVar, ziu ziuVar, iu30 iu30Var, qim0 qim0Var) {
        int i2;
        afx afxVarE;
        long j;
        iu30 iu30Var2;
        iu30 iu30Var3 = iu30Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2119865719);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(ziuVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            xb10 xb10VarO = x4p1.o(x340Var);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = yv91.a(new q27(xb10VarO, (byte) 1));
                x340Var.s0(objT);
            }
            wb10 wb10Var = (wb10) ((tob1) objT).getValue();
            if (wb10Var != null) {
                int i3 = wb10Var.b;
                int i4 = ihx.f;
                afxVarE = ihx.e(30, z4p1.e(i3), 0L, 0L);
            } else {
                afxVarE = null;
            }
            u7h u7hVar = afxVarE != null ? new u7h(afxVarE.a.c) : null;
            if (u7hVar == null) {
                x340Var.i0(-1376443664);
                j = cbx.a(x340Var).d.b;
                x340Var.r(false);
            } else {
                x340Var.i0(-1376445431);
                x340Var.r(false);
                j = u7hVar.a;
            }
            uwr uwrVar2 = cbx.a;
            Float fS = s(ziuVar.f.e);
            float fFloatValue = fS != null ? fS.floatValue() : 1.0f;
            uwrVar2.getClass();
            afx afxVar = afxVarE;
            ecx ecxVar = new ecx(fFloatValue);
            boolean z = fFloatValue > 1.2f;
            int iJ = up30.j(ziuVar, x340Var);
            int i5 = i2;
            tob1 tob1VarB = z95.b(ziuVar.a ? 0.0f : 1.0f, irn1.o0(iJ, 0, (dlv) null, 6), "spotlight alpha", (iu30) null, x340Var, 3072, 20);
            qim0 qim0VarF = hno1.f(qim0Var, (ecx) uwr.m.getValue());
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarQ = exd0.q(dug.f(i1p1.q(qim0VarF, er31.b(16.0f)), j, d4o1.a), ook0.Z0);
            if (!z) {
                qim0VarQ = qim0VarQ.then(exd0.q(nim0.a, new vbk0((byte) 7, ((Number) tob1VarB.getValue()).floatValue())));
            }
            qim0 qim0Var2 = qim0VarQ;
            zzq0 zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
            boolean zI = x340Var.i(ziuVar) | ((i5 & 112) == 32);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                iu30Var2 = iu30Var;
                objT2 = new glb(ziuVar, iu30Var2, (byte) 0);
                x340Var.s0(objT2);
            } else {
                iu30Var2 = iu30Var;
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT2);
            iu30Var3 = iu30Var2;
            cwl1.b(qim0Var2, (tl3) null, (hw61) null, (pgx) null, zzq0Var, (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, apo.r(76795264, new tj6(ziuVar, iJ, xb10VarO, iu30Var3, ecxVar, afxVar), x340Var), x340Var, 0, 48, 1518);
            x340Var = x340Var;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kq0(ziuVar, iu30Var3, qim0Var, i);
        }
    }

    public static final void c(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-686447275);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarR = u291.r(uyn1.B(qim0Var, 8.0f, 8.0f, 0.0f, 0.0f, 12), cbx.b(x340Var).b.e);
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF = dug.f(i1p1.q(qim0VarR, er31.b(4.0f)), ((vex) zex.a.e).f, d4o1.a);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            cvx cvxVar3 = cbx.b(x340Var).b;
            uwo1.e(str, uyn1.B(qim0VarF2, 0.0f, 2.0f, 0.0f, 0.0f, 13), cbx.d(x340Var).k, cbx.a(x340Var).b.a, new a0e1(3), (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, i2 & 14, 0, 1696);
            uwo1.e(str2, u291.f(nim0Var, 1.0f), cbx.d(x340Var).d, cbx.a(x340Var).b.a, new a0e1(3), (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, (i2 >> 3) & 14, 0, 1696);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c4(str, str2, qim0Var, i, (byte) 10);
        }
    }

    public static final void d(hqk hqkVar, znb0 znb0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-87903285);
        int i2 = i | (x340Var.g(hqkVar) ? 4 : 2) | (x340Var.i(znb0Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            nyx.a(2, (wux) null, apo.r(1643614168, new ys(((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).screenWidthDp, iu30Var, hqkVar, znb0Var), x340Var), x340Var, 3078, 6);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hwd(i, hqkVar, znb0Var, iu30Var, qim0Var2, (byte) 21);
        }
    }

    public static final void e(gt40 gt40Var, u8h u8hVar, b0k b0kVar, int i) {
        u8h u8hVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(697236515);
        int i2 = i | 6 | (x340Var.i(u8hVar) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) x340Var.k(p4k.b);
            gt40 gt40Var2 = et40.a;
            u8hVar2 = u8hVar;
            yoi1.d(new p05(2131233396), context.getString(2131959288), dm5.Q(gt40Var2, 20.0f).c(new iql1(z4u.a)), 0, u8hVar2, x340Var, 32768 | ((i2 << 9) & 57344), 8);
            gt40Var = gt40Var2;
        } else {
            u8hVar2 = u8hVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d0e0(gt40Var, u8hVar2, i, (byte) 11);
        }
    }

    public static final void f(ksw kswVar, int i, Function0 function0, b0k b0kVar, int i2, int i3) {
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-591413523);
        if ((i2 & 6) == 0) {
            i4 = (x340Var.g(kswVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= x340Var.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= x340Var.i(function0) ? 256 : 128;
        }
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            if (i5 != 0) {
                i = 50;
            }
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                x340Var.i0(-844031595);
                x340Var.r(false);
            } else {
                x340Var.i0(-844200731);
                boolean z = ((i4 & 112) == 32) | ((i4 & 896) == 256);
                Object objT2 = x340Var.T();
                if (z || objT2 == m4cVar) {
                    objT2 = new yv70(i, function0, ven0Var, (byte) 1);
                    x340Var.s0(objT2);
                }
                n9p1.e(kswVar, (iu30) objT2, x340Var, i4 & 14);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        int i6 = i;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nj8(kswVar, i6, function0, i2, i3);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void g(q4w0 q4w0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        long j;
        long j2;
        m4c m4cVar = fkj0.X;
        int i3 = q4w0Var.b;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1959423920);
        if ((i & 6) == 0) {
            i2 = i | (b0kVar3.g(q4w0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        int i4 = i2 | 384;
        if (b0kVar3.Y(i4 & 1, (i4 & 147) != 146)) {
            Context context = (Context) b0kVar3.k(AndroidCompositionLocals_androidKt.b);
            int iC = l1d.C(i3);
            if (iC == 0) {
                b0kVar3.i0(622357945);
                b0kVar3.r(false);
                uwr uwrVar = cbx.a;
                j = ((vex) zex.a.b).j;
            } else if (iC == 1) {
                b0kVar3.i0(622359918);
                uwr uwrVar2 = cbx.a;
                j = cbx.a(b0kVar3).a.c;
                b0kVar3.r(false);
            } else {
                if (iC != 2) {
                    throw p3d1.k(b0kVar3, 622356141, false);
                }
                b0kVar3.i0(622361593);
                b0kVar3.r(false);
                uwr uwrVar3 = cbx.a;
                j = ((vex) zex.a.b).j;
            }
            if (i3 == 2) {
                b0kVar3.i0(1810719991);
                uwr uwrVar4 = cbx.a;
                j2 = cbx.a(b0kVar3).c.b;
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(1810720603);
                b0kVar3.r(false);
                j2 = u7h.j;
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("presave-button-tag", qim0Var3);
            boolean z = (i4 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z || objT == m4cVar) {
                objT = new smt0(iu30Var, (byte) 26);
                b0kVar3.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            cr31 cr31VarB = er31.b(48.0f);
            boolean zF = b0kVar3.f(j);
            Object objT2 = b0kVar3.T();
            if (zF || objT2 == m4cVar) {
                objT2 = new q9j0((byte) 11, j);
                b0kVar3.s0(objT2);
            }
            vu30 vu30Var = (vu30) objT2;
            boolean zF2 = b0kVar3.f(j2);
            Object objT3 = b0kVar3.T();
            if (zF2 || objT3 == m4cVar) {
                objT3 = new q9j0((byte) 12, j2);
                b0kVar3.s0(objT3);
            }
            kgx kgxVar = new kgx(0, vu30Var, (vu30) objT3, (vu30) null, 9);
            uwr uwrVar5 = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            cwl1.b(qim0VarN, (tl3) null, cr31VarB, kgxVar, new zzq0(12.0f, 4.0f, 12.0f, 4.0f), (max) null, false, (idn0) null, ny3.a, gbxVar, (gbx) null, apo.r(408348199, new hov0(q4w0Var, context, (byte) 2), b0kVar3), b0kVar2, 0, 48, 1250);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new jmk0(q4w0Var, iu30Var, qim0Var2, i, (byte) 29);
        }
    }

    public static final void h(String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2004374889);
        int i2 = (x340Var.g(str) ? 4 : 2) | i;
        if (!x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            x340Var.b0();
        } else {
            if (str == null) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new j3b(str, i, (byte) 8);
                    return;
                }
                return;
            }
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(str, uyn1.B(qim0VarF, 16.0f, 0.0f, 0.0f, 0.0f, 14), cbx.d(x340Var).h, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, new cjc0(4), 0, (qx8) null, x340Var, i2 & 14, 0, 1776);
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new j3b(str, i, (byte) 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:29:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0082  */
    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    /* JADX WARN: Code duplicated, block: B:35:0x008f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:45:0x011e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0122  */
    /* JADX WARN: Code duplicated, block: B:49:0x014a  */
    /* JADX WARN: Code duplicated, block: B:51:0x018e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0193  */
    /* JADX WARN: Code duplicated, block: B:56:0x019f  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public static final void i(vu30 vu30Var, qim0 qim0Var, boolean z, j2i j2iVar, b0k b0kVar, int i, int i2) {
        boolean z2;
        boolean z3;
        j2i j2iVar2;
        boolean z4;
        h311 h311VarV;
        boolean z5;
        qim0 qim0Var2;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z6;
        n4k n4kVar;
        qim0 qim0VarB;
        Object objT;
        Object objT2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1277989918);
        j06 j06Var = x340Var.a;
        int i3 = (x340Var.i(vu30Var) ? 4 : 2) | i | (x340Var.g(qim0Var) ? 32 : 16);
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                z2 = z;
                i3 |= x340Var.h(z2) ? 256 : 128;
            }
            if ((i3 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i3 & 1, z3)) {
                if (i4 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                qim0Var2 = nim0.a;
                qim0 qim0VarD = u291.d(qim0Var2, 1.0f);
                gfh0VarC = t1c.c(een.d, false);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarD);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                z6 = x340Var.S;
                n4kVar = hmb0.t1;
                if (z6) {
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
                qim0 qim0VarA = h2c.a.a(u291.c(u291.f(qim0Var2, 1.0f), 0.75f), een.h);
                uwr uwrVar = cbx.a;
                qim0 qim0VarZ = uyn1.z(cbx.b(x340Var).e.c, 0.0f, 2, qim0VarA);
                if (z5) {
                    x340Var.i0(841474445);
                    objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = nhe1.c1;
                        x340Var.s0(objT2);
                    }
                    qim0VarB = s161.b(qim0Var2, true, (iu30) objT2);
                    x340Var.r(false);
                } else {
                    x340Var.i0(841475792);
                    x340Var.r(false);
                    qim0VarB = qim0Var2;
                }
                qim0 qim0VarThen = qim0VarZ.then(qim0VarB);
                mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 54);
                int i5 = i3;
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarThen);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                vnr0 vnr0Var = (vnr0) vu30Var.invoke(x340Var, Integer.valueOf(i5 & 14));
                qim0 qim0VarB2 = u291.B(qim0Var2, (gra) null, 3);
                objT = x340Var.T();
                if (objT == m4cVar) {
                    objT = nhe1.d1;
                    x340Var.s0(objT);
                }
                qgo1.f(vnr0Var, s161.b(qim0VarB2, false, (iu30) objT).then(qim0Var), (a0e1) null, 0, false, (iu30) null, x340Var, 8, 60);
                op71.g(x340Var, u291.h(qim0Var2, cbx.b(x340Var).b.b));
                j2iVar2 = j2iVar;
                j2iVar2.invoke(pbh.a, x340Var, 54);
                x340Var.r(true);
                x340Var.r(true);
                z4 = z5;
            } else {
                j2iVar2 = j2iVar;
                x340Var.b0();
                z4 = z2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new uo80(vu30Var, qim0Var, z4, j2iVar2, i, i2);
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i3 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i3 & 1, z3)) {
            if (i4 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            qim0Var2 = nim0.a;
            qim0 qim0VarD2 = u291.d(qim0Var2, 1.0f);
            gfh0VarC = t1c.c(een.d, false);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarD2);
            hzj.A.getClass();
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            z6 = x340Var.S;
            n4kVar = hmb0.t1;
            if (z6) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar5 = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar5);
            llj lljVar6 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar6);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            llj lljVar7 = y580.R0;
            nko1.H(numValueOf2, x340Var, lljVar7);
            nko1.F(x340Var);
            llj lljVar8 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar8);
            qim0 qim0VarA2 = h2c.a.a(u291.c(u291.f(qim0Var2, 1.0f), 0.75f), een.h);
            uwr uwrVar2 = cbx.a;
            qim0 qim0VarZ2 = uyn1.z(cbx.b(x340Var).e.c, 0.0f, 2, qim0VarA2);
            if (z5) {
                x340Var.i0(841474445);
                objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = nhe1.c1;
                    x340Var.s0(objT2);
                }
                qim0VarB = s161.b(qim0Var2, true, (iu30) objT2);
                x340Var.r(false);
            } else {
                x340Var.i0(841475792);
                x340Var.r(false);
                qim0VarB = qim0Var2;
            }
            qim0 qim0VarThen2 = qim0VarZ2.then(qim0VarB);
            mbh mbhVarA2 = jbh.a(h36.e, een.Q0, x340Var, 54);
            int i6 = i3;
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarThen2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar5);
            nko1.H(xos0VarM3, x340Var, lljVar6);
            x0d.q(iHashCode3, x340Var, lljVar7, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar8);
            vnr0 vnr0Var2 = (vnr0) vu30Var.invoke(x340Var, Integer.valueOf(i6 & 14));
            qim0 qim0VarB3 = u291.B(qim0Var2, (gra) null, 3);
            objT = x340Var.T();
            if (objT == m4cVar) {
                objT = nhe1.d1;
                x340Var.s0(objT);
            }
            qgo1.f(vnr0Var2, s161.b(qim0VarB3, false, (iu30) objT).then(qim0Var), (a0e1) null, 0, false, (iu30) null, x340Var, 8, 60);
            op71.g(x340Var, u291.h(qim0Var2, cbx.b(x340Var).b.b));
            j2iVar2 = j2iVar;
            j2iVar2.invoke(pbh.a, x340Var, 54);
            x340Var.r(true);
            x340Var.r(true);
            z4 = z5;
        } else {
            j2iVar2 = j2iVar;
            x340Var.b0();
            z4 = z2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uo80(vu30Var, qim0Var, z4, j2iVar2, i, i2);
        }
    }

    public static final void j(float f, float f2, tfx0 tfx0Var, j2i j2iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        boolean z;
        j2i j2iVar2 = caj.a;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1397479354);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.d(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.d(f2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(tfx0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(j2iVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(j2iVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.g(qim0Var) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2;
            tob1 tob1VarA = z95.a(((Boolean) tfx0Var.f.getValue()).booleanValue() ? 4.0f : 2.0f, (fe5) null, (String) null, x340Var, 0, 14);
            boolean z2 = (i3 & 112) == 32;
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = new j37((byte) 7, f2);
                x340Var.s0(objT);
            }
            gfh0 gfh0Var = (gfh0) objT;
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0Var, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            nfx0 nfx0Var = nfx0.a;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = u291.B(t3k1.x(nim0Var, nfx0Var), (gra) null, 3);
            int i4 = i3 & 896;
            boolean z4 = i4 == 256;
            Object objT2 = x340Var.T();
            if (z4 || objT2 == m4cVar) {
                z = false;
                objT2 = new hal1(tfx0Var, (byte) 0);
                x340Var.s0(objT2);
            } else {
                z = false;
            }
            qim0 qim0VarU = lrn1.u(qim0VarB, (iu30) objT2);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, z);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarU);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            j2iVar.invoke(u291.B(nim0Var, (gra) null, 3), x340Var, Integer.valueOf(((i3 >> 9) & 112) | 6));
            x340Var.r(true);
            qim0 qim0VarH = u291.h(u291.f(t3k1.x(nim0Var, nfx0.b), 1.0f), ((p3v) tob1VarA.getValue()).a);
            boolean z5 = i4 == 256;
            Object objT3 = x340Var.T();
            if (z5 || objT3 == m4cVar) {
                objT3 = new hal1(tfx0Var, (byte) 1);
                x340Var.s0(objT3);
            }
            qim0 qim0VarU2 = lrn1.u(qim0VarH, (iu30) objT3);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarU2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            j2iVar2.J(Float.valueOf(f), u291.d(nim0Var, 1.0f), x340Var, Integer.valueOf((i3 & 14) | 48 | ((i3 >> 3) & 896)));
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vv50(f, f2, tfx0Var, j2iVar, qim0Var, i);
        }
    }

    public static final s340 k(s340 s340Var) {
        if (s340Var == null) {
            s340Var = null;
        }
        if (s340Var != null) {
            return s340Var;
        }
        g0k.b("Inconsistent composition");
        jah.d();
        return null;
    }

    public static final bpb1 l(MobiusLoop mobiusLoop) {
        Object obj = mobiusLoop.i;
        obj.getClass();
        bpb1 bpb1VarB = gio1.b(obj);
        mobiusLoop.b(new qjk(bpb1VarB, (byte) 2));
        return bpb1VarB;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062 A[LOOP:0: B:21:0x0053->B:25:0x0062, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object m(p.i8d1 r6, p.faa r7) {
        /*
            boolean r0 = r7 instanceof p.ph31
            if (r0 == 0) goto L13
            r0 = r7
            p.ph31 r0 = (p.ph31) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.ph31 r0 = new p.ph31
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            p.i8d1 r6 = r0.a
            p.hm5.M(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            r6 = 0
            return r6
        L2e:
            p.hm5.M(r7)
        L31:
            r0.a = r6
            r0.c = r2
            p.cav0 r7 = p.cav0.b
            java.lang.Object r7 = r6.a(r7, r0)
            p.d9n r1 = p.d9n.a
            if (r7 != r1) goto L40
            return r1
        L40:
            p.bav0 r7 = (p.bav0) r7
            int r1 = r7.d
            java.util.List r7 = r7.a
            r1 = r1 & 66
            if (r1 == 0) goto L31
            r1 = r7
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r3 = 0
            r4 = r3
        L53:
            if (r4 >= r1) goto L65
            java.lang.Object r5 = r7.get(r4)
            p.hav0 r5 = (p.hav0) r5
            boolean r5 = p.p8p1.h(r5)
            if (r5 != 0) goto L62
            goto L31
        L62:
            int r4 = r4 + 1
            goto L53
        L65:
            java.lang.Object r6 = r7.get(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.aym.m(p.i8d1, p.faa):java.lang.Object");
    }

    public static final qim0 n(qim0 qim0Var, j5c j5cVar) {
        return qim0Var.then(new h5c(j5cVar));
    }

    public static lnm p(lnm lnmVar, lnm lnmVar2, vu30 vu30Var) {
        if (vu30Var instanceof faa) {
            return ((faa) vu30Var).create(lnmVar, lnmVar2);
        }
        o6x context = lnmVar2.getContext();
        return context == o6x.a ? new x890(lnmVar2, lnmVar, vu30Var) : new y890(lnmVar2, context, vu30Var, lnmVar);
    }

    public static final u7h r(xkk1 xkk1Var) {
        mq70 mq70Var;
        pp70 pp70Var;
        if (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (pp70Var = mq70Var.b) == null) {
            return null;
        }
        return new u7h(pp70Var.c.a.b.a());
    }

    public static final Float s(List list) {
        int i;
        gq70 gq70Var = (gq70) o7h.s0(list);
        if (gq70Var == null || (i = gq70Var.b) <= 0) {
            return null;
        }
        return Float.valueOf(gq70Var.a / i);
    }

    public static lnm t(lnm lnmVar) {
        lnm lnmVarIntercepted;
        onm onmVar = lnmVar instanceof onm ? (onm) lnmVar : null;
        return (onmVar == null || (lnmVarIntercepted = onmVar.intercepted()) == null) ? lnmVar : lnmVarIntercepted;
    }

    public static boolean u(int i) {
        if (i == 8 || i == 7) {
            return true;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 31 || !(i == 26 || i == 27)) {
            return i2 >= 33 && i == 30;
        }
        return true;
    }

    public static final void v(kt91 kt91Var, Function0 function0) {
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131953070});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        er91 er91Var = new er91((fs91) null, "", 2131953070, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, new dvr(function0, (byte) 3), false);
        if (kt91Var.g()) {
            kt91Var.k(er91Var);
        }
    }

    public void o(rch rchVar, Set set) {
        synchronized (rchVar) {
            try {
                if (qy2.y(rchVar) == null) {
                    qy2.z(rchVar, set);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int q(rch rchVar) {
        int iA;
        synchronized (rchVar) {
            iA = qy2.A(rchVar);
        }
        return iA;
    }
}
