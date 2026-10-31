package p;

import android.content.res.Configuration;
import android.net.Uri;
import android.text.format.DateFormat;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import j$.time.Clock;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cy00 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy00(ArrayList arrayList, vu30 vu30Var, String str) {
        super(3);
        this.a = (byte) 19;
        this.b = arrayList;
        this.c = vu30Var;
        this.d = str;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        nim0 nim0Var = nim0.a;
        qim0 qim0VarA = ((nw31) obj).a(1.0f, nim0Var, true);
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var).b;
        qim0 qim0VarZ = uyn1.z(0.0f, 4.0f, 1, qim0VarA);
        cvx cvxVar2 = cbx.b(x340Var).b;
        d36 d36Var = new d36(12.0f, true, new um5(false));
        fra fraVar = een.N0;
        Function0 function0 = (Function0) this.c;
        String str = (String) this.b;
        iu30 iu30Var = (iu30) this.d;
        jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var, 0);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
        nko1.H(jw31VarA, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        boolean zG = x340Var3.g(function0);
        Object objT = x340Var3.T();
        if (zG || objT == m4cVar) {
            objT = new j160(function0, (byte) 16);
            x340Var3.s0(objT);
        }
        foo1.c(new gbx(z50.c, (Function0) objT), kdx.c, anm1.N("InteractiveEntrypoint.Ask", nim0Var), (max) null, yla.s(x340Var), (vzq0) null, (idn0) null, (ga80) null, cti.a, (vu30) null, cti.b, x340Var, 805306368, 48, 1496);
        boolean zG2 = x340Var3.g(iu30Var) | x340Var3.g(str);
        Object objT2 = x340Var3.T();
        if (zG2 || objT2 == m4cVar) {
            objT2 = new are(iu30Var, str, (byte) 9);
            x340Var3.s0(objT2);
        }
        nz80.h(0, str, (Function0) objT2, x340Var, new wnb0(1.0f, true));
        x340Var3.r(true);
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        float f = ((p3v) obj).a;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.d(f) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            qim0 qim0VarZ = u291.z(u291.f(nim0.a, 1.0f), (fra) null, 3);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarZ2 = uyn1.z(16.0f, 0.0f, 2, qim0VarZ);
            era eraVar = een.Q0;
            jx90 jx90Var = (jx90) this.b;
            iu30 iu30Var = (iu30) this.c;
            d6o0 d6o0Var = (d6o0) this.d;
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarZ2);
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
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            hqq0.o(x340Var2, 0);
            hqq0.y(x340Var2, 0);
            if (jx90Var.a()) {
                x340Var2.i0(-7026285);
                hqq0.k(iu30Var, x340Var2, 0);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-6979196);
                x340Var2.r(false);
            }
            hqq0.t(jx90Var, d6o0Var, iu30Var, uyn1.j(0.0f, 0.0f, 0.0f, f, 7), (qim0) null, x340Var2, 0);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        vu30 vu30Var = (vu30) this.c;
        ArrayList arrayList = (ArrayList) this.b;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            qim0 qim0VarY = uyn1.y(qim0VarF, 16.0f, 8.0f);
            String str = (String) this.d;
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            x340Var2.i0(1866352504);
            x340Var2.r(false);
            uwo1.e(str, h2c.a.a(u291.f(nim0Var, 1.0f), een.h), cbx.d(x340Var2).g, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2024);
            x340Var2.r(true);
            cvx cvxVar3 = cbx.b(x340Var2).b;
            rqo1.g(0, 0, x340Var2, uyn1.z(0.0f, 8.0f, 1, nim0Var));
            cvx cvxVar4 = cbx.b(x340Var2).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, nim0Var);
            WeakHashMap weakHashMap = osl1.x;
            vk80 vk80VarC = hqq0.C(lhc.g(x340Var2).g, x340Var2);
            cvx cvxVar5 = cbx.b(x340Var2).b;
            hdh hdhVarN = lnn1.n(vk80VarC, uyn1.j(0.0f, 0.0f, 0.0f, 8.0f, 7));
            boolean zG = x340Var2.g(arrayList) | x340Var2.g(vu30Var);
            Object objT = x340Var2.T();
            if (zG || objT == fkj0.X) {
                objT = new vq80(arrayList, vu30Var, (byte) 10);
                x340Var2.s0(objT);
            }
            ujo1.d(qim0VarZ, (xtb0) null, hdhVarN, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT, x340Var2, 0, 506);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        n6c0 n6c0Var = (n6c0) this.b;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
            sco scoVar = n6c0Var.d;
            if (scoVar == null) {
                x340Var2.i0(-582653853);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-582653852);
                Function0 function0 = (Function0) this.c;
                String str = scoVar.a;
                boolean zG = x340Var2.g(function0);
                Object objT = x340Var2.T();
                if (zG || objT == m4cVar) {
                    objT = new aba0(function0, (byte) 6);
                    x340Var2.s0(objT);
                }
                Function0 function1 = (Function0) objT;
                if (ihc1.y0(str)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                foo1.c(new gbx(new y50(str), function1), new idx(), (qim0) null, (max) null, yla.s(x340Var2), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-1462182233, new i6c0(scoVar, (byte) 0), x340Var2), x340Var2, 0, 48, 2012);
                x340Var2.r(false);
            }
            sco scoVar2 = n6c0Var.e;
            if (scoVar2 == null) {
                x340Var2.i0(-582320510);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-582320509);
                Function0 function2 = (Function0) this.d;
                String str2 = scoVar2.a;
                boolean zG2 = x340Var2.g(function2);
                Object objT2 = x340Var2.T();
                if (zG2 || objT2 == m4cVar) {
                    objT2 = new aba0(function2, (byte) 7);
                    x340Var2.s0(objT2);
                }
                Function0 function3 = (Function0) objT2;
                if (ihc1.y0(str2)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                foo1.c(new gbx(new y50(str2), function3), ldx.c, (qim0) null, (max) null, yla.s(x340Var2), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-1601853424, new i6c0(scoVar2, (byte) 1), x340Var2), x340Var2, 48, 48, 2012);
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        x340 x340Var = (b0k) obj2;
        int iIntValue2 = ((Number) obj3).intValue();
        iu30 iu30Var = (iu30) this.d;
        if ((iIntValue2 & 6) == 0) {
            iIntValue2 |= x340Var.e(iIntValue) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
            hec0 hec0Var = (hec0) ((List) this.b).get(iIntValue);
            x340Var2.i0(1330484138);
            boolean zJ = u890.j(hec0Var, (hec0) this.c);
            String str = hec0Var.c;
            qim0 qim0VarN = anm1.N("filter_chip_" + str, nim0.a);
            boolean zH = x340Var2.h(zJ) | x340Var2.g(iu30Var) | x340Var2.g(hec0Var);
            Object objT = x340Var2.T();
            if (zH || objT == fkj0.X) {
                objT = new vm1(zJ, iu30Var, hec0Var, (byte) 15);
                x340Var2.s0(objT);
            }
            oec0.b(str, new gbx(z50.c, (Function0) objT), qim0VarN, zJ, x340Var2, 0);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        vzq0 vzq0Var = (vzq0) obj;
        ((Number) obj3).intValue();
        List list = (List) this.d;
        tob1 tob1Var = (tob1) this.c;
        p9d0 p9d0Var = (p9d0) this.b;
        x340 x340Var = (b0k) obj2;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = l1d0.a1;
            x340Var.s0(objT);
        }
        h3h1 h3h1Var = new h3h1((iu30) objT);
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var).b;
        cvx cvxVar2 = cbx.b(x340Var).b;
        cvx cvxVar3 = cbx.b(x340Var).b;
        hdh hdhVarN = lnn1.n(uyn1.j(4.0f, 16.0f, 4.0f, 0.0f, 8), vzq0Var);
        boolean zI = x340Var.i(p9d0Var) | x340Var.i(tob1Var) | x340Var.i(list);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new lb50(p9d0Var, list, tob1Var, (byte) 20);
            x340Var.s0(objT2);
        }
        s3o1.d((qim0) null, (xtb0) null, hdhVarN, (g36) null, (nl3) null, (iq20) null, false, h3h1Var, (iu30) objT2, x340Var, 0, 251);
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        sdd0 sdd0Var = (sdd0) this.b;
        rwj rwjVar = sdd0Var.f;
        String str = ((tdd0) this.c).a;
        xdd0 xdd0Var = sdd0Var.h;
        otw.c(rwjVar, new v630(xdd0Var.b, str, xdd0Var.c, xdd0Var.e, (ArrayList) this.d), (qim0) null, (ipb1) null, (b0k) obj2, 0, 12);
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        String strN0;
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        qim0 qim0VarN = anm1.N("lp-date-and-time-label", nim0.a);
        LocalDateTime localDateTime = (LocalDateTime) this.b;
        ZoneId zoneId = (ZoneId) this.c;
        Locale locale = (Locale) this.d;
        long jBetween = ChronoUnit.DAYS.between(LocalDate.now(zoneId), localDateTime.atZone(zoneId).toLocalDate());
        String str = localDateTime.format(DateTimeFormatter.ofPattern(localDateTime.getMinute() > 0 ? "h:mma" : "ha"));
        if (jBetween == 0) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1958749874);
            str.getClass();
            strN0 = cwl1.n0(2131957473, new Object[]{str}, x340Var2);
            x340Var2.r(false);
        } else if (jBetween == 1) {
            x340 x340Var3 = x340Var;
            x340Var3.i0(1958860079);
            str.getClass();
            strN0 = cwl1.n0(2131957474, new Object[]{str}, x340Var3);
            x340Var3.r(false);
        } else {
            x340 x340Var4 = x340Var;
            x340Var4.i0(1958987179);
            String str2 = localDateTime.format(DateTimeFormatter.ofPattern(DateFormat.getBestDateTimePattern(locale, "MMM d"), locale));
            str2.getClass();
            str.getClass();
            strN0 = cwl1.n0(2131957472, new Object[]{str2, str}, x340Var4);
            x340Var4.r(false);
        }
        uwo1.e(strN0, qim0VarN, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new zic0(1), 0, (qx8) null, x340Var, 0, 0, 1724);
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        x340 x340Var = (b0k) obj2;
        Object objT = x340Var.T();
        j06 j06Var = x340Var.a;
        if (objT == fkj0.X) {
            objT = ecd0.Y0;
            x340Var.s0(objT);
        }
        nim0 nim0Var = nim0.a;
        qim0 qim0VarA = s161.a(nim0Var, (iu30) objT);
        ckd0 ckd0Var = (ckd0) this.b;
        Function0 function0 = (Function0) this.c;
        Function0 function1 = (Function0) this.d;
        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
        int iHashCode = Long.hashCode(x340Var.T);
        xos0 xos0VarM = x340Var.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
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
        qim0 qim0VarH = u291.h(nim0Var, 295.0f);
        gra graVar = een.d;
        gfh0 gfh0VarC = t1c.c(graVar, false);
        int iHashCode2 = Long.hashCode(x340Var.T);
        xos0 xos0VarM2 = x340Var.m();
        qim0 qim0VarE2 = zr7.E(x340Var, qim0VarH);
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
        i1p1.j(ckd0Var.f, 0, ckd0Var.c, x340Var, ckd0Var.b);
        qim0 qim0VarA2 = h2c.a.a(uyn1.x(nim0Var, 16.0f), een.t);
        gfh0 gfh0VarC2 = t1c.c(graVar, false);
        int iHashCode3 = Long.hashCode(x340Var.T);
        xos0 xos0VarM3 = x340Var.m();
        qim0 qim0VarE3 = zr7.E(x340Var, qim0VarA2);
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
        String str = ckd0Var.d;
        String str2 = ckd0Var.e;
        i1p1.b(str, ckd0Var.h, str2, ckd0Var.g, ckd0Var.f, x340Var, 0);
        x340Var.r(true);
        x340Var.r(true);
        boolean z2 = ckd0Var.b;
        boolean z3 = ckd0Var.m;
        i1p1.a(ckd0Var.i, z2, z3, ckd0Var.j, ckd0Var.k, ckd0Var.l, ckd0Var.f, function0, function1, (qim0) null, x340Var, 0);
        x340Var.r(true);
        return rih1.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        iu30 iu30Var = (iu30) this.d;
        m4c m4cVar = fkj0.X;
        yge0 yge0Var = (yge0) this.b;
        x340 x340Var = (b0k) obj2;
        boolean zI = x340Var.i(yge0Var);
        Object objT = x340Var.T();
        if (zI || objT == m4cVar) {
            objT = new mne0(yge0Var, (lnm) null, (byte) 1);
            x340Var.s0(objT);
        }
        rih1 rih1Var = rih1.a;
        qxd0.t(rih1Var, x340Var, (vu30) objT);
        nhe0 nhe0Var = (nhe0) this.c;
        boolean zI2 = x340Var.i(yge0Var) | x340Var.g(iu30Var);
        Object objT2 = x340Var.T();
        if (zI2 || objT2 == m4cVar) {
            objT2 = new nne0(yge0Var, iu30Var, (byte) 1);
            x340Var.s0(objT2);
        }
        s9p1.f(nhe0Var, (Function0) objT2, (qim0) null, x340Var, 0);
        String strO0 = cwl1.o0(x340Var, 2131963255);
        String strN0 = cwl1.n0(2131963254, new Object[]{strO0}, x340Var);
        uwr uwrVar = cbx.a;
        lee1 lee1Var = cbx.d(x340Var).k;
        StringBuilder sb = new StringBuilder(16);
        ArrayList arrayListM = xvj1.m();
        new ArrayList();
        sb.append(strN0);
        int iW0 = ihc1.w0(strN0, strO0, 0, false, 6);
        if (iW0 >= 0) {
            zma1 zma1Var = lee1Var.a;
            arrayListM.add(new xe5(iW0, strO0.length() + iW0, 8, new zma1(0L, 0L, zma1Var.c, zma1Var.d, (FontSynthesis) null, zma1Var.f, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65491), (String) null));
        }
        String string = sb.toString();
        ArrayList arrayList = new ArrayList(arrayListM.size());
        int size = arrayListM.size();
        for (int iG = 0; iG < size; iG = c13.g(sb, (xe5) arrayListM.get(iG), arrayList, iG, 1)) {
        }
        af5 af5Var = new af5(string, arrayList);
        lee1 lee1Var2 = cbx.d(x340Var).j;
        long j = cbx.a(x340Var).b.b;
        cvx cvxVar = cbx.b(x340Var).b;
        cvx cvxVar2 = cbx.b(x340Var).b;
        uwo1.d(af5Var, j, uyn1.y(nim0.a, 16.0f, 8.0f), lee1Var2, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var, 0, 0, 4080);
        return rih1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [int] */
    /* JADX WARN: Type inference failed for: r11v4 */
    private final Object n(Object obj, Object obj2, Object obj3) {
        m4c m4cVar;
        hwq0 hwq0Var;
        x340 x340Var;
        boolean z;
        hwq0 hwq0Var2;
        ((Number) obj3).intValue();
        float f = ((cvx) this.b).d;
        nim0 nim0Var = nim0.a;
        qim0 qim0VarY = uyn1.y(nim0Var, f, 16.0f);
        x340 x340Var2 = (b0k) obj2;
        Object objT = x340Var2.T();
        m4c m4cVar2 = fkj0.X;
        if (objT == m4cVar2) {
            objT = gje0.Z;
            x340Var2.s0(objT);
        }
        qim0 qim0VarB = s161.b(qim0VarY, false, (iu30) objT);
        era eraVar = een.Q0;
        hwq0 hwq0Var3 = (hwq0) this.c;
        iu30 iu30Var = (iu30) this.d;
        mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var2, 0);
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
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
        nko1.H(mbhVarA, x340Var2, y580.O0);
        nko1.H(xos0VarM, x340Var2, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
        nko1.F(x340Var2);
        nko1.H(qim0VarE, x340Var2, y580.Y);
        if (hwq0Var3.d != null) {
            x340Var2.i0(1189902996);
            String str = hwq0Var3.d;
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var2).e;
            qim0 qim0VarB2 = uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar2) {
                objT2 = gje0.N0;
                x340Var2.s0(objT2);
            }
            m4cVar = m4cVar2;
            z = false;
            hwq0Var = hwq0Var3;
            uwo1.e(str, s161.b(qim0VarB2, false, (iu30) objT2), lee1Var, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2024);
            x340Var = x340Var2;
            x340Var.r(false);
        } else {
            m4cVar = m4cVar2;
            hwq0Var = hwq0Var3;
            x340Var = x340Var2;
            z = false;
            x340Var.i0(1190132923);
            x340Var.r(false);
        }
        if (hwq0Var.e != null) {
            x340Var.i0(1190188413);
            x340 x340Var3 = x340Var;
            String str2 = hwq0Var.e;
            uwr uwrVar2 = cbx.a;
            hwq0Var2 = hwq0Var;
            uwo1.e(str2, uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 16.0f, 7), cbx.d(x340Var3).g, cbx.a(x340Var3).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var3, 0, 0, 2016);
            x340Var = x340Var3;
            x340Var.r(z);
        } else {
            hwq0Var2 = hwq0Var;
            x340Var.i0(1190440443);
            x340Var.r(z);
        }
        x340Var.i0(-1624165351);
        ?? r11 = z;
        for (Object obj4 : hwq0Var2.f) {
            int i = r11 + 1;
            if (r11 < 0) {
                p7h.T();
                throw null;
            }
            rvb rvbVar = (rvb) obj4;
            String str3 = rvbVar.a;
            boolean zG = x340Var.g(iu30Var) | x340Var.e((int) r11);
            Object objT3 = x340Var.T();
            if (zG || objT3 == m4cVar) {
                objT3 = new ck0(iu30Var, (int) r11, (byte) 12);
                x340Var.s0(objT3);
            }
            x340 x340Var4 = x340Var;
            foo1.c(new gbx(new y50(str3), (Function0) objT3), r11 == 0 ? new idx(4) : ldx.c, uyn1.B(nim0Var, 0.0f, r11 > 0 ? 8.0f : 16.0f, 0.0f, 0.0f, 13), (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(712125513, new s2c0((Object) rvbVar, (byte) 24), x340Var), x340Var4, 0, 48, 2040);
            x340Var = x340Var4;
            r11 = i;
        }
        x340Var.r(z);
        x340Var.r(true);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        Object wm10Var;
        float f;
        String strN0;
        ksl kslVar;
        byte b = this.a;
        f36 f36Var = h36.c;
        u5j1 u5j1Var = d4o1.a;
        n4k n4kVar = hmb0.t1;
        float f2 = 1.0f;
        nim0 nim0Var = nim0.a;
        byte b2 = 0;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.d;
        Object obj5 = this.b;
        Object obj6 = this.c;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                hax haxVar = new hax("Loading");
                j2i j2iVar = (j2i) obj5;
                Function0 function0 = (Function0) obj6;
                Function0 function1 = (Function0) obj4;
                x340 x340Var = (b0k) obj2;
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = oxx.d1;
                    x340Var.s0(objT);
                }
                ey00.b(false, idh1.b, j2iVar, function0, function1, (Function0) objT, null, haxVar, x340Var, 196662, 64);
                return rih1Var;
            case 1:
                i2c i2cVar = (i2c) obj;
                x340 x340Var2 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                Configuration configuration = (Configuration) obj6;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var2.g(i2cVar) ? 4 : 2;
                }
                x340 x340Var3 = x340Var2;
                if (x340Var3.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    boolean zD = x340Var3.d(i2cVar.d()) | x340Var3.e(configuration.orientation);
                    vzq0 vzq0Var = (vzq0) obj4;
                    Object objT2 = x340Var3.T();
                    if (zD || objT2 == fkj0.X) {
                        float fD = i2cVar.d();
                        float fC = i2cVar.c();
                        int i = configuration.orientation;
                        Map map = ym10.a;
                        float fMax = Math.max(300.0f, fC);
                        wmb0 wmb0Var = i == 2 ? wmb0.b : wmb0.a;
                        if (p3v.b(fD, ((p3v) sqg0.G(wmb0Var, ym10.a)).a) <= 0) {
                            wm10Var = new um10(fMax, wmb0Var, new zzq0(6.0f, 12.0f, 6.0f, vzq0Var.a() + 24.0f));
                        } else if (p3v.b(fD, ((p3v) sqg0.G(wmb0Var, ym10.b)).a) <= 0) {
                            int iOrdinal = wmb0Var.ordinal();
                            if (iOrdinal == 0) {
                                f = 24.0f;
                            } else {
                                if (iOrdinal != 1) {
                                    eg.o();
                                    return null;
                                }
                                f = 16.0f;
                            }
                            wm10Var = new vm10(fMax, wmb0Var, new zzq0(f, 36.0f, f, vzq0Var.a() + 24.0f));
                        } else {
                            wm10Var = new wm10(fMax, wmb0Var, new zzq0(64.0f, 36.0f, 64.0f, vzq0Var.a() + 24.0f));
                        }
                        objT2 = wm10Var;
                        x340Var3.s0(objT2);
                    }
                    ((j2i) obj5).invoke((xm10) objT2, x340Var3, 0);
                } else {
                    x340Var3.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var4 = (b0k) obj2;
                ((Number) obj3).intValue();
                yzo1 yzo1Var = ((x720) obj5).b;
                if (yzo1Var instanceof v720) {
                    x340 x340Var5 = x340Var4;
                    x340Var5.i0(1969660465);
                    h4p1.a((v720) yzo1Var, (iu30) obj6, (qim0) null, (Clock) obj4, x340Var5, 6);
                    x340Var5.r(false);
                } else if (yzo1Var instanceof u720) {
                    x340 x340Var6 = x340Var4;
                    x340Var6.i0(1969667806);
                    m1p1.c((u720) yzo1Var, (iu30) obj6, (qim0) null, x340Var6, 6);
                    x340Var6.r(false);
                } else if (u890.j(yzo1Var, w720.c)) {
                    x340 x340Var7 = x340Var4;
                    x340Var7.i0(1969671834);
                    zzo1.f(x340Var7, 0);
                    x340Var7.r(false);
                } else {
                    if (yzo1Var != null) {
                        throw p3d1.k(x340Var4, 1969657791, false);
                    }
                    x340 x340Var8 = x340Var4;
                    x340Var8.i0(930312271);
                    x340Var8.r(false);
                }
                return rih1Var;
            case 3:
                int iIntValue2 = ((Number) obj).intValue();
                x340 x340Var9 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                iu30 iu30Var = (iu30) obj4;
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= x340Var9.e(iIntValue2) ? 4 : 2;
                }
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    ya20 ya20Var = (ya20) ((ArrayList) obj5).get(iIntValue2);
                    x340Var10.i0(-678635154);
                    boolean z = ya20Var.a == ((k620) obj6);
                    boolean zG = x340Var10.g(iu30Var) | x340Var10.g(ya20Var);
                    Object objT3 = x340Var10.T();
                    if (zG || objT3 == fkj0.X) {
                        objT3 = new zf10(iu30Var, ya20Var, (byte) 6);
                        x340Var10.s0(objT3);
                    }
                    poo1.g(z, (iu30) objT3, new nex(4), yoo1.z(x340Var10), (qim0) null, 0, (qex) null, (String) null, (max) null, (vu30) null, (vu30) null, (idn0) null, (ga80) null, false, (vzq0) null, apo.r(2063616590, new rr10(ya20Var, (byte) 3), x340Var10), x340Var10, 0, 196608, 32752);
                    x340Var10.r(false);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 4:
                int iIntValue4 = ((Number) obj).intValue();
                x340 x340Var11 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= x340Var11.e(iIntValue4) ? 4 : 2;
                }
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    qa20 qa20Var = (qa20) ((ArrayList) obj5).get(iIntValue4);
                    x340Var12.i0(1432844541);
                    p1p1.h(qa20Var, (c380) obj6, (uny) obj4, (qim0) null, x340Var12, 0);
                    x340Var12.r(false);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 5:
                g2c g2cVar = (g2c) obj;
                x340 x340Var13 = (b0k) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                wxn wxnVar = (wxn) obj5;
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= x340Var13.g(g2cVar) ? 4 : 2;
                }
                x340 x340Var14 = x340Var13;
                if (!x340Var14.Y(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    x340Var14.b0();
                } else if (wxnVar != null) {
                    x340Var14.i0(1373184121);
                    x340Var14.f0(-925534641, (yvg1) obj6);
                    otw.c((hz5) ((xvu) obj4).i, new byn(wxnVar), g2cVar.b(nim0Var), (ipb1) null, x340Var14, 8, 8);
                    x340Var14.r(false);
                    x340Var14.r(false);
                } else {
                    x340Var14.i0(1373439747);
                    x340Var14.r(false);
                }
                return rih1Var;
            case 6:
                i2c i2cVar2 = (i2c) obj;
                x340 x340Var15 = (b0k) obj2;
                ((Number) obj3).intValue();
                ven0 ven0Var = (ven0) obj5;
                mmr0 mmr0Var = (mmr0) ven0Var.getValue();
                int iIntValue7 = ((Number) mmr0Var.a).intValue();
                int iIntValue8 = ((Number) mmr0Var.b).intValue();
                qim0 qim0VarV = u291.v(nim0Var, yoi1.m(new p3v(192.0f * (iIntValue8 > 0 ? iIntValue7 / iIntValue8 : 1.0f)), new p3v(i2cVar2.d() * 0.72f)).a);
                as40 as40Var = (as40) obj6;
                ujo ujoVar = (ujo) obj4;
                mbh mbhVarA = jbh.a(f36Var, een.P0, x340Var15, 0);
                x340 x340Var16 = x340Var15;
                int iHashCode = Long.hashCode(x340Var16.T);
                xos0 xos0VarM = x340Var16.m();
                qim0 qim0VarE = zr7.E(x340Var15, qim0VarV);
                hzj.A.getClass();
                x340 x340Var17 = x340Var15;
                if (x340Var17.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var17.m0();
                if (x340Var17.S) {
                    x340Var17.l(n4kVar);
                } else {
                    x340Var17.v0();
                }
                nko1.H(mbhVarA, x340Var15, y580.O0);
                nko1.H(xos0VarM, x340Var15, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var15, y580.R0);
                nko1.F(x340Var15);
                nko1.H(qim0VarE, x340Var15, y580.Y);
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(x340Var15).f;
                qim0 qim0VarQ = i1p1.q(nim0Var, er31.b(16.0f));
                yr40 yr40Var = (yr40) as40Var;
                Uri uri = Uri.parse(yr40Var.a);
                boolean zI = x340Var17.i(ven0Var);
                Object objT4 = x340Var17.T();
                if (zI || objT4 == fkj0.X) {
                    objT4 = new i030(ven0Var, (byte) 8);
                    x340Var17.s0(objT4);
                }
                ni7 ni7VarA = oi7.a(uri, (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) objT4, (iu30) null, (iu30) null, 0L, x340Var15, 0, 0, 126974);
                as80 as80Var = mif1.S0;
                ecx ecxVar = new ecx(iIntValue7, iIntValue8);
                x340Var17.i0(-519481850);
                String str = yr40Var.b;
                if (str.length() == 0) {
                    x340Var17.r(false);
                    kslVar = isl.a;
                } else {
                    if (yr40Var.c) {
                        x340Var17.i0(-1116425631);
                        strN0 = cwl1.n0(2131961341, new Object[]{str}, x340Var17);
                        x340Var17.r(false);
                    } else {
                        x340Var17.i0(-1116327609);
                        strN0 = cwl1.n0(2131961340, new Object[]{yr40Var.d, str}, x340Var17);
                        x340Var17.r(false);
                    }
                    ksl jslVar = new jsl(strN0);
                    x340Var17.r(false);
                    kslVar = jslVar;
                }
                eso1.h(ni7VarA, kslVar, qim0VarQ, (p3v) null, (zvx) null, ecxVar, as80Var, (tl3) null, (ColorFilter) null, x340Var15, 3072, 400);
                String str2 = yr40Var.g;
                if (str2 == null || ujoVar == null) {
                    x340Var17.i0(1625868481);
                    x340Var17.r(false);
                } else {
                    x340Var17.i0(1625765654);
                    otw.c(ujoVar, new pof1(str2), (qim0) null, (ipb1) null, x340Var15, 0, 12);
                    x340Var17.r(false);
                }
                x340Var17.r(true);
                return rih1Var;
            case 7:
                x340 x340Var18 = (b0k) obj2;
                ((Number) obj3).intValue();
                fs40 fs40Var = (fs40) obj5;
                Uri uri2 = Uri.parse(fs40Var.a);
                jsl jslVar2 = new jsl(cwl1.o0(x340Var18, 2131956654));
                ven0 ven0Var2 = (ven0) obj4;
                x340 x340Var19 = x340Var18;
                boolean zI2 = x340Var19.i(ven0Var2);
                Object objT5 = x340Var19.T();
                if (zI2 || objT5 == fkj0.X) {
                    objT5 = new i030(ven0Var2, (byte) 9);
                    x340Var19.s0(objT5);
                }
                cso1.d(uri2, jslVar2, anm1.N("backgroundImage", ern1.x(nim0Var, (iu30) objT5)), mif1.P0, (jmr0) null, (jmr0) null, (tl3) null, x340Var19, 0, 240);
                rqt0.f(((yr80) ven0Var2.getValue()).a, x340Var19, 0);
                rqt0.a((Function0) obj6, fs40Var.b, fs40Var.c, fs40Var.d, fs40Var.e, x340Var19, 0);
                return rih1Var;
            case 8:
                fdg1.g((jc50) obj5, (sp00) obj6, (iu30) obj4, (vzq0) obj, (b0k) obj2, (((Number) obj3).intValue() << 9) & 7168);
                return rih1Var;
            case 9:
                vzq0 vzq0Var2 = (vzq0) obj;
                x340 x340Var20 = (b0k) obj2;
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                float fD2 = vzq0Var2.d();
                uwr uwrVar2 = cbx.a;
                cvx cvxVar = cbx.b(x340Var20).b;
                cvx cvxVar2 = cbx.b(x340Var20).b;
                cvx cvxVar3 = cbx.b(x340Var20).b;
                qim0 qim0VarH = l6o1.H(dug.f(uyn1.A(qim0VarD, 16.0f, fD2 + 16.0f, 16.0f, vzq0Var2.a()), cbx.a(x340Var20).a.c, u5j1Var), l6o1.C(0, 0, 1, x340Var20), false, 14);
                c950 c950Var = (c950) obj5;
                sp00 sp00Var = (sp00) obj6;
                iu30 iu30Var2 = (iu30) obj4;
                gfh0 gfh0VarC = t1c.c(een.h, false);
                x340 x340Var21 = x340Var20;
                int iHashCode2 = Long.hashCode(x340Var21.T);
                xos0 xos0VarM2 = x340Var21.m();
                qim0 qim0VarE2 = zr7.E(x340Var20, qim0VarH);
                hzj.A.getClass();
                x340 x340Var22 = x340Var20;
                if (x340Var22.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var22.m0();
                if (x340Var22.S) {
                    x340Var22.l(n4kVar);
                } else {
                    x340Var22.v0();
                }
                nko1.H(gfh0VarC, x340Var20, y580.O0);
                nko1.H(xos0VarM2, x340Var20, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var20, y580.R0);
                nko1.F(x340Var20);
                nko1.H(qim0VarE2, x340Var20, y580.Y);
                int iC = l1d.C(c950Var.a);
                if (iC == 0) {
                    x340Var22.i0(94062392);
                    boolean zI3 = x340Var22.i(sp00Var) | x340Var22.g(iu30Var2);
                    Object objT6 = x340Var22.T();
                    if (zI3 || objT6 == m4cVar) {
                        objT6 = new x850(sp00Var, iu30Var2, (byte) 0);
                        x340Var22.s0(objT6);
                    }
                    Function0 function2 = (Function0) objT6;
                    boolean zI4 = x340Var22.i(sp00Var) | x340Var22.g(iu30Var2);
                    Object objT7 = x340Var22.T();
                    if (zI4 || objT7 == m4cVar) {
                        objT7 = new x850(sp00Var, iu30Var2, (byte) 1);
                        x340Var22.s0(objT7);
                    }
                    nmn1.c((String) null, (String) null, function2, (Function0) objT7, x340Var20, 0);
                    boolean zI5 = x340Var22.i(sp00Var);
                    Object objT8 = x340Var22.T();
                    if (zI5 || objT8 == m4cVar) {
                        objT8 = new y850(sp00Var, null, b2);
                        x340Var22.s0(objT8);
                    }
                    qxd0.t(rih1Var, x340Var20, (vu30) objT8);
                    x340Var22.r(false);
                } else if (iC == 1) {
                    x340Var22.i0(94585703);
                    boolean zI6 = x340Var22.i(sp00Var) | x340Var22.g(iu30Var2);
                    Object objT9 = x340Var22.T();
                    if (zI6 || objT9 == m4cVar) {
                        objT9 = new x850(sp00Var, iu30Var2, (byte) 2);
                        x340Var22.s0(objT9);
                    }
                    dem1.e((Function0) objT9, x340Var20, 0);
                    boolean zI7 = x340Var22.i(sp00Var);
                    Object objT10 = x340Var22.T();
                    if (zI7 || objT10 == m4cVar) {
                        objT10 = new y850(sp00Var, null, (byte) 1);
                        x340Var22.s0(objT10);
                    }
                    qxd0.t(rih1Var, x340Var20, (vu30) objT10);
                    x340Var22.r(false);
                } else {
                    if (iC != 2) {
                        throw p3d1.k(x340Var22, -689704099, false);
                    }
                    x340Var22.i0(94948000);
                    yto1.e(0, 0, 2, x340Var20, anm1.N("spinnerTestTag", nim0Var));
                    x340Var22.r(false);
                }
                x340Var22.r(true);
                return rih1Var;
            case 10:
                vzq0 vzq0Var3 = (vzq0) obj;
                int iIntValue9 = ((Number) obj3).intValue();
                qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
                jqi0 jqi0Var = (jqi0) obj5;
                x340 x340Var23 = (b0k) obj2;
                iu30 iu30Var3 = (iu30) obj6;
                iu30 iu30Var4 = (iu30) obj4;
                boolean zG2 = x340Var23.g(jqi0Var) | x340Var23.g(iu30Var3) | x340Var23.g(iu30Var4);
                Object objT11 = x340Var23.T();
                if (zG2 || objT11 == fkj0.X) {
                    objT11 = new lb50(jqi0Var, iu30Var3, iu30Var4, (byte) 2);
                    x340Var23.s0(objT11);
                }
                ujo1.d(qim0VarD2, (xtb0) null, vzq0Var3, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT11, x340Var23, (iIntValue9 << 6) & 896, 506);
                return rih1Var;
            case 11:
                x340 x340Var24 = (b0k) obj2;
                ((Number) obj3).intValue();
                w4i1 w4i1Var = (w4i1) obj4;
                c380 c380Var = (c380) obj6;
                String strN1 = (String) obj5;
                if (strN1 != null && strN1.length() != 0) {
                    x340 x340Var25 = x340Var24;
                    x340Var25.i0(1139272529);
                    x340Var25.r(false);
                } else if (c380Var.size() > 1) {
                    x340 x340Var26 = x340Var24;
                    x340Var26.i0(1139274329);
                    x340Var26.r(false);
                    strN1 = iro1.o(c380Var);
                } else if (c380Var.size() == 1) {
                    x340 x340Var27 = x340Var24;
                    x340Var27.i0(957828205);
                    strN1 = cwl1.n0(2131953294, new Object[]{w4i1Var.b}, x340Var27) + ", " + ((w4i1) o7h.q0(c380Var)).b;
                    x340Var27.r(false);
                } else {
                    x340 x340Var28 = x340Var24;
                    x340Var28.i0(1139286937);
                    strN1 = cwl1.n0(2131953294, new Object[]{w4i1Var.b}, x340Var28);
                    x340Var28.r(false);
                }
                String str3 = strN1;
                uwr uwrVar3 = cbx.a;
                uwo1.e(str3, (qim0) null, cbx.d(x340Var24).e, cbx.a(x340Var24).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var24, 0, 0, 2034);
                return rih1Var;
            case 12:
                t660 t660Var = (t660) obj5;
                g2c g2cVar2 = (g2c) obj;
                x340 x340Var29 = (b0k) obj2;
                int iIntValue10 = ((Number) obj3).intValue();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= x340Var29.g(g2cVar2) ? 4 : 2;
                }
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    wfm0 wfm0Var = t660Var.g;
                    uwr uwrVar4 = cbx.a;
                    qim0 qim0VarF = u291.f(dug.f(nim0Var, cbx.a(x340Var30).a.c, u5j1Var), 1.0f);
                    cbx.a.getClass();
                    e9k.k(wfm0Var, g2cVar2.a(hno1.f(qim0VarF, (ecx) uwr.c.getValue()), een.h), x340Var30, 48);
                    qim0 qim0VarA = g2cVar2.a(u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3), een.X);
                    List list = (List) obj6;
                    iu30 iu30Var5 = (iu30) obj4;
                    mbh mbhVarA2 = jbh.a(f36Var, een.P0, x340Var30, 0);
                    int iHashCode3 = Long.hashCode(x340Var30.T);
                    xos0 xos0VarM3 = x340Var30.m();
                    qim0 qim0VarE3 = zr7.E(x340Var30, qim0VarA);
                    hzj.A.getClass();
                    if (x340Var30.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var30.m0();
                    if (x340Var30.S) {
                        x340Var30.l(n4kVar);
                    } else {
                        x340Var30.v0();
                    }
                    nko1.H(mbhVarA2, x340Var30, y580.O0);
                    nko1.H(xos0VarM3, x340Var30, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var30, y580.R0);
                    nko1.F(x340Var30);
                    nko1.H(qim0VarE3, x340Var30, y580.Y);
                    t1c.a(i541.D(dug.e(u291.h(u291.f(nim0Var, 1.0f), 45.0f), v9c.s(p7h.M(new u7h[]{list.get(2), list.get(1)}), 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, (hw61) null, false, 0L, 0L, 1, (f2b) null, 983039), x340Var30, 0);
                    ajo1.i(t660Var, i541.D(dug.f(nim0Var, ((u7h) list.get(1)).a, u5j1Var), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, (hw61) null, false, 0L, 0L, 1, (f2b) null, 983039), iu30Var5, x340Var30, 0);
                    x340Var30.r(true);
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
            case 13:
                x340 x340Var31 = (b0k) obj2;
                ((Number) obj3).intValue();
                float fD3 = (((i2c) obj).d() - 8.0f) * 0.44444448f;
                qim0 qim0VarD3 = u291.d(nim0Var, 1.0f);
                zqz0 zqz0Var = (zqz0) obj6;
                j2i j2iVar2 = (j2i) obj5;
                j2i j2iVar3 = (j2i) obj4;
                jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var31, 0);
                x340 x340Var32 = x340Var31;
                int iHashCode4 = Long.hashCode(x340Var32.T);
                xos0 xos0VarM4 = x340Var32.m();
                qim0 qim0VarE4 = zr7.E(x340Var31, qim0VarD3);
                hzj.A.getClass();
                x340 x340Var33 = x340Var31;
                if (x340Var33.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var33.m0();
                if (x340Var33.S) {
                    x340Var33.l(n4kVar);
                } else {
                    x340Var33.v0();
                }
                nko1.H(jw31VarA, x340Var31, y580.O0);
                nko1.H(xos0VarM4, x340Var31, y580.N0);
                nko1.H(Integer.valueOf(iHashCode4), x340Var31, y580.R0);
                nko1.F(x340Var31);
                nko1.H(qim0VarE4, x340Var31, y580.Y);
                int iC2 = l1d.C(zqz0Var.a);
                if (iC2 == 0) {
                    x340Var33.i0(374919187);
                    j2iVar2.invoke(u291.x(0.0f, fD3, 1, nim0Var), x340Var31, 48);
                    op71.g(x340Var31, u291.v(nim0Var, 8.0f));
                    if (1.0f <= 0.0d) {
                        of80.a("invalid weight; must be greater than zero");
                    }
                    j2iVar3.invoke(new wnb0(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), x340Var31, 48);
                    x340Var33.r(false);
                } else {
                    if (iC2 != 1) {
                        throw p3d1.k(x340Var33, -265002584, false);
                    }
                    x340Var33.i0(375116595);
                    if (1.0f <= 0.0d) {
                        of80.a("invalid weight; must be greater than zero");
                    }
                    j2iVar3.invoke(new wnb0(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), x340Var31, 48);
                    op71.g(x340Var31, u291.v(nim0Var, 8.0f));
                    j2iVar2.invoke(u291.x(0.0f, fD3, 1, nim0Var), x340Var31, 48);
                    x340Var33.r(false);
                }
                x340Var33.r(true);
                return rih1Var;
            case 14:
                tx60 tx60Var = (tx60) obj;
                x340 x340Var34 = (b0k) obj2;
                ((Number) obj3).intValue();
                m4c m4cVar2 = fkj0.X;
                z5o0 z5o0Var = (z5o0) obj5;
                c7r0 c7r0Var = z5o0Var != null ? z5o0Var.b : null;
                x340 x340Var35 = x340Var34;
                boolean zG3 = x340Var35.g(c7r0Var);
                Object objT12 = x340Var35.T();
                if (zG3 || objT12 == m4cVar2) {
                    b8r0 b8r0Var = c7r0Var instanceof b8r0 ? (b8r0) c7r0Var : null;
                    objT12 = b8r0Var != null ? new e3h1((l6h1) b8r0Var.f(l6h1.class), (n7h1) b8r0Var.f(n7h1.class), (i8h1) b8r0Var.f(i8h1.class)) : bco0.a;
                    x340Var35.s0(objT12);
                }
                auw auwVar = (auw) objT12;
                boolean zI8 = x340Var35.i(auwVar);
                Object objT13 = x340Var35.T();
                if (zI8 || objT13 == m4cVar2) {
                    objT13 = new zi50(auwVar, (byte) 19);
                    x340Var35.s0(objT13);
                }
                dgo1.c(auwVar, (iu30) objT13, apo.r(1719849150, new ix60(tx60Var, (fx60) obj6, (lmw) obj4), x340Var35), x340Var35, 384);
                return rih1Var;
            case 15:
                i2c i2cVar3 = (i2c) obj;
                x340 x340Var36 = (b0k) obj2;
                ((Number) obj3).intValue();
                float fD4 = i2cVar3.d();
                r070 r070Var = (r070) obj5;
                f070 f070Var = r070Var.a;
                qim0 qim0VarR = p3v.b(fD4 / f070Var.c, i2cVar3.c()) > 0 ? d7e.r(f070Var.c, u291.c(nim0Var, 1.0f), true) : d7e.r(f070Var.c, u291.f(nim0Var, 1.0f), false);
                res resVar = (res) obj4;
                kw7.c(r070Var.a, (iu30) obj6, (yqg) resVar.f, (bju) resVar.h, qim0VarR, x340Var36, 0);
                if (r070Var.c) {
                    x340 x340Var37 = x340Var36;
                    x340Var37.i0(955977410);
                    x340Var37.r(false);
                } else {
                    x340 x340Var38 = x340Var36;
                    x340Var38.i0(955894764);
                    t1c.a(cwl1.l0(qim0VarR, u7h.f, (hw61) null, 14), x340Var38, 0);
                    x340Var38.r(false);
                }
                return rih1Var;
            case 16:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                ((wq80) obj5).g(obj6, apo.r(-1540652060, new zlu((xu30) obj4, (aqb0) obj, (byte) 1), b0kVar), b0kVar, 48);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return a(obj, obj2, obj3);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return d(obj, obj2, obj3);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return e(obj, obj2, obj3);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return f(obj, obj2, obj3);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return g(obj, obj2, obj3);
            case 22:
                return h(obj, obj2, obj3);
            case 23:
                return i(obj, obj2, obj3);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return j(obj, obj2, obj3);
            case 25:
                return k(obj, obj2, obj3);
            case 26:
                ((Number) obj3).intValue();
                l0e0 l0e0Var = ((q0e0) obj5).a;
                float f3 = e0e0.a;
                g3p1.c(l0e0Var, ((Number) ((tob1) obj6).getValue()).floatValue(), ((Number) ((tob1) obj4).getValue()).floatValue(), (qim0) null, (b0k) obj2, 0);
                return rih1Var;
            case 27:
                return m(obj, obj2, obj3);
            case 28:
                return n(obj, obj2, obj3);
            default:
                i2c i2cVar4 = (i2c) obj;
                x340 x340Var39 = (b0k) obj2;
                int iIntValue11 = ((Number) obj3).intValue();
                long j = i2cVar4.b;
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= x340Var39.g(i2cVar4) ? 4 : 2;
                }
                x340 x340Var40 = x340Var39;
                if (x340Var40.Y(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    float fI = hjl.i(j);
                    float fH = hjl.h(j);
                    float f4 = 0.33783785f * fI;
                    float fN0 = ((wat) obj5).N0(f4);
                    gw70 gw70Var = (gw70) obj4;
                    for (v5t0 v5t0Var : (c380) obj6) {
                        float f5 = v5t0Var.g;
                        String str4 = v5t0Var.b;
                        int iMax = (int) (Math.max(f5, f2) * f4);
                        boolean zG4 = x340Var40.g(gw70Var) | x340Var40.g(str4) | x340Var40.e(iMax);
                        Object objT14 = x340Var40.T();
                        if (zG4 || objT14 == fkj0.X) {
                            ixg ixgVarB = gw70Var.b(Uri.parse(str4));
                            ixgVarB.g = false;
                            ixgVarB.p(iMax, iMax, 1);
                            objT14 = new mmr0(ixgVarB.a(), ixgVarB.a);
                            x340Var40.s0(objT14);
                        }
                        mmr0 mmr0Var2 = (mmr0) objT14;
                        zy70 zy70Var = (zy70) mmr0Var2.a;
                        rf01 rf01Var = (rf01) mmr0Var2.b;
                        String str5 = v5t0Var.c;
                        h6m h6mVar = mif1.Q0;
                        qim0 qim0VarR2 = u291.r(nim0Var, fN0);
                        float f6 = v5t0Var.d * fI;
                        float f7 = v5t0Var.e * fH;
                        float f8 = v5t0Var.g;
                        dm5.d(zy70Var, str5, rf01Var, i541.D(qim0VarR2, f8, f8, 0.0f, f6, f7, 0.0f, v5t0Var.f, 0L, (hw61) null, false, 0L, 0L, 0, (f2b) null, 1048292), h6mVar, x340Var40, 12582912, 0, 3952);
                        f2 = 1.0f;
                    }
                } else {
                    x340Var40.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cy00(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        super(3);
        this.a = b;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cy00(Object obj, Object obj2, Object obj3, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy00(cvx cvxVar, zqz0 zqz0Var, j2i j2iVar, j2i j2iVar2) {
        super(3);
        this.a = (byte) 13;
        this.c = zqz0Var;
        this.b = j2iVar;
        this.d = j2iVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy00(fs40 fs40Var, ven0 ven0Var, Function0 function0) {
        super(3);
        this.a = (byte) 7;
        this.b = fs40Var;
        this.d = ven0Var;
        this.c = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy00(jx90 jx90Var, iu30 iu30Var, d6o0 d6o0Var) {
        super(3);
        this.a = (byte) 18;
        this.b = jx90Var;
        this.c = iu30Var;
        this.d = d6o0Var;
    }
}
