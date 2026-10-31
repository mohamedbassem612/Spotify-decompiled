package p;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import com.spotify.ageverification.dialog.view.AgeVerificationDialogActivity;
import com.spotify.mobius.Next;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class tx9 {
    public static ExecutorService a;
    public static b180 b;
    public static b180 c;

    public static final void a(hg6 hg6Var, boolean z, int i, boolean z2, qim0 qim0Var, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1951113095);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(hg6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.e(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.h(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.g(qim0Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            zj31 zj31Var = hg6Var.a;
            boolean z3 = z || !z2;
            qim0 qim0VarD = u291.d(qim0Var, 1.0f);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = ag6.d;
                x340Var.s0(objT);
            }
            zj31Var.b(new jj31(z3, i, s161.a(qim0VarD, (iu30) objT).then(jg6.a), 1, (jfe) null, hg6Var.b, (Map) null, false, false, (Function0) null, (iu30) null, 4048), x340Var, 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ig6(hg6Var, z, i, z2, qim0Var, i2, (byte) 0);
        }
    }

    public static final void b(qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-781979263);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            float f = if71.b;
            qim0Var2 = nim0.a;
            qim0 qim0VarV = u291.v(qim0Var2, f);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 48);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            mta mtaVar = cbx.b(x340Var).d;
            t1c.a(cwl1.l0(u291.r(qim0Var2, 56.0f), cbx.a(x340Var).a.b.a(), er31.a, 12), x340Var, 0);
            qim0 qim0VarZ = u291.z(u291.v(qim0Var2, s3v.b(if71.a)), (fra) null, 3);
            cvx cvxVar = cbx.b(x340Var).b;
            c(uyn1.B(qim0VarZ, 0.0f, 6.0f, 0.0f, 0.0f, 13), x340Var, 0);
            c(qim0VarZ, x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wdk(qim0Var2, i, (byte) 10);
        }
    }

    public static final void c(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(298090802);
        int i2 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwr uwrVar = cbx.a;
            uwo1.e("", (qim0) null, cbx.d(x340Var).j, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 6, 0, 2042);
            qim0 qim0VarB = h2c.a.b(nim0.a);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(0.0f, 4.0f, 1, qim0VarB);
            long jA = cbx.a(x340Var).a.b.a();
            cvx cvxVar2 = cbx.b(x340Var).b;
            t1c.a(cwl1.l0(qim0VarZ, jA, er31.b(12.0f), 12), x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wdk(qim0Var, i, (byte) 11);
        }
    }

    public static final void d(q431 q431Var, b0k b0kVar, int i) {
        q431 q431Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(21878150);
        int i2 = (x340Var.g(q431Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            q431Var2 = q431Var;
            epo1.a(q431Var2, q431Var.getUrl(), mif1.P0, u291.d(nim0.a, 1.0f), x340Var, i2 & 14);
        } else {
            q431Var2 = q431Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ps11(q431Var2, i, (byte) 20);
        }
    }

    public static final void e(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1628609922);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = hlv0.e;
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0Var, true, (iu30) objT);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            wsx wsxVar = wsx.c;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarR = u291.r(nim0Var, 16.0f);
            uwr uwrVar = cbx.a;
            w0h1.a(wsxVar, isl.a, qim0VarR, cbx.a(x340Var).b.c, 0L, false, x340Var, wsx.d | 48, 48);
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(cwl1.o0(x340Var, 2131960343), (qim0) null, ktd.l(nim0Var, 4.0f, x340Var, x340Var).k, cbx.a(x340Var).b.c, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1778);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nws0(qim0Var, i, (byte) 5);
        }
    }

    public static final void f(n531 n531Var, yjs yjsVar, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        int i3;
        qim0 qim0Var;
        Object ggx0Var;
        boolean z;
        yjs yjsVar2 = yjsVar;
        List list = n531Var.d;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1653040574);
        j06 j06Var = ((x340) b0kVar3).a;
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? b0kVar3.g(n531Var) : b0kVar3.i(n531Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? b0kVar3.g(yjsVar2) : b0kVar3.i(yjsVar2) ? 32 : 16;
        }
        int i4 = i2;
        if (b0kVar3.Y(i4 & 1, (i4 & 19) != 18)) {
            boolean z2 = (i4 & 14) == 4 || ((i4 & 8) != 0 && b0kVar3.i(n531Var));
            Object objT = b0kVar3.T();
            if (z2 || objT == m4cVar) {
                objT = new g521(n531Var, (byte) 11);
                b0kVar3.s0(objT);
            }
            kes kesVarB = lkr0.b(0, (Function0) objT, b0kVar3, 0, 3);
            h631 h631Var = (h631) o7h.t0(((err0) ((jkr0) kesVarB).d.c).s(), list);
            uwr uwrVar = cbx.a;
            int iH = (int) jfv.h(cbx.c(b0kVar3).b.b);
            tob1 tob1VarA = w191.a(r(h631Var != null ? h631Var.e.a : null), irn1.o0(iH, 0, (dlv) null, 6), "gradientStart", b0kVar3, 384, 8);
            tob1 tob1VarA2 = w191.a(r(h631Var != null ? h631Var.e.b : null), irn1.o0(iH, 0, (dlv) null, 6), "gradientEnd", b0kVar3, 384, 8);
            wat watVar = (wat) b0kVar3.k(t4k.h);
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = bb00.h(0, b0kVar3);
            }
            err0 err0Var = (hdn0) objT2;
            float fM0 = watVar.M0(err0Var.s());
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var2, 1.0f);
            boolean zI = b0kVar3.i(tob1VarA) | b0kVar3.i(tob1VarA2);
            Object objT3 = b0kVar3.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new dy(tob1VarA, tob1VarA2, (byte) 9);
                b0kVar3.s0(objT3);
            }
            qim0 qim0VarQ = exd0.q(qim0VarD, (iu30) objT3);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarQ);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z3 = ((x340) b0kVar3).S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, b0kVar3, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar3, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar3, lljVar3);
            nko1.F(b0kVar3);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar3, lljVar4);
            qim0 qim0VarD2 = u291.d(qim0Var2, 1.0f);
            qti1 qti1Var = voo1.c;
            qim0 qim0VarH = l6o1.H(voo1.y(qim0VarD2, qti1Var), l6o1.C(0, 0, 1, b0kVar3), false, 14);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, b0kVar3, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM2 = b0kVar3.m();
            qim0 qim0VarE2 = zr7.E(b0kVar3, qim0VarH);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA, b0kVar3, lljVar);
            nko1.H(xos0VarM2, b0kVar3, lljVar2);
            x0d.q(iHashCode2, b0kVar3, lljVar3, b0kVar3);
            nko1.H(qim0VarE2, b0kVar3, lljVar4);
            op71.g(b0kVar3, u291.h(qim0Var2, ywx0.k(qim0Var2, fM0, b0kVar3, b0kVar3).b.b));
            uwo1.e(n531Var.a, uyn1.z(cbx.b(b0kVar3).e.c, 0.0f, 2, u291.f(qim0Var2, 1.0f)), cbx.d(b0kVar3).d, cbx.a(b0kVar3).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar3, 0, 0, 2016);
            cvx cvxVar = cbx.b(b0kVar3).b;
            op71.g(b0kVar3, u291.h(qim0Var2, 4.0f));
            uwo1.e(n531Var.b, uyn1.z(cbx.b(b0kVar3).e.c, 0.0f, 2, u291.f(qim0Var2, 1.0f)), cbx.d(b0kVar3).k, cbx.a(b0kVar3).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar3, 0, 0, 2016);
            b0kVar2 = b0kVar3;
            op71.g(b0kVar2, u291.h(qim0Var2, cbx.b(b0kVar2).b.b));
            String str = n531Var.f;
            int i5 = i4 & 112;
            boolean z4 = i5 == 32 || ((i4 & 64) != 0 && b0kVar2.i(yjsVar2));
            Object objT4 = b0kVar2.T();
            if (z4 || objT4 == m4cVar) {
                i3 = 32;
                qim0Var = qim0Var2;
                v3v0 v3v0Var = new v3v0(1, yjsVar2, yjs.class, "onWinnerShown", "onWinnerShown(I)V", 0, (byte) 24);
                b0kVar2.s0(v3v0Var);
                objT4 = v3v0Var;
            } else {
                qim0Var = qim0Var2;
                i3 = 32;
            }
            vby0.m(list, kesVarB, str, (iu30) objT4, b0kVar2, 0);
            op71.g(b0kVar2, u291.h(qim0Var, cbx.b(b0kVar2).b.b));
            b631 b631Var = n531Var.e;
            String str2 = b631Var.a;
            String str3 = b631Var.b;
            boolean zI2 = b0kVar2.i(kesVarB) | (i5 == i3 || ((i4 & 64) != 0 && b0kVar2.i(yjsVar2)));
            Object objT5 = b0kVar2.T();
            if (zI2 || objT5 == m4cVar) {
                objT5 = new rl21(yjsVar2, kesVarB, (byte) 3);
                b0kVar2.s0(objT5);
            }
            g(0, str2, str3, (Function0) objT5, b0kVar2);
            b0kVar2.r(true);
            qim0 qim0VarY = voo1.y(qim0Var, qti1Var);
            boolean zI3 = b0kVar2.i(err0Var);
            Object objT6 = b0kVar2.T();
            if (zI3 || objT6 == m4cVar) {
                objT6 = new myg0(err0Var, (byte) 19);
                b0kVar2.s0(objT6);
            }
            qim0 qim0VarU = lrn1.u(qim0VarY, (iu30) objT6);
            Object objT7 = b0kVar2.T();
            if (objT7 == m4cVar) {
                objT7 = xt21.R0;
                b0kVar2.s0(objT7);
            }
            qim0 qim0VarB = s161.b(qim0VarU, false, (iu30) objT7);
            boolean z5 = i5 == i3 || ((i4 & 64) != 0 && b0kVar2.i(yjsVar2));
            Object objT8 = b0kVar2.T();
            if (z5 || objT8 == m4cVar) {
                yjsVar2 = yjsVar;
                z = true;
                ggx0Var = new ggx0(0, yjsVar2, yjs.class, "onCloseClicked", "onCloseClicked()V", 0, (byte) 19);
                b0kVar2.s0(ggx0Var);
            } else {
                z = true;
                ggx0Var = objT8;
                yjsVar2 = yjsVar2;
            }
            h(0, (Function0) ggx0Var, b0kVar2, qim0VarB);
            q431 q431Var = n531Var.c;
            if (q431Var == null) {
                b0kVar2.i0(938959605);
            } else {
                b0kVar2.i0(938959606);
                d(q431Var, b0kVar2, 0);
            }
            b0kVar2.r(false);
            b0kVar2.r(z);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wjz0(n531Var, yjsVar2, i, (byte) 11);
        }
    }

    public static final void g(int i, String str, String str2, Function0 function0, b0k b0kVar) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1220656059);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new sc21(str2, (byte) 9);
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(nim0.a, true, (iu30) objT);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = ktd.n(x340Var);
            }
            qim0 qim0VarV = bin.v(qim0VarB, (idn0) objT2, (ga80) null, false, (String) null, new pm31(0), function0, 12);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), een.N0, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            gfx.b(8, udj.b, x340Var, 54);
            uwo1.e(str, (qim0) null, cbx.d(x340Var).k, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i2 & 14, 0, 2034);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tq6(str, str2, function0, i, (byte) 5);
        }
    }

    public static final void h(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-157841840);
        int i2 = i | (x340Var.i(qim0Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarX = uyn1.x(qim0VarF, cbx.b(x340Var).e.b);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
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
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new us21(function0, (byte) 1);
                x340Var.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (ihc1.y0("Close")) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                wro1.h(new gbx(new y50("Close"), function1), new idx(18), (qim0) null, (max) null, yla.s(x340Var), (vzq0) null, false, (idn0) null, (ga80) null, udj.a, x340Var, 0, 6, 988);
                x340Var.r(true);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new t531(qim0Var, function0, i, (byte) 0);
        }
    }

    public static final boolean i(tr80 tr80Var, tr80 tr80Var2) {
        return ((rr80) tr80Var).a <= ((rr80) tr80Var2).b && ((rr80) tr80Var2).a <= ((rr80) tr80Var).b;
    }

    public static final ArrayList j(th91 th91Var) {
        c380 c380Var = th91Var.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : c380Var) {
            if (((oh91) obj).c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((oh91) it.next()).a);
        }
        return arrayList2;
    }

    public static final th91 k(List list, ArrayList arrayList, int i, boolean z, List list2) {
        Object next;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Iterator it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!u890.j(((oh91) next).a, str));
            oh91 oh91Var = (oh91) next;
            if (oh91Var != null) {
                arrayList2.add(oh91Var);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list) {
            if (!((oh91) obj).c) {
                arrayList3.add(obj);
            }
        }
        return new th91(mqo1.A(o7h.N0(arrayList3, arrayList2)), !arrayList.isEmpty(), i, z, list2);
    }

    public static Intent l(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) AgeVerificationDialogActivity.class);
        int i = AgeVerificationDialogActivity.n1;
        intent.putExtra("EXTRA_ENTITY_URI", str);
        intent.putExtra("EXTRA_COVER_ART_URI", str2);
        return intent;
    }

    public static rv30 m(lv30 lv30Var, boolean z) {
        List list = lv30Var.X;
        rv30 rv30Var = new rv30(lv30Var, null, 1, z);
        rob0 rob0VarQ0 = lv30Var.q0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((y0h1) obj).x() != 2) {
                break;
            }
            arrayList.add(obj);
        }
        ba80 ba80VarU1 = o7h.u1(arrayList);
        ArrayList arrayList2 = new ArrayList(q7h.U(ba80VarU1, 10));
        ca80 it = ba80VarU1.iterator();
        while (true) {
            ca80 ca80Var = it;
            if (!((Iterator) ca80Var.c).hasNext()) {
                qx81 qx81VarM = ((y0h1) o7h.A0(list)).m();
                lht lhtVar = mht.e;
                List list2 = z6x.a;
                rv30Var.B1(null, rob0VarQ0, list2, list2, arrayList2, qx81VarM, 4, lhtVar);
                rv30 rv30Var2 = rv30Var;
                rv30Var2.X0 = true;
                return rv30Var2;
            }
            aa80 aa80Var = (aa80) ca80Var.next();
            int i = aa80Var.a;
            y0h1 y0h1Var = (y0h1) aa80Var.b;
            String strB = y0h1Var.getName().b();
            rv30 rv30Var3 = rv30Var;
            arrayList2.add(new tsi1(rv30Var3, null, i, rzs0.g, ajn0.e(strB.equals("T") ? "instance" : strB.equals("E") ? "receiver" : strB.toLowerCase(Locale.ROOT)), y0h1Var.m(), false, false, false, null, mka1.m0));
            rv30Var = rv30Var3;
        }
    }

    public static synchronized Executor n() {
        ExecutorService executorServiceNewSingleThreadExecutor;
        executorServiceNewSingleThreadExecutor = a;
        if (executorServiceNewSingleThreadExecutor == null) {
            String str = zoi1.a;
            executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ask("ExoPlayer:BackgroundExecutor", (byte) 1));
            a = executorServiceNewSingleThreadExecutor;
        }
        return executorServiceNewSingleThreadExecutor;
    }

    public static LinkedHashMap o(int i, Long l) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("reason", xvj1.c(i));
        if (l != null) {
            long jLongValue = l.longValue();
            Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC")).setTimeInMillis(jLongValue);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss", Locale.getDefault());
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            linkedHashMap.put("expiresAt", simpleDateFormat.format(Long.valueOf(jLongValue)));
        }
        return linkedHashMap;
    }

    public static brl0 p(String str) {
        return new brl0(str, (byte) 10);
    }

    public static Next q(q41 q41Var, int i) {
        v31 v31Var = q41Var.a;
        q41 q41VarA = q41.a(q41Var, v31.a(v31Var, (l3f0) null, (Boolean) null, (w01) null, false, 15), (s31) null, 6);
        k31 k31Var = new k31(i);
        w01 w01Var = v31Var.d;
        return Next.h(q41.a(q41VarA, (p41) null, new s31(8, (String) null, k31Var, w01Var != null ? w01Var.a : null, 2), 5));
    }

    public static final long r(String str) {
        u7h m231Var;
        if (str != null) {
            try {
                m231Var = new u7h(z4p1.e(Color.parseColor(str)));
            } catch (Throwable th) {
                m231Var = new m231(th);
            }
            if (m231Var instanceof m231) {
                m231Var = null;
            }
            u7h u7hVar = m231Var;
            if (u7hVar != null) {
                return u7hVar.a;
            }
        }
        uwr uwrVar = cbx.a;
        return ((vex) zex.a.b).c;
    }

    public static final ArrayList s(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((oh91) it.next()).a);
        }
        Set setP1 = o7h.p1(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList) {
            if (setP1.contains((String) obj)) {
                arrayList4.add(obj);
            }
        }
        List listJ0 = o7h.j0(arrayList4);
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (((oh91) obj2).c) {
                arrayList5.add(obj2);
            }
        }
        ArrayList arrayList6 = new ArrayList(q7h.U(arrayList5, 10));
        Iterator it2 = arrayList5.iterator();
        while (it2.hasNext()) {
            arrayList6.add(((oh91) it2.next()).a);
        }
        List list = listJ0;
        ArrayList arrayList7 = new ArrayList();
        for (Object obj3 : arrayList6) {
            if (!listJ0.contains((String) obj3)) {
                arrayList7.add(obj3);
            }
        }
        return o7h.N0(arrayList7, list);
    }

    public static final boolean t(boolean z, boolean z2, boolean z3) {
        return z && z2 && z3;
    }

    public static final void u(CharSequence charSequence, char[] cArr, int i, int i2, int i3) {
        if (charSequence instanceof i4e1) {
            u(((i4e1) charSequence).d, cArr, i, i2, i3);
            return;
        }
        while (i2 < i3) {
            cArr[i] = charSequence.charAt(i2);
            i2++;
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:163:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:164:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:166:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:167:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:170:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:171:0x02be  */
    /* JADX WARN: Code duplicated, block: B:173:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:174:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:176:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:177:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:179:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:180:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:187:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:192:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:65:0x0101  */
    public static Next v(q41 q41Var, w11 w11Var) {
        l3f0 l3f0Var;
        w01 w01Var;
        l3f0 l3f0Var2;
        w01 w01Var2;
        l3f0 l3f0Var3;
        w01 w01Var3;
        String str;
        String str2;
        pwe0 pwe0Var;
        boolean z;
        pwe0 pwe0Var2;
        owe0 owe0Var;
        kwe0 kwe0Var;
        String str3;
        pwe0 pwe0Var3;
        owe0 owe0Var2;
        boolean z2;
        boolean z3;
        axe0 axe0Var;
        gxe0 hxe0Var;
        a11 a11Var = q41Var.c;
        v31 v31Var = q41Var.a;
        if (w11Var instanceof scd1) {
            v31 v31Var2 = v31Var;
            if (v31Var2.e) {
                return Next.j();
            }
            return v31Var2.a != null ? Next.a(Collections.singleton(exe0.a)) : qbo1.d(q41Var, false, 0, 6);
        }
        if (w11Var instanceof pxe0) {
            pxe0 pxe0Var = (pxe0) w11Var;
            v31 v31Var3 = v31Var;
            if (v31Var3.a == null) {
                return qbo1.d(q41Var, false, 0, 6);
            }
            uf8 uf8Var = pxe0Var.a;
            if (uf8Var == null) {
                return Next.h(q41.a(q41Var, (p41) null, new s31(0, (String) null, h31.a, (bk8) null, 11), 5));
            }
            uxe0 uxe0Var = pxe0Var.b;
            q41 q41VarA = q41.a(q41Var, v31.a(v31Var3, uxe0Var != null ? uxe0Var.a : null, uxe0Var != null ? Boolean.valueOf(uxe0Var.b) : null, pxe0Var.c, false, 17), (s31) null, 6);
            v31 v31Var4 = q41VarA.a;
            if (uf8Var instanceof rf8) {
                return qbo1.d(q41VarA, false, 0, 6);
            }
            if (uf8Var instanceof tf8) {
                wwe0 wwe0Var = v31Var4.a;
                if (!(wwe0Var instanceof wwe0)) {
                    return qbo1.d(q41VarA, false, 0, 6);
                }
                wwe0 wwe0Var2 = wwe0Var;
                return Next.i(q41VarA, Collections.singleton(new fxe0(wwe0Var2.a, wwe0Var2.b, (tf8) uf8Var)));
            }
            if (!(uf8Var instanceof uf8)) {
                if (!(uf8Var instanceof sf8)) {
                    eg.o();
                    return null;
                }
                v31 v31Var5 = v31Var4;
                pwe0 pwe0Var4 = v31Var5.a;
                if (!(pwe0Var4 instanceof pwe0)) {
                    return qbo1.d(q41VarA, false, 0, 6);
                }
                kwe0 kwe0Var2 = pwe0Var4.a;
                if (u890.j(kwe0Var2, jwe0.a)) {
                    axe0Var = new axe0((sf8) uf8Var);
                } else if (u890.j(kwe0Var2, mwe0.a)) {
                    axe0Var = new dxe0((sf8) uf8Var);
                } else if (u890.j(kwe0Var2, nwe0.a)) {
                    l3f0 l3f0Var4 = v31Var5.b;
                    axe0Var = l3f0Var4 != null ? new cxe0(l3f0Var4) : new dxe0((sf8) uf8Var);
                } else if (kwe0Var2 instanceof kwe0) {
                    axe0Var = new bxe0(kwe0Var2.a, (sf8) uf8Var);
                } else {
                    if (!u890.j(kwe0Var2, lwe0.a)) {
                        eg.o();
                        return null;
                    }
                    axe0Var = new axe0((sf8) uf8Var);
                }
                return Next.i(q41VarA, Collections.singleton(axe0Var));
            }
            v31 v31Var6 = v31Var4;
            vwe0 vwe0Var = v31Var6.a;
            if (!(vwe0Var instanceof vwe0)) {
                return qbo1.d(q41VarA, false, 0, 6);
            }
            swe0 swe0Var = vwe0Var.a;
            if (u890.j(swe0Var, qwe0.a)) {
                hxe0Var = new gxe0(uf8Var);
            } else if (u890.j(swe0Var, twe0.a)) {
                hxe0Var = new ixe0(uf8Var);
            } else {
                if (!(swe0Var instanceof swe0)) {
                    eg.o();
                    return null;
                }
                String str4 = swe0Var.a;
                uf8 uf8Var2 = uf8Var;
                l3f0 l3f0Var5 = v31Var6.b;
                if (l3f0Var5 instanceof i3f0) {
                    lj01 lj01Var = q41VarA.c.c;
                    lj01 lj01Var2 = lj01Var instanceof lj01 ? lj01Var : null;
                    if (lj01Var2 == null || !lj01Var2.e) {
                        l3f0Var5 = null;
                    }
                } else {
                    l3f0Var5 = null;
                }
                w01 w01Var4 = v31Var6.d;
                hxe0Var = new hxe0(str4, uf8Var2, l3f0Var5, w01Var4 != null ? w01Var4.a : null);
            }
            return Next.i(q41VarA, Collections.singleton(hxe0Var));
        }
        if (w11Var instanceof qxe0) {
            rf8 rf8Var = ((qxe0) w11Var).a;
            if (rf8Var instanceof tf8) {
                return Next.h(q41.a(q41Var, new h41(new r21(((tf8) rf8Var).c)), (s31) null, 6));
            }
            if (rf8Var instanceof rf8) {
                v31 v31Var7 = v31Var;
                h3f0 h3f0Var = v31Var7.b;
                if (h3f0Var instanceof h3f0) {
                    rf8 rf8Var2 = rf8Var;
                    if (rf8Var2.c.length != 0) {
                        return Next.i(q41.a(q41Var, v31.a(v31Var7, (l3f0) null, (Boolean) null, (w01) null, true, 15), (s31) null, 6), Collections.singleton(new zwe0(h3f0Var.a, rf8Var2)));
                    }
                }
                q41 q41VarA2 = q41.a(q41Var, v31.a(v31Var7, (l3f0) null, (Boolean) null, (w01) null, false, 15), (s31) null, 6);
                k31 k31Var = new k31(3);
                w01 w01Var5 = v31Var7.d;
                return Next.i(q41.a(q41VarA2, (p41) null, new s31(0, (String) null, k31Var, w01Var5 != null ? w01Var5.a : null, 3), 5), Collections.singleton(new ywe0(rf8Var)));
            }
            if (rf8Var instanceof uf8) {
                uf8 uf8Var3 = (uf8) rf8Var;
                String str5 = uf8Var3.c;
                int i = uf8Var3.d;
                vwe0 vwe0Var2 = v31Var.a;
                boolean z4 = vwe0Var2 instanceof vwe0;
                vwe0 vwe0Var3 = z4 ? vwe0Var2 : null;
                uwe0 uwe0Var = vwe0Var3 != null ? vwe0Var3.a : null;
                swe0 swe0Var2 = uwe0Var instanceof swe0 ? (swe0) uwe0Var : null;
                String str6 = swe0Var2 != null ? swe0Var2.a : null;
                vwe0 vwe0Var4 = z4 ? vwe0Var2 : null;
                return Next.h(q41.a(q41Var, new h41(new q21(i, str5, str6, (vwe0Var4 != null ? vwe0Var4.a : null) instanceof twe0)), (s31) null, 6));
            }
            if (!(rf8Var instanceof sf8)) {
                eg.o();
                return null;
            }
            v31 v31Var8 = v31Var;
            v2f0 v2f0Var = v31Var8.b;
            if (!(v2f0Var instanceof v2f0)) {
                if (v2f0Var instanceof w2f0) {
                    str2 = ((w2f0) v2f0Var).a;
                } else {
                    str = null;
                }
                sf8 sf8Var = (sf8) rf8Var;
                String str7 = sf8Var.c;
                int i2 = sf8Var.d;
                pwe0Var = v31Var8.a;
                z = pwe0Var instanceof pwe0;
                if (z) {
                    pwe0Var2 = pwe0Var;
                } else {
                    pwe0Var2 = null;
                }
                if (pwe0Var2 != null) {
                    owe0Var = pwe0Var2.a;
                } else {
                    owe0Var = null;
                }
                if (owe0Var instanceof kwe0) {
                    kwe0Var = (kwe0) owe0Var;
                } else {
                    kwe0Var = null;
                }
                if (kwe0Var != null) {
                    str3 = kwe0Var.a;
                } else {
                    str3 = null;
                }
                if (z) {
                    pwe0Var3 = pwe0Var;
                } else {
                    pwe0Var3 = null;
                }
                if (pwe0Var3 != null) {
                    owe0Var2 = pwe0Var3.a;
                } else {
                    owe0Var2 = null;
                }
                if (!(owe0Var2 instanceof mwe0) || (owe0Var2 instanceof nwe0)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (v2f0Var == null && v2f0Var.a()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                return Next.h(q41.a(q41Var, new h41(new p21(i2, 48, sf8Var.g, str7, str3, str, z2, z3)), (s31) null, 6));
            }
            str2 = v2f0Var.a;
            str = str2;
            sf8 sf8Var2 = (sf8) rf8Var;
            String str8 = sf8Var2.c;
            int i3 = sf8Var2.d;
            pwe0Var = v31Var8.a;
            z = pwe0Var instanceof pwe0;
            if (z) {
                pwe0Var2 = pwe0Var;
            } else {
                pwe0Var2 = null;
            }
            if (pwe0Var2 != null) {
                owe0Var = pwe0Var2.a;
            } else {
                owe0Var = null;
            }
            if (owe0Var instanceof kwe0) {
                kwe0Var = (kwe0) owe0Var;
            } else {
                kwe0Var = null;
            }
            if (kwe0Var != null) {
                str3 = kwe0Var.a;
            } else {
                str3 = null;
            }
            if (z) {
                pwe0Var3 = pwe0Var;
            } else {
                pwe0Var3 = null;
            }
            if (pwe0Var3 != null) {
                owe0Var2 = pwe0Var3.a;
            } else {
                owe0Var2 = null;
            }
            if (owe0Var2 instanceof mwe0) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (v2f0Var == null) {
                z3 = false;
            } else {
                z3 = false;
            }
            return Next.h(q41.a(q41Var, new h41(new p21(i3, 48, sf8Var2.g, str8, str3, str, z2, z3)), (s31) null, 6));
        }
        if (w11Var instanceof oxe0) {
            oxe0 oxe0Var = (oxe0) w11Var;
            v31 v31Var9 = v31Var;
            Boolean bool = v31Var9.c;
            if (bool == null || (l3f0Var3 = v31Var9.b) == null || (w01Var3 = v31Var9.d) == null) {
                return qbo1.d(q41Var, true, 0, 6);
            }
            bk8 bk8Var = w01Var3.a;
            bw80 bw80Var = oxe0Var.a;
            if (bw80Var instanceof bw80) {
                di8 di8Var = bw80Var.a;
                return Next.i(new q41(new t31(v31Var9.d, bool.booleanValue(), di8Var.a, v31Var9.b, new ri8(di8Var.c.b), di8Var, (n5o) null), (s31) null, a11Var), Collections.singleton(new ni8(di8Var)));
            }
            if (bw80Var instanceof aw80) {
                return v9p1.w(new rq81(false, ((aw80) bw80Var).a.i), l3f0Var3, bk8Var, q41Var);
            }
            if (!(bw80Var instanceof vv80)) {
                return bw80Var instanceof xv80 ? Next.h(q41.a(q41Var, (p41) null, new s31(5, (String) null, new a31(bk8Var), (bk8) null, 10), 5)) : qbo1.d(q41Var, true, 0, 6);
            }
            zxo1 zxo1Var = ((vv80) bw80Var).a;
            boolean zBooleanValue = bool.booleanValue();
            l3f0 l3f0Var6 = v31Var9.b;
            v31 v31Var10 = v31Var instanceof v31 ? v31Var : null;
            return Next.i(new q41(new v31(v31Var10 != null ? v31Var10.a : null, l3f0Var6, bool, (w01) null, zxo1Var instanceof rf8), (s31) null, a11Var), Collections.singleton(new jxe0(zxo1Var, new uxe0(l3f0Var6, zBooleanValue))));
        }
        if (w11Var instanceof kxe0) {
            kxe0 kxe0Var = (kxe0) w11Var;
            v31 v31Var11 = v31Var;
            Boolean bool2 = v31Var11.c;
            if (bool2 == null || v31Var11.b == null || v31Var11.d == null) {
                return qbo1.d(q41Var, false, 0, 6);
            }
            qm8 qm8Var = kxe0Var.a;
            if (qm8Var instanceof qm8) {
                di8 di8Var2 = qm8Var.a;
                return Next.i(new q41(new t31(v31Var11.d, bool2.booleanValue(), di8Var2.a, v31Var11.b, new ri8(di8Var2.c.b), di8Var2, (n5o) null), (s31) null, a11Var), Collections.singleton(new ni8(di8Var2)));
            }
            if (qm8Var instanceof lm8) {
                zxo1 zxo1Var2 = ((lm8) qm8Var).a;
                boolean zBooleanValue2 = bool2.booleanValue();
                l3f0 l3f0Var7 = v31Var11.b;
                w01 w01Var6 = v31Var11.d;
                v31 v31Var12 = v31Var instanceof v31 ? v31Var : null;
                return Next.i(new q41(new v31(v31Var12 != null ? v31Var12.a : null, l3f0Var7, bool2, w01Var6, zxo1Var2 instanceof rf8), (s31) null, a11Var), Collections.singleton(new jxe0(zxo1Var2, new uxe0(l3f0Var7, zBooleanValue2))));
            }
            if (qm8Var instanceof nm8) {
                return q(q41Var, 2);
            }
            if (qm8Var instanceof mm8) {
                return q(q41Var, 3);
            }
            if (qm8Var instanceof om8) {
                return q(q41Var, 3);
            }
            eg.o();
            return null;
        }
        if (w11Var instanceof rxe0) {
            return q(q41Var, ((rxe0) w11Var).a);
        }
        if (w11Var instanceof sxe0) {
            sxe0 sxe0Var = (sxe0) w11Var;
            v31 v31Var13 = v31Var;
            Boolean bool3 = v31Var13.c;
            if (bool3 == null || (l3f0Var2 = v31Var13.b) == null || (w01Var2 = v31Var13.d) == null) {
                return qbo1.d(q41Var, false, 0, 6);
            }
            q341 q341Var = sxe0Var.a;
            if (q341Var instanceof q341) {
                di8 di8Var3 = q341Var.a;
                return Next.i(new q41(new t31(v31Var13.d, bool3.booleanValue(), di8Var3.a, v31Var13.b, new ri8(di8Var3.c.b), di8Var3, (n5o) null), (s31) null, a11Var), Collections.singleton(new ni8(di8Var3)));
            }
            if (q341Var instanceof k341) {
                zxo1 zxo1Var3 = ((k341) q341Var).a;
                boolean zBooleanValue3 = bool3.booleanValue();
                l3f0 l3f0Var8 = v31Var13.b;
                v31 v31Var14 = v31Var instanceof v31 ? v31Var : null;
                return Next.i(new q41(new v31(v31Var14 != null ? v31Var14.a : null, l3f0Var8, bool3, (w01) null, zxo1Var3 instanceof rf8), (s31) null, a11Var), Collections.singleton(new jxe0(zxo1Var3, new uxe0(l3f0Var8, zBooleanValue3))));
            }
            if (q341Var instanceof p341) {
                return v9p1.w(new rq81(false, ((p341) q341Var).a.i), l3f0Var2, w01Var2.a, q41Var);
            }
            if (!(q341Var instanceof n341)) {
                return q341Var instanceof m341 ? qbo1.d(q41Var, true, 0, 6) : qbo1.d(q41Var, true, 0, 6);
            }
            Integer num = ((n341) q341Var).a.a;
            return qbo1.c(q41Var, false, 9, num != null ? String.valueOf(num.intValue()) : null);
        }
        if (w11Var instanceof txe0) {
            txe0 txe0Var = (txe0) w11Var;
            v31 v31Var15 = v31Var;
            Boolean bool4 = v31Var15.c;
            if (bool4 == null || v31Var15.b == null) {
                return qbo1.d(q41Var, false, 0, 6);
            }
            s341 s341Var = txe0Var.a;
            if (s341Var instanceof s341) {
                uf8 uf8Var4 = s341Var.a;
                boolean zBooleanValue4 = bool4.booleanValue();
                l3f0 l3f0Var9 = v31Var15.b;
                v31 v31Var16 = v31Var instanceof v31 ? v31Var : null;
                return Next.i(new q41(new v31(v31Var16 != null ? v31Var16.a : null, l3f0Var9, bool4, (w01) null, false), (s31) null, a11Var), Collections.singleton(new jxe0(uf8Var4, new uxe0(l3f0Var9, zBooleanValue4))));
            }
            if (s341Var instanceof u341) {
                Integer num2 = ((u341) s341Var).a.a;
                return qbo1.c(q41Var, false, 9, num2 != null ? String.valueOf(num2.intValue()) : null);
            }
            if (s341Var instanceof t341) {
                return qbo1.d(q41Var, true, 0, 6);
            }
            eg.o();
            return null;
        }
        if (w11Var instanceof lxe0) {
            lxe0 lxe0Var = (lxe0) w11Var;
            v31 v31Var17 = v31Var;
            Boolean bool5 = v31Var17.c;
            if (bool5 == null || (l3f0Var = v31Var17.b) == null || (w01Var = v31Var17.d) == null) {
                return qbo1.d(q41Var, false, 0, 6);
            }
            eww ewwVar = lxe0Var.a;
            if (ewwVar instanceof eww) {
                di8 di8Var4 = ewwVar.a;
                return Next.i(new q41(new t31(v31Var17.d, bool5.booleanValue(), di8Var4.a, v31Var17.b, new ri8(di8Var4.c.b), di8Var4, (n5o) null), (s31) null, a11Var), Collections.singleton(new ni8(di8Var4)));
            }
            if (ewwVar instanceof yvw) {
                zxo1 zxo1Var4 = ((yvw) ewwVar).a;
                boolean zBooleanValue5 = bool5.booleanValue();
                l3f0 l3f0Var10 = v31Var17.b;
                v31 v31Var18 = v31Var instanceof v31 ? v31Var : null;
                return Next.i(new q41(new v31(v31Var18 != null ? v31Var18.a : null, l3f0Var10, bool5, (w01) null, zxo1Var4 instanceof rf8), (s31) null, a11Var), Collections.singleton(new jxe0(zxo1Var4, new uxe0(l3f0Var10, zBooleanValue5))));
            }
            if (ewwVar instanceof dww) {
                return v9p1.w(new rq81(false, ((dww) ewwVar).a.i), l3f0Var, w01Var.a, q41Var);
            }
            if (ewwVar instanceof bww) {
                Integer num3 = ((bww) ewwVar).a.a;
                return qbo1.c(q41Var, false, 10, num3 != null ? String.valueOf(num3.intValue()) : null);
            }
            boolean z5 = ewwVar instanceof aww;
            String str9 = lxe0Var.b;
            int i4 = lxe0Var.d;
            if (z5) {
                return Next.h(q41.a(q41Var, new h41(new p21(i4, 412, 0L, str9, null, null, false, l3f0Var.a())), (s31) null, 6));
            }
            return Next.h(q41.a(q41Var, new h41(new p21(i4, 428, 0L, str9, null, null, false, l3f0Var.a())), (s31) null, 6));
        }
        if (!(w11Var instanceof nxe0)) {
            if (!(w11Var instanceof mxe0)) {
                return qbo1.d(q41Var, false, 0, 6);
            }
            mxe0 mxe0Var = (mxe0) w11Var;
            v31 v31Var19 = v31Var;
            Boolean bool6 = v31Var19.c;
            if (bool6 == null || v31Var19.b == null) {
                return qbo1.d(q41Var, false, 0, 6);
            }
            jh8 jh8Var = mxe0Var.a;
            if (!(jh8Var instanceof jh8)) {
                return qbo1.d(q41Var, false, 0, 6);
            }
            zxo1 zxo1Var5 = jh8Var.a;
            boolean zBooleanValue6 = bool6.booleanValue();
            l3f0 l3f0Var11 = v31Var19.b;
            v31 v31Var20 = v31Var instanceof v31 ? v31Var : null;
            return Next.i(new q41(new v31(v31Var20 != null ? v31Var20.a : null, l3f0Var11, bool6, (w01) null, zxo1Var5 instanceof rf8), (s31) null, a11Var), Collections.singleton(new jxe0(zxo1Var5, new uxe0(l3f0Var11, zBooleanValue6))));
        }
        nxe0 nxe0Var = (nxe0) w11Var;
        v31 v31Var21 = v31Var;
        Boolean bool7 = v31Var21.c;
        if (bool7 == null || v31Var21.b == null) {
            return qbo1.d(q41Var, false, 0, 6);
        }
        gww gwwVar = nxe0Var.a;
        if (gwwVar instanceof gww) {
            sf8 sf8Var3 = gwwVar.a;
            boolean zBooleanValue7 = bool7.booleanValue();
            l3f0 l3f0Var12 = v31Var21.b;
            v31 v31Var22 = v31Var instanceof v31 ? v31Var : null;
            return Next.i(new q41(new v31(v31Var22 != null ? v31Var22.a : null, l3f0Var12, bool7, (w01) null, false), (s31) null, a11Var), Collections.singleton(new jxe0(sf8Var3, new uxe0(l3f0Var12, zBooleanValue7))));
        }
        if (gwwVar instanceof iww) {
            Integer num4 = ((iww) gwwVar).a.a;
            return qbo1.c(q41Var, false, 10, num4 != null ? String.valueOf(num4.intValue()) : null);
        }
        if (gwwVar instanceof hww) {
            return qbo1.d(q41Var, true, 0, 6);
        }
        eg.o();
        return null;
    }

    public static Next w(kak0 kak0Var, z1k0 z1k0Var) {
        return Next.h(kak0.a(kak0Var, new kdm0(z1k0Var.a, z1k0Var.b), (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, (lhg1) null, (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -17, 1048575));
    }

    public static final ArrayList x(ArrayList arrayList, List list) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((oh91) obj).c) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((oh91) it.next()).a);
        }
        Set setP1 = o7h.p1(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list) {
            if (setP1.contains((String) obj2)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : setP1) {
            if (!list.contains((String) obj3)) {
                arrayList5.add(obj3);
            }
        }
        return o7h.N0(arrayList5, arrayList4);
    }

    public static final ArrayList y(ArrayList arrayList, ArrayList arrayList2) {
        Set setP1 = o7h.p1(arrayList2);
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            oh91 oh91Var = (oh91) it.next();
            arrayList3.add(new oh91(oh91Var.a, oh91Var.b, setP1.contains(oh91Var.a)));
        }
        return arrayList3;
    }
}
