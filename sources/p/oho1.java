package p;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.concertcampaignview.v1.CtaType;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class oho1 {
    public static final Object a = new Object();
    public static b180 b;

    public static hi5 A() {
        hi5 hi5Var = new hi5(new zyh(-1, -1, 0, true), false);
        hi5Var.c = false;
        return hi5Var;
    }

    public static final void a(c380 c380Var, uh6 uh6Var, uh6 uh6Var2, c380 c380Var2, vu30 vu30Var, vu30 vu30Var2, String str, String str2, boolean z, float f, float f2, float f3, yj41 yj41Var, boolean z2, boolean z3, boolean z4, Function0 function0, Function0 function1, vu30 vu30Var3, vu30 vu30Var4, vu30 vu30Var5, xu30 xu30Var, qim0 qim0Var, int i, int i2, b0k b0kVar, int i3) {
        h311 h311VarV;
        ng6 ng6Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(238265411);
        int i4 = i3 | (x340Var.g(c380Var) ? 4 : 2) | (x340Var.i(uh6Var) ? 32 : 16) | (x340Var.i(uh6Var2) ? 256 : 128) | (x340Var.g(c380Var2) ? 2048 : 1024) | (x340Var.i(vu30Var) ? 16384 : 8192) | (x340Var.i(vu30Var2) ? 131072 : 65536) | (x340Var.g(str) ? 1048576 : 524288) | (x340Var.g(str2) ? 8388608 : 4194304) | (x340Var.h(z) ? 67108864 : 33554432) | (x340Var.d(f) ? 536870912 : 268435456);
        int i5 = 4144 | (x340Var.d(f2) ? (char) 4 : (char) 2) | (x340Var.d(f3) ? 256 : 128) | (x340Var.i(yj41Var) ? 2048 : 1024) | (x340Var.h(z2) ? 16384 : 8192) | (x340Var.h(z3) ? 131072 : 65536) | (x340Var.h(z4) ? (char) 0 : (char) 0) | (x340Var.i(function1) ? (char) 0 : (char) 0) | (x340Var.i(vu30Var3) ? (char) 0 : (char) 0);
        int i6 = (x340Var.i(vu30Var4) ? 4 : 2) | (x340Var.i(vu30Var5) ? 32 : 16) | (x340Var.i(xu30Var) ? 256 : 128) | (x340Var.g(qim0Var) ? 2048 : 1024) | (x340Var.e(i == 0 ? -1 : l1d.C(i)) ? 16384 : 8192) | (x340Var.e(i2 != 0 ? l1d.C(i2) : -1) ? 131072 : 65536);
        if (x340Var.Y(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 306783379) == 306783378 && (i6 & 74899) == 74898) ? false : true)) {
            if (c380Var.isEmpty()) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    ng6Var = new ng6(c380Var, uh6Var, uh6Var2, c380Var2, vu30Var, vu30Var2, str, str2, z, f, f2, f3, yj41Var, z2, z3, z4, function0, function1, vu30Var3, vu30Var4, vu30Var5, xu30Var, qim0Var, i, i2, i3, (byte) 0);
                }
            } else {
                w2g0.c(qim0Var, (tl3) null, apo.r(-1405068647, new gh6(c380Var, f3, z3, z4, vu30Var3, function0, function1, z2, vu30Var, vu30Var4, i, vu30Var5, z, str, str2, xu30Var, i2, yj41Var, c380Var2, f, f2, uh6Var, uh6Var2, vu30Var2), x340Var), x340Var, ((i6 >> 9) & 14) | 3072, 6);
            }
            h311VarV.d = ng6Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            ng6Var = new ng6(c380Var, uh6Var, uh6Var2, c380Var2, vu30Var, vu30Var2, str, str2, z, f, f2, f3, yj41Var, z2, z3, z4, function0, function1, vu30Var3, vu30Var4, vu30Var5, xu30Var, qim0Var, i, i2, i3, (byte) 1);
            h311VarV.d = ng6Var;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void b(jym jymVar, tyq tyqVar, d0r d0rVar, iu30 iu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1784160373);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(jymVar) : x340Var.i(jymVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(tyqVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(d0rVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            x340Var.b0();
        } else if (jymVar.equals(hym.a)) {
            x340Var.i0(-886160639);
            r(x340Var, 0);
            x340Var.r(false);
        } else if (jymVar.equals(iym.a)) {
            x340Var.i0(-886159121);
            x340Var.r(false);
        } else {
            if (!(jymVar instanceof gym)) {
                throw p3d1.k(x340Var, -886161629, false);
            }
            x340Var.i0(-886158161);
            q((gym) jymVar, tyqVar, d0rVar, iu30Var, x340Var, i2 & 8190);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c2i(i, jymVar, tyqVar, d0rVar, iu30Var, (byte) 16);
        }
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v4 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public static final void c(java.lang.String r39, p.e6r r40, p.iu30 r41, p.r6r r42, boolean r43, int r44, p.xu30 r45, kotlin.jvm.functions.Function0 r46, p.b0k r47, int r48) {
        /*
            Method dump skipped, instruction units count: 925
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.oho1.c(java.lang.String, p.e6r, p.iu30, p.r6r, boolean, int, p.xu30, kotlin.jvm.functions.Function0, p.b0k, int):void");
    }

    public static final void d(qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1648862513);
        j06 j06Var = x340Var.a;
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            long jB = u7h.b(u7h.f, 0.12f, 0.0f, 0.0f, 0.0f, 14);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            tob1 tob1VarB = z95.b(((Boolean) ven0Var.getValue()).booleanValue() ? 1.0f : 0.0f, irn1.o0(CtaType.CTA_WAITLISTED_FIELD_NUMBER, 0, null, 6), (String) null, (iu30) null, x340Var, 0, 28);
            boolean zI = x340Var.i(ven0Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new hj6(ven0Var, (lnm) null, (byte) 3);
                x340Var.s0(objT2);
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT2);
            qim0Var2 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var2, 1.0f);
            boolean zI2 = x340Var.i(tob1VarB);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new pak(tob1VarB, (byte) 5);
                x340Var.s0(objT3);
            }
            qim0 qim0VarC = i541.C(qim0VarD, (iu30) objT3);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarQ = i1p1.q(qim0VarC, er31.b(8.0f));
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarQ);
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
            qim0 qim0VarD2 = u291.d(qim0Var2, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarD2);
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
            qim0 qim0VarH = kx40.h(1.0f, u291.f(qim0Var2, 1.0f), true);
            u5j1 u5j1Var = d4o1.a;
            t1c.a(cwl1.l0(dug.f(qim0VarH, jB, u5j1Var), jB, (hw61) null, 14), x340Var, 0);
            qim0 qim0VarF = dug.f(u291.f(qim0Var2, 1.0f), u7h.b(u7h.b, 0.2f, 0.0f, 0.0f, 0.0f, 14), u5j1Var);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 12.0f, 0.0f, 0.0f, 13);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarB);
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
            qim0 qim0VarF2 = u291.f(qim0Var2, 1.0f);
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            cvx cvxVar4 = cbx.b(x340Var).b;
            qim0 qim0VarB2 = uyn1.B(qim0VarF2, 12.0f, 0.0f, 12.0f, 12.0f, 2);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, qim0VarB2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM4, x340Var, lljVar2);
            x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            qim0 qim0VarH2 = u291.h(new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 12.0f);
            cua cuaVar2 = cbx.b(x340Var).f;
            t1c.a(cwl1.l0(dug.f(i1p1.q(qim0VarH2, er31.b(6.0f)), jB, u5j1Var), jB, (hw61) null, 14), x340Var, 0);
            cvx cvxVar5 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.v(qim0Var2, 16.0f));
            if (0.5f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            qim0 qim0VarH3 = u291.h(new wnb0(0.5f <= Float.MAX_VALUE ? 0.5f : Float.MAX_VALUE, true), 32.0f);
            cua cuaVar3 = cbx.b(x340Var).f;
            t1c.a(cwl1.l0(dug.f(i1p1.q(qim0VarH3, er31.b(16.0f)), jB, u5j1Var), jB, (hw61) null, 14), x340Var, 0);
            x340Var.r(true);
            x340Var.r(true);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wdk(qim0Var2, i, (byte) 17);
        }
    }

    public static final void e(c380 c380Var, p40 p40Var, iu30 iu30Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        p40 p40Var2;
        Function0 function1;
        Object l2wVar;
        boolean z;
        boolean z2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-643802085);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(c380Var) : x340Var.i(c380Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            p40Var2 = p40Var;
            i2 |= x340Var.i(p40Var2) ? 32 : 16;
        } else {
            p40Var2 = p40Var;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function1 = function0;
            i2 |= x340Var.i(function1) ? 2048 : 1024;
        } else {
            function1 = function0;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(qim0Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            es41 es41VarC = l6o1.C(0, 0, 1, x340Var);
            x340Var.i0(-218504055);
            wat watVar = (wat) x340Var.k(t4k.h);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            int iI0 = watVar.i0(8.0f);
            x340Var.r(false);
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = c97.b(0.0f);
                x340Var.s0(objT);
            }
            o95 o95Var = (o95) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            boolean zI = x340Var.i(ven0Var) | x340Var.i(o95Var) | ((i2 & 7168) == 2048);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                z = false;
                l2wVar = new l2w(o95Var, function1, ven0Var, (lnm) null, (byte) 16);
                x340Var.s0(l2wVar);
            } else {
                l2wVar = objT3;
                z = false;
            }
            qxd0.t(rih1.a, x340Var, (vu30) l2wVar);
            qim0 qim0VarT = l6o1.t(u291.f(qim0Var, 1.0f), es41VarC, 14);
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            cvx cvxVar4 = cbx.b(x340Var).b;
            cvx cvxVar5 = cbx.b(x340Var).b;
            qim0 qim0VarA = uyn1.A(qim0VarT, 16.0f, 6.0f, 16.0f, 16.0f);
            gfh0 gfh0VarC = t1c.c(een.d, z);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
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
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            boolean zE = x340Var.e(iI0) | x340Var.i(o95Var);
            Object objT4 = x340Var.T();
            if (zE || objT4 == m4cVar) {
                objT4 = new vq00(iI0, o95Var, (byte) 0);
                x340Var.s0(objT4);
            }
            gfh0 gfh0Var = (gfh0) objT4;
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, nim0.a);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0Var, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            Iterator itN = kk0.n(x340Var, qim0VarE2, lljVar4, 1112181256, c380Var);
            int i3 = 0;
            while (itN.hasNext()) {
                Object next = itN.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p7h.T();
                    throw null;
                }
                vb61 vb61Var = (vb61) next;
                boolean zI2 = x340Var.i(vb61Var) | ((i2 & 896) == 256);
                Object objT5 = x340Var.T();
                if (zI2 || objT5 == m4cVar) {
                    z2 = false;
                    objT5 = new uq00(vb61Var, iu30Var, (byte) 0);
                    x340Var.s0(objT5);
                } else {
                    z2 = false;
                }
                otw.c(p40Var2, new qb61(vb61Var, z2, (iu30) objT5), (qim0) null, (ipb1) null, x340Var, ((i2 >> 3) & 14) | 64, 12);
                p40Var2 = p40Var;
                i3 = i4;
            }
            us71.m(x340Var, false, true, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kyq(c380Var, p40Var, iu30Var, function0, qim0Var, i, (byte) 7);
        }
    }

    public static final void f(wcv wcvVar, String str, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        j2i j2iVarR;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1828938068);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(wcvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 256 : 128;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarN = anm1.N("dsl_item_with_row_id_".concat(wcvVar.c), u291.f(nim0.a, 1.0f));
            uvx uvxVar = new uvx((pgx) null, 3, (tvx) null, (p3v) null, 27);
            if (ihc1.y0(str)) {
                b0kVar3.i0(-60419336);
                b0kVar3.r(false);
                j2iVarR = null;
            } else {
                b0kVar3.i0(-60509577);
                j2iVarR = apo.r(-312362134, new iww0(str, (byte) 14), b0kVar3);
                b0kVar3.r(false);
            }
            j2i j2iVar = j2iVarR;
            boolean z = ((i2 & 896) == 256) | ((i2 & 14) == 4);
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new rl21(iu30Var, wcvVar, (byte) 27);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarN, uvxVar, null, false, null, null, new gbx(z50.c, (Function0) objT), null, null, tfj.a, null, j2iVar, null, null, null, apo.r(-2133800296, new u451(wcvVar, (byte) 13), b0kVar3), b0kVar2, 805306432, 196608, 30140);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kk31(wcvVar, str, iu30Var, i, (byte) 10);
        }
    }

    public static final void g(boolean z, boolean z2, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        dzo1 dzo1Var;
        max maxVar;
        boolean z3;
        max maxVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(719615379);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.h(z2) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(function1) ? 2048 : 1024) | (x340Var.i(qim0Var) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            era eraVar = een.Q0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            max maxVar3 = jax.a;
            dzo1 dzo1Var2 = z50.c;
            if (z) {
                x340Var.i0(1669442539);
                tq60 tq60Var = new tq60(eraVar);
                dzo1Var = dzo1Var2;
                xto1.e(tq60Var, 3, 0L, 0L, x340Var, 48, 12);
                x340Var.r(false);
                z3 = false;
            } else {
                dzo1Var = dzo1Var2;
                x340Var.i0(1669615333);
                gbx gbxVar = new gbx(dzo1Var, function0);
                gdx gdxVarR = yla.r(x340Var);
                idx idxVar = new idx(4);
                if (z2) {
                    x340Var.i0(2132076413);
                    x340Var.r(false);
                    maxVar = maxVar3;
                } else {
                    x340Var.i0(2132078453);
                    max haxVar = new hax(cwl1.o0(x340Var, 2131959541));
                    x340Var.r(false);
                    maxVar = haxVar;
                }
                z3 = false;
                foo1.c(gbxVar, idxVar, null, maxVar, gdxVarR, null, null, null, null, null, q5j.c, x340Var, 0, 48, 1996);
                x340Var = x340Var;
                x340Var.r(false);
            }
            gbx gbxVar2 = new gbx(dzo1Var, function1);
            gdx gdxVarR2 = yla.r(x340Var);
            ldx ldxVar = ldx.c;
            if (z) {
                x340Var.i0(1670350095);
                max haxVar2 = new hax(cwl1.o0(x340Var, 2131959543));
                x340Var.r(z3);
                maxVar2 = haxVar2;
            } else {
                x340Var.i0(1670489967);
                x340Var.r(z3);
                maxVar2 = maxVar3;
            }
            x340 x340Var2 = x340Var;
            foo1.c(gbxVar2, ldxVar, null, maxVar2, gdxVarR2, null, null, null, null, null, q5j.d, x340Var2, 0, 48, 1996);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new knk0(z, z2, function0, function1, qim0Var, i, (byte) 1);
        }
    }

    public static final void h(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(216159008);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            long j = ((xex) ((gmt) zex.a.c).b).r;
            t1c.a(dug.e(qim0Var, v9c.s(p7h.M(new u7h[]{new u7h(j), new u7h(u7h.b(j, 0.0f, 0.0f, 0.0f, 0.0f, 14))}), 0.0f, 0.0f, 14), null, 0.0f, 6), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new one0(qim0Var, i, (byte) 21);
        }
    }

    public static final void i(String str, String str2, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-46814836);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.g(str2) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            era eraVar = een.Q0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            zov0 zov0Var = cbx.b(x340Var).g;
            bmq0.a(Uri.parse(str2), u291.m(nim0Var, 88.0f), hcx.e, (String) null, str, 0L, 0L, false, x340Var, ((i2 << 12) & 57344) | 384, 232);
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = q4r0.V0;
                x340Var.s0(objT);
            }
            uwo1.e(cwl1.n0(2131959544, new Object[]{str}, x340Var), s161.b(qim0VarF, false, (iu30) objT), cbx.d(x340Var).c, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2024);
            uwo1.e(cwl1.o0(x340Var, 2131959549), u291.f(nim0Var, 1.0f), cbx.d(x340Var).e, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2024);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b4((byte) 13, i, str, str2);
        }
    }

    public static final void j(String str, if5 if5Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        qim0 qim0Var3;
        boolean z;
        boolean z2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1413496926);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(if5Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var4 = nim0.a;
            if (str == null && if5Var.a == null && if5Var.b == null && if5Var.c == null && if5Var.d == null) {
                x340Var.i0(1628110980);
                x340Var.r(false);
                qim0Var3 = qim0Var4;
            } else {
                x340Var.i0(1627694867);
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0Var4);
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
                if (str == null) {
                    x340Var.i0(804098781);
                    x340Var.r(false);
                    qim0Var3 = qim0Var4;
                    z2 = false;
                    z = true;
                } else {
                    x340Var.i0(804098782);
                    qim0 qim0VarF = u291.f(qim0Var4, 1.0f);
                    Object objT = x340Var.T();
                    if (objT == fkj0.X) {
                        objT = v160.Y;
                        x340Var.s0(objT);
                    }
                    qim0Var3 = qim0Var4;
                    z = true;
                    z2 = false;
                    jto1.b(s161.b(qim0VarF, true, (iu30) objT), null, null, false, null, null, null, null, null, null, null, null, null, null, null, apo.r(-1341889811, new z3y(str, (byte) 12), x340Var), x340Var, 0, 196608, 32766);
                    x340Var = x340Var;
                    x340Var.r(false);
                }
                cso1.s(if5Var, null, null, null, x340Var, 8 | ((i2 >> 3) & 14), 14);
                x340Var.r(z);
                x340Var.r(z2);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bp50((Object) str, (Object) if5Var, (Object) qim0Var2, i, (byte) 4);
        }
    }

    public static final void k(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1270690821);
        if (x340Var.Y(i & 1, i != 0)) {
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var).b.b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = uyn1.B(nim0Var, f, 0.0f, 0.0f, 0.0f, 14);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            avw0 avw0Var = cbx.b(x340Var).c;
            qim0 qim0VarV = u291.v(nim0Var, 2.0f);
            cvx cvxVar = cbx.b(x340Var).b;
            t1c.a(dug.f(u291.h(qim0VarV, 8.0f), cbx.a(x340Var).a.b.a(), d4o1.a), x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new afm0(i, (byte) 18);
        }
    }

    public static final void l(Function0 function0, b0k b0kVar, int i) {
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-377831233);
        if (x340Var.Y(i & 1, (i & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131951940);
            String strO1 = cwl1.o0(x340Var, 2131951938);
            String strO2 = cwl1.o0(x340Var, 2131951939);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = new tze0(function0, (byte) 19);
                x340Var.s0(objT);
            }
            zgx zgxVar = new zgx(strO2, new gbx(z50.c, (Function0) objT));
            function1 = function0;
            mqo1.d(function1, null, null, strO0, strO1, zgxVar, null, x340Var, 262150, 70);
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tse0(function1, i, (byte) 9);
        }
    }

    public static final void m(hio0 hio0Var, c380 c380Var, hcs hcsVar, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-731890310);
        int i2 = (x340Var.i(hio0Var) ? 4 : 2) | i | (x340Var.i(c380Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var.g(hcsVar) : x340Var.i(hcsVar) ? 256 : 128;
        }
        boolean z = false;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).j;
            yae1 yae1VarQ = d5p1.q(0, x340Var, 1);
            wat watVar = (wat) x340Var.k(t4k.h);
            boolean zG = x340Var.g(c380Var) | x340Var.g(lee1Var) | x340Var.g(watVar);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                int iX0 = (int) watVar.X0(300.0f);
                lee1 lee1VarA = lee1.a(lee1Var, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, new u8e1(2, watVar.L(watVar.X0(16.0f) + ((int) (yae1.a(yae1VarQ, "\u2005", lee1Var, 0, false, 0, 0L, (flb0) null, (xat) null, 1020).c >> 32))), 0L), (wdt0) null, (shc0) null, 0, 16515071);
                Iterator it = c380Var.iterator();
                if (!it.hasNext()) {
                    hhg1.k();
                    return;
                }
                int i3 = 13;
                int i4 = yae1.b(yae1VarQ, t((xho0) it.next()), lee1VarA, 0, false, 4, jjl.b(0, iX0, 0, 0, 13), (flb0) null, (wat) null, (f930) null, 1964).b.f;
                while (it.hasNext()) {
                    int i5 = yae1.b(yae1VarQ, t((xho0) it.next()), lee1VarA, 0, false, 4, jjl.b(0, iX0, 0, 0, i3), (flb0) null, (wat) null, (f930) null, 1964).b.f;
                    if (i4 < i5) {
                        i4 = i5;
                    }
                    i3 = 13;
                }
                objT = ktd.k(watVar.M0((int) (yae1.a(yae1VarQ, ihc1.f1(nhc1.V(i4, "X\n")).toString(), lee1Var, 0, false, 0, 0L, (flb0) null, (xat) null, 1020).c & 4294967295L)) + 16.0f, x340Var);
            }
            qim0 qim0VarH = u291.h(nim0.a, ((p3v) objT).a);
            d36 d36Var = new d36(8.0f, true, new um5(false));
            boolean zI = x340Var.i(c380Var);
            if ((i2 & 896) == 256 || ((i2 & 512) != 0 && x340Var.i(hcsVar))) {
                z = true;
            }
            boolean zI2 = zI | z | x340Var.i(hio0Var);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new mvn0(c380Var, hio0Var, hcsVar, (byte) 2);
                x340Var.s0(objT2);
            }
            ujo1.e(qim0VarH, null, null, d36Var, null, null, false, null, (iu30) objT2, x340Var, 0, 494);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c7e(hio0Var, c380Var, hcsVar, i, (byte) 4);
        }
    }

    public static final void n(hio0 hio0Var, hcs hcsVar, b0k b0kVar, int i) {
        h311 h311VarV;
        jio0 jio0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(568566076);
        int i2 = (x340Var.i(hio0Var) ? 4 : 2) | i | (x340Var.g(hcsVar) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            List list = hio0Var.a;
            if (list.isEmpty()) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    jio0Var = new jio0(hio0Var, hcsVar, i, (byte) 0);
                }
            } else {
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                nim0 nim0Var = nim0.a;
                qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
                k(x340Var, 0);
                if (list.size() == 1) {
                    x340Var.i0(-869594432);
                    xho0 xho0Var = (xho0) o7h.q0(list);
                    boolean zG = x340Var.g(xho0Var.a.a);
                    Object objT = x340Var.T();
                    if (zG || objT == fkj0.X) {
                        objT = (xpw) hcsVar.a.get();
                        x340Var.s0(objT);
                    }
                    otw.c((xpw) objT, new rho0(xho0Var, hio0Var.b, hio0Var.c, hio0Var.d), u291.f(nim0Var, 1.0f), (ipb1) null, x340Var, 0, 8);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-869322283);
                    m(hio0Var, mqo1.A(list), hcsVar, x340Var, ((i2 << 3) & 896) | (i2 & 14));
                    x340Var.r(false);
                }
                x340Var.r(true);
            }
            h311VarV.d = jio0Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            jio0Var = new jio0(hio0Var, hcsVar, i, (byte) 1);
            h311VarV.d = jio0Var;
        }
    }

    public static final void o(rhm0 rhm0Var, iu30 iu30Var, r6r r6rVar, Function0 function0, Function0 function1, iu30 iu30Var2, Function0 function2, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-380332719);
        int i2 = i | (x340Var.g(rhm0Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(r6rVar) ? 256 : 128) | (x340Var.i(function0) ? 2048 : 1024) | (x340Var.i(function1) ? 16384 : 8192) | (x340Var.i(iu30Var2) ? 131072 : 65536) | (x340Var.i(function2) ? 1048576 : 524288) | 12582912;
        if (x340Var.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            j2i j2iVar = q5j.b;
            j2i j2iVarR = apo.r(-1638897718, new pih(rhm0Var, iu30Var, r6rVar, iu30Var2, function2, function0, function1), x340Var);
            qim0 qim0Var3 = nim0.a;
            irn1.u(qim0Var3, j2iVar, null, null, j2iVarR, x340Var, 24630, 12);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n(rhm0Var, iu30Var, r6rVar, function0, function1, iu30Var2, function2, qim0Var2, i, (byte) 18);
        }
    }

    public static final void p(xcv xcvVar, String str, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        hax haxVar;
        j2i j2iVarR;
        String str2 = xcvVar.a;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-793384884);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(xcvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zG = x340Var.g(str2);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = ebv.a(str2) ? wlx.c : grx.c;
                x340Var.s0(objT);
            }
            int i3 = i2;
            fwx fwxVarG = hso1.G((hux) objT, 0L, 0L, x340Var, 8, 30);
            qim0 qim0VarN = anm1.N("dsl_item_with_row_id_" + xcvVar.c + "_curated_" + xcvVar.d, u291.f(nim0.a, 1.0f));
            uvx uvxVar = new uvx((pgx) null, 3, (tvx) null, (p3v) null, 27);
            if (xcvVar.g || xcvVar.e) {
                x340Var.i0(-523146448);
                x340Var.r(false);
                haxVar = jax.a;
            } else {
                x340Var.i0(-523099700);
                haxVar = new hax(cwl1.o0(x340Var, 2131955152));
                x340Var.r(false);
            }
            if (ihc1.y0(str)) {
                x340Var.i0(-522824544);
                x340Var.r(false);
                j2iVarR = null;
            } else {
                x340Var.i0(-522914785);
                j2iVarR = apo.r(-715806079, new iww0(str, (byte) 15), x340Var);
                x340Var.r(false);
            }
            j2i j2iVar = j2iVarR;
            boolean z = ((i3 & 896) == 256) | ((i3 & 14) == 4);
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new rl21(iu30Var, xcvVar, (byte) 28);
                x340Var.s0(objT2);
            }
            jto1.b(qim0VarN, uvxVar, haxVar, false, null, null, new gbx(z50.c, (Function0) objT2), null, null, apo.r(-930034123, new rt11(xcvVar, fwxVarG, (byte) 13), x340Var), null, j2iVar, apo.r(-1684654477, new nv51(xcvVar, (byte) 0), x340Var), null, null, apo.r(23400336, new nv51(xcvVar, (byte) 1), x340Var), x340Var, 805306432, 196992, 26040);
            x340Var = x340Var;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kk31(xcvVar, str, iu30Var, i, (byte) 11);
        }
    }

    public static final void q(gym gymVar, tyq tyqVar, d0r d0rVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(559864646);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(gymVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(tyqVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(d0rVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarN = anm1.N("contributor-sheet-popular-songs-section", u291.f(nim0.a, 1.0f));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            String strO0 = cwl1.o0(x340Var, 2131954585);
            String strO1 = cwl1.o0(x340Var, 2131954583);
            boolean z = ((i2 & 7168) == 2048) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new sqm(iu30Var, gymVar, (byte) 6);
                x340Var.s0(objT);
            }
            tho1.f(strO0, strO1, (Function0) objT, null, cwl1.o0(x340Var, 2131954584), x340Var, 0, 8);
            kiv kivVar = gaa1.a;
            uwr uwrVar = cbx.a;
            mod.b(p3d1.o(((yex) zex.a.d).e, kivVar), apo.r(760405456, new mzj(gymVar, tyqVar, d0rVar, (byte) 26), x340Var), x340Var, 56);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c2i(i, gymVar, tyqVar, d0rVar, iu30Var, (byte) 17);
        }
    }

    public static final void r(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(580185116);
        if (x340Var.Y(i & 1, i != 0)) {
            qim0 qim0VarN = anm1.N("contributor-sheet-popular-songs-skeleton", u291.f(nim0.a, 1.0f));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            tho1.f(cwl1.o0(x340Var, 2131954585), cwl1.o0(x340Var, 2131954583), null, null, null, x340Var, 384, 24);
            x340Var.i0(229287130);
            for (int i2 = 0; i2 < 10; i2++) {
                cev0.h(0, 3, x340Var, null, false);
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sqk((byte) 8, i, false);
        }
    }

    public static final void s(boolean z, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-500347002);
        int i2 = (x340Var.h(z) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            eth.a(Boolean.valueOf(z), u291.r(nim0.a, 24.0f), (ni20) null, "SelectionCrossfade", tfj.b, x340Var, (i2 & 14) | 27648, 4);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ov51((byte) 0, i, z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    public static final af5 t(xho0 xho0Var) {
        ye5 ye5Var = new ye5();
        s2o s2oVar = xho0Var.b;
        String str = xho0Var.c;
        cvm cvmVar = xho0Var.a.g;
        String str2 = s2oVar.a;
        if (str2 != null) {
            ye5Var.g("\u2066" + str2 + "\u2069");
        }
        int iOrdinal = cvmVar.ordinal();
        if (iOrdinal == 0) {
            if (str != null) {
                ye5Var.g(" • ");
            }
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                eg.o();
                return null;
            }
            if (str != null) {
                ye5Var.g(" • ");
            }
        } else {
            ye5Var.g("\u2005  \u2005");
        }
        if (str != null) {
            ye5Var.g("\u2066" + str + "\u2069");
        }
        ye5Var.g(" • ");
        String strP = iho1.p(xho0Var);
        ye5Var.g("\u2066");
        if (cvmVar == cvm.b) {
            zg90.a(ye5Var, strP);
        } else {
            ye5Var.g(strP);
        }
        ye5Var.g("\u2069");
        return ye5Var.p();
    }

    public static final int u(Context context, int i) {
        return context.getResources().getDimensionPixelSize(i);
    }

    public static final String x(Double d, b0k b0kVar) {
        if (d == null) {
            x340 x340Var = (x340) b0kVar;
            return x0d.k(x340Var, -133885537, 2131962188, x340Var, false);
        }
        if (d.doubleValue() >= 1024.0d) {
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.i0(-133882683);
            String strN0 = cwl1.n0(2131962189, new Object[]{Double.valueOf(d.doubleValue() / 1024.0d)}, x340Var2);
            x340Var2.r(false);
            return strN0;
        }
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.i0(-133878109);
        String strN1 = cwl1.n0(2131962190, new Object[]{d}, x340Var3);
        x340Var3.r(false);
        return strN1;
    }

    public static boolean y(j4e j4eVar) {
        if (j4e.c.equals(j4eVar)) {
            return true;
        }
        String str = j4eVar.a;
        return (str == null || str.length() == 0) && j4eVar.b == null;
    }

    public static final void z() {
        throw new UnsupportedOperationException();
    }

    public abstract String v();

    public abstract String w();
}
