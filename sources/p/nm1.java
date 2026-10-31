package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nm1 implements tyq, cvl1 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final psw e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public nm1(d0r d0rVar, njm njmVar, lwm lwmVar) {
        this.a = (byte) 2;
        this.b = d0rVar;
        this.f = njmVar;
        this.g = lwmVar;
        jd11 jd11Var = rc11.a;
        l4r l4rVar = new l4r(new wlu(jd11Var.b(jo70.class)), 1, bxm.Z, new j4r(atm.e1), bxm.N0);
        l4r l4rVar2 = new l4r(new wlu(jd11Var.b(jo70.class)), 1, bxm.O0, new j4r(bxm.b), bxm.P0);
        l4r l4rVar3 = new l4r(new wlu(jd11Var.b(xkk1.class)), 3, bxm.Q0, new j4r(bxm.c), bxm.R0);
        l4r l4rVar4 = new l4r(new wlu(jd11Var.b(xkk1.class)), 3, bxm.S0, new j4r(bxm.d), bxm.T0);
        hvm hvmVar = hvm.c;
        this.c = w3p1.j(l4rVar, l4rVar2, l4rVar3, l4rVar4, new l4r(hvmVar, 2, bxm.g, new j4r(bxm.e), bxm.h), new l4r(hvmVar, 2, bxm.i, new j4r(bxm.f), bxm.t), mcm.c);
        this.h = w3p1.o(new l4r(new wlu(jd11Var.b(jo70.class)), 2, bxm.X, new j4r(bxm.U0), bxm.Y), bxm.V0);
        this.d = z0o1.j(new zwm(this, (byte) 0), axm.a, new zwm(this, (byte) 1), 4);
        this.i = n3o1.q(this).a(new cml(this, (byte) 7), fdm.P0);
        j2i j2iVar = new j2i(-1365914114, new bfm(this, (byte) 9), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public static List j(wk11 wk11Var) {
        smc0 smc0VarN = k4p1.n();
        smc0VarN.addAll(wk11Var.b);
        xk11 xk11Var = wk11Var.c;
        xk11 xk11Var2 = xk11Var instanceof xk11 ? xk11Var : null;
        if (xk11Var2 != null) {
            smc0VarN.add(xk11Var2.b);
        }
        return o7h.j0(k4p1.k(smc0VarN));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0032  */
    /* JADX WARN: Code duplicated, block: B:7:0x002a  */
    public static xdh0 k(List list, pfj1 pfj1Var) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            tdh0 tdh0Var = tdh0.b;
            tdh0 tdh0Var2 = tdh0.a;
            if (!zHasNext) {
                int size = arrayList.size();
                atj1 atj1Var = pfj1Var.c;
                List list3 = atj1Var.b;
                if (size >= list3.size()) {
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            if (((tdh0) it2.next()) == tdh0Var2) {
                            }
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int i = 0;
                    int i2 = 0;
                    for (Object obj : list3) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            p7h.T();
                            throw null;
                        }
                        if (o7h.t0(i2, arrayList) == tdh0Var) {
                            arrayList2.add(obj);
                        }
                        i2 = i3;
                    }
                    List listB = u1p1.B(pfj1Var);
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : listB) {
                        int i4 = i + 1;
                        if (i < 0) {
                            p7h.T();
                            throw null;
                        }
                        ((Number) obj2).intValue();
                        if (o7h.t0(i, arrayList) == tdh0Var) {
                            arrayList3.add(obj2);
                        }
                        i = i4;
                    }
                    if (arrayList2.isEmpty()) {
                        return new udh0(pfj1Var);
                    }
                    return new vdh0(new pfj1(pfj1Var.a, pfj1Var.b, new atj1(atj1Var.a, arrayList2), pfj1Var.d, pfj1Var.e, pfj1Var.f, arrayList3));
                }
                return new wdh0(pfj1Var);
            }
            i1r i1rVar = (k1r) it.next();
            if (u890.j(i1rVar, j1r.a)) {
                tdh0Var = tdh0Var2;
            } else {
                boolean z = i1rVar instanceof h1r;
                tdh0 tdh0Var3 = tdh0.c;
                if (z) {
                    tdh0Var = tdh0Var3;
                } else {
                    if (!(i1rVar instanceof i1r)) {
                        eg.o();
                        return null;
                    }
                    atd atdVar = (atd) i1rVar.a;
                    k1r k1rVar = atdVar.a;
                    if (k1rVar instanceof j1r) {
                        tdh0Var = tdh0Var2;
                    } else {
                        k1r k1rVar2 = atdVar.b;
                        if (k1rVar2 instanceof j1r) {
                            tdh0Var = tdh0Var2;
                        } else {
                            k1r k1rVar3 = atdVar.c;
                            if (k1rVar3 instanceof j1r) {
                                tdh0Var = tdh0Var2;
                            } else if (!(k1rVar instanceof i1r) || !(k1rVar2 instanceof i1r) || !(k1rVar3 instanceof i1r)) {
                                tdh0Var = tdh0Var3;
                            }
                        }
                    }
                }
            }
            arrayList.add(tdh0Var);
        }
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                return (lm1) this.i;
            case 1:
                return (eih1) this.i;
            case 2:
                return (ia00) this.i;
            case 3:
                return (ia00) this.i;
            case 4:
                return (eih1) this.i;
            case 5:
                return (ia00) this.i;
            case 6:
                return (ia00) this.h;
            case 7:
                return (ia00) this.d;
            case 8:
                return (hy00) this.i;
            case 9:
                return (ybo) this.i;
            case 10:
                return (ybo) this.i;
            case 11:
                return (eih1) this.i;
            case 12:
                return (ybo) this.i;
            case 13:
                return (ia00) this.i;
            case 14:
                return (azg) this.i;
            case 15:
                return (ia00) this.i;
            case 16:
                return (hy00) this.i;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return (ia00) this.i;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (ia00) this.i;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return (eih1) this.i;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return (ia00) this.i;
            default:
                return (eih1) this.i;
        }
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                break;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                break;
        }
        return this.e;
    }

    public final d0r e() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (d0r) obj;
            case 1:
                return (d0r) obj;
            case 2:
                return (d0r) obj;
            case 3:
                return (d0r) obj;
            case 4:
                return (d0r) obj;
            case 5:
                return (d0r) obj;
            case 6:
                return (d0r) obj;
            case 7:
                return (d0r) obj;
            case 8:
                return (d0r) obj;
            case 9:
                return (d0r) obj;
            case 10:
                return (d0r) obj;
            case 11:
                return (rzq) this.f;
            case 12:
                return (d0r) obj;
            case 13:
                return (d0r) obj;
            case 14:
                return (d0r) obj;
            case 15:
                return (d0r) obj;
            case 16:
                return (d0r) obj;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return (d0r) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (d0r) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return (d0r) obj;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return (d0r) obj;
            default:
                return (d0r) obj;
        }
    }

    public void f(cm1 cm1Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1049828214);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(cm1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = cm1Var.e;
            String str = cm1Var.f;
            boolean zH = x340Var.h(z) | x340Var.g(str);
            Object objT = x340Var.T();
            if (zH || objT == m4cVar) {
                if (z) {
                    objT = ul1.a;
                } else {
                    if (str == null) {
                        str = "";
                    }
                    objT = new tl1(str);
                }
                x340Var.s0(objT);
            }
            vl1 vl1Var = (vl1) objT;
            qim0 qim0VarN = anm1.N(z ? "standard_added_element_button" : "standard_add_to_element_button", nim0.a);
            ldx ldxVar = ldx.c;
            boolean zI = x340Var.i(vl1Var) | ((i2 & 112) == 32);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new y4(iu30Var, vl1Var, (byte) 18);
                x340Var.s0(objT2);
            }
            wro1.h(new gbx(z50.c, (Function0) objT2), ldxVar, qim0VarN, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(-243990131, new ab(cm1Var, (byte) 23), x340Var), x340Var, 0, 6, 1016);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xx(this, cm1Var, iu30Var, i, (byte) 5);
        }
    }

    public void g(List list, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1349839768);
        int i2 = i | (b0kVar2.g(list) ? 4 : 2) | (b0kVar2.i(this) ? 32 : 16);
        if (b0kVar2.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            boolean z = (i2 & 14) == 4;
            Object objT = b0kVar2.T();
            Object obj = objT;
            if (z || objT == m4cVar) {
                List<uv11> list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                for (uv11 uv11Var : list2) {
                    arrayList.add(((zs11) this.f).a((d0r) this.b, new ls11((ds11) null, (ds11) null, (ds11) null, (ds11) null, (iu30) null, (iu30) null, (qrk) null, (iu30) null, (iu30) null, (oe3) this.g, ns80.d1, 2, (o27) null, (gye1) null, kpc1.a, (sb2) null, (rru) null, false, (o3r) null, (o3r) null, (o3r) null, (o3r) null, (o3r) this.h, (o3r) null, (cv11) null, (y5z) null, (bnw0) null, (bt11) null, 2, (o3r) null, -33574401, 495), (nu11) null));
                }
                b0kVar2.s0(arrayList);
                obj = arrayList;
            }
            List list3 = (List) obj;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = uyn1.B(u291.f(nim0Var, 1.0f), 0.0f, cvxVar.a, 0.0f, 0.0f, 13);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarB);
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
            nko1.H(mbhVarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            String strO0 = cwl1.o0(b0kVar2, 2131955402);
            uwr uwrVar2 = cbx.a;
            uwo1.e(strO0, uyn1.z(16.0f, 0.0f, 2, nim0Var), cbx.d(b0kVar2).e, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2040);
            b0kVar2 = b0kVar2;
            op71.g(b0kVar2, u291.h(nim0Var, 8.0f));
            b0kVar2.i0(2090221775);
            int size = list3.size();
            for (int i3 = 0; i3 < size; i3++) {
                tyq tyqVar = (tyq) list3.get(i3);
                Integer numValueOf = Integer.valueOf(i3);
                boolean zE = b0kVar2.e(i3);
                Object objT2 = b0kVar2.T();
                if (zE || objT2 == m4cVar) {
                    objT2 = new uv4(i3, (byte) 22);
                    b0kVar2.s0(objT2);
                }
                dgo1.c(numValueOf, (iu30) objT2, apo.r(-1911915347, new p4w(tyqVar, list, i3, (byte) 0), b0kVar2), b0kVar2, 384);
            }
            b0kVar2.r(false);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new o1t(this, list, i, (byte) 19);
        }
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                return (js20) this.d;
            case 1:
                return (js20) this.d;
            case 2:
                return (js20) this.d;
            case 3:
                return (js20) this.d;
            case 4:
                return (js20) this.d;
            case 5:
                return (js20) this.d;
            case 6:
                return (js20) this.d;
            case 7:
                return (rey0) this.c;
            case 8:
                return (js20) this.d;
            case 9:
                return (js20) this.d;
            case 10:
                return (js20) this.d;
            case 11:
                return (js20) this.d;
            case 12:
                return (js20) this.d;
            case 13:
                return (js20) this.d;
            case 14:
                return (js20) this.d;
            case 15:
                return (js20) this.d;
            case 16:
                return (js20) this.d;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return (js20) this.d;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (js20) this.d;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return (js20) this.d;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return (ljm0) this.d;
            default:
                return (js20) this.d;
        }
    }

    public final f4r getData() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.h;
        switch (b) {
            case 0:
                return (km1) obj2;
            case 1:
                return (km1) obj2;
            case 2:
                return (o3r) obj;
            case 3:
                return (o3r) obj;
            case 4:
                return (f4r) obj2;
            case 5:
                return (o3r) obj;
            case 6:
                return (km1) obj;
            case 7:
                return (km1) this.i;
            case 8:
                return (o3r) obj;
            case 9:
                return (mch) obj2;
            case 10:
                return (mch) obj2;
            case 11:
                return (f4r) obj2;
            case 12:
                return (km1) obj2;
            case 13:
                return (n7l1) obj2;
            case 14:
                return (iik0) obj2;
            case 15:
                return (o3r) obj;
            case 16:
                return (iik0) obj2;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return (f4r) obj2;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (o3r) obj2;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return (o3r) obj;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return (o3r) obj;
            default:
                return h6l1.a;
        }
    }

    public void h(String str, String str2, String str3, long j, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-663638194);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.g(str3) ? 256 : 128) | (x340Var.f(j) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            c380 c380VarA = mqo1.A(Collections.singletonList(new phx(j, str, str2, str3)));
            String str4 = !ihc1.y0(str3) ? str3 : null;
            if (str4 == null) {
                str4 = str2;
            }
            fc11.a(c380VarA, (qim0) null, hcx.g, (hux) null, false, 0, (gbx) null, cwl1.n0(2131962908, new Object[]{str4}, x340Var), (idn0) null, x340Var, 392, 378);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rb9(this, str, str2, str3, j, i);
        }
    }

    public void i(d1x0 d1x0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1030915678);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(d1x0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        byte b = 0;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarN = anm1.N("standard_profile_element_button", nim0.a);
            ldx ldxVar = ldx.c;
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new g1x0(iu30Var, d1x0Var, b);
                x340Var.s0(objT);
            }
            wro1.h(new gbx(z50.c, (Function0) objT), ldxVar, qim0VarN, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(1295279477, new kpw0(d1x0Var, this, (byte) 1), x340Var), x340Var, 0, 6, 1016);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j5w0((Object) this, (Object) d1x0Var, (Object) iu30Var, i, (byte) 4);
        }
    }

    public nm1(d0r d0rVar, rm9 rm9Var, xho xhoVar) {
        this.a = (byte) 1;
        this.b = d0rVar;
        this.f = rm9Var;
        this.g = xhoVar;
        jd11 jd11Var = rc11.a;
        this.c = w3p1.n(new l4r(new xv00(jd11Var.b(jo70.class)), 1, fm9.X0, new j4r(fm9.T0), fm9.Y0), new l4r(new xv00(jd11Var.b(hll.class)), 2, fm9.V0, new j4r(fm9.U0), fm9.W0), tj8.Y0);
        this.h = new km1(this, (byte) 5);
        this.d = x3p1.n(new uv8(this, (byte) 9), fm9.S0, new mu6(this, (byte) 22), (o8n) null, (iu30) null, 24);
        j2i j2iVar = new j2i(552332865, new zk9(this, (byte) 4), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
        this.i = new eih1();
    }

    public nm1(h3p h3pVar, f7c f7cVar, d0r d0rVar) {
        byte b = 6;
        this.a = (byte) 6;
        this.f = h3pVar;
        this.g = f7cVar;
        this.b = d0rVar;
        this.d = x3p1.n(new xv70(this, (byte) 0), vu70.N0, g070.O0, (o8n) null, new xv70(this, (byte) 1), 8);
        this.h = n3o1.q(this).a(oe60.Q0, oe60.R0);
        this.c = new km1(this, (byte) 21);
        j2i j2iVar = new j2i(443496746, new wv60(this, b), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
        this.i = new idd1(new nd70(this, b));
    }

    public nm1(d0r d0rVar, Function0 function0, b8l1 b8l1Var, Function0 function1, iac0 iac0Var) {
        this.a = (byte) 21;
        this.b = d0rVar;
        this.f = function0;
        this.g = b8l1Var;
        this.h = function1;
        this.c = iac0Var;
        this.d = z0o1.j(new tak1(this, (byte) 12), z691.X, (iu30) null, 12);
        this.i = new eih1();
        j2i j2iVar = new j2i(-119338959, new l6i1(this, (byte) 22), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public nm1(d0r d0rVar, njm njmVar, qlb qlbVar, lwm lwmVar) {
        this.a = (byte) 3;
        this.b = d0rVar;
        this.f = njmVar;
        this.g = qlbVar;
        this.h = lwmVar;
        this.c = w3p1.o(new l4r(hvm.c, 1, bxm.a1, new j4r(bxm.Y0), bxm.b1), bxm.Z0);
        this.d = z0o1.j(new nxm(this, (byte) 0), oxm.a, new nxm(this, (byte) 1), 4);
        this.i = n3o1.q(this).a(new cml(this, (byte) 8), fdm.Q0);
        j2i j2iVar = new j2i(262200958, new bfm(this, (byte) 10), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public nm1(gw70 gw70Var, lzn0 lzn0Var, u9u0 u9u0Var, d0r d0rVar, o8n o8nVar) {
        this.a = (byte) 15;
        this.f = gw70Var;
        this.g = lzn0Var;
        this.h = u9u0Var;
        this.b = d0rVar;
        jd11 jd11Var = rc11.a;
        this.c = w3p1.n(new l4r(new xv00(jd11Var.b(jo70.class)), 1, ent0.b1, new j4r(ent0.X0), ent0.c1), new l4r(new xv00(jd11Var.b(xkk1.class)), 2, ent0.Z0, new j4r(ent0.Y0), ent0.a1), fnt0.t);
        this.d = a4p1.h(new pvt0(this, (byte) 0), ent0.W0, fnt0.i, o8nVar, new pvt0(this, (byte) 1));
        this.i = n3o1.q(this).a(e9t0.Z0, e9t0.a1);
        j2i j2iVar = new j2i(841648657, new t9r0(this, (byte) 26), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public nm1(d0r d0rVar, gw70 gw70Var, lzn0 lzn0Var) {
        this.a = (byte) 7;
        this.f = gw70Var;
        this.g = lzn0Var;
        this.b = d0rVar;
        this.h = new idd1(new pr90(this, (byte) 17));
        this.c = k1o1.p();
        this.d = n3o1.q(this).a(lta0.f, lta0.g);
        j2i j2iVar = new j2i(1722181479, new pba0(this, (byte) 8), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
        this.i = new km1(this, (byte) 23);
    }

    public nm1(d0r d0rVar, String str, e9c0 e9c0Var, vvu0 vvu0Var) {
        this.a = (byte) 8;
        this.b = d0rVar;
        this.f = str;
        this.g = e9c0Var;
        this.h = vvu0Var;
        this.c = w3p1.n(new l4r(jd0.D, 3, l1d0.P0, new j4r(new t7d0(this, (byte) 2)), l1d0.Q0), new l4r(pwc0.e, 3, l1d0.R0, new j4r(new t7d0(this, (byte) 3)), l1d0.S0), new s2c0((Object) this, (byte) 13));
        this.d = x3p1.n(new t7d0(this, (byte) 0), l1d0.O0, x5d0.c, (o8n) null, new t7d0(this, (byte) 1), 8);
        this.i = n3o1.r(this).c(i2d0.h, i2d0.i);
        j2i j2iVar = rvi.a;
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public nm1(rzq rzqVar, szj szjVar, kly0 kly0Var) {
        mch mchVar;
        this.a = (byte) 11;
        this.f = rzqVar;
        this.b = szjVar;
        this.g = kly0Var;
        jd11 jd11Var = rc11.a;
        o3r o3rVarM = w3p1.m(new l4r(new xv00(jd11Var.b(nbw0.class)), 3, zdh0.d, new j4r(zdh0.t), zdh0.e), new l4r(new xv00(jd11Var.b(yo60.class)), 3, zdh0.f, new j4r(zdh0.X), zdh0.g), new l4r(new xv00(jd11Var.b(jo70.class)), 3, zdh0.h, new j4r(zdh0.Y), zdh0.i), aeh0.a);
        this.c = o3rVarM;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new h4r(zdh0.c, o3rVarM));
        if (arrayList.isEmpty()) {
            mchVar = i13.j;
        } else {
            mchVar = arrayList.size() == 1 ? (f4r) o7h.q0(arrayList) : new mch(arrayList);
        }
        this.h = mchVar;
        this.d = x3p1.n(new z6h0(this, (byte) 5), zdh0.b, new ry90((Object) this, (byte) 16), (o8n) null, (iu30) null, 24);
        this.i = new eih1();
        j2i j2iVar = new j2i(2026860252, new qcd0(this, (byte) 27), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public nm1(d0r d0rVar, l3p l3pVar) {
        mch mchVar;
        this.a = (byte) 4;
        this.b = d0rVar;
        this.f = l3pVar;
        idd1 idd1Var = new idd1(new ots(this, (byte) 20));
        this.g = idd1Var;
        jd11 jd11Var = rc11.a;
        o3r o3rVarN = w3p1.n(new l4r(new xv00(jd11Var.b(jo70.class)), 2, ket.X0, new j4r(ket.V0), ket.Y0), new l4r(new xv00(jd11Var.b(xkk1.class)), 2, ket.Z0, new j4r(ket.W0), ket.a1), szr.d1);
        this.c = o3rVarN;
        ArrayList arrayList = new ArrayList();
        arrayList.add(o3rVarN);
        arrayList.add(new h4r(ket.U0, ((hlt) idd1Var.getValue()).c));
        if (arrayList.isEmpty()) {
            mchVar = i13.j;
        } else {
            mchVar = arrayList.size() == 1 ? (f4r) o7h.q0(arrayList) : new mch(arrayList);
        }
        this.h = mchVar;
        this.d = z0o1.j(new nit(this, (byte) 1), szr.c1, (iu30) null, 12);
        this.i = new eih1();
        j2i j2iVar = new j2i(-1817325605, new i6r(this, (byte) 28), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public nm1(uq8 uq8Var, d0r d0rVar, String str, kmj1 kmj1Var) {
        this.a = (byte) 19;
        this.f = uq8Var;
        this.b = d0rVar;
        this.g = str;
        this.h = kmj1Var;
        imj1 imj1VarB = kmj1.b(new xwa1(this, (byte) 1));
        qva1 qva1Var = qva1.g;
        l4r l4rVar = new l4r(b2v.a, 2, qva1.X, new j4r(qva1Var), qva1.Y);
        jd11 jd11Var = rc11.a;
        this.c = w3p1.j(l4rVar, new l4r(new wlu(jd11Var.b(hll.class)), 2, qva1.Z, new j4r(qva1.h), qva1.N0), new l4r(new xv00(jd11Var.b(ro7.class)), 2, qva1.O0, new j4r(qva1.i), qva1.P0), new l4r(pwc0.s, 2, qva1.Q0, new j4r(qva1.t), qva1.R0), imj1VarB.a, imj1VarB.b, new wcy0(this, (byte) 12));
        this.d = x3p1.n(new xwa1(this, (byte) 0), qva1.f, nva1.c, (o8n) null, (iu30) null, 24);
        this.i = new eih1();
        j2i j2iVar = new j2i(1831226691, new u491(this, (byte) 18), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public nm1(gw70 gw70Var, vvp vvpVar, d0r d0rVar, xho xhoVar) {
        umf0 umf0Var;
        mch mchVar;
        this.a = (byte) 17;
        this.f = gw70Var;
        this.b = d0rVar;
        switch (vvpVar.a) {
            case 0:
                umf0Var = new umf0(xhoVar, (lzn0) ((nwp) vvpVar.b.c).G.get());
                break;
            default:
                umf0Var = new umf0(xhoVar, (lzn0) vvpVar.b.c.U0.get());
                break;
        }
        this.g = umf0Var;
        jd11 jd11Var = rc11.a;
        o3r o3rVarN = w3p1.n(new l4r(new xv00(jd11Var.b(jo70.class)), 2, ej11.i, new j4r(ej11.g), ej11.t), new l4r(new xv00(jd11Var.b(xkk1.class)), 2, ej11.X, new j4r(ej11.h), ej11.Y), h211.N0);
        this.c = o3rVarN;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new h4r(new ldz0(this, (byte) 17), o3rVarN));
        if (arrayList.isEmpty()) {
            mchVar = i13.j;
        } else {
            mchVar = arrayList.size() == 1 ? (f4r) o7h.q0(arrayList) : new mch(arrayList);
        }
        this.h = mchVar;
        this.d = x3p1.n(new ak01(this, (byte) 18), ej11.e, new fk01(this, (byte) 7), (o8n) null, (iu30) null, 24);
        this.i = n3o1.q(this).a(ok11.c, ok11.d);
        j2i j2iVar = new j2i(726313142, new dr01(this, (byte) 17), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public nm1(d0r d0rVar, v6q v6qVar, iu30 iu30Var) {
        this.a = (byte) 14;
        this.b = d0rVar;
        this.f = iu30Var;
        this.g = v6qVar.a(d0rVar, new vv70(this, (lnm) null, (byte) 28));
        this.h = new iik0((Object) this, (byte) 1);
        jd11 jd11Var = rc11.a;
        this.c = w3p1.n(new l4r(new xv00(jd11Var.b(jo70.class)), 1, qkk0.R0, new j4r(qkk0.P0), qkk0.S0), new l4r(new xv00(jd11Var.b(xkk1.class)), 1, qkk0.T0, new j4r(qkk0.Q0), qkk0.U0), qlk0.c);
        this.d = x3p1.n(new plk0(this, (byte) 0), qkk0.N0, qlk0.b, (o8n) null, new plk0(this, (byte) 1), 8);
        this.i = new azg(qkk0.O0, n3o1.q(this).a(w7k0.c1, w7k0.d1));
        j2i j2iVar = new j2i(842032715, new y3i0(this, (byte) 29), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public nm1(zs11 zs11Var, d0r d0rVar, oe3 oe3Var) {
        this.a = (byte) 5;
        this.f = zs11Var;
        this.b = d0rVar;
        this.g = oe3Var;
        this.c = w3p1.o(new l4r(hvm.c, 1, a4w.X, new j4r(a4w.e), a4w.Y), a4w.f);
        jd11 jd11Var = rc11.a;
        this.h = w3p1.n(new l4r(new wlu(jd11Var.b(jo70.class)), 2, a4w.g, new j4r(a4w.Z), a4w.h), new l4r(new wlu(jd11Var.b(xkk1.class)), 2, a4w.i, new j4r(a4w.N0), a4w.t), fdv.P0);
        this.d = x3p1.n(new nit(this, (byte) 29), a4w.d, fdv.O0, (o8n) null, (iu30) null, 24);
        this.i = n3o1.q(this).a(lnv.i, lnv.t);
        j2i j2iVar = new j2i(-1900389456, new ent(this, (byte) 18), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public nm1(d0r d0rVar, zmg1 zmg1Var, tag1 tag1Var, otl0 otl0Var) {
        this.a = (byte) 20;
        this.b = d0rVar;
        this.f = zmg1Var;
        this.g = tag1Var;
        this.h = otl0Var;
        this.c = w3p1.o(new l4r(new xv00(rc11.a.b(ddz.class)), 1, zdg1.W0, new j4r(zdg1.U0), zdg1.X0), zdg1.V0);
        this.d = h7w.B(zdg1.T0, null, null, new xmg1(this, (byte) 0), 6);
        this.i = n3o1.q(this).a(new xmg1(this, (byte) 1), vrf1.a1);
        j2i j2iVar = doj.b;
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public nm1(d0r d0rVar, f1n0 f1n0Var, jq4 jq4Var) {
        this.a = (byte) 16;
        this.f = f1n0Var;
        this.b = d0rVar;
        this.g = jq4Var.s() ? d0rVar : null;
        this.h = new iik0((Object) this, (byte) 10);
        jd11 jd11Var = rc11.a;
        this.c = w3p1.n(new l4r(new wlu(jd11Var.b(jo70.class)), 2, p7w0.d1, new j4r(p7w0.b1), p7w0.e1), new l4r(new wlu(jd11Var.b(xkk1.class)), 2, k1x0.b, new j4r(p7w0.c1), k1x0.c), j1x0.a);
        this.d = x3p1.n(new i1x0(this, (byte) 0), p7w0.Z0, gbw0.i, (o8n) null, new i1x0(this, (byte) 1), 8);
        this.i = c680.C(p7w0.a1, nzv0.S0, nzv0.T0);
        j2i j2iVar = new j2i(443544398, new qsu0(this, (byte) 12), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public nm1(d0r d0rVar, zwm1 zwm1Var, agc0 agc0Var) {
        this.a = (byte) 18;
        this.b = d0rVar;
        this.f = zwm1Var;
        this.g = agc0Var;
        jd11 jd11Var = rc11.a;
        o3r o3rVarM = w3p1.m(new l4r(new wlu(jd11Var.b(jo70.class)), 2, o641.X, new j4r(o641.h), o641.Y), new l4r(new wlu(jd11Var.b(xkk1.class)), 2, o641.Z, new j4r(o641.i), o641.N0), new l4r(pwc0.b, 2, o641.O0, new j4r(o641.t), o641.P0), krz0.Q0);
        this.c = o3rVarM;
        this.h = o3rVarM;
        this.d = x3p1.n(new x941(this, (byte) 0), new x941(this, (byte) 1), new u841((Object) this, (byte) 1), (o8n) null, o641.g, 8);
        this.i = n3o1.q(this).a(vs31.g, vs31.h);
        j2i j2iVar = new j2i(1294504286, new hg31(this, (byte) 7), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public nm1(d0r d0rVar, bl3 bl3Var, oj3 oj3Var, jq4 jq4Var) {
        byte b = 0;
        this.a = (byte) 0;
        this.f = oj3Var;
        this.b = d0rVar;
        this.g = jq4Var.p() ? d0rVar : null;
        this.h = new km1(this, b);
        this.c = w3p1.n(new l4r(hvm.b, 2, im1.h, new j4r(im1.f), im1.i), new l4r(new wlu(rc11.a.b(jo70.class)), 2, im1.t, new j4r(im1.g), im1.X), ah1.i);
        this.d = x3p1.n(new d4(this, bl3Var, (byte) 20), im1.c, ah1.g, (o8n) null, new jm1(this, (byte) 0), 8);
        this.i = new lm1(c680.C(im1.e, mm1.d, mm1.e), (byte) 0);
        j2i j2iVar = new j2i(-596267922, new r1(this, (byte) 19), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public nm1(d0r d0rVar, rxj0 rxj0Var, r7j0 r7j0Var) {
        this.a = (byte) 13;
        this.b = d0rVar;
        this.f = rxj0Var;
        this.g = r7j0Var;
        this.h = new n7l1(this, (byte) 1);
        jd11 jd11Var = rc11.a;
        this.c = w3p1.n(new l4r(new xv00(jd11Var.b(jo70.class)), 1, v7k0.Z0, new j4r(v7k0.d1), v7k0.a1), new l4r(new xv00(jd11Var.b(xkk1.class)), 1, v7k0.b1, new j4r(v7k0.e1), v7k0.c1), m2j0.Y0);
        this.d = x3p1.n(new qak0(this, (byte) 0), v7k0.Y0, m2j0.X0, (o8n) null, new qak0(this, (byte) 1), 8);
        j2i j2iVar = new j2i(-1708973828, new y3i0(this, (byte) 22), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
        this.i = n3o1.q(this).a(w7k0.f, w7k0.g);
    }

    public nm1(d0r d0rVar, r7j0 r7j0Var) {
        this.a = (byte) 12;
        this.b = d0rVar;
        this.f = r7j0Var;
        jd11 jd11Var = rc11.a;
        this.c = w3p1.n(new l4r(new xv00(jd11Var.b(hll.class)), 1, v7k0.U0, new j4r(v7k0.O0), v7k0.V0), new l4r(new xv00(jd11Var.b(uia.class)), 2, v7k0.Q0, new j4r(v7k0.P0), v7k0.R0), m2j0.W0);
        this.g = w3p1.o(new l4r(new xv00(jd11Var.b(zge1.class)), 2, v7k0.S0, new j4r(v7k0.W0), v7k0.T0), v7k0.X0);
        this.h = new km1(this, (byte) 28);
        this.d = x3p1.n(new jak0(this, (byte) 0), v7k0.N0, m2j0.V0, (o8n) null, new jak0(this, (byte) 1), 8);
        this.i = new ybo(n3o1.q(this).a(w7k0.d, w7k0.e), (byte) 6);
        j2i j2iVar = w1j.a;
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public nm1(mjm mjmVar, d0r d0rVar, bv40 bv40Var) {
        this.a = (byte) 9;
        i13 i13Var = i13.c;
        this.f = mjmVar;
        this.b = d0rVar;
        this.g = bv40Var;
        jd11 jd11Var = rc11.a;
        o3r o3rVarK = w3p1.k(new l4r(new wlu(jd11Var.b(jo70.class)), 1, j2g0.d1, new j4r(j2g0.U0), j2g0.e1), new l4r(new wlu(jd11Var.b(xkk1.class)), 3, wlg0.d, new j4r(j2g0.V0), wlg0.e), new l4r(new wlu(jd11Var.b(jo70.class)), 1, wlg0.b, new j4r(j2g0.W0), wlg0.c), new l4r(new wlu(jd11Var.b(xkk1.class)), 2, j2g0.Z0, new j4r(j2g0.X0), j2g0.a1), new l4r(new xv00(jd11Var.b(z6a1.class)), 2, j2g0.b1, new j4r(j2g0.Y0), j2g0.c1), qsj.O0);
        this.c = o3rVarK;
        this.h = i6p1.q(o3rVarK, i13Var);
        this.d = x3p1.n(new vlg0(this, (byte) 0), j2g0.T0, new ry90((Object) this, (byte) 13), (o8n) null, new vlg0(this, (byte) 1), 8);
        this.i = new ybo(n3o1.q(this).a(clf0.a1, clf0.b1), (byte) 4);
        j2i j2iVar = new j2i(1221576675, new qcd0(this, (byte) 23), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public nm1(njm njmVar, d0r d0rVar, bv40 bv40Var) {
        this.a = (byte) 10;
        i13 i13Var = i13.u;
        this.f = njmVar;
        this.b = d0rVar;
        this.g = bv40Var;
        jd11 jd11Var = rc11.a;
        o3r o3rVarL = w3p1.l(new l4r(new wlu(jd11Var.b(jo70.class)), 2, wlg0.N0, new j4r(wlg0.t), wlg0.O0), new l4r(new wlu(jd11Var.b(xkk1.class)), 3, wlg0.T0, new j4r(wlg0.X), wlg0.U0), new l4r(hvm.c, 2, wlg0.P0, new j4r(wlg0.Y), wlg0.Q0), new l4r(new xv00(jd11Var.b(z6a1.class)), 2, wlg0.R0, new j4r(wlg0.Z), wlg0.S0), clf0.c1);
        this.c = o3rVarL;
        this.h = i6p1.q(o3rVarL, i13Var);
        this.d = x3p1.n(new hmg0(this, (byte) 0), wlg0.i, new ry90((Object) this, (byte) 14), (o8n) null, new hmg0(this, (byte) 1), 8);
        this.i = new ybo(n3o1.q(this).a(clf0.d1, clf0.e1), (byte) 5);
        j2i j2iVar = new j2i(-222089238, new qcd0(this, (byte) 24), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }
}
