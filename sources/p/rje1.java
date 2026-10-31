package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class rje1 {
    public static final cjc0 a = new cjc0(3);
    public static final long b;
    public static final long c;

    static {
        long j = u7h.f;
        b = u7h.b(j, 0.1f, 0.0f, 0.0f, 0.0f, 14);
        c = u7h.b(j, 0.5f, 0.0f, 0.0f, 0.0f, 14);
    }

    /* JADX WARN: Code duplicated, block: B:76:0x015d  */
    /* JADX WARN: Code duplicated, block: B:78:0x016d  */
    /* JADX WARN: Code duplicated, block: B:82:0x017d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0187  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:91:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e6  */
    public static final void a(lte1 lte1Var, long j, Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        tob1 tob1Var;
        Object bfb1Var;
        m4c m4cVar;
        dlv dlvVar;
        kte1 kte1Var;
        m4c m4cVar2;
        Function0 function1;
        Object objT;
        boolean z;
        Object objT2;
        jax haxVar;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1980798649);
        int i2 = i | (b0kVar3.g(lte1Var) ? 4 : 2) | (b0kVar3.f(j) ? 32 : 16) | (b0kVar3.i(function0) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT3 = b0kVar3.T();
            m4c m4cVar3 = fkj0.X;
            if (objT3 == m4cVar3) {
                objT3 = v8r.q((Object) null);
                b0kVar3.s0(objT3);
            }
            tob1 tob1Var2 = (ven0) objT3;
            Object objT4 = b0kVar3.T();
            if (objT4 == m4cVar3) {
                objT4 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT4);
            }
            ven0 ven0Var = (ven0) objT4;
            boolean z2 = lte1Var.e;
            String str = lte1Var.a;
            Boolean boolValueOf = Boolean.valueOf(z2);
            int i3 = i2 & 14;
            boolean zI = b0kVar3.i(tob1Var2) | (i3 == 4) | b0kVar3.i(ven0Var);
            Object objT5 = b0kVar3.T();
            if (zI || objT5 == m4cVar3) {
                tob1Var = tob1Var2;
                m4cVar = m4cVar3;
                dlvVar = null;
                bfb1Var = new bfb1(lte1Var, tob1Var, ven0Var, dlvVar, (byte) 13);
                b0kVar3.s0(bfb1Var);
            } else {
                m4cVar = m4cVar3;
                tob1Var = tob1Var2;
                bfb1Var = objT5;
                dlvVar = null;
            }
            qxd0.t(boolValueOf, b0kVar3, (vu30) bfb1Var);
            uqe1 uqe1Var = lte1Var.b;
            if (z2 == 0 || (kte1Var = lte1Var.d) == null) {
                kte1Var = new kte1(str, uqe1Var);
            }
            kte1 kte1Var2 = kte1Var;
            boolean z3 = lte1Var.f || !(!z2 || kte1Var2.b == null || ((Boolean) ven0Var.getValue()).booleanValue() || u890.j((Boolean) tob1Var.getValue(), Boolean.FALSE));
            gdx gdxVarS = yla.s(b0kVar3);
            vzq0 vzq0Var = gdxVarS.a;
            boolean z4 = z3;
            tob1 tob1Var3 = tob1Var;
            b0kVar2 = b0kVar3;
            tob1 tob1VarA = z95.a(z3 ? 8.0f : vzq0Var.b(flb0.a), irn1.o0(200, 0, dlvVar, 6), "ticket timeline reminder button padding", b0kVar2, 384, 8);
            String str2 = kte1Var2.a;
            boolean zI2 = b0kVar2.i(tob1Var3) | (i3 == 4) | ((i2 & 896) == 256);
            Object objT6 = b0kVar2.T();
            if (zI2) {
                m4cVar2 = m4cVar;
            } else {
                m4cVar2 = m4cVar;
                if (objT6 == m4cVar2) {
                }
                function1 = (Function0) objT6;
                if (!ihc1.y0(str2)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                gbx gbxVar = new gbx(new y50(str2), function1);
                objT = b0kVar2.T();
                if (objT == m4cVar2) {
                    objT = ppd1.T0;
                    b0kVar2.s0(objT);
                }
                vu30 vu30Var = (vu30) objT;
                z = (i2 & 112) == 32;
                objT2 = b0kVar2.T();
                if (z || objT2 == m4cVar2) {
                    objT2 = new q9j0((byte) 27, j);
                    b0kVar2.s0(objT2);
                }
                hdx hdxVar = new hdx(0, vu30Var, (vu30) objT2, (vu30) null, (hw61) null, 25);
                float f = ((p3v) tob1VarA.getValue()).a;
                float fD = vzq0Var.d();
                zzq0 zzq0Var = new zzq0(f, fD, f, fD);
                if (lte1Var.g) {
                    haxVar = jax.a;
                } else {
                    haxVar = new hax(str);
                }
                foo1.c(gbxVar, hdxVar, (qim0) null, haxVar, gdxVarS, zzq0Var, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-1348688186, new kf2(gdxVarS, z4, kte1Var2), b0kVar2), b0kVar2, 0, 48, 1932);
            }
            objT6 = new o8e1(lte1Var, function0, tob1Var3, (byte) 2);
            b0kVar2.s0(objT6);
            function1 = (Function0) objT6;
            if (!ihc1.y0(str2)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar2 = new gbx(new y50(str2), function1);
            objT = b0kVar2.T();
            if (objT == m4cVar2) {
                objT = ppd1.T0;
                b0kVar2.s0(objT);
            }
            vu30 vu30Var2 = (vu30) objT;
            if ((i2 & 112) == 32) {
            }
            objT2 = b0kVar2.T();
            if (z) {
                objT2 = new q9j0((byte) 27, j);
                b0kVar2.s0(objT2);
            } else {
                objT2 = new q9j0((byte) 27, j);
                b0kVar2.s0(objT2);
            }
            hdx hdxVar2 = new hdx(0, vu30Var2, (vu30) objT2, (vu30) null, (hw61) null, 25);
            float f2 = ((p3v) tob1VarA.getValue()).a;
            float fD2 = vzq0Var.d();
            zzq0 zzq0Var2 = new zzq0(f2, fD2, f2, fD2);
            if (lte1Var.g) {
                haxVar = jax.a;
            } else {
                haxVar = new hax(str);
            }
            foo1.c(gbxVar2, hdxVar2, (qim0) null, haxVar, gdxVarS, zzq0Var2, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-1348688186, new kf2(gdxVarS, z4, kte1Var2), b0kVar2), b0kVar2, 0, 48, 1932);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qi6(lte1Var, j, function0, i, (byte) 17);
        }
    }

    public static final void b(nte1 nte1Var, vue1 vue1Var, float f, long j, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        int i3;
        float f2;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(200030477);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var2.g(nte1Var) : x340Var2.i(nte1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.g(vue1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.f(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var2.i(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var2.i(qim0Var) ? 131072 : 65536;
        }
        if (x340Var2.Y(i2 & 1, (74899 & i2) != 74898)) {
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            d36 d36Var = new d36(8.0f, true, new um5(false));
            qim0 qim0VarJ = u291.j(40.0f, 0.0f, 2, d1u.E(f, j, dug.f(i1p1.q(u291.f(qim0Var, 1.0f), vue1Var), cbx.a(x340Var2).a.c, d4o1.a), vue1Var));
            cvx cvxVar2 = cbx.b(x340Var2).b;
            if (nte1Var.c == null) {
                x340Var2.i0(-1044216044);
                cvx cvxVar3 = cbx.b(x340Var2).b;
                i3 = 0;
                x340Var2.r(false);
                f2 = 12.0f;
            } else {
                i3 = 0;
                x340Var2.i0(-1044215569);
                x340Var2.r(false);
                f2 = 0.0f;
            }
            qim0 qim0VarY = uyn1.y(qim0VarJ, 16.0f, f2);
            jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var2, i3);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarY);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            w0h1.a(nte1Var.a, isl.a, u291.r(nim0.a, 16.0f), cbx.a(x340Var2).b.b, 0L, false, x340Var2, 56, 48);
            uwo1.e(nte1Var.b, new wnb0(1.0f, true), cbx.d(x340Var2).m, cbx.a(x340Var2).b.b, (a0e1) null, (iu30) null, 2, false, a, 0, (qx8) null, x340Var2, 0, 0, 1712);
            mte1 mte1Var = nte1Var.c;
            if (mte1Var == null) {
                x340Var2.i0(1271045361);
                x340Var2.r(false);
                x340Var = x340Var2;
            } else {
                x340Var2.i0(1271045362);
                String str = mte1Var.a;
                if (ihc1.y0(str)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                } else {
                    foo1.c(new gbx(new y50(str), function0), ldx.c, (qim0) null, (max) null, yla.s(x340Var2), new zzq0(0.0f, 0.0f, 0.0f, 0.0f), (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(903949025, new gsc1(mte1Var, (byte) 15), x340Var2), x340Var2, 0, 48, 1948);
                    x340Var = x340Var2;
                    x340Var.r(false);
                }
            }
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wu9(nte1Var, vue1Var, f, j, function0, qim0Var, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void c(qte1 qte1Var, long j, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-486142589);
        int i2 = i | (x340Var.g(qte1Var) ? 4 : 2) | (x340Var.f(j) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            cr31 cr31VarB = er31.b(8.0f);
            boolean z = qte1Var instanceof pte1;
            nim0 nim0Var = nim0.a;
            isl islVar = isl.a;
            if (z) {
                x340Var.i0(-43919338);
                gra graVar = een.h;
                qim0 qim0VarF = dug.f(i1p1.q(u291.r(nim0Var, 40.0f), cr31VarB), j, d4o1.a);
                gfh0 gfh0VarC = t1c.c(graVar, false);
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
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                w0h1.a(((pte1) qte1Var).a, islVar, u291.r(nim0Var, 16.0f), u7h.b, 0L, false, x340Var, 56, 48);
                x340Var.r(true);
                x340Var.r(false);
            } else {
                if (!(qte1Var instanceof ote1)) {
                    throw p3d1.k(x340Var, 968412661, false);
                }
                x340Var.i0(-43502047);
                Uri uri = Uri.parse(((ote1) qte1Var).a);
                bnx bnxVar = bnx.c;
                nux nuxVar = new nux(bnxVar, bnxVar);
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(x340Var).g;
                eso1.e(uri, islVar, i1p1.q(u291.r(nim0Var, 40.0f), cr31VarB), new p3v(32.0f), (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, nuxVar, false, false, x340Var, 1073741872, 0, 3568);
                x340Var = x340Var;
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk7(qte1Var, j, i, (byte) 11);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void d(tue1 tue1Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(186751638);
        int i2 = (x340Var.g(tue1Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            cr31 cr31VarB = er31.b(8.0f);
            gra graVar = een.h;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarQ = i1p1.q(u291.r(nim0Var, 40.0f), cr31VarB);
            uwr uwrVar = cbx.a;
            qim0 qim0VarE = d1u.E(1.0f, b, dug.f(qim0VarQ, cbx.a(x340Var).a.c, d4o1.a), cr31VarB);
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarE);
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
            nko1.H(qim0VarE2, x340Var, y580.Y);
            boolean z2 = tue1Var instanceof sue1;
            isl islVar = isl.a;
            if (z2) {
                x340Var.i0(1781784048);
                w0h1.a(((sue1) tue1Var).a, islVar, u291.r(nim0Var, 16.0f), cbx.a(x340Var).b.a, 0L, false, x340Var, 56, 48);
                x340Var.r(false);
                z = true;
            } else {
                if (!(tue1Var instanceof rue1)) {
                    throw p3d1.k(x340Var, 1442948373, false);
                }
                x340Var.i0(1782061808);
                Uri uri = Uri.parse(((rue1) tue1Var).a);
                bnx bnxVar = bnx.c;
                nux nuxVar = new nux(bnxVar, bnxVar);
                zov0 zov0Var = cbx.b(x340Var).g;
                eso1.e(uri, islVar, i1p1.q(u291.r(nim0Var, 16.0f), er31.a), new p3v(12.0f), (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, nuxVar, false, false, x340Var, 1073741872, 0, 3568);
                x340Var.r(false);
                z = true;
            }
            x340Var.r(z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gsc1(tue1Var, i, (byte) 16);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:103:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:104:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:109:0x0207  */
    /* JADX WARN: Code duplicated, block: B:111:0x0212  */
    /* JADX WARN: Code duplicated, block: B:113:0x0215  */
    /* JADX WARN: Code duplicated, block: B:115:0x021d  */
    /* JADX WARN: Code duplicated, block: B:117:0x022b  */
    /* JADX WARN: Code duplicated, block: B:129:0x0244  */
    /* JADX WARN: Code duplicated, block: B:132:0x0262 A[LOOP:1: B:130:0x025b->B:132:0x0262, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:135:0x0287  */
    /* JADX WARN: Code duplicated, block: B:139:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:145:0x0305  */
    /* JADX WARN: Code duplicated, block: B:147:0x0310  */
    /* JADX WARN: Code duplicated, block: B:149:0x0325  */
    /* JADX WARN: Code duplicated, block: B:151:0x032a  */
    /* JADX WARN: Code duplicated, block: B:154:0x0336  */
    /* JADX WARN: Code duplicated, block: B:161:0x0240 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x0240 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x02d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x02b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:68:0x011b  */
    /* JADX WARN: Code duplicated, block: B:69:0x012c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0136  */
    /* JADX WARN: Code duplicated, block: B:73:0x0142  */
    /* JADX WARN: Code duplicated, block: B:74:0x0144  */
    /* JADX WARN: Code duplicated, block: B:77:0x014b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x014d  */
    /* JADX WARN: Code duplicated, block: B:81:0x015d  */
    /* JADX WARN: Code duplicated, block: B:82:0x015f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0166 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x0168  */
    /* JADX WARN: Code duplicated, block: B:88:0x0197  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:91:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:95:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:98:0x01bb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x01bd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [int] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.List] */
    public static final void e(gje1 gje1Var, iu30 iu30Var, yqg yqgVar, qim0 qim0Var, hje1 hje1Var, boolean z, b0k b0kVar, int i, int i2) throws NoWhenBranchMatchedException {
        hje1 hje1Var2;
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        qim0 qim0Var2;
        boolean z4;
        h311 h311VarV;
        qim0 qim0Var3;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        rte1 rte1Var;
        boolean z5;
        int i6;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        Object objT;
        String str;
        int i7;
        boolean z10;
        Object objT2;
        boolean z11;
        Object objT3;
        ?? r4;
        ArrayList<List> arrayList;
        ?? r11;
        String str2;
        int i8;
        int size;
        int iC;
        Integer numValueOf;
        int iIntValue;
        ArrayList arrayList2;
        lr80 it;
        yqg yqgVar2 = yqgVar;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1604997290);
        int i9 = (i & 6) == 0 ? ((i & 8) == 0 ? x340Var.g(gje1Var) : x340Var.i(gje1Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i9 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i9 |= x340Var.g(yqgVar2) ? 256 : 128;
        }
        int i10 = i9 | 3072;
        int i11 = i2 & 16;
        if (i11 == 0) {
            if ((i & 24576) == 0) {
                hje1Var2 = hje1Var;
                i10 |= x340Var.i(hje1Var2) ? 16384 : 8192;
            }
            i3 = i2 & 32;
            if (i3 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    if (x340Var.h(z2)) {
                        i4 = 131072;
                    } else {
                        i4 = 65536;
                    }
                    i10 |= i4;
                }
                i5 = i10;
                if ((74899 & i5) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var.Y(i5 & 1, z3)) {
                    if (i11 != 0) {
                        hje1Var2 = null;
                    }
                    if (i3 != 0) {
                        z2 = false;
                    }
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var).b;
                    d36 d36Var = new d36(8.0f, true, new um5(false));
                    qim0Var3 = nim0.a;
                    qim0 qim0VarB = uyn1.B(u291.f(qim0Var3, 1.0f), 0.0f, 0.0f, 16.0f, 0.0f, 11);
                    mbhVarA = jbh.a(d36Var, een.P0, x340Var, 0);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0VarB);
                    hzj.A.getClass();
                    if (x340Var.a != null) {
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
                    rte1Var = gje1Var.a;
                    if (rte1Var == null) {
                        x340Var.i0(-1118176746);
                        x340Var.r(false);
                        hje1Var2 = hje1Var2;
                        z5 = z2;
                        i6 = 10;
                        z6 = false;
                    } else {
                        x340Var.i0(-1118176745);
                        if (rte1Var.f39p == null) {
                            x340Var.i0(202930557);
                            i7 = i5 & 112;
                            if (i7 == 32) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            objT2 = x340Var.T();
                            if (z10 || objT2 == obj) {
                                objT2 = new pwc1(iu30Var, (byte) 12);
                                x340Var.s0(objT2);
                            }
                            Function0 function0 = (Function0) objT2;
                            if (i7 == 32) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objT3 = x340Var.T();
                            if (z11 || objT3 == obj) {
                                objT3 = new pwc1(iu30Var, (byte) 13);
                                x340Var.s0(objT3);
                            }
                            boolean z12 = z2;
                            z6 = false;
                            i6 = 10;
                            h(rte1Var, function0, yqgVar, null, z12, (Function0) objT3, x340Var, ((i5 >> 3) & 57344) | (i5 & 896), 8);
                            rte1Var = rte1Var;
                            yqgVar2 = yqgVar;
                            z5 = z12;
                            x340Var.r(false);
                        } else {
                            z5 = z2;
                            i6 = 10;
                            z6 = false;
                            x340Var.i0(203288390);
                            if ((i5 & 896) == 256) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if ((i5 & 112) == 32) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            z9 = z8 | z7;
                            objT = x340Var.T();
                            if (z9 || objT == obj) {
                                objT = new fte1(yqgVar2, hje1Var2, new b1c1(iu30Var, (byte) 10));
                                x340Var.s0(objT);
                            }
                            otw.c((fte1) objT, rte1Var, (qim0) null, (ipb1) null, x340Var, 0, 12);
                            x340Var.r(false);
                        }
                        str = rte1Var.j;
                        if (str == null) {
                            x340Var.i0(203888766);
                            x340Var.r(z6);
                        } else {
                            x340Var.i0(203888767);
                            g(str, iu30Var, null, x340Var, i5 & 112);
                            x340Var.r(z6);
                        }
                        x340Var.r(z6);
                    }
                    r4 = gje1Var.b;
                    arrayList = new ArrayList();
                    r11 = z6;
                    while (r11 < r4.size()) {
                        if (((uue1) r4.get(r11)).m != 2) {
                            i8 = r11 + 1;
                            size = r4.size();
                            while (true) {
                                if (i8 >= size) {
                                    iC = l1d.C(((uue1) r4.get(i8)).m);
                                    if (iC == 0 && iC != 1) {
                                        if (iC == 2) {
                                            i8++;
                                        } else {
                                            if (iC != 3) {
                                                eg.o();
                                                return;
                                            }
                                            numValueOf = Integer.valueOf(i8);
                                        }
                                    }
                                    if (numValueOf != null) {
                                        tr80 tr80Var = new tr80((int) r11, numValueOf.intValue(), 1);
                                        arrayList2 = new ArrayList(q7h.U(tr80Var, i6));
                                        it = tr80Var.iterator();
                                        while (((sr80) it).c) {
                                            int iNextInt = it.nextInt();
                                            arrayList2.add(new aa80(iNextInt, r4.get(iNextInt)));
                                        }
                                        arrayList.add(arrayList2);
                                        iIntValue = numValueOf.intValue() + 1;
                                    } else {
                                        arrayList.add(Collections.singletonList(new aa80((int) r11, r4.get(r11))));
                                        iIntValue = r11 + 1;
                                    }
                                    i6 = 10;
                                    r11 = iIntValue;
                                }
                            }
                        }
                        numValueOf = null;
                        if (numValueOf != null) {
                            tr80 tr80Var2 = new tr80((int) r11, numValueOf.intValue(), 1);
                            arrayList2 = new ArrayList(q7h.U(tr80Var2, i6));
                            it = tr80Var2.iterator();
                            while (((sr80) it).c) {
                                int iNextInt2 = it.nextInt();
                                arrayList2.add(new aa80(iNextInt2, r4.get(iNextInt2)));
                            }
                            arrayList.add(arrayList2);
                            iIntValue = numValueOf.intValue() + 1;
                        } else {
                            arrayList.add(Collections.singletonList(new aa80((int) r11, r4.get(r11))));
                            iIntValue = r11 + 1;
                        }
                        i6 = 10;
                        r11 = iIntValue;
                    }
                    x340Var.i0(656704144);
                    for (List list : arrayList) {
                        if (list.size() > 1) {
                            x340Var.i0(148002949);
                            j(384, list, apo.r(1816727043, new jao(yqgVar2, iu30Var), x340Var), x340Var, null);
                            x340Var.r(z6);
                        } else {
                            x340Var.i0(148160646);
                            aa80 aa80Var = (aa80) o7h.V0(list);
                            x340Var.f0(420422852, Integer.valueOf(aa80Var.a));
                            i(aa80Var, yqgVar2, iu30Var, x340Var, ((i5 >> 3) & 112) | ((i5 << 3) & 896));
                            x340Var.r(z6);
                            x340Var.r(z6);
                        }
                    }
                    x340Var.r(z6);
                    str2 = gje1Var.c;
                    if (str2 == null) {
                        x340Var.i0(-1116659916);
                    } else {
                        x340Var.i0(-1116659915);
                        g(str2, iu30Var, null, x340Var, i5 & 112);
                    }
                    x340Var.r(z6);
                    x340Var.r(true);
                    hje1Var2 = hje1Var2;
                    qim0Var2 = qim0Var3;
                    z4 = z5;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                    z4 = z2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new yc5(gje1Var, iu30Var, yqgVar2, qim0Var2, hje1Var2, z4, i, i2, (byte) 14);
                }
            }
            i10 |= 196608;
            z2 = z;
            i5 = i10;
            if ((74899 & i5) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i5 & 1, z3)) {
                if (i11 != 0) {
                    hje1Var2 = null;
                }
                if (i3 != 0) {
                    z2 = false;
                }
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var).b;
                d36 d36Var2 = new d36(8.0f, true, new um5(false));
                qim0Var3 = nim0.a;
                qim0 qim0VarB2 = uyn1.B(u291.f(qim0Var3, 1.0f), 0.0f, 0.0f, 16.0f, 0.0f, 11);
                mbhVarA = jbh.a(d36Var2, een.P0, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarB2);
                hzj.A.getClass();
                if (x340Var.a != null) {
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
                rte1Var = gje1Var.a;
                if (rte1Var == null) {
                    x340Var.i0(-1118176746);
                    x340Var.r(false);
                    hje1Var2 = hje1Var2;
                    z5 = z2;
                    i6 = 10;
                    z6 = false;
                } else {
                    x340Var.i0(-1118176745);
                    if (rte1Var.f39p == null) {
                        x340Var.i0(202930557);
                        i7 = i5 & 112;
                        if (i7 == 32) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objT2 = x340Var.T();
                        if (z10) {
                            objT2 = new pwc1(iu30Var, (byte) 12);
                            x340Var.s0(objT2);
                        } else {
                            objT2 = new pwc1(iu30Var, (byte) 12);
                            x340Var.s0(objT2);
                        }
                        Function0 function1 = (Function0) objT2;
                        if (i7 == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objT3 = x340Var.T();
                        if (z11) {
                            objT3 = new pwc1(iu30Var, (byte) 13);
                            x340Var.s0(objT3);
                        } else {
                            objT3 = new pwc1(iu30Var, (byte) 13);
                            x340Var.s0(objT3);
                        }
                        boolean z13 = z2;
                        z6 = false;
                        i6 = 10;
                        h(rte1Var, function1, yqgVar, null, z13, (Function0) objT3, x340Var, ((i5 >> 3) & 57344) | (i5 & 896), 8);
                        rte1Var = rte1Var;
                        yqgVar2 = yqgVar;
                        z5 = z13;
                        x340Var.r(false);
                    } else {
                        z5 = z2;
                        i6 = 10;
                        z6 = false;
                        x340Var.i0(203288390);
                        if ((i5 & 896) == 256) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if ((i5 & 112) == 32) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        z9 = z8 | z7;
                        objT = x340Var.T();
                        if (z9) {
                            objT = new fte1(yqgVar2, hje1Var2, new b1c1(iu30Var, (byte) 10));
                            x340Var.s0(objT);
                        } else {
                            objT = new fte1(yqgVar2, hje1Var2, new b1c1(iu30Var, (byte) 10));
                            x340Var.s0(objT);
                        }
                        otw.c((fte1) objT, rte1Var, (qim0) null, (ipb1) null, x340Var, 0, 12);
                        x340Var.r(false);
                    }
                    str = rte1Var.j;
                    if (str == null) {
                        x340Var.i0(203888766);
                        x340Var.r(z6);
                    } else {
                        x340Var.i0(203888767);
                        g(str, iu30Var, null, x340Var, i5 & 112);
                        x340Var.r(z6);
                    }
                    x340Var.r(z6);
                }
                r4 = gje1Var.b;
                arrayList = new ArrayList();
                r11 = z6;
                while (r11 < r4.size()) {
                    if (((uue1) r4.get(r11)).m != 2) {
                        i8 = r11 + 1;
                        size = r4.size();
                        while (true) {
                            if (i8 >= size) {
                                iC = l1d.C(((uue1) r4.get(i8)).m);
                                if (iC == 0) {
                                }
                            }
                            i8++;
                        }
                    }
                    numValueOf = null;
                    if (numValueOf != null) {
                        tr80 tr80Var3 = new tr80((int) r11, numValueOf.intValue(), 1);
                        arrayList2 = new ArrayList(q7h.U(tr80Var3, i6));
                        it = tr80Var3.iterator();
                        while (((sr80) it).c) {
                            int iNextInt3 = it.nextInt();
                            arrayList2.add(new aa80(iNextInt3, r4.get(iNextInt3)));
                        }
                        arrayList.add(arrayList2);
                        iIntValue = numValueOf.intValue() + 1;
                    } else {
                        arrayList.add(Collections.singletonList(new aa80((int) r11, r4.get(r11))));
                        iIntValue = r11 + 1;
                    }
                    i6 = 10;
                    r11 = iIntValue;
                }
                x340Var.i0(656704144);
                while (r0.hasNext()) {
                    if (list.size() > 1) {
                        x340Var.i0(148002949);
                        j(384, list, apo.r(1816727043, new jao(yqgVar2, iu30Var), x340Var), x340Var, null);
                        x340Var.r(z6);
                    } else {
                        x340Var.i0(148160646);
                        aa80 aa80Var2 = (aa80) o7h.V0(list);
                        x340Var.f0(420422852, Integer.valueOf(aa80Var2.a));
                        i(aa80Var2, yqgVar2, iu30Var, x340Var, ((i5 >> 3) & 112) | ((i5 << 3) & 896));
                        x340Var.r(z6);
                        x340Var.r(z6);
                    }
                }
                x340Var.r(z6);
                str2 = gje1Var.c;
                if (str2 == null) {
                    x340Var.i0(-1116659916);
                } else {
                    x340Var.i0(-1116659915);
                    g(str2, iu30Var, null, x340Var, i5 & 112);
                }
                x340Var.r(z6);
                x340Var.r(true);
                hje1Var2 = hje1Var2;
                qim0Var2 = qim0Var3;
                z4 = z5;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
                z4 = z2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new yc5(gje1Var, iu30Var, yqgVar2, qim0Var2, hje1Var2, z4, i, i2, (byte) 14);
            }
        }
        i10 = i9 | 27648;
        hje1Var2 = hje1Var;
        i3 = i2 & 32;
        if (i3 != 0) {
            if ((196608 & i) == 0) {
                z2 = z;
                if (x340Var.h(z2)) {
                    i4 = 131072;
                } else {
                    i4 = 65536;
                }
                i10 |= i4;
            }
            i5 = i10;
            if ((74899 & i5) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i5 & 1, z3)) {
                if (i11 != 0) {
                    hje1Var2 = null;
                }
                if (i3 != 0) {
                    z2 = false;
                }
                uwr uwrVar3 = cbx.a;
                cvx cvxVar3 = cbx.b(x340Var).b;
                d36 d36Var3 = new d36(8.0f, true, new um5(false));
                qim0Var3 = nim0.a;
                qim0 qim0VarB3 = uyn1.B(u291.f(qim0Var3, 1.0f), 0.0f, 0.0f, 16.0f, 0.0f, 11);
                mbhVarA = jbh.a(d36Var3, een.P0, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarB3);
                hzj.A.getClass();
                if (x340Var.a != null) {
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
                rte1Var = gje1Var.a;
                if (rte1Var == null) {
                    x340Var.i0(-1118176746);
                    x340Var.r(false);
                    hje1Var2 = hje1Var2;
                    z5 = z2;
                    i6 = 10;
                    z6 = false;
                } else {
                    x340Var.i0(-1118176745);
                    if (rte1Var.f39p == null) {
                        x340Var.i0(202930557);
                        i7 = i5 & 112;
                        if (i7 == 32) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objT2 = x340Var.T();
                        if (z10) {
                            objT2 = new pwc1(iu30Var, (byte) 12);
                            x340Var.s0(objT2);
                        } else {
                            objT2 = new pwc1(iu30Var, (byte) 12);
                            x340Var.s0(objT2);
                        }
                        Function0 function2 = (Function0) objT2;
                        if (i7 == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objT3 = x340Var.T();
                        if (z11) {
                            objT3 = new pwc1(iu30Var, (byte) 13);
                            x340Var.s0(objT3);
                        } else {
                            objT3 = new pwc1(iu30Var, (byte) 13);
                            x340Var.s0(objT3);
                        }
                        boolean z14 = z2;
                        z6 = false;
                        i6 = 10;
                        h(rte1Var, function2, yqgVar, null, z14, (Function0) objT3, x340Var, ((i5 >> 3) & 57344) | (i5 & 896), 8);
                        rte1Var = rte1Var;
                        yqgVar2 = yqgVar;
                        z5 = z14;
                        x340Var.r(false);
                    } else {
                        z5 = z2;
                        i6 = 10;
                        z6 = false;
                        x340Var.i0(203288390);
                        if ((i5 & 896) == 256) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if ((i5 & 112) == 32) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        z9 = z8 | z7;
                        objT = x340Var.T();
                        if (z9) {
                            objT = new fte1(yqgVar2, hje1Var2, new b1c1(iu30Var, (byte) 10));
                            x340Var.s0(objT);
                        } else {
                            objT = new fte1(yqgVar2, hje1Var2, new b1c1(iu30Var, (byte) 10));
                            x340Var.s0(objT);
                        }
                        otw.c((fte1) objT, rte1Var, (qim0) null, (ipb1) null, x340Var, 0, 12);
                        x340Var.r(false);
                    }
                    str = rte1Var.j;
                    if (str == null) {
                        x340Var.i0(203888766);
                        x340Var.r(z6);
                    } else {
                        x340Var.i0(203888767);
                        g(str, iu30Var, null, x340Var, i5 & 112);
                        x340Var.r(z6);
                    }
                    x340Var.r(z6);
                }
                r4 = gje1Var.b;
                arrayList = new ArrayList();
                r11 = z6;
                while (r11 < r4.size()) {
                    if (((uue1) r4.get(r11)).m != 2) {
                        i8 = r11 + 1;
                        size = r4.size();
                        while (true) {
                            if (i8 >= size) {
                                iC = l1d.C(((uue1) r4.get(i8)).m);
                                if (iC == 0) {
                                }
                            }
                            i8++;
                        }
                    }
                    numValueOf = null;
                    if (numValueOf != null) {
                        tr80 tr80Var4 = new tr80((int) r11, numValueOf.intValue(), 1);
                        arrayList2 = new ArrayList(q7h.U(tr80Var4, i6));
                        it = tr80Var4.iterator();
                        while (((sr80) it).c) {
                            int iNextInt4 = it.nextInt();
                            arrayList2.add(new aa80(iNextInt4, r4.get(iNextInt4)));
                        }
                        arrayList.add(arrayList2);
                        iIntValue = numValueOf.intValue() + 1;
                    } else {
                        arrayList.add(Collections.singletonList(new aa80((int) r11, r4.get(r11))));
                        iIntValue = r11 + 1;
                    }
                    i6 = 10;
                    r11 = iIntValue;
                }
                x340Var.i0(656704144);
                while (r0.hasNext()) {
                    if (list.size() > 1) {
                        x340Var.i0(148002949);
                        j(384, list, apo.r(1816727043, new jao(yqgVar2, iu30Var), x340Var), x340Var, null);
                        x340Var.r(z6);
                    } else {
                        x340Var.i0(148160646);
                        aa80 aa80Var3 = (aa80) o7h.V0(list);
                        x340Var.f0(420422852, Integer.valueOf(aa80Var3.a));
                        i(aa80Var3, yqgVar2, iu30Var, x340Var, ((i5 >> 3) & 112) | ((i5 << 3) & 896));
                        x340Var.r(z6);
                        x340Var.r(z6);
                    }
                }
                x340Var.r(z6);
                str2 = gje1Var.c;
                if (str2 == null) {
                    x340Var.i0(-1116659916);
                } else {
                    x340Var.i0(-1116659915);
                    g(str2, iu30Var, null, x340Var, i5 & 112);
                }
                x340Var.r(z6);
                x340Var.r(true);
                hje1Var2 = hje1Var2;
                qim0Var2 = qim0Var3;
                z4 = z5;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
                z4 = z2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new yc5(gje1Var, iu30Var, yqgVar2, qim0Var2, hje1Var2, z4, i, i2, (byte) 14);
            }
        }
        i10 |= 196608;
        z2 = z;
        i5 = i10;
        if ((74899 & i5) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i5 & 1, z3)) {
            if (i11 != 0) {
                hje1Var2 = null;
            }
            if (i3 != 0) {
                z2 = false;
            }
            uwr uwrVar4 = cbx.a;
            cvx cvxVar4 = cbx.b(x340Var).b;
            d36 d36Var4 = new d36(8.0f, true, new um5(false));
            qim0Var3 = nim0.a;
            qim0 qim0VarB4 = uyn1.B(u291.f(qim0Var3, 1.0f), 0.0f, 0.0f, 16.0f, 0.0f, 11);
            mbhVarA = jbh.a(d36Var4, een.P0, x340Var, 0);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarB4);
            hzj.A.getClass();
            if (x340Var.a != null) {
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
            rte1Var = gje1Var.a;
            if (rte1Var == null) {
                x340Var.i0(-1118176746);
                x340Var.r(false);
                hje1Var2 = hje1Var2;
                z5 = z2;
                i6 = 10;
                z6 = false;
            } else {
                x340Var.i0(-1118176745);
                if (rte1Var.f39p == null) {
                    x340Var.i0(202930557);
                    i7 = i5 & 112;
                    if (i7 == 32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objT2 = x340Var.T();
                    if (z10) {
                        objT2 = new pwc1(iu30Var, (byte) 12);
                        x340Var.s0(objT2);
                    } else {
                        objT2 = new pwc1(iu30Var, (byte) 12);
                        x340Var.s0(objT2);
                    }
                    Function0 function3 = (Function0) objT2;
                    if (i7 == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objT3 = x340Var.T();
                    if (z11) {
                        objT3 = new pwc1(iu30Var, (byte) 13);
                        x340Var.s0(objT3);
                    } else {
                        objT3 = new pwc1(iu30Var, (byte) 13);
                        x340Var.s0(objT3);
                    }
                    boolean z15 = z2;
                    z6 = false;
                    i6 = 10;
                    h(rte1Var, function3, yqgVar, null, z15, (Function0) objT3, x340Var, ((i5 >> 3) & 57344) | (i5 & 896), 8);
                    rte1Var = rte1Var;
                    yqgVar2 = yqgVar;
                    z5 = z15;
                    x340Var.r(false);
                } else {
                    z5 = z2;
                    i6 = 10;
                    z6 = false;
                    x340Var.i0(203288390);
                    if ((i5 & 896) == 256) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if ((i5 & 112) == 32) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z9 = z8 | z7;
                    objT = x340Var.T();
                    if (z9) {
                        objT = new fte1(yqgVar2, hje1Var2, new b1c1(iu30Var, (byte) 10));
                        x340Var.s0(objT);
                    } else {
                        objT = new fte1(yqgVar2, hje1Var2, new b1c1(iu30Var, (byte) 10));
                        x340Var.s0(objT);
                    }
                    otw.c((fte1) objT, rte1Var, (qim0) null, (ipb1) null, x340Var, 0, 12);
                    x340Var.r(false);
                }
                str = rte1Var.j;
                if (str == null) {
                    x340Var.i0(203888766);
                    x340Var.r(z6);
                } else {
                    x340Var.i0(203888767);
                    g(str, iu30Var, null, x340Var, i5 & 112);
                    x340Var.r(z6);
                }
                x340Var.r(z6);
            }
            r4 = gje1Var.b;
            arrayList = new ArrayList();
            r11 = z6;
            while (r11 < r4.size()) {
                if (((uue1) r4.get(r11)).m != 2) {
                    i8 = r11 + 1;
                    size = r4.size();
                    while (true) {
                        if (i8 >= size) {
                            iC = l1d.C(((uue1) r4.get(i8)).m);
                            if (iC == 0) {
                            }
                        }
                        i8++;
                    }
                }
                numValueOf = null;
                if (numValueOf != null) {
                    tr80 tr80Var5 = new tr80((int) r11, numValueOf.intValue(), 1);
                    arrayList2 = new ArrayList(q7h.U(tr80Var5, i6));
                    it = tr80Var5.iterator();
                    while (((sr80) it).c) {
                        int iNextInt5 = it.nextInt();
                        arrayList2.add(new aa80(iNextInt5, r4.get(iNextInt5)));
                    }
                    arrayList.add(arrayList2);
                    iIntValue = numValueOf.intValue() + 1;
                } else {
                    arrayList.add(Collections.singletonList(new aa80((int) r11, r4.get(r11))));
                    iIntValue = r11 + 1;
                }
                i6 = 10;
                r11 = iIntValue;
            }
            x340Var.i0(656704144);
            while (r0.hasNext()) {
                if (list.size() > 1) {
                    x340Var.i0(148002949);
                    j(384, list, apo.r(1816727043, new jao(yqgVar2, iu30Var), x340Var), x340Var, null);
                    x340Var.r(z6);
                } else {
                    x340Var.i0(148160646);
                    aa80 aa80Var4 = (aa80) o7h.V0(list);
                    x340Var.f0(420422852, Integer.valueOf(aa80Var4.a));
                    i(aa80Var4, yqgVar2, iu30Var, x340Var, ((i5 >> 3) & 112) | ((i5 << 3) & 896));
                    x340Var.r(z6);
                    x340Var.r(z6);
                }
            }
            x340Var.r(z6);
            str2 = gje1Var.c;
            if (str2 == null) {
                x340Var.i0(-1116659916);
            } else {
                x340Var.i0(-1116659915);
                g(str2, iu30Var, null, x340Var, i5 & 112);
            }
            x340Var.r(z6);
            x340Var.r(true);
            hje1Var2 = hje1Var2;
            qim0Var2 = qim0Var3;
            z4 = z5;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            z4 = z2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yc5(gje1Var, iu30Var, yqgVar2, qim0Var2, hje1Var2, z4, i, i2, (byte) 14);
        }
    }

    public static final void f(uqe1 uqe1Var, float f, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(935484897);
        int i2 = (x340Var.i(uqe1Var) ? 4 : 2) | i | (x340Var.d(f) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            w0h1.a(uqe1Var.a, isl.a, u291.r(nim0.a, f), 0L, 0L, uqe1Var.b, x340Var, 56, 24);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rz2(uqe1Var, f, i, (byte) 12);
        }
    }

    public static final void g(String str, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1084979512);
        if ((i & 6) == 0) {
            i2 = i | (b0kVar3.g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (b0kVar3.Y(i3 & 1, (i3 & 147) != 146)) {
            boolean z = (i3 & 14) == 4;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = gf5.a(str, new b1c1(iu30Var, (byte) 11));
                b0kVar3.s0(objT);
            }
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(b0kVar3).m;
            long j = cbx.a(b0kVar3).b.b;
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            uwo1.d((af5) objT, j, uyn1.B(qim0Var3, 16.0f, 0.0f, 0.0f, 0.0f, 14), lee1Var, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, b0kVar2, 0, 0, 4080);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new rgd(str, iu30Var, qim0Var2, i, (byte) 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0264  */
    /* JADX WARN: Code duplicated, block: B:102:0x0267  */
    /* JADX WARN: Code duplicated, block: B:105:0x027a  */
    /* JADX WARN: Code duplicated, block: B:106:0x027d  */
    /* JADX WARN: Code duplicated, block: B:109:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:110:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:113:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:114:0x0351  */
    /* JADX WARN: Code duplicated, block: B:116:0x0392  */
    /* JADX WARN: Code duplicated, block: B:117:0x0396  */
    /* JADX WARN: Code duplicated, block: B:121:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:123:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:126:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:131:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:134:0x042e  */
    /* JADX WARN: Code duplicated, block: B:136:0x0433  */
    /* JADX WARN: Code duplicated, block: B:139:0x0440  */
    /* JADX WARN: Code duplicated, block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x008e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:51:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:53:0x009e  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00da  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:67:0x0108  */
    /* JADX WARN: Code duplicated, block: B:68:0x011d  */
    /* JADX WARN: Code duplicated, block: B:70:0x012b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0144  */
    /* JADX WARN: Code duplicated, block: B:77:0x017f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0191 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x0193  */
    /* JADX WARN: Code duplicated, block: B:83:0x0195  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:89:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:94:0x0218  */
    /* JADX WARN: Code duplicated, block: B:95:0x0229  */
    /* JADX WARN: Code duplicated, block: B:97:0x0243  */
    /* JADX WARN: Code duplicated, block: B:98:0x0246  */
    public static final void h(rte1 rte1Var, Function0 function0, yqg yqgVar, qim0 qim0Var, boolean z, Function0 function1, b0k b0kVar, int i, int i2) {
        int i3;
        boolean z2;
        boolean z3;
        x340 x340Var;
        qim0 qim0Var2;
        boolean z4;
        h311 h311VarV;
        boolean z5;
        Object objT;
        vue1 vue1Var;
        Object objT2;
        vue1 vue1Var2;
        String strM;
        String strM2;
        u7h u7hVar;
        long j;
        long j2;
        u7h u7hVar2;
        long j3;
        float f;
        float f2;
        long jB;
        wat watVar;
        boolean z6;
        boolean zG;
        Object objT3;
        float f3;
        ven0 ven0Var;
        qim0 qim0Var3;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z7;
        n4k n4kVar;
        nte1 nte1Var;
        llj lljVar;
        llj lljVar2;
        llj lljVar3;
        llj lljVar4;
        long j4;
        float f4;
        float f5;
        long j5;
        float f6;
        int i4;
        boolean z8;
        j2i j2iVarR;
        qim0 qim0VarX;
        boolean z9;
        boolean z10;
        boolean zI;
        Object objT4;
        qim0 qim0Var4;
        int i5;
        fra fraVar = een.N0;
        Object obj = fkj0.X;
        nte1 nte1Var2 = rte1Var.i;
        boolean z11 = rte1Var.n;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1810469909);
        j06 j06Var = x340Var2.a;
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? x340Var2.g(rte1Var) : x340Var2.i(rte1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var2.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var2.g(yqgVar) ? 256 : 128;
        }
        int i6 = i3 | 3072;
        int i7 = i2 & 16;
        if (i7 == 0) {
            if ((i & 24576) == 0) {
                z2 = z;
                i6 |= x340Var2.h(z2) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                if (x340Var2.i(function1)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i6 |= i5;
            }
            if ((74899 & i6) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var2.Y(i6 & 1, z3)) {
                if (i7 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                objT = x340Var2.T();
                if (objT == obj) {
                    objT = new vue1(2);
                    x340Var2.s0(objT);
                }
                vue1Var = (vue1) objT;
                objT2 = x340Var2.T();
                if (objT2 == obj) {
                    objT2 = new vue1(1);
                    x340Var2.s0(objT2);
                }
                vue1Var2 = (vue1) objT2;
                int i8 = i6 & 896;
                strM = m(rte1Var.b, rte1Var.c, yqgVar, x340Var2, i8);
                strM2 = m(rte1Var.e, rte1Var.g, yqgVar, x340Var2, i8);
                u7hVar = rte1Var.k;
                if (u7hVar == null) {
                    x340Var2.i0(399848697);
                    uwr uwrVar = cbx.a;
                    j = cbx.a(x340Var2).b.a;
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(399847395);
                    x340Var2.r(false);
                    j = u7hVar.a;
                }
                j2 = j;
                u7hVar2 = rte1Var.l;
                if (u7hVar2 == null) {
                    x340Var2.i0(399851289);
                    uwr uwrVar2 = cbx.a;
                    j3 = cbx.a(x340Var2).a.c;
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(399849677);
                    x340Var2.r(false);
                    j3 = u7hVar2.a;
                }
                if (z11) {
                    f = 1.0f;
                    x340Var2.i0(-489451973);
                    uwr uwrVar3 = cbx.a;
                    avw0 avw0Var = cbx.b(x340Var2).c;
                    x340Var2.r(false);
                    f2 = 2.0f;
                } else {
                    f = 1.0f;
                    x340Var2.i0(-489396297);
                    uwr uwrVar4 = cbx.a;
                    avw0 avw0Var2 = cbx.b(x340Var2).c;
                    x340Var2.r(false);
                    f2 = 1.0f;
                }
                jB = u7h.b(j2, 0.5f, 0.0f, 0.0f, 0.0f, 14);
                watVar = (wat) x340Var2.k(t4k.h);
                if (z5 || watVar.U0() <= f) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                zG = x340Var2.g(nte1Var2);
                objT3 = x340Var2.T();
                if (zG || objT3 == obj) {
                    if (nte1Var2 == null) {
                        f3 = 0.0f;
                    } else {
                        f3 = 40.0f;
                    }
                    objT3 = ktd.o(f3, x340Var2);
                }
                ven0Var = (ven0) objT3;
                d36 d36Var = new d36(-f2, true, new um5(false));
                qim0Var3 = nim0.a;
                qim0 qim0VarB = uyn1.B(u291.f(qim0Var3, f), 16.0f, 0.0f, 0.0f, 0.0f, 14);
                mbhVarA = jbh.a(d36Var, een.P0, x340Var2, 0);
                iHashCode = Long.hashCode(x340Var2.T);
                xos0VarM = x340Var2.m();
                qim0VarE = zr7.E(x340Var2, qim0VarB);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                z7 = x340Var2.S;
                n4kVar = hmb0.t1;
                if (z7) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nte1Var = nte1Var2;
                lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var2, lljVar);
                lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var2, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var2, lljVar3);
                nko1.F(x340Var2);
                lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var2, lljVar4);
                qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
                if (z11) {
                    x340Var2.i0(705798506);
                    x340Var2.r(false);
                    j4 = j2;
                } else {
                    x340Var2.i0(705799718);
                    long j6 = cbx.a(x340Var2).b.b;
                    x340Var2.r(false);
                    j4 = j6;
                }
                if (z11 != 0) {
                    f4 = 8.0f;
                } else {
                    f4 = 4.0f;
                }
                qim0 qim0VarT = zod.T(qim0VarF, j4, f4, 16.0f, ((p3v) ven0Var.getValue()).a + 29.0f, rte1Var.o);
                if (rte1Var.m) {
                    f5 = 1.0f;
                } else {
                    f5 = 0.7f;
                }
                qim0 qim0VarF2 = dug.f(i1p1.q(d9y0.k(qim0VarT, f5), vue1Var), j3, d4o1.a);
                if (z11 != 0) {
                    j5 = jB;
                } else {
                    j5 = b;
                }
                qim0 qim0VarJ = u291.j(72.0f, 0.0f, 2, d1u.E(f2, j5, qim0VarF2, vue1Var));
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarJ);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(gfh0VarC, x340Var2, lljVar);
                nko1.H(xos0VarM2, x340Var2, lljVar2);
                x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE2, x340Var2, lljVar4);
                j82.u(h2c.a.a(qim0Var3, een.h), x340Var2, 0);
                f6 = f2;
                i4 = i6;
                z8 = z6;
                j2iVarR = apo.r(-699965828, new gcx(rte1Var, j2, strM, strM2, z8, function0), x340Var2);
                qim0 qim0VarF3 = u291.f(qim0Var3, 1.0f);
                cvx cvxVar = cbx.b(x340Var2).b;
                qim0VarX = uyn1.x(qim0VarF3, 16.0f);
                if (z8) {
                    x340Var2.i0(-1043668168);
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    d36 d36Var2 = new d36(16.0f, true, new um5(false));
                    cvx cvxVar3 = cbx.b(x340Var2).b;
                    z9 = false;
                    z10 = true;
                    k5p1.d(qim0VarX, new d36(8.0f, true, new um5(false)), d36Var2, fraVar, 2, 0, apo.r(669488793, new qje1(j2iVarR, (byte) 0), x340Var2), x340Var2, 1597440, 32);
                    x340Var = x340Var2;
                    x340Var.r(false);
                    nte1Var = nte1Var;
                } else {
                    x340Var = x340Var2;
                    z9 = false;
                    x340Var.i0(-1043282373);
                    cvx cvxVar4 = cbx.b(x340Var).b;
                    jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), fraVar, x340Var, 0);
                    int iHashCode3 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM3 = x340Var.m();
                    qim0 qim0VarE3 = zr7.E(x340Var, qim0VarX);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(jw31VarA, x340Var, lljVar);
                    nko1.H(xos0VarM3, x340Var, lljVar2);
                    x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE3, x340Var, lljVar4);
                    j2iVarR.invoke(pw31.a, x340Var, 54);
                    z10 = true;
                    x340Var.r(true);
                    x340Var.r(false);
                }
                x340Var.r(z10);
                if (nte1Var == null) {
                    x340Var.i0(408199022);
                    x340Var.r(z9);
                    qim0Var4 = qim0Var3;
                } else {
                    x340Var.i0(408199023);
                    if (!z11) {
                        jB = u7h.b(u7h.f, 0.2f, 0.0f, 0.0f, 0.0f, 14);
                    }
                    zI = x340Var.i((Object) 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x03ea: ARITH (r0v21 'zI' boolean) = (wrap boolean:0x03e0: INVOKE (r7v11 'x340Var' p.x340), (wrap java.lang.Object:?: CAST (java.lang.Object) (r29v1 ?? I:??[OBJECT, ARRAY])) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:993)) | (wrap boolean:0x03e6: INVOKE (r7v11 'x340Var' p.x340), (r0v5 'watVar' p.wat) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:999)) (LINE:1003) in method: p.rje1.h(p.rte1, kotlin.jvm.functions.Function0, p.yqg, p.qim0, boolean, kotlin.jvm.functions.Function0, p.b0k, int, int):void, file: /workspace/spotify-analysis/dex-input/classes8.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r29v1 ??
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                        */
                    /*
                        Method dump skipped, instruction units count: 1108
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p.rje1.h(p.rte1, kotlin.jvm.functions.Function0, p.yqg, p.qim0, boolean, kotlin.jvm.functions.Function0, p.b0k, int, int):void");
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                public static final void i(aa80 aa80Var, yqg yqgVar, iu30 iu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
                    int i2;
                    yqg yqgVar2 = yqgVar;
                    Object obj = fkj0.X;
                    x340 x340Var = (x340) b0kVar;
                    x340Var.k0(-1848713092);
                    if ((i & 6) == 0) {
                        i2 = (x340Var.i(aa80Var) ? 4 : 2) | i;
                    } else {
                        i2 = i;
                    }
                    if ((i & 48) == 0) {
                        i2 |= x340Var.g(yqgVar2) ? 32 : 16;
                    }
                    if ((i & 384) == 0) {
                        i2 |= x340Var.i(iu30Var) ? 256 : 128;
                    }
                    if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                        uue1 uue1Var = (uue1) aa80Var.b;
                        int i3 = i2 & 896;
                        boolean zI = (i3 == 256) | x340Var.i(aa80Var);
                        Object objT = x340Var.T();
                        if (zI || objT == obj) {
                            objT = new x0e1(iu30Var, aa80Var, (byte) 7);
                            x340Var.s0(objT);
                        }
                        Function0 function0 = (Function0) objT;
                        if (uue1Var.l == null) {
                            x340Var.i0(-645783858);
                            k(uue1Var, function0, yqgVar2, null, x340Var, (i2 << 3) & 896);
                            yqgVar2 = yqgVar2;
                            x340Var.r(false);
                        } else {
                            x340Var.i0(-645687944);
                            boolean zE = ((i2 & 112) == 32) | (i3 == 256) | x340Var.e(aa80Var.a);
                            Object objT2 = x340Var.T();
                            if (zE || objT2 == obj) {
                                objT2 = new que1(yqgVar2, new uuc1(function0, (byte) 11));
                                x340Var.s0(objT2);
                            }
                            otw.c((que1) objT2, uue1Var, (qim0) null, (ipb1) null, x340Var, 0, 12);
                            x340Var.r(false);
                        }
                    } else {
                        x340Var.b0();
                    }
                    h311 h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new um81(aa80Var, yqgVar2, iu30Var, i, (byte) 15);
                    }
                }

                public static final void j(int i, List list, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
                    qim0 qim0Var2;
                    boolean z;
                    long j;
                    float f;
                    x340 x340Var = (x340) b0kVar;
                    x340Var.k0(-1825427429);
                    int i2 = i | (x340Var.i(list) ? 4 : 2) | 48;
                    if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                        List list2 = list;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator it = list2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((uue1) ((aa80) it.next()).b).j) {
                                        z = true;
                                        break;
                                    }
                                } else {
                                    z = false;
                                    break;
                                }
                            }
                        } else {
                            z = false;
                            break;
                        }
                        cr31 cr31VarB = er31.b(16.0f);
                        qim0 qim0Var3 = nim0.a;
                        float f2 = 1.0f;
                        qim0 qim0VarB = uyn1.B(u291.f(qim0Var3, 1.0f), 16.0f, 0.0f, 0.0f, 0.0f, 14);
                        if (z) {
                            x340Var.i0(-1889086497);
                            uwr uwrVar = cbx.a;
                            j = cbx.a(x340Var).b.a;
                        } else {
                            x340Var.i0(-1889085502);
                            uwr uwrVar2 = cbx.a;
                            j = cbx.a(x340Var).b.b;
                        }
                        x340Var.r(false);
                        qim0 qim0VarQ = i1p1.q(zod.T(qim0VarB, j, z ? 8.0f : 4.0f, 14.0f, 30.0f, ((uue1) ((aa80) o7h.A0(list)).b).k), cr31VarB);
                        long j2 = cbx.a(x340Var).a.c;
                        u5j1 u5j1Var = d4o1.a;
                        qim0 qim0VarF = dug.f(qim0VarQ, j2, u5j1Var);
                        if (z) {
                            x340Var.i0(1568282277);
                            avw0 avw0Var = cbx.b(x340Var).c;
                            x340Var.r(false);
                            f = 2.0f;
                        } else {
                            x340Var.i0(1568353825);
                            avw0 avw0Var2 = cbx.b(x340Var).c;
                            x340Var.r(false);
                            f = 1.0f;
                        }
                        long j3 = b;
                        long j4 = c;
                        boolean z2 = z;
                        qim0 qim0VarE = d1u.E(f, z ? j4 : j3, qim0VarF, cr31VarB);
                        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                        int iHashCode = Long.hashCode(x340Var.T);
                        xos0 xos0VarM = x340Var.m();
                        qim0 qim0VarE2 = zr7.E(x340Var, qim0VarE);
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
                        nko1.H(qim0VarE2, x340Var, y580.Y);
                        x340Var.i0(1203886014);
                        int i3 = 0;
                        for (Object obj : list2) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                p7h.T();
                                throw null;
                            }
                            j2iVar.invoke((aa80) obj, x340Var, 48);
                            if (i3 < p7h.L(list)) {
                                x340Var.i0(369434398);
                                qim0 qim0VarF2 = u291.f(qim0Var3, f2);
                                uwr uwrVar3 = cbx.a;
                                avw0 avw0Var3 = cbx.b(x340Var).c;
                                op71.g(x340Var, dug.f(u291.h(qim0VarF2, f2), z2 ? j4 : j3, u5j1Var));
                                x340Var.r(false);
                            } else {
                                x340Var.i0(369670804);
                                x340Var.r(false);
                            }
                            i3 = i4;
                            f2 = 1.0f;
                        }
                        x340Var.r(false);
                        x340Var.r(true);
                        qim0Var2 = qim0Var3;
                    } else {
                        x340Var.b0();
                        qim0Var2 = qim0Var;
                    }
                    h311 h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new deo0(list, qim0Var2, j2iVar, i, (byte) 3);
                    }
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                public static final void k(uue1 uue1Var, Function0 function0, yqg yqgVar, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
                    int i2;
                    qim0 qim0Var2;
                    long jB;
                    boolean z = uue1Var.j;
                    x340 x340Var = (x340) b0kVar;
                    x340Var.k0(-73122221);
                    if ((i & 6) == 0) {
                        i2 = ((i & 8) == 0 ? x340Var.g(uue1Var) : x340Var.i(uue1Var) ? 4 : 2) | i;
                    } else {
                        i2 = i;
                    }
                    if ((i & 48) == 0) {
                        i2 |= x340Var.i(function0) ? 32 : 16;
                    }
                    if ((i & 384) == 0) {
                        i2 |= x340Var.g(yqgVar) ? 256 : 128;
                    }
                    int i3 = i2 | 3072;
                    if (!x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
                        x340Var.b0();
                        qim0Var2 = qim0Var;
                    } else {
                        if (uue1Var.m != 1) {
                            x340Var.i0(-835453147);
                            l(uue1Var, function0, yqgVar, false, x340Var, i3 & 1022, 8);
                            x340Var.r(false);
                            h311 h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                h311VarV.d = new um81(uue1Var, function0, yqgVar, i);
                                return;
                            }
                            return;
                        }
                        x340Var.i0(-835351281);
                        x340Var.r(false);
                        cr31 cr31VarB = er31.b(16.0f);
                        float f = 1.0f;
                        float f2 = uue1Var.i ? 1.0f : 0.7f;
                        qim0 qim0Var3 = nim0.a;
                        qim0 qim0VarB = uyn1.B(u291.f(qim0Var3, 1.0f), 16.0f, 0.0f, 0.0f, 0.0f, 14);
                        if (z) {
                            x340Var.i0(-835037096);
                            uwr uwrVar = cbx.a;
                            jB = cbx.a(x340Var).b.a;
                            x340Var.r(false);
                        } else {
                            x340Var.i0(-834975654);
                            uwr uwrVar2 = cbx.a;
                            jB = u7h.b(cbx.a(x340Var).b.b, f2, 0.0f, 0.0f, 0.0f, 14);
                            x340Var.r(false);
                        }
                        qim0 qim0VarF = dug.f(i1p1.q(d9y0.k(zod.T(qim0VarB, jB, z ? 8.0f : 4.0f, 14.0f, 30.0f, uue1Var.k), f2), cr31VarB), cbx.a(x340Var).a.c, d4o1.a);
                        if (z) {
                            x340Var.i0(-834470323);
                            avw0 avw0Var = cbx.b(x340Var).c;
                            x340Var.r(false);
                            f = 2.0f;
                        } else {
                            x340Var.i0(-834398775);
                            avw0 avw0Var2 = cbx.b(x340Var).c;
                            x340Var.r(false);
                        }
                        qim0 qim0VarE = d1u.E(f, z ? c : b, qim0VarF, cr31VarB);
                        gfh0 gfh0VarC = t1c.c(een.d, false);
                        int iHashCode = Long.hashCode(x340Var.T);
                        xos0 xos0VarM = x340Var.m();
                        qim0 qim0VarE2 = zr7.E(x340Var, qim0VarE);
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
                        nko1.H(qim0VarE2, x340Var, y580.Y);
                        l(uue1Var, function0, yqgVar, false, x340Var, (i3 & 896) | (i3 & 14) | 3072 | (i3 & 112), 0);
                        x340Var.r(true);
                        qim0Var2 = qim0Var3;
                    }
                    h311 h311VarV2 = x340Var.v();
                    if (h311VarV2 != null) {
                        h311VarV2.d = new uoc1(i, uue1Var, function0, yqgVar, qim0Var2, (byte) 15);
                    }
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                /* JADX WARN: Code duplicated, block: B:101:0x0264  */
                /* JADX WARN: Code duplicated, block: B:102:0x0274  */
                /* JADX WARN: Code duplicated, block: B:105:0x0288  */
                /* JADX WARN: Code duplicated, block: B:108:0x029b  */
                /* JADX WARN: Code duplicated, block: B:112:0x02b6  */
                /* JADX WARN: Code duplicated, block: B:114:0x02c2  */
                /* JADX WARN: Code duplicated, block: B:117:0x0303  */
                /* JADX WARN: Code duplicated, block: B:119:0x0309  */
                /* JADX WARN: Code duplicated, block: B:121:0x030d  */
                /* JADX WARN: Code duplicated, block: B:124:0x0318  */
                /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:40:0x0072  */
                /* JADX WARN: Code duplicated, block: B:41:0x0074  */
                /* JADX WARN: Code duplicated, block: B:44:0x007d A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:45:0x007f  */
                /* JADX WARN: Code duplicated, block: B:46:0x0082  */
                /* JADX WARN: Code duplicated, block: B:49:0x0088  */
                /* JADX WARN: Code duplicated, block: B:50:0x008b  */
                /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
                /* JADX WARN: Code duplicated, block: B:57:0x00f7  */
                /* JADX WARN: Code duplicated, block: B:59:0x0100  */
                /* JADX WARN: Code duplicated, block: B:60:0x0104  */
                /* JADX WARN: Code duplicated, block: B:63:0x0150  */
                /* JADX WARN: Code duplicated, block: B:65:0x0156  */
                /* JADX WARN: Code duplicated, block: B:68:0x019f  */
                /* JADX WARN: Code duplicated, block: B:69:0x01a9  */
                /* JADX WARN: Code duplicated, block: B:71:0x01bd A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:72:0x01bf  */
                /* JADX WARN: Code duplicated, block: B:73:0x01d1  */
                /* JADX WARN: Code duplicated, block: B:75:0x01d9  */
                /* JADX WARN: Code duplicated, block: B:79:0x020a  */
                /* JADX WARN: Code duplicated, block: B:80:0x0215  */
                /* JADX WARN: Code duplicated, block: B:88:0x0231  */
                /* JADX WARN: Code duplicated, block: B:91:0x0238  */
                /* JADX WARN: Code duplicated, block: B:92:0x023a  */
                /* JADX WARN: Code duplicated, block: B:96:0x0244  */
                /* JADX WARN: Code duplicated, block: B:99:0x0256  */
                public static final void l(uue1 uue1Var, Function0 function0, yqg yqgVar, boolean z, b0k b0kVar, int i, int i2) throws NoWhenBranchMatchedException {
                    int i3;
                    boolean z2;
                    boolean z3;
                    x340 x340Var;
                    boolean z4;
                    h311 h311VarV;
                    boolean z5;
                    float f;
                    String strM;
                    long j;
                    jw31 jw31VarA;
                    int iHashCode;
                    xos0 xos0VarM;
                    qim0 qim0VarE;
                    vu30 vu30VarR;
                    boolean z6;
                    n4k n4kVar;
                    int i4;
                    cjc0 cjc0Var;
                    int iC;
                    long j2;
                    String str;
                    gdx gdxVarS;
                    boolean z7;
                    boolean z8;
                    boolean z9;
                    Object objT;
                    Function0 function1;
                    boolean zF;
                    Object objT2;
                    Object objT3;
                    idx idxVar;
                    uqe1 uqe1Var;
                    m4c m4cVar = fkj0.X;
                    x340 x340Var2 = (x340) b0kVar;
                    x340Var2.k0(2010662785);
                    j06 j06Var = x340Var2.a;
                    if ((i & 6) == 0) {
                        i3 = ((i & 8) == 0 ? x340Var2.g(uue1Var) : x340Var2.i(uue1Var) ? 4 : 2) | i;
                    } else {
                        i3 = i;
                    }
                    if ((i & 48) == 0) {
                        i3 |= x340Var2.i(function0) ? 32 : 16;
                    }
                    if ((i & 384) == 0) {
                        i3 |= x340Var2.g(yqgVar) ? 256 : 128;
                    }
                    int i5 = i2 & 8;
                    if (i5 == 0) {
                        if ((i & 3072) == 0) {
                            z2 = z;
                            i3 |= x340Var2.h(z2) ? 2048 : 1024;
                        }
                        if ((i3 & 1171) != 1170) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (x340Var2.Y(i3 & 1, z3)) {
                            if (i5 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            if (uue1Var.i) {
                                f = 1.0f;
                            } else {
                                f = 0.7f;
                            }
                            strM = m(uue1Var.c, uue1Var.e, yqgVar, x340Var2, i3 & 896);
                            uwr uwrVar = cbx.a;
                            j = cbx.a(x340Var2).b.b;
                            fra fraVar = een.N0;
                            cvx cvxVar = cbx.b(x340Var2).b;
                            d36 d36Var = new d36(8.0f, true, new um5(false));
                            qim0 qim0VarJ = u291.j(72.0f, 0.0f, 2, u291.f(nim0.a, 1.0f));
                            if (!z5) {
                                f = 1.0f;
                            }
                            qim0 qim0VarK = d9y0.k(qim0VarJ, f);
                            cvx cvxVar2 = cbx.b(x340Var2).b;
                            qim0 qim0VarX = uyn1.x(qim0VarK, 16.0f);
                            jw31VarA = ew31.a(d36Var, fraVar, x340Var2, 0);
                            iHashCode = Long.hashCode(x340Var2.T);
                            xos0VarM = x340Var2.m();
                            qim0VarE = zr7.E(x340Var2, qim0VarX);
                            hzj.A.getClass();
                            vu30VarR = null;
                            if (j06Var != null) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var2.m0();
                            z6 = x340Var2.S;
                            n4kVar = hmb0.t1;
                            if (z6) {
                                x340Var2.l(n4kVar);
                            } else {
                                x340Var2.v0();
                            }
                            llj lljVar = y580.O0;
                            nko1.H(jw31VarA, x340Var2, lljVar);
                            llj lljVar2 = y580.N0;
                            nko1.H(xos0VarM, x340Var2, lljVar2);
                            Integer numValueOf = Integer.valueOf(iHashCode);
                            llj lljVar3 = y580.R0;
                            nko1.H(numValueOf, x340Var2, lljVar3);
                            nko1.F(x340Var2);
                            llj lljVar4 = y580.Y;
                            nko1.H(qim0VarE, x340Var2, lljVar4);
                            d(uue1Var.a, x340Var2, 0);
                            wnb0 wnb0Var = new wnb0(1.0f, true);
                            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                            int iHashCode2 = Long.hashCode(x340Var2.T);
                            xos0 xos0VarM2 = x340Var2.m();
                            qim0 qim0VarE2 = zr7.E(x340Var2, wnb0Var);
                            x340Var2.m0();
                            if (x340Var2.S) {
                                x340Var2.l(n4kVar);
                            } else {
                                x340Var2.v0();
                            }
                            nko1.H(mbhVarA, x340Var2, lljVar);
                            nko1.H(xos0VarM2, x340Var2, lljVar2);
                            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                            nko1.H(qim0VarE2, x340Var2, lljVar4);
                            String str2 = uue1Var.b;
                            lee1 lee1Var = cbx.d(x340Var2).k;
                            long j3 = cbx.a(x340Var2).b.a;
                            i4 = i3;
                            cjc0Var = a;
                            uwo1.e(str2, (qim0) null, lee1Var, j3, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, x340Var2, 0, 0, 1714);
                            x340Var = x340Var2;
                            if (strM == null) {
                                x340Var.i0(-974758355);
                                x340Var.r(false);
                            } else {
                                x340Var.i0(-974758354);
                                lee1 lee1Var2 = cbx.d(x340Var).j;
                                iC = l1d.C(uue1Var.d);
                                if (iC != 0) {
                                    x340Var.i0(-2140723988);
                                    j2 = cbx.a(x340Var).b.b;
                                    x340Var.r(false);
                                } else {
                                    if (iC == 1) {
                                        throw p3d1.k(x340Var, -2140727348, false);
                                    }
                                    x340Var.i0(-2140721007);
                                    j2 = cbx.a(x340Var).b.c;
                                    x340Var.r(false);
                                }
                                uwo1.e(strM, (qim0) null, lee1Var2, j2, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, x340Var, 0, 0, 1714);
                                x340Var = x340Var;
                                x340Var.r(false);
                            }
                            x340Var.r(true);
                            str = uue1Var.f;
                            if (str == null) {
                                x340Var.i0(-1230166057);
                                x340Var.r(false);
                            } else {
                                x340Var.i0(-1230166056);
                                gdxVarS = yla.s(x340Var);
                                if ((i4 & 14) != 4 || ((i4 & 8) != 0 && x340Var.i(uue1Var))) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if ((i4 & 112) == 32) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                z9 = z8 | z7;
                                objT = x340Var.T();
                                if (z9 || objT == m4cVar) {
                                    objT = new x0e1(uue1Var, function0, (byte) 8);
                                    x340Var.s0(objT);
                                }
                                function1 = (Function0) objT;
                                if (!ihc1.y0(str)) {
                                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                                    return;
                                }
                                gbx gbxVar = new gbx(new y50(str), function1);
                                if (uue1Var.h) {
                                    x340Var.i0(970123410);
                                    x340Var.r(false);
                                    idxVar = new idx(4);
                                } else {
                                    x340Var.i0(970216782);
                                    zF = x340Var.f(j);
                                    objT2 = x340Var.T();
                                    if (zF || objT2 == m4cVar) {
                                        objT2 = new q9j0((byte) 28, j);
                                        x340Var.s0(objT2);
                                    }
                                    vu30 vu30Var = (vu30) objT2;
                                    objT3 = x340Var.T();
                                    if (objT3 == m4cVar) {
                                        objT3 = ppd1.U0;
                                        x340Var.s0(objT3);
                                    }
                                    idx hdxVar = new hdx(0, vu30Var, (vu30) objT3, (vu30) null, (hw61) null, 25);
                                    x340Var.r(false);
                                    idxVar = hdxVar;
                                }
                                uqe1Var = uue1Var.g;
                                if (uqe1Var == null) {
                                    x340Var.i0(970448537);
                                    x340Var.r(false);
                                } else {
                                    x340Var.i0(970448538);
                                    vu30VarR = apo.r(1014754458, new gsc1(uqe1Var, gdxVarS), x340Var);
                                    x340Var.r(false);
                                }
                                x340 x340Var3 = x340Var;
                                foo1.c(gbxVar, idxVar, (qim0) null, (max) null, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, vu30VarR, apo.r(-8998886, new zsd1(str, (byte) 2), x340Var), x340Var3, 0, 48, 988);
                                x340Var = x340Var3;
                                x340Var.r(false);
                            }
                            x340Var.r(true);
                            z4 = z5;
                        } else {
                            x340Var = x340Var2;
                            x340Var.b0();
                            z4 = z2;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new ilf(uue1Var, function0, yqgVar, z4, i, i2);
                        }
                    }
                    i3 |= 3072;
                    z2 = z;
                    if ((i3 & 1171) != 1170) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (x340Var2.Y(i3 & 1, z3)) {
                        if (i5 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (uue1Var.i) {
                            f = 1.0f;
                        } else {
                            f = 0.7f;
                        }
                        strM = m(uue1Var.c, uue1Var.e, yqgVar, x340Var2, i3 & 896);
                        uwr uwrVar2 = cbx.a;
                        j = cbx.a(x340Var2).b.b;
                        fra fraVar2 = een.N0;
                        cvx cvxVar3 = cbx.b(x340Var2).b;
                        d36 d36Var2 = new d36(8.0f, true, new um5(false));
                        qim0 qim0VarJ2 = u291.j(72.0f, 0.0f, 2, u291.f(nim0.a, 1.0f));
                        if (!z5) {
                            f = 1.0f;
                        }
                        qim0 qim0VarK2 = d9y0.k(qim0VarJ2, f);
                        cvx cvxVar4 = cbx.b(x340Var2).b;
                        qim0 qim0VarX2 = uyn1.x(qim0VarK2, 16.0f);
                        jw31VarA = ew31.a(d36Var2, fraVar2, x340Var2, 0);
                        iHashCode = Long.hashCode(x340Var2.T);
                        xos0VarM = x340Var2.m();
                        qim0VarE = zr7.E(x340Var2, qim0VarX2);
                        hzj.A.getClass();
                        vu30VarR = null;
                        if (j06Var != null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var2.m0();
                        z6 = x340Var2.S;
                        n4kVar = hmb0.t1;
                        if (z6) {
                            x340Var2.l(n4kVar);
                        } else {
                            x340Var2.v0();
                        }
                        llj lljVar5 = y580.O0;
                        nko1.H(jw31VarA, x340Var2, lljVar5);
                        llj lljVar6 = y580.N0;
                        nko1.H(xos0VarM, x340Var2, lljVar6);
                        Integer numValueOf2 = Integer.valueOf(iHashCode);
                        llj lljVar7 = y580.R0;
                        nko1.H(numValueOf2, x340Var2, lljVar7);
                        nko1.F(x340Var2);
                        llj lljVar8 = y580.Y;
                        nko1.H(qim0VarE, x340Var2, lljVar8);
                        d(uue1Var.a, x340Var2, 0);
                        wnb0 wnb0Var2 = new wnb0(1.0f, true);
                        mbh mbhVarA2 = jbh.a(h36.c, een.P0, x340Var2, 0);
                        int iHashCode3 = Long.hashCode(x340Var2.T);
                        xos0 xos0VarM3 = x340Var2.m();
                        qim0 qim0VarE3 = zr7.E(x340Var2, wnb0Var2);
                        x340Var2.m0();
                        if (x340Var2.S) {
                            x340Var2.l(n4kVar);
                        } else {
                            x340Var2.v0();
                        }
                        nko1.H(mbhVarA2, x340Var2, lljVar5);
                        nko1.H(xos0VarM3, x340Var2, lljVar6);
                        x0d.q(iHashCode3, x340Var2, lljVar7, x340Var2);
                        nko1.H(qim0VarE3, x340Var2, lljVar8);
                        String str3 = uue1Var.b;
                        lee1 lee1Var3 = cbx.d(x340Var2).k;
                        long j4 = cbx.a(x340Var2).b.a;
                        i4 = i3;
                        cjc0Var = a;
                        uwo1.e(str3, (qim0) null, lee1Var3, j4, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, x340Var2, 0, 0, 1714);
                        x340Var = x340Var2;
                        if (strM == null) {
                            x340Var.i0(-974758355);
                            x340Var.r(false);
                        } else {
                            x340Var.i0(-974758354);
                            lee1 lee1Var4 = cbx.d(x340Var).j;
                            iC = l1d.C(uue1Var.d);
                            if (iC != 0) {
                                x340Var.i0(-2140723988);
                                j2 = cbx.a(x340Var).b.b;
                                x340Var.r(false);
                            } else {
                                if (iC == 1) {
                                    throw p3d1.k(x340Var, -2140727348, false);
                                }
                                x340Var.i0(-2140721007);
                                j2 = cbx.a(x340Var).b.c;
                                x340Var.r(false);
                            }
                            uwo1.e(strM, (qim0) null, lee1Var4, j2, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, x340Var, 0, 0, 1714);
                            x340Var = x340Var;
                            x340Var.r(false);
                        }
                        x340Var.r(true);
                        str = uue1Var.f;
                        if (str == null) {
                            x340Var.i0(-1230166057);
                            x340Var.r(false);
                        } else {
                            x340Var.i0(-1230166056);
                            gdxVarS = yla.s(x340Var);
                            if ((i4 & 14) != 4) {
                                z7 = true;
                            } else {
                                z7 = true;
                            }
                            if ((i4 & 112) == 32) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            z9 = z8 | z7;
                            objT = x340Var.T();
                            if (z9) {
                                objT = new x0e1(uue1Var, function0, (byte) 8);
                                x340Var.s0(objT);
                            } else {
                                objT = new x0e1(uue1Var, function0, (byte) 8);
                                x340Var.s0(objT);
                            }
                            function1 = (Function0) objT;
                            if (!ihc1.y0(str)) {
                                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                                return;
                            }
                            gbx gbxVar2 = new gbx(new y50(str), function1);
                            if (uue1Var.h) {
                                x340Var.i0(970123410);
                                x340Var.r(false);
                                idxVar = new idx(4);
                            } else {
                                x340Var.i0(970216782);
                                zF = x340Var.f(j);
                                objT2 = x340Var.T();
                                if (zF) {
                                    objT2 = new q9j0((byte) 28, j);
                                    x340Var.s0(objT2);
                                } else {
                                    objT2 = new q9j0((byte) 28, j);
                                    x340Var.s0(objT2);
                                }
                                vu30 vu30Var2 = (vu30) objT2;
                                objT3 = x340Var.T();
                                if (objT3 == m4cVar) {
                                    objT3 = ppd1.U0;
                                    x340Var.s0(objT3);
                                }
                                idx hdxVar2 = new hdx(0, vu30Var2, (vu30) objT3, (vu30) null, (hw61) null, 25);
                                x340Var.r(false);
                                idxVar = hdxVar2;
                            }
                            uqe1Var = uue1Var.g;
                            if (uqe1Var == null) {
                                x340Var.i0(970448537);
                                x340Var.r(false);
                            } else {
                                x340Var.i0(970448538);
                                vu30VarR = apo.r(1014754458, new gsc1(uqe1Var, gdxVarS), x340Var);
                                x340Var.r(false);
                            }
                            x340 x340Var4 = x340Var;
                            foo1.c(gbxVar2, idxVar, (qim0) null, (max) null, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, vu30VarR, apo.r(-8998886, new zsd1(str, (byte) 2), x340Var), x340Var4, 0, 48, 988);
                            x340Var = x340Var4;
                            x340Var.r(false);
                        }
                        x340Var.r(true);
                        z4 = z5;
                    } else {
                        x340Var = x340Var2;
                        x340Var.b0();
                        z4 = z2;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new ilf(uue1Var, function0, yqgVar, z4, i, i2);
                    }
                }

                public static final String m(String str, Long l, yqg yqgVar, b0k b0kVar, int i) {
                    x340 x340Var = (x340) b0kVar;
                    x340Var.i0(1626548261);
                    if (str == null || l == null || !ihc1.h0(str, "{{COUNTDOWN}}", false)) {
                        x340Var.r(false);
                        return str;
                    }
                    String strO = hno1.o(l, yqgVar, x340Var, (i >> 3) & 126);
                    if (strO == null) {
                        strO = "";
                    }
                    String strW = nhc1.W(str, "{{COUNTDOWN}}", strO);
                    x340Var.r(false);
                    return strW;
                }
            }
