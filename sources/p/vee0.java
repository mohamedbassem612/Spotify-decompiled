package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vee0 implements i0v0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ vee0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object a(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return (py50) ((c8d0) obj3).j((qop) obj, (pbt) obj2);
            case 1:
                return (kfc0) ((mna0) obj3).a((qop) obj, (gzu0) obj2);
            case 2:
                return (zk90) ((mna0) obj3).a((qop) obj, (gl90) obj2);
            case 3:
                return (qhv0) ((c8d0) obj3).j((shv0) obj, (rhv0) obj2);
            case 4:
                return (ic3) ((mna0) obj3).a((c8c0) obj, (izu0) obj2);
            case 5:
                return (tf51) ((c8d0) obj3).j((qop) obj, (bct) obj2);
            case 6:
                return (r2g) ((c8d0) obj3).j((qop) obj, (jbt) obj2);
            case 7:
                return (py50) ((m6k0) obj3).b((qop) obj, (pbt) obj2);
            case 8:
                return (hk90) ((m6k0) obj3).b((qop) obj, (gl90) obj2);
            case 9:
                return (anc0) ((m6k0) obj3).b((qop) obj, (act) obj2);
            case 10:
                return (tf51) ((m6k0) obj3).b((qop) obj, (bct) obj2);
            case 11:
                return (zk90) ((m6k0) obj3).b((qop) obj, (gl90) obj2);
            case 12:
                return (al90) ((czh0) obj3).b((qop) obj, (gl90) obj2);
            case 13:
                return (tf51) ((m6k0) obj3).b((qop) obj, (bct) obj2);
            case 14:
                return (zk90) ((czh0) obj3).b((qop) obj, (gl90) obj2);
            case 15:
                return (al90) ((czh0) obj3).b((qop) obj, (gl90) obj2);
            case 16:
                return (zqw) ((m6k0) obj3).b((qop) obj, (fl90) obj2);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return (s160) ((m6k0) obj3).b((qop) obj, (vbt) obj2);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (py50) ((ncn0) obj3).a((qop) obj, (pbt) obj2);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return (fv50) ((m6k0) obj3).b((qop) obj, (lbt) obj2);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return (xne) ((ncn0) obj3).a((qop) obj, (gzu0) obj2);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return (tf51) ((m6k0) obj3).b((qop) obj, (bct) obj2);
            case 22:
                return (r2g) ((m6k0) obj3).b((qop) obj, (jbt) obj2);
            case 23:
                return (tf51) ((m6k0) obj3).b((qop) obj, (bct) obj2);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return (py50) ((m6k0) obj3).b((qop) obj, (pbt) obj2);
            case 25:
                return (ik90) ((m6k0) obj3).b((qop) obj, (gl90) obj2);
            case 26:
                return (zk90) ((ncn0) obj3).a((qop) obj, (gl90) obj2);
            case 27:
                return (al90) ((ncn0) obj3).a((qop) obj, (gl90) obj2);
            case 28:
                return (ic3) ((qpp0) obj3).a((c8c0) obj, (izu0) obj2);
            default:
                return (rq21) ((qpp0) obj3).a((sq21) obj, (jq21) obj2);
        }
    }

    public final String b() {
        switch (this.a) {
            case 0:
                return "local files";
            case 1:
                return "local files";
            case 2:
                return "local files";
            case 3:
                return "local files open with";
            case 4:
                return "local files";
            case 5:
                return "inline card message from client messaging platform";
            case 6:
                return "mixing";
            case 7:
                return "mixing";
            case 8:
                return "mixing";
            case 9:
                return "mixing sort order";
            case 10:
                return "standard more like this";
            case 11:
                return "music episode";
            case 12:
                return "music episode";
            case 13:
                return "music guesser entrypoint";
            case 14:
                return "music podcast chapter";
            case 15:
                return "music podcast chapter";
            case 16:
                return "music video";
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return "music video playlists";
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return "music videos see all";
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return "offline backup add to";
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return "offline backup";
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return "Offline Backup Empty View";
            case 22:
                return "offline backup filter chips";
            case 23:
                return "Offline Backup Filter Chips";
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return "offline backup";
            case 25:
                return "offline backup";
            case 26:
                return "offline backup";
            case 27:
                return "offline backup";
            case 28:
                return "offline backup";
            default:
                return "Offline backup";
        }
    }
}
