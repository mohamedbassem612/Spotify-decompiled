package p;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class o0d extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0d(String str, List list, frr0 frr0Var) {
        super(1);
        this.a = (byte) 27;
        this.c = str;
        this.b = list;
        this.d = frr0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj) {
        g3d0 g3d0Var;
        Set set;
        qha1 qha1Var;
        ou80 ou80Var;
        boolean z;
        ou80 ou80Var2;
        ou80 ou80Var3;
        byte b = this.a;
        byte b2 = 9;
        byte b3 = 5;
        str = null;
        String str = null;
        str = null;
        String str2 = null;
        int i = 0;
        int i2 = 2;
        int i3 = 1;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                List list = (List) obj4;
                ((rtb0) obj).e(list.size(), new qf1(list, (byte) 26), new qf1(list, (byte) 27), new j2i(802480018, new rf1(list, obj3, (iu30) obj2, (byte) 2), true));
                return rih1Var;
            case 1:
                g2z g2zVar = ((egd) obj4).a;
                g2zVar.A((String) obj3, 2131953436, new hs20(g2zVar, (String) obj2, (byte) 5), new vn30(g2zVar, null, (byte) 1));
                return rih1Var;
            case 2:
                return new hp0(((los) obj4).c(new ztb((boolean[]) obj3, (xid) obj2, (byte) 13)), (byte) 3);
            case 3:
                kic1 kic1Var = (kic1) obj;
                vu30 vu30Var = (vu30) obj4;
                return ((iu30) obj2).invoke(new pyg(kic1Var.a, false, new rqa(kic1Var, (ven0) obj3, (byte) 19), vu30Var != null ? new ztb(vu30Var, kic1Var, (byte) 18) : null, false));
            case 4:
                List list2 = (List) obj4;
                ((kex) obj).b(list2.size(), new j2i(-1673449743, new nzd(list2, (j6e) obj3, (iu30) obj2, (byte) 1), true), new s6(list2, (byte) 16));
                return rih1Var;
            case 5:
                rtb0 rtb0Var = (rtb0) obj;
                yve yveVar = (yve) obj2;
                for (Map.Entry entry : ((Map) obj4).entrySet()) {
                    String str3 = (String) entry.getKey();
                    List list3 = (List) entry.getValue();
                    rtb0.f(rtb0Var, str3, new j2i(1655736129, new pm6(str3, (byte) 4), true), 2);
                    rtb0Var.e(list3.size(), new kwd(list3, (byte) 10), new kwd(list3, (byte) 11), new j2i(2039820996, new ot(list3, yveVar, (byte) 5), true));
                }
                if (((wpf) obj3).e) {
                    rtb0.c(rtb0Var, "loading_more", gci.a, 2);
                }
                return rih1Var;
            case 6:
                c4p1.q((y7e1) obj4);
                ((iu30) obj2).invoke(new o6f((String) obj, ((yqg) obj3).b()));
                return rih1Var;
            case 7:
                e261 e261Var = (e261) obj;
                b261.n(e261Var, (String) obj4);
                Function0 function0 = (Function0) obj3;
                if (function0 != null) {
                    b261.g(e261Var, (String) obj2, new ukf(function0, (byte) 9));
                }
                return rih1Var;
            case 8:
                o95 o95Var = (o95) obj;
                l4g l4gVar = (l4g) obj3;
                l811 l811Var = (l811) obj4;
                if (!l811Var.a && ((Number) o95Var.e()).floatValue() >= 0.85f) {
                    l811Var.a = true;
                    l4gVar.a.invoke();
                    fn31.T((c9n) obj2, (o8n) null, 0, new i4g(l4gVar, (lnm) null, (byte) 2), 3);
                }
                return rih1Var;
            case 9:
                tv80 tv80Var = (tv80) obj;
                xpg xpgVar = (xpg) obj4;
                ArrayList<tha1> arrayListB = xpgVar.f.b((qxc0) obj3);
                ArrayList arrayList = new ArrayList();
                for (tha1 tha1Var : arrayListB) {
                    sha1 sha1Var = tha1Var.getSortOrder() instanceof m2d0 ? sha1.b : null;
                    mmr0 mmr0Var = sha1Var != null ? new mmr0(sha1Var, tha1Var) : null;
                    if (mmr0Var != null) {
                        arrayList.add(mmr0Var);
                    }
                }
                Map mapT = sqg0.T(arrayList);
                Object value = xpgVar.g.a.getValue();
                i1r i1rVar = value instanceof i1r ? (i1r) value : null;
                if (i1rVar == null || (g3d0Var = (g3d0) i1rVar.a) == null) {
                    g3d0Var = u2d0.a;
                }
                g3d0 g3d0VarE = xpg.e(g3d0Var, mapT);
                Object value2 = xpgVar.h.a.getValue();
                i1r i1rVar2 = value2 instanceof i1r ? (i1r) value2 : null;
                if (i1rVar2 == null || (set = (Set) i1rVar2.a) == null) {
                    set = w7x.a;
                }
                smc0 smc0VarN = dzo1.n(set);
                smc0 smc0VarN2 = k4p1.n();
                smc0VarN2.add(new na20());
                smc0VarN2.add(new ma20());
                smc0VarN2.add(new la20());
                smc0 smc0VarK = k4p1.k(smc0VarN2);
                ArrayList arrayList2 = new ArrayList(q7h.U(smc0VarK, 10));
                rmc0 rmc0VarListIterator = smc0VarK.listIterator(0);
                while (true) {
                    rmc0 rmc0Var = rmc0VarListIterator;
                    if (!rmc0Var.hasNext()) {
                        String str4 = (tv80Var == null || (ou80Var = tv80Var.a) == null) ? null : ou80Var.a;
                        ArrayList arrayList3 = new ArrayList(mapT.size());
                        Iterator it = mapT.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it.next();
                            sha1 sha1Var2 = (sha1) entry2.getKey();
                            tha1 tha1Var2 = (tha1) entry2.getValue();
                            boolean z2 = (g3d0VarE == null || tha1Var2.getSortOrder().getClass() != g3d0VarE.getClass()) ? 0 : i3;
                            g3d0 sortOrder = z2 != 0 ? g3d0VarE : tha1Var2.getSortOrder();
                            String strG = tha1Var2.getSortOrder().g();
                            d3d0 d3d0Var = sortOrder instanceof d3d0 ? (d3d0) sortOrder : null;
                            if (d3d0Var != null) {
                                if (d3d0Var.a()) {
                                    i3 = i2;
                                }
                                boolean zA = d3d0Var.a();
                                qha1Var = new qha1(i3, p7h.M(new String[]{new m2d0(zA).g(), new c3d0(zA).g()}).contains(sortOrder.g()) ? 2 : 3);
                            } else {
                                qha1Var = null;
                            }
                            arrayList3.add(new uha1(strG, sha1Var2, z2, qha1Var));
                            it = it;
                            g3d0VarE = g3d0VarE;
                            i2 = 2;
                            i3 = 1;
                        }
                        ((b431) obj2).a(new e720(new s620(i2, arrayList2, arrayList3)), str4);
                        return rih1Var;
                    }
                    pa20 pa20Var = (pa20) rmc0Var.next();
                    String str5 = pa20Var.a;
                    if (smc0VarN != null && smc0VarN.isEmpty()) {
                    }
                    rmc0 rmc0VarListIterator2 = smc0VarN.listIterator(0);
                    while (true) {
                        rmc0 rmc0Var2 = rmc0VarListIterator2;
                        z = rmc0Var2.hasNext();
                        if (u890.j((pa20) rmc0Var2.next(), pa20Var)) {
                        }
                        break;
                        break;
                    }
                    break;
                    arrayList2.add(new qa20(str5, z, pa20Var));
                }
                break;
            case 10:
                ((p811) obj4).a = new o0d((xpg) obj3, fyo1.u((cxc0) obj), (b431) obj2, b2);
                return rih1Var;
            case 11:
                ((ven0) obj3).setValue(Boolean.FALSE);
                ((vu30) obj4).invoke((String) obj, (kfi1) ((ven0) obj2).getValue());
                return rih1Var;
            case 12:
                rtb0 rtb0Var2 = (rtb0) obj;
                ulh ulhVar = (ulh) obj4;
                int i4 = ulhVar.e;
                c380 c380Var = ulhVar.c;
                if (i4 == 1 && c380Var.isEmpty() && ulhVar.d == null) {
                    rtb0.c(rtb0Var2, "empty-state", rdi.a, 2);
                }
                rtb0Var2.e(c380Var.size(), new kwd(c380Var, (byte) 12), new kwd(c380Var, (byte) 13), new j2i(802480018, new ylh(c380Var, (j2i) obj3, (byte) 0), true));
                int iC = l1d.C(i4);
                if (iC == 1 || iC == 2) {
                    rtb0.c(rtb0Var2, "loading-indicator", rdi.b, 2);
                } else if (iC == 3) {
                    rtb0.c(rtb0Var2, "retry-button", new j2i(-1812242916, new oa5((Function0) obj2, (byte) 2), true), 2);
                }
                return rih1Var;
            case 13:
                return new sg((cce) obj4, (o1i) obj3, (z0i) obj2, (byte) 5);
            case 14:
                abc0 abc0Var = (abc0) obj;
                cce cceVar = (cce) obj4;
                ven0 ven0Var = (ven0) obj2;
                abc0Var.c = new gke(cceVar, (w0i) obj3, ven0Var, (lnm) null, (byte) 7);
                abc0Var.a = new pid(cceVar, ven0Var, (lnm) null, (byte) 27);
                return rih1Var;
            case 15:
                ((iu30) obj2).invoke(new lv90(((rv90) ((sv90) obj4)).a, (eu90) obj, new th((View) obj3, (byte) 1)));
                return rih1Var;
            case 16:
                cov0 cov0Var = ((vme0) obj3).f;
                iu30 iu30Var = (iu30) obj2;
                fad0 fad0Var = (fad0) obj4;
                int iOrdinal = ((dov0) obj).ordinal();
                if (iOrdinal == 0) {
                    fad0Var.j(st80.j);
                    iu30Var.invoke(kle0.a);
                } else if (iOrdinal == 1) {
                    fad0Var.j(st80.h);
                    jj40 jj40Var = cov0Var.a;
                    iu30Var.invoke(new mle0(jj40Var != null ? Integer.valueOf(jj40Var.b) : null));
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    fad0Var.j(st80.i);
                    iu30Var.invoke(new nle0(cov0Var.a));
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                elb0 elb0Var = (elb0) obj;
                drr0 drr0Var = (drr0) obj2;
                drr0Var.t(Float.intBitsToFloat((int) (elb0Var.O(0L) & 4294967295L)));
                ((dw91) obj4).put((String) obj3, new uwj(drr0Var.s(), (int) (4294967295L & elb0Var.b())));
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ArrayList arrayListN0 = o7h.N0((ArrayList) obj3, Collections.singletonList((String) obj4));
                d520 d520Var = (d520) obj2;
                xab1 xab1Var = (xab1) d520Var.h;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                d520Var.h = fn31.T(cto1.q((iac0) d520Var.g), (o8n) null, 0, new bag(d520Var, arrayListN0, (lnm) null, (byte) 25), 3);
                d520Var.e0(2131956599, arrayListN0);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                tck tckVar = (tck) obj3;
                xab1 xab1Var2 = (xab1) tckVar.a;
                if (xab1Var2 != null) {
                    xab1Var2.d((CancellationException) null);
                }
                tckVar.a = fn31.T(cto1.q((iac0) tckVar.g), (o8n) null, 0, new hff(tckVar, (String) obj2, (List) obj4, (lnm) null, (byte) 12), 3);
                kt91 kt91Var = (kt91) tckVar.f;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131956609});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, "", 2131956609, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                k6k k6kVar = (k6k) obj4;
                if (k6kVar.b > ((bhk) obj3).g.b()) {
                    ((o0d) obj2).invoke(k6kVar);
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                jik.d((dg30) obj4, (k6k) obj, (Context) obj3, (kt91) obj2);
                return rih1Var;
            case 22:
                rtb0 rtb0Var3 = (rtb0) obj;
                rtb0.c(rtb0Var3, "title", lei.a, 2);
                xnk xnkVar = (xnk) obj3;
                iu30 iu30Var2 = (iu30) obj2;
                for (Object obj5 : ((gok) obj4).c) {
                    int i5 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    fbh0 fbh0Var = (fbh0) obj5;
                    rtb0.c(rtb0Var3, l1d.k(i, fbh0Var.a, "_"), new j2i(-273482452, new nzd(fbh0Var, xnkVar, iu30Var2, (byte) 7), true), 2);
                    i = i5;
                }
                return rih1Var;
            case 23:
                ContextMenuButton contextMenuButton = (ContextMenuButton) obj;
                contextMenuButton.setContentDescription((String) obj4);
                contextMenuButton.a((zbm) obj3);
                contextMenuButton.n(new vj0((Function0) obj2, (byte) 23));
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                tqw tqwVar = (tqw) obj;
                tob1 tob1Var = (tob1) obj2;
                if (((ea6) tob1Var.getValue()).b == l2r0.b) {
                    b431 b431Var = (b431) obj4;
                    zel zelVar = new zel(new wel(o7h.Z0(((ea6) tob1Var.getValue()).j)));
                    if (tqwVar != null && (ou80Var3 = n3o1.y(tqwVar).a) != null) {
                        str = ou80Var3.a;
                    }
                    b431Var.a(zelVar, str);
                } else {
                    r1l r1lVar = (r1l) obj3;
                    r1lVar.c = true;
                    a1r0 a1r0Var = r1lVar.a;
                    String str6 = nik1.s6.a;
                    if (tqwVar != null && (ou80Var2 = n3o1.y(tqwVar).a) != null) {
                        str2 = ou80Var2.a;
                    }
                    Parcelable zelVar2 = new zel(vel.a);
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("bluejay_connector_apps_params", zelVar2);
                    a1r0Var.n(str6, str2, bundle, true);
                }
                return rih1Var;
            case 25:
                pub0 pub0Var = (pub0) obj;
                w0m w0mVar = (w0m) obj4;
                c380 c380Var2 = w0mVar.b;
                pub0Var.P(c380Var2.size(), new kwd(c380Var2, (byte) 29), new f1m(c380Var2, (byte) 0), (gv20) null, new j2i(-334987442, new rf1((List) c380Var2, obj3, (iu30) obj2, b3), true));
                if (w0mVar.e) {
                    jcx0 jcx0Var = jcx0.Q0;
                    j2i j2iVar = lfi.a;
                    pub0Var.P(1, (iu30) null, new pv40((byte) 20), new gv20(jcx0Var, (byte) 19), new j2i(1062451479, new oub0((byte) 0), true));
                }
                return rih1Var;
            case 26:
                cas casVar = (a7m0) obj;
                casVar.a = u2m.b;
                casVar.d = new v6f((q8n) obj4, (byte) 2);
                casVar.e = new v6f((q8n) obj3, (byte) 3);
                casVar.a(vll.d1, new kak((String) obj2, (byte) 14));
                return rih1Var;
            case 27:
                int iIntValue = ((Number) obj).intValue();
                Character chR0 = ihc1.r0(iIntValue, (String) obj3);
                float fO = 1.0f;
                if (chR0 == null || !eth.H(chR0.charValue())) {
                    Iterator it2 = ((List) obj4).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            i = -1;
                        } else if (((Number) it2.next()).intValue() <= iIntValue) {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        fO = yoi1.o((((frr0) obj2).s() - (((long) i) * 40)) / 250.0f, 0.0f, 1.0f);
                    }
                }
                return Float.valueOf(fO);
            case 28:
                pem pemVar = (pem) obj4;
                c9 c9Var = pemVar.b;
                ((rtb0) obj).e(c9Var.b(), new bem(c9Var, (byte) 0), new bem(c9Var, (byte) 1), new j2i(802480018, new oi1(c9Var, (cfm) obj3, pemVar, (Map) obj2, (byte) 5), true));
                return rih1Var;
            default:
                List list4 = (List) obj4;
                ((epb0) obj).R(list4.size(), new f1m(list4, (byte) 2), (vu30) null, new f1m(list4, (byte) 3), new j2i(-1942245546, new rf1(list4, obj3, (iu30) obj2, (byte) 6), true));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0d(Object obj, iu30 iu30Var, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.d = iu30Var;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0d(Object obj, Object obj2, Object obj3, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0d(tck tckVar, String str, List list) {
        super(1);
        this.a = (byte) 19;
        this.c = tckVar;
        this.d = str;
        this.b = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0d(iu30 iu30Var, Object obj, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.d = iu30Var;
        this.b = obj;
        this.c = obj2;
    }
}
