package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nec0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nec0(List list, byte b) {
        super(1);
        this.a = b;
        this.b = list;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        List list = this.b;
        switch (b) {
            case 0:
                return ((hec0) list.get(((Number) obj).intValue())).b;
            case 1:
                ((qv00) obj).b(zei1.class, list, false);
                return rih1Var;
            case 2:
                qv00 qv00Var = (qv00) obj;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    qv00Var.a((String) it.next(), hll.class, false);
                }
                return rih1Var;
            case 3:
                return (Float) ((o95) list.get(((Number) obj).intValue())).e();
            case 4:
                rtb0 rtb0Var = (rtb0) obj;
                rtb0.c(rtb0Var, (Object) null, ayi.a, 3);
                rtb0Var.e(list.size(), (iu30) null, new ehf0(list, (byte) 0), new j2i(2039820996, new ot(list, list, (byte) 12), true));
                rtb0.c(rtb0Var, (Object) null, ayi.b, 3);
                return rih1Var;
            case 5:
                List list2 = ((wsc0) obj).e;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((zuc0) it2.next()).a);
                }
                return Boolean.valueOf(arrayList.equals(list));
            case 6:
                ((qv00) obj).b(jo70.class, list, false);
                return rih1Var;
            case 7:
                return ((txs0) list.get(((Number) obj).intValue())).b;
            case 8:
                ((qv00) obj).b(gh3.class, list, false);
                return rih1Var;
            case 9:
                ((qv00) obj).b(b9v0.class, list, false);
                return rih1Var;
            case 10:
                String str = ((xdv0) list.get(((Number) obj).intValue())).a;
                return str != null ? "tag:".concat(str) : "all";
            case 11:
                return (m8w0) list.get(((Number) obj).intValue());
            case 12:
                ((qv00) obj).b(pjw0.class, list, false);
                return rih1Var;
            case 13:
                ((qv00) obj).b(xkk1.class, list, false);
                return rih1Var;
            case 14:
                int iIndexOf = list.indexOf(((sq61) obj).getId());
                Integer numValueOf = iIndexOf >= 0 ? Integer.valueOf(iIndexOf) : null;
                return numValueOf != null ? new tq61(-numValueOf.intValue()) : uq61.a;
            case 15:
                qv00 qv00Var2 = (qv00) obj;
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    qv00Var2.a((String) it3.next(), xkk1.class, false);
                }
                return rih1Var;
            case 16:
                c2l0 c2l0Var = (c2l0) obj;
                nm21 nm21Var = (nm21) o7h.s0(list);
                String str2 = nm21Var != null ? nm21Var.a : null;
                if (str2 == null) {
                    str2 = "";
                }
                return c2l0Var.e(str2);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                qv00 qv00Var3 = (qv00) obj;
                List list3 = list;
                qv00Var3.b(jo70.class, list3, false);
                qv00Var3.b(xkk1.class, list3, false);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ((qv00) obj).b(mdz.class, list, false);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                qv00 qv00Var4 = (qv00) obj;
                List list4 = list;
                qv00Var4.b(jo70.class, list4, false);
                qv00Var4.b(xkk1.class, list4, false);
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return ((vb61) list.get(((Number) obj).intValue())).a;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ((qv00) obj).b(ge71.class, list, false);
                return rih1Var;
            case 22:
                ((qv00) obj).b(zei1.class, list, false);
                return rih1Var;
            case 23:
                ((qv00) obj).b(gw81.class, list, false);
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return ((oh91) list.get(((Number) obj).intValue())).a;
            case 25:
                int iIntValue = ((Number) obj).intValue();
                return h9a1.N0.invoke(Integer.valueOf(iIntValue), list.get(iIntValue));
            case 26:
                return dic1.a(list, rc11.a.b(qxo0.class));
            case 27:
                return dic1.a(list, rc11.a.b(cyo0.class));
            case 28:
                return dic1.a(list, rc11.a.b(qwo0.class));
            default:
                return dic1.a(list, rc11.a.b(rwo0.class));
        }
    }
}
