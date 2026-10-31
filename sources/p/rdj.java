package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.wrapped.v1.proto.Paragraph;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rdj extends hab0 implements bv30 {
    public static final rdj N0;
    public static final rdj O0;
    public static final rdj P0;
    public static final rdj Q0;
    public static final rdj R0;
    public static final rdj S0;
    public static final rdj T0;
    public static final rdj U0;
    public static final rdj V0;
    public static final rdj W0;
    public static final rdj X;
    public static final rdj X0;
    public static final rdj Y;
    public static final rdj Y0;
    public static final rdj Z;
    public static final rdj Z0;
    public static final rdj a1;
    public static final rdj b;
    public static final rdj b1;
    public static final rdj c;
    public static final rdj c1;
    public static final rdj d;
    public static final rdj d1;
    public static final rdj e;
    public static final rdj e1;
    public static final rdj f;
    public static final rdj g;
    public static final rdj h;
    public static final rdj i;
    public static final rdj t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 5;
        b = new rdj(i2, (byte) 0);
        c = new rdj(i2, (byte) 1);
        d = new rdj(i2, (byte) 2);
        e = new rdj(i2, (byte) 3);
        f = new rdj(i2, (byte) 4);
        g = new rdj(i2, (byte) 5);
        h = new rdj(i2, (byte) 6);
        i = new rdj(i2, (byte) 7);
        t = new rdj(i2, (byte) 8);
        X = new rdj(i2, (byte) 9);
        Y = new rdj(i2, (byte) 10);
        Z = new rdj(i2, (byte) 11);
        N0 = new rdj(i2, (byte) 12);
        O0 = new rdj(i2, (byte) 13);
        P0 = new rdj(i2, (byte) 14);
        Q0 = new rdj(i2, (byte) 15);
        R0 = new rdj(i2, (byte) 16);
        S0 = new rdj(i2, (byte) 17);
        T0 = new rdj(i2, (byte) 18);
        U0 = new rdj(i2, (byte) 19);
        V0 = new rdj(i2, (byte) 20);
        W0 = new rdj(i2, (byte) 21);
        X0 = new rdj(i2, (byte) 22);
        Y0 = new rdj(i2, (byte) 23);
        Z0 = new rdj(i2, (byte) 24);
        a1 = new rdj(i2, (byte) 25);
        b1 = new rdj(i2, (byte) 26);
        c1 = new rdj(i2, (byte) 27);
        d1 = new rdj(i2, (byte) 28);
        e1 = new rdj(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rdj(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0200 A[PHI: r3
      0x0200: PHI (r3v18 p.iu30) = (r3v16 p.iu30), (r3v19 p.iu30) binds: [B:23:0x01fe, B:19:0x01f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x020b  */
    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var;
        boolean z;
        Object objT;
        iu30 iu30Var2 = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        String strO0 = cwl1.o0(x340Var, 2131960001);
        nim0 nim0Var = nim0.a;
        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var).b;
        cvx cvxVar2 = cbx.b(x340Var).b;
        qim0 qim0VarY = uyn1.y(qim0VarF, 16.0f, 8.0f);
        gfh0 gfh0VarC = t1c.c(een.d, false);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        boolean z2 = x340Var3.S;
        n4k n4kVar = hmb0.t1;
        if (z2) {
            x340Var3.l(n4kVar);
        } else {
            x340Var3.v0();
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
        qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
        mta mtaVar = cbx.b(x340Var).d;
        qim0 qim0VarJ = u291.j(48.0f, 0.0f, 2, qim0VarF2);
        cr31 cr31Var = er31.a;
        qim0 qim0VarQ = i1p1.q(qim0VarJ, cr31Var);
        long jA = cbx.a(x340Var).a.b.a();
        avw0 avw0Var = cbx.b(x340Var).c;
        qim0 qim0VarF3 = dug.f(d1u.E(1.0f, jA, qim0VarQ, cr31Var), cbx.a(x340Var).a.a.a(), d4o1.a);
        gfh0 gfh0VarC2 = t1c.c(een.g, false);
        int iHashCode2 = Long.hashCode(x340Var3.T);
        xos0 xos0VarM2 = x340Var3.m();
        qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF3);
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(n4kVar);
        } else {
            x340Var3.v0();
        }
        nko1.H(gfh0VarC2, x340Var, lljVar);
        nko1.H(xos0VarM2, x340Var, lljVar2);
        i3a.l(iHashCode2, x340Var, lljVar3, x340Var);
        nko1.H(qim0VarE2, x340Var, lljVar4);
        y7e1 y7e1VarD = c4p1.D(0, 3, (String) null, x340Var);
        qim0 qim0VarF4 = u291.f(nim0Var, 1.0f);
        long j = cbx.a(x340Var).b.a;
        long j2 = cbx.a(x340Var).b.a;
        long j3 = cbx.a(x340Var).b.d;
        long j4 = cbx.a(x340Var).b.a;
        long j5 = ((vex) zex.a.e).a;
        zxx zxxVar = new zxx(j, j2, j4, j3, j5, j5, cbx.a(x340Var).b.c, 0L, 896);
        cvx cvxVar3 = cbx.b(x340Var).b;
        cvx cvxVar4 = cbx.b(x340Var).b;
        rwo1.b(y7e1VarD, qim0VarF4, (max) null, strO0, sej.a, (vu30) null, true, false, (dk80) null, cbx.d(x340Var).g, (kua0) null, (yta0) null, d6e1.b, (vu30) null, (idn0) null, (uwg) null, (es41) null, new zzq0(16.0f, 8.0f, 16.0f, 8.0f), 0.0f, false, zxxVar, x340Var, 1597440, 0, 912804);
        qim0 qim0VarB = h2c.a.b(nim0Var);
        boolean zG = x340Var3.g(strO0);
        Object objT2 = x340Var3.T();
        if (zG || objT2 == m4cVar) {
            objT2 = new irf(strO0, (byte) 26);
            x340Var3.s0(objT2);
        }
        qim0 qim0VarB2 = s161.b(qim0VarB, false, (iu30) objT2);
        if (((iIntValue & 896) ^ 384) > 256) {
            iu30Var = iu30Var2;
            if (x340Var3.g(iu30Var)) {
                z = true;
            }
            objT = x340Var3.T();
            if (z || objT == m4cVar) {
                objT = new hdj(iu30Var, (byte) 13);
                x340Var3.s0(objT);
            }
            t1c.a(bin.x(qim0VarB2, false, strO0, (pm31) null, (idn0) null, (Function0) objT, 13), x340Var, 0);
            x340Var3.r(true);
            x340Var3.r(true);
            return rih1.a;
        }
        iu30Var = iu30Var2;
        if ((iIntValue & 384) == 256) {
            z = true;
        } else {
            z = false;
        }
        objT = x340Var3.T();
        if (z) {
            objT = new hdj(iu30Var, (byte) 13);
            x340Var3.s0(objT);
        } else {
            objT = new hdj(iu30Var, (byte) 13);
            x340Var3.s0(objT);
        }
        t1c.a(bin.x(qim0VarB2, false, strO0, (pm31) null, (idn0) null, (Function0) objT, 13), x340Var, 0);
        x340Var3.r(true);
        x340Var3.r(true);
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        rb51 rb51Var = (rb51) obj2;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        String str = rb51Var.a;
        y7e1 y7e1VarD = c4p1.D(0, 2, str, x340Var);
        int i2 = (iIntValue & 112) ^ 48;
        x340 x340Var2 = x340Var;
        boolean zI = x340Var2.i(y7e1VarD) | ((i2 > 32 && x340Var.g(rb51Var)) || (iIntValue & 48) == 32);
        Object objT = x340Var2.T();
        if (zI || objT == m4cVar) {
            objT = new zti(rb51Var, y7e1VarD, (lnm) null, (byte) 1);
            x340Var2.s0(objT);
        }
        qxd0.t(str, x340Var2, (vu30) objT);
        boolean zI2 = x340Var2.i(y7e1VarD) | ((i2 > 32 && x340Var2.g(rb51Var)) || (iIntValue & 48) == 32);
        Object objT2 = x340Var2.T();
        if (zI2 || objT2 == m4cVar) {
            objT2 = new bag(y7e1VarD, rb51Var, (lnm) null, (byte) 17);
            x340Var2.s0(objT2);
        }
        qxd0.t(y7e1VarD, x340Var2, (vu30) objT2);
        String str2 = rb51Var.e;
        boolean zI3 = x340Var2.i(y7e1VarD) | ((i2 > 32 && x340Var2.g(rb51Var)) || (iIntValue & 48) == 32);
        Object objT3 = x340Var2.T();
        if (zI3 || objT3 == m4cVar) {
            objT3 = new dfi((Object) y7e1VarD, (Object) rb51Var, (byte) 21);
            x340Var2.s0(objT3);
        }
        d4o1.e(y7e1VarD, str2, (Function0) objT3, rb51Var.d, x340Var2, 0);
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Function0 function0;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        ig51 ig51Var = (ig51) obj2;
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        boolean z = false;
        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0Var = nim0.a;
        qim0 qim0VarE = zr7.E(x340Var, qim0Var);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        boolean z2 = x340Var3.S;
        Function0 function1 = hmb0.t1;
        if (z2) {
            x340Var3.l(function1);
        } else {
            x340Var3.v0();
        }
        nko1.H(mbhVarA, x340Var, lljVar4);
        nko1.H(xos0VarM, x340Var, lljVar3);
        nko1.H(Integer.valueOf(iHashCode), x340Var, lljVar2);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, lljVar);
        x340Var3.i0(-762740247);
        for (hg51 hg51Var : ig51Var.b) {
            xpw xpwVar = hg51Var.a;
            int i2 = hg51Var.c;
            x340Var3.f0(-544383770, x340Var3.K(xpwVar, hg51Var.b));
            if (i2 > 0) {
                x340Var3.i0(304045166);
                qim0 qim0VarZ = uyn1.z(((wat) x340Var3.k(t4k.h)).M0(i2), 0.0f, 2, qim0Var);
                gfh0 gfh0VarC = t1c.c(een.d, z);
                int iHashCode2 = Long.hashCode(x340Var3.T);
                xos0 xos0VarM2 = x340Var3.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ);
                hzj.A.getClass();
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(function1);
                } else {
                    x340Var3.v0();
                }
                nko1.H(gfh0VarC, x340Var, lljVar4);
                nko1.H(xos0VarM2, x340Var, lljVar3);
                nko1.H(Integer.valueOf(iHashCode2), x340Var, lljVar2);
                nko1.F(x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar);
                function0 = function1;
                otw.c(hg51Var.a, hg51Var.b, (qim0) null, (ipb1) null, x340Var, 0, 12);
                x340Var3.r(true);
                z = false;
                x340Var3.r(false);
            } else {
                function0 = function1;
                x340Var3.i0(304338147);
                otw.c(hg51Var.a, hg51Var.b, (qim0) null, (ipb1) null, x340Var, 0, 12);
                x340Var3.r(z);
            }
            x340Var3.r(z);
            function1 = function0;
            qim0Var = qim0Var;
        }
        x340Var3.r(z);
        x340Var3.r(true);
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        zg51 zg51Var = (zg51) obj2;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            iIntValue |= x340Var.g(zg51Var) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 1041) != 1040)) {
            y4o1.k(0, zg51Var.a, x340Var2, (qim0) null);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ch51 ch51Var = (ch51) obj2;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            iIntValue |= x340Var.g(ch51Var) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 1041) != 1040)) {
            String str = ch51Var.a;
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var2).e;
            long j = cbx.a(x340Var2).b.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, nim0.a);
            Object objT = x340Var2.T();
            if (objT == fkj0.X) {
                objT = oqi.W0;
                x340Var2.s0(objT);
            }
            uwo1.e(str, s161.b(qim0VarZ, false, (iu30) objT), lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2032);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        lee1 lee1Var;
        long j;
        uwr uwrVar = cbx.a;
        rh51 rh51Var = (rh51) obj2;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        boolean z = rh51Var.b;
        if ((iIntValue & 48) == 0) {
            iIntValue |= x340Var.g(rh51Var) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 1041) != 1040)) {
            String str = rh51Var.a;
            if (z) {
                x340Var2.i0(917786832);
                lee1Var = cbx.d(x340Var2).h;
            } else {
                x340Var2.i0(917788043);
                lee1Var = cbx.d(x340Var2).j;
            }
            x340Var2.r(false);
            lee1 lee1Var2 = lee1Var;
            if (z) {
                x340Var2.i0(917790214);
                j = cbx.a(x340Var2).b.a;
            } else {
                x340Var2.i0(917791209);
                j = cbx.a(x340Var2).b.b;
            }
            x340Var2.r(false);
            long j2 = j;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarB = uyn1.B(nim0.a, 0.0f, 0.0f, 0.0f, 16.0f, 7);
            Object objT = x340Var2.T();
            if (objT == fkj0.X) {
                objT = oqi.X0;
                x340Var2.s0(objT);
            }
            uwo1.e(str, s161.b(qim0VarB, false, (iu30) objT), lee1Var2, j2, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2032);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x024e A[PHI: r6
      0x024e: PHI (r6v16 p.iu30) = (r6v13 p.iu30), (r6v17 p.iu30) binds: [B:45:0x024c, B:41:0x0245] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x025b  */
    /* JADX WARN: Code duplicated, block: B:55:0x026d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0298  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v9 */
    private final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        String str;
        llj lljVar;
        Function0 function0;
        vu30 vu30Var;
        x340 x340Var;
        vu30 vu30Var2;
        pl3 pl3Var;
        ?? r0;
        iu30 iu30Var;
        ?? r5;
        Object objT;
        Function0 function1;
        qh51 qh51Var = (qh51) obj2;
        iu30 iu30Var2 = (iu30) obj3;
        x340 x340Var2 = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        String str2 = qh51Var.c;
        String str3 = qh51Var.d;
        boolean z = str3 != null && str2 == null;
        nim0 nim0Var = nim0.a;
        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
        pl3 pl3Var2 = een.N0;
        jw31 jw31VarA = ew31.a(h36.a, pl3Var2, x340Var2, 0);
        x340 x340Var3 = x340Var2;
        int iHashCode = Long.hashCode(x340Var3.T);
        xos0 xos0VarM = x340Var3.m();
        qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
        hzj.A.getClass();
        x340 x340Var4 = x340Var2;
        if (x340Var4.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var4.m0();
        boolean z2 = x340Var4.S;
        Function0 function2 = hmb0.t1;
        if (z2) {
            x340Var4.l(function2);
        } else {
            x340Var4.v0();
        }
        llj lljVar2 = y580.O0;
        nko1.H(jw31VarA, x340Var2, lljVar2);
        vu30 vu30Var3 = y580.N0;
        nko1.H(xos0VarM, x340Var2, vu30Var3);
        Integer numValueOf = Integer.valueOf(iHashCode);
        llj lljVar3 = y580.R0;
        nko1.H(numValueOf, x340Var2, lljVar3);
        nko1.F(x340Var2);
        vu30 vu30Var4 = y580.Y;
        nko1.H(qim0VarE, x340Var2, vu30Var4);
        wnb0 wnb0Var = new wnb0(1.0f, true);
        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
        int iHashCode2 = Long.hashCode(x340Var4.T);
        xos0 xos0VarM2 = x340Var4.m();
        qim0 qim0VarE2 = zr7.E(x340Var2, wnb0Var);
        x340Var4.m0();
        if (x340Var4.S) {
            x340Var4.l(function2);
        } else {
            x340Var4.v0();
        }
        nko1.H(mbhVarA, x340Var2, lljVar2);
        nko1.H(xos0VarM2, x340Var2, vu30Var3);
        i3a.l(iHashCode2, x340Var2, lljVar3, x340Var2);
        nko1.H(qim0VarE2, x340Var2, vu30Var4);
        String str4 = qh51Var.b;
        if (str4 == null || ihc1.y0(str4)) {
            str = str3;
            lljVar = lljVar3;
            function0 = function2;
            vu30Var = vu30Var3;
            x340Var = x340Var4;
            vu30Var2 = vu30Var4;
            pl3Var = pl3Var2;
            r0 = 0;
            x340Var.i0(1433892525);
            x340Var.r(false);
        } else {
            x340Var4.i0(1433593344);
            uwr uwrVar = cbx.a;
            str = str3;
            pl3Var = pl3Var2;
            lljVar = lljVar3;
            vu30Var = vu30Var3;
            function0 = function2;
            x340Var = x340Var4;
            vu30Var2 = vu30Var4;
            r0 = 0;
            uwo1.e(qh51Var.b, uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 2.0f, 7), cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var2, 0, 0, 1712);
            x340Var.r(false);
        }
        uwr uwrVar2 = cbx.a;
        cvx cvxVar = cbx.b(x340Var2).b;
        jw31 jw31VarA2 = ew31.a(new d36(6.0f, true, new um5((boolean) r0)), pl3Var, x340Var2, (int) r0);
        int iHashCode3 = Long.hashCode(x340Var.T);
        xos0 xos0VarM3 = x340Var.m();
        qim0 qim0VarE3 = zr7.E(x340Var2, nim0Var);
        x340Var.m0();
        if (x340Var.S) {
            x340Var.l(function0);
        } else {
            x340Var.v0();
        }
        nko1.H(jw31VarA2, x340Var2, lljVar2);
        nko1.H(xos0VarM3, x340Var2, vu30Var);
        i3a.l(iHashCode3, x340Var2, lljVar, x340Var2);
        nko1.H(qim0VarE3, x340Var2, vu30Var2);
        lee1 lee1Var = cbx.d(x340Var2).e;
        long j = cbx.a(x340Var2).b.a;
        String str5 = qh51Var.a;
        cjc0 cjc0Var = new cjc0(2);
        Object objT2 = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT2 == m4cVar) {
            objT2 = oqi.Y0;
            x340Var.s0(objT2);
        }
        uwo1.e(str5, s161.b(nim0Var, (boolean) r0, (iu30) objT2), lee1Var, j, (a0e1) null, (iu30) null, 0, false, cjc0Var, 0, (qx8) null, x340Var2, 0, 0, 1776);
        x340Var.i0(69181065);
        x340Var.r((boolean) r0);
        x340Var.r(true);
        x340Var.r(true);
        if (str == null) {
            x340Var.i0(1104198118);
            x340Var.r((boolean) r0);
        } else {
            x340Var.i0(1104198119);
            if (z) {
                x340Var.i0(-70111638);
                if (((iIntValue & 896) ^ 384) > 256) {
                    iu30Var = iu30Var2;
                    if (x340Var.g(iu30Var)) {
                        r5 = 1;
                    }
                    objT = x340Var.T();
                    if (r5 == 0 || objT == m4cVar) {
                        objT = new hdj(iu30Var, (byte) 16);
                        x340Var.s0(objT);
                    }
                    function1 = (Function0) objT;
                    if (!ihc1.y0("Navigation action")) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    wro1.h(new gbx(new y50("Navigation action"), function1), ldx.c, anm1.N("heading-section-icon-button", nim0Var), (max) null, yla.s(x340Var2), (vzq0) null, false, (idn0) null, (ga80) null, kfj.a, x340Var2, 0, 6, 984);
                    x340Var.r((boolean) r0);
                } else {
                    iu30Var = iu30Var2;
                }
                if ((iIntValue & 384) == 256) {
                    r5 = 1;
                } else {
                    r5 = r0;
                }
                objT = x340Var.T();
                if (r5 == 0) {
                    objT = new hdj(iu30Var, (byte) 16);
                    x340Var.s0(objT);
                } else {
                    objT = new hdj(iu30Var, (byte) 16);
                    x340Var.s0(objT);
                }
                function1 = (Function0) objT;
                if (!ihc1.y0("Navigation action")) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                wro1.h(new gbx(new y50("Navigation action"), function1), ldx.c, anm1.N("heading-section-icon-button", nim0Var), (max) null, yla.s(x340Var2), (vzq0) null, false, (idn0) null, (ga80) null, kfj.a, x340Var2, 0, 6, 984);
                x340Var.r((boolean) r0);
            } else if (str2 != null) {
                x340Var.i0(2122259913);
                ?? r6 = ((((
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: TERNARY (r5v10 'r6' ??) = ((((wrap int:0x02ae: ARITH (wrap int:0x02ac: ARITH (r20v0 int) & (896 int) A[WRAPPED] (LINE:685)) ^ (384 int) A[WRAPPED] (LINE:687)) <= (256 int) || !((wrap boolean:0x02b2: INVOKE (r1v3 'x340Var' p.x340), (r1v1 'iu30Var2' p.iu30) VIRTUAL call: p.x340.g(java.lang.Object):boolean A[WRAPPED] (LINE:691)) == true)) && (wrap int:0x02b8: ARITH (r20v0 int) & (384 int) A[WRAPPED] (LINE:697)) != (256 int))) ? (r0v5 'r0' ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) : (1 ??[boolean, int, float, short, byte, char]) in method: p.rdj.i(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object, file: /workspace/spotify-analysis/dex-input/classes7.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
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
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r20v0 int
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 817
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.rdj.i(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            private final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
                float f2;
                si51 si51Var = (si51) obj2;
                x340 x340Var = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= x340Var.g(si51Var) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 1041) != 1040)) {
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    int iC = l1d.C(si51Var.b);
                    if (iC == 0) {
                        x340Var2.i0(2055763911);
                        cvx cvxVar3 = cbx.b(x340Var2).b;
                        x340Var2.r(false);
                        f2 = 12.0f;
                    } else {
                        if (iC != 1) {
                            throw p3d1.k(x340Var2, 2055760878, false);
                        }
                        x340Var2.i0(2055766504);
                        cvx cvxVar4 = cbx.b(x340Var2).b;
                        x340Var2.r(false);
                        f2 = 8.0f;
                    }
                    qim0 qim0VarB = uyn1.B(nim0.a, 16.0f, 0.0f, 16.0f, f2, 2);
                    Object objT = x340Var2.T();
                    if (objT == fkj0.X) {
                        objT = oqi.Z0;
                        x340Var2.s0(objT);
                    }
                    uwo1.e(si51Var.a, s161.b(qim0VarB, false, (iu30) objT), cbx.d(x340Var2).g, cbx.a(x340Var2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2032);
                } else {
                    x340Var2.b0();
                }
                return rih1.a;
            }

            private final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                ri51 ri51Var = (ri51) obj2;
                x340 x340Var = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= x340Var.g(ri51Var) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 1041) != 1040)) {
                    wxo1.a(0, ri51Var.a, x340Var2, (qim0) null);
                } else {
                    x340Var2.b0();
                }
                return rih1.a;
            }

            private final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                ck51 ck51Var = (ck51) obj2;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                gra graVar = een.h;
                qim0 qim0VarF = u291.f(nim0.a, 1.0f);
                gfh0 gfh0VarC = t1c.c(graVar, false);
                x340 x340Var2 = x340Var;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
                hzj.A.getClass();
                x340 x340Var3 = x340Var;
                if (x340Var3.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(hmb0.t1);
                } else {
                    x340Var3.v0();
                }
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                boolean z = ((((iIntValue & 896) ^ 384) > 256 && x340Var3.g(iu30Var)) || (iIntValue & 384) == 256) | ((((iIntValue & 112) ^ 48) > 32 && x340Var3.g(ck51Var)) || (iIntValue & 48) == 32);
                Object objT = x340Var3.T();
                if (z || objT == fkj0.X) {
                    objT = new dfi((Object) iu30Var, (Object) ck51Var, (byte) 22);
                    x340Var3.s0(objT);
                }
                foo1.c(new gbx(z50.c, (Function0) objT), jdx.c, (qim0) null, (max) null, yla.s(x340Var), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(441505643, new l8i(ck51Var, (byte) 27), x340Var), x340Var, 0, 48, 2012);
                x340Var3.r(true);
                return rih1.a;
            }

            private final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                String strO0 = cwl1.o0(x340Var, 2131952985);
                qim0 qim0VarF = u291.f(nim0.a, 1.0f);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                boolean z = true;
                zzq0 zzq0VarH = uyn1.h(1, 0.0f, 12.0f);
                cvx cvxVar2 = cbx.b(x340Var).b;
                cvx cvxVar3 = cbx.b(x340Var).b;
                cvx cvxVar4 = cbx.b(x340Var).b;
                cvx cvxVar5 = cbx.b(x340Var).b;
                uvx uvxVar = new uvx(0, (pgx) null, 1, zzq0VarH, new zzq0(16.0f, 8.0f, 16.0f, 8.0f), (tvx) null, (hw61) null, 0, (p3v) null, 483);
                if ((((iIntValue & 896) ^ 384) <= 256 || !x340Var.g(iu30Var)) && (iIntValue & 384) != 256) {
                    z = false;
                }
                x340 x340Var2 = x340Var;
                Object objT = x340Var2.T();
                if (z || objT == fkj0.X) {
                    objT = new hdj(iu30Var, (byte) 18);
                    x340Var2.s0(objT);
                }
                Function0 function0 = (Function0) objT;
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                jto1.b(qim0VarF, uvxVar, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(strO0), function0), (gbx) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, pfj.a, (xu30) null, (xu30) null, apo.r(871304389, new kaf(strO0, (byte) 13), x340Var2), x340Var2, 64, 196992, 28604);
                return rih1.a;
            }

            private final Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
                x340 x340Var2 = x340Var;
                Object objT = x340Var2.T();
                if (z || objT == fkj0.X) {
                    objT = new hdj(iu30Var, (byte) 19);
                    x340Var2.s0(objT);
                }
                foo1.c(new gbx(z50.c, (Function0) objT), jdx.c, anm1.N("SeeMoreButton.Button", nim0.a), (max) null, yla.s(x340Var2), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, qfj.a, x340Var2, 0, 48, 2008);
                return rih1.a;
            }

            private final Object p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                sk51 sk51Var = (sk51) obj2;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                Paragraph paragraph = sk51Var.a;
                Paragraph paragraph2 = sk51Var.b;
                boolean z = sk51Var.c;
                boolean z2 = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
                x340 x340Var2 = x340Var;
                Object objT = x340Var2.T();
                if (z2 || objT == fkj0.X) {
                    objT = new hdj(iu30Var, (byte) 20);
                    x340Var2.s0(objT);
                }
                zj01.a(paragraph, paragraph2, z, (Function0) objT, x340Var2, 0, 0);
                return rih1.a;
            }

            public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                hax haxVar;
                boolean z;
                String strK;
                jax haxVar2;
                int i2;
                byte b2 = this.a;
                n4k n4kVar = hmb0.t1;
                z50 z50Var = z50.c;
                nim0 nim0Var = nim0.a;
                boolean z2 = true;
                rih1 rih1Var = rih1.a;
                switch (b2) {
                    case 0:
                        boolean z3 = true;
                        pn21 pn21Var = (pn21) obj2;
                        iu30 iu30Var = (iu30) obj3;
                        x340 x340Var = (b0k) obj4;
                        int iIntValue = ((Number) obj5).intValue();
                        String strO0 = cwl1.o0(x340Var, 2131952288);
                        if ((((iIntValue & 896) ^ 384) <= 256 || !x340Var.g(iu30Var)) && (iIntValue & 384) != 256) {
                            z3 = false;
                        }
                        x340 x340Var2 = x340Var;
                        Object objT = x340Var2.T();
                        if (z3 || objT == fkj0.X) {
                            objT = new hdj(iu30Var, (byte) 3);
                            x340Var2.s0(objT);
                        }
                        Function0 function0 = (Function0) objT;
                        if (ihc1.y0(strO0)) {
                            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                            return null;
                        }
                        gbx gbxVar = new gbx(new y50(strO0), function0);
                        ldx ldxVar = ldx.c;
                        if (pn21Var.a) {
                            x340Var2.i0(1982533775);
                            haxVar = new hax(cwl1.o0(x340Var2, 2131952293));
                            x340Var2.r(false);
                        } else {
                            x340Var2.i0(1982684218);
                            x340Var2.r(false);
                            haxVar = jax.a;
                        }
                        foo1.c(gbxVar, ldxVar, (qim0) null, haxVar, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1860780765, new l8i(pn21Var, (byte) 25), x340Var2), x340Var2, 0, 48, 2028);
                        return rih1Var;
                    case 1:
                        wx21 wx21Var = (wx21) obj2;
                        iu30 iu30Var2 = (iu30) obj3;
                        x340 x340Var3 = (b0k) obj4;
                        int iIntValue2 = ((Number) obj5).intValue();
                        boolean z4 = ((((iIntValue2 & 896) ^ 384) > 256 && x340Var3.g(iu30Var2)) || (iIntValue2 & 384) == 256) | ((((iIntValue2 & 112) ^ 48) > 32 && x340Var3.g(wx21Var)) || (iIntValue2 & 48) == 32);
                        x340 x340Var4 = x340Var3;
                        Object objT2 = x340Var4.T();
                        if (z4 || objT2 == fkj0.X) {
                            objT2 = new puh(wx21Var, iu30Var2, (byte) 15);
                            x340Var4.s0(objT2);
                        }
                        iu30 iu30Var3 = (iu30) objT2;
                        qim0 qim0VarN = anm1.N("parental_hub_entity_row_respond_to_request_trailing_action", nim0Var);
                        gfh0 gfh0VarC = t1c.c(een.d, false);
                        int iHashCode = Long.hashCode(x340Var4.T);
                        xos0 xos0VarM = x340Var4.m();
                        qim0 qim0VarE = zr7.E(x340Var4, qim0VarN);
                        hzj.A.getClass();
                        if (x340Var4.a == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var4.m0();
                        if (x340Var4.S) {
                            x340Var4.l(n4kVar);
                        } else {
                            x340Var4.v0();
                        }
                        nko1.H(gfh0VarC, x340Var4, y580.O0);
                        nko1.H(xos0VarM, x340Var4, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode), x340Var4, y580.R0);
                        nko1.F(x340Var4);
                        nko1.H(qim0VarE, x340Var4, y580.Y);
                        if (wx21Var.c) {
                            x340Var4.i0(1654980267);
                            z47.i(x340Var4, 0);
                            x340Var4.r(false);
                        } else {
                            x340Var4.i0(1655027728);
                            z47.o(wx21Var.b, iu30Var3, x340Var4, 0);
                            x340Var4.r(false);
                        }
                        x340Var4.r(true);
                        return rih1Var;
                    case 2:
                        x731 x731Var = (x731) obj2;
                        iu30 iu30Var4 = (iu30) obj3;
                        x340 x340Var5 = (b0k) obj4;
                        int iIntValue3 = ((Number) obj5).intValue();
                        vnr0 vnr0Var = x731Var.b;
                        String str = x731Var.c;
                        String str2 = x731Var.d;
                        u731 u731Var = x731Var.g;
                        String str3 = u731Var.a;
                        dzo1 dzo1Var = u731Var.b;
                        z = (((iIntValue3 & 896) ^ 384) > 256 && x340Var5.g(iu30Var4)) || (iIntValue3 & 384) == 256;
                        x340 x340Var6 = x340Var5;
                        Object objT3 = x340Var6.T();
                        if (z || objT3 == fkj0.X) {
                            objT3 = new hdj(iu30Var4, (byte) 4);
                            x340Var6.s0(objT3);
                        }
                        t0c.c(vnr0Var, str, str2, str3, dzo1Var, (qim0) null, (Function0) objT3, x340Var6, 8);
                        return rih1Var;
                    case 3:
                        oc31 oc31Var = (oc31) obj2;
                        iu30 iu30Var5 = (iu30) obj3;
                        x340 x340Var7 = (b0k) obj4;
                        int iIntValue4 = ((Number) obj5).intValue();
                        String strO1 = cwl1.o0(x340Var7, 2131958329);
                        String strO2 = cwl1.o0(x340Var7, 2131958330);
                        qim0 qim0VarN2 = anm1.N("retryElement", u291.f(nim0Var, 1.0f));
                        era eraVar = een.P0;
                        uwr uwrVar = cbx.a;
                        cvx cvxVar = cbx.b(x340Var7).b;
                        mbh mbhVarA = jbh.a(new d36(12.0f, true, new um5(false)), eraVar, x340Var7, 0);
                        x340 x340Var8 = x340Var7;
                        int iHashCode2 = Long.hashCode(x340Var8.T);
                        xos0 xos0VarM2 = x340Var8.m();
                        qim0 qim0VarE2 = zr7.E(x340Var7, qim0VarN2);
                        hzj.A.getClass();
                        x340 x340Var9 = x340Var7;
                        if (x340Var9.a == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var9.m0();
                        if (x340Var9.S) {
                            x340Var9.l(n4kVar);
                        } else {
                            x340Var9.v0();
                        }
                        nko1.H(mbhVarA, x340Var7, y580.O0);
                        nko1.H(xos0VarM2, x340Var7, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode2), x340Var7, y580.R0);
                        nko1.F(x340Var7);
                        nko1.H(qim0VarE2, x340Var7, y580.Y);
                        uwo1.e(strO1, anm1.N("retryMessage", nim0Var), cbx.d(x340Var7).g, cbx.a(x340Var7).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var7, 0, 0, 2032);
                        gdx gdxVarS = yla.s(x340Var7);
                        kdx kdxVar = kdx.c;
                        boolean zI = x340Var9.i(oc31Var) | ((((iIntValue4 & 896) ^ 384) > 256 && x340Var9.g(iu30Var5)) || (iIntValue4 & 384) == 256);
                        Object objT4 = x340Var9.T();
                        if (zI || objT4 == fkj0.X) {
                            objT4 = new dfi((Object) iu30Var5, (Object) oc31Var, (byte) 20);
                            x340Var9.s0(objT4);
                        }
                        Function0 function1 = (Function0) objT4;
                        if (ihc1.y0(strO2)) {
                            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                            return null;
                        }
                        foo1.c(new gbx(new y50(strO2), function1), kdxVar, anm1.N("retryButton", nim0Var), (max) null, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, zdj.a, (vu30) null, apo.r(598822945, new pji(strO2, (byte) 7), x340Var7), x340Var7, 805306368, 48, 1496);
                        x340Var9.r(true);
                        return rih1Var;
                    case 4:
                        ((Number) obj5).intValue();
                        return rih1Var;
                    case 5:
                        ((Number) obj5).intValue();
                        return rih1Var;
                    case 6:
                        um31 um31Var = (um31) obj2;
                        x340 x340Var10 = (b0k) obj4;
                        int iIntValue5 = ((Number) obj5).intValue();
                        String str4 = um31Var.d;
                        String str5 = um31Var.b;
                        List list = um31Var.c;
                        ArrayList arrayList = um31Var.a;
                        if ((iIntValue5 & 48) == 0) {
                            iIntValue5 |= x340Var10.g(um31Var) ? 32 : 16;
                        }
                        x340 x340Var11 = x340Var10;
                        if (!x340Var11.Y(iIntValue5 & 1, (iIntValue5 & 1041) != 1040)) {
                            x340Var11.b0();
                        } else if (list != null) {
                            x340Var11.i0(-375655988);
                            String strO3 = cwl1.o0(x340Var11, 2131962765);
                            qim0 qim0VarN3 = anm1.N("roles_footer", nim0Var);
                            mbh mbhVarA2 = jbh.a(h36.c, een.P0, x340Var11, 0);
                            int iHashCode3 = Long.hashCode(x340Var11.T);
                            xos0 xos0VarM3 = x340Var11.m();
                            qim0 qim0VarE3 = zr7.E(x340Var11, qim0VarN3);
                            hzj.A.getClass();
                            if (x340Var11.a == null) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var11.m0();
                            if (x340Var11.S) {
                                x340Var11.l(n4kVar);
                            } else {
                                x340Var11.v0();
                            }
                            nko1.H(mbhVarA2, x340Var11, y580.O0);
                            nko1.H(xos0VarM3, x340Var11, y580.N0);
                            nko1.H(Integer.valueOf(iHashCode3), x340Var11, y580.R0);
                            nko1.F(x340Var11);
                            nko1.H(qim0VarE3, x340Var11, y580.Y);
                            if (str5.length() <= 0 || arrayList.isEmpty()) {
                                x340Var11.i0(779262181);
                                x340Var11.r(false);
                            } else {
                                x340Var11.i0(778677893);
                                String strY0 = o7h.y0(arrayList, ", ", (String) null, (String) null, (iu30) null, 62);
                                ye5 ye5VarO = kk0.o(-667615230, x340Var11);
                                uwr uwrVar2 = cbx.a;
                                int iO = ye5VarO.o(new zma1(cbx.a(x340Var11).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                                try {
                                    ye5VarO.g(str5);
                                    ye5VarO.k(iO);
                                    int iO2 = ye5VarO.o(new zma1(cbx.a(x340Var11).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                                    try {
                                        ye5VarO.g(strO3);
                                        ye5VarO.k(iO2);
                                        int iO3 = ye5VarO.o(new zma1(cbx.a(x340Var11).b.b, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                                        try {
                                            ye5VarO.g(strY0);
                                            ye5VarO.k(iO3);
                                            af5 af5VarP = ye5VarO.p();
                                            x340Var11.r(false);
                                            uwo1.f(af5VarP, anm1.N("main_artist_roles", nim0Var), cbx.d(x340Var11).j, (x9h) null, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var11, 48, 0, 4088);
                                            x340Var11.r(false);
                                        } catch (Throwable th) {
                                            ye5VarO.k(iO3);
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        ye5VarO.k(iO2);
                                        throw th2;
                                    }
                                } catch (Throwable th3) {
                                    ye5VarO.k(iO);
                                    throw th3;
                                }
                            }
                            if (str4 == null || str4.length() == 0 || list.isEmpty()) {
                                x340Var11.i0(780184741);
                                x340Var11.r(false);
                            } else {
                                x340Var11.i0(779382306);
                                uwr uwrVar3 = cbx.a;
                                cvx cvxVar2 = cbx.b(x340Var11).b;
                                op71.g(x340Var11, u291.h(nim0Var, 4.0f));
                                String strY1 = o7h.y0(list, ", ", (String) null, (String) null, (iu30) null, 62);
                                ye5 ye5VarO2 = kk0.o(-667589378, x340Var11);
                                int iO4 = ye5VarO2.o(new zma1(cbx.a(x340Var11).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                                try {
                                    ye5VarO2.g(str4);
                                    ye5VarO2.k(iO4);
                                    int iO5 = ye5VarO2.o(new zma1(cbx.a(x340Var11).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                                    try {
                                        ye5VarO2.g(strO3);
                                        ye5VarO2.k(iO5);
                                        int iO6 = ye5VarO2.o(new zma1(cbx.a(x340Var11).b.b, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                                        try {
                                            ye5VarO2.g(strY1);
                                            ye5VarO2.k(iO6);
                                            af5 af5VarP2 = ye5VarO2.p();
                                            x340Var11.r(false);
                                            uwo1.d(af5VarP2, cbx.a(x340Var11).b.b, anm1.N("collaborator_roles", nim0Var), cbx.d(x340Var11).j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var11, 384, 0, 4080);
                                            x340Var11.r(false);
                                        } catch (Throwable th4) {
                                            ye5VarO2.k(iO6);
                                            throw th4;
                                        }
                                    } catch (Throwable th5) {
                                        ye5VarO2.k(iO5);
                                        throw th5;
                                    }
                                } catch (Throwable th6) {
                                    ye5VarO2.k(iO4);
                                    throw th6;
                                }
                            }
                            x340Var11.r(true);
                            x340Var11.r(false);
                        } else {
                            x340Var11.i0(-373885268);
                            if (arrayList.isEmpty()) {
                                x340Var11.i0(-372866794);
                                x340Var11.r(false);
                            } else {
                                x340Var11.i0(-373839326);
                                String strY2 = o7h.y0(arrayList, ", ", (String) null, (String) null, (iu30) null, 62);
                                String strU = cwl1.U(2131820924, arrayList.size(), new Object[]{""}, x340Var11);
                                String strU2 = cwl1.U(2131820924, arrayList.size(), new Object[]{strY2}, x340Var11);
                                ye5 ye5VarO3 = kk0.o(1234881294, x340Var11);
                                int length = strU.length();
                                uwr uwrVar4 = cbx.a;
                                int iO7 = ye5VarO3.o(new zma1(cbx.a(x340Var11).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                                try {
                                    ye5VarO3.g(strU2.substring(0, length));
                                    ye5VarO3.k(iO7);
                                    int iO8 = ye5VarO3.o(new zma1(cbx.a(x340Var11).b.b, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                                    try {
                                        ye5VarO3.g(strU2.substring(length));
                                        ye5VarO3.k(iO8);
                                        af5 af5VarP3 = ye5VarO3.p();
                                        x340Var11.r(false);
                                        uwo1.f(af5VarP3, anm1.N("main_artist_roles", nim0Var), cbx.d(x340Var11).j, (x9h) null, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var11, 48, 0, 4088);
                                        x340Var11.r(false);
                                    } catch (Throwable th7) {
                                        ye5VarO3.k(iO8);
                                        throw th7;
                                    }
                                } catch (Throwable th8) {
                                    ye5VarO3.k(iO7);
                                    throw th8;
                                }
                            }
                            x340Var11.r(false);
                        }
                        return rih1Var;
                    case 7:
                        iu30 iu30Var6 = (iu30) obj3;
                        x340 x340Var12 = (b0k) obj4;
                        int iIntValue6 = ((Number) obj5).intValue();
                        z = (((iIntValue6 & 896) ^ 384) > 256 && x340Var12.g(iu30Var6)) || (iIntValue6 & 384) == 256;
                        x340 x340Var13 = x340Var12;
                        Object objT5 = x340Var13.T();
                        if (z || objT5 == fkj0.X) {
                            objT5 = new hdj(iu30Var6, (byte) 5);
                            x340Var13.s0(objT5);
                        }
                        mqo1.e((Function0) objT5, (i3u) null, (vu30) null, gej.a, gej.b, apo.r(1861902691, new v0j(iu30Var6, (byte) 7), x340Var13), apo.r(-1261855934, new v0j(iu30Var6, (byte) 8), x340Var13), x340Var13, 1797120, 6);
                        return rih1Var;
                    case 8:
                        cc41 cc41Var = (cc41) obj2;
                        iu30 iu30Var7 = (iu30) obj3;
                        x340 x340Var14 = (b0k) obj4;
                        int iIntValue7 = ((Number) obj5).intValue();
                        String str6 = cc41Var.b;
                        if (str6 != null) {
                            x340 x340Var15 = x340Var14;
                            x340Var15.i0(1130672137);
                            strK = cwl1.n0(2131959512, new Object[]{str6}, x340Var15);
                            x340Var15.r(false);
                        } else if (cc41Var.a) {
                            x340 x340Var16 = x340Var14;
                            strK = x0d.k(x340Var16, 1130678315, 2131959509, x340Var16, false);
                        } else {
                            x340 x340Var17 = x340Var14;
                            strK = x0d.k(x340Var17, 1130675799, 2131959510, x340Var17, false);
                        }
                        jdx jdxVar = jdx.c;
                        z = (((iIntValue7 & 896) ^ 384) > 256 && x340Var14.g(iu30Var7)) || (iIntValue7 & 384) == 256;
                        x340 x340Var18 = x340Var14;
                        boolean zG = x340Var18.g(strK) | z;
                        Object objT6 = x340Var18.T();
                        if (zG || objT6 == fkj0.X) {
                            objT6 = new are(iu30Var7, strK, (byte) 3);
                            x340Var18.s0(objT6);
                        }
                        foo1.c(new gbx(z50Var, (Function0) objT6), jdxVar, anm1.N("save_progress_button", nim0Var), (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, hej.a, x340Var18, 0, 48, 2040);
                        return rih1Var;
                    case 9:
                        iu30 iu30Var8 = (iu30) obj3;
                        x340 x340Var19 = (b0k) obj4;
                        int iIntValue8 = ((Number) obj5).intValue();
                        idx idxVar = new idx(4);
                        z = (((iIntValue8 & 896) ^ 384) > 256 && x340Var19.g(iu30Var8)) || (iIntValue8 & 384) == 256;
                        x340 x340Var20 = x340Var19;
                        Object objT7 = x340Var20.T();
                        if (z || objT7 == fkj0.X) {
                            objT7 = new hdj(iu30Var8, (byte) 8);
                            x340Var20.s0(objT7);
                        }
                        foo1.c(new gbx(z50Var, (Function0) objT7), idxVar, anm1.N("scan_to_listen_button_test_tag", nim0Var), (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, jej.a, (vu30) null, jej.b, x340Var20, 805306368, 48, 1528);
                        return rih1Var;
                    case 10:
                        ih41 ih41Var = (ih41) obj2;
                        iu30 iu30Var9 = (iu30) obj3;
                        x340 x340Var21 = (b0k) obj4;
                        int iIntValue9 = ((Number) obj5).intValue();
                        idx idxVar2 = new idx(8);
                        if ((((iIntValue9 & 896) ^ 384) <= 256 || !x340Var21.g(iu30Var9)) && (iIntValue9 & 384) != 256) {
                            z2 = false;
                        }
                        x340 x340Var22 = x340Var21;
                        Object objT8 = x340Var22.T();
                        if (z2 || objT8 == fkj0.X) {
                            objT8 = new hdj(iu30Var9, (byte) 9);
                            x340Var22.s0(objT8);
                        }
                        gbx gbxVar2 = new gbx(z50Var, (Function0) objT8);
                        if (ih41Var.a) {
                            x340Var22.i0(1407508049);
                            x340Var22.r(false);
                            haxVar2 = jax.a;
                        } else {
                            x340Var22.i0(1407509600);
                            haxVar2 = new hax(cwl1.o0(x340Var22, 2131959479));
                            x340Var22.r(false);
                        }
                        foo1.c(gbxVar2, idxVar2, anm1.N("scan_to_read_button_test_tag", nim0Var), haxVar2, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, lej.a, (vu30) null, lej.b, x340Var22, 805306368, 48, 1512);
                        return rih1Var;
                    case 11:
                        xl41 xl41Var = (xl41) obj2;
                        iu30 iu30Var10 = (iu30) obj3;
                        x340 x340Var23 = (b0k) obj4;
                        int iIntValue10 = ((Number) obj5).intValue();
                        z = (((iIntValue10 & 896) ^ 384) > 256 && x340Var23.g(iu30Var10)) || (iIntValue10 & 384) == 256;
                        x340 x340Var24 = x340Var23;
                        Object objT9 = x340Var24.T();
                        if (z || objT9 == fkj0.X) {
                            objT9 = new hdj(iu30Var10, (byte) 10);
                            x340Var24.s0(objT9);
                        }
                        qon1.k(xl41Var, (Function0) objT9, (qim0) null, x340Var24, (iIntValue10 >> 3) & 14);
                        return rih1Var;
                    case 12:
                        iu30 iu30Var11 = (iu30) obj3;
                        x340 x340Var25 = (b0k) obj4;
                        int iIntValue11 = ((Number) obj5).intValue();
                        if ((iIntValue11 & 384) == 0) {
                            iIntValue11 |= x340Var25.i(iu30Var11) ? 256 : 128;
                        }
                        x340 x340Var26 = x340Var25;
                        if (x340Var26.Y(iIntValue11 & 1, (iIntValue11 & 1153) != 1152)) {
                            gfx.b(6, apo.r(18934637, new v0j(iu30Var11, (byte) 9), x340Var26), x340Var26, 54);
                        } else {
                            x340Var26.b0();
                        }
                        return rih1Var;
                    case 13:
                        iu30 iu30Var12 = (iu30) obj3;
                        x340 x340Var27 = (b0k) obj4;
                        int iIntValue12 = ((Number) obj5).intValue();
                        String strO4 = cwl1.o0(x340Var27, 2131959220);
                        z = (((iIntValue12 & 896) ^ 384) > 256 && x340Var27.g(iu30Var12)) || (iIntValue12 & 384) == 256;
                        x340 x340Var28 = x340Var27;
                        Object objT10 = x340Var28.T();
                        if (z || objT10 == fkj0.X) {
                            objT10 = new hdj(iu30Var12, (byte) 12);
                            x340Var28.s0(objT10);
                        }
                        Function0 function2 = (Function0) objT10;
                        if (ihc1.y0(strO4)) {
                            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                            return null;
                        }
                        foo1.c(new gbx(new y50(strO4), function2), new idx(4), (qim0) null, (max) null, yla.p(x340Var28), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, rej.a, x340Var28, 0, 48, 2012);
                        return rih1Var;
                    case 14:
                        return a(obj, obj2, obj3, obj4, obj5);
                    case 15:
                        t451 t451Var = (t451) obj2;
                        iu30 iu30Var13 = (iu30) obj3;
                        x340 x340Var29 = (b0k) obj4;
                        int iIntValue13 = ((Number) obj5).intValue();
                        m4c m4cVar = fkj0.X;
                        if ((iIntValue13 & 48) == 0) {
                            i2 = iIntValue13 | (x340Var29.g(t451Var) ? 32 : 16);
                        } else {
                            i2 = iIntValue13;
                        }
                        if ((iIntValue13 & 384) == 0) {
                            i2 |= x340Var29.i(iu30Var13) ? 256 : 128;
                        }
                        x340 x340Var30 = x340Var29;
                        if (x340Var30.Y(i2 & 1, (i2 & 1169) != 1168)) {
                            int i3 = i2 & 896;
                            boolean z5 = i3 == 256;
                            Object objT11 = x340Var30.T();
                            if (z5 || objT11 == m4cVar) {
                                objT11 = new hdj(iu30Var13, (byte) 14);
                                x340Var30.s0(objT11);
                            }
                            Function0 function3 = (Function0) objT11;
                            boolean z6 = i3 == 256;
                            Object objT12 = x340Var30.T();
                            if (z6 || objT12 == m4cVar) {
                                objT12 = new k4j(iu30Var13, (byte) 16);
                                x340Var30.s0(objT12);
                            }
                            iu30 iu30Var14 = (iu30) objT12;
                            z = i3 == 256;
                            Object objT13 = x340Var30.T();
                            if (z || objT13 == m4cVar) {
                                objT13 = new hdj(iu30Var13, (byte) 15);
                                x340Var30.s0(objT13);
                            }
                            x451.a(t451Var, function3, iu30Var14, (Function0) objT13, (qim0) null, x340Var30, (i2 >> 3) & 14);
                        } else {
                            x340Var30.b0();
                        }
                        return rih1Var;
                    case 16:
                        r751 r751Var = (r751) obj2;
                        z0o1.c((iu30) obj3, r751Var.b, r751Var.c, (qim0) null, (b0k) obj4, (((Number) obj5).intValue() >> 6) & 14);
                        return rih1Var;
                    case 17:
                        return d(obj, obj2, obj3, obj4, obj5);
                    case 18:
                        return e(obj, obj2, obj3, obj4, obj5);
                    case 19:
                        return f(obj, obj2, obj3, obj4, obj5);
                    case 20:
                        return g(obj, obj2, obj3, obj4, obj5);
                    case 21:
                        return h(obj, obj2, obj3, obj4, obj5);
                    case 22:
                        return i(obj, obj2, obj3, obj4, obj5);
                    case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                        return j(obj, obj2, obj3, obj4, obj5);
                    case 24:
                        return k(obj, obj2, obj3, obj4, obj5);
                    case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                        return m(obj, obj2, obj3, obj4, obj5);
                    case 26:
                        return n(obj, obj2, obj3, obj4, obj5);
                    case 27:
                        return o(obj, obj2, obj3, obj4, obj5);
                    case 28:
                        return p(obj, obj2, obj3, obj4, obj5);
                    default:
                        wt51 wt51Var = (wt51) obj2;
                        iu30 iu30Var15 = (iu30) obj3;
                        x340 x340Var31 = (b0k) obj4;
                        int iIntValue14 = ((Number) obj5).intValue();
                        llx llxVar = llx.c;
                        String strO5 = cwl1.o0(x340Var31, 2131961602);
                        t2g t2gVar = new t2g(wt51Var.a, false, w2g.b(x340Var31), 2);
                        String strO6 = cwl1.o0(x340Var31, 2131961602);
                        boolean z7 = ((((iIntValue14 & 896) ^ 384) > 256 && x340Var31.g(iu30Var15)) || (iIntValue14 & 384) == 256) | ((((iIntValue14 & 112) ^ 48) > 32 && x340Var31.g(wt51Var)) || (iIntValue14 & 48) == 32);
                        x340 x340Var32 = x340Var31;
                        Object objT14 = x340Var32.T();
                        if (z7 || objT14 == fkj0.X) {
                            objT14 = new dfi((Object) iu30Var15, (Object) wt51Var, (byte) 23);
                            x340Var32.s0(objT14);
                        }
                        kyo1.c(strO5, llxVar, (Function0) objT14, (qim0) null, false, strO6, t2gVar, (vu30) null, x340Var32, llx.d << 3, 152);
                        return rih1Var;
                }
            }
        }
