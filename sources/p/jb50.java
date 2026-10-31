package p;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.mobius.First;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jb50 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jb50(Object obj, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:137:0x0543  */
    /* JADX WARN: Code duplicated, block: B:414:0x0546 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v17 */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        boolean z;
        ?? r4;
        rih1 rih1Var;
        Integer num;
        int i;
        List list;
        yvg1 yvg1Var;
        String str = "";
        switch (this.a) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    fra fraVar = een.N0;
                    qb50 qb50Var = (qb50) this.b;
                    nim0 nim0Var = nim0.a;
                    jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
                    hzj.A.getClass();
                    n4k n4kVar = hmb0.t1;
                    if (x340Var2.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(jw31VarA, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    t4n1.f(0, x340Var2, (qim0) null, qb50Var.e);
                    String strO0 = cwl1.o0(x340Var2, 2131956426);
                    uwr uwrVar = cbx.a;
                    uwo1.e(strO0, (qim0) null, cbx.d(x340Var2).h, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2042);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1.a;
            case 1:
                rpw0 rpw0Var = (rpw0) obj;
                Bundle bundle = (Bundle) obj2;
                if (bundle == null) {
                    p950 p950Var = rpw0Var.a;
                    v850 v850Var = ((sb50) this.b).e.a;
                    if (p950Var.equals(l950.a)) {
                        z = false;
                    } else if (p950Var.equals(m950.a) || p950Var.equals(n950.a)) {
                        z = true;
                    } else if (p950Var.equals(o950.a)) {
                        hhg1.n("Unspecified market type for the privacy policy");
                    } else {
                        eg.o();
                    }
                    return new qb50(p950Var, "https://www.spotify.com/legal/privacy-policy/plain", v850Var, z, false, false);
                }
                Parcelable parcelable = bundle.getParcelable("graduation_terms_model");
                if (parcelable != null) {
                    return (qb50) parcelable;
                }
                hhg1.n("Required value was null.");
                return null;
            case 2:
                bgs0 bgs0Var = (bgs0) obj;
                Bundle bundle2 = (Bundle) obj2;
                if (bundle2 == null) {
                    nc50 nc50Var = ((lc50) this.b).b;
                    String str2 = nc50Var.a;
                    dww0 dww0Var = bgs0Var.a;
                    return new jc50(str2, dww0Var.a, dww0Var.b, bgs0Var.d, bgs0Var.b, bgs0Var.c, nc50Var.b, false, false, false, false, "https://support.spotify.com/article/graduating-to-a-self-managed-account/plain/");
                }
                Parcelable parcelable2 = bundle2.getParcelable("graduation_view_request_model");
                if (parcelable2 != null) {
                    return (jc50) parcelable2;
                }
                hhg1.n("Required value was null.");
                return null;
            case 3:
                dk50 dk50Var = (dk50) this.b;
                c921.y(cto1.q(dk50Var.f.d.c), (o8n) null, 0, new f530((eji0) obj, dk50Var, (tqw) obj2, (lnm) null, (byte) 11), 3);
                return rih1.a;
            case 4:
                uvk0 uvk0VarE = ((hn50) this.b).e();
                uvk0VarE.getClass();
                x6h1 x6h1VarC = uvk0VarE.a.c();
                x6h1VarC.i.add(new a7h1("request_received_view", (String) null, (Integer) null, (String) null, "on_platform"));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = uvk0VarE.b;
                return k7h1Var.a();
            case 5:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                c380<u7q0> c380Var = ((w5q0) this.b).a;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zG = x340Var4.g(c380Var);
                    Object objT = x340Var4.T();
                    if (zG || objT == fkj0.X) {
                        ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
                        for (u7q0 u7q0Var : c380Var) {
                            String str3 = u7q0Var.b;
                            String str4 = u7q0Var.c;
                            Uri uri = u7q0Var.a;
                            arrayList.add(new w4i1(str3, str4, u7q0Var.d, uri != null ? uri.toString() : null));
                        }
                        objT = mqo1.A(arrayList);
                        x340Var4.s0(objT);
                    }
                    hcx hcxVar = hcx.e;
                    Parcelable.Creator creator = w4i1.CREATOR;
                    aqo1.f(6, 4, x340Var4, hcxVar, (c380) objT, (qim0) null);
                } else {
                    x340Var4.b0();
                }
                return rih1.a;
            case 6:
                rih1 rih1Var2 = rih1.a;
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    vu30 vu30Var = ((l260) this.b).a;
                    if (vu30Var == null) {
                        x340Var6.i0(1649067494);
                        r4 = 0;
                        x340Var6.r(false);
                        rih1Var = null;
                    } else {
                        r4 = 0;
                        c13.o(x340Var6, 1577216379, 0, vu30Var, x340Var6);
                        x340Var6.r(false);
                        rih1Var = rih1Var2;
                    }
                    if (rih1Var == null) {
                        x340Var6.i0(1577216767);
                        ujo1.i(x340Var6, (int) r4);
                    } else {
                        x340Var6.i0(1577215558);
                    }
                    x340Var6.r((boolean) r4);
                } else {
                    x340Var6.b0();
                }
                return rih1Var2;
            case 7:
                md5 md5Var = (md5) this.b;
                return new jpg0(new aso(f6o1.A(new w460((lo60) md5Var.b, false, false, false, (a1r0) null, 60), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new z5z(md5Var, (byte) 17)), v160.O0);
            case 8:
                return new jpg0(f6o1.A(new w460((lzn0) ((n9e) this.b).b, true, true, false, (a1r0) null, 56), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), v160.Q0);
            case 9:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    String str5 = ((vn60) this.b).c;
                    nim0 nim0Var2 = nim0.a;
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar = cbx.b(x340Var8).b;
                    cvx cvxVar2 = cbx.b(x340Var8).b;
                    eqr0.b(0, 0, str5, x340Var8, uyn1.B(nim0Var2, 8.0f, 0.0f, 4.0f, 0.0f, 10));
                } else {
                    x340Var8.b0();
                }
                return rih1.a;
            case 10:
                return sto1.n((ms60) obj2, (qv60) obj, ((xv60) this.b).t);
            case 11:
                rih1 rih1Var3 = rih1.a;
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                cx60 cx60Var = (cx60) this.b;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    Object objT2 = x340Var10.T();
                    m4c m4cVar = fkj0.X;
                    if (objT2 == m4cVar) {
                        objT2 = v8r.q(null);
                        x340Var10.s0(objT2);
                    }
                    ven0 ven0Var = (ven0) objT2;
                    Object objT3 = x340Var10.T();
                    if (objT3 == m4cVar) {
                        objT3 = v8r.q(Boolean.FALSE);
                        x340Var10.s0(objT3);
                    }
                    ven0 ven0Var2 = (ven0) objT3;
                    boolean zI = x340Var10.i(cx60Var) | x340Var10.i(ven0Var) | x340Var10.i(ven0Var2);
                    Object objT4 = x340Var10.T();
                    if (zI || objT4 == m4cVar) {
                        xd1 xd1Var = new xd1(cx60Var, ven0Var, ven0Var2, (lnm) null, (byte) 11);
                        x340Var10.s0(xd1Var);
                        objT4 = xd1Var;
                    }
                    qxd0.t(rih1Var3, x340Var10, (vu30) objT4);
                    nyx.a(2, (wux) null, apo.r(-750023045, new bp50(cx60Var, ven0Var, ven0Var2, (byte) 13), x340Var10), x340Var10, 3078, 6);
                } else {
                    x340Var10.b0();
                }
                return rih1Var3;
            case 12:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    nim0 nim0Var3 = nim0.a;
                    qim0 qim0VarN = anm1.N("icon.swatch", dug.f(u291.d(nim0Var3, 1.0f), u7h.b(u7h.b, 0.5f, 0.0f, 0.0f, 0.0f, 14), d4o1.a));
                    gra graVar = een.h;
                    q8d1 q8d1Var = (q8d1) this.b;
                    gfh0 gfh0VarC = t1c.c(graVar, false);
                    int iHashCode2 = Long.hashCode(x340Var12.T);
                    xos0 xos0VarM2 = x340Var12.m();
                    qim0 qim0VarE2 = zr7.E(x340Var12, qim0VarN);
                    hzj.A.getClass();
                    n4k n4kVar2 = hmb0.t1;
                    if (x340Var12.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var12.m0();
                    if (x340Var12.S) {
                        x340Var12.l(n4kVar2);
                    } else {
                        x340Var12.v0();
                    }
                    nko1.H(gfh0VarC, x340Var12, y580.O0);
                    nko1.H(xos0VarM2, x340Var12, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var12, y580.R0);
                    nko1.F(x340Var12);
                    nko1.H(qim0VarE2, x340Var12, y580.Y);
                    if (sl70.a[l1d.C(q8d1Var.d)] != 1) {
                        throw p3d1.k(x340Var12, -1671072452, false);
                    }
                    x340Var12.i0(-1671069732);
                    bmx bmxVar = bmx.c;
                    isl islVar = isl.a;
                    uwr uwrVar3 = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var12).g;
                    w0h1.a(bmxVar, islVar, u291.d(u291.r(nim0Var3, 16.0f), 1.0f), 0L, 0L, false, x340Var12, bmx.d | 48, 56);
                    x340Var12.r(false);
                    x340Var12.r(true);
                } else {
                    x340Var12.b0();
                }
                return rih1.a;
            case 13:
                ((Number) obj2).intValue();
                ((pm70) this.b).d((b0k) obj, czo1.p(7));
                return rih1.a;
            case 14:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                zs70 zs70Var = (zs70) this.b;
                x340 x340Var14 = x340Var13;
                if (!x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x340Var14.b0();
                } else if (zs70Var.h) {
                    x340Var14.i0(488894720);
                    boolean zE = x340Var14.e(zs70Var.c);
                    Object objT5 = x340Var14.T();
                    if (zE || objT5 == fkj0.X) {
                        objT5 = yv91.a(new jt70(zs70Var, (byte) 1));
                        x340Var14.s0(objT5);
                    }
                    String str6 = zs70Var.f;
                    String str7 = zs70Var.d;
                    String str8 = zs70Var.e;
                    int i2 = ((xfh0) ((tob1) objT5).getValue()).a;
                    qim0 qim0VarF = u291.f(nim0.a, 1.0f);
                    uwr uwrVar4 = cbx.a;
                    qim0 qim0VarF2 = dug.f(qim0VarF, ((vex) zex.a.e).g, d4o1.a);
                    cvx cvxVar3 = cbx.b(x340Var14).b;
                    cvx cvxVar4 = cbx.b(x340Var14).b;
                    m1p1.o(i2, 0, str6, str7, str8, x340Var14, anm1.N("play_button", uyn1.B(qim0VarF2, 0.0f, 8.0f, 0.0f, 16.0f, 5)));
                    x340Var14.r(false);
                } else {
                    x340Var14.i0(489528019);
                    x340Var14.r(false);
                }
                return rih1.a;
            case 15:
                hv70 hv70Var = (hv70) obj;
                ru70 ru70Var = (ru70) obj2;
                wu70 wu70Var = (wu70) this.b;
                boolean z2 = wu70Var.f;
                boolean z3 = wu70Var.g;
                l0x0 l0x0Var = wu70Var.Z;
                boolean z4 = wu70Var.h;
                boolean z5 = wu70Var.i;
                boolean z6 = wu70Var.X;
                Set set = ru70Var.b;
                x360 x360Var = hv70Var.b;
                List list2 = hv70Var.c;
                String str9 = hv70Var.a;
                List list3 = ru70Var.a;
                List list4 = list3;
                ArrayList arrayList2 = new ArrayList();
                int i3 = 0;
                for (Object obj3 : list4) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        p7h.T();
                        throw null;
                    }
                    mmr0 mmr0Var = (mmr0) obj3;
                    boolean z7 = z6;
                    String str10 = (String) mmr0Var.a;
                    i1r i1rVar = (k1r) mmr0Var.b;
                    if (set.contains(str10)) {
                        list = list3;
                    } else {
                        list = list3;
                        i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                        yvg1Var = i1rVar2 != null ? new yvg1(Integer.valueOf(i3), str10, i1rVar2.a) : null;
                        if (yvg1Var != null) {
                            arrayList2.add(yvg1Var);
                        }
                        list3 = list;
                        i3 = i4;
                        str = str;
                        z6 = z7;
                    }
                    if (yvg1Var != null) {
                        arrayList2.add(yvg1Var);
                    }
                    list3 = list;
                    i3 = i4;
                    str = str;
                    z6 = z7;
                }
                boolean z8 = z6;
                List list5 = list3;
                String str11 = str;
                if (arrayList2.isEmpty()) {
                    if (!list5.isEmpty() && list5.size() >= list2.size()) {
                        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                            Iterator it = list4.iterator();
                            do {
                                if (it.hasNext()) {
                                }
                            } while (!(((mmr0) it.next()).b instanceof j1r));
                        }
                        return new wmb1(str9, x360Var);
                    }
                    List<String> list6 = list2;
                    ArrayList arrayList3 = new ArrayList(q7h.U(list6, 10));
                    for (String str12 : list6) {
                        arrayList3.add(new lv70(str9));
                    }
                    return new pmb1(str9, arrayList3, x360Var);
                }
                ArrayList arrayList4 = new ArrayList(q7h.U(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    jo70 jo70Var = ((nu70) ((yvg1) it2.next()).c).c;
                    String str13 = jo70Var != null ? jo70Var.b : null;
                    if (str13 == null) {
                        str13 = str11;
                    }
                    arrayList4.add(str13);
                }
                boolean z9 = o7h.j0(arrayList4).size() > 1;
                ArrayList<mu70> arrayList5 = new ArrayList(q7h.U(arrayList2, 10));
                for (Iterator it3 = arrayList2.iterator(); it3.hasNext(); it3 = it3) {
                    yvg1 yvg1Var2 = (yvg1) it3.next();
                    boolean z10 = z3;
                    arrayList5.add(new mu70((String) yvg1Var2.b, ((Number) yvg1Var2.a).intValue(), hv70Var.a, r1p1.j(), hv70Var.f, z2, z10, hv70Var.e, z9, z4, l0x0Var, z8, 4096));
                    z5 = z5;
                    set = set;
                    list2 = list2;
                    str9 = str9;
                    z3 = z10;
                }
                Set set2 = set;
                List list7 = list2;
                String str14 = str9;
                if (z5) {
                    Iterator it4 = arrayList2.iterator();
                    Iterator it5 = arrayList5.iterator();
                    ArrayList arrayList6 = new ArrayList(Math.min(q7h.U(arrayList2, 10), q7h.U(arrayList5, 10)));
                    while (it4.hasNext() && it5.hasNext()) {
                        Object next = it4.next();
                        mu70 mu70Var = (mu70) it5.next();
                        nu70 nu70Var = (nu70) ((yvg1) next).c;
                        String strG = o1p1.G(nu70Var, mu70Var);
                        gw81 gw81Var = nu70Var.a;
                        String str15 = gw81Var.b;
                        String str16 = gw81Var.c;
                        boolean z11 = mu70Var.j && lnn1.l(nu70Var.f);
                        bu70 bu70VarH = ero1.h(strG, str15, str16, z11);
                        List listM = p7h.M(new String[]{strG, str15, str16});
                        if ((listM instanceof Collection) && listM.isEmpty()) {
                            i = 0;
                        } else {
                            Iterator it6 = listM.iterator();
                            i = 0;
                            while (it6.hasNext()) {
                                if (!ihc1.y0((String) it6.next()) && (i = i + 1) < 0) {
                                    p7h.S();
                                    throw null;
                                }
                            }
                        }
                        arrayList6.add(Integer.valueOf(bu70VarH.a() + ((!z11 || i >= 3 || ihc1.y0(str16)) ? 0 : 1)));
                    }
                    num = (Integer) o7h.F0(arrayList6);
                } else {
                    num = null;
                }
                ArrayList arrayList7 = new ArrayList(q7h.U(arrayList5, 10));
                for (mu70 mu70Var2 : arrayList5) {
                    arrayList7.add(new kv70(new mu70(mu70Var2.a, mu70Var2.b, mu70Var2.c, mu70Var2.d, mu70Var2.e, mu70Var2.f, mu70Var2.g, mu70Var2.h, mu70Var2.i, mu70Var2.j, mu70Var2.k, mu70Var2.l, num), str14));
                    set2 = set2;
                }
                Set set3 = set2;
                String str17 = hv70Var.a;
                x360 x360Var2 = hv70Var.b;
                ArrayList arrayList8 = new ArrayList(q7h.U(arrayList5, 10));
                Iterator it7 = arrayList5.iterator();
                while (it7.hasNext()) {
                    arrayList8.add(((mu70) it7.next()).a);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (Object obj4 : set3) {
                    if (list7.contains((String) obj4)) {
                        linkedHashSet.add(obj4);
                    }
                }
                return new kmb1(arrayList7, str17, x360Var2, arrayList8, linkedHashSet);
            case 16:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    ((hx70) this.b).b.a((qim0) null, x340Var16, 0);
                } else {
                    x340Var16.b0();
                }
                return rih1.a;
            case 17:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    eso1.e(((r8d1) this.b).d, isl.a, u291.d(anm1.N("image.swatch", nim0.a), 1.0f), (p3v) null, (zvx) null, (ecx) null, mif1.S0, (tl3) null, (ColorFilter) null, czo1.f(x340Var18), false, false, x340Var18, 1075539376, 0, 3456);
                } else {
                    x340Var18.b0();
                }
                return rih1.a;
            case 18:
                rih1 rih1Var4 = rih1.a;
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    kp5 kp5Var = (kp5) this.b;
                    s880 s880Var = (s880) kp5Var.a;
                    r880 r880Var = (r880) s880Var.c;
                    cir0 cir0Var = (cir0) s880Var.g;
                    c8o.l(cir0Var);
                    otw.c(new q880(r880Var, cir0Var, (ujp) ((jly0) kp5Var.e).get(), (ri41) ((jly0) kp5Var.f).get(), new a4d((q4d) ((jly0) kp5Var.g).get(), new qj0((q4d) ((jly0) kp5Var.g).get(), (ems0) ((jly0) kp5Var.h).get()), (sj30) ((jly0) kp5Var.d).get()), new cx0((byte) 16), new ts50(((Activity) s880Var.b).getApplicationContext(), (yqg) s880Var.f), new w8r0(false, (luk) s880Var.e), cwl1.C(cir0Var.g())), rih1Var4, (qim0) null, (ipb1) null, x340Var20, 48, 12);
                } else {
                    x340Var20.b0();
                }
                return rih1Var4;
            case 19:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    tjp tjpVar = ((e880) this.b).b;
                    cir0 cir0Var2 = (cir0) x340Var22.k(k2r0.a);
                    jc9 jc9Var = ((gzj) x340Var22.k(hhr0.a)).c;
                    qjp qjpVar = (qjp) tjpVar.a.b;
                    f880 f880Var = (f880) qjpVar.b;
                    Activity activity = (Activity) f880Var.b.get();
                    c8o.l(activity);
                    r880 r880Var2 = (r880) qjpVar.c;
                    RetrofitMaker retrofitMaker = (RetrofitMaker) f880Var.c.get();
                    c8o.l(retrofitMaker);
                    luk lukVar = (luk) f880Var.e.get();
                    c8o.l(lukVar);
                    yqg yqgVar = (yqg) f880Var.d.get();
                    c8o.l(yqgVar);
                    q8n q8nVar = (q8n) f880Var.f.get();
                    c8o.l(q8nVar);
                    h4p1.b(6, apo.r(2024601447, new jb50(new kp5(new s880(activity, r880Var2, retrofitMaker, lukVar, yqgVar, q8nVar, cir0Var2, jc9Var)), (byte) 18), x340Var22), x340Var22);
                } else {
                    x340Var22.b0();
                }
                return rih1.a;
            case 20:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    String str18 = ((c10) this.b).b;
                    uwr uwrVar5 = cbx.a;
                    uwo1.e(str18, u291.f(nim0.a, 1.0f), cbx.d(x340Var24).k, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var24, 0, 0, 2024);
                } else {
                    x340Var24.b0();
                }
                return rih1.a;
            case 21:
                ((Number) obj2).intValue();
                j6p1.c((gd80) this.b, (b0k) obj, czo1.p(1));
                return rih1.a;
            case 22:
                return f6o1.A(new kpg0(((ncq) ((md5) this.b).b).a((iac0) obj2), td80.b), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ne80 ne80Var = (ne80) obj;
                oe80 oe80Var = (oe80) obj2;
                oe80 oe80VarA = oe80.a(oe80Var, (m6p1) null, (o6p1) null, ne80Var.b, ne80Var.a, ne80Var.c, 3);
                m6p1 m6p1Var = oe80Var.a;
                if (m6p1Var instanceof de80) {
                    m6p1Var = ((se80) this.b).f;
                }
                o6p1 o6p1Var = oe80Var.b;
                se80 se80Var = (se80) this.b;
                xj61 xj61Var = new xj61();
                if (m6p1Var instanceof de80) {
                    if (se80Var.g.compareAndSet(false, true)) {
                        xj61Var.add(new ie80(ne80Var.a, ne80Var.b, ne80Var.c));
                    }
                } else if ((m6p1Var instanceof be80) && (o6p1Var instanceof fe80)) {
                    xj61Var.add(new he80(((be80) m6p1Var).c, ne80Var.b, ne80Var.c));
                }
                return First.c(oe80VarA, cwl1.j(xj61Var));
            case 24:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    String str19 = ((s220) this.b).d;
                    uwr uwrVar6 = cbx.a;
                    uwo1.e(str19, (qim0) null, (lee1) null, cbx.a(x340Var26).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var26, 0, 0, 2038);
                } else {
                    x340Var26.b0();
                }
                return rih1.a;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ((Number) obj2).intValue();
                b9p1.f((vl80) this.b, (b0k) obj, czo1.p(1));
                return rih1.a;
            case 26:
                ez80 ez80Var = (ez80) this.b;
                return new aso(f6o1.A(new kpg0(new bz80(ez80Var.a, ez80Var.b, ez80Var.l, ez80Var.d, ez80Var.e, ez80Var.f.a(ez80Var.g), ez80Var.h, ez80Var.j, ez80Var.k, ez80Var.m, ez80Var.n, ez80Var.i, new fc3(ez80Var, (byte) 12)), new dz80(ez80Var, (byte) 0)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new dz80(ez80Var, (byte) 1));
            case 27:
                ((Number) obj2).intValue();
                x340 x340Var27 = (b0k) obj;
                x340Var27.i0(1302871867);
                vnr0 vnr0VarA = shy0.a(((SceneTemplate.IntroContent.WelcomeMessageCardV3) this.b).q(), x340Var27);
                x340Var27.r(false);
                return vnr0VarA;
            case 28:
                x340 x340Var28 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                ee90 ee90Var = ((fe90) this.b).b;
                x340 x340Var29 = x340Var28;
                if (x340Var29.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    boolean zI2 = x340Var29.i(ee90Var);
                    Object objT6 = x340Var29.T();
                    if (zI2 || objT6 == m4cVar2) {
                        p350 p350Var = new p350(0, ee90Var, ee90.class, "navigateToInviteOptions", "navigateToInviteOptions()V", 0, (byte) 8);
                        x340Var29.s0(p350Var);
                        objT6 = p350Var;
                    }
                    Function0 function0 = (Function0) objT6;
                    boolean zI3 = x340Var29.i(ee90Var);
                    Object objT7 = x340Var29.T();
                    if (zI3 || objT7 == m4cVar2) {
                        p350 p350Var2 = new p350(0, ee90Var, ee90.class, "navigateToLearnMore", "navigateToLearnMore()V", 0, (byte) 9);
                        x340Var29.s0(p350Var2);
                        objT7 = p350Var2;
                    }
                    k1u.j(function0, (Function0) objT7, null, x340Var29, 0);
                } else {
                    x340Var29.b0();
                }
                return rih1.a;
            default:
                x340 x340Var30 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                x340 x340Var31 = x340Var30;
                if (x340Var31.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    aq90 aq90Var = (aq90) this.b;
                    qj0 qj0Var = aq90Var.b;
                    bq90 bq90Var = aq90Var.c.a;
                    ye10 ye10Var = bq90Var.a;
                    ye10 ye10Var2 = bq90Var.b;
                    String str20 = ye10Var.a;
                    String str21 = ye10Var.b;
                    String str22 = ye10Var.c;
                    phx phxVar = new phx(8, 0L, str22 == null ? "" : str22, str20, str21);
                    String str23 = ye10Var2.a;
                    String str24 = ye10Var2.b;
                    String str25 = ye10Var2.c;
                    otw.c(qj0Var, new xp90(phxVar, new phx(8, 0L, str25 == null ? "" : str25, str23, str24), ye10Var2.b), (qim0) null, (ipb1) null, x340Var31, 64, 12);
                } else {
                    x340Var31.b0();
                }
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jb50(Object obj, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }
}
