package p;

import com.spotify.libraryimportservice.tmm.UnmatchedItem;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qbb0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ qbb0(ArrayList arrayList, byte b) {
        this.a = b;
        this.b = arrayList;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                return ((nbb0) arrayList.get(((Number) obj).intValue())).a;
            case 1:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 2:
                return Integer.valueOf(((bmf0) arrayList.get(((Number) obj).intValue())).a);
            case 3:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 4:
                return l1d.m("artist-", ((mxr0) arrayList.get(((Number) obj).intValue())).a);
            case 5:
                return "artist_row";
            case 6:
                return l1d.m("track-", ((bzr0) arrayList.get(((Number) obj).intValue())).a);
            case 7:
                return "track_row";
            case 8:
                return l1d.m("unmatched_", ((UnmatchedItem) arrayList.get(((Number) obj).intValue())).getId());
            case 9:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 10:
                return ((mey0) arrayList.get(((Number) obj).intValue())).a;
            case 11:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 12:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 13:
                return ((fvp0) arrayList.get(((Number) obj).intValue())).a;
            case 14:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 15:
                return ((ki90) arrayList.get(((Number) obj).intValue())).a.a;
            case 16:
                arrayList.get(((Number) obj).intValue());
                return null;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return ((xab0) arrayList.get(((Number) obj).intValue())).a;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                arrayList.get(((Number) obj).intValue());
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return ((xab0) arrayList.get(((Number) obj).intValue())).a;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                arrayList.get(((Number) obj).intValue());
                return null;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 22:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 23:
                return String.valueOf(((b6q0) arrayList.get(((Number) obj).intValue())).b().a);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 25:
                return rz71.O0.invoke(arrayList.get(((Number) obj).intValue()));
            case 26:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 27:
                return y5a1.Z.invoke(arrayList.get(((Number) obj).intValue()));
            case 28:
                arrayList.get(((Number) obj).intValue());
                return null;
            default:
                int iIntValue = ((Number) obj).intValue();
                return iIntValue + "-" + ((yue1) arrayList.get(iIntValue)).getId();
        }
    }
}
