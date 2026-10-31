package p;

import android.content.Context;
import android.graphics.PointF;
import android.os.Build;
import android.os.LocaleList;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class n8p1 {
    public static b180 a;
    public static b180 b;

    public static void A(Object obj, String str) {
        if (obj != null) {
            return;
        }
        bhn0.i(str);
    }

    public static final PointF B(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static final boolean C(String str, String str2) {
        if (str.equals(nhc1.W(str2, "?", ""))) {
            return true;
        }
        if (nhc1.R(str2, "?", false) && str.concat("?").equals(str2)) {
            return true;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(str);
        sb.append(")?");
        return sb.toString().equals(str2);
    }

    public static final void a(gn1 gn1Var, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-504542316);
        int i2 = i | (x340Var.g(gn1Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            nyx.a(3, (wux) null, apo.r(2108346983, new q1(gn1Var, function0, function1), x340Var), x340Var, 3078, 6);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x2(i, (Object) gn1Var, (Object) function0, (Object) function1, (Object) qim0Var2, (byte) 16);
        }
    }

    public static final void b(String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(344977297);
        int i2 = (x340Var.g(str) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            gfx.b(6, apo.r(-2057242692, new j3b(str, (byte) 27), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j3b(str, i, (byte) 28);
        }
    }

    public static final void c(idm idmVar, wcm wcmVar, iu30 iu30Var, b0k b0kVar, int i) {
        idm idmVar2;
        wcm wcmVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1303462979);
        int i2 = (x340Var.i(idmVar) ? 4 : 2) | i | (x340Var.i(wcmVar) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new pc81(iu30Var, (byte) 2);
                x340Var.s0(objT);
            }
            wcmVar2 = wcmVar;
            idmVar2 = idmVar;
            otw.c(idmVar2, wcm.a(wcmVar, (Function0) objT, (nx2) null, false, (String) null, 1007), (qim0) null, (ipb1) null, x340Var, i2 & 14, 12);
        } else {
            idmVar2 = idmVar;
            wcmVar2 = wcmVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lnx0(idmVar2, wcmVar2, iu30Var, i, (byte) 1);
        }
    }

    public static final void d(xho xhoVar, uho uhoVar, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1725408211);
        int i2 = (x340Var.i(xhoVar) ? 4 : 2) | i | (x340Var.i(uhoVar) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new pc81(iu30Var, (byte) 3);
                x340Var.s0(objT);
            }
            otw.c(xhoVar, uho.a(uhoVar, (Function0) objT), (qim0) null, (ipb1) null, x340Var, 8 | (i2 & 14), 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mnx0(xhoVar, uhoVar, iu30Var, i, (byte) 1);
        }
    }

    public static final void e(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1307047380);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.b;
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarN = anm1.N("elbow-connector", u291.h(u291.v(qim0Var2, 8.0f), 10.0f));
            boolean zF = x340Var.f(j);
            Object objT = x340Var.T();
            if (zF || objT == fkj0.X) {
                objT = new vfe1((byte) 0, j);
                x340Var.s0(objT);
            }
            j0o1.b(0, x340Var, (iu30) objT, qim0VarN);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wfe1(qim0Var, i, (byte) 0);
        }
    }

    public static final void f(hft0 hft0Var, set0 set0Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1956899883);
        int i2 = (x340Var.i(hft0Var) ? 4 : 2) | i | (x340Var.i(set0Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new pc81(iu30Var, (byte) 4);
                x340Var.s0(objT);
            }
            otw.c(hft0Var, set0.a(set0Var, (Function0) objT, (Function0) null, 2031), (qim0) null, (ipb1) null, x340Var, i2 & 14, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nnx0(hft0Var, set0Var, iu30Var, i, (byte) 1);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void g(erc1 erc1Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1516040422);
        if ((i & 6) == 0) {
            i2 = i | (b0kVar2.g(erc1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (b0kVar2.Y(i2 & 1, (i2 & 3) != 2)) {
            boolean z = erc1Var instanceof arc1;
            nim0 nim0Var = nim0.a;
            isl islVar = isl.a;
            if (z) {
                b0kVar2.i0(1515987698);
                arc1 arc1Var = (arc1) erc1Var;
                crc1 crc1Var = arc1Var.b;
                yqc1 yqc1Var = arc1Var.a;
                hux huxVar = yqc1Var.a;
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(b0kVar2).g;
                w0h1.a(huxVar, islVar, u291.r(nim0Var, 16.0f), i1p1.y(b0kVar2, yqc1Var.b), 0L, false, b0kVar2, 56, 48);
                cvx cvxVar = cbx.b(b0kVar2).b;
                op71.g(b0kVar2, u291.v(nim0Var, 2.0f));
                b0kVar2 = b0kVar2;
                uwo1.e(crc1Var.a, null, cbx.d(b0kVar2).j, i1p1.y(b0kVar2, crc1Var.b), null, null, 0, false, new cjc0(1), 0, null, b0kVar2, 0, 0, 1778);
                b0kVar2.r(false);
            } else if (erc1Var instanceof crc1) {
                b0kVar2.i0(-920910673);
                crc1 crc1Var2 = (crc1) erc1Var;
                String str = crc1Var2.a;
                uwr uwrVar2 = cbx.a;
                uwo1.e(str, null, cbx.d(b0kVar2).j, i1p1.y(b0kVar2, crc1Var2.b), null, null, 0, false, new cjc0(1), 0, null, b0kVar2, 0, 0, 1778);
                b0kVar2.r(false);
            } else {
                if (!(erc1Var instanceof yqc1)) {
                    throw p3d1.k(b0kVar2, -920929620, false);
                }
                b0kVar2.i0(-920903739);
                yqc1 yqc1Var2 = (yqc1) erc1Var;
                hux huxVar2 = yqc1Var2.a;
                uwr uwrVar3 = cbx.a;
                zov0 zov0Var2 = cbx.b(b0kVar2).g;
                w0h1.a(huxVar2, islVar, u291.r(nim0Var, 16.0f), i1p1.y(b0kVar2, yqc1Var2.b), 0L, false, b0kVar2, 56, 48);
                b0kVar2.r(false);
            }
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new oib1(erc1Var, i, (byte) 2);
        }
    }

    public static final void h(erc1 erc1Var, qim0 qim0Var, b0k b0kVar, int i) {
        byte b2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(331908015);
        j06 j06Var = x340Var.a;
        int i2 = (x340Var.g(erc1Var) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            fra fraVar = een.N0;
            qim0Var2 = nim0.a;
            qim0 qim0VarN = anm1.N("this-device-subtitle", qim0Var2);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarN, 2.0f, 0.0f, 0.0f, 0.0f, 14);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0Var2);
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
            e(null, x340Var, 0);
            op71.g(x340Var, u291.h(qim0Var2, 2.0f));
            b2 = 1;
            x340Var.r(true);
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.v(qim0Var2, 4.0f));
            g(erc1Var, x340Var, i2 & 14);
            x340Var.r(true);
        } else {
            b2 = 1;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mqc1(erc1Var, qim0Var2, i, b2);
        }
    }

    public static final g930 i(Context context) {
        return new g930(new w741(context), new pj4(Build.VERSION.SDK_INT >= 31 ? la30.a.a(context) : 0));
    }

    public static LocaleList j(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    public static final jm6 k(im6 im6Var, pch pchVar) {
        String strF;
        long j;
        u7h u7hVar;
        i1r i1rVar = pchVar.a;
        i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
        hm6 hm6Var = (hm6) (i1rVar2 != null ? i1rVar2.a : null);
        String str = im6Var.a;
        c9 c9VarF = mqo1.F(im6Var.b);
        if (hm6Var != null) {
            strF = hm6Var.a;
            String str2 = hm6Var.b;
            if (strF == null || ihc1.y0(strF)) {
                strF = "";
            } else if (str2 != null && !ihc1.y0(str2)) {
                strF = f4i1.f(strF, " × ", str2);
            }
        } else {
            strF = null;
        }
        String str3 = strF == null ? "" : strF;
        String str4 = hm6Var != null ? hm6Var.a : null;
        String str5 = str4 == null ? "" : str4;
        String str6 = hm6Var != null ? hm6Var.b : null;
        String str7 = str6 == null ? "" : str6;
        if (hm6Var == null || (u7hVar = hm6Var.c) == null) {
            u7h u7hVar2 = im6Var.c;
            if (u7hVar2 != null) {
                j = u7hVar2.a;
            } else {
                uwr uwrVar = cbx.a;
                j = ((yex) zex.a.d).e;
            }
        } else {
            j = u7hVar.a;
        }
        return new jm6(str, c9VarF, pchVar.b, str3, str5, str7, j, pchVar.c);
    }

    public static final PointF l(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x - pointF2.x, pointF.y - pointF2.y);
    }

    public static final float m(mmr0 mmr0Var) {
        PointF pointFL = l((PointF) mmr0Var.b, (PointF) mmr0Var.a);
        float f = pointFL.x;
        float f2 = pointFL.y;
        return (float) Math.sqrt((f2 * f2) + (f * f));
    }

    public static zud0 n(txk0 txk0Var) {
        return new zud0(txk0Var.b(), (byte) 15);
    }

    public static boolean o(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static LocaleList p() {
        return LocaleList.getDefault();
    }

    public static df41 q() {
        return kes.I;
    }

    public static int r(Object... objArr) {
        return Objects.hash(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001a  */
    public static final bl80 s(xkg0 xkg0Var, String str, String str2) {
        String str3;
        String str4;
        w4i1 w4i1Var = (w4i1) xkg0Var.get(str2);
        if (w4i1Var == null || (str4 = w4i1Var.b) == null) {
            str3 = str2;
        } else {
            if (str4.length() <= 0) {
                str4 = null;
            }
            if (str4 == null) {
                str3 = str2;
            } else {
                str3 = str4;
            }
        }
        return new bl80(bro1.q(w4i1Var != null ? w4i1Var.d : null), str2, str3, w4i1Var != null ? w4i1Var.c : null, u890.j(str2, str));
    }

    public static final List t(String str, List list, List list2) {
        mmr0 mmr0Var;
        int i;
        cl80 yk80Var;
        int i2;
        int i3;
        int i4;
        xkg0 xkg0Var = new xkg0();
        for (Object obj : list2) {
            xkg0Var.putIfAbsent(((w4i1) obj).a, obj);
        }
        xkg0 xkg0VarB = xkg0Var.b();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (hashSet.add(((x7f) obj2).a)) {
                arrayList.add(obj2);
            }
        }
        ArrayList<cl80> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            int i5 = 4;
            if (!it.hasNext()) {
                if (arrayList2.isEmpty()) {
                    return z6x.a;
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayList2) {
                    if (((cl80) obj3).getTimeRange() == null) {
                        arrayList3.add(obj3);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (cl80 cl80Var : arrayList2) {
                    v7f timeRange = cl80Var.getTimeRange();
                    if (timeRange != null) {
                        w7f w7fVar = timeRange.a;
                        Instant instantOfEpochSecond = Instant.ofEpochSecond(w7fVar.a, w7fVar.b);
                        ZoneOffset zoneOffset = ZoneOffset.UTC;
                        LocalDate localDate = instantOfEpochSecond.atOffset(zoneOffset).toLocalDate();
                        w7f w7fVar2 = timeRange.b;
                        LocalDate localDate2 = Instant.ofEpochSecond(w7fVar2.a, w7fVar2.b).minusNanos(1L).atOffset(zoneOffset).toLocalDate();
                        localDate.getClass();
                        localDate2.getClass();
                        mmr0Var = new mmr0(new ol80(localDate, pap1.y(localDate, localDate2), instantOfEpochSecond), cl80Var);
                    } else {
                        mmr0Var = null;
                    }
                    if (mmr0Var != null) {
                        arrayList4.add(mmr0Var);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj4 : arrayList4) {
                    ol80 ol80Var = (ol80) ((mmr0) obj4).a;
                    String str2 = ol80Var.a + "_" + ol80Var.b;
                    Object objH = linkedHashMap.get(str2);
                    if (objH == null) {
                        objH = cfm0.h(str2, linkedHashMap);
                    }
                    ((List) objH).add(obj4);
                }
                ArrayList arrayList5 = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str3 = (String) entry.getKey();
                    List list3 = (List) entry.getValue();
                    Iterator it2 = list3.iterator();
                    if (!it2.hasNext()) {
                        hhg1.k();
                        return null;
                    }
                    Object next = it2.next();
                    if (it2.hasNext()) {
                        Instant instant = ((ol80) ((mmr0) next).a).c;
                        do {
                            Object next2 = it2.next();
                            Instant instant2 = ((ol80) ((mmr0) next2).a).c;
                            if (instant.compareTo(instant2) > 0) {
                                next = next2;
                                instant = instant2;
                            }
                        } while (it2.hasNext());
                    }
                    ol80 ol80Var2 = (ol80) ((mmr0) next).a;
                    ArrayList arrayList6 = new ArrayList(q7h.U(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList6.add((cl80) ((mmr0) it3.next()).b);
                    }
                    arrayList5.add(new mmr0(new pl80(str3, ol80Var2, arrayList6), ol80Var2.c));
                }
                List listD1 = o7h.d1(o7h.a1(arrayList5, new cvt((byte) 16)), 4);
                ArrayList arrayList7 = new ArrayList(q7h.U(listD1, 10));
                Iterator it4 = listD1.iterator();
                while (it4.hasNext()) {
                    arrayList7.add((pl80) ((mmr0) it4.next()).a);
                }
                if (arrayList3.isEmpty()) {
                    return arrayList7;
                }
                pl80 pl80Var = (pl80) o7h.s0(arrayList7);
                if (pl80Var == null) {
                    return Collections.singletonList(new pl80("undated", null, arrayList3));
                }
                return o7h.N0(o7h.k0(arrayList7, 1), Collections.singletonList(new pl80(pl80Var.a, pl80Var.b, o7h.N0(arrayList3, pl80Var.c))));
            }
            x7f x7fVar = (x7f) it.next();
            u7f u7fVar = x7fVar.c;
            String str4 = x7fVar.a;
            if (u7fVar instanceof s7f) {
                v7f v7fVar = x7fVar.b;
                s7f s7fVar = (s7f) u7fVar;
                bl80 bl80VarS = s(xkg0VarB, str, s7fVar.a);
                String str5 = s7fVar.c;
                int iC = l1d.C(s7fVar.d);
                if (iC == 0) {
                    i4 = 1;
                } else {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    i4 = 2;
                }
                yk80Var = new zk80(str4, v7fVar, bl80VarS, str5, i4, s7fVar.e);
            } else if (u7fVar instanceof t7f) {
                v7f v7fVar2 = x7fVar.b;
                t7f t7fVar = (t7f) u7fVar;
                h290 h290Var = t7fVar.a;
                ArrayList arrayList8 = new ArrayList(q7h.U(h290Var, 10));
                Iterator it5 = h290Var.iterator();
                while (it5.hasNext()) {
                    arrayList8.add(s(xkg0VarB, str, (String) it5.next()));
                }
                long j = t7fVar.b;
                int iC2 = l1d.C(t7fVar.c);
                if (iC2 == 0) {
                    i2 = 1;
                } else if (iC2 == 1) {
                    i2 = 2;
                } else {
                    if (iC2 != 2) {
                        eg.o();
                        return null;
                    }
                    i2 = 3;
                }
                int iC3 = l1d.C(t7fVar.d);
                if (iC3 == 0) {
                    i3 = 1;
                } else if (iC3 == 1) {
                    i3 = 2;
                } else if (iC3 != 2) {
                    if (iC3 != 3) {
                        if (iC3 != 4) {
                            eg.o();
                            return null;
                        }
                        i5 = 5;
                    }
                    i3 = i5;
                } else {
                    i3 = 3;
                }
                yk80Var = new al80(str4, v7fVar2, arrayList8, j, i2, i3);
            } else {
                if (!(u7fVar instanceof r7f)) {
                    eg.o();
                    return null;
                }
                v7f v7fVar3 = x7fVar.b;
                r7f r7fVar = (r7f) u7fVar;
                h290 h290Var2 = r7fVar.a;
                ArrayList arrayList9 = new ArrayList(q7h.U(h290Var2, 10));
                Iterator it6 = h290Var2.iterator();
                while (it6.hasNext()) {
                    arrayList9.add(s(xkg0VarB, str, (String) it6.next()));
                }
                String str6 = r7fVar.b;
                int iC4 = l1d.C(r7fVar.c);
                if (iC4 == 0) {
                    i = 1;
                } else {
                    if (iC4 != 1) {
                        eg.o();
                        return null;
                    }
                    i = 2;
                }
                yk80Var = new yk80(str4, v7fVar3, arrayList9, str6, i);
            }
            arrayList2.add(yk80Var);
        }
    }

    public static dmj1 u(LinkedHashMap linkedHashMap) {
        return new dmj1(new cbk1(linkedHashMap), (byte) 2);
    }

    public static String v(ajn0 ajn0Var) {
        String strB = ajn0Var.b();
        strB.getClass();
        if (!jva0.a.contains(strB)) {
            for (int i = 0; i < strB.length(); i++) {
                char cCharAt = strB.charAt(i);
                if (Character.isLetterOrDigit(cCharAt) || cCharAt == '_') {
                }
            }
            if (strB.length() != 0 && Character.isJavaIdentifierStart(strB.codePointAt(0))) {
                return strB;
            }
        }
        return "`".concat(strB).concat("`");
    }

    public static final String w(String str, String str2, Function0 function0, Function0 function1, iu30 iu30Var) {
        String str3 = (String) function0.invoke();
        String strY = y(str, f4i1.e(str3, "Mutable"), str2, str3, f4i1.e(str3, "(Mutable)"));
        if (strY != null) {
            return strY;
        }
        String strY2 = y(str, str3.concat("MutableMap.MutableEntry"), str2, str3.concat("Map.Entry"), str3.concat("(Mutable)Map.(Mutable)Entry"));
        if (strY2 != null) {
            return strY2;
        }
        String str4 = (String) function1.invoke();
        String strY3 = y(str, str4 + ((String) iu30Var.invoke("Array<")), str2, str4 + ((String) iu30Var.invoke("Array<out ")), str4 + ((String) iu30Var.invoke("Array<(out) ")));
        if (strY3 != null) {
            return strY3;
        }
        return null;
    }

    public static final String x(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ajn0 ajn0Var = (ajn0) it.next();
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(v(ajn0Var));
        }
        return sb.toString();
    }

    public static final String y(String str, String str2, String str3, String str4, String str5) {
        if (!nhc1.Y(str, str2, false) || !nhc1.Y(str3, str4, false)) {
            return null;
        }
        String strSubstring = str.substring(str2.length());
        String strSubstring2 = str3.substring(str4.length());
        String strConcat = str5.concat(strSubstring);
        if (strSubstring.equals(strSubstring2)) {
            return strConcat;
        }
        if (C(strSubstring, strSubstring2)) {
            return strConcat.concat("!");
        }
        return null;
    }

    public static void z(Object obj) {
        obj.getClass();
    }
}
