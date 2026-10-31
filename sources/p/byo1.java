package p;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class byo1 {
    public static b180 a;
    public static b180 b;

    public static final void a(Function0 function0, b0k b0kVar, int i) {
        Function0 function1 = function0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-796481828);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(function1) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarH = l6o1.H(u291.h(u291.f(nim0Var, 1.0f), 512.0f), l6o1.C(0, 0, 1, x340Var), false, 14);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarH);
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
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            eso1.e(Uri.parse("https://wear.spotifycdn.com/glasses_account_linking_nudge.webp"), isl.a, u291.h(u291.f(nim0Var, 1.0f), 220.0f), (p3v) null, (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, oux.a, false, false, x340Var, 224304, 0, 3456);
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarX = uyn1.x(qim0VarF, cbx.b(x340Var).b.a);
            mbh mbhVarA2 = jbh.a(f36Var, een.Q0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarX);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            uwo1.e(cwl1.o0(x340Var, 2131956237), u291.f(nim0Var, 1.0f), cbx.d(x340Var).d, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2024);
            cvx cvxVar = cbx.b(x340Var).b;
            String strG = ydh.g(8.0f, 2131956236, x340Var, x340Var, nim0Var);
            lee1 lee1Var = cbx.d(x340Var).j;
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            cvx cvxVar2 = cbx.b(x340Var).b;
            uwo1.e(strG, uyn1.z(16.0f, 0.0f, 2, qim0VarF2), lee1Var, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2024);
            String strG2 = ydh.g(cbx.b(x340Var).b.a, 2131956235, x340Var, x340Var, nim0Var);
            boolean z2 = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new y1(function0, (byte) 5);
                x340Var.s0(objT);
            }
            Function0 function2 = (Function0) objT;
            if (ihc1.y0(strG2)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strG2), function2);
            idx idxVar = new idx(13);
            j2i j2iVarR = apo.r(1450597639, new nl(strG2, (byte) 2), x340Var);
            function1 = function0;
            foo1.c(gbxVar, idxVar, null, null, null, null, null, null, null, null, j2iVarR, x340Var, 0, 48, 2044);
            x340Var = x340Var;
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wm(function1, i, (byte) 0);
        }
    }

    public static final void b(int i, b0k b0kVar, qim0 qim0Var, boolean z, boolean z2) {
        qim0 qim0Var2;
        boolean z3;
        gra graVar = een.h;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1550084832);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | 384 | (x340Var.h(z2) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            x340Var.i0(911375616);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = xrc.d1;
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            x340Var.r(false);
            pm31 pm31Var = new pm31(3);
            qim0Var2 = nim0.a;
            qim0 qim0VarR = u291.r(dgo1.q(qim0Var2, z, z2, pm31Var, function0, 8), 24.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarR);
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
            h2c h2cVar = h2c.a;
            if (z) {
                x340Var.i0(-1038518237);
                klx klxVar = klx.c;
                uwr uwrVar = cbx.a;
                z3 = true;
                w0h1.a(klxVar, isl.a, h2cVar.a(qim0Var2, graVar), cbx.a(x340Var).c.c, 0L, false, x340Var, klx.d | 48, 48);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                z3 = true;
                x340Var.i0(-1038277491);
                qim0 qim0VarA = h2cVar.a(u291.r(qim0Var2, 20.0f), graVar);
                long j = u7h.j;
                cr31 cr31Var = er31.a;
                qim0 qim0VarF = dug.f(qim0VarA, j, cr31Var);
                uwr uwrVar2 = cbx.a;
                t1c.a(d1u.E(2.0f, cbx.a(x340Var).c.b, qim0VarF, cr31Var), x340Var, 0);
                x340Var.r(false);
            }
            x340Var.r(z3);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ovf(z, qim0Var2, z2, i);
        }
    }

    public static final void c(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-536869773);
        int i2 = i | (x340Var.i(function0) ? 4 : 2) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarY = voo1.y(u291.f(qim0Var3, 1.0f), voo1.g);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarY);
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(uyn1.B(qim0VarZ, 0.0f, 12.0f, 0.0f, 0.0f, 13), 0.0f, 0.0f, 0.0f, cbx.b(x340Var).b.c, 7);
            era eraVar = een.Q0;
            cvx cvxVar3 = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(12.0f, true, new um5(false)), eraVar, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            gtx gtxVar = gtx.c;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(gtxVar, isl.a, u291.r(qim0Var3, 32.0f), cbx.a(x340Var).b.a, 0L, false, x340Var, gtx.d | 48, 48);
            uwo1.e(cwl1.o0(x340Var, 2131963070), null, cbx.d(x340Var).e, cbx.a(x340Var).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2018);
            uwo1.e(cwl1.o0(x340Var, 2131963068), null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2018);
            cvx cvxVar4 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(qim0Var3, 4.0f));
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new in00(function0, (byte) 15);
                x340Var.s0(objT);
            }
            foo1.c(new gbx(z50.c, (Function0) objT), new idx(4), null, null, yla.r(x340Var), null, null, null, null, null, boi.a, x340Var, 0, 48, 2012);
            x340Var = x340Var;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vd1(function0, qim0Var2, i, (byte) 27);
        }
    }

    public static final void d(Instant instant, b0k b0kVar, int i) {
        String str;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-253304906);
        int i2 = (x340Var.i(instant) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            try {
                str = DateTimeFormatter.ofPattern("MMMM yyyy").withLocale(((Context) x340Var.k(AndroidCompositionLocals_androidKt.b)).getResources().getConfiguration().locale).withZone(ZoneId.systemDefault()).format(instant);
            } catch (Exception unused) {
                str = null;
            }
            String str2 = str;
            if (str2 == null) {
                x340Var.i0(51194353);
                x340Var.r(false);
            } else {
                x340Var.i0(51194354);
                String strO0 = cwl1.o0(x340Var, 2131961934);
                uwr uwrVar = cbx.a;
                uwo1.e(strO0, null, cbx.d(x340Var).m, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
                uwo1.e(str2, null, cbx.d(x340Var).k, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new t1t0(instant, i);
        }
    }

    public static final void e(String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1189989747);
        int i2 = (x340Var.g(str) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            long j = cbx.d(x340Var).m.a.b;
            cqs0 cqs0VarT = mqo1.t(new mmr0("icon", new gh80(new d6t0(7, j, j), apo.r(-1114096683, new rvh((byte) 10, j), x340Var))));
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(nim0.a, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            ye5 ye5Var = new ye5();
            z6p1.r(ye5Var, "icon", "�");
            ye5Var.g(" ");
            ye5Var.g(str);
            uwo1.d(ye5Var.p(), cbx.a(x340Var).b.a, qim0VarB, cbx.d(x340Var).k, null, null, 0, false, null, 0, null, cqs0VarT, x340Var, 0, 0, 2032);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new psr0(str, i, (byte) 13);
        }
    }

    public static final void f(Integer num, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(53560298);
        int i2 = (x340Var.g(num) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            wsx wsxVar = wsx.c;
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(wsxVar, isl.a, u291.r(qim0Var, 40.0f), num != null ? z4p1.e(num.intValue()) : u7h.k, 0L, false, x340Var, wsx.d | 48, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fbt0(num, qim0Var, i, (byte) 0);
        }
    }

    public static final void g(if5 if5Var, String str, String str2, Instant instant, Integer num, Function0 function0, qim0 qim0Var, max maxVar, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-2001292053);
        int i2 = i | (b0kVar3.i(if5Var) ? 4 : 2) | (b0kVar3.g(str) ? 32 : 16) | (b0kVar3.g(str2) ? 256 : 128) | (b0kVar3.i(instant) ? 2048 : 1024) | (b0kVar3.g(num) ? 16384 : 8192) | (b0kVar3.i(function0) ? 131072 : 65536) | (b0kVar3.i(qim0Var) ? 1048576 : 524288) | (b0kVar3.i(maxVar) ? 8388608 : 4194304);
        if (b0kVar3.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            b0kVar3.d0();
            if ((i & 1) != 0 && !b0kVar3.E()) {
                b0kVar3.b0();
            }
            b0kVar3.s();
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0Var);
            ogx ogxVar = ogx.e;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            zzq0 zzq0Var = new zzq0(16.0f, 16.0f, 16.0f, 16.0f);
            cua cuaVar = cbx.b(b0kVar3).f;
            cr31 cr31VarB = er31.b(8.0f);
            boolean z = (i2 & 458752) == 131072;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new isr0(function0, (byte) 18);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            cwl1.b(qim0VarZ, (tl3) null, cr31VarB, ogxVar, zzq0Var, maxVar, false, (idn0) null, (ga80) null, new gbx(z50.c, (Function0) objT), (gbx) null, apo.r(-536687532, new jb1((Object) num, (Object) if5Var, (Object) str, (Object) str2, (Object) instant, (byte) 28), b0kVar3), b0kVar2, (i2 >> 6) & 458752, 48, 1474);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new n(if5Var, str, str2, instant, num, function0, qim0Var, maxVar, i);
        }
    }

    public static final void h(if5 if5Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-330207271);
        int i2 = (x340Var.i(if5Var) ? 4 : 2) | i;
        if (!x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            x340Var.b0();
        } else if (if5Var == null) {
            x340Var.i0(-1729637420);
            x340Var.r(false);
        } else {
            x340Var.i0(-1729637419);
            uwr uwrVar = cbx.a;
            b3o1.j(cbx.d(x340Var).m, cbx.a(x340Var).b.b, apo.r(1605248205, new gbt0(if5Var), x340Var), x340Var, 384, 0);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gbt0(if5Var, i);
        }
    }

    public static final void i(vv01 vv01Var, agc0 agc0Var, vyq0 vyq0Var, gw70 gw70Var, i3h i3hVar, znb0 znb0Var, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        b0k b0kVar2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(2004874839);
        int i2 = i | (b0kVar3.g(vv01Var) ? 4 : 2) | (b0kVar3.i(agc0Var) ? 32 : 16) | (b0kVar3.g(vyq0Var) ? 256 : 128) | (b0kVar3.i(gw70Var) ? 2048 : 1024) | (b0kVar3.i(i3hVar) ? 16384 : 8192) | (b0kVar3.i(znb0Var) ? 131072 : 65536) | (b0kVar3.i(function0) ? 1048576 : 524288) | (b0kVar3.i(function1) ? 8388608 : 4194304);
        if (b0kVar3.Y(i2 & 1, (i2 & 4793491) != 4793490)) {
            boolean z = (i2 & 14) == 4;
            Object objT = b0kVar3.T();
            if (z || objT == m4cVar) {
                String strD = vv01Var.d();
                String title = vv01Var.getTitle();
                String subtitle = vv01Var.getSubtitle();
                ArrayList arrayListD = vyq0Var.d(vv01Var.k(), vv01Var.getEntityUri(), vv01Var.f(), vv01Var.i());
                String contentDescription = vv01Var.getContentDescription();
                m9m m9mVarB = vv01Var.b();
                boolean zH = vv01Var.h();
                objT = new eq01(strD, title, subtitle, arrayListD, contentDescription, m9mVarB, vv01Var.j(), vv01Var.g(), vv01Var.c(), Integer.valueOf(vv01Var.a()), zH, vv01Var.f(), vv01Var.l(), vv01Var.e(), eyo1.p(vv01Var.getEntityUri()), lrn1.q(vv01Var.getEntityUri(), agc0Var));
                b0kVar3.s0(objT);
            }
            eq01 eq01Var = (eq01) objT;
            boolean zG = b0kVar3.g(i3hVar);
            Object objT2 = b0kVar3.T();
            if (zG || objT2 == m4cVar) {
                v3v0 v3v0Var = new v3v0(1, i3hVar, g3h.class, "getDrawable", "getDrawable(Lcom/spotify/recents/recentsmodels/DestinationArtworkModel$CollectionType;)Landroid/graphics/drawable/Drawable;", 0, (byte) 17);
                b0kVar3.s0(v3v0Var);
                objT2 = v3v0Var;
            }
            b0kVar2 = b0kVar3;
            wwo1.g(eq01Var, gw70Var, (nla0) objT2, znb0Var, function0, function1, null, b0kVar2, (i2 >> 6) & 523376);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new n(vv01Var, agc0Var, vyq0Var, gw70Var, i3hVar, znb0Var, function0, function1, i, (byte) 25);
        }
    }

    public static final void j(vv01 vv01Var, agc0 agc0Var, vyq0 vyq0Var, fgx fgxVar, znb0 znb0Var, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(571109107);
        int i2 = i | (x340Var.g(vv01Var) ? 4 : 2) | (x340Var.i(agc0Var) ? 32 : 16) | (x340Var.g(vyq0Var) ? 256 : 128) | (x340Var.i(fgxVar) ? 2048 : 1024) | (x340Var.i(znb0Var) ? 16384 : 8192) | (x340Var.i(function0) ? 131072 : 65536) | (x340Var.i(function1) ? 1048576 : 524288);
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            ArrayList arrayListD = vyq0Var.d(vv01Var.k(), vv01Var.getEntityUri(), vv01Var.f(), vv01Var.i());
            String strD = vv01Var.d();
            String title = vv01Var.getTitle();
            String subtitle = vv01Var.getSubtitle();
            String contentDescription = vv01Var.getContentDescription();
            m9m m9mVarB = vv01Var.b();
            boolean zH = vv01Var.h();
            eq01 eq01Var = new eq01(strD, title, subtitle, arrayListD, contentDescription, m9mVarB, vv01Var.j(), vv01Var.g(), vv01Var.c(), Integer.valueOf(vv01Var.a()), zH, vv01Var.f(), vv01Var.l(), vv01Var.e(), eyo1.p(vv01Var.getEntityUri()), lrn1.q(vv01Var.getEntityUri(), agc0Var));
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                ufx ufxVar = fgxVar.a;
                objT = new hjs(ufxVar.a(), ufxVar.b(), fgxVar.b, fgxVar.c);
                x340Var.s0(objT);
            }
            qzh qzhVar = (qzh) objT;
            boolean zI = ((i2 & 3670016) == 1048576) | x340Var.i(qzhVar) | ((458752 & i2) == 131072);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new ozu0(qzhVar, function0, function1, (byte) 24);
                x340Var.s0(objT2);
            }
            iu30 iu30Var = (iu30) objT2;
            boolean zI2 = x340Var.i(qzhVar) | x340Var.i(eq01Var);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new nt01(qzhVar, eq01Var, (byte) 0);
                x340Var.s0(objT3);
            }
            dm5.a(iu30Var, (qim0) null, (iu30) objT3, x340Var, 0, 2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ydi0(vv01Var, agc0Var, vyq0Var, fgxVar, znb0Var, function0, function1, i);
        }
    }

    public static final void k(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1268611789);
        int i2 = i | (x340Var.i(function0) ? 4 : 2) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            fra fraVar = een.N0;
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new pt61(function0, (byte) 5);
                x340Var.s0(objT);
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("ShareAction", bin.x(qim0Var3, false, null, null, null, (Function0) objT, 15));
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 48);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            fsx fsxVar = fsx.c;
            uwr uwrVar = cbx.a;
            w0h1.a(fsxVar, new jsl(cwl1.o0(x340Var, 2131951792)), u291.r(uyn1.x(qim0Var3, 12.0f), 24.0f), cbx.a(x340Var).b.b, 0L, false, x340Var, fsx.d | 384, 48);
            uwo1.e(cwl1.o0(x340Var, 2131951793), null, cbx.d(x340Var).g, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new t531(function0, qim0Var2, i, (byte) 4);
        }
    }

    public static final i25 l(rf01 rf01Var) {
        return new i25(rf01Var);
    }

    public static dd70 m(pc70 pc70Var, pc70 pc70Var2, Map map, String str) {
        ld70 ld70VarM;
        ld70 ld70VarM2 = null;
        if (pc70Var != null) {
            Parcelable.Creator creator = ld70.CREATOR;
            ld70VarM = eyo1.m(pc70Var);
        } else {
            ld70VarM = null;
        }
        if (pc70Var2 != null) {
            Parcelable.Creator creator2 = ld70.CREATOR;
            ld70VarM2 = eyo1.m(pc70Var2);
        }
        return new dd70(ld70VarM, ld70VarM2, j380.c(w3p1.s(map, ld70.class, hh60.X0)), str);
    }

    public static final void n(ej50 ej50Var, aui1 aui1Var) {
        ArrayList arrayList = aui1Var.t;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            eui1 eui1Var = (cui1) arrayList.get(i);
            if (eui1Var instanceof eui1) {
                w8s0 w8s0Var = new w8s0();
                eui1 eui1Var2 = eui1Var;
                w8s0Var.d = eui1Var2.b;
                w8s0Var.n = true;
                w8s0Var.c();
                w8s0Var.s.p(eui1Var2.c);
                w8s0Var.c();
                w8s0Var.c();
                w8s0Var.b = eui1Var2.d;
                w8s0Var.c();
                w8s0Var.c = eui1Var2.e;
                w8s0Var.c();
                w8s0Var.g = eui1Var2.f;
                w8s0Var.c();
                w8s0Var.e = eui1Var2.g;
                w8s0Var.c();
                w8s0Var.f = eui1Var2.h;
                w8s0Var.o = true;
                w8s0Var.c();
                w8s0Var.h = eui1Var2.i;
                w8s0Var.o = true;
                w8s0Var.c();
                w8s0Var.i = eui1Var2.t;
                w8s0Var.o = true;
                w8s0Var.c();
                w8s0Var.j = eui1Var2.X;
                w8s0Var.o = true;
                w8s0Var.c();
                w8s0Var.k = eui1Var2.Y;
                w8s0Var.p = true;
                w8s0Var.c();
                w8s0Var.l = eui1Var2.Z;
                w8s0Var.p = true;
                w8s0Var.c();
                w8s0Var.m = eui1Var2.N0;
                w8s0Var.p = true;
                w8s0Var.c();
                ej50Var.e(i, w8s0Var);
            } else if (eui1Var instanceof aui1) {
                ej50 ej50Var2 = new ej50();
                aui1 aui1Var2 = (aui1) eui1Var;
                ej50Var2.k = aui1Var2.a;
                ej50Var2.c();
                ej50Var2.l = aui1Var2.b;
                ej50Var2.s = true;
                ej50Var2.c();
                ej50Var2.o = aui1Var2.e;
                ej50Var2.s = true;
                ej50Var2.c();
                ej50Var2.p = aui1Var2.f;
                ej50Var2.s = true;
                ej50Var2.c();
                ej50Var2.q = aui1Var2.g;
                ej50Var2.s = true;
                ej50Var2.c();
                ej50Var2.r = aui1Var2.h;
                ej50Var2.s = true;
                ej50Var2.c();
                ej50Var2.m = aui1Var2.c;
                ej50Var2.s = true;
                ej50Var2.c();
                ej50Var2.n = aui1Var2.d;
                ej50Var2.s = true;
                ej50Var2.c();
                ej50Var2.f = aui1Var2.i;
                ej50Var2.g = true;
                ej50Var2.c();
                n(ej50Var2, aui1Var2);
                ej50Var.e(i, ej50Var2);
            }
        }
    }

    public static List o() {
        return Collections.singletonList(rc11.a.b(wxi0.class));
    }

    public static final up70 p(String str, vp70 vp70Var) {
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                return new up70(new so20(str), vp70Var);
            }
        }
        return null;
    }

    public static final go80 q(klm klmVar, zcp0 zcp0Var) {
        return klmVar.a("EsperantoImageDownloaderDaemon", new nbp0(zcp0Var, (byte) 8));
    }

    public static final upo r(wy71 wy71Var, b0k b0kVar) {
        Object[] objArr = new Object[0];
        df41 df41Var = upo.m;
        boolean zE = ((x340) b0kVar).e(wy71Var.ordinal());
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        if (zE || objT == fkj0.X) {
            objT = new z5o(wy71Var, (byte) 4);
            x340Var.s0(objT);
        }
        return (upo) k5p1.u(objArr, df41Var, (Function0) objT, x340Var, 0);
    }

    public static final dui1 s(b180 b180Var, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        wat watVar = (wat) x340Var.k(t4k.h);
        boolean zF = x340Var.f((((long) Float.floatToRawIntBits(watVar.h())) & 4294967295L) | (((long) Float.floatToRawIntBits(b180Var.j)) << 32));
        Object objT = x340Var.T();
        if (zF || objT == fkj0.X) {
            ej50 ej50Var = new ej50();
            n(ej50Var, b180Var.f);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(watVar.X0(b180Var.b))) << 32) | (((long) Float.floatToRawIntBits(watVar.X0(b180Var.c))) & 4294967295L);
            float fIntBitsToFloat = b180Var.d;
            float fIntBitsToFloat2 = b180Var.e;
            if (Float.isNaN(fIntBitsToFloat)) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            }
            if (Float.isNaN(fIntBitsToFloat2)) {
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
            dui1 dui1Var = new dui1(ej50Var);
            String str = b180Var.a;
            long j = b180Var.g;
            f2b f2bVar = j != 16 ? new f2b(j, b180Var.h) : null;
            boolean z = b180Var.i;
            dui1Var.f.setValue(new Size(jFloatToRawIntBits));
            dui1Var.g.setValue(Boolean.valueOf(z));
            pti1 pti1Var = dui1Var.h;
            pti1Var.g.setValue(f2bVar);
            pti1Var.i.setValue(new Size(jFloatToRawIntBits2));
            pti1Var.c = str;
            x340Var.s0(dui1Var);
            objT = dui1Var;
        }
        return (dui1) objT;
    }

    public static final String t(int i, String str) {
        if (nhc1.Y(str, "spotify:image:", false)) {
            return nhc1.W(str, "spotify:image:", "https://i.scdn.co/image/");
        }
        return nhc1.Y(str, "spotify:mosaic:", false) ? ab80.n("https://mosaic.scdn.co/", "/", i, nhc1.W(nhc1.W(str, "spotify:mosaic:", ""), ":", "")) : str;
    }
}
