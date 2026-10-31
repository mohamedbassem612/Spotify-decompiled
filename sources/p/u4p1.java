package p;

import android.graphics.RectF;
import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.Layout;
import androidx.compose.ui.graphics.ColorFilter;
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
import androidx.compose.ui.unit.TextUnit;
import j$.time.Clock;
import j$.time.LocalDate;
import j$.time.YearMonth;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class u4p1 {
    public static b180 a;
    public static b180 b;

    public static final void A(String str, rrt0 rrt0Var, n6u n6uVar, uu11 uu11Var, b0k b0kVar, int i) {
        boolean z;
        Object objT;
        rrt0 rrt0Var2 = rrt0Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1782970135);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.e(rrt0Var2.ordinal()) ? 32 : 16) | (x340Var.g(n6uVar) ? 256 : 128) | (x340Var.g(uu11Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).g;
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(4.0f, true, new um5(false));
            boolean z2 = !u890.j(n6uVar, j6u.a);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarH = pqo.h(nim0Var, z2);
            jw31 jw31VarA = ew31.a(d36Var, een.Z, x340Var, 0);
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
            int i3 = i2 & 14;
            boolean z3 = i3 == 4;
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new q4z0(str, (byte) 22);
                x340Var.s0(objT2);
            }
            qim0 qim0VarB = s161.b(nim0Var, false, (iu30) objT2);
            cjc0 cjc0Var = new cjc0(uu11Var.a ? 1 : 2);
            rrt0 rrt0Var3 = rrt0.b;
            if (rrt0Var2 == rrt0Var3) {
                x340Var.i0(1721953335);
                uwo1.e(str, qim0VarB, lee1Var, cbx.a(x340Var).b.a, null, null, 2, false, cjc0Var, 0, null, x340Var, i3, 0, 1712);
                x340Var.r(false);
                rrt0Var2 = rrt0Var;
                z = true;
            } else {
                x340Var.i0(1722189586);
                boolean z4 = ((i2 & 112) == 32) | (i3 == 4);
                Object objT3 = x340Var.T();
                if (z4 || objT3 == m4cVar) {
                    ye5 ye5Var = new ye5();
                    z6p1.r(ye5Var, "PlayIndicator", "�");
                    ye5Var.g(str);
                    objT3 = ye5Var.p();
                    x340Var.s0(objT3);
                }
                af5 af5Var = (af5) objT3;
                long j = cbx.a(x340Var).c.c;
                int i4 = i2 >> 3;
                zma1 zma1Var = lee1Var.a;
                boolean zF = ((((i4 & 14) ^ 6) > 4 && x340Var.e(rrt0Var.ordinal())) || (i4 & 6) == 4) | x340Var.f(zma1Var.b);
                Object objT4 = x340Var.T();
                if (zF || objT4 == m4cVar) {
                    rrt0Var2 = rrt0Var;
                    if (rrt0Var2 == rrt0Var3) {
                        objT = dqs0.e;
                        z = true;
                    } else {
                        long j2 = zma1Var.b;
                        fc11.o(j2);
                        z = true;
                        objT = mqo1.t(new mmr0("PlayIndicator", new gh80(new d6t0(1, fc11.Y(TextUnit.c(j2) * 1.2f, j2 & 1095216660480L), zma1Var.b), new j2i(1377960441, new sbc0(rrt0Var2, (byte) 1), true))));
                    }
                    x340Var.s0(objT);
                } else {
                    objT = objT4;
                    z = true;
                    rrt0Var2 = rrt0Var;
                }
                uwo1.d(af5Var, j, qim0VarB, lee1Var, null, null, 2, false, cjc0Var, 0, null, (cqs0) objT, x340Var, 0, 0, 1712);
                x340Var = x340Var;
                x340Var.r(false);
            }
            x340Var.r(z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pby0(i, str, rrt0Var2, n6uVar, uu11Var, (byte) 13);
        }
    }

    public static final void B(String str, djc0 djc0Var, String str2, n4m n4mVar, bv11 bv11Var, dt11 dt11Var, boolean z, boolean z2, boolean z3, c380 c380Var, boolean z4, boolean z5, boolean z6, boolean z7, iix0 iix0Var, j2i j2iVar, boolean z8, b0k b0kVar, int i) {
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1726062404);
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.i(djc0Var) ? 32 : 16) | (x340Var2.g(str2) ? 256 : 128) | (x340Var2.e(n4mVar.ordinal()) ? 2048 : 1024) | (x340Var2.g(bv11Var) ? 16384 : 8192) | (x340Var2.g(dt11Var) ? 131072 : 65536) | (x340Var2.h(z) ? 1048576 : 524288) | (x340Var2.h(z2) ? 8388608 : 4194304) | (x340Var2.h(z3) ? 67108864 : 33554432) | (x340Var2.g(c380Var) ? 536870912 : 268435456);
        if (x340Var2.Y(i2 & 1, ((i2 & 306783379) == 306783378 && (599187 & (((((((x340Var2.h(z4) ? (char) 4 : (char) 2) | (x340Var2.h(z5) ? ' ' : (char) 16)) | (x340Var2.h(z6) ? (char) 256 : (char) 128)) | (x340Var2.h(z7) ? (char) 2048 : (char) 1024)) | (x340Var2.i(iix0Var) ? (char) 16384 : (char) 8192)) | (x340Var2.i(j2iVar) ? (char) 0 : (char) 0)) | (x340Var2.h(z8) ? (char) 0 : (char) 0))) == 599186) ? false : true)) {
            a36 a36Var = h36.d;
            nim0 nim0Var = nim0.a;
            if (z2) {
                x340Var2.i0(-1775925029);
                qim0 qim0VarH = pqo.h(nim0Var, z4);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                k5p1.d(qim0VarH, new d36(4.0f, true, new um5(false)), a36Var, null, 0, 0, apo.r(926401084, new qv11(z3, n4mVar, bv11Var, dt11Var, z6, z8, c380Var, z7, iix0Var, j2iVar), x340Var2), x340Var2, 1572864, 56);
                x340Var = x340Var2;
                x340Var.r(false);
            } else {
                x340Var = x340Var2;
                if (z) {
                    x340Var.i0(-1775126438);
                    qim0 qim0VarH2 = pqo.h(nim0Var, z4);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    k5p1.d(qim0VarH2, new d36(4.0f, true, new um5(false)), a36Var, null, 0, 0, apo.r(-1624048589, new qv11(str2, z5, z3, n4mVar, bv11Var, dt11Var, z6, z8, str, djc0Var), x340Var), x340Var, 1572864, 56);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1773854074);
                    x340Var.r(false);
                }
            }
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kz80(str, djc0Var, str2, n4mVar, bv11Var, dt11Var, z, z2, z3, c380Var, z4, z5, z6, z7, iix0Var, j2iVar, z8, i);
        }
    }

    public static final void C(long j, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-737853914);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.f(j) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            uwr uwrVar = cbx.a;
            uwo1.e("•", null, cbx.d(x340Var).j, j, null, null, 0, false, null, 0, null, x340Var, ((i2 << 9) & 7168) | 6, 0, 2034);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yu9(j, i);
        }
    }

    public static final void D(int i, String str, String str2, b0k b0kVar, qim0 qim0Var, boolean z) {
        qim0 qim0Var2;
        float f;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1858176194);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarH = l6o1.H(u291.d(qim0Var3, 1.0f), l6o1.C(0, 0, 1, x340Var), false, 14);
            uwr uwrVar = cbx.a;
            qim0 qim0VarA = uyn1.A(qim0VarH, cbx.b(x340Var).b.b, 80.0f, cbx.b(x340Var).b.b, cbx.b(x340Var).b.a);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 48);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (z) {
                x340Var.i0(1142985766);
                n871.a(null, x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(1143024206);
                x340Var.r(false);
            }
            lee1 lee1Var = cbx.d(x340Var).e;
            long j = cbx.a(x340Var).b.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            if (z) {
                x340Var.i0(-517308710);
                f = cbx.b(x340Var).b.a;
                x340Var.r(false);
            } else {
                x340Var.i0(-517308266);
                x340Var.r(false);
                f = 0.0f;
            }
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, f, 0.0f, 0.0f, 13);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = qi71.c1;
                x340Var.s0(objT);
            }
            uwo1.e(str, s161.b(qim0VarB, false, (iu30) objT), lee1Var, j, new a0e1(3), null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2016);
            lee1 lee1Var2 = cbx.d(x340Var).j;
            long j2 = cbx.a(x340Var).b.b;
            qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(str2, uyn1.B(qim0VarF2, 0.0f, 12.0f, 0.0f, 0.0f, 13), lee1Var2, j2, new a0e1(3), null, 0, false, null, 0, null, x340Var, (i2 >> 3) & 14, 0, 2016);
            x340Var = x340Var;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zff(str, str2, z, qim0Var2, i);
        }
    }

    public static final void E(dw71 dw71Var, ew71 ew71Var, b0k b0kVar, int i, int i2) {
        int i3;
        int i4;
        String strK;
        String str = dw71Var.b;
        boolean z = dw71Var.a;
        int i5 = dw71Var.c;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(737997663);
        int i6 = (x340Var.g(dw71Var) ? 4 : 2) | i;
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 = i6 | 48;
        } else {
            i3 = i6 | (x340Var.e(ew71Var == null ? -1 : ew71Var.ordinal()) ? 32 : 16);
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            if (i7 != 0) {
                ew71Var = null;
            }
            if (ew71Var != null) {
                i4 = 2131962382;
            } else {
                i4 = i5 == 2 ? 2131962362 : 2131962364;
            }
            String strO0 = cwl1.o0(x340Var, i4);
            if (ew71Var != null) {
                x340Var.i0(-248714037);
                if (z) {
                    x340Var.i0(652650582);
                    strK = cwl1.o0(x340Var, ew71Var.d);
                    x340Var.r(false);
                } else if (ihc1.y0(str)) {
                    x340Var.i0(652857073);
                    strK = cwl1.o0(x340Var, ew71Var.c);
                    x340Var.r(false);
                } else {
                    x340Var.i0(652764445);
                    strK = cwl1.n0(ew71Var.b, new Object[]{str}, x340Var);
                    x340Var.r(false);
                }
                x340Var.r(false);
            } else {
                x340Var.i0(-248622122);
                if (z && i5 == 3) {
                    strK = x0d.k(x340Var, 1149906548, 2131962363, x340Var, false);
                } else if (z) {
                    strK = x0d.k(x340Var, 1149909673, 2131962361, x340Var, false);
                } else {
                    x340Var.i0(1149912346);
                    if (ihc1.y0(str)) {
                        strK = x0d.k(x340Var, 1287691393, 2131962360, x340Var, false);
                    } else {
                        x340Var.i0(1287584846);
                        strK = cwl1.n0(2131962359, new Object[]{str}, x340Var);
                        x340Var.r(false);
                    }
                    x340Var.r(false);
                }
                x340Var.r(false);
            }
            D(0, strO0, strK, x340Var, null, ew71Var == null);
        } else {
            x340Var.b0();
        }
        ew71 ew71Var2 = ew71Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g8(dw71Var, ew71Var2, i, i2, (byte) 16);
        }
    }

    public static final void F(xx71 xx71Var, ze71 ze71Var, lte lteVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        List list;
        Object obj;
        Integer num;
        boolean z;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1870218945);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(xx71Var) : b0kVar3.i(xx71Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(ze71Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(lteVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 2048 : 1024;
        }
        boolean z2 = true;
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            List list2 = xx71Var.d;
            boolean zG = b0kVar3.g(list2);
            Object objT = b0kVar3.T();
            if (zG || objT == m4cVar) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    List list3 = list2;
                    long j = ((wx71) next).f;
                    Calendar calendarD = lteVar.a.d();
                    calendarD.setTimeInMillis(j * 1000);
                    TimeZone timeZone = TimeZone.getTimeZone(calendarD.getTimeZone().getID());
                    Iterator it2 = it;
                    long timeInMillis = calendarD.getTimeInMillis();
                    Locale locale = lteVar.c;
                    android.icu.util.Calendar calendar = android.icu.util.Calendar.getInstance(timeZone, locale);
                    calendar.setTimeInMillis(timeInMillis);
                    String str = DateFormat.getInstanceForSkeleton("yMMMM", locale).format(calendar.getTime());
                    Object objH = linkedHashMap.get(str);
                    if (objH == null) {
                        objH = cfm0.h(str, linkedHashMap);
                    }
                    ((List) objH).add(next);
                    list2 = list3;
                    it = it2;
                }
                list = list2;
                b0kVar3.s0(linkedHashMap);
                obj = linkedHashMap;
            } else {
                list = list2;
                obj = objT;
            }
            Map map = (Map) obj;
            b0kVar3.f0(-1984066184, Long.valueOf(xx71Var.m));
            xtb0 xtb0VarA = aub0.a(0, b0kVar3, 3);
            b0kVar3.r(false);
            ven0 ven0VarS = v8r.s(Boolean.valueOf(xx71Var.h), b0kVar3);
            ven0 ven0VarS2 = v8r.s(xx71Var.i, b0kVar3);
            ven0 ven0VarS3 = v8r.s(iu30Var, b0kVar3);
            Integer numValueOf = Integer.valueOf(list.size());
            boolean zG2 = b0kVar3.g(xtb0VarA) | b0kVar3.g(ven0VarS) | b0kVar3.g(ven0VarS2) | ((i2 & 7168) == 2048);
            Object objT2 = b0kVar3.T();
            if (zG2 || objT2 == m4cVar) {
                num = numValueOf;
                z = false;
                p651 p651Var = new p651(xtb0VarA, ven0VarS, ven0VarS2, iu30Var, (lnm) null, (byte) 15);
                b0kVar3.s0(p651Var);
                objT2 = p651Var;
            } else {
                num = numValueOf;
                z = false;
            }
            qxd0.s(xtb0VarA, num, (vu30) objT2, b0kVar3);
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            boolean zI = b0kVar3.i(map);
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !b0kVar3.i(xx71Var))) {
                z2 = z;
            }
            boolean zG3 = zI | z2 | b0kVar3.g(ven0VarS3) | b0kVar3.i(ze71Var);
            Object objT3 = b0kVar3.T();
            if (zG3 || objT3 == m4cVar) {
                e971 e971Var = new e971(map, xx71Var, ven0VarS3, ze71Var, (byte) 3);
                b0kVar3.s0(e971Var);
                objT3 = e971Var;
            }
            b0kVar2 = b0kVar3;
            ujo1.d(qim0VarD, xtb0VarA, null, false, null, null, null, false, null, (iu30) objT3, b0kVar2, 6, 508);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new nk31(i, xx71Var, ze71Var, lteVar, iu30Var, (byte) 14);
        }
    }

    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean, int] */
    public static final void G(xx71 xx71Var, ze71 ze71Var, lte lteVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        iu30 iu30Var2;
        boolean z;
        int i3;
        int i4;
        ?? r1;
        boolean z2;
        boolean z3;
        boolean z4 = xx71Var.g;
        ew71 ew71Var = xx71Var.f;
        ew71 ew71Var2 = xx71Var.j;
        boolean z5 = xx71Var.e;
        dw71 dw71Var = xx71Var.c;
        int i5 = dw71Var.c;
        List list = xx71Var.d;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1737547633);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(xx71Var) : b0kVar3.i(xx71Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(ze71Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(lteVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 2048 : 1024;
        }
        int i6 = i2 | 24576;
        if (b0kVar3.Y(i6 & 1, (i6 & 9363) != 9362)) {
            qim0Var2 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var2, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarD, cbx.a(b0kVar3).a.c, d4o1.a);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarF);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            if (i5 != 2 || (!z5 && !z4 && ew71Var2 == null && list.isEmpty())) {
                iu30Var2 = iu30Var;
                b0kVar2 = b0kVar3;
                z = z4;
                i3 = i6;
                i4 = 2;
                r1 = 0;
                b0kVar2.i0(-990986467);
                b0kVar2.r(false);
            } else {
                b0kVar3.i0(-991369906);
                List list2 = list;
                b0kVar2 = b0kVar3;
                z = z4;
                i3 = i6;
                i4 = 2;
                iu30Var2 = iu30Var;
                h(xx71Var.j, xx71Var.f, !list2.isEmpty(), xx71Var.e, xx71Var.o, iu30Var2, b0kVar2, (i6 << 6) & 458752);
                I(xx71Var.k, i5 == 2 && ((z5 && ew71Var == null) || z || !list2.isEmpty()), iu30Var2, b0kVar2, (i3 >> 3) & 896);
                r1 = 0;
                b0kVar2.r(false);
            }
            if (i5 == 3) {
                b0kVar2.i0(-1694533384);
                E(dw71Var, null, b0kVar2, r1, i4);
                b0kVar2.r((boolean) r1);
                z2 = true;
            } else {
                if (i5 == 1 || (z5 && ew71Var == null && (ew71Var2 != null || list.isEmpty()))) {
                    b0kVar2.i0(-1694530368);
                    ouo1.g(null, b0kVar2, 0);
                    b0kVar2.r(false);
                } else if (z && list.isEmpty()) {
                    b0kVar2.i0(-1694527517);
                    boolean z6 = (i3 & 7168) == 2048;
                    Object objT = b0kVar2.T();
                    if (z6 || objT == fkj0.X) {
                        objT = new m861(iu30Var2, (byte) 26);
                        b0kVar2.s0(objT);
                    }
                    g((Function0) objT, b0kVar2, 0);
                    b0kVar2.r(false);
                } else if (z5 && ew71Var != null && list.isEmpty()) {
                    b0kVar2.i0(-1694522469);
                    E(dw71Var, ew71Var, b0kVar2, 0, 0);
                    b0kVar2.r(false);
                } else if (!z5 && list.isEmpty() && ew71Var2 == null) {
                    b0kVar2.i0(-1694516744);
                    E(dw71Var, null, b0kVar2, 0, i4);
                    b0kVar2.r(false);
                } else {
                    b0kVar2.i0(-990334847);
                    if (z5 || !list.isEmpty() || ew71Var2 == null) {
                        z3 = false;
                        b0kVar2.i0(-990140012);
                        Parcelable.Creator creator = w4i1.CREATOR;
                        F(xx71Var, ze71Var, lteVar, iu30Var2, b0kVar2, i3 & 8190);
                        b0kVar2.r(false);
                    } else {
                        b0kVar2.i0(-990254061);
                        z3 = false;
                        E(dw71Var, ew71Var2, b0kVar2, 0, 0);
                        b0kVar2.r(false);
                    }
                    b0kVar2.r(z3);
                }
                z2 = true;
            }
            b0kVar2.r(z2);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ay71((byte) 0, i, (Object) xx71Var, (Object) ze71Var, (Object) lteVar, (Object) iu30Var, (Object) qim0Var2);
        }
    }

    public static final void H(mw71 mw71Var, iu30 iu30Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        Function0 function1;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(376383703);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.e(mw71Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function1 = function0;
            i2 |= b0kVar3.i(function1) ? 256 : 128;
        } else {
            function1 = function0;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            b0kVar2 = b0kVar3;
            x74.f(function1, (scx) null, (mfx) null, false, false, 0.0f, false, (Boolean) null, false, false, (vu30) null, apo.r(-1534000682, new rt11(iu30Var, mw71Var, (byte) 21), b0kVar3), b0kVar2, ((i2 >> 6) & 14) | 24576, 48, 2030);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kk31(mw71Var, iu30Var, function0, i, (byte) 24);
        }
    }

    public static final void I(mw71 mw71Var, boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var;
        qim0 qim0VarA;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-534391683);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.e(mw71Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarF, 16.0f, 6.0f);
            fra fraVar = een.Z;
            gex0 gex0Var = h36.a;
            jw31 jw31VarA = ew31.a(gex0Var, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            if (z) {
                x340Var.i0(-1730678200);
                boolean zG = x340Var.g(ven0Var);
                Object objT2 = x340Var.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new g8y0(ven0Var, (byte) 22);
                    x340Var.s0(objT2);
                }
                qim0 qim0VarX = bin.x(qim0Var2, false, null, null, null, (Function0) objT2, 15);
                qim0Var = qim0Var2;
                x340Var.r(false);
                qim0VarA = qim0VarX;
            } else {
                qim0Var = qim0Var2;
                x340Var.i0(-1730607799);
                qim0 qim0VarK = d9y0.k(qim0Var, 0.0f);
                Object objT3 = x340Var.T();
                if (objT3 == m4cVar) {
                    objT3 = qi71.d1;
                    x340Var.s0(objT3);
                }
                qim0VarA = s161.a(qim0VarK, (iu30) objT3);
                x340Var.r(false);
            }
            jw31 jw31VarA2 = ew31.a(gex0Var, een.N0, x340Var, 48);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarA);
            x340Var.m0();
            int i3 = i2;
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            rsx rsxVar = rsx.c;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(rsxVar, isl.a, u291.r(qim0Var, 16.0f), cbx.a(x340Var).b.a, 0L, false, x340Var, rsx.d | 48, 48);
            String strO0 = cwl1.o0(x340Var, mw71Var.a);
            lee1 lee1Var = cbx.d(x340Var).k;
            long j = cbx.a(x340Var).b.a;
            cvx cvxVar3 = cbx.b(x340Var).b;
            uwo1.e(strO0, uyn1.B(qim0Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), lee1Var, j, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            x340Var = x340Var;
            x340Var.r(true);
            x340Var.r(true);
            if (z && ((Boolean) ven0Var.getValue()).booleanValue()) {
                x340Var.i0(1382285362);
                boolean zG2 = x340Var.g(ven0Var) | ((i3 & 896) == 256);
                Object objT4 = x340Var.T();
                if (zG2 || objT4 == m4cVar) {
                    objT4 = new i5r0(iu30Var, ven0Var, (byte) 6);
                    x340Var.s0(objT4);
                }
                iu30 iu30Var2 = (iu30) objT4;
                boolean zG3 = x340Var.g(ven0Var);
                Object objT5 = x340Var.T();
                if (zG3 || objT5 == m4cVar) {
                    objT5 = new g8y0(ven0Var, (byte) 23);
                    x340Var.s0(objT5);
                }
                H(mw71Var, iu30Var2, (Function0) objT5, x340Var, i3 & 14);
                x340Var.r(false);
            } else {
                x340Var.i0(1382518885);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e30(mw71Var, z, iu30Var, i, (byte) 29);
        }
    }

    public static final void J(rrt0 rrt0Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1365450853);
        int i2 = (x340Var.e(rrt0Var.ordinal()) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            bjg1 bjg1VarY = bno1.y(rrt0Var, "playState transition", x340Var, (i2 & 14) | 48, 0);
            bby bbyVarA = xay.e(3, (ni20) null).a(xay.b((pxg1) null, (era) null, (iu30) null, 15));
            ln00 ln00VarA = xay.f(3, (ni20) null).a(xay.i((ni20) null, (era) null, (iu30) null, 15));
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = ou11.Q0;
                x340Var.s0(objT);
            }
            qim0Var2 = qim0Var;
            fq7.e(bjg1VarY, (iu30) objT, qim0Var2, bbyVarA, ln00VarA, apo.r(-729268636, new f2z0(bjg1VarY, (byte) 29), x340Var), x340Var, ((i2 << 3) & 896) | 196656);
        } else {
            qim0Var2 = qim0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tc11(rrt0Var, qim0Var2, i, (byte) 13);
        }
    }

    public static final void K(rrt0 rrt0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-530365799);
        int i2 = (x340Var.e(rrt0Var.ordinal()) ? 4 : 2) | i;
        if (!x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            x340Var.b0();
        } else if (rrt0Var != rrt0.b) {
            x340Var.i0(1057260635);
            zkt0 zkt0Var = rrt0Var == rrt0.a ? zkt0.a : zkt0.b;
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            wkt0.a(zkt0Var, u291.r(nim0.a, 16.0f), (ksl) null, 0L, false, x340Var, 0, 28);
            x340Var.r(false);
        } else {
            x340Var.i0(1057489353);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ps11(rrt0Var, i, (byte) 5);
        }
    }

    public static final void L(yup0 yup0Var, Function0 function0, vu30 vu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1721692293);
        int i2 = i | (x340Var.i(yup0Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(vu30Var) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            WeakHashMap weakHashMap = osl1.x;
            bgc0 bgc0Var = new bgc0(lhc.g(x340Var).g, 32);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(too1.y(qim0Var3, bgc0Var), 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            M((i2 >> 3) & 14, function0, x340Var, null);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            cvx cvxVar = cbx.b(x340Var).b;
            hr80.d(uyn1.z(0.0f, 8.0f, 1, qim0Var3), 1.0f, jA, x340Var, 0, 0);
            otw.c(yup0Var, new ewj1(vu30Var), u291.f(qim0Var3, 1.0f), (ipb1) null, x340Var, 8 | (i2 & 14), 8);
            cvx cvxVar2 = cbx.b(x340Var).b;
            x0d.s(qim0Var3, 16.0f, x340Var, true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l3j1(i, yup0Var, function0, vu30Var, qim0Var2, (byte) 2);
        }
    }

    public static final void M(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        int i2;
        qim0 qim0Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(817214779);
        if ((i & 6) == 0) {
            i2 = i | (b0kVar2.i(function0) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (b0kVar2.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            qim0 qim0VarX = uyn1.x(qim0VarF, 16.0f);
            fra fraVar = een.N0;
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), fraVar, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarX);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(jw31VarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            olx olxVar = olx.c;
            jsl jslVar = new jsl(cwl1.o0(b0kVar2, 2131963777));
            zov0 zov0Var = cbx.b(b0kVar2).g;
            qim0 qim0VarR = u291.r(qim0Var3, 24.0f);
            boolean z = (i3 & 14) == 4;
            Object objT = b0kVar2.T();
            if (z || objT == fkj0.X) {
                objT = new tpj1(function0, (byte) 3);
                b0kVar2.s0(objT);
            }
            w0h1.a(olxVar, jslVar, bin.x(qim0VarR, false, null, null, null, (Function0) objT, 15), 0L, 0L, false, b0kVar2, olx.d, 56);
            String strO0 = cwl1.o0(b0kVar2, 2131963782);
            lee1 lee1Var = cbx.d(b0kVar2).g;
            long j = cbx.a(b0kVar2).b.a;
            b0kVar2 = b0kVar2;
            qim0Var2 = qim0Var3;
            uwo1.e(strO0, new wnb0(1.0f, true), lee1Var, j, new a0e1(3), null, 0, false, null, 0, null, b0kVar2, 0, 0, 2016);
            zov0 zov0Var2 = cbx.b(b0kVar2).g;
            ywx0.n(qim0Var2, 24.0f, b0kVar2, true);
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new tx1(function0, qim0Var2, i, (byte) 23);
        }
    }

    public static final void N(o0g1 o0g1Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        vu30 vu30Var = y580.Y;
        llj lljVar = y580.R0;
        llj lljVar2 = y580.N0;
        llj lljVar3 = y580.O0;
        int i2 = o0g1Var.b;
        gra graVar = een.h;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1771268927);
        j06 j06Var = x340Var.a;
        int i3 = i | (x340Var.i(o0g1Var) ? 4 : 2) | 48;
        boolean z = false;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(u291.b(0.0f, 48.0f, 1, qim0Var3), 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            qim0 qim0Var4 = qim0Var3;
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            Function0 function0 = hmb0.t1;
            if (z2) {
                x340Var.l(function0);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar3);
            nko1.H(xos0VarM, x340Var, lljVar2);
            nko1.H(Integer.valueOf(iHashCode), x340Var, lljVar);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, vu30Var);
            x340Var.i0(1116029113);
            ArrayList arrayList = (ArrayList) o0g1Var.e;
            int i4 = i2;
            while (i4 < 8) {
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                wnb0 wnb0Var = new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                gfh0 gfh0VarC = t1c.c(graVar, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, wnb0Var);
                hzj.A.getClass();
                x340Var.m0();
                int i5 = i4;
                if (x340Var.S) {
                    x340Var.l(function0);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, lljVar3);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                nko1.H(Integer.valueOf(iHashCode2), x340Var, lljVar);
                nko1.F(x340Var);
                nko1.H(qim0VarE2, x340Var, vu30Var);
                String str = (String) ((mmr0) arrayList.get(i5 - 1)).b;
                uwr uwrVar = cbx.a;
                x340 x340Var2 = x340Var;
                uwo1.e(str, null, null, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2038);
                x340Var = x340Var2;
                x340Var.r(true);
                i4 = i5 + 1;
                arrayList = arrayList;
                function0 = function0;
                z = false;
                qim0Var4 = qim0Var4;
                vu30Var = vu30Var;
            }
            qim0 qim0Var5 = qim0Var4;
            vu30 vu30Var2 = vu30Var;
            Function0 function1 = function0;
            ArrayList arrayList2 = arrayList;
            boolean z3 = z;
            x340Var.r(z3);
            x340Var.i0(1116038174);
            int i6 = 1;
            while (i6 < i2) {
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                wnb0 wnb0Var2 = new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                gfh0 gfh0VarC2 = t1c.c(graVar, z3);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, wnb0Var2);
                hzj.A.getClass();
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(function1);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar3);
                nko1.H(xos0VarM3, x340Var, lljVar2);
                nko1.H(Integer.valueOf(iHashCode3), x340Var, lljVar);
                nko1.F(x340Var);
                nko1.H(qim0VarE3, x340Var, vu30Var2);
                ArrayList arrayList3 = arrayList2;
                String str2 = (String) ((mmr0) arrayList3.get(i6 - 1)).b;
                uwr uwrVar2 = cbx.a;
                x340 x340Var3 = x340Var;
                uwo1.e(str2, null, null, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var3, 0, 0, 2038);
                x340Var = x340Var3;
                x340Var.r(true);
                i6++;
                arrayList2 = arrayList3;
            }
            x340Var.r(z3);
            x340Var.r(true);
            qim0Var2 = qim0Var5;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g1o(o0g1Var, qim0Var2, i, (byte) 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX WARN: Code duplicated, block: B:12:0x001e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    public static final ecx P(int i, u37 u37Var, b0k b0kVar) {
        boolean z;
        ecx ecxVarA;
        if (((i & 14) ^ 6) > 4) {
            if (((x340) b0kVar).e(u37Var == null ? -1 : u37Var.ordinal())) {
                z = true;
            } else if ((i & 6) == 4) {
                z = true;
            } else {
                z = false;
            }
        } else if ((i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        if (z || objT == fkj0.X) {
            if (u37Var == u37.a) {
                cbx.a.getClass();
                ecxVarA = uwr.d();
            } else {
                cbx.a.getClass();
                ecxVarA = uwr.a();
            }
            objT = ecxVarA;
            x340Var.s0(objT);
        }
        return (ecx) objT;
    }

    public static final long Q(float f, long j, long j2) {
        return z4p1.h(((u7h.g(j2) - u7h.g(j)) * f) + u7h.g(j), ((u7h.f(j2) - u7h.f(j)) * f) + u7h.f(j), ((u7h.d(j2) - u7h.d(j)) * f) + u7h.d(j), ((u7h.c(j2) - u7h.c(j)) * f) + u7h.c(j), 16);
    }

    public static nrk0 R(Integer num, r6h1 r6h1Var) {
        return new nrk0(num, r6h1Var);
    }

    public static final void S(vr20 vr20Var) {
        if (vr20Var instanceof fhe1) {
            throw ((fhe1) vr20Var).a;
        }
    }

    public static final float T(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    public static final int[] U(w9e1 w9e1Var, Layout layout, ur00 ur00Var, RectF rectF, int i, w9 w9Var) {
        qpj1 qd50Var;
        int i2;
        if (i == 1) {
            qd50Var = new qpj1(w9e1Var.f.getText(), w9e1Var.l(), (byte) 20);
        } else {
            CharSequence text = w9e1Var.f.getText();
            qd50Var = Build.VERSION.SDK_INT >= 29 ? new qd50(text, w9e1Var.a) : new rd50(text);
        }
        qpj1 qpj1Var = qd50Var;
        int lineForVertical = layout.getLineForVertical((int) rectF.top);
        if (rectF.top > w9e1Var.e(lineForVertical) && (lineForVertical = lineForVertical + 1) >= w9e1Var.g) {
            return null;
        }
        int i3 = lineForVertical;
        int lineForVertical2 = layout.getLineForVertical((int) rectF.bottom);
        if (lineForVertical2 == 0 && rectF.bottom < w9e1Var.i(0)) {
            return null;
        }
        int iV = V(w9e1Var, layout, ur00Var, i3, rectF, qpj1Var, w9Var, true);
        while (true) {
            i2 = i3;
            if (iV != -1 || i2 >= lineForVertical2) {
                break;
            }
            i3 = i2 + 1;
            iV = V(w9e1Var, layout, ur00Var, i3, rectF, qpj1Var, w9Var, true);
        }
        if (iV == -1) {
            return null;
        }
        int iV2 = V(w9e1Var, layout, ur00Var, lineForVertical2, rectF, qpj1Var, w9Var, false);
        while (iV2 == -1 && i2 < lineForVertical2) {
            int i4 = lineForVertical2 - 1;
            iV2 = V(w9e1Var, layout, ur00Var, i4, rectF, qpj1Var, w9Var, false);
            lineForVertical2 = i4;
        }
        if (iV2 == -1) {
            return null;
        }
        return new int[]{qpj1Var.c(iV + 1), qpj1Var.d(iV2 - 1)};
    }

    /* JADX WARN: Code duplicated, block: B:144:0x025c A[EDGE_INSN: B:144:0x025c->B:171:0x02b8 BREAK  A[LOOP:5: B:154:0x0278->B:206:0x0278]] */
    /* JADX WARN: Code duplicated, block: B:86:0x01a4  */
    public static final int V(w9e1 w9e1Var, Layout layout, ur00 ur00Var, int i, RectF rectF, kq51 kq51Var, w9 w9Var, boolean z) {
        ilb0[] ilb0VarArr;
        ilb0[] ilb0VarArr2;
        int i2;
        int iD;
        int i3;
        int i4;
        int iC;
        Bidi bidiCreateLineBidi;
        float fB;
        float fB2;
        float fB3;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i5 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i5];
        Layout layout2 = w9e1Var.f;
        int lineStart2 = layout2.getLineStart(i);
        int iF = w9e1Var.f(i);
        if (i5 < (iF - lineStart2) * 2) {
            rf80.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        p8a p8aVar = new p8a(w9e1Var);
        boolean z2 = false;
        boolean z3 = layout2.getParagraphDirection(i) == 1;
        int i6 = 0;
        while (lineStart2 < iF) {
            boolean zIsRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z3 && !zIsRtlCharAt) {
                fB = p8aVar.b(lineStart2, z2, z2, true);
                fB3 = p8aVar.b(lineStart2 + 1, true, true, true);
            } else if (z3 && zIsRtlCharAt) {
                fB3 = p8aVar.b(lineStart2, false, false, false);
                fB = p8aVar.b(lineStart2 + 1, true, true, false);
            } else {
                if (zIsRtlCharAt) {
                    fB2 = p8aVar.b(lineStart2, false, false, true);
                    fB = p8aVar.b(lineStart2 + 1, true, true, true);
                } else {
                    fB = p8aVar.b(lineStart2, false, false, false);
                    fB2 = p8aVar.b(lineStart2 + 1, true, true, false);
                }
                fB3 = fB2;
            }
            fArr[i6] = fB;
            fArr[i6 + 1] = fB3;
            i6 += 2;
            lineStart2++;
            z3 = z3;
            z2 = false;
        }
        Layout layout3 = (Layout) ur00Var.b;
        int lineStart3 = layout3.getLineStart(i);
        int lineEnd2 = layout3.getLineEnd(i);
        int iO = ur00Var.o(lineStart3, false);
        int iP = ur00Var.p(iO);
        int i7 = lineStart3 - iP;
        int i8 = lineEnd2 - iP;
        Bidi bidiD = ur00Var.d(iO);
        if (bidiD == null || (bidiCreateLineBidi = bidiD.createLineBidi(i7, i8)) == null) {
            ilb0VarArr = new ilb0[]{new ilb0(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = bidiCreateLineBidi.getRunCount();
            ilb0VarArr = new ilb0[runCount];
            int i9 = 0;
            while (i9 < runCount) {
                int i10 = runCount;
                ilb0VarArr[i9] = new ilb0(bidiCreateLineBidi.getRunStart(i9) + lineStart3, bidiCreateLineBidi.getRunLimit(i9) + lineStart3, bidiCreateLineBidi.getRunLevel(i9) % 2 == 1);
                i9++;
                runCount = i10;
            }
        }
        tr80 tr80Var = z ? new tr80(0, ilb0VarArr.length - 1, 1) : ebp1.m(ilb0VarArr.length - 1, 0, -1);
        int i11 = ((rr80) tr80Var).a;
        int i12 = ((rr80) tr80Var).b;
        int i13 = ((rr80) tr80Var).c;
        if ((i13 <= 0 || i11 > i12) && (i13 >= 0 || i12 > i11)) {
            return -1;
        }
        while (true) {
            ilb0 ilb0Var = ilb0VarArr[i11];
            boolean z4 = ilb0Var.c;
            int iA = ilb0Var.a;
            int iE = ilb0Var.b;
            float f = z4 ? fArr[((iE - 1) - lineStart) * 2] : fArr[(iA - lineStart) * 2];
            float fT = z4 ? T(iA, lineStart, fArr) : T(iE - 1, lineStart, fArr);
            float f2 = rectF.left;
            int i14 = i13;
            if (!z) {
                ilb0VarArr2 = ilb0VarArr;
                if (fT < f2) {
                    iE = -1;
                    break;
                }
                float f3 = rectF.right;
                if (f <= f3) {
                    if ((z4 || f3 < fT) && (!z4 || f2 > f)) {
                        int i15 = iE;
                        int i16 = iA;
                        while (i15 - i16 > 1) {
                            int i17 = (i15 + i16) / 2;
                            float f4 = fArr[(i17 - lineStart) * 2];
                            int i18 = i15;
                            if ((z4 || f4 <= rectF.right) && (!z4 || f4 >= rectF.left)) {
                                i15 = i18;
                                i16 = i17;
                            } else {
                                i15 = i17;
                            }
                        }
                        i2 = z4 ? i15 : i16;
                    } else {
                        i2 = iE - 1;
                    }
                    int iC2 = kq51Var.c(i2 + 1);
                    if (iC2 == -1 || (iD = kq51Var.d(iC2)) <= iA) {
                        iE = -1;
                        break;
                    }
                    if (iC2 < iA) {
                        iC2 = iA;
                    }
                    if (iD <= iE) {
                        iE = iD;
                    }
                    RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                    int iC3 = iC2;
                    while (true) {
                        rectF2.left = z4 ? fArr[((iE - 1) - lineStart) * 2] : fArr[(iC3 - lineStart) * 2];
                        rectF2.right = z4 ? T(iC3, lineStart, fArr) : T(iE - 1, lineStart, fArr);
                        if (((Boolean) w9Var.invoke(rectF2, rectF)).booleanValue()) {
                            break;
                        }
                        iE = kq51Var.e(iE);
                        if (iE == -1 || iE <= iA) {
                            iE = -1;
                            break;
                        }
                        iC3 = kq51Var.c(iE);
                        if (iC3 < iA) {
                            iC3 = iA;
                        }
                    }
                } else {
                    iE = -1;
                    break;
                }
                iA = iE;
            } else {
                if (fT < f2) {
                    ilb0VarArr2 = ilb0VarArr;
                    iA = -1;
                    break;
                }
                float f5 = rectF.right;
                if (f <= f5) {
                    if ((z4 || f2 > f) && (!z4 || f5 < fT)) {
                        int i19 = iE;
                        int i20 = iA;
                        while (true) {
                            i3 = i19;
                            if (i19 - i20 <= 1) {
                                break;
                            }
                            int i21 = (i3 + i20) / 2;
                            float f6 = fArr[(i21 - lineStart) * 2];
                            if ((z4 || f6 <= rectF.left) && (!z4 || f6 >= rectF.right)) {
                                i19 = i3;
                                i20 = i21;
                            } else {
                                i19 = i21;
                            }
                        }
                        i4 = z4 ? i3 : i20;
                    } else {
                        i4 = iA;
                    }
                    int iD2 = kq51Var.d(i4);
                    if (iD2 != -1 && (iC = kq51Var.c(iD2)) < iE) {
                        if (iC >= iA) {
                            iA = iC;
                        }
                        if (iD2 > iE) {
                            iD2 = iE;
                        }
                        ilb0VarArr2 = ilb0VarArr;
                        RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                        int iD3 = iD2;
                        while (true) {
                            rectF3.left = z4 ? fArr[((iD3 - 1) - lineStart) * 2] : fArr[(iA - lineStart) * 2];
                            rectF3.right = z4 ? T(iA, lineStart, fArr) : T(iD3 - 1, lineStart, fArr);
                            if (((Boolean) w9Var.invoke(rectF3, rectF)).booleanValue()) {
                                break;
                            }
                            iA = kq51Var.a(iA);
                            if (iA != -1 && iA < iE) {
                                iD3 = kq51Var.d(iA);
                                if (iD3 > iE) {
                                    iD3 = iE;
                                }
                            }
                        }
                    } else {
                        ilb0VarArr2 = ilb0VarArr;
                    }
                    iA = -1;
                    break;
                } else {
                    ilb0VarArr2 = ilb0VarArr;
                    iA = -1;
                    break;
                }
            }
            if (iA >= 0) {
                return iA;
            }
            if (i11 == i12) {
                return -1;
            }
            i11 += i14;
            i13 = i14;
            ilb0VarArr = ilb0VarArr2;
        }
    }

    public static final p3v W(int i, u37 u37Var, b0k b0kVar) {
        if (i == 3) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(1310254529);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            x340Var.r(false);
            return new p3v(64.0f);
        }
        if (u37Var != u37.a || i != 2) {
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.i0(1963352973);
            x340Var2.r(false);
            return null;
        }
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.i0(1310258977);
        uwr uwrVar2 = cbx.a;
        zov0 zov0Var2 = cbx.b(x340Var3).g;
        x340Var3.r(false);
        return new p3v(48.0f);
    }

    public static final ArrayList X(int i, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            arrayList2.add(Integer.valueOf(i));
            i += iIntValue;
        }
        return arrayList2;
    }

    public static final go80 Y(klm klmVar, acp0 acp0Var, acp0 acp0Var2) {
        return klmVar.a("TapOverBleDaemon", new ocp0(acp0Var, acp0Var2, (byte) 18));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object Z(fhe1 fhe1Var, xu30 xu30Var, Throwable th, onm onmVar) {
        et20 et20Var;
        if (onmVar instanceof et20) {
            et20Var = (et20) onmVar;
            int i = et20Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                et20Var.c = i - Integer.MIN_VALUE;
            } else {
                et20Var = new et20(onmVar);
            }
        } else {
            et20Var = new et20(onmVar);
        }
        Object obj = et20Var.b;
        int i2 = et20Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                et20Var.a = th;
                et20Var.c = 1;
                Object objInvoke = xu30Var.invoke(fhe1Var, th, et20Var);
                d9n d9nVar = d9n.a;
                if (objInvoke == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = et20Var.a;
                hm5.M(obj);
            }
            return rih1.a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                j2h1.h(th2, th);
            }
            throw th2;
        }
    }

    public static final void a(int i, b0k b0kVar, vu30 vu30Var, qim0 qim0Var) {
        int i2;
        h311 h311VarV;
        ahx ahxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(636154687);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(vu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            if (vu30Var == null) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    ahxVar = new ahx(vu30Var, qim0Var, i, (byte) 3);
                }
            } else {
                int iI0 = ((wat) x340Var.k(t4k.h)).i0(48.0f);
                boolean zE = x340Var.e(iI0);
                Object objT = x340Var.T();
                if (zE || objT == fkj0.X) {
                    objT = new f13(iI0, (byte) 16);
                    x340Var.s0(objT);
                }
                qim0 qim0VarX = j9k1.x(qim0Var, (xu30) objT);
                gfh0 gfh0VarC = t1c.c(een.d, false);
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
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                us71.j(i2 & 14, vu30Var, x340Var, true);
            }
            h311VarV.d = ahxVar;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            ahxVar = new ahx(vu30Var, qim0Var, i, (byte) 4);
            h311VarV.d = ahxVar;
        }
    }

    public static final iib a0(mr20 mr20Var, xu30 xu30Var) {
        return new iib(mr20Var, xu30Var, (byte) 6);
    }

    public static final void b(c380 c380Var, vu30 vu30Var, vu30 vu30Var2, boolean z, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2118724859);
        int i2 = i | (x340Var.g(c380Var) ? 4 : 2) | (x340Var.i(vu30Var) ? 32 : 16) | (x340Var.i(vu30Var2) ? 256 : 128) | (x340Var.h(z) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            int size = c380Var.size() + (vu30Var != null ? 1 : 0) + (vu30Var2 != null ? 1 : 0);
            boolean zE = x340Var.e(size);
            Object objT = x340Var.T();
            if (zE || objT == m4cVar) {
                objT = new sl11(size, (byte) 2);
                x340Var.s0(objT);
            }
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = s161.b(nim0Var, false, (iu30) objT);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
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
            if (z) {
                x340Var.i0(-986512184);
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                op71.g(x340Var, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                int i3 = 0;
                for (Object obj : o7h.T0(c380Var)) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        p7h.T();
                        throw null;
                    }
                    vu30 vu30Var3 = (vu30) obj;
                    boolean zE2 = x340Var.e(i3);
                    Object objT2 = x340Var.T();
                    if (zE2 || objT2 == m4cVar) {
                        objT2 = new sl11(i3, (byte) 3);
                        x340Var.s0(objT2);
                    }
                    a(0, x340Var, vu30Var3, s161.b(nim0Var, false, (iu30) objT2));
                    i3 = i4;
                }
                x340Var.r(false);
            } else {
                x340Var.i0(-986130605);
                x340Var.i0(-308904884);
                int i5 = 0;
                for (Object obj2 : c380Var) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        p7h.T();
                        throw null;
                    }
                    vu30 vu30Var4 = (vu30) obj2;
                    boolean zE3 = x340Var.e(i5);
                    Object objT3 = x340Var.T();
                    if (zE3 || objT3 == m4cVar) {
                        objT3 = new sl11(i5, (byte) 4);
                        x340Var.s0(objT3);
                    }
                    a(0, x340Var, vu30Var4, s161.b(nim0Var, false, (iu30) objT3));
                    i5 = i6;
                }
                x340Var.r(false);
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                op71.g(x340Var, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                x340Var.r(false);
            }
            if (vu30Var != null) {
                x340Var.i0(-985732441);
                boolean z2 = (i2 & 14) == 4;
                Object objT4 = x340Var.T();
                if (z2 || objT4 == m4cVar) {
                    objT4 = new xr1(c380Var, (byte) 7);
                    x340Var.s0(objT4);
                }
                a((i2 >> 3) & 14, x340Var, vu30Var, s161.b(nim0Var, false, (iu30) objT4));
                x340Var.r(false);
            } else {
                x340Var.i0(-985398013);
                x340Var.r(false);
            }
            if (vu30Var2 != null) {
                x340Var.i0(-985354241);
                boolean z3 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
                Object objT5 = x340Var.T();
                if (z3 || objT5 == m4cVar) {
                    objT5 = new zq60(c380Var, vu30Var, (byte) 1);
                    x340Var.s0(objT5);
                }
                a((i2 >> 6) & 14, x340Var, vu30Var2, s161.b(nim0Var, false, (iu30) objT5));
                x340Var.r(false);
            } else {
                x340Var.i0(-984981373);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qy90(c380Var, vu30Var, vu30Var2, z, i);
        }
    }

    public static final ht20 b0(mr20 mr20Var, vu30 vu30Var) {
        return new ht20(mr20Var, vu30Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [int] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r2v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    public static final void c(ew20 ew20Var, n4m n4mVar, bv11 bv11Var, q1v q1vVar, boolean z, boolean z2, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        int i3;
        int i4;
        ?? r2;
        boolean z3;
        int i5;
        q1v q1vVar2;
        ?? r10;
        ?? r14;
        fra fraVar = een.N0;
        f540 f540Var = bv11Var.i;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(60808082);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(ew20Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.e(n4mVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var.g(bv11Var) : x340Var.i(bv11Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.e(q1vVar.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.h(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.h(z2) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            nim0 nim0Var = nim0.a;
            if (z) {
                x340Var.i0(-942388728);
                xap1.f(0, 0, x340Var, anm1.N("LOCKED_BADGE_TAG", ew20Var.e(nim0Var, fraVar)));
                x340Var.r(false);
            } else {
                x340Var.i0(-942288784);
                x340Var.r(false);
            }
            int iOrdinal = n4mVar.ordinal();
            if (iOrdinal == 0) {
                i3 = 1;
            } else if (iOrdinal == 1) {
                i3 = 2;
            } else if (iOrdinal == 2) {
                i3 = 3;
            } else {
                if (iOrdinal != 3) {
                    eg.o();
                    return;
                }
                i3 = 0;
            }
            if (i3 != 0) {
                x340Var.i0(-941917001);
                kqn1.d(i3, 0, 0, x340Var, ew20Var.e(nim0Var, fraVar));
                x340Var.r(false);
            } else {
                x340Var.i0(-941769968);
                x340Var.r(false);
            }
            if (f540Var instanceof f540) {
                x340Var.i0(-941688500);
                String str = f540Var.a;
                r2 = 0;
                i5 = 1;
                bbp1.c(0, 0, str, str, x340Var, ew20Var.e(nim0Var, fraVar));
                x340Var.r(false);
            } else {
                i4 = 1;
                if (f540Var == null) {
                    x340Var.i0(-941438733);
                    int i6 = bv11Var.f;
                    int i7 = i6 == 0 ? -1 : rv11.a[l1d.C(i6)];
                    if (i7 == -1) {
                        z3 = false;
                        x340Var.i0(-1692923562);
                        x340Var.r(false);
                    } else if (i7 != 1) {
                        if (i7 != 2) {
                            throw p3d1.k(x340Var, -1692936977, false);
                        }
                        z3 = false;
                        x340Var.i0(-1692923562);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-941383026);
                        int i8 = bv11Var.g ? 2131955878 : 2131959537;
                        qim0 qim0VarE = ew20Var.e(nim0Var, fraVar);
                        String strO0 = cwl1.o0(x340Var, i8);
                        z3 = false;
                        suo1.d(0, 0, 12, strO0, x340Var, qim0VarE);
                        x340Var.r(false);
                    }
                    x340Var.r(z3);
                    r2 = z3;
                    i5 = i4;
                } else {
                    r2 = 0;
                    x340Var.i0(-1692921834);
                    x340Var.r(false);
                }
            }
            if (z2) {
                i5 = i4;
                q1vVar2 = q1vVar;
            } else {
                i5 = i4;
                q1vVar2 = null;
            }
            if (q1vVar2 != null) {
                int iOrdinal2 = q1vVar2.ordinal();
                if (iOrdinal2 == 0) {
                    r14 = i5;
                    r14 = r2;
                } else if (iOrdinal2 == i5) {
                    r14 = 4;
                } else if (iOrdinal2 != 2) {
                    if (iOrdinal2 == 3) {
                        r14 = 2;
                    } else {
                        if (iOrdinal2 != 4) {
                            eg.o();
                            return;
                        }
                        r14 = 3;
                    }
                }
                r10 = r14;
            } else {
                r10 = r2;
            }
            if (r10 == 0) {
                x340Var.i0(-940865389);
                x340Var.r((boolean) r2);
            } else {
                x340Var.i0(-940865388);
                acq0.e((int) r10, (int) r2, x340Var, anm1.N("DOWNLOAD_BADGE_TAG", ew20Var.e(nim0Var, fraVar)));
                x340Var.r((boolean) r2);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wag(ew20Var, n4mVar, bv11Var, q1vVar, z, z2, i);
        }
    }

    public static final boolean c0(jmb1 jmb1Var, boolean z, c380 c380Var, boolean z2, vu30 vu30Var) {
        xn70 xn70Var = jmb1Var.c;
        bv11 bv11Var = jmb1Var.b;
        String str = xn70Var != null ? xn70Var.a : null;
        boolean z3 = bv11Var.m;
        if ((z2 && str != null && str.length() != 0) || z3) {
            return false;
        }
        String str2 = bv11Var.b;
        if (str2 == null || ihc1.y0(str2)) {
            return (!c380Var.isEmpty() || z) && vu30Var == null;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0207  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096 A[PHI: r2 r5
      0x0096: PHI (r2v25 int) = (r2v6 int), (r2v6 int), (r2v27 int) binds: [B:57:0x00a0, B:51:0x0092, B:52:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x0096: PHI (r5v14 p.qim0) = (r5v4 p.qim0), (r5v2 p.qim0), (r5v2 p.qim0) binds: [B:57:0x00a0, B:51:0x0092, B:52:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:67:0x0115  */
    /* JADX WARN: Code duplicated, block: B:68:0x0118  */
    /* JADX WARN: Code duplicated, block: B:71:0x012c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:72:0x012e  */
    /* JADX WARN: Code duplicated, block: B:75:0x013c  */
    /* JADX WARN: Code duplicated, block: B:76:0x013e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0153 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x0155  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:87:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:88:0x01be  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:99:0x01fa  */
    public static final void d(x6r x6rVar, iu30 iu30Var, qim0 qim0Var, Clock clock, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        Clock clock2;
        boolean z;
        x340 x340Var;
        Clock clock3;
        qim0 qim0Var3;
        h311 h311VarV;
        int i4;
        qim0 qim0Var4;
        int i5;
        Clock clockSystemDefaultZone;
        qim0 qim0Var5;
        o0g1 o0g1Var;
        mbh mbhVarA;
        qim0 qim0Var6;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z2;
        n4k n4kVar;
        int i6;
        boolean z3;
        boolean zI;
        Object objT;
        boolean z4;
        boolean zI2;
        Object objT2;
        boolean z5;
        boolean z6;
        Object objT3;
        iu30 iu30Var2 = iu30Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-2065411912);
        j06 j06Var = x340Var2.a;
        if ((i & 6) == 0) {
            i3 = (x340Var2.i(x6rVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var2.i(iu30Var2) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var2.i(qim0Var2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    clock2 = clock;
                    int i8 = x340Var2.i(clock2) ? 2048 : 1024;
                    i3 |= i8;
                } else {
                    clock2 = clock;
                }
                i3 |= i8;
            } else {
                clock2 = clock;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var2.Y(i3 & 1, z)) {
                x340Var2.d0();
                i4 = i & 1;
                qim0Var4 = nim0.a;
                if (i4 != 0 || x340Var2.E()) {
                    if (i7 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if ((i2 & 8) != 0) {
                        i5 = i3 & (-7169);
                        clockSystemDefaultZone = Clock.systemDefaultZone();
                        qim0Var5 = qim0Var2;
                    }
                    x340Var2.s();
                    Locale locale = Locale.getDefault();
                    locale.getClass();
                    o0g1Var = new o0g1(locale, clockSystemDefaultZone);
                    qim0 qim0VarF = u291.f(qim0Var5, 1.0f);
                    mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                    qim0Var6 = qim0Var5;
                    iHashCode = Long.hashCode(x340Var2.T);
                    xos0VarM = x340Var2.m();
                    qim0VarE = zr7.E(x340Var2, qim0VarF);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    z2 = x340Var2.S;
                    n4kVar = hmb0.t1;
                    if (z2) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(mbhVarA, x340Var2, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var2, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var2, lljVar3);
                    nko1.F(x340Var2);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE, x340Var2, lljVar4);
                    Clock clock4 = clockSystemDefaultZone;
                    YearMonth yearMonth = x6rVar.c;
                    i6 = i5 & 112;
                    if (i6 == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zI = z3 | x340Var2.i(o0g1Var) | x340Var2.i(x6rVar);
                    objT = x340Var2.T();
                    if (zI || objT == m4cVar) {
                        objT = new y6r(iu30Var2, o0g1Var, x6rVar, (byte) 0);
                        x340Var2.s0(objT);
                    }
                    Function0 function0 = (Function0) objT;
                    if (i6 == 32) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zI2 = z4 | x340Var2.i(o0g1Var) | x340Var2.i(x6rVar);
                    objT2 = x340Var2.T();
                    if (zI2 || objT2 == m4cVar) {
                        objT2 = new y6r(iu30Var2, o0g1Var, x6rVar, (byte) 1);
                        x340Var2.s0(objT2);
                    }
                    o(o0g1Var, x6rVar, yearMonth, function0, (Function0) objT2, null, x340Var2, (i5 << 3) & 112);
                    N(o0g1Var, null, x340Var2, 0);
                    qim0 qim0VarF2 = u291.f(qim0Var4, 1.0f);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode2 = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM2 = x340Var2.m();
                    qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarF2);
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
                    boolean zI3 = x340Var2.i(x6rVar);
                    if (i6 == 32) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = zI3 | z5;
                    objT3 = x340Var2.T();
                    if (!z6 || objT3 == m4cVar) {
                        iu30Var2 = iu30Var;
                        objT3 = new y0o(x6rVar, iu30Var2, (byte) 12);
                        x340Var2.s0(objT3);
                    } else {
                        iu30Var2 = iu30Var;
                    }
                    n(x6rVar, o0g1Var, null, (iu30) objT3, x340Var2, i5 & 14);
                    x340Var2.r(true);
                    x340Var2.r(true);
                    qim0Var3 = qim0Var6;
                    x340Var = x340Var2;
                    clock3 = clock4;
                } else {
                    x340Var2.b0();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                }
                i5 = i3;
                qim0Var5 = qim0Var2;
                clockSystemDefaultZone = clock2;
                x340Var2.s();
                Locale locale2 = Locale.getDefault();
                locale2.getClass();
                o0g1Var = new o0g1(locale2, clockSystemDefaultZone);
                qim0 qim0VarF3 = u291.f(qim0Var5, 1.0f);
                mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                qim0Var6 = qim0Var5;
                iHashCode = Long.hashCode(x340Var2.T);
                xos0VarM = x340Var2.m();
                qim0VarE = zr7.E(x340Var2, qim0VarF3);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                z2 = x340Var2.S;
                n4kVar = hmb0.t1;
                if (z2) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                llj lljVar5 = y580.O0;
                nko1.H(mbhVarA, x340Var2, lljVar5);
                llj lljVar6 = y580.N0;
                nko1.H(xos0VarM, x340Var2, lljVar6);
                Integer numValueOf2 = Integer.valueOf(iHashCode);
                llj lljVar7 = y580.R0;
                nko1.H(numValueOf2, x340Var2, lljVar7);
                nko1.F(x340Var2);
                llj lljVar8 = y580.Y;
                nko1.H(qim0VarE, x340Var2, lljVar8);
                Clock clock5 = clockSystemDefaultZone;
                YearMonth yearMonth2 = x6rVar.c;
                i6 = i5 & 112;
                if (i6 == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zI = z3 | x340Var2.i(o0g1Var) | x340Var2.i(x6rVar);
                objT = x340Var2.T();
                if (zI) {
                    objT = new y6r(iu30Var2, o0g1Var, x6rVar, (byte) 0);
                    x340Var2.s0(objT);
                } else {
                    objT = new y6r(iu30Var2, o0g1Var, x6rVar, (byte) 0);
                    x340Var2.s0(objT);
                }
                Function0 function1 = (Function0) objT;
                if (i6 == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zI2 = z4 | x340Var2.i(o0g1Var) | x340Var2.i(x6rVar);
                objT2 = x340Var2.T();
                if (zI2) {
                    objT2 = new y6r(iu30Var2, o0g1Var, x6rVar, (byte) 1);
                    x340Var2.s0(objT2);
                } else {
                    objT2 = new y6r(iu30Var2, o0g1Var, x6rVar, (byte) 1);
                    x340Var2.s0(objT2);
                }
                o(o0g1Var, x6rVar, yearMonth2, function1, (Function0) objT2, null, x340Var2, (i5 << 3) & 112);
                N(o0g1Var, null, x340Var2, 0);
                qim0 qim0VarF4 = u291.f(qim0Var4, 1.0f);
                gfh0 gfh0VarC2 = t1c.c(een.d, false);
                int iHashCode3 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM3 = x340Var2.m();
                qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarF4);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(gfh0VarC2, x340Var2, lljVar5);
                nko1.H(xos0VarM3, x340Var2, lljVar6);
                x0d.q(iHashCode3, x340Var2, lljVar7, x340Var2);
                nko1.H(qim0VarE3, x340Var2, lljVar8);
                boolean zI4 = x340Var2.i(x6rVar);
                if (i6 == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = zI4 | z5;
                objT3 = x340Var2.T();
                if (z6) {
                    iu30Var2 = iu30Var;
                    objT3 = new y0o(x6rVar, iu30Var2, (byte) 12);
                    x340Var2.s0(objT3);
                } else {
                    iu30Var2 = iu30Var;
                    objT3 = new y0o(x6rVar, iu30Var2, (byte) 12);
                    x340Var2.s0(objT3);
                }
                n(x6rVar, o0g1Var, null, (iu30) objT3, x340Var2, i5 & 14);
                x340Var2.r(true);
                x340Var2.r(true);
                qim0Var3 = qim0Var6;
                x340Var = x340Var2;
                clock3 = clock5;
            } else {
                x340Var2.b0();
                Clock clock6 = clock2;
                x340Var = x340Var2;
                clock3 = clock6;
                qim0Var3 = qim0Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new nj2((Object) x6rVar, (Object) iu30Var2, qim0Var3, (Object) clock3, i, i2, (byte) 5);
            }
        }
        i3 |= 384;
        qim0Var2 = qim0Var;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                clock2 = clock;
                if (x340Var2.i(clock2)) {
                }
                i3 |= i8;
            } else {
                clock2 = clock;
            }
            i3 |= i8;
        } else {
            clock2 = clock;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var2.Y(i3 & 1, z)) {
            x340Var2.d0();
            i4 = i & 1;
            qim0Var4 = nim0.a;
            if (i4 != 0) {
                if (i7 != 0) {
                    qim0Var2 = qim0Var4;
                }
                if ((i2 & 8) != 0) {
                    i5 = i3 & (-7169);
                    clockSystemDefaultZone = Clock.systemDefaultZone();
                    qim0Var5 = qim0Var2;
                } else {
                    i5 = i3;
                    qim0Var5 = qim0Var2;
                    clockSystemDefaultZone = clock2;
                }
            } else {
                if (i7 != 0) {
                    qim0Var2 = qim0Var4;
                }
                if ((i2 & 8) != 0) {
                    i5 = i3 & (-7169);
                    clockSystemDefaultZone = Clock.systemDefaultZone();
                    qim0Var5 = qim0Var2;
                } else {
                    i5 = i3;
                    qim0Var5 = qim0Var2;
                    clockSystemDefaultZone = clock2;
                }
            }
            x340Var2.s();
            Locale locale3 = Locale.getDefault();
            locale3.getClass();
            o0g1Var = new o0g1(locale3, clockSystemDefaultZone);
            qim0 qim0VarF5 = u291.f(qim0Var5, 1.0f);
            mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            qim0Var6 = qim0Var5;
            iHashCode = Long.hashCode(x340Var2.T);
            xos0VarM = x340Var2.m();
            qim0VarE = zr7.E(x340Var2, qim0VarF5);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            z2 = x340Var2.S;
            n4kVar = hmb0.t1;
            if (z2) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar9 = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar9);
            llj lljVar10 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar10);
            Integer numValueOf3 = Integer.valueOf(iHashCode);
            llj lljVar11 = y580.R0;
            nko1.H(numValueOf3, x340Var2, lljVar11);
            nko1.F(x340Var2);
            llj lljVar12 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar12);
            Clock clock7 = clockSystemDefaultZone;
            YearMonth yearMonth3 = x6rVar.c;
            i6 = i5 & 112;
            if (i6 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            zI = z3 | x340Var2.i(o0g1Var) | x340Var2.i(x6rVar);
            objT = x340Var2.T();
            if (zI) {
                objT = new y6r(iu30Var2, o0g1Var, x6rVar, (byte) 0);
                x340Var2.s0(objT);
            } else {
                objT = new y6r(iu30Var2, o0g1Var, x6rVar, (byte) 0);
                x340Var2.s0(objT);
            }
            Function0 function2 = (Function0) objT;
            if (i6 == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            zI2 = z4 | x340Var2.i(o0g1Var) | x340Var2.i(x6rVar);
            objT2 = x340Var2.T();
            if (zI2) {
                objT2 = new y6r(iu30Var2, o0g1Var, x6rVar, (byte) 1);
                x340Var2.s0(objT2);
            } else {
                objT2 = new y6r(iu30Var2, o0g1Var, x6rVar, (byte) 1);
                x340Var2.s0(objT2);
            }
            o(o0g1Var, x6rVar, yearMonth3, function2, (Function0) objT2, null, x340Var2, (i5 << 3) & 112);
            N(o0g1Var, null, x340Var2, 0);
            qim0 qim0VarF6 = u291.f(qim0Var4, 1.0f);
            gfh0 gfh0VarC3 = t1c.c(een.d, false);
            int iHashCode4 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM4 = x340Var2.m();
            qim0 qim0VarE4 = zr7.E(x340Var2, qim0VarF6);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC3, x340Var2, lljVar9);
            nko1.H(xos0VarM4, x340Var2, lljVar10);
            x0d.q(iHashCode4, x340Var2, lljVar11, x340Var2);
            nko1.H(qim0VarE4, x340Var2, lljVar12);
            boolean zI5 = x340Var2.i(x6rVar);
            if (i6 == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            z6 = zI5 | z5;
            objT3 = x340Var2.T();
            if (z6) {
                iu30Var2 = iu30Var;
                objT3 = new y0o(x6rVar, iu30Var2, (byte) 12);
                x340Var2.s0(objT3);
            } else {
                iu30Var2 = iu30Var;
                objT3 = new y0o(x6rVar, iu30Var2, (byte) 12);
                x340Var2.s0(objT3);
            }
            n(x6rVar, o0g1Var, null, (iu30) objT3, x340Var2, i5 & 14);
            x340Var2.r(true);
            x340Var2.r(true);
            qim0Var3 = qim0Var6;
            x340Var = x340Var2;
            clock3 = clock7;
        } else {
            x340Var2.b0();
            Clock clock8 = clock2;
            x340Var = x340Var2;
            clock3 = clock8;
            qim0Var3 = qim0Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nj2((Object) x6rVar, (Object) iu30Var2, qim0Var3, (Object) clock3, i, i2, (byte) 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00db  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x0107  */
    /* JADX WARN: Code duplicated, block: B:86:0x010c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0123  */
    /* JADX WARN: Code duplicated, block: B:91:0x012d  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    public static final void e(LocalDate localDate, x6r x6rVar, Function0 function0, qim0 qim0Var, boolean z, b0k b0kVar, int i, int i2) {
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        h311 h311VarV;
        YearMonth yearMonth;
        LocalDate localDate2;
        LocalDate localDate3;
        LocalDate localDate4;
        l811 l811Var;
        l811 l811Var2;
        boolean z5;
        n811 n811Var;
        n811 n811Var2;
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1527616949);
        if ((i & 6) == 0) {
            i3 = (x340Var.i(localDate) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.i(x6rVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var.i(qim0Var) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                z2 = z;
                i3 |= x340Var.h(z2) ? 16384 : 8192;
            }
            if ((i3 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i3 & 1, z3)) {
                boolean z6 = i5 == 0 ? z2 : false;
                s6r s6rVar = x6rVar.a;
                yearMonth = x6rVar.c;
                localDate2 = s6rVar.a;
                localDate3 = s6rVar.b;
                s6r s6rVar2 = x6rVar.b;
                LocalDate localDate5 = s6rVar2.a;
                boolean z7 = (localDate5 != null || localDate.compareTo(localDate5) >= 0) && ((localDate4 = s6rVar2.b) == null || localDate.compareTo(localDate4) <= 0);
                l811Var = new l811();
                l811Var2 = new l811();
                if (localDate.getYear() == yearMonth.getYear() || localDate.getMonth() != yearMonth.getMonth()) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                n811Var = new n811();
                n811Var2 = new n811();
                if (localDate.equals(localDate2)) {
                    l811Var.a = true;
                    l811Var2.a = true;
                    n811Var.a = 50;
                }
                if (localDate.equals(localDate3)) {
                    l811Var.a = true;
                    l811Var2.a = true;
                    n811Var2.a = 50;
                }
                if (localDate2 != null && localDate3 != null && localDate.compareTo(localDate2) > 0 && localDate.compareTo(localDate3) < 0) {
                    l811Var.a = true;
                }
                int dayOfMonth = localDate.getDayOfMonth();
                if (l811Var.a) {
                    i4 = 4;
                } else {
                    i4 = 1;
                }
                gfx.g(i4, apo.r(837413090, new a7r(z5, z7, z6, n811Var, n811Var2, qim0Var, l811Var, function0, dayOfMonth, l811Var2), x340Var), x340Var, 48);
                z4 = z6;
            } else {
                x340Var.b0();
                z4 = z2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new oia(localDate, x6rVar, function0, qim0Var, z4, i, i2);
            }
        }
        i3 |= 24576;
        z2 = z;
        if ((i3 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i3 & 1, z3)) {
            if (i5 == 0) {
            }
            s6r s6rVar3 = x6rVar.a;
            yearMonth = x6rVar.c;
            localDate2 = s6rVar3.a;
            localDate3 = s6rVar3.b;
            s6r s6rVar4 = x6rVar.b;
            LocalDate localDate6 = s6rVar4.a;
            if (localDate6 != null) {
            }
            l811Var = new l811();
            l811Var2 = new l811();
            if (localDate.getYear() == yearMonth.getYear()) {
                z5 = false;
            } else {
                z5 = false;
            }
            n811Var = new n811();
            n811Var2 = new n811();
            if (localDate.equals(localDate2)) {
                l811Var.a = true;
                l811Var2.a = true;
                n811Var.a = 50;
            }
            if (localDate.equals(localDate3)) {
                l811Var.a = true;
                l811Var2.a = true;
                n811Var2.a = 50;
            }
            if (localDate2 != null) {
                l811Var.a = true;
            }
            int dayOfMonth2 = localDate.getDayOfMonth();
            if (l811Var.a) {
                i4 = 4;
            } else {
                i4 = 1;
            }
            gfx.g(i4, apo.r(837413090, new a7r(z5, z7, z6, n811Var, n811Var2, qim0Var, l811Var, function0, dayOfMonth2, l811Var2), x340Var), x340Var, 48);
            z4 = z6;
        } else {
            x340Var.b0();
            z4 = z2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oia(localDate, x6rVar, function0, qim0Var, z4, i, i2);
        }
    }

    public static final void f(int i, lee1 lee1Var, long j, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1142557253);
        int i3 = i2 | (x340Var.e(i) ? 4 : 2) | (x340Var.i(lee1Var) ? 32 : 16) | (x340Var.f(j) ? 256 : 128);
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0VarA = u291.a(nim0.a, 24.0f, 24.0f);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = r5r.d;
                x340Var.s0(objT);
            }
            qim0 qim0VarA2 = s161.a(qim0VarA, (iu30) objT);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA2);
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
            uwo1.e(String.valueOf(i), null, lee1Var, j, null, null, 0, false, null, 0, null, x340Var, (i3 << 3) & 8064, 0, 2034);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new z6r(i, lee1Var, j, i2);
        }
    }

    public static final void g(Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1913713303);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(function0) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 48);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
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
            String strO0 = cwl1.o0(x340Var, 2131962386);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, null, cbx.d(x340Var).g, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            gfx.g(4, apo.r(-1830122272, new s721(cwl1.o0(x340Var, 2131962387), function0, (byte) 2), x340Var), x340Var, 54);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h621(function0, i, (byte) 6);
        }
    }

    public static final void h(ew71 ew71Var, ew71 ew71Var2, boolean z, boolean z2, boolean z3, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        boolean z4;
        boolean z5;
        iu30 iu30Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-667951072);
        if ((i & 6) == 0) {
            i2 = (x340Var.e(ew71Var == null ? -1 : ew71Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.e(ew71Var2 == null ? -1 : ew71Var2.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z4 = z2;
            i2 |= x340Var.h(z4) ? 2048 : 1024;
        } else {
            z4 = z2;
        }
        if ((i & 24576) == 0) {
            z5 = z3;
            i2 |= x340Var.h(z5) ? 16384 : 8192;
        } else {
            z5 = z3;
        }
        if ((196608 & i) == 0) {
            iu30Var2 = iu30Var;
            i2 |= x340Var.i(iu30Var2) ? 131072 : 65536;
        } else {
            iu30Var2 = iu30Var;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            ew71 ew71Var3 = ew71Var2 == null ? ew71Var : ew71Var2;
            boolean z6 = ew71Var2 != null;
            List listSingletonList = (ew71Var3 == null || z6) ? ew71.h : Collections.singletonList(ew71Var3);
            String strO0 = cwl1.o0(x340Var, 2131956005);
            boolean zG = x340Var.g(strO0);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = new pg61(strO0, (byte) 13);
                x340Var.s0(objT);
            }
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = s161.b(nim0Var, false, (iu30) objT);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
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
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            zzq0 zzq0Var = new zzq0(16.0f, 8.0f, 16.0f, 8.0f);
            boolean zE = x340Var.e(ew71Var3 == null ? -1 : ew71Var3.ordinal()) | x340Var.h(z6) | ((458752 & i2) == 131072) | x340Var.g(listSingletonList) | ((i2 & 14) == 4) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((i2 & 57344) == 16384);
            Object objT2 = x340Var.T();
            if (zE || objT2 == m4cVar) {
                yx71 yx71Var = new yx71(ew71Var3, z6, listSingletonList, ew71Var, z, z4, z5, iu30Var2);
                x340Var.s0(yx71Var);
                objT2 = yx71Var;
            }
            too1.b(qim0VarF, xtb0VarA, zzq0Var, (iu30) objT2, x340Var, 6, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oo60(ew71Var, ew71Var2, z, z2, z3, iu30Var, i);
        }
    }

    public static final void i(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1906088087);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131959041);
            int i3 = strO0.length() <= 12 ? strO0.length() > 7 ? 3 : 4 : 2;
            Object objT = x340Var.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = p7h.M(new Long[]{1000L, 750L, 500L, 250L});
                x340Var.s0(objT);
            }
            List list = (List) objT;
            boolean zE = x340Var.e(i3);
            Object objT2 = x340Var.T();
            if (zE || objT2 == obj) {
                objT2 = o7h.e1(i3, list);
                x340Var.s0(objT2);
            }
            List list2 = (List) objT2;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var2);
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
            x340Var.i0(-2064834276);
            for (int i4 = 0; i4 < i3; i4++) {
                j(i4, 390, ((Number) list2.get(i4)).longValue(), strO0, x340Var);
            }
            x340Var.r(false);
            x340Var.r(true);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ns30(qim0Var, i, (byte) 23);
        }
    }

    public static final void j(int i, int i2, long j, String str, b0k b0kVar) {
        Object obj;
        float f;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1017142437);
        int i3 = i2 | (x340Var.e(i) ? 32 : 16) | (x340Var.f(j) ? 2048 : 1024) | (x340Var.g(str) ? 16384 : 8192);
        byte b2 = 1;
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                ArrayList arrayList = new ArrayList(6);
                for (int i4 = 0; i4 < 6; i4++) {
                    if (i4 == 5) {
                        obj = objT;
                        f = 1.0f;
                    } else {
                        obj = objT;
                        f = 0.5f;
                    }
                    arrayList.add(c97.b(f));
                }
                obj = objT;
                x340Var.s0(arrayList);
                obj = arrayList;
            }
            obj = objT;
            List list = (List) obj;
            Integer numValueOf = Integer.valueOf(i);
            Long lValueOf = Long.valueOf(j);
            boolean zI = x340Var.i(list) | ((i3 & 7168) == 2048);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new wc80(j, list, (lnm) null);
                x340Var.s0(objT2);
            }
            qxd0.s(numValueOf, lValueOf, (vu30) objT2, x340Var);
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            w2g0.c(u291.d(new wnb0(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), 1.0f), (tl3) null, apo.r(802800177, new uf(str, list, b2), x340Var), x340Var, 3072, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n9e0(i, j, str, i2);
        }
    }

    public static final void k(int i, long j, String str, b0k b0kVar, iu30 iu30Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1533240957);
        long j2 = j;
        String str2 = str;
        int i2 = i | (x340Var.e(6) ? 4 : 2) | (x340Var.f(j2) ? 32 : 16) | (x340Var.g(str2) ? 256 : 128) | (x340Var.i(iu30Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
            x340Var.i0(1441284677);
            int i3 = 0;
            while (i3 < 6) {
                boolean zE = ((i2 & 7168) == 2048) | x340Var.e(i3);
                Object objT = x340Var.T();
                if (zE || objT == fkj0.X) {
                    objT = new ck0(iu30Var, i3, (byte) 11);
                    x340Var.s0(objT);
                }
                l(str2, j2, (Function0) objT, new wnb0(1.0f, true), x340Var, (i2 & 112) | ((i2 >> 6) & 14));
                i3++;
                j2 = j;
                str2 = str;
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pk6(j, str, iu30Var, i);
        }
    }

    public static final void l(String str, long j, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        String str2;
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2044687374);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = i | (x340Var.g(str2) ? 4 : 2);
        } else {
            str2 = str;
            i2 = i;
        }
        int i3 = i2 | (x340Var.f(j) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
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
            uwr uwrVar = cbx.a;
            lee1 lee1VarA = lee1.a(cbx.d(x340Var).a, 0L, j, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213);
            FontWeight fontWeight = (FontWeight) ((bjx) ajx.a.c).g;
            long j2 = ((vex) zex.a.e).n;
            cjc0 cjc0Var = new cjc0(1);
            px8 px8Var = new px8(fc11.G(6), j, 0L, (mx8) null, 12);
            boolean z = (i3 & 896) == 256;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new xet(function0, (byte) 25);
                x340Var.s0(objT);
            }
            gxo1.c(str2, i541.C(nim0.a, (iu30) objT), lee1VarA, j2, new a0e1(3), 0, false, cjc0Var, px8Var, 96.0f, fontWeight, null, x340Var, (i3 & 14) | 135790592, 0, 2080);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new o9e0(str, j, function0, qim0Var, i);
        }
    }

    public static final void m(c380 c380Var, long j, b0k b0kVar, int i, int i2) {
        h311 h311VarV;
        hv11 hv11Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1323352140);
        long j2 = j;
        int i3 = i | (x340Var.g(c380Var) ? 4 : 2) | (((i2 & 2) == 0 && x340Var.f(j2)) ? 32 : 16);
        boolean z = false;
        int i4 = 1;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                if ((i2 & 2) != 0) {
                    uwr uwrVar = cbx.a;
                    j2 = cbx.a(x340Var).b.a;
                    i3 &= -113;
                }
                h311VarV.d = hv11Var;
            }
            x340Var.b0();
            if ((i2 & 2) != 0) {
                i3 &= -113;
            }
            int i5 = i3;
            x340Var.s();
            if (c380Var.isEmpty()) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    hv11Var = new hv11(c380Var, j2, i, i2, (byte) 0);
                }
            } else {
                int i6 = 0;
                for (Object obj : c380Var) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        p7h.T();
                        throw null;
                    }
                    eoj0 eoj0Var = (eoj0) obj;
                    if (i6 > 0) {
                        x340Var.i0(2104818591);
                        C(j2, x340Var, (i5 >> 3) & 14);
                    } else {
                        x340Var.i0(824889947);
                    }
                    x340Var.r(z);
                    String str = eoj0Var.a;
                    cjc0 cjc0Var = new cjc0(i4);
                    uwr uwrVar2 = cbx.a;
                    lee1 lee1Var = cbx.d(x340Var).j;
                    boolean zG = x340Var.g(eoj0Var);
                    Object objT = x340Var.T();
                    if (zG || objT == fkj0.X) {
                        objT = new ak01(eoj0Var, (byte) 28);
                        x340Var.s0(objT);
                    }
                    uwo1.e(str, s161.b(nim0.a, z, (iu30) objT), lee1Var, j2, null, null, 0, false, cjc0Var, 0, null, x340Var, (i5 << 6) & 7168, 0, 1776);
                    i6 = i7;
                    i4 = i4;
                    z = z;
                }
            }
            h311VarV.d = hv11Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            hv11Var = new hv11(c380Var, j2, i, i2, (byte) 1);
            h311VarV.d = hv11Var;
        }
    }

    public static final void n(x6r x6rVar, o0g1 o0g1Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        boolean z;
        boolean z2;
        int i3;
        YearMonth yearMonth;
        int i4;
        int i5;
        boolean z3;
        int i6;
        char c;
        boolean z4;
        vu30 vu30Var = y580.Y;
        llj lljVar = y580.R0;
        llj lljVar2 = y580.N0;
        llj lljVar3 = y580.O0;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2003613476);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(x6rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(o0g1Var) ? 32 : 16;
        }
        int i7 = i2 | 384;
        if ((i & 3072) == 0) {
            i7 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i7 & 1, (i7 & 1171) != 1170)) {
            YearMonth yearMonth2 = x6rVar.c;
            s6r s6rVar = x6rVar.b;
            int value = (yearMonth2.atDay(1).getDayOfWeek().getValue() - o0g1Var.b) % 7;
            int i8 = 7;
            int i9 = value + ((((value ^ 7) & ((-value) | value)) >> 31) & 7);
            LocalDate localDate = s6rVar.a;
            if (localDate != null) {
                z = localDate.getMonth() == yearMonth2.getMonth() && localDate.getYear() == yearMonth2.getYear();
            } else {
                z = false;
            }
            LocalDate localDate2 = s6rVar.b;
            if (localDate2 != null) {
                z2 = localDate2.getMonth() == yearMonth2.getMonth() && localDate2.getYear() == yearMonth2.getYear();
            } else {
                z2 = false;
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(u291.k(qim0Var3, 240.0f), 1.0f);
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = r5r.e;
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarF, false, (iu30) objT);
            mbh mbhVarA = jbh.a(h36.f, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z5 = x340Var.S;
            Function0 function0 = hmb0.t1;
            if (z5) {
                x340Var.l(function0);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar3);
            nko1.H(xos0VarM, x340Var, lljVar2);
            x0d.q(iHashCode, x340Var, lljVar, x340Var);
            nko1.H(qim0VarE, x340Var, vu30Var);
            int i10 = yearMonth2.lengthOfMonth() + i9 > 35 ? 6 : 5;
            x340Var.i0(1814149134);
            int i11 = 0;
            int i12 = 0;
            while (i12 < i10) {
                int i13 = i11;
                qim0 qim0VarH = kx40.h(1.0f, u291.f(u291.b(0.0f, 48.0f, 1, qim0Var3), 1.0f), true);
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = r5r.f;
                    x340Var.s0(objT2);
                }
                qim0 qim0VarB2 = s161.b(qim0VarH, false, (iu30) objT2);
                int i14 = i10;
                jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB2);
                hzj.A.getClass();
                x340Var.m0();
                int i15 = i12;
                if (x340Var.S) {
                    x340Var.l(function0);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA, x340Var, lljVar3);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar, x340Var);
                nko1.H(qim0VarE2, x340Var, vu30Var);
                x340Var.i0(-460179138);
                int i16 = i8;
                int i17 = i13;
                int i18 = 0;
                while (i18 < i16) {
                    pw31 pw31Var = pw31.a;
                    if (i17 < i9) {
                        x340Var.i0(914699439);
                        if (z) {
                            x340Var.i0(914725262);
                            op71.g(x340Var, pw31Var.a(1.0f, qim0Var3, true));
                            x340Var.r(false);
                            i6 = i7;
                            c = 0;
                            i3 = 7;
                            z4 = false;
                        } else {
                            x340Var.i0(914808621);
                            YearMonth yearMonthMinusMonths = yearMonth2.minusMonths(1L);
                            LocalDate localDateAtDay = yearMonthMinusMonths.atDay(yearMonthMinusMonths.lengthOfMonth() - ((i9 - i17) - 1));
                            qim0 qim0VarA = pw31Var.a(1.0f, qim0Var3, true);
                            localDateAtDay.getClass();
                            boolean zI = ((i7 & 7168) == 2048) | x340Var.i(localDateAtDay);
                            Object objT3 = x340Var.T();
                            if (zI || objT3 == m4cVar) {
                                z3 = false;
                                objT3 = new b7r(iu30Var, localDateAtDay, (byte) 0);
                                x340Var.s0(objT3);
                            } else {
                                z3 = false;
                            }
                            i6 = i7;
                            c = 0;
                            i3 = 7;
                            z4 = z3;
                            e(localDateAtDay, x6rVar, (Function0) objT3, qim0VarA, false, x340Var, (i7 << 3) & 112, 16);
                            x340Var.r(z4);
                        }
                        x340Var.r(z4);
                        i17 = i17;
                        yearMonth = yearMonth2;
                        i4 = i6;
                    } else {
                        int i19 = i7;
                        i9 = i9;
                        YearMonth yearMonth3 = yearMonth2;
                        i18 = i18;
                        function0 = function0;
                        vu30Var = vu30Var;
                        i3 = 7;
                        qim0Var3 = qim0Var3;
                        if (i17 > (yearMonth3.lengthOfMonth() + i9) - 1) {
                            x340Var.i0(915273528);
                            if (z2) {
                                x340Var.i0(915298638);
                                op71.g(x340Var, pw31Var.a(1.0f, qim0Var3, true));
                                x340Var.r(false);
                                yearMonth = yearMonth3;
                                i5 = i19;
                            } else {
                                x340Var.i0(915381749);
                                LocalDate localDateAtDay2 = yearMonth3.plusMonths(1L).atDay(i17 - ((yearMonth3.lengthOfMonth() + i9) - 1));
                                qim0 qim0VarA2 = pw31Var.a(1.0f, qim0Var3, true);
                                localDateAtDay2.getClass();
                                boolean zI2 = ((i19 & 7168) == 2048) | x340Var.i(localDateAtDay2);
                                Object objT4 = x340Var.T();
                                if (zI2 || objT4 == m4cVar) {
                                    objT4 = new b7r(iu30Var, localDateAtDay2, (byte) 1);
                                    x340Var.s0(objT4);
                                }
                                yearMonth = yearMonth3;
                                i5 = i19;
                                e(localDateAtDay2, x6rVar, (Function0) objT4, qim0VarA2, false, x340Var, (i19 << 3) & 112, 16);
                                x340Var.r(false);
                            }
                            x340Var.r(false);
                            i4 = i5;
                        } else {
                            i17 = i17;
                            yearMonth = yearMonth3;
                            x340Var.i0(915775883);
                            LocalDate localDateAtDay3 = yearMonth.atDay((i17 - i9) + 1);
                            qim0 qim0VarA3 = pw31Var.a(1.0f, qim0Var3, true);
                            localDateAtDay3.getClass();
                            boolean zEquals = localDateAtDay3.equals(LocalDate.now((Clock) o0g1Var.d));
                            boolean zI3 = ((i19 & 7168) == 2048) | x340Var.i(localDateAtDay3);
                            Object objT5 = x340Var.T();
                            if (zI3 || objT5 == m4cVar) {
                                objT5 = new b7r(iu30Var, localDateAtDay3, (byte) 2);
                                x340Var.s0(objT5);
                            }
                            i4 = i19;
                            e(localDateAtDay3, x6rVar, (Function0) objT5, qim0VarA3, zEquals, x340Var, (i19 << 3) & 112, 0);
                            x340Var.r(false);
                        }
                    }
                    i17++;
                    i18++;
                    qim0Var3 = qim0Var3;
                    yearMonth2 = yearMonth;
                    i9 = i9;
                    vu30Var = vu30Var;
                    i16 = i3;
                    i7 = i4;
                    function0 = function0;
                }
                int i20 = i16;
                int i21 = i17;
                x340Var.r(false);
                x340Var.r(true);
                i12 = i15 + 1;
                i9 = i9;
                vu30Var = vu30Var;
                i10 = i14;
                i11 = i21;
                function0 = function0;
                i8 = i20;
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
            h311VarV.d = new m5r(i, x6rVar, o0g1Var, qim0Var2, iu30Var, (byte) 1);
        }
    }

    public static final void o(o0g1 o0g1Var, x6r x6rVar, YearMonth yearMonth, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        qim0 qim0Var2;
        max haxVar;
        boolean z;
        max maxVar;
        s6r s6rVar = x6rVar.b;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1062372947);
        j06 j06Var = x340Var2.a;
        if ((i & 6) == 0) {
            i2 = (x340Var2.i(o0g1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(x6rVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(yearMonth) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var2.i(function1) ? 16384 : 8192;
        }
        int i3 = i2 | 196608;
        if (x340Var2.Y(i3 & 1, (74899 & i3) != 74898)) {
            String str = (String) ((ArrayList) o0g1Var.f).get(yearMonth.getMonthValue() - 1);
            int year = yearMonth.getYear();
            LocalDate localDate = s6rVar.a;
            boolean z2 = localDate == null || yearMonth.atDay(1).compareTo(localDate) > 0;
            LocalDate localDate2 = s6rVar.b;
            boolean z3 = localDate2 == null || yearMonth.atEndOfMonth().compareTo(localDate2) < 0;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(u291.b(0.0f, 48.0f, 1, qim0Var3), 1.0f);
            boolean z4 = z3;
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z5 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z5) {
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
            String strO0 = cwl1.o0(x340Var2, 2131954838);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function1);
            ldx ldxVar = ldx.c;
            qim0 qim0VarN = anm1.N("prev_month_button", qim0Var3);
            max maxVar2 = jax.a;
            if (z2) {
                x340Var2.i0(2058353769);
                x340Var2.r(false);
                z = false;
                haxVar = maxVar2;
            } else {
                x340Var2.i0(2058403555);
                haxVar = new hax(cwl1.o0(x340Var2, 2131954839));
                z = false;
                x340Var2.r(false);
            }
            boolean z6 = z;
            wro1.h(gbxVar, ldxVar, qim0VarN, haxVar, yla.p(x340Var2), null, false, null, null, shi.a, x340Var2, 0, 6, 968);
            gfh0 gfh0VarC = t1c.c(een.h, z6);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0Var3);
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
            String str2 = str + " " + year;
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var2).h;
            Object objT = x340Var2.T();
            if (objT == fkj0.X) {
                objT = r5r.g;
                x340Var2.s0(objT);
            }
            uwo1.e(str2, s161.b(qim0Var3, z6, (iu30) objT), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2040);
            x340Var2.r(true);
            String strO1 = cwl1.o0(x340Var2, 2131954836);
            if (ihc1.y0(strO1)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar2 = new gbx(new y50(strO1), function0);
            gdx gdxVarP = yla.p(x340Var2);
            qim0 qim0VarN2 = anm1.N("next_month_button", qim0Var3);
            if (z4) {
                x340Var2.i0(2059287241);
                x340Var2.r(z6);
                maxVar = maxVar2;
            } else {
                x340Var2.i0(2059336903);
                max haxVar2 = new hax(cwl1.o0(x340Var2, 2131954837));
                x340Var2.r(z6);
                maxVar = haxVar2;
            }
            wro1.h(gbxVar2, ldxVar, qim0VarN2, maxVar, gdxVarP, null, false, null, null, shi.b, x340Var2, 0, 6, 968);
            x340Var = x340Var2;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wc0(o0g1Var, x6rVar, yearMonth, function0, function1, qim0Var2, i, (byte) 15);
        }
    }

    public static final void p(boolean z, q1v q1vVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1615704234);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.e(q1vVar.ordinal()) ? 32 : 16);
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.b0();
        } else if (z) {
            x340Var.i0(253795671);
            y1a1.e(false, (qim0) null, apo.r(1893524840, new ps11(q1vVar, (byte) 4), x340Var), x340Var, 390, 2);
            x340Var.r(false);
        } else {
            x340Var.i0(254184876);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kf2(z, (Object) q1vVar, i, (byte) 21);
        }
    }

    public static final void q(boolean z, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-893213150);
        int i2 = (x340Var.h(z) ? 4 : 2) | i;
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.b0();
        } else if (z) {
            x340Var.i0(1904514808);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = ou11.P0;
                x340Var.s0(objT);
            }
            qim0 qim0VarA = s161.a(nim0.a, (iu30) objT);
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
            ktd.s(j2iVar, x340Var, 6, true, false);
        } else {
            x340Var.i0(1904590541);
            j2iVar.invoke(x340Var, 6);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ok6((byte) 6, i, j2iVar, z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b8  */
    public static final void r(r9d1 r9d1Var, iu30 iu30Var, boolean z, boolean z2, boolean z3, j2i j2iVar, b0k b0kVar, int i) {
        ks11 ks11Var;
        n9d1 n9d1Var;
        ks11 ks11Var2;
        n9d1 n9d1Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1858754158);
        int i2 = i | (x340Var.i(r9d1Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.h(z2) ? 2048 : 1024) | (x340Var.h(z3) ? 16384 : 8192);
        if (!x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            x340Var.b0();
        } else if (z) {
            x340Var.i0(868499989);
            if (r9d1Var != null) {
                ks11Var = r9d1Var.a;
                if (!z2) {
                    ks11Var = null;
                }
            } else {
                ks11Var = null;
            }
            if (ks11Var == null) {
                x340Var.i0(868633722);
                x340Var.r(false);
                n9d1Var = null;
            } else {
                x340Var.i0(868633723);
                boolean z4 = (i2 & 112) == 32;
                Object objT = x340Var.T();
                if (z4 || objT == m4cVar) {
                    objT = new dv11(iu30Var, (byte) 1);
                    x340Var.s0(objT);
                }
                n9d1Var = new n9d1(1, (Function0) objT, ks11Var.a);
                x340Var.r(false);
            }
            if (r9d1Var != null) {
                ks11Var2 = r9d1Var.b;
                if (!z3) {
                    ks11Var2 = null;
                }
            } else {
                ks11Var2 = null;
            }
            if (ks11Var2 == null) {
                x340Var.i0(868940281);
                x340Var.r(false);
                n9d1Var2 = null;
            } else {
                x340Var.i0(868940282);
                boolean z5 = (i2 & 112) == 32;
                Object objT2 = x340Var.T();
                if (z5 || objT2 == m4cVar) {
                    objT2 = new dv11(iu30Var, (byte) 2);
                    x340Var.s0(objT2);
                }
                n9d1Var2 = new n9d1(1, (Function0) objT2, ks11Var2.a);
                x340Var.r(false);
            }
            puo1.c(null, n9d1Var, n9d1Var2, true, apo.r(-1443290793, new j2r0(j2iVar, (byte) 7), x340Var), x340Var, 27648, 1);
            x340Var.r(false);
        } else {
            x340Var.i0(869178269);
            j2iVar.invoke(x340Var, 6);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new z96(r9d1Var, iu30Var, z, z2, z3, j2iVar, i, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    public static final void s(c380 c380Var, boolean z, iix0 iix0Var, long j, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-508889831);
        int i2 = (x340Var.g(c380Var) ? 4 : 2) | i | (x340Var.h(z) ? 32 : 16) | (x340Var.i(iix0Var) ? 256 : 128) | (x340Var.f(j) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            if (!z || c380Var.isEmpty() || iix0Var == null) {
                x340Var.i0(897908073);
                x340Var.r(false);
            } else {
                if (!(iix0Var instanceof gix0)) {
                    if (!(iix0Var instanceof hix0)) {
                        eg.o();
                        return;
                    }
                    hix0 hix0Var = (hix0) iix0Var;
                    if (hix0Var.b <= 0 && !hix0Var.a) {
                        x340Var.i0(897908073);
                        x340Var.r(false);
                    }
                }
                x340Var.i0(897875399);
                C(j, x340Var, (i2 >> 9) & 14);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mx9(c380Var, z, iix0Var, j, i);
        }
    }

    public static final void t(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1721133410);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131961054);
            boolean zG = x340Var.g(strO0);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new q4z0(strO0, (byte) 20);
                x340Var.s0(objT);
            }
            bo01.a(s161.b(qim0Var, false, (iu30) objT), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nws0(qim0Var, i, (byte) 15);
        }
    }

    public static final void u(String str, n6u n6uVar, boolean z, u37 u37Var, o27 o27Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        fwx fwxVarG;
        fwx fwxVarG2;
        ltx ltxVar;
        ltx ltxVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-676760939);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(n6uVar) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.e(u37Var == null ? -1 : u37Var.ordinal()) ? 2048 : 1024) | (x340Var.g(o27Var) ? 16384 : 8192) | 196608;
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            if (z || u890.j(n6uVar, m6u.a)) {
                x340Var.i0(-1827189689);
                fwxVarG = hso1.G(box.c, 0L, 0L, x340Var, box.d, 30);
                x340Var.r(false);
            } else if (str == null) {
                x340Var.i0(-1827186909);
                int iC = l1d.C(o27Var.b);
                if (iC == 0 || iC == 1) {
                    ltxVar2 = box.c;
                } else {
                    if (iC != 2) {
                        eg.o();
                        return;
                    }
                    ltxVar2 = ltx.c;
                }
                fwxVarG = hso1.G(ltxVar2, 0L, 0L, x340Var, 8, 30);
                x340Var.r(false);
            } else {
                x340Var.i0(-1827183416);
                Uri uri = Uri.parse(str);
                if (o27Var.b != 1) {
                    x340Var.i0(-807970399);
                    int iC2 = l1d.C(o27Var.b);
                    if (iC2 == 0 || iC2 == 1) {
                        ltxVar = box.c;
                    } else {
                        if (iC2 != 2) {
                            eg.o();
                            return;
                        }
                        ltxVar = ltx.c;
                    }
                    fwxVarG2 = hso1.G(ltxVar, 0L, 0L, x340Var, 8, 30);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-807859605);
                    x340Var.r(false);
                    fwxVarG2 = null;
                }
                fwxVarG = oi7.a(uri, (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, fwxVarG2, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, x340Var, 2097152, 0, 131006);
                x340Var = x340Var;
                x340Var.r(false);
            }
            boolean z2 = !u890.j(n6uVar, j6u.a);
            qim0 qim0Var3 = nim0.a;
            x340 x340Var2 = x340Var;
            eso1.h(fwxVarG, isl.a, pqo.h(qim0Var3, z2), W(o27Var.a, u37Var, x340Var), (zvx) null, P((i2 >> 9) & 14, u37Var, x340Var), (j6m) null, (tl3) null, (ColorFilter) null, x340Var2, 56, 464);
            x340Var = x340Var2;
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wr1(str, (Object) n6uVar, z, (Object) u37Var, (Object) o27Var, (Object) qim0Var2, i, (byte) 21);
        }
    }

    public static final void v(int i, b0k b0kVar, c380 c380Var, boolean z) {
        b0k b0kVar2;
        h311 h311VarV;
        iv11 iv11Var;
        lee1 lee1Var;
        long j;
        long j2;
        zma1 zma1Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1198371114);
        int i2 = (b0kVar3.i(c380Var) ? 4 : 2) | i | (b0kVar3.h(z) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            if (c380Var.isEmpty()) {
                h311VarV = b0kVar3.v();
                if (h311VarV == null) {
                    return;
                } else {
                    iv11Var = new iv11(c380Var, z, i, (byte) 0);
                }
            } else {
                uwr uwrVar = cbx.a;
                lee1 lee1Var2 = cbx.d(b0kVar3).j;
                zma1 zma1Var2 = lee1Var2.a;
                lee1 lee1Var3 = cbx.d(b0kVar3).k;
                long j3 = cbx.a(b0kVar3).b.b;
                long j4 = cbx.a(b0kVar3).b.c;
                boolean zF = ((i2 & 14) == 4 || b0kVar3.g(c380Var)) | b0kVar3.f(zma1Var2.b) | b0kVar3.g(lee1Var3) | b0kVar3.f(j3) | b0kVar3.f(j4);
                Object objT = b0kVar3.T();
                if (zF || objT == fkj0.X) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    ye5 ye5Var = new ye5();
                    Iterator it = c380Var.iterator();
                    int i3 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            p7h.T();
                            throw null;
                        }
                        x9w0 x9w0Var = (x9w0) next;
                        lee1 lee1Var4 = lee1Var2;
                        boolean z2 = x9w0Var.c;
                        Iterator it2 = it;
                        hux huxVar = x9w0Var.b;
                        long j5 = z2 ? j4 : j3;
                        if (i3 > 0) {
                            j2 = j3;
                            if (((x9w0) c380Var.get(i3 - 1)).c == z2) {
                                int iO = ye5Var.o(new zma1(j5, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                                try {
                                    ye5Var.g(" • ");
                                    ye5Var.k(iO);
                                } catch (Throwable th) {
                                    ye5Var.k(iO);
                                    throw th;
                                }
                            } else {
                                ye5Var.g(" • ");
                            }
                        } else {
                            j2 = j3;
                        }
                        if (huxVar != null) {
                            String str = "leadingIconId" + i3;
                            z6p1.r(ye5Var, str, "�");
                            ye5Var.g(" ");
                            long j6 = zma1Var2.b;
                            linkedHashMap.put(str, new gh80(new d6t0(4, j6, j6), new j2i(-2120194507, new p7g0(huxVar, j5, (byte) 2), true)));
                        }
                        if (z2) {
                            zma1 zma1Var3 = lee1Var3.a;
                            zma1Var = new zma1(j5, 0L, zma1Var3.c, (FontStyle) null, (FontSynthesis) null, zma1Var3.f, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65498);
                        } else {
                            zma1Var = new zma1(j5, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534);
                        }
                        int iO2 = ye5Var.o(zma1Var);
                        try {
                            ye5Var.g(x9w0Var.a);
                            ye5Var.k(iO2);
                            lee1Var2 = lee1Var4;
                            i3 = i4;
                            it = it2;
                            j3 = j2;
                            j4 = j4;
                            zma1Var2 = zma1Var2;
                        } catch (Throwable th2) {
                            ye5Var.k(iO2);
                            throw th2;
                        }
                    }
                    lee1Var = lee1Var2;
                    j = j3;
                    objT = new mmr0(ye5Var.p(), mqo1.G(linkedHashMap));
                    b0kVar3.s0(objT);
                } else {
                    lee1Var = lee1Var2;
                    j = j3;
                }
                mmr0 mmr0Var = (mmr0) objT;
                b0kVar2 = b0kVar3;
                uwo1.d((af5) mmr0Var.a, j, pqo.h(nim0.a, z), lee1Var, null, null, 0, false, new cjc0(1), 0, null, (cqs0) mmr0Var.b, b0kVar2, 0, 0, 1776);
            }
            h311VarV.d = iv11Var;
        }
        b0kVar2 = b0kVar3;
        b0kVar2.b0();
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            iv11Var = new iv11(c380Var, z, i, (byte) 1);
            h311VarV.d = iv11Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:176:0x0283  */
    /* JADX WARN: Code duplicated, block: B:177:0x028c  */
    /* JADX WARN: Code duplicated, block: B:179:0x0292  */
    /* JADX WARN: Code duplicated, block: B:180:0x0295  */
    /* JADX WARN: Code duplicated, block: B:182:0x0299  */
    /* JADX WARN: Code duplicated, block: B:183:0x029c  */
    /* JADX WARN: Code duplicated, block: B:185:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:186:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:193:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:199:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:202:0x02de  */
    /* JADX WARN: Code duplicated, block: B:204:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:207:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:208:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:210:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:211:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:216:0x0307  */
    /* JADX WARN: Code duplicated, block: B:218:0x030b  */
    /* JADX WARN: Code duplicated, block: B:219:0x030e  */
    /* JADX WARN: Code duplicated, block: B:224:0x0319  */
    /* JADX WARN: Code duplicated, block: B:229:0x0323  */
    /* JADX WARN: Code duplicated, block: B:231:0x0327  */
    /* JADX WARN: Code duplicated, block: B:233:0x0355  */
    /* JADX WARN: Code duplicated, block: B:235:0x035c  */
    /* JADX WARN: Code duplicated, block: B:236:0x0362  */
    /* JADX WARN: Code duplicated, block: B:238:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:240:0x03fd  */
    public static final void w(uu11 uu11Var, jmb1 jmb1Var, c380 c380Var, c380 c380Var2, iu30 iu30Var, boolean z, boolean z2, vu30 vu30Var, vu30 vu30Var2, vu30 vu30Var3, vu30 vu30Var4, c380 c380Var3, boolean z3, iu30 iu30Var2, qim0 qim0Var, o27 o27Var, boolean z4, boolean z5, boolean z6, j2i j2iVar, int i, yt11 yt11Var, ppc1 ppc1Var, vu30 vu30Var5, vu30 vu30Var6, boolean z7, String str, w5w0 w5w0Var, b0k b0kVar, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        b0k b0kVar2;
        boolean z8;
        vu30 vu30Var7;
        vu30 vu30Var8;
        boolean z9;
        String str2;
        w5w0 w5w0Var2;
        boolean z10;
        String str3;
        vu30 vu30Var9;
        w5w0 w5w0Var3;
        sz6 sz6Var;
        boolean z11;
        sz6 sz6Var2;
        String str4;
        sz6 sz6Var3;
        u37 u37Var;
        String strO0;
        String str5;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean zC0;
        s9d1 s9d1VarB;
        u37 u37Var2;
        r9d1 r9d1Var;
        ks11 ks11Var;
        boolean z15;
        ks11 ks11Var2;
        boolean z16;
        boolean z17;
        vu30 vu30Var10;
        w5w0 w5w0Var4;
        r9d1 r9d1Var2;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        nim0 nim0Var;
        qim0 qim0VarE;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1348942653);
        int i10 = i2 | (b0kVar3.g(uu11Var) ? 4 : 2) | (b0kVar3.i(jmb1Var) ? 32 : 16) | (b0kVar3.g(c380Var) ? 256 : 128) | (b0kVar3.i(c380Var2) ? 2048 : 1024) | (b0kVar3.i(iu30Var) ? 16384 : 8192);
        if ((i2 & 196608) == 0) {
            i10 |= b0kVar3.h(z) ? 131072 : 65536;
        }
        int i11 = i10 | (b0kVar3.h(z2) ? 1048576 : 524288) | (b0kVar3.i(vu30Var) ? 8388608 : 4194304) | (b0kVar3.i(vu30Var2) ? 67108864 : 33554432) | (b0kVar3.i(vu30Var3) ? 536870912 : 268435456);
        int i12 = 0 | (b0kVar3.i(vu30Var4) ? (char) 4 : (char) 2) | (b0kVar3.g(c380Var3) ? 32 : 16) | (b0kVar3.h(z3) ? 256 : 128) | (b0kVar3.i(iu30Var2) ? 2048 : 1024) | (b0kVar3.i(qim0Var) ? 16384 : 8192) | (b0kVar3.g(o27Var) ? 131072 : 65536) | (b0kVar3.h(z4) ? 1048576 : 524288);
        int i13 = i3 & 131072;
        if (i13 != 0) {
            i4 = i12 | 12582912;
        } else {
            i4 = i12 | (b0kVar3.h(z5) ? 8388608 : 4194304);
        }
        int i14 = i4 | (b0kVar3.h(z6) ? 67108864 : 33554432);
        int i15 = (b0kVar3.e(i == 0 ? -1 : l1d.C(i)) ? (char) 4 : (char) 2) | (b0kVar3.g(yt11Var) ? ' ' : (char) 16) | (b0kVar3.g(ppc1Var) ? 256 : 128);
        int i16 = i3 & 8388608;
        if (i16 != 0) {
            i5 = i15 | 3072;
        } else {
            i5 = i15 | (b0kVar3.i(vu30Var5) ? (char) 2048 : (char) 1024);
        }
        int i17 = i3 & 16777216;
        if (i17 != 0) {
            i6 = i5 | 24576;
        } else {
            i6 = i5 | (b0kVar3.i(vu30Var6) ? (char) 16384 : (char) 8192);
        }
        int i18 = i3 & 33554432;
        if (i18 != 0) {
            i7 = i6 | 196608;
        } else {
            i7 = i6 | (b0kVar3.h(z7) ? (char) 0 : (char) 0);
        }
        int i19 = i3 & 67108864;
        if (i19 != 0) {
            i8 = i7 | 1572864;
        } else {
            i8 = i7 | (b0kVar3.g(str) ? (char) 0 : (char) 0);
        }
        int i20 = i3 & 134217728;
        if (i20 != 0) {
            i9 = i8 | 12582912;
        } else {
            i9 = i8 | (b0kVar3.g(w5w0Var) ? (char) 0 : (char) 0);
        }
        if (b0kVar3.Y(i11 & 1, ((i11 & 306783379) == 306783378 && (i14 & 306783379) == 306783378 && (i9 & 4793491) == 4793490) ? false : true)) {
            b0kVar3.d0();
            if ((i2 & 1) == 0 || b0kVar3.E()) {
                boolean z18 = i13 != 0 ? false : z5;
                vu30 vu30Var11 = i16 != 0 ? null : vu30Var5;
                vu30 vu30Var12 = i17 != 0 ? null : vu30Var6;
                boolean z19 = i18 != 0 ? false : z7;
                String str6 = i19 != 0 ? null : str;
                if (i20 != 0) {
                    z10 = z18;
                    str3 = str6;
                    z9 = z19;
                    w5w0Var3 = u5w0.a;
                    vu30Var7 = vu30Var11;
                    vu30Var9 = vu30Var12;
                } else {
                    z10 = z18;
                    str3 = str6;
                    vu30Var9 = vu30Var12;
                    z9 = z19;
                    vu30Var7 = vu30Var11;
                }
                b0kVar3.s();
                sz6Var = jmb1Var.b.l;
                z11 = sz6Var instanceof sz6;
                if (z11) {
                    sz6Var2 = sz6Var;
                } else {
                    sz6Var2 = null;
                }
                if (sz6Var2 != null) {
                    str4 = sz6Var2.c;
                } else {
                    str4 = null;
                }
                if (z11) {
                    sz6Var3 = sz6Var;
                } else {
                    sz6Var3 = null;
                }
                if (sz6Var3 != null) {
                    u37Var = sz6Var3.d;
                } else {
                    u37Var = null;
                }
                strO0 = cwl1.o0(b0kVar3, 2131954295);
                str5 = str4;
                z12 = !u890.j(ppc1Var, npc1.a);
                if (!c0(jmb1Var, z2, c380Var, z12, vu30Var) || (c380Var.isEmpty() && !z2)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (c380Var.isEmpty() || z2) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zC0 = c0(jmb1Var, z2, c380Var, z12, vu30Var);
                if (yt11Var != null) {
                    s9d1VarB = yt11Var.b();
                } else {
                    s9d1VarB = null;
                }
                u37Var2 = u37Var;
                if (s9d1VarB instanceof r9d1) {
                    r9d1Var = (r9d1) s9d1VarB;
                } else {
                    r9d1Var = null;
                }
                if (r9d1Var != null) {
                    ks11Var = r9d1Var.b;
                } else {
                    ks11Var = null;
                }
                if (ks11Var == null && jmb1Var.k) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (r9d1Var != null) {
                    ks11Var2 = r9d1Var.a;
                } else {
                    ks11Var2 = null;
                }
                if (ks11Var2 == null && jmb1Var.l) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (!z16 || z15) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (z10) {
                    b0kVar3.i0(1673361382);
                    r9d1Var2 = r9d1Var;
                    mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
                    iHashCode = Long.hashCode(((x340) b0kVar3).T);
                    xos0VarM = b0kVar3.m();
                    nim0Var = nim0.a;
                    qim0VarE = zr7.E(b0kVar3, nim0Var);
                    hzj.A.getClass();
                    if (((x340) b0kVar3).a != null) {
                        tgp1.p();
                        throw null;
                    }
                    b0kVar3.m0();
                    if (((x340) b0kVar3).S) {
                        b0kVar3.l(hmb0.t1);
                    } else {
                        b0kVar3.v0();
                    }
                    nko1.H(mbhVarA, b0kVar3, y580.O0);
                    nko1.H(xos0VarM, b0kVar3, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
                    nko1.F(b0kVar3);
                    nko1.H(qim0VarE, b0kVar3, y580.Y);
                    w5w0 w5w0Var5 = w5w0Var3;
                    kv11 kv11Var = new kv11(w5w0Var5, u37Var2, o27Var, ppc1Var, jmb1Var, z14, z6, z12, zC0, uu11Var, i, str3, qim0Var, strO0, iu30Var, str5, z, c380Var2, vu30Var9, c380Var3, vu30Var3, vu30Var4, z13, vu30Var7, vu30Var2, z9, c380Var, z2, z4, j2iVar, vu30Var, z3);
                    vu30Var10 = vu30Var9;
                    b0kVar2 = b0kVar3;
                    w5w0Var4 = w5w0Var5;
                    r(r9d1Var2, iu30Var2, z17, z16, z15, apo.r(1342479558, kv11Var, b0kVar2), b0kVar2, 196608);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(b0kVar2).b;
                    rqo1.g(0, 0, b0kVar2, anm1.N("release_row_bottom_divider", uyn1.z(16.0f, 0.0f, 2, nim0Var)));
                    b0kVar2.r(true);
                    b0kVar2.r(false);
                } else {
                    r9d1 r9d1Var3 = r9d1Var;
                    vu30 vu30Var13 = vu30Var9;
                    w5w0 w5w0Var6 = w5w0Var3;
                    b0kVar3.i0(1673576770);
                    kv11 kv11Var2 = new kv11(w5w0Var6, u37Var2, o27Var, ppc1Var, jmb1Var, z14, z6, z12, zC0, uu11Var, i, str3, qim0Var, strO0, iu30Var, str5, z, c380Var2, vu30Var13, c380Var3, vu30Var3, vu30Var4, z13, vu30Var7, vu30Var2, z9, c380Var, z2, z4, j2iVar, vu30Var, z3);
                    vu30Var10 = vu30Var13;
                    b0kVar2 = b0kVar3;
                    w5w0Var4 = w5w0Var6;
                    r(r9d1Var3, iu30Var2, z17, z16, z15, apo.r(1342479558, kv11Var2, b0kVar2), b0kVar2, 196608);
                    b0kVar2.r(false);
                }
                str2 = str3;
                vu30Var8 = vu30Var10;
                w5w0Var2 = w5w0Var4;
                z8 = z10;
            } else {
                b0kVar3.b0();
                z10 = z5;
                vu30Var7 = vu30Var5;
                vu30Var9 = vu30Var6;
                z9 = z7;
                str3 = str;
            }
            w5w0Var3 = w5w0Var;
            b0kVar3.s();
            sz6Var = jmb1Var.b.l;
            z11 = sz6Var instanceof sz6;
            if (z11) {
                sz6Var2 = sz6Var;
            } else {
                sz6Var2 = null;
            }
            if (sz6Var2 != null) {
                str4 = sz6Var2.c;
            } else {
                str4 = null;
            }
            if (z11) {
                sz6Var3 = sz6Var;
            } else {
                sz6Var3 = null;
            }
            if (sz6Var3 != null) {
                u37Var = sz6Var3.d;
            } else {
                u37Var = null;
            }
            strO0 = cwl1.o0(b0kVar3, 2131954295);
            str5 = str4;
            z12 = !u890.j(ppc1Var, npc1.a);
            if (c0(jmb1Var, z2, c380Var, z12, vu30Var)) {
                z13 = false;
            } else {
                z13 = false;
            }
            if (c380Var.isEmpty()) {
                z14 = true;
            } else {
                z14 = true;
            }
            zC0 = c0(jmb1Var, z2, c380Var, z12, vu30Var);
            if (yt11Var != null) {
                s9d1VarB = yt11Var.b();
            } else {
                s9d1VarB = null;
            }
            u37Var2 = u37Var;
            if (s9d1VarB instanceof r9d1) {
                r9d1Var = (r9d1) s9d1VarB;
            } else {
                r9d1Var = null;
            }
            if (r9d1Var != null) {
                ks11Var = r9d1Var.b;
            } else {
                ks11Var = null;
            }
            if (ks11Var == null) {
                z15 = false;
            } else {
                z15 = false;
            }
            if (r9d1Var != null) {
                ks11Var2 = r9d1Var.a;
            } else {
                ks11Var2 = null;
            }
            if (ks11Var2 == null) {
                z16 = false;
            } else {
                z16 = false;
            }
            if (z16) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (z10) {
                b0kVar3.i0(1673361382);
                r9d1Var2 = r9d1Var;
                mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
                iHashCode = Long.hashCode(((x340) b0kVar3).T);
                xos0VarM = b0kVar3.m();
                nim0Var = nim0.a;
                qim0VarE = zr7.E(b0kVar3, nim0Var);
                hzj.A.getClass();
                if (((x340) b0kVar3).a != null) {
                    tgp1.p();
                    throw null;
                }
                b0kVar3.m0();
                if (((x340) b0kVar3).S) {
                    b0kVar3.l(hmb0.t1);
                } else {
                    b0kVar3.v0();
                }
                nko1.H(mbhVarA, b0kVar3, y580.O0);
                nko1.H(xos0VarM, b0kVar3, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
                nko1.F(b0kVar3);
                nko1.H(qim0VarE, b0kVar3, y580.Y);
                w5w0 w5w0Var7 = w5w0Var3;
                kv11 kv11Var3 = new kv11(w5w0Var7, u37Var2, o27Var, ppc1Var, jmb1Var, z14, z6, z12, zC0, uu11Var, i, str3, qim0Var, strO0, iu30Var, str5, z, c380Var2, vu30Var9, c380Var3, vu30Var3, vu30Var4, z13, vu30Var7, vu30Var2, z9, c380Var, z2, z4, j2iVar, vu30Var, z3);
                vu30Var10 = vu30Var9;
                b0kVar2 = b0kVar3;
                w5w0Var4 = w5w0Var7;
                r(r9d1Var2, iu30Var2, z17, z16, z15, apo.r(1342479558, kv11Var3, b0kVar2), b0kVar2, 196608);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(b0kVar2).b;
                rqo1.g(0, 0, b0kVar2, anm1.N("release_row_bottom_divider", uyn1.z(16.0f, 0.0f, 2, nim0Var)));
                b0kVar2.r(true);
                b0kVar2.r(false);
            } else {
                r9d1 r9d1Var4 = r9d1Var;
                vu30 vu30Var14 = vu30Var9;
                w5w0 w5w0Var8 = w5w0Var3;
                b0kVar3.i0(1673576770);
                kv11 kv11Var4 = new kv11(w5w0Var8, u37Var2, o27Var, ppc1Var, jmb1Var, z14, z6, z12, zC0, uu11Var, i, str3, qim0Var, strO0, iu30Var, str5, z, c380Var2, vu30Var14, c380Var3, vu30Var3, vu30Var4, z13, vu30Var7, vu30Var2, z9, c380Var, z2, z4, j2iVar, vu30Var, z3);
                vu30Var10 = vu30Var14;
                b0kVar2 = b0kVar3;
                w5w0Var4 = w5w0Var8;
                r(r9d1Var4, iu30Var2, z17, z16, z15, apo.r(1342479558, kv11Var4, b0kVar2), b0kVar2, 196608);
                b0kVar2.r(false);
            }
            str2 = str3;
            vu30Var8 = vu30Var10;
            w5w0Var2 = w5w0Var4;
            z8 = z10;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            z8 = z5;
            vu30Var7 = vu30Var5;
            vu30Var8 = vu30Var6;
            z9 = z7;
            str2 = str;
            w5w0Var2 = w5w0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new jv11(uu11Var, jmb1Var, c380Var, c380Var2, iu30Var, z, z2, vu30Var, vu30Var2, vu30Var3, vu30Var4, c380Var3, z3, iu30Var2, qim0Var, o27Var, z4, z8, z6, j2iVar, i, yt11Var, ppc1Var, vu30Var7, vu30Var8, z9, str2, w5w0Var2, i2, i3);
        }
    }

    public static final void x(vu30 vu30Var, j2i j2iVar, String str, n4m n4mVar, bv11 bv11Var, q1v q1vVar, c380 c380Var, boolean z, iix0 iix0Var, boolean z2, boolean z3, qim0 qim0Var, boolean z4, vu30 vu30Var2, b0k b0kVar, int i) {
        vu30 vu30Var3;
        x340 x340Var;
        boolean z5;
        boolean z6;
        boolean z7;
        vu30 vu30Var4;
        boolean z8;
        boolean z9 = z2;
        gra graVar = een.d;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(857472193);
        j06 j06Var = x340Var2.a;
        int i2 = i | (x340Var2.i(vu30Var) ? 4 : 2) | (x340Var2.g(str) ? 256 : 128) | (x340Var2.e(n4mVar.ordinal()) ? 2048 : 1024) | (x340Var2.g(bv11Var) ? 16384 : 8192) | (x340Var2.e(q1vVar.ordinal()) ? 131072 : 65536) | (x340Var2.g(c380Var) ? 1048576 : 524288) | (x340Var2.h(z) ? 8388608 : 4194304) | (x340Var2.i(iix0Var) ? 67108864 : 33554432) | (x340Var2.h(z9) ? 536870912 : 268435456);
        if (x340Var2.Y(i2 & 1, ((i2 & 306783379) == 306783378 && (((((x340Var2.h(z3) ? (char) 4 : (char) 2) | (x340Var2.i(qim0Var) ? ' ' : (char) 16)) | (x340Var2.h(z4) ? (char) 256 : (char) 128)) | (x340Var2.i(vu30Var2) ? (char) 2048 : (char) 1024)) & 1171) == 1170) ? false : true)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z10 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z10) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            vu30 vu30Var5 = y580.Y;
            nko1.H(qim0VarE, x340Var2, vu30Var5);
            nim0 nim0Var = nim0.a;
            if (vu30Var == null) {
                x340Var2.i0(290448609);
                z6 = false;
                x340Var2.r(false);
                z5 = z2;
            } else {
                x340Var2.i0(290448610);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                z5 = z2;
                qim0 qim0VarF2 = u291.f(pqo.h(uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), z5), 1.0f);
                gfh0 gfh0VarC = t1c.c(graVar, false);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarF2);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(gfh0VarC, x340Var2, lljVar);
                nko1.H(xos0VarM2, x340Var2, lljVar2);
                x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE2, x340Var2, vu30Var5);
                vu30Var.invoke(x340Var2, 0);
                x340Var2.r(true);
                z6 = false;
                x340Var2.r(false);
            }
            if (str == null) {
                x340Var2.i0(290684829);
                x340Var2.r(z6);
                x340Var = x340Var2;
            } else {
                x340Var2.i0(290684830);
                boolean zG = x340Var2.g(str);
                Object objT = x340Var2.T();
                if (zG || objT == fkj0.X) {
                    objT = ihc1.c1(250, str);
                    x340Var2.s0(objT);
                }
                cjc0 cjc0Var = new cjc0(2);
                uwr uwrVar2 = cbx.a;
                lee1 lee1Var = cbx.d(x340Var2).j;
                long j = cbx.a(x340Var2).b.b;
                cvx cvxVar2 = cbx.b(x340Var2).b;
                uwo1.e((String) objT, u291.f(pqo.h(uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), z5), 1.0f), lee1Var, j, null, null, 2, false, cjc0Var, 0, null, x340Var2, 0, 0, 1712);
                x340Var = x340Var2;
                z6 = false;
                x340Var.r(false);
            }
            if (!c380Var.isEmpty() || z) {
                x340Var.i0(291194718);
                uwr uwrVar3 = cbx.a;
                z7 = z6;
                vu30Var4 = vu30Var5;
                z9 = z2;
                b3o1.j(cbx.d(x340Var).j, 0L, apo.r(168730052, new ov11(z9, c380Var, z, n4mVar, bv11Var, q1vVar, z3, z4, iix0Var, j2iVar), x340Var), x340Var, 384, 2);
                x340Var.r(z7);
            } else {
                x340Var.i0(292049047);
                x340Var.r(z6);
                vu30Var4 = vu30Var5;
                z7 = z6;
                z9 = z2;
            }
            if (vu30Var2 == null) {
                x340Var.i0(292075396);
                x340Var.r(z7);
                vu30Var3 = vu30Var2;
                z8 = true;
            } else {
                x340Var.i0(292075397);
                uwr uwrVar4 = cbx.a;
                cvx cvxVar3 = cbx.b(x340Var).b;
                qim0 qim0VarF3 = u291.f(pqo.h(uyn1.B(nim0Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), z9), 1.0f);
                gfh0 gfh0VarC2 = t1c.c(graVar, z7);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarF3);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar);
                nko1.H(xos0VarM3, x340Var, lljVar2);
                x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE3, x340Var, vu30Var4);
                vu30Var3 = vu30Var2;
                vu30Var3.invoke(x340Var, 0);
                z8 = true;
                x340Var.r(true);
                x340Var.r(z7);
            }
            x340Var.r(z8);
        } else {
            vu30Var3 = vu30Var2;
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pv11(vu30Var, j2iVar, str, n4mVar, bv11Var, q1vVar, c380Var, z, iix0Var, z9, z3, qim0Var, z4, vu30Var3, i);
        }
    }

    public static final void y(jmb1 jmb1Var, String str, vu30 vu30Var, w5w0 w5w0Var, boolean z, boolean z2, boolean z3, c380 c380Var, boolean z4, j2i j2iVar, boolean z5, boolean z6, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-25679546);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(jmb1Var) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.i(vu30Var) ? 256 : 128) | (x340Var.g(w5w0Var) ? 2048 : 1024) | (x340Var.h(z) ? 16384 : 8192) | (x340Var.h(z2) ? 131072 : 65536) | (x340Var.h(z3) ? 1048576 : 524288) | (x340Var.g(c380Var) ? 8388608 : 4194304) | (x340Var.h(z4) ? 67108864 : 33554432);
        if (x340Var.Y(i2 & 1, ((306783379 & i2) == 306783378 && (((x340Var.h(z5) ? (char) 4 : (char) 2) | (x340Var.h(z6) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            boolean z7 = z2 || z;
            xn70 xn70Var = jmb1Var.c;
            String str2 = xn70Var != null ? xn70Var.b : null;
            if (vu30Var == null || !z7) {
                String str3 = str2;
                if (vu30Var != null) {
                    x340Var.i0(-513272703);
                    us71.j((i2 >> 6) & 14, vu30Var, x340Var, false);
                } else {
                    x340Var.i0(-513239998);
                    z(w5w0Var, jmb1Var, str, str3, z, z2, z3, c380Var, z5, z4, j2iVar, z6, x340Var);
                    x340Var.r(false);
                }
            } else {
                x340Var.i0(-513479318);
                jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                nim0 nim0Var = nim0.a;
                qim0 qim0VarE = zr7.E(x340Var, nim0Var);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                boolean z8 = x340Var.S;
                n4k n4kVar = hmb0.t1;
                if (z8) {
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
                gra graVar = een.d;
                gfh0 gfh0VarC = t1c.c(graVar, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
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
                vu30Var.invoke(x340Var, Integer.valueOf((i2 >> 6) & 14));
                x340Var.r(true);
                wnb0 wnb0Var = new wnb0(1.0f, false);
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, wnb0Var);
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
                z(w5w0Var, jmb1Var, str, str2, z, z2, z3, c380Var, z5, z4, j2iVar, z6, x340Var);
                us71.m(x340Var, true, true, false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mv11(jmb1Var, str, vu30Var, w5w0Var, z, z2, z3, c380Var, z4, j2iVar, z5, z6, i);
        }
    }

    public static final void z(w5w0 w5w0Var, jmb1 jmb1Var, String str, String str2, boolean z, boolean z2, boolean z3, c380 c380Var, boolean z4, boolean z5, j2i j2iVar, boolean z6, b0k b0kVar) {
        bjc0 cjc0Var;
        if (u890.j(w5w0Var, u5w0.a)) {
            cjc0Var = bjc0.a;
        } else {
            if (!u890.j(w5w0Var, t5w0.a)) {
                eg.o();
                return;
            }
            cjc0Var = new cjc0(1);
        }
        B(str, cjc0Var, str2, jmb1Var.h, jmb1Var.b, jmb1Var.g, z, z2, z3, c380Var, !u890.j(jmb1Var.i, j6u.a), z4, jmb1Var.n, z5, jmb1Var.e, j2iVar, z6, b0kVar, 0);
    }
}
