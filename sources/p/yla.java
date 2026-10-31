package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.contentfilter.v1.ContentFilter;
import com.spotify.contentfilter.v1.ContentFilters;
import com.spotify.cosmos.util.proto.ImageGroup;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yla implements c290, Function, ypb0, hx30, BiFunction, Predicate, jdd1 {
    public static yla b;
    public final /* synthetic */ byte a;

    public yla(n891 n891Var, jpg0 jpg0Var, jpg0 jpg0Var2, jpg0 jpg0Var3, jpg0 jpg0Var4, jpg0 jpg0Var5) {
        this.a = (byte) 0;
    }

    public static final void l(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vgp0 vgp0Var = (vgp0) it.next();
            if (!linkedHashSet.add(vgp0Var.a())) {
                l1d.z("Duplicate ObservationConfig key: '", vgp0Var.a(), "'. Keys must be unique at the same level.");
            }
        }
    }

    public static void n() {
        if (b == null) {
            b = new yla((byte) 29);
        }
    }

    public static gdx p(b0k b0kVar) {
        uwr uwrVar = cbx.a;
        float f = cbx.b(b0kVar).b.c;
        cvx cvxVar = cbx.b(b0kVar).b;
        zzq0 zzq0Var = new zzq0(f, 8.0f, f, 8.0f);
        mta mtaVar = cbx.b(b0kVar).d;
        zov0 zov0Var = cbx.b(b0kVar).g;
        cvx cvxVar2 = cbx.b(b0kVar).b;
        cvx cvxVar3 = cbx.b(b0kVar).b;
        return new gdx(zzq0Var, 12.0f, 56.0f, 32.0f, 12.0f, lee1.a(cbx.d(b0kVar).e, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 3, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16744447));
    }

    public static String q(xvd0 xvd0Var) {
        if (xvd0Var instanceof wvd0) {
            return "notification_subscription_failed";
        }
        StringBuilder sb = new StringBuilder();
        String strR = rc11.a.b(xvd0Var.getClass()).r();
        if (strR != null) {
            int i = 0;
            int i2 = 0;
            while (i < strR.length()) {
                char cCharAt = strR.charAt(i);
                int i3 = i2 + 1;
                if (i2 == 0) {
                    sb.append(String.valueOf(cCharAt).toLowerCase(Locale.ROOT));
                } else if (i2 <= 0 || !Character.isUpperCase(cCharAt)) {
                    sb.append(cCharAt);
                } else {
                    sb.append("_");
                    sb.append(String.valueOf(cCharAt).toLowerCase(Locale.ROOT));
                }
                i++;
                i2 = i3;
            }
        }
        return sb.toString();
    }

    public static gdx r(b0k b0kVar) {
        uwr uwrVar = cbx.a;
        float f = cbx.b(b0kVar).b.b;
        cvx cvxVar = cbx.b(b0kVar).b;
        zzq0 zzq0Var = new zzq0(f, 8.0f, f, 8.0f);
        mta mtaVar = cbx.b(b0kVar).d;
        zov0 zov0Var = cbx.b(b0kVar).g;
        cvx cvxVar2 = cbx.b(b0kVar).b;
        cvx cvxVar3 = cbx.b(b0kVar).b;
        return new gdx(zzq0Var, 12.0f, 48.0f, 24.0f, 8.0f, lee1.a(cbx.d(b0kVar).h, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 3, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16744447));
    }

    public static gdx s(b0k b0kVar) {
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(b0kVar).b;
        cvx cvxVar2 = cbx.b(b0kVar).b;
        zzq0 zzq0Var = new zzq0(16.0f, 4.0f, 16.0f, 4.0f);
        mta mtaVar = cbx.b(b0kVar).d;
        zov0 zov0Var = cbx.b(b0kVar).g;
        cvx cvxVar3 = cbx.b(b0kVar).b;
        cvx cvxVar4 = cbx.b(b0kVar).b;
        return new gdx(zzq0Var, 8.0f, 32.0f, 16.0f, 8.0f, lee1.a(cbx.d(b0kVar).k, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 3, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16744447));
    }

    public static cen t(ImageGroup imageGroup) {
        return new cen(imageGroup.getStandardLink(), imageGroup.getSmallLink(), imageGroup.getLargeLink(), imageGroup.getXlargeLink());
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ad  */
    public Object apply(Object obj) {
        hj60 ej60Var;
        hj60 gj60Var;
        boolean z;
        switch (this.a) {
            case 7:
                return pcs.b.get(obj);
            case 11:
                h290 h290VarN = ((ContentFilters) obj).n();
                ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
                int i = 0;
                for (Object obj2 : h290VarN) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    ContentFilter contentFilter = (ContentFilter) obj2;
                    contentFilter.getClass();
                    arrayList.add(new xe20(i, contentFilter.n(), contentFilter.getTitle(), false));
                    i = i2;
                }
                return arrayList;
            case 15:
                List<tj60> list = (List) obj;
                ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
                for (tj60 tj60Var : list) {
                    Boolean bool = tj60Var.n;
                    Boolean bool2 = tj60Var.m;
                    List list2 = tj60Var.k;
                    Boolean bool3 = tj60Var.i;
                    Boolean bool4 = tj60Var.g;
                    String str = tj60Var.d;
                    String str2 = tj60Var.c;
                    String str3 = tj60Var.b;
                    String str4 = tj60Var.a;
                    int iC = l1d.C(tj60Var.f);
                    List list3 = z6x.a;
                    switch (iC) {
                        case 0:
                            ej60Var = new ej60(tj60Var.a, tj60Var.b, tj60Var.c, tj60Var.d, list2 == null ? list3 : list2);
                            continue;
                            arrayList2.add(ej60Var);
                            break;
                        case 1:
                            ej60Var = new fj60(tj60Var.a, tj60Var.b, tj60Var.c, tj60Var.d, u890.j(bool, Boolean.TRUE));
                            continue;
                            arrayList2.add(ej60Var);
                            break;
                        case 2:
                            ej60Var = new jj60(tj60Var.a, tj60Var.b, tj60Var.c, tj60Var.d, u890.j(bool4, Boolean.TRUE));
                            continue;
                            arrayList2.add(ej60Var);
                            break;
                        case 3:
                            String str5 = tj60Var.a;
                            String str6 = tj60Var.b;
                            String str7 = tj60Var.c;
                            String str8 = tj60Var.d;
                            String str9 = tj60Var.e;
                            Boolean bool5 = Boolean.TRUE;
                            gj60Var = new gj60(str5, str6, str7, str8, str9, u890.j(bool4, bool5), u890.j(bool3, bool5), u890.j(bool2, bool5));
                            break;
                        case 4:
                            ej60Var = new hj60(str4, str3, str2, str);
                            continue;
                            arrayList2.add(ej60Var);
                            break;
                        case 5:
                            ej60Var = new mj60(str4, str3, str2, str);
                            continue;
                            arrayList2.add(ej60Var);
                            break;
                        case 6:
                            ej60Var = new nj60(str4, str3, str2, str);
                            continue;
                            arrayList2.add(ej60Var);
                            break;
                        case 7:
                            ej60Var = new oj60(tj60Var.a, tj60Var.b, tj60Var.c, tj60Var.d, u890.j(bool, Boolean.TRUE));
                            continue;
                            arrayList2.add(ej60Var);
                            break;
                        case 8:
                            String str10 = tj60Var.a;
                            String str11 = tj60Var.b;
                            String str12 = tj60Var.c;
                            String str13 = tj60Var.d;
                            String str14 = tj60Var.e;
                            String str15 = tj60Var.h;
                            if (str15 == null) {
                                str15 = "";
                            }
                            String str16 = str15;
                            Boolean bool6 = tj60Var.j;
                            Boolean bool7 = Boolean.TRUE;
                            gj60Var = new pj60(str10, str11, str12, str13, str14, u890.j(bool6, bool7), str16, u890.j(bool4, bool7), u890.j(bool3, bool7), list2 == null ? list3 : list2, u890.j(bool2, bool7));
                            break;
                        case 9:
                            ej60Var = new kj60(str4, str3, str2, str);
                            continue;
                            arrayList2.add(ej60Var);
                            break;
                        case 10:
                            ej60Var = new lj60(str4, str3, str2, str);
                            continue;
                            arrayList2.add(ej60Var);
                            break;
                        case 11:
                            ej60Var = new qj60(str4, str3, str2, str);
                            continue;
                            arrayList2.add(ej60Var);
                            break;
                        default:
                            eg.o();
                            return null;
                    }
                    ej60Var = gj60Var;
                    arrayList2.add(ej60Var);
                }
                return arrayList2;
            case 17:
                spq0 spq0Var = (spq0) obj;
                if (spq0Var.c()) {
                    l0l l0lVar = (l0l) spq0Var.b();
                    z = l0lVar.l() || l0lVar.x().contains("video/track");
                }
                return Boolean.valueOf(z);
            case 25:
                List list4 = (List) obj;
                if (list4.isEmpty()) {
                    return z781.b;
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list4) {
                    if (((y781) obj3).e) {
                        arrayList3.add(obj3);
                    }
                }
                ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList4.add(((y781) it.next()).b);
                }
                return arrayList4.isEmpty() ? z781.a : new a881(arrayList4);
            default:
                dvf1 dvf1Var = (dvf1) obj;
                long j = dvf1Var.c;
                long j2 = dvf1Var.b;
                float f = j;
                return Integer.valueOf(f > 0.0f ? j2 >= j ? 100 : jch0.U((j2 / f) * 100.0f) : 0);
        }
    }

    public void b(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1423742621);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarN = anm1.N("report_a_problem_character_limit_warning", u291.f(qim0Var, 1.0f));
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
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
            cnx cnxVar = cnx.c;
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.d;
            qim0 qim0VarR = u291.r(nim0.a, 24.0f);
            cvx cvxVar = cbx.b(x340Var).b;
            w0h1.a(cnxVar, isl.a, uyn1.B(qim0VarR, 0.0f, 0.0f, 4.0f, 0.0f, 11), j, 0L, false, x340Var, cnx.d | 48, 48);
            uwo1.e(cwl1.o0(x340Var, 2131961209), (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.d, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ij21(this, qim0Var, i, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x0257  */
    /* JADX WARN: Code duplicated, block: B:74:0x0263  */
    /* JADX WARN: Code duplicated, block: B:75:0x0265  */
    /* JADX WARN: Code duplicated, block: B:81:0x0279  */
    public void c(is10 is10Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar;
        ven0 ven0Var;
        int i3;
        ven0 ven0Var2;
        Integer num;
        boolean z;
        boolean z2;
        boolean zG;
        Object objT;
        ven0 ven0Var3;
        vu30 vu30Var = y580.Y;
        llj lljVar = y580.R0;
        vu30 vu30Var2 = y580.N0;
        vu30 vu30Var3 = y580.O0;
        m4c m4cVar2 = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-937416204);
        j06 j06Var = ((x340) b0kVar2).a;
        if ((i & 6) == 0) {
            i2 = (b0kVar2.g(is10Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar2.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar2.i(qim0Var) ? 256 : 128;
        }
        if (b0kVar2.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarN = anm1.N("report_a_problem_feedback_options", u291.f(qim0Var, 1.0f));
            era eraVar = een.P0;
            mbh mbhVarA = jbh.a(h36.c, eraVar, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarN);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z3 = ((x340) b0kVar2).S;
            Function0 function0 = hmb0.t1;
            if (z3) {
                b0kVar2.l(function0);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, vu30Var3);
            nko1.H(xos0VarM, b0kVar2, vu30Var2);
            x0d.q(iHashCode, b0kVar2, lljVar, b0kVar2);
            nko1.H(qim0VarE, b0kVar2, vu30Var);
            Object objT2 = b0kVar2.T();
            if (objT2 == m4cVar2) {
                objT2 = v8r.q((Object) null);
                b0kVar2.s0(objT2);
            }
            ven0 ven0Var4 = (ven0) objT2;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            int i4 = i2;
            m4c m4cVar3 = m4cVar2;
            mbh mbhVarA2 = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, b0kVar2, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarF);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(function0);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA2, b0kVar2, vu30Var3);
            nko1.H(xos0VarM2, b0kVar2, vu30Var2);
            x0d.q(iHashCode2, b0kVar2, lljVar, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, vu30Var);
            b0kVar2.i0(-1869337970);
            Iterator it = is10Var.b.iterator();
            Function0 function1 = function0;
            int i5 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i6 = i5 + 1;
                if (i5 < 0) {
                    p7h.T();
                    throw null;
                }
                yw10 yw10Var = (yw10) next;
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(b0kVar2).b;
                qim0 qim0VarZ = uyn1.z(0.0f, 4.0f, 1, qim0VarF2);
                int i7 = i4 & 112;
                boolean zI = b0kVar2.i(ven0Var4) | b0kVar2.e(i5) | (i7 == 32) | b0kVar2.g(yw10Var);
                Object objT3 = b0kVar2.T();
                if (zI) {
                    m4cVar = m4cVar3;
                } else {
                    m4cVar = m4cVar3;
                    if (objT3 != m4cVar) {
                        ven0Var = ven0Var4;
                    }
                    qim0 qim0VarN2 = anm1.N("report_a_problem_feedback_option_row_" + yw10Var.a, bin.x(qim0VarZ, false, (String) null, (pm31) null, (idn0) null, (Function0) objT3, 15));
                    jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar2, 0);
                    m4c m4cVar4 = m4cVar;
                    int iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
                    xos0 xos0VarM3 = b0kVar2.m();
                    qim0 qim0VarE3 = zr7.E(b0kVar2, qim0VarN2);
                    hzj.A.getClass();
                    b0kVar2.m0();
                    Iterator it2 = it;
                    if (((x340) b0kVar2).S) {
                        b0kVar2.l(function1);
                    } else {
                        b0kVar2.v0();
                    }
                    nko1.H(jw31VarA, b0kVar2, vu30Var3);
                    nko1.H(xos0VarM3, b0kVar2, vu30Var2);
                    x0d.q(iHashCode3, b0kVar2, lljVar, b0kVar2);
                    nko1.H(qim0VarE3, b0kVar2, vu30Var);
                    vu30 vu30Var4 = vu30Var;
                    llj lljVar2 = lljVar;
                    int i8 = i4;
                    b0k b0kVar3 = b0kVar2;
                    i3 = i5;
                    ven0Var2 = ven0Var;
                    Function0 function2 = function1;
                    vu30 vu30Var5 = vu30Var2;
                    vu30 vu30Var6 = vu30Var3;
                    uwo1.e(cwl1.o0(b0kVar2, yw10Var.b), new wnb0(1.0f, true), cbx.d(b0kVar2).g, cbx.a(b0kVar2).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar3, 0, 0, 2032);
                    b0kVar2 = b0kVar3;
                    cvx cvxVar3 = cbx.b(b0kVar2).b;
                    op71.g(b0kVar2, u291.v(nim0Var, 12.0f));
                    num = (Integer) ven0Var2.getValue();
                    if (num == null && num.intValue() == i3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean zI2 = b0kVar2.i(ven0Var2) | b0kVar2.e(i3);
                    if (i7 == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zG = zI2 | z2 | b0kVar2.g(yw10Var);
                    objT = b0kVar2.T();
                    if (!zG || objT == m4cVar4) {
                        ven0Var3 = ven0Var2;
                        jj21 jj21Var = new jj21(i3, iu30Var, yw10Var, ven0Var3, (byte) 1);
                        b0kVar2.s0(jj21Var);
                        objT = jj21Var;
                    } else {
                        ven0Var3 = ven0Var2;
                    }
                    yoi1.b(z, (Function0) objT, anm1.N("report_a_problem_feedback_option_radio_" + yw10Var.a, nim0Var), false, (idn0) null, b0kVar2, 0, 24);
                    b0kVar2.r(true);
                    m4cVar3 = m4cVar4;
                    vu30Var = vu30Var4;
                    ven0Var4 = ven0Var3;
                    i5 = i6;
                    it = it2;
                    lljVar = lljVar2;
                    i4 = i8;
                    vu30Var2 = vu30Var5;
                    function1 = function2;
                    vu30Var3 = vu30Var6;
                }
                ven0Var = ven0Var4;
                objT3 = new jj21(i5, iu30Var, yw10Var, ven0Var, (byte) 0);
                b0kVar2.s0(objT3);
                qim0 qim0VarN3 = anm1.N("report_a_problem_feedback_option_row_" + yw10Var.a, bin.x(qim0VarZ, false, (String) null, (pm31) null, (idn0) null, (Function0) objT3, 15));
                jw31 jw31VarA2 = ew31.a(h36.a, een.N0, b0kVar2, 0);
                m4c m4cVar5 = m4cVar;
                int iHashCode4 = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM4 = b0kVar2.m();
                qim0 qim0VarE4 = zr7.E(b0kVar2, qim0VarN3);
                hzj.A.getClass();
                b0kVar2.m0();
                Iterator it3 = it;
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(function1);
                } else {
                    b0kVar2.v0();
                }
                nko1.H(jw31VarA2, b0kVar2, vu30Var3);
                nko1.H(xos0VarM4, b0kVar2, vu30Var2);
                x0d.q(iHashCode4, b0kVar2, lljVar, b0kVar2);
                nko1.H(qim0VarE4, b0kVar2, vu30Var);
                vu30 vu30Var7 = vu30Var;
                llj lljVar3 = lljVar;
                int i9 = i4;
                b0k b0kVar4 = b0kVar2;
                i3 = i5;
                ven0Var2 = ven0Var;
                Function0 function3 = function1;
                vu30 vu30Var8 = vu30Var2;
                vu30 vu30Var9 = vu30Var3;
                uwo1.e(cwl1.o0(b0kVar2, yw10Var.b), new wnb0(1.0f, true), cbx.d(b0kVar2).g, cbx.a(b0kVar2).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar4, 0, 0, 2032);
                b0kVar2 = b0kVar4;
                cvx cvxVar4 = cbx.b(b0kVar2).b;
                op71.g(b0kVar2, u291.v(nim0Var, 12.0f));
                num = (Integer) ven0Var2.getValue();
                if (num == null) {
                    z = false;
                } else {
                    z = true;
                }
                boolean zI3 = b0kVar2.i(ven0Var2) | b0kVar2.e(i3);
                if (i7 == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zG = zI3 | z2 | b0kVar2.g(yw10Var);
                objT = b0kVar2.T();
                if (zG) {
                    ven0Var3 = ven0Var2;
                    jj21 jj21Var2 = new jj21(i3, iu30Var, yw10Var, ven0Var3, (byte) 1);
                    b0kVar2.s0(jj21Var2);
                    objT = jj21Var2;
                } else {
                    ven0Var3 = ven0Var2;
                    jj21 jj21Var3 = new jj21(i3, iu30Var, yw10Var, ven0Var3, (byte) 1);
                    b0kVar2.s0(jj21Var3);
                    objT = jj21Var3;
                }
                yoi1.b(z, (Function0) objT, anm1.N("report_a_problem_feedback_option_radio_" + yw10Var.a, nim0Var), false, (idn0) null, b0kVar2, 0, 24);
                b0kVar2.r(true);
                m4cVar3 = m4cVar5;
                vu30Var = vu30Var7;
                ven0Var4 = ven0Var3;
                i5 = i6;
                it = it3;
                lljVar = lljVar3;
                i4 = i9;
                vu30Var2 = vu30Var8;
                function1 = function3;
                vu30Var3 = vu30Var9;
            }
            us71.m(b0kVar2, false, true, true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new lzs0(this, is10Var, iu30Var, qim0Var, i, (byte) 26);
        }
    }

    public Object convert(int i) {
        g4m g4mVar;
        switch (this.a) {
            case 3:
                if (i == 0) {
                    g4mVar = g4m.CONTENT_RATING_UNSPECIFIED;
                } else if (i == 1) {
                    g4mVar = g4m.CONTENT_RATING_EXPLICIT;
                } else if (i == 2) {
                    g4mVar = g4m.CONTENT_RATING_18_PLUS;
                } else if (i != 3) {
                    g4mVar = i != 4 ? null : g4m.CONTENT_RATING_EROTICA;
                } else {
                    g4mVar = g4m.CONTENT_RATING_SOUTH_KOREA_19;
                }
                return g4mVar == null ? g4m.UNRECOGNIZED : g4mVar;
            default:
                g0r0 g0r0VarA = g0r0.a(i);
                return g0r0VarA == null ? g0r0.i : g0r0VarA;
        }
    }

    public Object create() {
        return ((re70) ee70.a.a()).toBuilder().p(new y570[]{gd70.c.a.Q(k570.c).x()}).f();
    }

    public void d(qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1684966279);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131961217);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, anm1.N("report_a_problem_footer_text", u291.f(qim0Var, 1.0f)), cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2016);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wjz0(this, qim0Var, i, (byte) 10);
        }
    }

    public void e(xi21 xi21Var, is10 is10Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1683956243);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(xi21Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(is10Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.g(this) ? 16384 : 8192;
        }
        int i3 = i2;
        if (b0kVar3.Y(i3 & 1, (i3 & 9363) != 9362)) {
            qim0 qim0VarN = anm1.N("report_a_problem_form_content", qim0Var);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarN);
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
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q((Object) null);
                b0kVar3.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean zI = b0kVar3.i(ven0Var);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new r9y0(ven0Var, (byte) 8);
                b0kVar3.s0(objT2);
            }
            uwr uwrVar = cbx.a;
            float f = cbx.b(b0kVar3).b.b;
            nim0 nim0Var = nim0.a;
            c(is10Var, (iu30) objT2, uyn1.B(nim0Var, 0.0f, f, 0.0f, 0.0f, 13), b0kVar3, (i3 >> 3) & 7182);
            y7e1 y7e1VarD = c4p1.D(0, 3, (String) null, b0kVar3);
            boolean z = ((n5o0) ven0Var.getValue()) != null || is10Var.b.isEmpty();
            j2i j2iVarR = apo.r(-75469857, new kj21((Object) this, (Object) is10Var, (Object) xi21Var, (Object) y7e1VarD, (byte) 0), b0kVar3);
            pbh pbhVar = pbh.a;
            fq7.b(pbhVar, z, null, null, null, null, j2iVarR, b0kVar3, 1572870, 30);
            n5o0 n5o0Var = (n5o0) ven0Var.getValue();
            qim0 qim0VarC = pbhVar.c(een.Q0, nim0Var);
            cvx cvxVar = cbx.b(b0kVar3).b;
            int i4 = i3 << 3;
            i(n5o0Var, y7e1VarD, xi21Var, iu30Var, uyn1.B(qim0VarC, 0.0f, 8.0f, 0.0f, 0.0f, 13), b0kVar3, ((i3 << 6) & 896) | (i4 & 7168) | (i4 & 458752));
            b0kVar2 = b0kVar3;
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            d(uyn1.x(nim0Var, 16.0f), b0kVar2, (i3 >> 9) & 112);
            op71.g(b0kVar2, u291.c(nim0Var, 1.0f));
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new lqf0((byte) 26, i, (Object) this, (Object) xi21Var, (Object) is10Var, iu30Var, qim0Var);
        }
    }

    public void f(int i, int i2, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
        int i3;
        qim0 qim0Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(28245326);
        if ((i2 & 6) == 0) {
            i3 = i2 | (b0kVar2.e(i) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= b0kVar2.i(iu30Var) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if (b0kVar2.Y(i4 & 1, (i4 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("report_a_problem_header", u291.b(0.0f, 48.0f, 1, u291.f(qim0Var3, 1.0f)));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarN);
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
            nko1.H(gfh0VarC, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            String strO0 = cwl1.o0(b0kVar2, 2131961210);
            if (ihc1.y0(strO0)) {
                hhg1.n("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
                return;
            }
            y50 y50Var = new y50(strO0);
            boolean z = (i4 & 112) == 32;
            Object objT = b0kVar2.T();
            if (z || objT == fkj0.X) {
                objT = new dv11(iu30Var, (byte) 18);
                b0kVar2.s0(objT);
            }
            gbx gbxVar = new gbx(y50Var, (Function0) objT);
            ldx ldxVar = ldx.c;
            gra graVar = een.g;
            h2c h2cVar = h2c.a;
            qim0 qim0VarA = h2cVar.a(qim0Var3, graVar);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            wro1.h(gbxVar, ldxVar, anm1.N("report_a_problem_close_button", uyn1.z(4.0f, 0.0f, 2, qim0VarA)), (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, ndj.a, b0kVar2, 0, 6, 1016);
            uwo1.e(cwl1.o0(b0kVar2, i), anm1.N("report_a_problem_title", uyn1.z(cbx.b(b0kVar2).b.d, 0.0f, 2, h2cVar.a(qim0Var3, een.h))), cbx.d(b0kVar2).h, cbx.a(b0kVar2).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar2, 0, 0, 1712);
            b0kVar2 = b0kVar2;
            hr80.d(h2cVar.a(qim0Var3, een.X), 0.5f, cbx.a(b0kVar2).a.b.c(), b0kVar2, 0, 0);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new nk0(this, i, iu30Var, qim0Var2, i2, (byte) 17);
        }
    }

    public void g(xi21 xi21Var, y7e1 y7e1Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        hax haxVar;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-613179998);
        int i2 = i | (b0kVar3.g(xi21Var) ? 4 : 2) | (b0kVar3.i(y7e1Var) ? 32 : 16) | (b0kVar3.i(qim0Var) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            if (xi21Var.b) {
                b0kVar3.i0(-749178028);
                haxVar = new hax(cwl1.o0(b0kVar3, 2131961243));
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-749036234);
                b0kVar3.r(false);
                haxVar = jax.a;
            }
            hax haxVar2 = haxVar;
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(b0kVar3).g;
            kua0 kua0Var = new kua0(3, (Boolean) null, 0, 0, 126);
            String strO0 = cwl1.o0(b0kVar3, 2131961218);
            qim0 qim0VarN = anm1.N("report_a_problem_input_field", i1p1.q(u291.h(qim0Var, 179.0f), er31.b(20.0f)));
            zxx zxxVar = new zxx(cbx.a(b0kVar3).b.a, cbx.a(b0kVar3).b.a, cbx.a(b0kVar3).b.b, cbx.a(b0kVar3).b.d, cbx.a(b0kVar3).a.b.a(), cbx.a(b0kVar3).a.b.a(), cbx.a(b0kVar3).b.c, 0L, 896);
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            rwo1.b(y7e1Var, qim0VarN, haxVar2, strO0, (vu30) null, (vu30) null, false, false, (dk80) null, lee1Var, kua0Var, (yta0) null, (e6e1) null, (vu30) null, (idn0) null, (uwg) null, (es41) null, new zzq0(16.0f, 12.0f, 16.0f, 12.0f), 0.0f, false, zxxVar, b0kVar2, (i2 >> 3) & 14, 0, 915952);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new pby0(i, (Object) this, (Object) xi21Var, (Object) y7e1Var, (Object) qim0Var, (byte) 15);
        }
    }

    public void h(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2091699022);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0Var2 = nim0.a;
            xto1.e(anm1.N("report_a_problem_loading_spinner", qim0Var2), 2, 0L, 0L, x340Var, 48, 12);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ij21(this, qim0Var, i, (byte) 1);
        }
    }

    public void i(n5o0 n5o0Var, y7e1 y7e1Var, xi21 xi21Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        hax haxVar;
        j2i j2iVarR;
        boolean z = xi21Var.b;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(864934429);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.e(n5o0Var == null ? -1 : n5o0Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(y7e1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(xi21Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.g(this) ? 131072 : 65536;
        }
        if (b0kVar3.Y(i2 & 1, (74899 & i2) != 74898)) {
            boolean zI = ((i2 & 7168) == 2048) | b0kVar3.i(y7e1Var) | ((i2 & 14) == 4);
            Object objT = b0kVar3.T();
            if (zI || objT == fkj0.X) {
                objT = new d4v0(iu30Var, y7e1Var, n5o0Var, (byte) 21);
                b0kVar3.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0("Submit")) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50("Submit"), function0);
            idx idxVar = new idx(4);
            gdx gdxVarP = p(b0kVar3);
            if (n5o0Var == null && y7e1Var.d().d.length() == 0) {
                b0kVar3.i0(-2021644262);
                haxVar = new hax(cwl1.o0(b0kVar3, 2131961239));
                b0kVar3.r(false);
            } else if (z) {
                b0kVar3.i0(-2021637238);
                haxVar = new hax(cwl1.o0(b0kVar3, 2131961243));
                b0kVar3.r(false);
            } else if (y7e1Var.d().d.length() > 500) {
                b0kVar3.i0(-2021631126);
                haxVar = new hax(cwl1.o0(b0kVar3, 2131961209));
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-2021627119);
                b0kVar3.r(false);
                haxVar = jax.a;
            }
            qim0 qim0VarN = anm1.N("report_a_problem_submit_button", qim0Var);
            if (z) {
                b0kVar3.i0(1754232123);
                j2iVarR = apo.r(-2048695422, new ps11(this, (byte) 12), b0kVar3);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(1754278560);
                b0kVar3.r(false);
                j2iVarR = null;
            }
            b0kVar2 = b0kVar3;
            foo1.c(gbxVar, idxVar, qim0VarN, haxVar, gdxVarP, (vzq0) null, (idn0) null, (ga80) null, j2iVarR, (vu30) null, ndj.b, b0kVar2, 0, 48, 1480);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kqf0((byte) 25, i, this, n5o0Var, y7e1Var, xi21Var, iu30Var, qim0Var, false);
        }
    }

    public void j(int i, b0k b0kVar, qim0 qim0Var, boolean z) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1009922782);
        int i2 = i | (b0kVar3.h(z) ? 4 : 2) | (b0kVar3.i(qim0Var) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(b0kVar3, 2131961241);
            qim0 qim0VarN = anm1.N("report_a_problem_tell_us_more_text", u291.f(qim0Var, 1.0f));
            b0kVar3.i0(-126805441);
            ye5 ye5Var = new ye5();
            uwr uwrVar = cbx.a;
            int iO = ye5Var.o(lee1.a(cbx.d(b0kVar3).k, cbx.a(b0kVar3).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214).a);
            try {
                ye5Var.g(strO0);
                ye5Var.k(iO);
                if (z) {
                    b0kVar3.i0(-1581309723);
                    ye5Var.g(" ");
                    int iO2 = ye5Var.o(lee1.a(cbx.d(b0kVar3).j, cbx.a(b0kVar3).b.b, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214).a);
                    try {
                        ye5Var.g(cwl1.o0(b0kVar3, 2131961219));
                        ye5Var.k(iO2);
                        b0kVar3.r(false);
                    } catch (Throwable th) {
                        ye5Var.k(iO2);
                        throw th;
                    }
                } else {
                    b0kVar3.i0(-1581053136);
                    b0kVar3.r(false);
                }
                af5 af5VarP = ye5Var.p();
                b0kVar3.r(false);
                b0kVar2 = b0kVar3;
                uwo1.f(af5VarP, qim0VarN, (lee1) null, (x9h) null, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, b0kVar2, 0, 0, 4092);
            } catch (Throwable th2) {
                ye5Var.k(iO);
                throw th2;
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new r7e0(this, z, qim0Var, i, (byte) 23);
        }
    }

    public void k(xi21 xi21Var, is10 is10Var, iu30 iu30Var, b0k b0kVar, int i) {
        xi21 xi21Var2;
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(642536274);
        if ((i & 6) == 0) {
            xi21Var2 = xi21Var;
            i2 = (x340Var.g(xi21Var2) ? 4 : 2) | i;
        } else {
            xi21Var2 = xi21Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(is10Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        int i3 = i & 3072;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(this) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0VarN = anm1.N("report_a_problem_root_container", nim0Var);
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
            f(is10Var.a, (i2 >> 3) & 7280, x340Var, iu30Var, null);
            qim0 qim0VarH = l6o1.H(nim0Var, l6o1.C(0, 0, 1, x340Var), false, 14);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0VarH);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            e(xi21Var2, is10Var, iu30Var, uyn1.z(16.0f, 0.0f, 2, qim0VarP), x340Var, i2 & 58366);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lzs0(this, xi21Var, is10Var, iu30Var, i);
        }
    }

    public synchronized uo5 o() {
        uo5 uo5Var;
        try {
            if (uo5.Z == null) {
                uo5.Z = new uo5(zce0.a(wf10.a()), new ae((byte) 1), (byte) 5);
            }
            uo5Var = uo5.Z;
            if (uo5Var == null) {
                u890.C("instance");
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return uo5Var;
    }

    public void onFailure(Throwable th) {
        n57.s("Failed to connect the media notification controller");
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
    }

    public boolean test(Object obj) {
        return !c6b1.a((PlayerState) obj);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0092  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0063->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0080 -> B:25:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0083 -> B:25:0x0063). Please report as a decompilation issue!!! */
    public Object u(List list, a191 a191Var, onm onmVar) throws Throwable {
        a0r a0rVar;
        List list2;
        Iterator it;
        p811 p811Var;
        Throwable th;
        iu30 iu30Var;
        if (onmVar instanceof a0r) {
            a0rVar = (a0r) onmVar;
            int i = a0rVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                a0rVar.e = i - Integer.MIN_VALUE;
            } else {
                a0rVar = new a0r(this, onmVar);
            }
        } else {
            a0rVar = new a0r(this, onmVar);
        }
        Object obj = a0rVar.c;
        int i2 = a0rVar.e;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            ArrayList arrayListJ = hrt.j(obj);
            xd1 xd1Var = new xd1(list, arrayListJ, (lnm) null, (byte) 6);
            a0rVar.a = arrayListJ;
            a0rVar.e = 1;
            if (a191Var.a(xd1Var, a0rVar) != d9nVar) {
                list2 = arrayListJ;
            }
            return d9nVar;
        }
        if (i2 == 1) {
            list2 = (List) a0rVar.a;
            hm5.M(obj);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = a0rVar.b;
            p811Var = (p811) a0rVar.a;
            try {
                hm5.M(obj);
            } catch (Throwable th2) {
                Object obj2 = p811Var.a;
                if (obj2 == null) {
                    p811Var.a = th2;
                } else {
                    j2h1.h((Throwable) obj2, th2);
                }
            }
        }
        while (it.hasNext()) {
            iu30Var = (iu30) it.next();
            a0rVar.a = p811Var;
            a0rVar.b = it;
            a0rVar.e = 2;
            if (iu30Var.invoke(a0rVar) == d9nVar) {
                return d9nVar;
            }
        }
        th = (Throwable) p811Var.a;
        if (th == null) {
            return rih1.a;
        }
        throw th;
        p811 p811Var2 = new p811();
        it = list2.iterator();
        p811Var = p811Var2;
        while (it.hasNext()) {
            iu30Var = (iu30) it.next();
            a0rVar.a = p811Var;
            a0rVar.b = it;
            a0rVar.e = 2;
            if (iu30Var.invoke(a0rVar) == d9nVar) {
                return d9nVar;
            }
        }
        th = (Throwable) p811Var.a;
        if (th == null) {
            return rih1.a;
        }
        throw th;
    }

    public /* synthetic */ yla(Object obj, byte b2) {
        this.a = b2;
    }

    public /* synthetic */ yla(byte b2) {
        this.a = b2;
    }

    public yla(daq daqVar, teq teqVar) {
        this.a = (byte) 5;
    }

    public void a(l420 l420Var) {
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    public Object apply(Object obj, Object obj2) {
        String strJ;
        c4s0 c4s0Var = (c4s0) obj;
        PlayerState playerState = (PlayerState) obj2;
        String strContextUri = playerState.contextUri();
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(strContextUri);
        if (s4b1VarX.c != blc0.ea) {
            s4b1VarX = null;
        }
        if (s4b1VarX == null || (strJ = s4b1VarX.j()) == null) {
            strJ = null;
        }
        if (strJ == null) {
            jxu0 jxu0VarC = oxu0.a.c(strContextUri);
            jxu0 jxu0Var = jxu0VarC instanceof jxu0 ? jxu0VarC : null;
            if (jxu0Var == null) {
                strJ = null;
            } else {
                if (!u890.j(jxu0Var.a, "listening-party") || !cmd0.a.e(jxu0Var.b)) {
                    jxu0Var = null;
                }
                if (jxu0Var == null || (strJ = jxu0Var.b) == null) {
                    strJ = null;
                }
            }
        }
        String strConcat = strJ != null ? "spotify:room:".concat(strJ) : null;
        y3s0 y3s0Var = c4s0Var.a;
        boolean z = y3s0Var instanceof d4s0;
        d4s0 d4s0Var = d4s0.a;
        if (z) {
            if (strConcat != null && c4p1.y(playerState)) {
                return new c4s0(new y3s0(strConcat), Collections.singletonList(new z3s0(strConcat)));
            }
            return new c4s0(d4s0Var);
        }
        if (y3s0Var instanceof y3s0) {
            if (strConcat != null && !c4p1.x(playerState)) {
                String str = y3s0Var.a;
                if (strConcat.equals(str)) {
                    return new c4s0(y3s0Var);
                }
                if (c4p1.y(playerState)) {
                    return new c4s0(new y3s0(strConcat), p7h.M(new b4s0[]{new a4s0(str), new z3s0(strConcat)}));
                }
                return new c4s0(d4s0Var, Collections.singletonList(new a4s0(str)));
            }
            return new c4s0(d4s0Var, Collections.singletonList(new a4s0(y3s0Var.a)));
        }
        eg.o();
        return null;
    }
}
