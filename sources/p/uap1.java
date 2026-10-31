package p;

import android.R;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.concertcampaignview.v1.CtaType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class uap1 {
    public static b180 a;
    public static b180 b;

    public static final void a(String str, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-169846473);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String strO0 = cwl1.o0(x340Var, 2131958522);
            String strO1 = cwl1.o0(x340Var, R.string.cancel);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.TRUE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean zI = x340Var.i(ven0Var) | ((i2 & 896) == 256);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new cb(function1, ven0Var, (byte) 13);
                x340Var.s0(objT2);
            }
            Function0 function2 = (Function0) objT2;
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                x340Var.i0(-424361013);
                String strO2 = cwl1.o0(x340Var, 2131958524);
                String strN0 = cwl1.n0(2131958523, new Object[]{str}, x340Var);
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                zgx zgxVar = new zgx(strO0, new gbx(new y50(strO0), function0));
                if (ihc1.y0(strO1)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                } else {
                    mqo1.d(function2, null, null, strO2, strN0, zgxVar, new zgx(strO1, new gbx(new y50(strO1), function2)), x340Var, 2359296, 6);
                    x340Var.r(false);
                }
            } else {
                x340Var.i0(-423807477);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bb(str, function0, function1, i, (byte) 3);
        }
    }

    public static final void b(Function0 function0, b0k b0kVar, int i) {
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1516238033);
        int i2 = i | (x340Var.i(function0) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarY = uyn1.y(voo1.y(u291.f(nim0Var, 1.0f), voo1.g), 24.0f, 16.0f);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            g491.g((qim0) null, x340Var, 0);
            qim0 qim0VarO = ab80.o(nim0Var, 24.0f, x340Var, nim0Var, 1.0f);
            String strO0 = cwl1.o0(x340Var, 2131961098);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, qim0VarO, cbx.d(x340Var).d, cbx.a(x340Var).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
            uwo1.e(cwl1.o0(x340Var, 2131961097), ab80.o(nim0Var, 8.0f, x340Var, nim0Var, 1.0f), cbx.d(x340Var).g, cbx.a(x340Var).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
            String strG = ydh.g(24.0f, 2131961096, x340Var, x340Var, nim0Var);
            idx idxVar = new idx(4);
            gdx gdxVarR = yla.r(x340Var);
            if (ihc1.y0(strG)) {
                hhg1.n("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
                return;
            }
            y50 y50Var = new y50(strG);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new isr0(function0, (byte) 26);
                x340Var.s0(objT);
            }
            gbx gbxVar = new gbx(y50Var, (Function0) objT);
            j2i j2iVarR = apo.r(-158472796, new psr0(strG, (byte) 18), x340Var);
            function1 = function0;
            foo1.c(gbxVar, idxVar, null, null, gdxVarR, null, null, null, null, null, j2iVarR, x340Var, 0, 48, 2012);
            x340Var = x340Var;
            x0d.s(nim0Var, 16.0f, x340Var, true);
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tse0(function1, i, (byte) 24);
        }
    }

    public static final void c(float f, long j, c380 c380Var, int i, bpo bpoVar, pmg1 pmg1Var, xu30 xu30Var, qim0 qim0Var, float f2, s69 s69Var, i79 i79Var, xu30 xu30Var2, iu30 iu30Var, float f3, boolean z, Integer num, vu30 vu30Var, iu30 iu30Var2, Function0 function0, Function0 function1, vu30 vu30Var2, c380 c380Var2, b0k b0kVar, int i2, int i3) {
        int i4;
        int i5;
        float f4;
        b0k b0kVar2;
        ky81 ky81Var;
        h311 h311Var;
        int iC;
        float f5;
        float f6;
        Object iiaVar;
        ven0 ven0Var;
        float f7;
        c380 c380Var3;
        Object e971Var;
        s69 s69Var2;
        int i6;
        z5y z5yVar;
        z5y z5yVar2;
        Object slm0Var;
        wat watVar;
        ven0 ven0Var2;
        s69 s69Var3;
        pmg1 pmg1Var2;
        gb5 gb5Var;
        qim0 qim0Var2;
        boolean z2;
        int i7;
        float f8;
        iu30 iu30Var3;
        float f9;
        float f10;
        float f11;
        boolean z3;
        o4w o4wVar;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1437471611);
        if ((i2 & 6) == 0) {
            i4 = i2 | (b0kVar3.d(f) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= b0kVar3.f(j) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= b0kVar3.g(c380Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= b0kVar3.e(l1d.C(i)) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= b0kVar3.e(bpoVar.ordinal()) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= b0kVar3.g(pmg1Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= b0kVar3.i(xu30Var) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= b0kVar3.g(qim0Var) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= b0kVar3.d(f2) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= b0kVar3.i(s69Var) ? 536870912 : 268435456;
        }
        int i8 = i4;
        if ((i3 & 6) == 0) {
            i5 = i3 | (b0kVar3.i(i79Var) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= b0kVar3.i(xu30Var2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= b0kVar3.i(iu30Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            f4 = f3;
            i5 |= b0kVar3.d(f4) ? 2048 : 1024;
        } else {
            f4 = f3;
        }
        if ((i3 & 24576) == 0) {
            i5 |= b0kVar3.h(z) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i5 |= b0kVar3.g(num) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= b0kVar3.i(vu30Var) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= b0kVar3.i(iu30Var2) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= b0kVar3.i(function0) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= b0kVar3.i(function1) ? 536870912 : 268435456;
        }
        int i9 = i5;
        int i10 = (b0kVar3.i(vu30Var2) ? 4 : 2) | (b0kVar3.g(c380Var2) ? 32 : 16);
        if (b0kVar3.Y(i8 & 1, ((i8 & 306783379) == 306783378 && (i9 & 306783379) == 306783378 && (i10 & 19) == 18) ? false : true)) {
            b0kVar3.d0();
            if ((i2 & 1) != 0 && !b0kVar3.E()) {
                b0kVar3.b0();
            }
            b0kVar3.s();
            boolean z4 = c380Var != null && c380Var.size() > 1;
            float f12 = f * 0.15f;
            boolean z5 = i == 2 && z4;
            if (!z4) {
                f6 = 0.0f;
                f5 = 0.0f;
            } else if (z5 || (iC = l1d.C(i)) == 0) {
                f5 = 0.0f;
                f6 = f2;
            } else if (iC != 1) {
                f5 = 0.0f;
                if (iC != 2) {
                    eg.o();
                    return;
                }
                f6 = 0.0f;
            } else {
                f5 = 0.0f;
                f6 = 0.35f;
            }
            Object objT = b0kVar3.T();
            if (objT == m4cVar) {
                objT = oy81.a;
                b0kVar3.s0(objT);
            }
            tob1 tob1VarB = z95.b(f6, irn1.o0(CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER, 0, new e9b((nla0) objT, (byte) 1), 2), "alphaAnimation", (iu30) null, b0kVar3, 3072, 20);
            if (((Number) tob1VarB.getValue()).floatValue() <= f5) {
                h311 h311VarV = b0kVar3.v();
                if (h311VarV == null) {
                    return;
                }
                ky81Var = new ky81(f, j, c380Var, i, bpoVar, pmg1Var, xu30Var, qim0Var, f2, s69Var, i79Var, xu30Var2, iu30Var, f4, z, num, vu30Var, iu30Var2, function0, function1, vu30Var2, c380Var2, i2, i3, (byte) 1);
                h311Var = h311VarV;
            } else {
                int i11 = i8 >> 6;
                Object objT2 = b0kVar3.T();
                if (objT2 == m4cVar) {
                    objT2 = c97.b(1.0f);
                    b0kVar3.s0(objT2);
                }
                o95 o95Var = (o95) objT2;
                Object objT3 = b0kVar3.T();
                z6x z6xVar = z6x.a;
                if (objT3 == m4cVar) {
                    objT3 = v8r.q(z6xVar);
                    b0kVar3.s0(objT3);
                }
                ven0 ven0Var3 = (ven0) objT3;
                Object objT4 = b0kVar3.T();
                if (objT4 == m4cVar) {
                    objT4 = v8r.q(z6xVar);
                    b0kVar3.s0(objT4);
                }
                ven0 ven0Var4 = (ven0) objT4;
                boolean z6 = c380Var != null && c380Var.size() > 1;
                boolean z7 = z6;
                boolean zH = ((((i11 & 14) ^ 6) > 4 && b0kVar3.g(c380Var)) || (i11 & 6) == 4) | b0kVar3.h(z6) | b0kVar3.i(o95Var);
                Object objT5 = b0kVar3.T();
                if (zH || objT5 == m4cVar) {
                    ven0Var = ven0Var3;
                    b0kVar2 = b0kVar3;
                    f7 = 1.0f;
                    iiaVar = new iia(z7, c380Var, ven0Var4, ven0Var, o95Var, (lnm) null);
                    c380Var3 = c380Var;
                    b0kVar2.s0(iiaVar);
                } else {
                    f7 = 1.0f;
                    b0kVar2 = b0kVar3;
                    iiaVar = objT5;
                    c380Var3 = c380Var;
                    ven0Var = ven0Var3;
                }
                qxd0.t(c380Var3, b0kVar2, (vu30) iiaVar);
                Object objT6 = b0kVar2.T();
                if (objT6 == m4cVar) {
                    objT6 = new rlm0(o95Var, ven0Var, ven0Var4);
                    b0kVar2.s0(objT6);
                }
                rlm0 rlm0Var = (rlm0) objT6;
                float f13 = (f12 * 3.0f) / 4.0f;
                float f14 = (f - f13) - f13;
                wat watVar2 = (wat) b0kVar2.k(t4k.h);
                float fX0 = watVar2.X0(f14);
                ss50 ss50Var = (ss50) b0kVar2.k(t4k.l);
                int i12 = i9 >> 6;
                ven0 ven0VarS = v8r.s(iu30Var, b0kVar2);
                ven0 ven0VarS2 = v8r.s(xu30Var, b0kVar2);
                boolean zG = b0kVar2.g(s69Var) | b0kVar2.g(i79Var);
                Object objT7 = b0kVar2.T();
                if (zG || objT7 == m4cVar) {
                    s69Var2 = s69Var;
                    i6 = i12;
                    e971Var = new e971(s69Var2, i79Var, ven0VarS2, ven0VarS, (byte) 7);
                    b0kVar2.s0(e971Var);
                } else {
                    e971Var = objT7;
                    i6 = i12;
                    s69Var2 = s69Var;
                }
                iu30 iu30Var4 = (iu30) e971Var;
                switch (bpoVar.ordinal()) {
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                    case 1:
                        z5yVar = x5y.c;
                        break;
                    case 2:
                    case 4:
                    case 6:
                    case 8:
                    case 10:
                    case grn1.d /* 12 */:
                        z5yVar = y5y.c;
                        break;
                    case 3:
                    case 5:
                    case 7:
                    case 9:
                    case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                    case 13:
                        z5yVar = z5y.c;
                        break;
                    default:
                        eg.o();
                        return;
                }
                int i13 = ((i8 >> 27) & 14) | (i9 & 112);
                Object objT8 = b0kVar2.T();
                if (objT8 == m4cVar) {
                    objT8 = c97.b(f7);
                    b0kVar2.s0(objT8);
                }
                o95 o95Var2 = (o95) objT8;
                Object objT9 = b0kVar2.T();
                if (objT9 == m4cVar) {
                    objT9 = v8r.q((Object) null);
                    b0kVar2.s0(objT9);
                }
                ven0 ven0Var5 = (ven0) objT9;
                Object objT10 = b0kVar2.T();
                if (objT10 == m4cVar) {
                    objT10 = v8r.q((Object) null);
                    b0kVar2.s0(objT10);
                }
                ven0 ven0Var6 = (ven0) objT10;
                Object objT11 = b0kVar2.T();
                if (objT11 == m4cVar) {
                    objT11 = v8r.q((Object) null);
                    b0kVar2.s0(objT11);
                }
                ven0 ven0Var7 = (ven0) objT11;
                boolean zI = b0kVar2.i(s69Var2) | b0kVar2.i(o95Var2) | ((((i13 & 112) ^ 48) > 32 && b0kVar2.g(xu30Var2)) || (i13 & 48) == 32) | b0kVar2.g(z5yVar);
                Object objT12 = b0kVar2.T();
                if (zI || objT12 == m4cVar) {
                    z5yVar2 = z5yVar;
                    watVar = watVar2;
                    slm0Var = new slm0(ven0Var7, s69Var, ven0Var5, ven0Var6, o95Var2, xu30Var2, z5yVar2, (lnm) null);
                    ven0Var2 = ven0Var7;
                    s69Var3 = s69Var;
                    b0kVar2.s0(slm0Var);
                } else {
                    s69Var3 = s69Var;
                    z5yVar2 = z5yVar;
                    slm0Var = objT12;
                    ven0Var2 = ven0Var7;
                    watVar = watVar2;
                }
                qxd0.s(s69Var3, z5yVar2, (vu30) slm0Var, b0kVar2);
                Object objT13 = b0kVar2.T();
                if (objT13 == m4cVar) {
                    objT13 = new gb5(o95Var2, ven0Var5, ven0Var6, ven0Var2);
                    b0kVar2.s0(objT13);
                }
                gb5 gb5Var2 = (gb5) objT13;
                boolean zC = gb5Var2.c();
                float fX1 = watVar.X0(22.0f);
                qim0 qim0VarS = u291.s(qim0Var, watVar.N0(pmg1Var.a), f);
                int i14 = i8 & 458752;
                boolean z8 = i14 == 131072;
                Object objT14 = b0kVar2.T();
                if (z8 || objT14 == m4cVar) {
                    objT14 = new a9b(pmg1Var, (byte) 1);
                    b0kVar2.s0(objT14);
                }
                qim0 qim0VarC = i541.C(qim0VarS, (iu30) objT14);
                tl3 tl3Var = een.d;
                gfh0 gfh0VarC = t1c.c(tl3Var, false);
                int iHashCode = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM = b0kVar2.m();
                qim0 qim0VarE = zr7.E(b0kVar2, qim0VarC);
                hzj.A.getClass();
                if (((x340) b0kVar2).a == null) {
                    tgp1.p();
                    throw null;
                }
                b0kVar2.m0();
                boolean z9 = ((x340) b0kVar2).S;
                Function0 function2 = hmb0.t1;
                if (z9) {
                    b0kVar2.l(function2);
                } else {
                    b0kVar2.v0();
                }
                vu30 vu30Var3 = y580.O0;
                nko1.H(gfh0VarC, b0kVar2, vu30Var3);
                llj lljVar = y580.N0;
                nko1.H(xos0VarM, b0kVar2, lljVar);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar2 = y580.R0;
                nko1.H(numValueOf, b0kVar2, lljVar2);
                nko1.F(b0kVar2);
                llj lljVar3 = y580.Y;
                nko1.H(qim0VarE, b0kVar2, lljVar3);
                b0kVar2.i0(-1432784925);
                nim0 nim0Var = nim0.a;
                vu30 vu30Var4 = vu30Var3;
                qim0 qim0VarD = u291.d(nim0Var, f7);
                Function0 function3 = function2;
                tl3 tl3Var2 = tl3Var;
                qim0 qim0VarB = uyn1.B(qim0VarD, 0.0f, f13, 0.0f, f13, 5);
                o4w o4wVarA = gb5Var2.a();
                if (z5 == 0 || o4wVarA == null) {
                    pmg1Var2 = pmg1Var;
                    gb5Var = gb5Var2;
                    qim0Var2 = qim0VarB;
                    watVar = watVar;
                    tl3Var2 = tl3Var2;
                    function3 = function3;
                    vu30Var4 = vu30Var4;
                    z2 = false;
                    zC = zC;
                    m4cVar = m4cVar;
                    i7 = i14;
                    b0kVar2.i0(-1928446745);
                    b0kVar2.r(false);
                } else {
                    b0kVar2.i0(-1931527680);
                    boolean zI2 = b0kVar2.i(gb5Var2) | (i14 == 131072) | b0kVar2.d(fX0) | b0kVar2.d(fX1) | ((i9 & 1879048192) == 536870912) | ((i10 & 112) == 32) | ((i10 & 14) == 4) | b0kVar2.i(ss50Var);
                    Object objT15 = b0kVar2.T();
                    if (zI2 || objT15 == m4cVar) {
                        gb5Var = gb5Var2;
                        i7 = i14;
                        ny81 ny81Var = new ny81(gb5Var, pmg1Var, fX0, fX1, function1, c380Var2, vu30Var2, ss50Var, (byte) 0);
                        pmg1Var2 = pmg1Var;
                        f8 = fX0;
                        b0kVar2.s0(ny81Var);
                        objT15 = ny81Var;
                    } else {
                        gb5Var = gb5Var2;
                        f8 = fX0;
                        pmg1Var2 = pmg1Var;
                        i7 = i14;
                    }
                    qim0 qim0VarC2 = f8d1.c(qim0VarB, s69Var, pmg1Var2, (PointerInputEventHandler) objT15);
                    z2 = false;
                    b0kVar2.r(false);
                    qim0Var2 = qim0VarC2;
                }
                b0kVar2.r(z2);
                boolean z10 = z5;
                boolean zI3 = b0kVar2.i(gb5Var) | (i7 == 131072) | b0kVar2.h(z10) | b0kVar2.h(zC) | ((i8 & 112) == 32) | b0kVar2.g(tob1VarB) | b0kVar2.i(rlm0Var);
                Object objT16 = b0kVar2.T();
                if (zI3 || objT16 == m4cVar) {
                    pmg1 pmg1Var3 = pmg1Var2;
                    ly81 ly81Var = new ly81(gb5Var, pmg1Var3, z10, zC, j, rlm0Var, tob1VarB);
                    pmg1Var2 = pmg1Var3;
                    b0kVar2.s0(ly81Var);
                    objT16 = ly81Var;
                }
                j0o1.b(0, b0kVar2, (iu30) objT16, qim0Var2);
                qim0 qim0VarD2 = eqr0.D(watVar.N0(pmg1Var2.i), 0.0f, 2, nim0Var);
                gfh0 gfh0VarC2 = t1c.c(tl3Var2, false);
                int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM2 = b0kVar2.m();
                qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarD2);
                if (((x340) b0kVar2).a == null) {
                    tgp1.p();
                    throw null;
                }
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(function3);
                } else {
                    b0kVar2.v0();
                }
                nko1.H(gfh0VarC2, b0kVar2, vu30Var4);
                nko1.H(xos0VarM2, b0kVar2, lljVar);
                x0d.q(iHashCode2, b0kVar2, lljVar2, b0kVar2);
                nko1.H(qim0VarE2, b0kVar2, lljVar3);
                if (z10 != 0) {
                    b0kVar2.i0(326608912);
                    o4w o4wVarA2 = gb5Var.a();
                    if (o4wVarA2 == null) {
                        b0kVar2.i0(1534941681);
                        b0kVar2.r(false);
                        z3 = false;
                        iu30Var3 = iu30Var4;
                        f9 = f14;
                        f10 = f13;
                        f11 = f8;
                    } else {
                        b0kVar2.i0(1534941682);
                        int i15 = i10 << 12;
                        int i16 = (i6 & 896) | 54 | ((i9 >> 3) & 7168) | (i15 & 57344) | (i15 & 458752);
                        int i17 = i9 << 9;
                        b0k b0kVar4 = b0kVar2;
                        f10 = f13;
                        pmg1 pmg1Var4 = pmg1Var2;
                        iu30Var3 = iu30Var4;
                        f9 = f14;
                        f11 = f8;
                        zho1.e(o4wVarA2, gb5Var, j, ((Number) tob1VarB.getValue()).floatValue(), f10, f9, f11, pmg1Var4, iu30Var3, null, true, false, z, z, vu30Var2, c380Var2, f3, bpoVar, z ? num : null, vu30Var, iu30Var2, function0, function1, b0kVar4, 64 | ((i8 << 3) & 896) | ((i8 << 6) & 29360128), i16 | (i17 & 3670016) | ((i8 << 9) & 29360128) | (i17 & 1879048192), (i9 >> 21) & 1022);
                        b0kVar2 = b0kVar4;
                        z3 = false;
                        b0kVar2.r(false);
                    }
                    b0kVar2.r(z3);
                } else {
                    iu30Var3 = iu30Var4;
                    f9 = f14;
                    f10 = f13;
                    f11 = f8;
                    z3 = false;
                    b0kVar2.i0(1536117233);
                    b0kVar2.r(false);
                }
                if (z10) {
                    b0kVar2.i0(326653565);
                    ven0 ven0Var8 = gb5Var.c;
                    o4w o4wVarA3 = (o4w) gb5Var.d.getValue();
                    if (o4wVarA3 == null) {
                        if (gb5Var.c()) {
                            o4w o4wVar2 = (o4w) gb5Var.b.getValue();
                            if ((o4wVar2 == null || (o4wVar = (o4w) gb5Var.c.getValue()) == null) ? z3 : x760.z(o4wVar2, o4wVar)) {
                                o4wVarA3 = (o4w) ven0Var8.getValue();
                            } else {
                                if (((Number) gb5Var.a.e()).floatValue() < 0.5f) {
                                    ven0Var8 = gb5Var.b;
                                }
                                o4wVarA3 = (o4w) ven0Var8.getValue();
                            }
                        } else {
                            o4wVarA3 = gb5Var.a();
                        }
                    }
                    if (o4wVarA3 == null) {
                        b0kVar2.i0(1536325924);
                        b0kVar2.r(z3);
                    } else {
                        b0kVar2.i0(1536325925);
                        float fFloatValue = ((Number) 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0810: INVOKE (r4v19 'fFloatValue' float) = 
                              (wrap java.lang.Number:0x080e: CHECK_CAST (java.lang.Number) (wrap java.lang.Object:0x080a: INVOKE (r8v11 ?? I:??[OBJECT, ARRAY]) INTERFACE call: p.tob1.getValue():java.lang.Object A[WRAPPED] (LINE:168)))
                             VIRTUAL call: java.lang.Number.floatValue():float A[DECLARE_VAR, MD:():float (c)] (LINE:168) in method: p.uap1.c(float, long, p.c380, int, p.bpo, p.pmg1, p.xu30, p.qim0, float, p.s69, p.i79, p.xu30, p.iu30, float, boolean, java.lang.Integer, p.vu30, p.iu30, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p.vu30, p.c380, p.b0k, int, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
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
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r8v11 ??
                            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                            */
                        /*
                            Method dump skipped, instruction units count: 2294
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p.uap1.c(float, long, p.c380, int, p.bpo, p.pmg1, p.xu30, p.qim0, float, p.s69, p.i79, p.xu30, p.iu30, float, boolean, java.lang.Integer, p.vu30, p.iu30, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p.vu30, p.c380, p.b0k, int, int):void");
                    }

                    public static final String d(String str) {
                        String strZ;
                        Set set = s4b1.f;
                        s4b1 s4b1VarX = uic.x(str);
                        String strS = s4b1VarX.s();
                        if (strS == null || (strZ = s4b1VarX.z()) == null) {
                            return str;
                        }
                        List<String> listQ0 = ihc1.Q0(ihc1.H0(strZ, "spotify:"), new String[]{":"}, 0, 6);
                        ArrayList arrayList = new ArrayList(q7h.U(listQ0, 10));
                        for (String str2 : listQ0) {
                            if (u890.j(Uri.decode(str2), strS)) {
                                str2 = "aduser";
                            }
                            arrayList.add(str2);
                        }
                        return "spotify:".concat(o7h.y0(arrayList, ":", (String) null, (String) null, (iu30) null, 62));
                    }

                    public static final String e(long j) {
                        long jL0 = fdg1.l0(j, ngv.d);
                        long jU = jfv.u(jL0, ngv.g);
                        int iJ = jfv.j(jL0);
                        int iL = jfv.l(jL0);
                        return jU > 0 ? String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jU), Integer.valueOf(iJ), Integer.valueOf(iL)}, 3)) : String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iJ), Integer.valueOf(iL)}, 2));
                    }

                    public static orp0 f(int i) {
                        for (orp0 orp0Var : orp0.values()) {
                            if (orp0Var.a == i) {
                                return orp0Var;
                            }
                        }
                        return orp0.d;
                    }

                    public static final String g(z551 z551Var) {
                        klr0 klr0Var = z551Var.g;
                        if (klr0Var instanceof klr0) {
                            return klr0Var.a;
                        }
                        if (klr0Var instanceof jlr0) {
                            return "";
                        }
                        eg.o();
                        return null;
                    }

                    public static final dwn0 h(lik1 lik1Var) {
                        return new dwn0(lik1Var.a, "", false, false, 0, 0, false, (a690) null, (Bundle) null, zvn0.a);
                    }

                    public static tdl0 i() {
                        return new tdl0((byte) 15);
                    }

                    public static lik1 n(jik1 jik1Var) {
                        return jik1Var.getViewUri();
                    }

                    public static final Object o(Object obj) {
                        return obj instanceof nyh ? new m231(((nyh) obj).a) : obj;
                    }

                    public static final lik1 p(zud0 zud0Var, boolean z, boolean z2) {
                        jg4 jg4Var = (jg4) zud0Var.b;
                        if (!jg4Var.b()) {
                            if (z2) {
                                return nik1.n3;
                            }
                            return null;
                        }
                        if (jg4Var.a() && z2) {
                            return nik1.n3;
                        }
                        if (z) {
                            return nik1.o3;
                        }
                        return null;
                    }

                    /* JADX WARN: Code duplicated, block: B:55:0x00a5 A[PHI: r0
                      0x00a5: PHI (r0v11 int) = (r0v5 int), (r0v6 int), (r0v7 int), (r0v8 int) binds: [B:54:0x00a3, B:57:0x00a8, B:60:0x00ac, B:63:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
                    public static final Object q(d030 d030Var, int i, iu30 iu30Var) {
                        int i2;
                        int i3;
                        Object objInvoke;
                        pim0 pim0VarS;
                        rrb0 rrb0VarL;
                        jdo0 jdo0Var;
                        if (!((pim0) d030Var).a.N0) {
                            qf80.c("visitAncestors called on an unattached node");
                        }
                        pim0 pim0Var = ((pim0) d030Var).a.e;
                        hmb0 hmb0VarB = oap1.B(d030Var);
                        loop0: while (true) {
                            i2 = 0;
                            i3 = 1;
                            objInvoke = null;
                            if (hmb0VarB == null) {
                                pim0VarS = null;
                                break;
                            }
                            if ((((pim0) hmb0VarB.e1.g).d & 1024) != 0) {
                                while (pim0Var != null) {
                                    if ((pim0Var.c & 1024) != 0) {
                                        pim0VarS = pim0Var;
                                        bfn0 bfn0Var = null;
                                        while (pim0VarS != null) {
                                            if (pim0VarS instanceof d030) {
                                                break loop0;
                                            }
                                            if ((pim0VarS.c & 1024) != 0 && (pim0VarS instanceof l5t)) {
                                                int i4 = 0;
                                                for (pim0 pim0Var2 = ((l5t) pim0VarS).P0; pim0Var2 != null; pim0Var2 = pim0Var2.f) {
                                                    if ((pim0Var2.c & 1024) != 0) {
                                                        i4++;
                                                        if (i4 == 1) {
                                                            pim0VarS = pim0Var2;
                                                        } else {
                                                            if (bfn0Var == null) {
                                                                bfn0Var = new bfn0(0, new pim0[16]);
                                                            }
                                                            if (pim0VarS != null) {
                                                                bfn0Var.b(pim0VarS);
                                                                pim0VarS = null;
                                                            }
                                                            bfn0Var.b(pim0Var2);
                                                        }
                                                    }
                                                }
                                                if (i4 == 1) {
                                                }
                                            }
                                            pim0VarS = oap1.s(bfn0Var);
                                        }
                                    }
                                    pim0Var = pim0Var.e;
                                }
                            }
                            hmb0VarB = hmb0VarB.v();
                            pim0Var = (hmb0VarB == null || (jdo0Var = hmb0VarB.e1) == null) ? null : (gpd1) jdo0Var.f;
                        }
                        d030 d030Var2 = (d030) pim0VarS;
                        if ((d030Var2 == null || !u890.j(oap1.l(d030Var2), oap1.l(d030Var))) && (rrb0VarL = oap1.l(d030Var)) != null) {
                            int i5 = 5;
                            if (i == 5) {
                                i3 = i5;
                            } else {
                                i5 = 6;
                                if (i == 6) {
                                    i3 = i5;
                                } else {
                                    i5 = 3;
                                    if (i == 3) {
                                        i3 = i5;
                                    } else {
                                        i5 = 4;
                                        if (i == 4) {
                                            i3 = i5;
                                        } else if (i == 1) {
                                            i3 = 2;
                                        } else if (i != 2) {
                                            eg.m("Unsupported direction for beyond bounds layout");
                                        }
                                    }
                                }
                            }
                            if (rrb0VarL.O0.a() <= 0 || !rrb0VarL.O0.c() || !((pim0) rrb0VarL).N0) {
                                return iu30Var.invoke(rrb0.S0);
                            }
                            boolean zI1 = rrb0VarL.I1(i3);
                            srb0 srb0Var = rrb0VarL.O0;
                            int iE = zI1 ? srb0Var.e() : srb0Var.d();
                            p811 p811Var = new p811();
                            p811Var.a = rrb0VarL.P0.d(iE, iE);
                            int iB = rrb0VarL.O0.b() * 2;
                            int iA = rrb0VarL.O0.a();
                            if (iB > iA) {
                                iB = iA;
                            }
                            while (objInvoke == null && rrb0VarL.H1((nrb0) p811Var.a, i3) && i2 < iB) {
                                nrb0 nrb0Var = (nrb0) p811Var.a;
                                int i6 = nrb0Var.a;
                                int i7 = nrb0Var.b;
                                if (rrb0VarL.I1(i3)) {
                                    i7++;
                                } else {
                                    i6--;
                                }
                                nrb0 nrb0VarD = rrb0VarL.P0.d(i6, i7);
                                rrb0VarL.P0.l((nrb0) p811Var.a);
                                p811Var.a = nrb0VarD;
                                i2++;
                                dio1.B(rrb0VarL);
                                objInvoke = iu30Var.invoke(new qrb0(rrb0VarL, p811Var, i3));
                            }
                            rrb0VarL.P0.l((nrb0) p811Var.a);
                            dio1.B(rrb0VarL);
                            return objInvoke;
                        }
                        return null;
                    }

                    public static final Object r(Object obj) {
                        Throwable thA = e331.a(obj);
                        return thA == null ? obj : new nyh(thA, false);
                    }

                    public static final Object s(Object obj) {
                        Throwable thA = e331.a(obj);
                        return thA == null ? obj : new nyh(thA, false);
                    }

                    public static yfu t(lxg lxgVar, daq daqVar) {
                        return new yfu(lxgVar, daqVar, (byte) 22);
                    }

                    public void j(zf30 zf30Var) {
                    }

                    public void k(zf30 zf30Var) {
                    }

                    public void l(zf30 zf30Var) {
                    }

                    public void m(zf30 zf30Var) {
                    }
                }
