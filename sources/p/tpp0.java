package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tpp0 implements i0v0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ tpp0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object a(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return (anc0) ((m6k0) obj3).b((qop) obj, (act) obj2);
            case 1:
                return (py50) ((m6k0) obj3).b((qop) obj, (pbt) obj2);
            case 2:
                return (ic3) ((qpp0) obj3).a((c8c0) obj, (izu0) obj2);
            case 3:
                return (anc0) ((pjq0) obj3).b((qop) obj, (act) obj2);
            case 4:
                return (anc0) ((pjq0) obj3).b((qop) obj, (act) obj2);
            case 5:
                return (ml90) ((qpp0) obj3).a((qop) obj, (gzu0) obj2);
            case 6:
                return (anc0) ((pjq0) obj3).b((qop) obj, (act) obj2);
            case 7:
                return (anc0) ((pjq0) obj3).b((qop) obj, (act) obj2);
            case 8:
                return (anc0) ((pjq0) obj3).b((qop) obj, (act) obj2);
            case 9:
                return (tf51) ((pjq0) obj3).b((qop) obj, (bct) obj2);
            case 10:
                return (anc0) ((pjq0) obj3).b((qop) obj, (act) obj2);
            case 11:
                return (tf51) ((pjq0) obj3).b((qop) obj, (bct) obj2);
            case 12:
                return (anc0) ((pjq0) obj3).b((qop) obj, (act) obj2);
            case 13:
                return (rv50) ((pjq0) obj3).b((qop) obj, (mbt) obj2);
            case 14:
                return (r2g) ((c1y0) obj3).a((qop) obj, (jbt) obj2);
            case 15:
                return (r2g) ((c1y0) obj3).a((qop) obj, (jbt) obj2);
            case 16:
                return (r2g) ((c1y0) obj3).a((qop) obj, (jbt) obj2);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return (rv50) ((c1y0) obj3).a((qop) obj, (mbt) obj2);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (tf51) ((c1y0) obj3).a((qop) obj, (bct) obj2);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return (r2g) ((c1y0) obj3).a((qop) obj, (jbt) obj2);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return (tf51) ((c1y0) obj3).a((qop) obj, (bct) obj2);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return (s160) ((c1y0) obj3).a((qop) obj, (vbt) obj2);
            case 22:
                return (py50) ((nkx0) obj3).a((qop) obj, (pbt) obj2);
            case 23:
                return (lz50) ((c1y0) obj3).a((qop) obj, (qbt) obj2);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return (p160) ((c1y0) obj3).a((qop) obj, (tbt) obj2);
            case 25:
                return (anc0) ((c1y0) obj3).a((qop) obj, (act) obj2);
            case 26:
                return (anc0) ((c1y0) obj3).a((qop) obj, (act) obj2);
            case 27:
                return (r2g) ((c1y0) obj3).a((qop) obj, (jbt) obj2);
            case 28:
                return (ok90) ((c1y0) obj3).a((qop) obj, (gl90) obj2);
            default:
                return (r2g) ((c1y0) obj3).a((qop) obj, (jbt) obj2);
        }
    }

    public final String b() {
        switch (this.a) {
            case 0:
                return "offline backup sort order sync";
            case 1:
                return "offline playable artist";
            case 2:
                return "offline playable artist";
            case 3:
                return "open mixing edit sheet";
            case 4:
                return "open share flow";
            case 5:
                return "original video";
            case 6:
                return "standard page metadata";
            case 7:
                return "standard permissions snackbar";
            case 8:
                return "shuffle ranking lens";
            case 9:
                return "prompted playlist play when ready";
            case 10:
                return "playable audiobook lens";
            case 11:
                return "album popular releases carousel";
            case 12:
                return "standard privacy snackbar";
            case 13:
                return "promo disclosure";
            case 14:
                return "Promptable UCP actions (with prompts)";
            case 15:
                return "Promptable UCP actions (without prompts)";
            case 16:
                return "prompted playlist add";
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return "prompted-playlist-banner";
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return "prompted playlist content empty";
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return "prompted playlist edit";
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return "prompted playlist feedback";
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return "prompted playlist";
            case 22:
                return "prompted playlist";
            case 23:
                return "prompted playlists";
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return "prompted playlist metadata row";
            case 25:
                return "Prompted Playlist Notification Opt-In";
            case 26:
                return "Prompted Playlist Overdue Refresh";
            case 27:
                return "prompted playlist reasoning";
            case 28:
                return "prompted playlist recently added";
            default:
                return "prompted playlist refine";
        }
    }
}
