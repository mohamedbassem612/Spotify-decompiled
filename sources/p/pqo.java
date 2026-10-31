package p;

import android.content.res.Configuration;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.mobius.Next;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatten;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class pqo {
    public static final j2i a = new j2i(210148896, new n75((byte) 12), false);
    public static b180 b;
    public static b180 c;

    public static final void a(aix0 aix0Var, oj80 oj80Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1799061920);
        int i2 = i | (x340Var.i(aix0Var) ? 4 : 2) | (x340Var.i(oj80Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zG = x340Var.g(oj80Var) | x340Var.h(false);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = q1o1.u(new jpg0(((mo51) ((kly0) oj80Var.c).get()).a(voo1.t((xfx) oj80Var.b, null)), fw2.e1), null, new FrameLayout.LayoutParams(-1, -2), 3);
                x340Var.s0(objT);
            }
            xpw xpwVar = (xpw) objT;
            x340Var.f0(1973322875, xpwVar);
            qim0 qim0Var3 = nim0.a;
            otw.c(xpwVar, rih1.a, uyn1.y(u291.f(qim0Var3, 1.0f), dsa0.m(x340Var, 2131166968), dsa0.m(x340Var, 2131166969)), (ipb1) null, x340Var, 48, 8);
            x340Var.r(false);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oj2(aix0Var, oj80Var, qim0Var2, i, (byte) 7);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void b(y8f1 y8f1Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        b0k b0kVar2;
        qim0 qim0Var2;
        String strN0;
        String strU;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(955400259);
        int i2 = i | (b0kVar3.g(y8f1Var) ? 4 : 2) | (b0kVar3.i(function0) ? 32 : 16) | 384;
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            rwm rwmVar = y8f1Var.e;
            int i3 = rwmVar == null ? -1 : f9f1.a[rwmVar.ordinal()];
            xu30 xu30VarR = null;
            if (i3 == -1) {
                b0kVar3.i0(-1360321590);
                b0kVar3.r(false);
                strN0 = null;
            } else if (i3 == 1 || i3 == 2) {
                b0kVar3.i0(648850910);
                strN0 = g3p1.m(y8f1Var.e, b0kVar3);
                b0kVar3.r(false);
            } else {
                if (i3 != 3 && i3 != 4) {
                    throw p3d1.k(b0kVar3, 648847668, false);
                }
                b0kVar3.i0(-1360321590);
                b0kVar3.r(false);
                strN0 = null;
            }
            Integer num = y8f1Var.f;
            if (num == null || num.intValue() <= 0) {
                num = null;
            }
            if (num == null) {
                b0kVar3.i0(-1360245051);
                b0kVar3.r(false);
                strU = null;
            } else {
                b0kVar3.i0(-1360245050);
                int iIntValue = num.intValue();
                strU = cwl1.U(2131820640, iIntValue, new Object[]{Integer.valueOf(iIntValue)}, b0kVar3);
                b0kVar3.r(false);
            }
            if (strN0 != null && strU != null) {
                b0kVar3.i0(648861158);
                strN0 = cwl1.n0(2131954590, new Object[]{strN0, strU}, b0kVar3);
                b0kVar3.r(false);
            } else if (strN0 != null) {
                b0kVar3.i0(648863448);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(648864032);
                b0kVar3.r(false);
                strN0 = strU;
            }
            String strY0 = o7h.y0(f46.i0(new String[]{y8f1Var.c, strN0}), ", ", (String) null, (String) null, (iu30) null, 62);
            float f = ((Configuration) b0kVar3.k(AndroidCompositionLocals_androidKt.a)).screenWidthDp;
            float fU0 = ((wat) b0kVar3.k(t4k.h)).U0();
            if (fU0 < 1.0f) {
                fU0 = 1.0f;
            }
            float fMin = Math.min(f * 0.4f, 200.0f) * fU0;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarV = u291.v(qim0Var3, fMin);
            boolean zG = b0kVar3.g(strY0);
            Object objT = b0kVar3.T();
            if (zG || objT == fkj0.X) {
                objT = new hqa1(strY0, (byte) 27);
                b0kVar3.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarV, true, (iu30) objT);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            ydx ydxVar = new ydx(4.0f, 12.0f, 8.0f, new zzq0(0.0f, 0.0f, 0.0f, 0.0f));
            jtr jtrVar = jtr.f;
            gbx gbxVar = new gbx(z50.c, function0);
            j2i j2iVarR = apo.r(644753086, new ye6(fMin, (Object) y8f1Var, (byte) 12), b0kVar3);
            if (strN0 == null) {
                b0kVar3.i0(-417825628);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-417825627);
                xu30VarR = apo.r(1928783632, new dba1(strN0, (byte) 7), b0kVar3);
                b0kVar3.r(false);
            }
            b0kVar2 = b0kVar3;
            ioo1.c(qim0VarB, null, ydxVar, null, null, null, jtrVar, gbxVar, null, j2iVarR, null, null, xu30VarR, null, null, null, apo.r(1626558840, new e9f1(y8f1Var, (byte) 0), b0kVar3), b0kVar2, 805306880, 1572864, 60730);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new juc1(y8f1Var, function0, qim0Var2, i, (byte) 14);
        }
    }

    public static final void c(String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1165557766);
        int i2 = i | (x340Var.g(str) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
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
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 8.0f));
            uwo1.e(str, anm1.N("map_attribution", u291.j(48.0f, 0.0f, 2, u291.f(nim0Var, 1.0f))), cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2032);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pji(str, i, (byte) 13);
        }
    }

    public static final void d(e8w0 e8w0Var, smp0 smp0Var, vu30 vu30Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1685606707);
        int i2 = (x340Var.i(e8w0Var) ? 4 : 2) | i | (x340Var.i(smp0Var) ? 32 : 16) | (x340Var.i(vu30Var) ? 256 : 128) | (x340Var.i(function0) ? 2048 : 1024) | 24576;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            nyx.a(0, (wux) null, apo.r(-1509577658, new b2o0(e8w0Var, smp0Var, vu30Var, function0), x340Var), x340Var, 3072, 7);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e9g0((byte) 28, i, e8w0Var, smp0Var, vu30Var, function0, qim0Var2);
        }
    }

    public static final void e(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1195813351);
        int i2 = i | (x340Var.i(function0) ? 4 : 2) | (x340Var.i(qim0Var) ? 32 : 16);
        byte b2 = 21;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131952918);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.a.a();
            qim0 qim0VarA = uyn1.A(dug.e(u291.f(qim0Var, 1.0f), v9c.s(p7h.M(new u7h[]{new u7h(u7h.b(jA, 0.0f, 0.0f, 0.0f, 0.0f, 14)), new u7h(jA)}), 0.0f, ((wat) x340Var.k(t4k.h)).X0(32.0f), 10), null, 0.0f, 6), cbx.b(x340Var).e.b, 32.0f, cbx.b(x340Var).e.b, cbx.b(x340Var).e.b);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
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
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                foo1.c(new gbx(new y50(strO0), function0), new idx(8), u291.f(nim0.a, 1.0f), null, yla.r(x340Var), null, null, null, null, null, apo.r(-1499329044, new psr0(strO0, b2), x340Var), x340Var, 0, 48, 2008);
                x340Var.r(true);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bb50(function0, qim0Var, i, (byte) 21);
        }
    }

    public static final void f(List list, gw70 gw70Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2006646840);
        int i2 = (x340Var.g(list) ? 4 : 2) | i | (x340Var.i(gw70Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            mod.b(oi7.a.a(gw70Var), apo.r(1994937096, new zdv0(list, iu30Var), x340Var), x340Var, 56);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bvd1(i, list, gw70Var, iu30Var, qim0Var2, (byte) 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:147:0x03c9  */
    public static final void g(cce cceVar, fbp fbpVar, jkr0 jkr0Var, boolean z, dt71 dt71Var, dt71 dt71Var2, c380 c380Var, float f, boolean z2, iu30 iu30Var, qim0 qim0Var, boolean z3, b0k b0kVar, int i) {
        boolean z4;
        x340 x340Var;
        c380 c380Var2;
        x340 x340Var2;
        int i2;
        vjr0 vjr0Var;
        Object du2Var;
        Boolean bool;
        int i3;
        int i4;
        jkr0 jkr0Var2;
        vjr0 vjr0Var2;
        qim0 qim0VarB;
        m4c m4cVar;
        lnm lnmVar;
        View view;
        boolean zI;
        Object objT;
        jkr0 jkr0Var3 = jkr0Var;
        m4c m4cVar2 = fkj0.X;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(268850585);
        int i5 = i | (x340Var3.i(cceVar) ? 4 : 2) | (x340Var3.g(fbpVar) ? 32 : 16) | (x340Var3.i(jkr0Var3) ? 256 : 128) | (x340Var3.h(z) ? 2048 : 1024) | (x340Var3.i(dt71Var) ? 16384 : 8192) | (x340Var3.i(dt71Var2) ? 131072 : 65536) | (x340Var3.i(c380Var) ? 1048576 : 524288) | (x340Var3.d(f) ? 8388608 : 4194304) | (x340Var3.h(z2) ? 536870912 : 268435456);
        int i6 = (x340Var3.i(iu30Var) ? (char) 4 : (char) 2) | (x340Var3.i(qim0Var) ? ' ' : (char) 16) | (x340Var3.h(z3) ? (char) 256 : (char) 128);
        if (x340Var3.Y(i5 & 1, ((i5 & 306783379) == 306783378 && (i6 & 147) == 146) ? false : true)) {
            boolean zG = x340Var3.g(dt71Var) | x340Var3.g(dt71Var2);
            Object objT2 = x340Var3.T();
            if (zG || objT2 == m4cVar2) {
                switch (fbpVar.a) {
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                        x340Var2 = x340Var3;
                        i2 = i5;
                        hbp hbpVar = (hbp) fbpVar.b.c;
                        vjr0Var = new vjr0((ebp) hbpVar.e2.get(), (q9l1) hbpVar.g.get(), hbpVar.g2, dt71Var, dt71Var2);
                        break;
                    default:
                        mxp mxpVar = (mxp) fbpVar.b.c;
                        x340Var2 = x340Var3;
                        i2 = i5;
                        vjr0Var = new vjr0((ebp) mxpVar.e2.get(), (q9l1) mxpVar.g.get(), mxpVar.g2, dt71Var, dt71Var2);
                        break;
                }
                objT2 = vjr0Var;
                x340Var2.s0(objT2);
            } else {
                x340Var2 = x340Var3;
                i2 = i5;
                i6 = i6;
            }
            vjr0 vjr0Var3 = (vjr0) objT2;
            boolean zI2 = x340Var2.i(vjr0Var3) | x340Var2.i(c380Var);
            Object objT3 = x340Var2.T();
            if (zI2 || objT3 == m4cVar2) {
                objT3 = new t6j1(vjr0Var3, c380Var, (lnm) null, (byte) 23);
                x340Var2.s0(objT3);
            }
            qxd0.t(c380Var, x340Var2, (vu30) objT3);
            Boolean boolValueOf = Boolean.valueOf(z);
            int i7 = i2 & 7168;
            boolean zI3 = x340Var2.i(jkr0Var3) | (i7 == 2048) | x340Var2.i(c380Var) | x340Var2.i(vjr0Var3);
            Object objT4 = x340Var2.T();
            if (zI3 || objT4 == m4cVar2) {
                bool = boolValueOf;
                i3 = 2048;
                i4 = i7;
                jkr0Var2 = jkr0Var;
                du2Var = new du2(jkr0Var2, z, c380Var, vjr0Var3, (lnm) null, (byte) 24);
                z4 = z;
                c380Var2 = c380Var;
                vjr0Var2 = vjr0Var3;
                x340Var2.s0(du2Var);
            } else {
                c380Var2 = c380Var;
                bool = boolValueOf;
                vjr0Var2 = vjr0Var3;
                jkr0Var2 = jkr0Var3;
                du2Var = objT4;
                i3 = 2048;
                z4 = z;
                i4 = i7;
            }
            int i8 = (i2 >> 6) & 14;
            qxd0.r(jkr0Var2, c380Var2, bool, (vu30) du2Var, x340Var2);
            Boolean boolValueOf2 = Boolean.valueOf(z4);
            boolean zI4 = (i4 == i3) | x340Var2.i(vjr0Var2);
            Object objT5 = x340Var2.T();
            if (zI4 || objT5 == m4cVar2) {
                objT5 = new ujr0(z4, vjr0Var2, (lnm) null);
                x340Var2.s0(objT5);
            }
            qxd0.t(boolValueOf2, x340Var2, (vu30) objT5);
            boolean zI5 = x340Var2.i(jkr0Var2) | ((i6 & 14) == 4);
            Object objT6 = x340Var2.T();
            if (zI5 || objT6 == m4cVar2) {
                objT6 = new gqj1(jkr0Var2, iu30Var, (lnm) null, (byte) 15);
                x340Var2.s0(objT6);
            }
            qxd0.t(jkr0Var2, x340Var2, (vu30) objT6);
            wat watVar = (wat) x340Var2.k(t4k.h);
            Object objT7 = x340Var2.T();
            if (objT7 == m4cVar2) {
                objT7 = bb00.h(0, x340Var2);
            }
            err0 err0Var = (hdn0) objT7;
            qim0 qim0VarD = u291.d(qim0Var, 1.0f);
            boolean zI6 = x340Var2.i(err0Var);
            Object objT8 = x340Var2.T();
            if (zI6 || objT8 == m4cVar2) {
                objT8 = new qsc1(err0Var, (byte) 7);
                x340Var2.s0(objT8);
            }
            qim0 qim0VarU = lrn1.u(qim0VarD, (iu30) objT8);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarU);
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
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            err0 err0Var2 = err0Var;
            if (err0Var2.s() > 0) {
                x340Var2.i0(-278670247);
                float fM0 = watVar.M0(err0Var2.s()) * f;
                float f2 = f > 0.0f ? 8.0f : 0.0f;
                zzq0 zzq0VarJ = uyn1.j(0.0f, 0.0f, 0.0f, fM0, 7);
                qim0 qim0VarI = nim0.a;
                qim0 qim0VarD2 = u291.d(qim0VarI, 1.0f);
                if (z3) {
                    x340Var2.i0(-278360123);
                    Object objT9 = x340Var2.T();
                    if (objT9 == m4cVar2) {
                        objT9 = lcl1.b;
                        x340Var2.s0(objT9);
                    }
                    qim0VarB = s161.b(qim0VarI, false, (iu30) objT9);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-278078023);
                    x340Var2.r(false);
                    qim0VarB = qim0VarI;
                }
                qim0 qim0VarThen = qim0VarD2.then(qim0VarB);
                if (z2) {
                    qim0VarI = zr7.i(qim0VarI, new n1r0(jkr0Var2, (byte) 3));
                }
                qim0 qim0VarThen2 = qim0VarThen.then(qim0VarI);
                int i9 = i8 | 24576;
                vjr0 vjr0Var4 = vjr0Var2;
                x340 x340Var4 = x340Var2;
                ru91 ru91VarJ = q0o1.j(jkr0Var, null, null, x340Var4, i9, 14);
                Object objT10 = x340Var4.T();
                if (objT10 == m4cVar2) {
                    objT10 = lcl1.c;
                    x340Var4.s0(objT10);
                }
                iu30 iu30Var2 = (iu30) objT10;
                j2i j2iVarR = apo.r(-2118657431, new mcl1(c380Var, vjr0Var4, cceVar, f, jkr0Var), x340Var4);
                int i10 = i4;
                jkr0Var3 = jkr0Var;
                w0h1.f(jkr0Var3, qim0VarThen2, zzq0VarJ, 1, f2, (nl3) null, ru91VarJ, false, iu30Var2, (d6o0) null, (xu91) null, (hxq0) null, j2iVarR, x340Var4, i9);
                x340Var = x340Var4;
                Boolean boolValueOf3 = Boolean.valueOf(z);
                boolean zI7 = x340Var.i(vjr0Var4) | (i10 == 2048);
                Object objT11 = x340Var.T();
                if (zI7) {
                    m4cVar = m4cVar2;
                } else {
                    m4cVar = m4cVar2;
                    if (objT11 != m4cVar) {
                        z4 = z;
                        lnmVar = null;
                    }
                    c380Var2 = c380Var;
                    qxd0.r(vjr0Var4, c380Var2, boolValueOf3, (vu30) objT11, x340Var);
                    view = (View) x340Var.k(AndroidCompositionLocals_androidKt.f);
                    Integer numValueOf = Integer.valueOf(((err0) jkr0Var3.d.c).s());
                    zI = x340Var.i(view) | x340Var.i(jkr0Var3);
                    objT = x340Var.T();
                    if (zI || objT == m4cVar) {
                        objT = new t6j1(view, jkr0Var3, lnmVar, (byte) 24);
                        x340Var.s0(objT);
                    }
                    qxd0.t(numValueOf, x340Var, (vu30) objT);
                    x340Var.r(false);
                }
                z4 = z;
                lnmVar = null;
                objT11 = new oy3(z4, vjr0Var4, (lnm) null, (byte) 22);
                x340Var.s0(objT11);
                c380Var2 = c380Var;
                qxd0.r(vjr0Var4, c380Var2, boolValueOf3, (vu30) objT11, x340Var);
                view = (View) x340Var.k(AndroidCompositionLocals_androidKt.f);
                Integer numValueOf2 = Integer.valueOf(((err0) jkr0Var3.d.c).s());
                zI = x340Var.i(view) | x340Var.i(jkr0Var3);
                objT = x340Var.T();
                if (zI) {
                    objT = new t6j1(view, jkr0Var3, lnmVar, (byte) 24);
                    x340Var.s0(objT);
                } else {
                    objT = new t6j1(view, jkr0Var3, lnmVar, (byte) 24);
                    x340Var.s0(objT);
                }
                qxd0.t(numValueOf2, x340Var, (vu30) objT);
                x340Var.r(false);
            } else {
                x340Var = x340Var2;
                jkr0Var3 = jkr0Var2;
                x340Var.i0(-274908893);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            z4 = z;
            x340Var = x340Var3;
            c380Var2 = c380Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ncl1(cceVar, fbpVar, jkr0Var3, z4, dt71Var, dt71Var2, c380Var2, f, z2, iu30Var, qim0Var, z3, i);
        }
    }

    public static final qim0 h(qim0 qim0Var, boolean z) {
        return z ? d9y0.k(qim0Var, 0.3f) : qim0Var;
    }

    public static final ArrayList i(iu30 iu30Var) {
        bim0 bim0Var = new bim0();
        iu30Var.invoke(bim0Var);
        return q7h.V(bim0Var.a);
    }

    public static final MaybeFlatten j(String str, uu00 uu00Var) {
        return new MaybeFlatten(new MaybeFlatten(((zu00) uu00Var).b(new oi("gated-content-npv-widget", false, new kq00(str, (byte) 26))).filter(mi10.d).onErrorComplete().firstElement(), new t4o(str, (byte) 3)), new zo8(uu00Var));
    }

    public static final kob k(w281 w281Var) {
        u281 u281Var = w281Var.g;
        String str = u281Var != null ? u281Var.a : "";
        return (u281Var == null || ihc1.y0(str)) ? mpi1.N0 : new job(str);
    }

    public static boolean l(float f, float f2, float f3) {
        Float fM = m(f2, f3);
        if (fM != null) {
            return Math.abs(f) <= Float.MAX_VALUE && f >= 0.0f && f <= fM.floatValue() + 1.0E-6f;
        }
        return false;
    }

    public static Float m(float f, float f2) {
        if (Math.abs(f) > Float.MAX_VALUE || f <= 0.0f || Math.abs(f2) > Float.MAX_VALUE || f2 < f) {
            return null;
        }
        return Float.valueOf(1.0f - (f / f2));
    }

    public static final frr0 n(long j) {
        return new frr0(j);
    }

    public static float o(ruq0 ruq0Var, Float f) {
        float f2 = ruq0Var.P0;
        Float fValueOf = Float.valueOf(f2);
        if (Math.abs(f2) > Float.MAX_VALUE || f2 <= 0.0f) {
            fValueOf = null;
        }
        return fValueOf != null ? fValueOf.floatValue() : jch0.t(ruq0Var, f);
    }

    public static float p(ruq0 ruq0Var, Float f) {
        Integer num = ruq0Var.N0;
        float fO = o(ruq0Var, f);
        int i = ruq0Var.X;
        if (num != null && num.intValue() > 0) {
            return num.intValue() * 4.0f;
        }
        if (Math.abs(fO) > Float.MAX_VALUE || fO <= 0.0f || i <= 0) {
            return 0.0f;
        }
        return Math.max(1.0f, (fO * i) / 60000.0f);
    }

    public static Next q(kak0 kak0Var) {
        return Next.h(kak0.a(kak0Var, ndm0.a, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, (lhg1) null, (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -17, 1048575));
    }
}
