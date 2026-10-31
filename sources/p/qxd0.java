package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import j$.time.DayOfWeek;
import j$.time.OffsetDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.format.FormatStyle;
import j$.time.format.TextStyle;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class qxd0 implements rxd0 {
    public static final oku a = new oku();
    public static b180 b;
    public static b180 c;

    public static final void A(tu8 tu8Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1646693461);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(tu8Var) : x340Var.i(tu8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarN = anm1.N("autoInviteNearbyRowSubtitle", nim0.a);
            uwr uwrVar = cbx.a;
            uwo1.e(cwl1.o0(x340Var, tu8Var.a()), qim0VarN, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new eq90(tu8Var, i, (byte) 0);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void B(tu8 tu8Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        long j;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-339419565);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(tu8Var) : x340Var.i(tu8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarN = anm1.N("autoInviteNearbyRowTitle", nim0.a);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).h;
            if (tu8Var instanceof su8) {
                x340Var.i0(-1223558903);
                j = cbx.a(x340Var).c.a;
                x340Var.r(false);
            } else {
                if (!(tu8Var instanceof ru8)) {
                    throw p3d1.k(x340Var, -1223560315, false);
                }
                x340Var.i0(-1223557684);
                j = cbx.a(x340Var).c.b;
                x340Var.r(false);
            }
            uwo1.e(cwl1.o0(x340Var, 2131962308), qim0VarN, lee1Var, j, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new eq90(tu8Var, i, (byte) 1);
        }
    }

    public static final void C(Object obj, Function0 function0, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        if (x340Var.g(obj)) {
            S(function0, x340Var);
        }
    }

    public static final void D(Function0 function0, b0k b0kVar) {
        S(function0, b0kVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void E(wux wuxVar, tu8 tu8Var, kly0 kly0Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(248156288);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(wuxVar) : x340Var.i(wuxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(tu8Var) : x340Var.i(tu8Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(kly0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(qim0Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            cvx cvxVar = wuxVar.b;
            mbh mbhVarA = jbh.a(new d36(4.0f, false, new g21(een.Z, (byte) 28)), een.P0, x340Var, 0);
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
            int i3 = i2 >> 3;
            int i4 = i3 & 14;
            B(tu8Var, x340Var, i4);
            A(tu8Var, x340Var, i4);
            if (tu8Var instanceof pu8) {
                x340Var.i0(1252157800);
                a((pu8) tu8Var, kly0Var, null, x340Var, i3 & 126);
                x340Var.r(false);
            } else {
                x340Var.i0(1252253900);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ke20(i, wuxVar, tu8Var, kly0Var, qim0Var, (byte) 27);
        }
    }

    public static final void F(wkf1 wkf1Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-755142104);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.i(wkf1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            cwl1.b(anm1.N("trackCloud", u291.B(u291.f(qim0Var3, 1.0f), (gra) null, 3)), (tl3) null, d4o1.a, (pgx) null, new zzq0(16.0f, 8.0f, 16.0f, 8.0f), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(-1378128367, new e9f1(wkf1Var, (byte) 2), x340Var), x340Var, 0, 48, 1514);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new um81(wkf1Var, function0, qim0Var2, i, (byte) 19);
        }
    }

    public static final void G(uek uekVar, Function0 function0, Function0 function1, fod0 fod0Var, qim0 qim0Var, b0k b0kVar, int i) throws Throwable {
        Function0 function2;
        qim0 qim0Var2;
        Throwable th;
        String strN0;
        uek uekVar2 = uekVar;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-2024011907);
        j06 j06Var = ((x340) b0kVar2).a;
        int i2 = i | (b0kVar2.i(uekVar2) ? 4 : 2) | (b0kVar2.i(function0) ? 32 : 16) | (b0kVar2.i(function1) ? 256 : 128) | (b0kVar2.i(fod0Var) ? 2048 : 1024) | 24576;
        if (b0kVar2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            OffsetDateTime offsetDateTime = uekVar2.e;
            if (offsetDateTime == null) {
                b0kVar2.i0(-292628111);
                b0kVar2.r(false);
                th = null;
                strN0 = null;
            } else {
                b0kVar2.i0(-292628110);
                DayOfWeek dayOfWeek = offsetDateTime.getDayOfWeek();
                TextStyle textStyle = TextStyle.SHORT;
                String displayName = dayOfWeek.getDisplayName(textStyle, Locale.getDefault());
                String strValueOf = String.valueOf(offsetDateTime.getDayOfMonth());
                th = null;
                String displayName2 = offsetDateTime.getMonth().getDisplayName(textStyle, Locale.getDefault());
                String str = offsetDateTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(fod0Var.b));
                if (str == null) {
                    str = "";
                }
                strN0 = cwl1.n0(2131955772, new Object[]{displayName, strValueOf, displayName2, str}, b0kVar2);
                b0kVar2.r(false);
            }
            if (strN0 == null) {
                strN0 = "";
            }
            Object objT = b0kVar2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(b0kVar2);
            }
            idn0 idn0Var = (idn0) objT;
            jtr jtrVar = jtr.f;
            boolean z = (i2 & 112) == 32;
            Object objT2 = b0kVar2.T();
            if (z || objT2 == m4cVar) {
                objT2 = new tpj1(function0, (byte) 18);
                b0kVar2.s0(objT2);
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(u291.h(i1p1.q(bin.v(qim0Var3, idn0Var, jtrVar, false, null, null, (Function0) objT2, 28), er31.b(8.0f)), 142.0f), 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF2 = dug.f(qim0VarF, cbx.a(b0kVar2).a.d, d4o1.a);
            Object objT3 = b0kVar2.T();
            if (objT3 == m4cVar) {
                objT3 = lcl1.Z;
                b0kVar2.s0(objT3);
            }
            qim0 qim0VarB = s161.b(qim0VarF2, false, (iu30) objT3);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw th;
            }
            b0kVar2.m0();
            boolean z2 = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            qim0 qim0VarK = xcg1.k(cbx.a, u291.r(qim0Var3, 142.0f));
            gra graVar = een.d;
            String str2 = strN0;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarK);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            uekVar2 = uekVar;
            Uri uri = Uri.parse(uekVar2.d);
            qim0 qim0VarN = anm1.N("concert_wide_card_image", u291.r(qim0Var3, 142.0f));
            nkx nkxVar = nkx.c;
            eso1.e(uri, isl.a, qim0VarN, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new nux(nkxVar, nkxVar), false, false, b0kVar2, 1073766448, 0, 3560);
            ton1.f(0, 0, 0, 24, uekVar2.f, uekVar2.g, b0kVar2, anm1.N("concert_wide_card_calendar_icon", u291.r(uyn1.B(h2c.a.a(qim0Var3, graVar), 8.0f, 8.0f, 0.0f, 0.0f, 12), 48.0f)));
            b0kVar2.r(true);
            qim0 qim0VarY = uyn1.y(u291.d(qim0Var3, 1.0f), 16.0f, 12.0f);
            mbh mbhVarA = jbh.a(new d36(4.0f, true, new um5(false)), een.P0, b0kVar2, 0);
            int iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM3 = b0kVar2.m();
            qim0 qim0VarE3 = zr7.E(b0kVar2, qim0VarY);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, lljVar);
            nko1.H(xos0VarM3, b0kVar2, lljVar2);
            x0d.q(iHashCode3, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE3, b0kVar2, lljVar4);
            uwo1.e(str2, anm1.N("concert_wide_card_date", qim0Var3), cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, null, null, 0, false, new cjc0(1), 0, null, b0kVar2, 0, 0, 1776);
            uwo1.e(uekVar2.b, anm1.N("concert_wide_card_title", qim0Var3), cbx.d(b0kVar2).h, cbx.a(b0kVar2).b.a, null, null, 0, false, new cjc0(2), 0, null, b0kVar2, 0, 0, 1776);
            uwo1.e(uekVar2.c, anm1.N("concert_wide_card_subtitle", qim0Var3), cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, null, null, 0, false, new cjc0(2), 0, null, b0kVar2, 0, 0, 1776);
            b0kVar2 = b0kVar2;
            op71.g(b0kVar2, new wnb0(1.0f, true));
            b0kVar2.i0(1123702155);
            b0kVar2.r(false);
            b0kVar2.r(true);
            if (uekVar2.j) {
                b0kVar2.i0(1731075922);
                pk1 pk1Var = new pk1(uekVar2.h ? qk1.b : qk1.a, false, (String) null, (String) null, (j7p1) null, 30);
                qim0 qim0VarN2 = anm1.N("concert_wide_card_save_button", qim0Var3);
                boolean z3 = (i2 & 896) == 256;
                Object objT4 = b0kVar2.T();
                if (z3 || objT4 == m4cVar) {
                    function2 = function1;
                    objT4 = new tpj1(function2, (byte) 19);
                    b0kVar2.s0(objT4);
                } else {
                    function2 = function1;
                }
                h7p1.a(pk1Var, new gbx(z50.c, (Function0) objT4), qim0VarN2, null, null, b0kVar2, 0, 24);
                b0kVar2.r(false);
            } else {
                function2 = function1;
                b0kVar2.i0(1731465313);
                b0kVar2.r(false);
            }
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            function2 = function1;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new tte1((byte) 16, i, uekVar2, function0, function2, fod0Var, qim0Var2);
        }
    }

    public static final void H(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1897342405);
        if (x340Var.Y(i & 1, i != 0)) {
            qim0 qim0VarF = u291.f(u291.h(i1p1.q(nim0.a, er31.b(8.0f)), 142.0f), 1.0f);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            cua cuaVar = cbx.b(x340Var).f;
            t1c.a(cwl1.l0(dug.f(qim0VarF, jA, er31.b(4.0f)), 0L, (hw61) null, 15), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c1j1(i, (byte) 12);
        }
    }

    public static final void I(edn0 edn0Var, int i) {
        if (edn0Var.b == 0 || !(edn0Var.c(0) == i || edn0Var.c(edn0Var.b - 1) == i)) {
            int i2 = edn0Var.b;
            edn0Var.a(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int iC = edn0Var.c(i3);
                if (i <= iC) {
                    break;
                }
                edn0Var.f(i2, iC);
                i2 = i3;
            }
            edn0Var.f(i2, i);
        }
    }

    public static final String J(aht0 aht0Var, Long l, c380 c380Var, boolean z, b0k b0kVar, int i) {
        String strU;
        Object obj = fkj0.X;
        int i2 = i >> 6;
        int i3 = ((i << 6) & 896) | ((i >> 3) & 14) | (i2 & 112);
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-974213637);
        if (l == null) {
            x340Var.r(false);
            strU = null;
        } else {
            boolean zG = ((((i3 & 112) ^ 48) > 32 && x340Var.h(z)) || (i3 & 48) == 32) | x340Var.g(new Locale(upn1.m())) | ((((i3 & 14) ^ 6) > 4 && x340Var.f(l.longValue())) || (i3 & 6) == 4);
            Object objT = x340Var.T();
            if (zG || objT == obj) {
                objT = z ? aht0Var.a(l.longValue(), new Locale(upn1.m()), true) : aht0Var.a(l.longValue(), new Locale(upn1.m()), false);
                x340Var.s0(objT);
            }
            strU = cwl1.U(2131820919, (int) l.longValue(), new Object[]{(String) objT}, x340Var);
            x340Var.r(false);
        }
        String strC = gg.C(c380Var, b0kVar, i2 & 14, 1);
        boolean zG2 = x340Var.g(strU) | x340Var.g(strC);
        Object objT2 = x340Var.T();
        if (zG2 || objT2 == obj) {
            objT2 = o7h.y0(f46.i0(new String[]{strU, strC}), " • ", (String) null, (String) null, (iu30) null, 62);
            x340Var.s0(objT2);
        }
        return (String) objT2;
    }

    public static int K(long j, long j2) {
        if (j > 0 && j2 > 0) {
            long jG0 = zoi1.g0(j, 8000000L, j2, RoundingMode.HALF_UP);
            if (jG0 > 0 && jG0 <= 2147483647L) {
                return (int) jG0;
            }
        }
        return -2147483647;
    }

    public static edn0 L() {
        return new edn0();
    }

    public static final c9n M(o8n o8nVar, b0k b0kVar) {
        if (o8nVar.A(fkj0.W0) == null) {
            return new ny11(((x340) b0kVar).R, o8nVar);
        }
        gaa0 gaa0VarF = op71.f();
        gaa0VarF.m0(new nyh(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"), false));
        return smo1.e(gaa0VarF);
    }

    public static final uel N(oxk oxkVar) {
        c380 c380Var = oxkVar.v;
        ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
        Iterator it = c380Var.iterator();
        while (it.hasNext()) {
            arrayList.add(((rxk) it.next()).a);
        }
        return new uel(new xel(arrayList, o7h.l1(oxkVar.w)), oxkVar.z, oxkVar.w, oxkVar.x, 16);
    }

    public static final boolean O(edn0 edn0Var) {
        return edn0Var.b != 0;
    }

    public static final int P(List list) {
        if (list.contains(ell.d)) {
            return 1;
        }
        return list.contains(ell.b) ? 2 : 0;
    }

    public static final int Q(edn0 edn0Var) {
        if (edn0Var.b != 0) {
            return edn0Var.a[0];
        }
        bhn0.t("IntList is empty.");
        return 0;
    }

    public static final byte[] R(uz21 uz21Var, long j) {
        long jD = uz21Var.d();
        if (jD > j) {
            k220.i(pze0.h(j, ")", cy30.s(jD, "Response too large: ", " bytes (max ")));
            return null;
        }
        gbc gbcVarD1 = uz21Var.d1();
        if (!gbcVarD1.request(1 + j)) {
            return gbcVarD1.y0();
        }
        k220.i(gvg.f(j, "Response exceeds ", " bytes"));
        return null;
    }

    public static final void S(Function0 function0, b0k b0kVar) {
        amq0 amq0Var = ((x340) b0kVar).M.b.c;
        amq0Var.B(wkq0.c);
        y7y0.N(amq0Var, 0, function0);
    }

    public static final int T(edn0 edn0Var) {
        int iC;
        int i = edn0Var.b;
        int iC2 = edn0Var.c(0);
        while (edn0Var.b != 0 && edn0Var.c(0) == iC2) {
            edn0Var.f(0, edn0Var.d());
            edn0Var.e(edn0Var.b - 1);
            int i2 = edn0Var.b;
            int i3 = i2 >>> 1;
            int i4 = 0;
            while (i4 < i3) {
                int iC3 = edn0Var.c(i4);
                int i5 = (i4 + 1) * 2;
                int i6 = i5 - 1;
                int iC4 = edn0Var.c(i6);
                if (i5 < i2 && (iC = edn0Var.c(i5)) > iC4) {
                    if (iC <= iC3) {
                        break;
                    }
                    edn0Var.f(i4, iC);
                    edn0Var.f(i5, iC3);
                    i4 = i5;
                } else {
                    if (iC4 <= iC3) {
                        break;
                    }
                    edn0Var.f(i4, iC4);
                    edn0Var.f(i6, iC3);
                    i4 = i6;
                }
            }
        }
        return iC2;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    public static final op80 U(jic1 jic1Var, op80 op80Var) {
        k3h1 k3h1Var;
        k3h1 k3h1Var2 = q6x.b;
        Integer num = jic1Var.a;
        if (num != null) {
            k3h1Var = new k3h1(num.intValue());
            if (k3h1Var.equals(k3h1Var2)) {
                k3h1Var = k3h1Var2;
            }
        } else {
            k3h1Var = k3h1Var2;
        }
        y6h1 y6h1Var = jic1Var.b;
        if (y6h1Var != null) {
            h3h1 h3h1Var = new h3h1(new q3o(op80Var, y6h1Var, (byte) 2));
            if (k3h1Var.equals(k3h1Var2) && h3h1Var.equals(k3h1Var2)) {
                return k3h1Var2;
            }
            if (k3h1Var.equals(k3h1Var2)) {
                return h3h1Var;
            }
            if (!h3h1Var.equals(k3h1Var2)) {
                return new wch(k3h1Var, h3h1Var);
            }
        }
        return k3h1Var;
    }

    public static final void a(pu8 pu8Var, kly0 kly0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1774049913);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(pu8Var) : x340Var.i(pu8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(kly0Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
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
            otw.c((maa) kly0Var.get(), pu8Var.b, (qim0) null, (ipb1) null, x340Var, 0, 12);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ri60(pu8Var, kly0Var, qim0Var2, i, (byte) 12);
        }
    }

    public static final void b(b0k b0kVar, int i) {
        h6m h6mVar = mif1.Q0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1294787634);
        if (x340Var.Y(i & 1, i != 0)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                x340Var.i0(-82748355);
                mp10.f(h5p1.G(new ocf0(2131886083), null, null, x340Var, 0, 62).c(), anm1.N("autoInviteOnAnimation", nim0.a), false, false, (bcf0) null, Integer.MAX_VALUE, (ddf0) null, (tl3) null, h6mVar, x340Var, 1572864, 0, 2064316);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(-82399388);
                ncf0 ncf0VarG = h5p1.G(new ocf0(2131886084), null, null, x340Var, 0, 62);
                kbf0 kbf0VarS = m5n1.S(x340Var);
                boolean zI = x340Var.i(kbf0VarS) | x340Var.i(ncf0VarG);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new x060(kbf0VarS, ncf0VarG, (lnm) null, (byte) 29);
                    x340Var.s0(objT2);
                }
                t(ncf0VarG, x340Var, (vu30) objT2);
                fcf0 fcf0VarC = ncf0VarG.c();
                boolean zI2 = x340Var.i(kbf0VarS);
                Object objT3 = x340Var.T();
                if (zI2 || objT3 == m4cVar) {
                    objT3 = new uk1(kbf0VarS, (byte) 7);
                    x340Var.s0(objT3);
                }
                mp10.e(fcf0VarC, (Function0) objT3, (qim0) null, false, false, false, (xc21) null, false, (ddf0) null, (tl3) null, h6mVar, false, false, (Map) null, (jj7) null, false, x340Var, 0, 0, 64508);
                x340Var = x340Var;
                Boolean boolValueOf = Boolean.valueOf(kbf0VarS.j());
                boolean zI3 = x340Var.i(kbf0VarS) | x340Var.i(ven0Var);
                Object objT4 = x340Var.T();
                if (zI3 || objT4 == m4cVar) {
                    objT4 = new vd5(kbf0VarS, ven0Var, null, (byte) 1);
                    x340Var.s0(objT4);
                }
                t(boolValueOf, x340Var, (vu30) objT4);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yg20(i, (byte) 25);
        }
    }

    public static final void c(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2037044163);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            ldx ldxVar = ldx.c;
            String strO0 = cwl1.o0(x340Var, 2131953443);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50(strO0), function0), ldxVar, qim0Var, null, null, null, null, null, null, null, wji.a, x340Var, ((i2 << 3) & 896) | 48, 48, 2040);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tx1(function0, qim0Var, i, (byte) 11);
        }
    }

    public static final void d(cjc0 cjc0Var, af5 af5Var, af5 af5Var2, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(962303191);
        int i2 = i | (x340Var.i(cjc0Var) ? 4 : 2) | (x340Var.i(af5Var) ? 32 : 16) | (x340Var.i(af5Var2) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(af5Var);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) objT2;
            af5 af5Var3 = (af5) ven0Var.getValue();
            uwr uwrVar = cbx.a;
            lee1 lee1VarA = lee1.a(cbx.d(x340Var).g, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, fc11.G(32), (u8e1) null, (wdt0) null, (shc0) null, 0, 16646143);
            boolean zI = x340Var.i(ven0Var2) | x340Var.i(cjc0Var) | x340Var.i(af5Var) | x340Var.i(af5Var2) | x340Var.i(ven0Var);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                tjf0 tjf0Var = new tjf0(cjc0Var, af5Var, af5Var2, ven0Var2, ven0Var, (byte) 27);
                x340Var.s0(tjf0Var);
                objT3 = tjf0Var;
            }
            qim0 qim0Var3 = nim0.a;
            uwo1.f(af5Var3, qim0Var3, lee1VarA, null, null, (iu30) objT3, 1, false, cjc0Var, 0, null, null, x340Var, 48 | ((i2 << 24) & 234881024), 0, 3736);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bvd1(i, cjc0Var, af5Var, af5Var2, qim0Var2, (byte) 16);
        }
    }

    public static final void e(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(229232302);
        if (x340Var.Y(i & 1, i != 0)) {
            qim0 qim0VarN = anm1.N("autoInviteNearbyDisabledIcon", nim0.a);
            jmr0 jmr0VarN = i3o1.n(2131233432, x340Var, 0);
            uwr uwrVar = cbx.a;
            nl70.c(jmr0VarN, (String) null, qim0VarN, cbx.a(x340Var).c.b, x340Var, 56, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yg20(i, (byte) 26);
        }
    }

    public static final void f(int i, int i2, b0k b0kVar, qim0 qim0Var) {
        int i3;
        qim0 qim0Var2;
        af5 af5VarY;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1285377906);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.e(l1d.C(i)) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        if (x340Var.Y(i4 & 1, (i4 & 19) != 18)) {
            m4c m4cVar = fkj0.X;
            int iC = l1d.C(i);
            if (iC == 0) {
                x340Var.i0(331964524);
                Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
                String strO0 = cwl1.o0(x340Var, 2131954988);
                boolean zI = x340Var.i(context) | x340Var.g(strO0);
                Object objT = x340Var.T();
                if (zI || objT == m4cVar) {
                    objT = new gou(context, strO0, (byte) 0);
                    x340Var.s0(objT);
                }
                af5VarY = wmo1.y(2131954990, 2131954989, "privacy_policy", null, (iu30) objT, x340Var, 8);
                x340Var.r(false);
            } else if (iC != 3) {
                x340Var.i0(332773221);
                af5VarY = new af5(cwl1.o0(x340Var, 2131954991));
                x340Var.r(false);
            } else {
                x340Var.i0(332379924);
                Context context2 = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
                String strO1 = cwl1.o0(x340Var, 2131954988);
                boolean zI2 = x340Var.i(context2) | x340Var.g(strO1);
                Object objT2 = x340Var.T();
                if (zI2 || objT2 == m4cVar) {
                    objT2 = new gou(context2, strO1, (byte) 1);
                    x340Var.s0(objT2);
                }
                af5VarY = wmo1.y(2131954992, 2131954989, "privacy_policy", null, (iu30) objT2, x340Var, 8);
                x340Var.r(false);
            }
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).m;
            long jK = f5p1.k(x340Var, 2131102468);
            cjc0 cjc0Var = new cjc0(2);
            qim0Var2 = nim0.a;
            uwo1.d(af5VarY, jK, qim0Var2, lee1Var, new a0e1(3), null, 2, false, cjc0Var, 0, null, null, x340Var, ((i4 << 3) & 896) | 1572864, 0, 3744);
            x340Var = x340Var;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f0e(i, qim0Var2, i2);
        }
    }

    public static final void g(Object obj, Object obj2, Object obj3, iu30 iu30Var, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        boolean zG = x340Var.g(obj) | x340Var.g(obj2) | x340Var.g(obj3);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            objT = new mku(iu30Var);
            x340Var.s0(objT);
        }
    }

    public static final void h(Object obj, Object obj2, iu30 iu30Var, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        boolean zG = x340Var.g(obj) | x340Var.g(obj2);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            objT = new mku(iu30Var);
            x340Var.s0(objT);
        }
    }

    public static final void i(Object obj, iu30 iu30Var, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        boolean zG = x340Var.g(obj);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            objT = new mku(iu30Var);
            x340Var.s0(objT);
        }
    }

    public static final void j(Object[] objArr, iu30 iu30Var, b0k b0kVar) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        x340 x340Var = (x340) b0kVar;
        boolean zE = x340Var.e(objArrCopyOf.length);
        for (Object obj : objArrCopyOf) {
            zE |= x340Var.g(obj);
        }
        Object objT = x340Var.T();
        if (zE || objT == fkj0.X) {
            x340Var.s0(new mku(iu30Var));
        }
    }

    public static final void k(rm0 rm0Var, int i, boolean z, Function0 function0, boolean z2, j2i j2iVar, qim0 qim0Var, b0k b0kVar, int i2) {
        j2i j2iVar2;
        x340 x340Var;
        qim0 qim0Var2;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-438322093);
        int i3 = i2 | (x340Var2.i(rm0Var) ? 4 : 2) | (x340Var2.e(l1d.C(i)) ? 32 : 16) | (x340Var2.h(z) ? 256 : 128) | (x340Var2.i(function0) ? 2048 : 1024) | (x340Var2.h(z2) ? 16384 : 8192) | 1572864;
        if (x340Var2.Y(i3 & 1, (599187 & i3) != 599186)) {
            View view = (View) x340Var2.k(AndroidCompositionLocals_androidKt.f);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zI = ((i3 & 896) == 256) | x340Var2.i(view);
            Object objT = x340Var2.T();
            if (zI || objT == fkj0.X) {
                objT = new cb8(z, view, (byte) 5);
                x340Var2.s0(objT);
            }
            int i4 = (i3 >> 6) & 14;
            i(boolValueOf, (iu30) objT, x340Var2);
            qim0Var2 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var2, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarD);
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
            h2c h2cVar = h2c.a;
            if (z2) {
                x340Var2.i0(-2138607332);
                int i5 = i3 >> 3;
                q(rm0Var, z, h2cVar.a(qim0Var2, new gra(0.0f, -0.33f)), x340Var2, (i3 & 14) | 8 | (i5 & 112));
                x340Var = x340Var2;
                l(i, (i3 & 112) | i4 | (i5 & 896), function0, x340Var, h2cVar.a(qim0Var2, een.X), z);
                j2iVar2 = j2iVar;
                dv20.l(6, j2iVar2, x340Var, false);
            } else {
                x340Var2.i0(-2138788000);
                cbp1.d(0, cwl1.o0(x340Var2, 2131963820), x340Var2, h2cVar.a(qim0Var2, een.h));
                x340Var2.r(false);
                j2iVar2 = j2iVar;
                x340Var = x340Var2;
            }
            x340Var.r(true);
        } else {
            j2iVar2 = j2iVar;
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wag(rm0Var, i, z, function0, z2, j2iVar2, qim0Var2, i2);
        }
    }

    public static final void l(int i, int i2, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i3;
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2139770946);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.h(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.e(l1d.C(i)) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.i(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.g(qim0Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0Var);
            uwr uwrVar = cbx.a;
            qim0 qim0VarZ = uyn1.z(cbx.b(x340Var).b.a, 0.0f, 2, uyn1.B(qim0VarP, 0.0f, 0.0f, 0.0f, cbx.b(x340Var).b.c, 7));
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            if (z) {
                x340Var.i0(-273302648);
                c((i3 >> 6) & 14, function0, x340Var, uyn1.B(nim0.a, 0.0f, 0.0f, 0.0f, dsa0.m(x340Var, 2131167025), 7));
                x340Var.r(false);
            } else {
                x340Var.i0(-273143122);
                x340Var.r(false);
            }
            i4 = i;
            f(i4, (i3 >> 3) & 14, x340Var, null);
            x340Var.r(true);
        } else {
            i4 = i;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fou(z, i4, function0, qim0Var, i2);
        }
    }

    public static final void m(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-325231230);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131962686);
            gpc1 gpc1Var = new gpc1(cwl1.o0(x340Var, 2131962685));
            String strO1 = cwl1.o0(x340Var, 2131963434);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new bb30(iu30Var, (byte) 22);
                x340Var.s0(objT);
            }
            pdp1.e(strO0, strO1, gpc1Var, true, (Function0) objT, x340Var, 3072, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b30((byte) 16, i, iu30Var, false);
        }
    }

    public static final void n(tu8 tu8Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1014818164);
        int i2 = (x340Var.g(tu8Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            cwl1.b(u291.r(qim0Var, 56.0f), een.h, (hw61) null, (pgx) null, (vzq0) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(-1264586915, new yy80(tu8Var, (byte) 7), x340Var), x340Var, 0, 48, 2044);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jj50(tu8Var, qim0Var, i, (byte) 27);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void o(tu8 tu8Var, kly0 kly0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(464450649);
        int i2 = (x340Var.g(tu8Var) ? 4 : 2) | i | (x340Var.i(kly0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwr uwrVar = cbx.a;
            wux wuxVarB = cbx.b(x340Var);
            if (0.75f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            E(wuxVarB, tu8Var, kly0Var, new wnb0(0.75f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.75f, true), x340Var, (i2 << 3) & 1008);
            if (0.25f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            n(tu8Var, new wnb0(0.25f <= Float.MAX_VALUE ? 0.25f : Float.MAX_VALUE, true), x340Var, i2 & 14);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jj50(tu8Var, kly0Var, i, (byte) 28);
        }
    }

    public static final void p(rm0 rm0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        rm0 rm0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(615947806);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(rm0Var) : x340Var.i(rm0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            rm0Var2 = rm0Var;
            otw.c(rm0Var2, rih1.a, d7e.r(1.0f, u291.u(u291.f(qim0Var, 1.0f), dsa0.m(x340Var, 2131166194), dsa0.m(x340Var, 2131166194), 0.0f, 0.0f, 12), false), (ipb1) null, x340Var, 56 | (i2 & 14), 8);
        } else {
            rm0Var2 = rm0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bkh(rm0Var2, qim0Var, i, (byte) 20);
        }
    }

    public static final void q(rm0 rm0Var, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(800371785);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(rm0Var) : x340Var.i(rm0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 48);
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
            float fM = dsa0.m(x340Var, 2131166193);
            nim0 nim0Var = nim0.a;
            p(rm0Var, uyn1.z(fM, 0.0f, 2, nim0Var), x340Var, (i2 & 14) | 8);
            v(d9y0.k(uyn1.B(nim0Var, 0.0f, dsa0.m(x340Var, 2131167025), 0.0f, 0.0f, 13), z ? 1.0f : 0.0f), x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e30(rm0Var, z, qim0Var, i, (byte) 10);
        }
    }

    public static final void r(Object obj, Object obj2, Object obj3, vu30 vu30Var, b0k b0kVar) {
        o8n o8nVar = ((x340) b0kVar).R;
        x340 x340Var = (x340) b0kVar;
        boolean zG = x340Var.g(obj) | x340Var.g(obj2) | x340Var.g(obj3);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            objT = new mkb0(o8nVar, vu30Var);
            x340Var.s0(objT);
        }
    }

    public static final void s(Object obj, Object obj2, vu30 vu30Var, b0k b0kVar) {
        o8n o8nVar = ((x340) b0kVar).R;
        x340 x340Var = (x340) b0kVar;
        boolean zG = x340Var.g(obj) | x340Var.g(obj2);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            objT = new mkb0(o8nVar, vu30Var);
            x340Var.s0(objT);
        }
    }

    public static final void t(Object obj, b0k b0kVar, vu30 vu30Var) {
        o8n o8nVar = ((x340) b0kVar).R;
        x340 x340Var = (x340) b0kVar;
        boolean zG = x340Var.g(obj);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            objT = new mkb0(o8nVar, vu30Var);
            x340Var.s0(objT);
        }
    }

    public static final void u(Object[] objArr, vu30 vu30Var, b0k b0kVar) {
        o8n o8nVar = ((x340) b0kVar).R;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        x340 x340Var = (x340) b0kVar;
        boolean zE = x340Var.e(objArrCopyOf.length);
        for (Object obj : objArrCopyOf) {
            zE |= x340Var.g(obj);
        }
        Object objT = x340Var.T();
        if (zE || objT == fkj0.X) {
            x340Var.s0(new mkb0(o8nVar, vu30Var));
        }
    }

    public static final void v(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1382778467);
        int i2 = i | (x340Var.g(qim0Var) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131957146);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, qim0Var, cbx.d(x340Var).e, 0L, null, null, 0, false, null, 0, null, x340Var, (i2 << 3) & 112, 0, 2040);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wdk(qim0Var, i, (byte) 15);
        }
    }

    public static final void w(String str, String str2, String str3, jkf0 jkf0Var, boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        String str4;
        String str5;
        jkf0 jkf0Var2;
        boolean z2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1136492815);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str4 = str2;
            i2 |= b0kVar3.g(str4) ? 32 : 16;
        } else {
            str4 = str2;
        }
        if ((i & 384) == 0) {
            str5 = str3;
            i2 |= b0kVar3.g(str5) ? 256 : 128;
        } else {
            str5 = str3;
        }
        if ((i & 3072) == 0) {
            jkf0Var2 = jkf0Var;
            i2 |= b0kVar3.g(jkf0Var2) ? 2048 : 1024;
        } else {
            jkf0Var2 = jkf0Var;
        }
        if ((i & 24576) == 0) {
            z2 = z;
            i2 |= b0kVar3.h(z2) ? 16384 : 8192;
        } else {
            z2 = z;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 131072 : 65536;
        }
        if (b0kVar3.Y(i2 & 1, (74899 & i2) != 74898)) {
            boolean z3 = (i2 & 458752) == 131072;
            Object objT = b0kVar3.T();
            if (z3 || objT == fkj0.X) {
                objT = new uef0(iu30Var, (byte) 1);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            x74.f((Function0) objT, (scx) null, (mfx) null, false, false, 0.0f, false, (Boolean) null, false, false, (vu30) null, apo.r(-915321104, new j6v(jkf0Var2, str, str4, str5, z2, iu30Var, (byte) 4), b0kVar3), b0kVar2, 0, 48, 2046);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new si2(str, str2, str3, jkf0Var, z, iu30Var, i);
        }
    }

    public static final void x(int i, int i2, b0k b0kVar, qim0 qim0Var, boolean z) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1227059060);
        int i3 = (x340Var.e(2131232428) ? 4 : 2) | i2 | (x340Var.h(z) ? 32 : 16) | (x340Var.e(i) ? 256 : 128) | (x340Var.g(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            boolean z2 = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = vap1.a(context, i);
                x340Var.s0(objT);
            }
            qim0Var2 = qim0Var;
            cso1.f(x7v.a((Drawable) objT, x340Var), isl.a, qim0Var2, mif1.P0, null, x340Var, 3128 | ((i3 >> 3) & 896), 48);
        } else {
            qim0Var2 = qim0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kx9(z, i, qim0Var2, i2);
        }
    }

    public static final void y(String str, ebq0 ebq0Var, boolean z, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1860799316);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(ebq0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.g(qim0Var) ? 16384 : 8192;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            ydx ydxVar = new ydx(2.0f, 0.0f, 12.0f, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), wdx.a);
            qim0 qim0VarN = anm1.N("OnboardingCardElementTestTag", pqo.h(qim0Var, z));
            boolean z2 = (i2 & 7168) == 2048;
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new tro0(iu30Var, (byte) 24);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            ioo1.c(qim0VarN, null, ydxVar, null, null, null, null, new gbx(z50.c, (Function0) objT), null, apo.r(-1863919, new qsn0(ebq0Var, (byte) 17), b0kVar3), null, null, null, null, null, null, apo.r(-1472827241, new qdg0(str, (byte) 16), b0kVar3), b0kVar2, 805306880, 1572864, 64890);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new sx1((byte) 27, i, (Object) str, (Object) ebq0Var, (Object) iu30Var, qim0Var, z);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void z(Long l, c380 c380Var, qim0 qim0Var, int i, boolean z, String str, String str2, b0k b0kVar, int i2, int i3) throws NoWhenBranchMatchedException {
        int i4;
        int i5;
        boolean z2;
        int i6;
        qim0 qim0Var2;
        String str3;
        String str4;
        boolean z3;
        int i7;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1961427473);
        if ((i2 & 6) == 0) {
            i4 = i2 | (x340Var.g(l) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i8 = i4 | (x340Var.g(c380Var) ? 32 : 16);
        int i9 = i8 | 384;
        int i10 = i3 & 8;
        if (i10 != 0) {
            i5 = i8 | 3456;
        } else {
            i5 = (x340Var.e(i == 0 ? -1 : l1d.C(i)) ? 2048 : 1024) | i9;
        }
        int i11 = i3 & 16;
        if (i11 != 0) {
            i6 = i5 | 24576;
            z2 = z;
        } else {
            z2 = z;
            i6 = i5 | (x340Var.h(z2) ? 16384 : 8192);
        }
        int i12 = i6 | 1769472;
        if (x340Var.Y(i12 & 1, (599187 & i12) != 599186)) {
            int i13 = i10 != 0 ? 0 : i;
            boolean z4 = i11 != 0 ? false : z2;
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            boolean zG = x340Var.g(context);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = new aht0(context);
                x340Var.s0(objT);
            }
            aht0 aht0Var = (aht0) objT;
            int i14 = i12 << 3;
            int i15 = (i14 & 896) | (i14 & 112) | 3072;
            String strJ = J(aht0Var, l, c380Var, false, x340Var, i15);
            String strJ2 = J(aht0Var, l, c380Var, true, x340Var, i15);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarH = pqo.h(qim0Var3, z4);
            jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5(false)), een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarH);
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
            if (i13 == 0) {
                x340Var.i0(-861916351);
                x340Var.r(false);
            } else {
                x340Var.i0(-861916350);
                kqn1.d(i13, 0, 0, x340Var, anm1.N("content_restriction_badge", qim0Var3));
                x340Var.r(false);
            }
            qim0 qim0VarN = anm1.N("subtitle", qim0Var3);
            boolean zG2 = x340Var.g(strJ2);
            Object objT2 = x340Var.T();
            if (zG2 || objT2 == m4cVar) {
                objT2 = new sc21(strJ2, (byte) 15);
                x340Var.s0(objT2);
            }
            qim0 qim0VarB = s161.b(qim0VarN, false, (iu30) objT2);
            uwr uwrVar = cbx.a;
            int i16 = i13;
            uwo1.e(strJ, qim0VarB, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 2, false, new cjc0(1), 0, null, x340Var, 0, 0, 1712);
            x340Var.r(true);
            z3 = z4;
            qim0Var2 = qim0Var3;
            i7 = i16;
            str4 = "content_restriction_badge";
            str3 = "subtitle";
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            str3 = str;
            str4 = str2;
            z3 = z2;
            i7 = i;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qx31(l, c380Var, qim0Var2, i7, z3, str3, str4, i2, i3);
        }
    }
}
