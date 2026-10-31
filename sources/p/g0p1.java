package p;

import android.content.Context;
import android.content.SharedPreferences;
import android.icu.text.CompactDecimalFormat;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class g0p1 {
    public static b180 a;
    public static b180 b;

    public static final boolean A(z69 z69Var, double d) {
        a79 a79Var = z69Var.a;
        if (a79Var instanceof a79) {
            return a79Var.a == d;
        }
        if (a79Var instanceof b79) {
            b79 b79Var = (b79) a79Var;
            return d > b79Var.a && d < b79Var.b;
        }
        eg.o();
        return false;
    }

    public static final void B(Context context, sk30 sk30Var) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i2 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            sk30Var.a();
            try {
                sk30Var.g(new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                sk30Var.g(new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                sharedPreferences.edit().clear().apply();
                sk30Var.h();
            } finally {
                sk30Var.e();
            }
        }
    }

    public static final void a(r2p1 r2p1Var, String str, String str2, Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1834633513);
        int i2 = i | (b0kVar3.g(r2p1Var) ? 4 : 2) | (b0kVar3.g(str) ? 32 : 16) | (b0kVar3.g(str2) ? 256 : 128) | (b0kVar3.i(function0) ? 2048 : 1024);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarZ = u291.z(u291.f(nim0.a, 1.0f), (fra) null, 3);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(b0kVar3).g;
            cvx cvxVar = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarZ, new uvx(0, (pgx) null, 3, (vzq0) null, uyn1.h(2, 4.0f, 0.0f), (tvx) null, (hw61) null, 0, new p3v(64.0f), 235), null, false, null, null, new gbx(new y50(cwl1.n0(2131959872, new Object[]{str}, b0kVar3)), function0), null, null, apo.r(712605568, new o2((Object) r2p1Var, (byte) 6), b0kVar3), null, apo.r(674607775, new p3(str2, (byte) 6), b0kVar3), d3i.a, null, null, apo.r(579117339, new p3(str, (byte) 7), b0kVar3), b0kVar2, 805306432, 197040, 26044);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new x2((Object) r2p1Var, str, str2, (Object) function0, i, (byte) 4);
        }
    }

    public static final void b(r2p1 r2p1Var, b0k b0kVar, int i) {
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(29956794);
        int i2 = (x340Var.g(r2p1Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarR = u291.r(nim0Var, 64.0f);
            long jC = cbx.a(x340Var).a.a.c();
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF = dug.f(qim0VarR, jC, er31.b(4.0f));
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            boolean z2 = r2p1Var instanceof m6u0;
            isl islVar = isl.a;
            if (z2) {
                x340Var.i0(-302588219);
                hux huxVar = ((m6u0) r2p1Var).c;
                zov0 zov0Var2 = cbx.b(x340Var).g;
                w0h1.a(huxVar, islVar, u291.r(nim0Var, 32.0f), cbx.a(x340Var).b.a, 0L, false, x340Var, 56, 48);
                x340Var.r(false);
                z = true;
            } else {
                if (!(r2p1Var instanceof n6u0)) {
                    throw p3d1.k(x340Var, -702498521, false);
                }
                x340Var.i0(-302334360);
                Uri uri = Uri.parse("spotify:cached-files");
                zov0 zov0Var3 = cbx.b(x340Var).g;
                eso1.e(uri, islVar, u291.r(nim0Var, 64.0f), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 48, 0, 4088);
                x340Var.r(false);
                z = true;
            }
            x340Var.r(z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ab(r2p1Var, i, (byte) 8);
        }
    }

    public static final void c(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1891183227);
        int i2 = (x340Var.i(function0) ? 32 : 16) | i | (x340Var.h(z) ? 256 : 128) | (x340Var.g(str) ? 2048 : 1024) | 24576;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            gra graVar = een.g;
            h2c h2cVar = h2c.a;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarA = h2cVar.a(qim0Var3, graVar);
            String strO0 = cwl1.o0(x340Var, 2131953903);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                foo1.h(new gbx(new y50(strO0), function0), qim0VarA, z ? new hax(str) : jax.a, yla.s(x340Var), null, null, qci.a, x340Var, 12582912, 112);
                qim0Var2 = qim0Var3;
            }
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pfg(function0, z, str, qim0Var2, i);
        }
    }

    public static final void d(spd1 spd1Var, ycm ycmVar, b0k b0kVar, int i) {
        int i2;
        spd1 spd1Var2;
        byte b2;
        String strK;
        Function0 function0;
        qim0 qim0Var;
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(570891705);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(spd1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(ycmVar) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z2 = spd1Var.o;
            String str = spd1Var.e;
            int i3 = spd1Var.c;
            if (z2) {
                x340Var.i0(-635547489);
                e(x340Var, 0);
                x340Var.r(false);
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new upd1(spd1Var, ycmVar, i, (byte) 0);
                    return;
                }
                return;
            }
            x340Var.i0(-635507127);
            x340Var.r(false);
            int iC = l1d.C(i3);
            if (iC == 1) {
                strK = x0d.k(x340Var, -1128868196, 2131958346, x340Var, false);
            } else if (iC == 2) {
                strK = x0d.k(x340Var, -1128875428, 2131958347, x340Var, false);
            } else if (iC != 3) {
                x340Var.i0(-635096379);
                x340Var.r(false);
                strK = "";
            } else {
                strK = x0d.k(x340Var, -1128871906, 2131958345, x340Var, false);
            }
            if (!ihc1.y0(str)) {
                strK = xcg1.i(strK, " • ", str);
            }
            String str2 = strK;
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            Function0 function1 = hmb0.t1;
            if (z3) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            String str3 = spd1Var.h;
            if (str3 == null) {
                str3 = spd1Var.g;
            }
            g(str3, x340Var, 0);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            wnb0 wnb0VarK = c13.k(qim0Var2, 16.0f, x340Var, 1.0f, true);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, wnb0VarK);
            x340Var.m0();
            if (x340Var.S) {
                function0 = function1;
                x340Var.l(function0);
            } else {
                function0 = function1;
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            Function0 function2 = function0;
            b2 = 1;
            uwo1.e(spd1Var.d, null, cbx.d(x340Var).e, cbx.a(x340Var).b.a, null, null, 2, false, new cjc0(2), 0, null, x340Var, 0, 0, 1714);
            uwo1.e(str2, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 2, false, new cjc0(1), 0, null, x340Var, 0, 0, 1714);
            x340Var.r(true);
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.v(qim0Var2, 12.0f));
            qim0 qim0VarN = anm1.N("martini_talk_rich_content_action_more", qim0Var2);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarN);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function2);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            spd1Var2 = spd1Var;
            otw.c(ycm.a(ycmVar), new wcm(spd1Var2.a, (String) null, (String) null, (ucm) null, (Function0) null, (Function0) null, false, (String) null, (String) null, 1022), (qim0) null, (ipb1) null, x340Var, 0, 12);
            x340Var.r(true);
            x340Var.r(true);
            if (ihc1.y0(spd1Var2.f)) {
                qim0Var = qim0Var2;
                z = false;
                x340Var.i0(-633571735);
                x340Var.r(false);
            } else {
                x340Var.i0(-633857152);
                cvx cvxVar3 = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h(qim0Var2, 12.0f));
                z = false;
                qim0Var = qim0Var2;
                uwo1.e(spd1Var2.f, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 2, false, new cjc0(2), 0, null, x340Var, 0, 0, 1714);
                x340Var.r(false);
            }
            int iC2 = l1d.C(i3);
            if (iC2 == 1) {
                x340Var.i0(-633137983);
                cvx cvxVar4 = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h(qim0Var, 12.0f));
                f(spd1Var2.i, null, null, spd1Var2.k, spd1Var2.l, x340Var, 432);
                x340Var.r(z);
            } else if (iC2 != 3) {
                x340Var.i0(-632840569);
                x340Var.r(z);
            } else {
                x340Var.i0(-633496188);
                cvx cvxVar5 = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h(qim0Var, 12.0f));
                f(spd1Var2.i, spd1Var2.m, spd1Var2.n, spd1Var2.k, spd1Var2.l, x340Var, 0);
                x340Var.r(z);
            }
        } else {
            spd1Var2 = spd1Var;
            b2 = 1;
            x340Var.b0();
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new upd1(spd1Var2, ycmVar, i, b2);
        }
    }

    public static final void e(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-939734590);
        j06 j06Var = x340Var.a;
        if (x340Var.Y(i & 1, i != 0)) {
            uwr uwrVar = cbx.a;
            long jC = cbx.a(x340Var).a.b.c();
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(4.0f);
            cr31 cr31VarB2 = er31.b(dsa0.m(x340Var, 2131166410));
            float fM = dsa0.m(x340Var, 2131166411);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            t1c.a(dug.f(u291.r(nim0Var, fM), jC, cr31VarB2), x340Var, 0);
            cvx cvxVar = cbx.b(x340Var).b;
            wnb0 wnb0VarK = c13.k(nim0Var, 16.0f, x340Var, 1.0f, true);
            cvx cvxVar2 = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(12.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, wnb0VarK);
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
            t1c.a(dug.f(u291.h(u291.f(nim0Var, 0.7f), 16.0f), jC, cr31VarB), x340Var, 0);
            t1c.a(dug.f(u291.h(u291.f(nim0Var, 0.45f), 14.0f), jC, cr31VarB), x340Var, 0);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new t491(i, (byte) 24);
        }
    }

    public static final void f(boolean z, Double d, Long l, Long l2, Long l3, b0k b0kVar, int i) {
        x340 x340Var;
        boolean z2;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-253856967);
        int i2 = (x340Var2.h(z) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= x340Var2.g(d) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.g(l) ? 256 : 128;
        }
        int i3 = i2 | (x340Var2.g(l2) ? 2048 : 1024) | (x340Var2.g(l3) ? 16384 : 8192);
        if (x340Var2.Y(i3 & 1, (i3 & 9363) != 9362)) {
            x340Var2.i0(856595930);
            smc0 smc0VarN = k4p1.n();
            if (d != null && l != null) {
                double dDoubleValue = d.doubleValue();
                long jLongValue = l.longValue();
                Locale locale = Locale.getDefault();
                NumberFormat numberFormat = NumberFormat.getInstance(locale);
                numberFormat.setMaximumFractionDigits(1);
                numberFormat.setMinimumFractionDigits(0);
                smc0VarN.add(cy30.p("★ ", numberFormat.format(dDoubleValue), " (", CompactDecimalFormat.getInstance(locale, CompactDecimalFormat.CompactStyle.SHORT).format(jLongValue), ")"));
            }
            if (l2 != null) {
                smc0VarN.add(new SimpleDateFormat("MMM d, yyyy", Locale.getDefault()).format(new Date(l2.longValue())));
            }
            if (l3 == null) {
                x340Var2.i0(1639205896);
            } else {
                x340Var2.i0(1639205897);
                smc0VarN.add(d0p1.w(l3.longValue(), x340Var2));
            }
            x340Var2.r(false);
            smc0 smc0VarK = k4p1.k(smc0VarN);
            x340Var2.r(false);
            ArrayList arrayList = new ArrayList();
            rmc0 rmc0VarListIterator = smc0VarK.listIterator(0);
            while (true) {
                rmc0 rmc0Var = rmc0VarListIterator;
                if (!rmc0Var.hasNext()) {
                    break;
                }
                Object next = rmc0Var.next();
                if (!ihc1.y0((String) next)) {
                    arrayList.add(next);
                }
            }
            if (z || !arrayList.isEmpty()) {
                x340Var2.i0(785010622);
                jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 0);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                nim0 nim0Var = nim0.a;
                qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
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
                if (z) {
                    x340Var2.i0(-838492815);
                    kqn1.d(2, 6, 2, x340Var2, null);
                    if (arrayList.isEmpty()) {
                        x340Var2.i0(-838322966);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-838381587);
                        op71.g(x340Var2, u291.v(nim0Var, 4.0f));
                        x340Var2.r(false);
                    }
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-838315030);
                    x340Var2.r(false);
                }
                if (arrayList.isEmpty()) {
                    x340Var = x340Var2;
                    z2 = false;
                    x340Var.i0(-838007510);
                    x340Var.r(false);
                } else {
                    x340Var2.i0(-838266267);
                    String strY0 = o7h.y0(arrayList, " • ", (String) null, (String) null, (iu30) null, 62);
                    uwr uwrVar = cbx.a;
                    z2 = false;
                    uwo1.e(strY0, null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, null, null, 2, false, new cjc0(1), 0, null, x340Var2, 0, 0, 1714);
                    x340Var = x340Var2;
                    x340Var.r(false);
                }
                x340Var.r(true);
                x340Var.r(z2);
            } else {
                x340Var2.i0(785574729);
                x340Var2.r(false);
                x340Var = x340Var2;
            }
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bk10(z, d, l, l2, l3, i);
        }
    }

    public static final void g(String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1466535454);
        int i2 = i | (x340Var.g(str) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            long jC = cbx.a(x340Var).a.b.c();
            float fM = dsa0.m(x340Var, 2131166411);
            cr31 cr31VarB = er31.b(dsa0.m(x340Var, 2131166410));
            nim0 nim0Var = nim0.a;
            qim0 qim0VarN = anm1.N("martini_talk_rich_content_thumbnail", dug.f(i1p1.q(u291.r(nim0Var, fM), cr31VarB), jC, cr31VarB));
            if (str == null || ihc1.y0(str)) {
                x340Var.i0(-1149838590);
                t1c.a(qim0VarN, x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(-1149794446);
                boolean z = (i2 & 14) == 4;
                Object objT = x340Var.T();
                if (z || objT == fkj0.X) {
                    objT = Uri.parse(str);
                    x340Var.s0(objT);
                }
                Uri uri = (Uri) objT;
                gfh0 gfh0VarC = t1c.c(een.d, false);
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
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                uri.getClass();
                eso1.e(uri, isl.a, u291.d(nim0Var, 1.0f), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, oux.a, false, false, x340Var, 48, 0, 3576);
                x340Var.r(true);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nl41(str, i, (byte) 28);
        }
    }

    public static final void h(int i, String str, Function0 function0, fe5 fe5Var, b0k b0kVar, qim0 qim0Var, idn0 idn0Var, boolean z, boolean z2, boolean z3, boolean z4) {
        int i2;
        boolean z5;
        fe5 fe5Var2;
        idn0 idn0Var2;
        fe5 fe5VarL0;
        idn0 idn0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-120642440);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.h(z3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(qim0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            z5 = z4;
            i2 |= x340Var.h(z5) ? 1048576 : 524288;
        } else {
            z5 = z4;
        }
        if ((12582912 & i) == 0) {
            i2 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= 33554432;
        }
        if (x340Var.Y(i2 & 1, (38347923 & i2) != 38347922)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                n511 n511Var = ckk1.a;
                fe5VarL0 = irn1.l0(0.0f, 400.0f, new p3v(0.4f), 1);
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = ktd.n(x340Var);
                }
                idn0Var3 = (idn0) objT;
            } else {
                x340Var.b0();
                fe5VarL0 = fe5Var;
                idn0Var3 = idn0Var;
            }
            x340Var.s();
            fe5 fe5Var3 = fe5VarL0;
            gfx.g(z ? 4 : 1, apo.r(1704935915, new m820(str, z, z2, z3, z5, function0, idn0Var3, fe5Var3, qim0Var), x340Var), x340Var, 48);
            idn0Var2 = idn0Var3;
            fe5Var2 = fe5Var3;
        } else {
            x340Var.b0();
            fe5Var2 = fe5Var;
            idn0Var2 = idn0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gqv(i, str, function0, fe5Var2, qim0Var, idn0Var2, z, z2, z3, z4);
        }
    }

    public static final void i(String str, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(675325993);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            tob1 tob1VarA = w191.a(cbx.a(x340Var).b.a, x(x340Var), "textColor", x340Var, 384, 8);
            lee1 lee1Var = cbx.d(x340Var).j;
            boolean zI = x340Var.i(tob1VarA);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new f6t(tob1VarA, (byte) 2);
                x340Var.s0(objT);
            }
            jch0.c(str, nim0.a, lee1Var, (iu30) null, 0, false, 1, 0, (x9h) objT, (m0e1) null, x340Var, (i2 & 14) | 1572912, 696);
            x340Var = x340Var;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ue0((byte) 6, i, str, false);
        }
    }

    public static final void j(int i, String str, Function0 function0, fe5 fe5Var, b0k b0kVar, qim0 qim0Var, idn0 idn0Var, boolean z, boolean z2, boolean z3, boolean z4) {
        x340 x340Var;
        long j;
        long jC;
        long j2;
        float f;
        String str2 = str;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1396128106);
        j06 j06Var = x340Var2.a;
        int i2 = i | (x340Var2.g(str2) ? 4 : 2) | (x340Var2.h(z) ? 32 : 16) | (x340Var2.h(z2) ? 256 : 128) | (x340Var2.h(z3) ? 2048 : 1024) | (x340Var2.h(z4) ? 16384 : 8192) | (x340Var2.i(function0) ? 131072 : 65536) | (x340Var2.i(idn0Var) ? 1048576 : 524288) | (x340Var2.i(fe5Var) ? 8388608 : 4194304) | (x340Var2.i(qim0Var) ? 67108864 : 33554432);
        if (x340Var2.Y(i2 & 1, (i2 & 38347923) != 38347922)) {
            int i3 = i2 >> 18;
            boolean zBooleanValue = ((Boolean) k1u.m(idn0Var, x340Var2, i3 & 14).getValue()).booleanValue();
            if (!z) {
                x340Var2.i0(2098572247);
                if (zBooleanValue) {
                    x340Var2.i0(631242557);
                    uwr uwrVar = cbx.a;
                    jC = cbx.a(x340Var2).a.b.b();
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(631305177);
                    uwr uwrVar2 = cbx.a;
                    jC = cbx.a(x340Var2).a.b.c();
                    x340Var2.r(false);
                }
                x340Var2.r(false);
            } else if (z2) {
                x340Var2.i0(631388877);
                if (zBooleanValue) {
                    x340Var2.i0(631408996);
                    uwr uwrVar3 = cbx.a;
                    j2 = cbx.a(x340Var2).a.e;
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(631464610);
                    uwr uwrVar4 = cbx.a;
                    j2 = cbx.a(x340Var2).d.b;
                    x340Var2.r(false);
                }
                jC = j2;
                x340Var2.r(false);
            } else {
                x340Var2.i0(2098582372);
                if (zBooleanValue) {
                    x340Var2.i0(631556804);
                    uwr uwrVar5 = cbx.a;
                    j = cbx.a(x340Var2).a.e;
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(631612325);
                    uwr uwrVar6 = cbx.a;
                    j = cbx.a(x340Var2).a.c;
                    x340Var2.r(false);
                }
                jC = j;
                x340Var2.r(false);
            }
            tob1 tob1VarA = w191.a(jC, x(x340Var2), "backgroundColor", x340Var2, 384, 8);
            tob1 tob1VarA2 = z95.a((z2 && z) ? 34.0f : 0.0f, fe5Var, (String) null, x340Var2, i3 & 112, 12);
            Object objT = x340Var2.T();
            if (objT == fkj0.X) {
                objT = new n820();
                x340Var2.s0(objT);
            }
            n820 n820Var = (n820) objT;
            x340Var = x340Var2;
            qim0 qim0VarP = dgo1.p(u291.j(48.0f, 0.0f, 2, qim0Var), z, idn0Var, null, true, new pm31(0), function0);
            gra graVar = een.h;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarP);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z5 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z5) {
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
            nim0 nim0Var = nim0.a;
            qim0 qim0VarU = u291.u(nim0Var, 48.0f, 32.0f, 0.0f, 0.0f, 12);
            cr31 cr31Var = er31.a;
            qim0 qim0VarF = dug.f(qim0VarU, ((u7h) tob1VarA.getValue()).a, cr31Var);
            if (!z3 || z) {
                f = 1.5f;
            } else {
                f = 1.5f;
                qim0VarF = qim0VarF.then(d1u.F(nim0Var, 1.5f, new mic0(0, 0L, 9187343241974906880L, p7h.M(new u7h[]{new u7h(z4p1.g(4294920244L)), new u7h(z4p1.g(4294213120L)), new u7h(z4p1.g(4279844314L))}), (List) null), cr31Var));
            }
            if (z4 && !z) {
                qim0VarF = qim0VarF.then(d1u.F(nim0Var, f, n820Var, cr31Var));
            }
            qim0 qim0VarB = uyn1.B(uyn1.y(qim0VarF, 16.0f, 8.0f), ((p3v) tob1VarA2.getValue()).a, 0.0f, 0.0f, 0.0f, 14);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            str2 = str;
            i(str2, x340Var, i2 & 14);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m820(i, str2, function0, fe5Var, qim0Var, idn0Var, z, z2, z3, z4);
        }
    }

    public static final void k(int i, int i2, b0k b0kVar, hux huxVar) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1125174735);
        int i3 = ((i2 & 8) == 0 ? b0kVar3.g(huxVar) : b0kVar3.i(huxVar) ? 4 : 2) | i2 | (b0kVar3.e(i) ? 32 : 16);
        if (b0kVar3.Y(i3 & 1, (i3 & 19) != 18)) {
            b0kVar2 = b0kVar3;
            jto1.b(null, null, null, false, null, null, null, null, apo.r(-1068792615, new g70(huxVar, (byte) 7), b0kVar3), null, null, apo.r(-434302569, new f13(i, (byte) 10), b0kVar3), null, null, null, yvi.b, b0kVar2, 100663296, 196656, 30463);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new dfd0(huxVar, i, i2, (byte) 0);
        }
    }

    public static final void l(int i, String str, b0k b0kVar, boolean z) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-35117714);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.h(z) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            long jC = cbx.a(x340Var).a.b.c();
            cr31 cr31VarB = er31.b(dsa0.m(x340Var, 2131166412));
            nim0 nim0Var = nim0.a;
            qim0 qim0VarN = anm1.N("martini_talk_rich_content_thumbnail", dug.f(i1p1.q(u291.h(u291.f(nim0Var, 1.0f), dsa0.m(x340Var, 2131166413)), cr31VarB), jC, cr31VarB));
            if (str == null || ihc1.y0(str) || z) {
                x340Var.i0(1780761878);
                t1c.a(qim0VarN, x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(1780806022);
                boolean z2 = (i2 & 14) == 4;
                Object objT = x340Var.T();
                if (z2 || objT == fkj0.X) {
                    objT = Uri.parse(str);
                    x340Var.s0(objT);
                }
                Uri uri = (Uri) objT;
                gfh0 gfh0VarC = t1c.c(een.d, false);
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
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                uri.getClass();
                eso1.e(uri, isl.a, u291.d(nim0Var, 1.0f), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, oux.a, false, false, x340Var, 48, 0, 3576);
                x340Var.r(true);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mv8((byte) 14, i, str, z);
        }
    }

    public static final void m(boolean z, boolean z2, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1513552013);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        int i4 = i2 | 3072;
        if (x340Var.Y(i4 & 1, (i4 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("listening-activity-onboarding-test-tag", qim0Var3);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0VarN);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarP, 16.0f, 0.0f, 16.0f, cbx.b(x340Var).b.c, 2);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
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
            jmr0 jmr0VarN = i3o1.n(2131233172, x340Var, 0);
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(0.0f, 8.0f, 1, qim0Var3);
            zov0 zov0Var = cbx.b(x340Var).g;
            qim0Var2 = qim0Var3;
            eso1.h(jmr0VarN, isl.a, qim0VarZ, new p3v(88.0f), (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, x340Var, 56, 496);
            uwo1.e(cwl1.o0(x340Var, 2131957424), null, cbx.d(x340Var).e, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
            rnx rnxVar = rnx.c;
            if (z2) {
                i3 = 2131957427;
            } else {
                i3 = z ? 2131957428 : 2131957426;
            }
            k(i3, rnx.d, x340Var, rnxVar);
            k(2131957429, znx.d, x340Var, znx.c);
            k(2131957430, knx.d, x340Var, knx.c);
            cvx cvxVar4 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(qim0Var2, 16.0f));
            boolean z3 = (i4 & 896) == 256;
            Object objT = x340Var.T();
            if (z3 || objT == fkj0.X) {
                objT = new sya0(iu30Var, (byte) 24);
                x340Var.s0(objT);
            }
            foo1.c(new gbx(z50.c, (Function0) objT), new idx(4), null, null, null, null, null, null, null, null, yvi.a, x340Var, 0, 48, 2044);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cla(z, z2, iu30Var, qim0Var2, i, (byte) 7);
        }
    }

    public static final void n(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1742678290);
        if (x340Var.Y(i & 1, i != 0)) {
            uwr uwrVar = cbx.a;
            long jC = cbx.a(x340Var).a.b.c();
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(4.0f);
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(12.0f, true, new um5(false)), een.P0, x340Var, 0);
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
            t1c.a(dug.f(u291.h(u291.f(nim0Var, 0.7f), 18.0f), jC, cr31VarB), x340Var, 0);
            t1c.a(dug.f(u291.h(u291.f(nim0Var, 0.45f), 14.0f), jC, cr31VarB), x340Var, 0);
            t1c.a(dug.f(u291.h(u291.f(nim0Var, 1.0f), 14.0f), jC, cr31VarB), x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new t491(i, (byte) 25);
        }
    }

    public static final void o(String str, qim0 qim0Var, String str2, Function0 function0, j2i j2iVar, b0k b0kVar, int i) {
        j2i j2iVar2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-604867562);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | 432 | (x340Var.g(str2) ? 2048 : 1024) | (x340Var.i(function0) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new q4z0(str, (byte) 15);
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarF, false, (iu30) objT);
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).d.b;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF2 = dug.f(qim0VarB, j, er31.b(16.0f));
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarX = uyn1.x(qim0VarF2, 16.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            int i4 = i2 >> 3;
            d4o1.a(i3 | 48 | (i4 & 896) | (i4 & 7168), str, null, str2, function0, x340Var);
            j2iVar2 = j2iVar;
            j2iVar2.invoke(pbh.a, x340Var, 54);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            j2iVar2 = j2iVar;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wnx0(str, qim0Var2, str2, function0, j2iVar2, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void p(spd1 spd1Var, Function0 function0, ycm ycmVar, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1703035495);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(spd1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(ycmVar) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            cr31 cr31VarB = er31.b(dsa0.m(x340Var, 2131166409));
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarQ = i1p1.q(u291.f(qim0Var3, 1.0f), cr31VarB);
            uwr uwrVar = cbx.a;
            avw0 avw0Var = cbx.b(x340Var).c;
            qim0 qim0VarN = anm1.N("martini_talk_rich_content_card", bin.x(dug.f(d1u.E(1.0f, cbx.a(x340Var).a.b.a(), qim0VarQ, cr31VarB), u7h.j, cr31VarB), !spd1Var.o, null, null, null, function0, 14));
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarX = uyn1.x(qim0VarN, 16.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            int iC = l1d.C(spd1Var.c);
            if (iC == 0) {
                x340Var.i0(-274242463);
                s(spd1Var, ycmVar, x340Var, ((i3 >> 3) & 112) | (i3 & 14));
                x340Var.r(false);
            } else {
                if (iC != 1 && iC != 2 && iC != 3) {
                    throw p3d1.k(x340Var, -274244572, false);
                }
                x340Var.i0(-274234596);
                d(spd1Var, ycmVar, x340Var, ((i3 >> 3) & 112) | (i3 & 14));
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uoc1(i, spd1Var, function0, ycmVar, qim0Var2, (byte) 7);
        }
    }

    public static final void q(String str, String str2, ycm ycmVar, String str3, b0k b0kVar, int i) {
        String str4;
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-294177529);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            str4 = str;
            i2 = (x340Var.g(str4) ? 4 : 2) | i;
        } else {
            str4 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(ycmVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(str3) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
            int i3 = i2;
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            wnb0 wnb0VarQ = kk0.q(x340Var, qim0VarE, lljVar4, 1.0f, true);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, wnb0VarQ);
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
            uwr uwrVar = cbx.a;
            uwo1.e(str4, null, cbx.d(x340Var).d, cbx.a(x340Var).b.a, null, null, 2, false, new cjc0(2), 0, null, x340Var, i3 & 14, 0, 1714);
            uwo1.e(str2, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 2, false, new cjc0(1), 0, null, x340Var, (i3 >> 3) & 14, 0, 1714);
            x340Var.r(true);
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.v(nim0Var, 12.0f));
            qim0 qim0VarN = anm1.N("martini_talk_rich_content_action_more", nim0Var);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarN);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            otw.c(ycm.a(ycmVar), new wcm(str3, (String) null, (String) null, (ucm) null, (Function0) null, (Function0) null, false, (String) null, (String) null, 1022), (qim0) null, (ipb1) null, x340Var, 0, 12);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uoc1(i, str, str2, ycmVar, str3, (byte) 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3 A[PHI: r3 r4 r5
      0x00a3: PHI (r3v15 int) = (r3v8 int), (r3v17 int) binds: [B:70:0x00b7, B:60:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r4v8 p.qim0) = (r4v4 p.qim0), (r4v11 p.qim0) binds: [B:70:0x00b7, B:60:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r5v8 int) = (r5v5 int), (r5v9 int) binds: [B:70:0x00b7, B:60:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:73:0x0126  */
    /* JADX WARN: Code duplicated, block: B:76:0x0134  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    public static final void r(String str, qim0 qim0Var, int i, long j, b0k b0kVar, int i2, int i3) {
        String str2;
        int i4;
        qim0 qim0Var2;
        int i5;
        long j2;
        boolean z;
        b0k b0kVar2;
        qim0 qim0Var3;
        int i6;
        long j3;
        h311 h311VarV;
        qim0 qim0Var4;
        int i7;
        long j4;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(661724067);
        if ((i2 & 6) == 0) {
            str2 = str;
            i4 = (b0kVar3.g(str2) ? 4 : 2) | i2;
        } else {
            str2 = str;
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 == 0) {
            if ((i2 & 48) == 0) {
                qim0Var2 = qim0Var;
                i4 |= b0kVar3.i(qim0Var2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                if ((i3 & 4) == 0) {
                    i5 = i;
                    int i9 = b0kVar3.e(i5) ? 256 : 128;
                    i4 |= i9;
                } else {
                    i5 = i;
                }
                i4 |= i9;
            } else {
                i5 = i;
            }
            if ((i2 & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    j2 = j;
                    int i10 = b0kVar3.f(j2) ? 2048 : 1024;
                    i4 |= i10;
                } else {
                    j2 = j;
                }
                i4 |= i10;
            } else {
                j2 = j;
            }
            if ((i4 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i4 & 1, z)) {
                b0kVar3.d0();
                if ((i2 & 1) != 0 || b0kVar3.E()) {
                    if (i8 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        i7 = 3;
                    } else {
                        i7 = i5;
                    }
                    if ((i3 & 8) != 0) {
                        uwr uwrVar = cbx.a;
                        i4 &= -7169;
                        j4 = cbx.d(b0kVar3).c.a.b;
                    }
                    b0kVar3.s();
                    uwr uwrVar2 = cbx.a;
                    b0kVar2 = b0kVar3;
                    uwo1.e(str2, uyn1.z(cbx.b(b0kVar3).b.a, 0.0f, 2, qim0Var4), cbx.d(b0kVar3).e, 0L, new a0e1(i7), null, 0, false, null, 0, new px8(cbx.d(b0kVar3).e.a.b, j4, 0L, new mx8(1), 4), b0kVar2, (i4 & 14) | ((i4 << 6) & 57344), 8, 1000);
                    qim0Var3 = qim0Var4;
                    i6 = i7;
                    j3 = j4;
                } else {
                    b0kVar3.b0();
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                    }
                    qim0Var4 = qim0Var2;
                    i7 = i5;
                }
                j4 = j2;
                b0kVar3.s();
                uwr uwrVar3 = cbx.a;
                b0kVar2 = b0kVar3;
                uwo1.e(str2, uyn1.z(cbx.b(b0kVar3).b.a, 0.0f, 2, qim0Var4), cbx.d(b0kVar3).e, 0L, new a0e1(i7), null, 0, false, null, 0, new px8(cbx.d(b0kVar3).e.a.b, j4, 0L, new mx8(1), 4), b0kVar2, (i4 & 14) | ((i4 << 6) & 57344), 8, 1000);
                qim0Var3 = qim0Var4;
                i6 = i7;
                j3 = j4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
                i6 = i5;
                j3 = j2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new z2j1(str, qim0Var3, i6, j3, i2, i3);
            }
        }
        i4 |= 48;
        qim0Var2 = qim0Var;
        if ((i2 & 384) == 0) {
            if ((i3 & 4) == 0) {
                i5 = i;
                if (b0kVar3.e(i5)) {
                }
                i4 |= i9;
            } else {
                i5 = i;
            }
            i4 |= i9;
        } else {
            i5 = i;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                j2 = j;
                if (b0kVar3.f(j2)) {
                }
                i4 |= i10;
            } else {
                j2 = j;
            }
            i4 |= i10;
        } else {
            j2 = j;
        }
        if ((i4 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i4 & 1, z)) {
            b0kVar3.d0();
            if ((i2 & 1) != 0) {
                if (i8 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                    i7 = 3;
                } else {
                    i7 = i5;
                }
                if ((i3 & 8) != 0) {
                    uwr uwrVar4 = cbx.a;
                    i4 &= -7169;
                    j4 = cbx.d(b0kVar3).c.a.b;
                } else {
                    j4 = j2;
                }
            } else {
                if (i8 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                    i7 = 3;
                } else {
                    i7 = i5;
                }
                if ((i3 & 8) != 0) {
                    uwr uwrVar5 = cbx.a;
                    i4 &= -7169;
                    j4 = cbx.d(b0kVar3).c.a.b;
                } else {
                    j4 = j2;
                }
            }
            b0kVar3.s();
            uwr uwrVar6 = cbx.a;
            b0kVar2 = b0kVar3;
            uwo1.e(str2, uyn1.z(cbx.b(b0kVar3).b.a, 0.0f, 2, qim0Var4), cbx.d(b0kVar3).e, 0L, new a0e1(i7), null, 0, false, null, 0, new px8(cbx.d(b0kVar3).e.a.b, j4, 0L, new mx8(1), 4), b0kVar2, (i4 & 14) | ((i4 << 6) & 57344), 8, 1000);
            qim0Var3 = qim0Var4;
            i6 = i7;
            j3 = j4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var3 = qim0Var2;
            i6 = i5;
            j3 = j2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new z2j1(str, qim0Var3, i6, j3, i2, i3);
        }
    }

    public static final void s(spd1 spd1Var, ycm ycmVar, b0k b0kVar, int i) {
        int i2;
        byte b2;
        ycm ycmVar2;
        byte b3;
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-31499150);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(spd1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(ycmVar) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String str = spd1Var.g;
            boolean z2 = spd1Var.o;
            l(0, str, x340Var, z2);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            nim0 nim0Var = nim0.a;
            op71.g(x340Var, u291.h(nim0Var, 16.0f));
            if (z2) {
                x340Var.i0(-2087991788);
                n(x340Var, 0);
                x340Var.r(false);
                b2 = 2;
                ycmVar2 = ycmVar;
            } else {
                x340Var.i0(-2087930935);
                q(spd1Var.d, xcg1.i(cwl1.o0(x340Var, 2131958346), " • ", spd1Var.e), ycmVar, spd1Var.a, x340Var, (i2 << 3) & 896);
                if (ihc1.y0(spd1Var.f)) {
                    b3 = 2;
                    z = false;
                    x340Var.i0(-2087327024);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-2087629739);
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    op71.g(x340Var, u291.h(nim0Var, 12.0f));
                    b3 = 2;
                    z = false;
                    uwo1.e(spd1Var.f, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 2, false, new cjc0(2), 0, null, x340Var, 0, 0, 1714);
                    x340Var.r(false);
                }
                cvx cvxVar3 = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h(nim0Var, 12.0f));
                b2 = b3;
                ycmVar2 = ycmVar;
                t(spd1Var.i, spd1Var.j, spd1Var.k, spd1Var.l, x340Var, 0);
                x340Var.r(z);
            }
        } else {
            b2 = 2;
            ycmVar2 = ycmVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new upd1(spd1Var, ycmVar2, i, b2);
        }
    }

    public static final void t(boolean z, Long l, Long l2, Long l3, b0k b0kVar, int i) {
        x340 x340Var;
        String strValueOf;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1700330499);
        int i2 = i | (x340Var2.h(z) ? 4 : 2) | (x340Var2.g(l) ? 32 : 16) | (x340Var2.g(l2) ? 256 : 128) | (x340Var2.g(l3) ? 2048 : 1024);
        if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            x340Var2.i0(1930041716);
            smc0 smc0VarN = k4p1.n();
            if (l == null) {
                x340Var2.i0(-1589096190);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1589096189);
                long jLongValue = l.longValue();
                if (jLongValue < 1000) {
                    strValueOf = String.valueOf(jLongValue);
                } else {
                    CompactDecimalFormat compactDecimalFormat = CompactDecimalFormat.getInstance(Locale.getDefault(), CompactDecimalFormat.CompactStyle.SHORT);
                    compactDecimalFormat.setMaximumFractionDigits(1);
                    strValueOf = compactDecimalFormat.format(jLongValue);
                }
                smc0VarN.add(strValueOf + " " + cwl1.o0(x340Var2, 2131958351));
                x340Var2.r(false);
            }
            if (l2 != null) {
                smc0VarN.add(new SimpleDateFormat("MMM d, yyyy", Locale.getDefault()).format(new Date(l2.longValue())));
            }
            if (l3 == null) {
                x340Var2.i0(-1588867906);
            } else {
                x340Var2.i0(-1588867905);
                smc0VarN.add(d0p1.w(l3.longValue(), x340Var2));
            }
            x340Var2.r(false);
            smc0 smc0VarK = k4p1.k(smc0VarN);
            x340Var2.r(false);
            ArrayList arrayList = new ArrayList();
            rmc0 rmc0VarListIterator = smc0VarK.listIterator(0);
            while (true) {
                rmc0 rmc0Var = rmc0VarListIterator;
                if (!rmc0Var.hasNext()) {
                    break;
                }
                Object next = rmc0Var.next();
                if (!ihc1.y0((String) next)) {
                    arrayList.add(next);
                }
            }
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
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
            if (z) {
                x340Var2.i0(-935488084);
                kqn1.d(2, 6, 2, x340Var2, null);
                if (arrayList.isEmpty()) {
                    x340Var2.i0(-935325861);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-935380638);
                    op71.g(x340Var2, u291.v(nim0Var, 4.0f));
                    x340Var2.r(false);
                }
                x340Var2.r(false);
            } else {
                x340Var2.i0(-935319909);
                x340Var2.r(false);
            }
            if (arrayList.isEmpty()) {
                x340Var = x340Var2;
                x340Var.i0(-935030245);
                x340Var.r(false);
            } else {
                x340Var2.i0(-935275486);
                String strY0 = o7h.y0(arrayList, " • ", (String) null, (String) null, (iu30) null, 62);
                uwr uwrVar = cbx.a;
                uwo1.e(strY0, null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, null, null, 2, false, new cjc0(1), 0, null, x340Var2, 0, 0, 1714);
                x340Var = x340Var2;
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zp51(z, l, l2, l3, i, (byte) 4);
        }
    }

    public static final ra71 u(qa71 qa71Var) {
        return new ra71(qa71Var.a, "share-media-video-container", qa71Var.b, qa71Var.c, qa71Var.f, qa71Var.g, (Long) null, qa71Var.d, qa71Var.e, nvj1.c, (String) null, (String) null);
    }

    public static cp31 v(lnn lnnVar, hmn hmnVar, ryj ryjVar, mnn mnnVar, q7r0 q7r0Var, rih1 rih1Var) {
        lnnVar.getClass();
        hmnVar.getClass();
        ryjVar.getClass();
        rih1Var.getClass();
        cp31 cp31Var = new cp31();
        cp31Var.a = hmnVar;
        cp31Var.b = ryjVar;
        cp31Var.c = mnnVar;
        cp31Var.d = lnnVar;
        cp31Var.e = new i8p(cp31Var, 0, (byte) 6);
        cp31Var.f = new i8p(cp31Var, 1, (byte) 6);
        return cp31Var;
    }

    public static final String w(slt0 slt0Var) {
        if (slt0Var instanceof qlt0) {
            return ((qlt0) slt0Var).a;
        }
        if (slt0Var instanceof plt0) {
            return ((plt0) slt0Var).a;
        }
        if (slt0Var instanceof rlt0) {
            return ((rlt0) slt0Var).b;
        }
        eg.o();
        return null;
    }

    public static final pxg1 x(b0k b0kVar) {
        uwr uwrVar = cbx.a;
        return irn1.o0(jfv.t(cbx.c(b0kVar).b.a, ngv.d), 0, ((jhx) cbx.c(b0kVar).a.b).a, 2);
    }

    public static final go80 y(klm klmVar, wbp0 wbp0Var, wbp0 wbp0Var2, wbp0 wbp0Var3, wbp0 wbp0Var4, wbp0 wbp0Var5, wbp0 wbp0Var6, wbp0 wbp0Var7, wbp0 wbp0Var8, wbp0 wbp0Var9, wbp0 wbp0Var10) {
        return klmVar.a("MicrosoftContinuityDaemon", new jcp0(wbp0Var, wbp0Var2, wbp0Var3, wbp0Var4, wbp0Var5, wbp0Var6, wbp0Var7, wbp0Var8, wbp0Var9, wbp0Var10));
    }

    public static float z(float f, float f2, float f3) {
        return (((f2 - f) * (f3 - 48.0f)) / 16.0f) + f;
    }
}
