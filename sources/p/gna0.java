package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gna0 implements i0v0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ gna0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object a(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return (ik90) ((bf70) obj3).b((qop) obj, (gl90) obj2);
            case 1:
                return (zk90) ((mna0) obj3).a((qop) obj, (gl90) obj2);
            case 2:
                return (anc0) ((bf70) obj3).b((qop) obj, (act) obj2);
            case 3:
                return (xne) ((mna0) obj3).a((qop) obj, (gzu0) obj2);
            case 4:
                return (r2g) ((bf70) obj3).b((qop) obj, (jbt) obj2);
            case 5:
                return (tf51) ((bf70) obj3).b((qop) obj, (bct) obj2);
            case 6:
                return (tf51) ((bf70) obj3).b((qop) obj, (bct) obj2);
            case 7:
                return (r2g) ((bf70) obj3).b((qop) obj, (jbt) obj2);
            case 8:
                return (py50) ((bf70) obj3).b((qop) obj, (pbt) obj2);
            case 9:
                return (p160) ((bf70) obj3).b((qop) obj, (tbt) obj2);
            case 10:
                return (kfc0) ((mna0) obj3).a((qop) obj, (gzu0) obj2);
            case 11:
                return (ml90) ((mna0) obj3).a((qop) obj, (gzu0) obj2);
            case 12:
                return (ic3) ((mna0) obj3).a((c8c0) obj, (izu0) obj2);
            case 13:
                return (rq21) ((bf70) obj3).b((sq21) obj, (jq21) obj2);
            case 14:
                return (tf51) ((bf70) obj3).b((qop) obj, (bct) obj2);
            case 15:
                return (tf51) ((bf70) obj3).b((qop) obj, (bct) obj2);
            case 16:
                return (r2g) ((bf70) obj3).b((qop) obj, (jbt) obj2);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return (py50) ((bf70) obj3).b((qop) obj, (pbt) obj2);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (p160) ((bf70) obj3).b((qop) obj, (tbt) obj2);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return (kfc0) ((mna0) obj3).a((qop) obj, (gzu0) obj2);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return (ic3) ((mna0) obj3).a((c8c0) obj, (izu0) obj2);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return (fv50) ((c8d0) obj3).j((qop) obj, (lbt) obj2);
            case 22:
                return (rq21) ((c8d0) obj3).j((sq21) obj, (jq21) obj2);
            case 23:
                return (fv50) ((c8d0) obj3).j((qop) obj, (lbt) obj2);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return (rq21) ((mna0) obj3).a((sq21) obj, (jq21) obj2);
            case 25:
                return (tf51) ((c8d0) obj3).j((qop) obj, (bct) obj2);
            case 26:
                return (akj0) ((mna0) obj3).a((qop) obj, (gzu0) obj2);
            case 27:
                return (anc0) ((c8d0) obj3).j((qop) obj, (act) obj2);
            case 28:
                return (xne) ((mna0) obj3).a((qop) obj, (gzu0) obj2);
            default:
                return (tf51) ((c8d0) obj3).j((qop) obj, (bct) obj2);
        }
    }

    public final String b() {
        switch (this.a) {
            case 0:
                return "kallax";
            case 1:
                return "kallax";
            case 2:
                return "kodiakprefetch";
            case 3:
                return "liked songs";
            case 4:
                return "liked songs duplicate";
            case 5:
                return "Liked Songs empty section";
            case 6:
                return "Liked Songs Filter Chips";
            case 7:
                return "liked songs genres";
            case 8:
                return "liked songs";
            case 9:
                return "likedsongs";
            case 10:
                return "liked songs";
            case 11:
                return "liked songs track descriptors";
            case 12:
                return "liked songs";
            case 13:
                return "Liked Songs";
            case 14:
                return "listen later empty view";
            case 15:
                return "listen later filter and sort";
            case 16:
                return "listen later filter chip";
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return "listen later";
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return "listenlater";
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return "listen later";
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return "listen later";
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return "listen later reordering";
            case 22:
                return "Listen Later";
            case 23:
                return "listen later settings";
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return "Listening party";
            case 25:
                return "live events";
            case 26:
                return "live events";
            case 27:
                return "local files add and play";
            case 28:
                return "local files";
            default:
                return "Local Files Empty View";
        }
    }
}
