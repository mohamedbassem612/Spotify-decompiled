package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ujc1 implements i0v0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ ujc1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object a(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return (rq21) ((ifb1) obj3).a((sq21) obj, (jq21) obj2);
            case 1:
                return (tf51) ((uh61) obj3).a((qop) obj, (bct) obj2);
            case 2:
                return (tf51) ((ifb1) obj3).a((qop) obj, (bct) obj2);
            case 3:
                return (tf51) ((ifb1) obj3).a((qop) obj, (bct) obj2);
            case 4:
                return (py50) ((t8e1) obj3).e((qop) obj, (pbt) obj2);
            case 5:
                return (p160) ((ifb1) obj3).a((qop) obj, (tbt) obj2);
            case 6:
                return (anc0) ((ifb1) obj3).a((qop) obj, (act) obj2);
            case 7:
                return (r2g) ((ifb1) obj3).a((qop) obj, (jbt) obj2);
            case 8:
                return (jk90) ((ifb1) obj3).a((qop) obj, (gl90) obj2);
            case 9:
                return (ok90) ((ifb1) obj3).a((qop) obj, (gl90) obj2);
            case 10:
                return (hk90) ((ifb1) obj3).a((qop) obj, (gl90) obj2);
            case 11:
                return (fv50) ((iyh1) obj3).a((qop) obj, (lbt) obj2);
            case 12:
                return (r2g) ((iyh1) obj3).a((qop) obj, (jbt) obj2);
            case 13:
                return (anc0) ((iyh1) obj3).a((qop) obj, (act) obj2);
            case 14:
                return (zqw) ((iyh1) obj3).a((qop) obj, (fl90) obj2);
            case 15:
                return (tf51) ((iyh1) obj3).a((qop) obj, (bct) obj2);
            case 16:
                return (e0t) ((iyh1) obj3).a((qop) obj, (nbt) obj2);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return (uv50) ((iyh1) obj3).a((qop) obj, (obt) obj2);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (akj0) ((t8e1) obj3).e((qop) obj, (gzu0) obj2);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return (py50) ((t8e1) obj3).e((qop) obj, (pbt) obj2);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return (rv50) ((iyh1) obj3).a((qop) obj, (mbt) obj2);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return (e0t) ((iyh1) obj3).a((qop) obj, (ubt) obj2);
            case 22:
                return (anc0) ((iyh1) obj3).a((qop) obj, (act) obj2);
            case 23:
                return (anc0) ((iyh1) obj3).a((qop) obj, (act) obj2);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return (tf51) ((iyh1) obj3).a((qop) obj, (bct) obj2);
            case 25:
                return (tf51) ((iyh1) obj3).a((qop) obj, (bct) obj2);
            case 26:
                return (nk90) ((iyh1) obj3).a((qop) obj, (gl90) obj2);
            case 27:
                return (r2g) ((iyh1) obj3).a((qop) obj, (jbt) obj2);
            case 28:
                return (tf51) ((iyh1) obj3).a((qop) obj, (bct) obj2);
            default:
                return (lz50) ((iyh1) obj3).a((qop) obj, (qbt) obj2);
        }
    }

    public final String b() {
        switch (this.a) {
            case 0:
                return "sts kungsholmen";
            case 1:
                return "standard text filter empty";
            case 2:
                return "prompted playlist track list summary";
            case 3:
                return "Trending Near You Description Section";
            case 4:
                return "Trending Near You";
            case 5:
                return "Trending Near You Header Metadata";
            case 6:
                return "Trending Near You Device Location";
            case 7:
                return "Trending Near You notes toggle";
            case 8:
                return "Trending Near You per-track recsplanation";
            case 9:
                return "ucp prompted playlist recently added";
            case 10:
                return "ucp prompted playlist remove item";
            case 11:
                return "reinvent free upsell download";
            case 12:
                return "standard video";
            case 13:
                return "standard video first";
            case 14:
                return "video";
            case 15:
                return "voting entrypoint";
            case 16:
                return "Floating Video Entry Point";
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return "Entity Explorer";
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return "watch feed";
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return "Entity Explorer";
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return "workout-banner";
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return "workout";
            case 22:
                return "Workout notes default visibility";
            case 23:
                return "Workout settings auto-open";
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return "workout segment header";
            case 25:
                return "workout summary bar";
            case 26:
                return "workout-timeline";
            case 27:
                return "workout-toggle";
            case 28:
                return "Wrapped YTS chips section";
            default:
                return "wrapped";
        }
    }
}
