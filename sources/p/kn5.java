package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kn5 extends anm1 {
    public static final kn5 e = new kn5(0);
    public static final kn5 f = new kn5(1);
    public static final kn5 g = new kn5(2);
    public static final kn5 h = new kn5(3);
    public static final kn5 i = new kn5(4);
    public static final kn5 j = new kn5(5);
    public static final kn5 k = new kn5(6);
    public static final kn5 l = new kn5(7);
    public static final kn5 m = new kn5(8);
    public static final kn5 n = new kn5(9);
    public final /* synthetic */ byte d;

    public /* synthetic */ kn5(byte b) {
        this.d = b;
    }

    public static ArrayList S(List list, m6j0 m6j0Var, m6j0 m6j0Var2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mmr0 mmr0Var = (mmr0) it.next();
            Object obj = mmr0Var.b;
            iu30 iu30Var = (iu30) mmr0Var.a;
            if (u890.j(iu30Var.invoke(m6j0Var), iu30Var.invoke(m6j0Var2))) {
                obj = null;
            }
            mxx0 mxx0Var = (mxx0) obj;
            if (mxx0Var != null) {
                arrayList.add(mxx0Var);
            }
        }
        return arrayList;
    }

    public final boolean j(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                return ((u01) obj).equals((u01) obj2);
            case 1:
                return ((f1h) obj).equals((f1h) obj2);
            case 2:
                return ((pkh) obj).equals((pkh) obj2);
            case 3:
                return ((iby) obj).equals((iby) obj2);
            case 4:
                return ((n560) obj).equals((n560) obj2);
            case 5:
                return ((wvx0) obj).equals((wvx0) obj2);
            case 6:
                return ((t0d1) obj).equals((t0d1) obj2);
            case 7:
                return ((fyd1) obj).c == ((fyd1) obj2).c;
            case 8:
                return ((aqf1) obj).equals((aqf1) obj2);
            case 9:
                return ((r8i1) obj).equals((r8i1) obj2);
            case 10:
                return ((jxs0) obj).equals((jxs0) obj2);
            case 11:
                return ((bw31) obj).equals((bw31) obj2);
            case 12:
                return ((kbn) obj).equals((kbn) obj2);
            case 13:
                return ((irg0) obj).equals((irg0) obj2);
            case 14:
                return ((ji0) obj).equals((ji0) obj2);
            case 15:
                return ((t7l1) obj).equals((t7l1) obj2);
            case 16:
                return ((jbz) obj).equals((jbz) obj2);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return ((r2b) obj).equals((r2b) obj2);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return ((y3g) obj).equals((y3g) obj2);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return ((pv51) obj).equals((pv51) obj2);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return ((kcb0) obj).equals((kcb0) obj2);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return ((ji0) obj).equals((ji0) obj2);
            case 22:
                return ((m6j0) obj).equals((m6j0) obj2);
            case 23:
                return ((qn11) obj).equals((qn11) obj2);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return ((h951) obj).equals((h951) obj2);
            case 25:
                return ((txs0) obj).equals((txs0) obj2);
            default:
                return ((e9e1) obj).equals((e9e1) obj2);
        }
    }

    public final boolean k(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                return ((u01) obj).a.equals(((u01) obj2).a);
            case 1:
                e1h e1hVar = (f1h) obj;
                e1h e1hVar2 = (f1h) obj2;
                if (e1hVar instanceof e1h) {
                    if ((e1hVar2 instanceof e1h) && u890.j(e1hVar.b.a, e1hVar2.b.a)) {
                        return true;
                    }
                } else {
                    if (e1hVar.equals(d1h.b)) {
                        return e1hVar2 instanceof d1h;
                    }
                    if (!(e1hVar instanceof b1h)) {
                        eg.o();
                    } else if ((e1hVar2 instanceof b1h) && ((b1h) e1hVar).b.a.equals(((b1h) e1hVar2).b.a)) {
                        return true;
                    }
                }
                return false;
            case 2:
                ekh ekhVar = (pkh) obj;
                ekh ekhVar2 = (pkh) obj2;
                if (ekhVar instanceof ekh) {
                    if ((ekhVar2 instanceof ekh) && u890.j(ekhVar.b.r(), ekhVar2.b.r())) {
                        return true;
                    }
                } else if (ekhVar instanceof gkh) {
                    if ((ekhVar2 instanceof gkh) && u890.j(((gkh) ekhVar).b, ((gkh) ekhVar2).b)) {
                        return true;
                    }
                } else if (ekhVar instanceof hkh) {
                    if ((ekhVar2 instanceof hkh) && u890.j(((hkh) ekhVar).b.o(), ((hkh) ekhVar2).b.o())) {
                        return true;
                    }
                } else if (ekhVar instanceof ikh) {
                    if ((ekhVar2 instanceof ikh) && ((ikh) ekhVar).b.equals(((ikh) ekhVar2).b)) {
                        return true;
                    }
                } else {
                    if (ekhVar instanceof jkh) {
                        return ekhVar2 instanceof jkh;
                    }
                    if (ekhVar instanceof lkh) {
                        return ekhVar2 instanceof lkh;
                    }
                    if (ekhVar instanceof okh) {
                        if ((ekhVar2 instanceof okh) && ((okh) ekhVar).b.equals(((okh) ekhVar2).b)) {
                            return true;
                        }
                    } else if (ekhVar instanceof kkh) {
                        if ((ekhVar2 instanceof kkh) && u890.j(((kkh) ekhVar2).b, ((kkh) ekhVar).b)) {
                            return true;
                        }
                    } else if (ekhVar instanceof nkh) {
                        if ((ekhVar2 instanceof nkh) && ((nkh) ekhVar).c.equals(((nkh) ekhVar2).c)) {
                            return true;
                        }
                    } else if (!(ekhVar instanceof mkh)) {
                        eg.o();
                    } else if ((ekhVar2 instanceof mkh) && ((mkh) ekhVar).b.equals(((mkh) ekhVar2).b)) {
                        return true;
                    }
                }
                return false;
            case 3:
                return ((iby) obj).b.equals(((iby) obj2).b);
            case 4:
                cpa1 cpa1Var = (n560) obj;
                cpa1 cpa1Var2 = (n560) obj2;
                if ((cpa1Var instanceof cpa1) && (cpa1Var2 instanceof cpa1)) {
                    cpa1 cpa1Var3 = cpa1Var;
                    cpa1 cpa1Var4 = cpa1Var2;
                    if (u890.j(cpa1Var3.b, cpa1Var4.b) && u890.j(cpa1Var3.c, cpa1Var4.c)) {
                        return true;
                    }
                } else if ((cpa1Var instanceof jz3) && (cpa1Var2 instanceof jz3)) {
                    jz3 jz3Var = (jz3) cpa1Var;
                    jz3 jz3Var2 = (jz3) cpa1Var2;
                    if (u890.j(jz3Var.b, jz3Var2.b) && u890.j(jz3Var.c, jz3Var2.c)) {
                        return true;
                    }
                }
                return false;
            case 5:
                return ((wvx0) obj).equals((wvx0) obj2);
            case 6:
                return u890.j(((t0d1) obj).a, ((t0d1) obj2).a);
            case 7:
                fyd1 fyd1Var = (fyd1) obj;
                fyd1 fyd1Var2 = (fyd1) obj2;
                return fyd1Var.a == fyd1Var2.a && fyd1Var.b == fyd1Var2.b;
            case 8:
                return ((aqf1) obj).a.equals(((aqf1) obj2).a);
            case 9:
                q8i1 q8i1Var = (r8i1) obj;
                q8i1 q8i1Var2 = (r8i1) obj2;
                if (q8i1Var instanceof p8i1) {
                    return q8i1Var2 instanceof p8i1;
                }
                if (!(q8i1Var instanceof q8i1)) {
                    eg.o();
                } else if ((q8i1Var2 instanceof q8i1) && u890.j(q8i1Var2.b, q8i1Var.b)) {
                    return true;
                }
                return false;
            case 10:
                gxs0 gxs0Var = (jxs0) obj;
                gxs0 gxs0Var2 = (jxs0) obj2;
                if (gxs0Var instanceof gxs0) {
                    if (gxs0Var2 instanceof gxs0) {
                        return u890.j(gxs0Var.c.getUri(), gxs0Var2.c.getUri());
                    }
                } else if (gxs0Var instanceof hxs0) {
                    if (gxs0Var2 instanceof hxs0) {
                        return gxs0Var.equals(gxs0Var2);
                    }
                } else {
                    if (gxs0Var instanceof ixs0) {
                        return true;
                    }
                    eg.o();
                }
                return false;
            case 11:
                return u890.j(((bw31) obj).getId(), ((bw31) obj2).getId());
            case 12:
                return u890.j(((kbn) obj).a.a, ((kbn) obj2).a.a);
            case 13:
                return u890.j(((irg0) obj).a, ((irg0) obj2).a);
            case 14:
                return ((ji0) obj).equals((ji0) obj2);
            case 15:
                return true;
            case 16:
                return ((jbz) obj).p.equals(((jbz) obj2).p);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return u890.j(((r2b) obj).a, ((r2b) obj2).a);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return ((y3g) obj).b.equals(((y3g) obj2).b);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return ((pv51) obj).equals((pv51) obj2);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return ((kcb0) obj).a.equals(((kcb0) obj2).a);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return u890.j(((ji0) obj).a, ((ji0) obj2).a);
            case 22:
                return u890.j(((m6j0) obj).b(), ((m6j0) obj2).b());
            case 23:
                qn11 qn11Var = (qn11) obj;
                qn11 qn11Var2 = (qn11) obj2;
                return u890.j(qn11Var.b, qn11Var2.b) && u890.j(qn11Var.e, qn11Var2.e);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return ((h951) obj).c.equals(((h951) obj2).c);
            case 25:
                return u890.j(((txs0) obj).b, ((txs0) obj2).b);
            default:
                return true;
        }
    }

    public Object y(Object obj, Object obj2) {
        ArrayList arrayListS;
        switch (this.d) {
            case 11:
                vu31 vu31Var = (bw31) obj;
                vu31 vu31Var2 = (bw31) obj2;
                if ((vu31Var instanceof vu31) && (vu31Var2 instanceof vu31) && vu31Var.a() != vu31Var2.a()) {
                    return "addStateChanged";
                }
                if ((vu31Var instanceof ov31) && (vu31Var2 instanceof ov31) && !u890.j(((ov31) vu31Var).b(), ((ov31) vu31Var2).b())) {
                    return "previewStateChanged";
                }
                return null;
            case 22:
                h6j0 h6j0Var = (m6j0) obj;
                h6j0 h6j0Var2 = (m6j0) obj2;
                ArrayList arrayListS2 = S(p7h.M(new mmr0[]{new mmr0(oxx0.b, ixx0.a), new mmr0(pxx0.b, kxx0.a)}), h6j0Var, h6j0Var2);
                if ((h6j0Var instanceof h6j0) && (h6j0Var2 instanceof h6j0)) {
                    arrayListS = S(Collections.singletonList(new mmr0(nxx0.b, jxx0.a)), h6j0Var, h6j0Var2);
                } else {
                    arrayListS = z6x.a;
                }
                return new gxx0(o7h.N0(arrayListS2, arrayListS));
            default:
                return super.y(obj, obj2);
        }
    }
}
