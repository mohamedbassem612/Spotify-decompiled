package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rw11 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;

    public /* synthetic */ rw11(List list, byte b) {
        this.a = b;
        this.b = list;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        List list = this.b;
        switch (b) {
            case 0:
                return ((ojd0) list.get(((Number) obj).intValue())).a;
            case 1:
                list.get(((Number) obj).intValue());
                return null;
            case 2:
                list.get(((Number) obj).intValue());
                return null;
            case 3:
                return ((sy41) list.get(((Number) obj).intValue())).getUuid();
            case 4:
                return rc11.a.b(((sy41) list.get(((Number) obj).intValue())).getClass());
            case 5:
                return ((cwl) list.get(((Number) obj).intValue())).getClass();
            case 6:
                return ((fwz0) list.get(((Number) obj).intValue())).getUuid();
            case 7:
                return rc11.a.b(((fwz0) list.get(((Number) obj).intValue())).getClass());
            case 8:
                list.get(((Number) obj).intValue());
                return null;
            case 9:
                wq61 wq61Var = (wq61) list.get(((Number) obj).intValue());
                return new wt61(wq61Var.a.e(), ((sq61) wq61Var.e).getId());
            case 10:
                return ga51.class;
            case 11:
                list.get(((Number) obj).intValue());
                return null;
            case 12:
                return ((wx71) list.get(((Number) obj).intValue())).a;
            case 13:
                list.get(((Number) obj).intValue());
                return null;
            case 14:
                return ((m881) list.get(((Number) obj).intValue())).a;
            case 15:
                list.get(((Number) obj).intValue());
                return null;
            case 16:
                return (String) list.get(((Number) obj).intValue());
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                list.get(((Number) obj).intValue());
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return ((asc1) list.get(((Number) obj).intValue())).b;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                list.get(((Number) obj).intValue());
                return null;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                list.get(((Number) obj).intValue());
                return null;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                int iIntValue = ((Number) obj).intValue();
                return osc1.d.invoke(Integer.valueOf(iIntValue), list.get(iIntValue));
            case 22:
                list.get(((Number) obj).intValue());
                return null;
            case 23:
                list.get(((Number) obj).intValue());
                return null;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                list.get(((Number) obj).intValue());
                return null;
            case 25:
                int iIntValue2 = ((Number) obj).intValue();
                return Integer.valueOf(iIntValue2);
            case 26:
                list.get(((Number) obj).intValue());
                return null;
            case 27:
                int iIntValue3 = ((Number) obj).intValue();
                return Integer.valueOf(((uhe1) list.get(iIntValue3)).hashCode() + iIntValue3);
            case 28:
                list.get(((Number) obj).intValue());
                return null;
            default:
                int iIntValue4 = ((Number) obj).intValue();
                return iIntValue4 + "-" + ((yue1) list.get(iIntValue4)).getId();
        }
    }
}
