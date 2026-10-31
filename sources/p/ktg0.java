package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.Comparator;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ktg0 implements Comparator {
    public final /* synthetic */ byte a;

    public /* synthetic */ ktg0(byte b) {
        this.a = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return pap1.t(Integer.valueOf(((rr80) ((gtg0) obj).b).a), Integer.valueOf(((rr80) ((gtg0) obj2).b).a));
            case 1:
                return pap1.t(((Locale) obj).getDisplayCountry(), ((Locale) obj2).getDisplayCountry());
            case 2:
                return pap1.t(((Locale) obj).getDisplayCountry(), ((Locale) obj2).getDisplayCountry());
            case 3:
                return pap1.t((Integer) ((mmr0) obj2).b, (Integer) ((mmr0) obj).b);
            case 4:
                return pap1.t(Integer.valueOf(((xkc0) obj).a), Integer.valueOf(((xkc0) obj2).a));
            case 5:
                uyo0 uyo0Var = ((vyo0) obj).c;
                uyo0 uyo0Var2 = ((vyo0) obj2).c;
                return pap1.t(1, 1);
            case 6:
                return pap1.t(Integer.valueOf(((jap0) obj2).a()), Integer.valueOf(((jap0) obj).a()));
            case 7:
                return pap1.t(Integer.valueOf(cuz.d(((p0v) obj).e)), Integer.valueOf(cuz.d(((p0v) obj2).e)));
            case 8:
                return pap1.t(Float.valueOf(((Number) ((mmr0) obj2).b).floatValue()), Float.valueOf(((Number) ((mmr0) obj).b).floatValue()));
            case 9:
                return pap1.t(Float.valueOf(((Number) ((mmr0) obj2).b).floatValue()), Float.valueOf(((Number) ((mmr0) obj).b).floatValue()));
            case 10:
                return pap1.t(Integer.valueOf(((unr0) obj).a), Integer.valueOf(((unr0) obj2).a));
            case 11:
                return pap1.t(Integer.valueOf(((hpr0) obj).a), Integer.valueOf(((hpr0) obj2).a));
            case 12:
                return pap1.t(Boolean.valueOf(((yab0) obj2).c), Boolean.valueOf(((yab0) obj).c));
            case 13:
                return pap1.t(Integer.valueOf(((rrj0) obj).a), Integer.valueOf(((rrj0) obj2).a));
            case 14:
                return pap1.t(((r6w0) obj).a, ((r6w0) obj2).a);
            case 15:
                return pap1.t(Long.valueOf(((b9f) obj).t()), Long.valueOf(((b9f) obj2).t()));
            case 16:
                return pap1.t(Long.valueOf(((b9f) obj).t()), Long.valueOf(((b9f) obj2).t()));
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return pap1.t(Long.valueOf(((b9f) obj).t()), Long.valueOf(((b9f) obj2).t()));
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return pap1.t(Long.valueOf(((b9f) obj).t()), Long.valueOf(((b9f) obj2).t()));
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return pap1.t(Long.valueOf(((b9f) obj).t()), Long.valueOf(((b9f) obj2).t()));
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return pap1.t(Long.valueOf(((b9f) obj).t()), Long.valueOf(((b9f) obj2).t()));
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return pap1.t(Long.valueOf(((b9f) obj).t()), Long.valueOf(((b9f) obj2).t()));
            case 22:
                return pap1.t(Long.valueOf(((b9f) obj).t()), Long.valueOf(((b9f) obj2).t()));
            case 23:
                ((xr40) obj2).getClass();
                ((xr40) obj).getClass();
                return pap1.t(0, 0);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return pap1.t(Integer.valueOf(((br01) obj).ordinal()), Integer.valueOf(((br01) obj2).ordinal()));
            case 25:
                return pap1.t(Integer.valueOf(((br01) obj).ordinal()), Integer.valueOf(((br01) obj2).ordinal()));
            case 26:
                return pap1.t(Integer.valueOf(((br01) obj).ordinal()), Integer.valueOf(((br01) obj2).ordinal()));
            case 27:
                return pap1.t(Integer.valueOf(((br01) obj).ordinal()), Integer.valueOf(((br01) obj2).ordinal()));
            case 28:
                return pap1.t((String) ((kjf1) obj).i.getValue(), (String) ((kjf1) obj2).i.getValue());
            default:
                return pap1.t(Integer.valueOf(((vd21) obj).b), Integer.valueOf(((vd21) obj2).b));
        }
    }
}
