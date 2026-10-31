package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s8y0 implements i0v0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ s8y0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object a(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return (jk90) ((c1y0) obj3).a((qop) obj, (gl90) obj2);
            case 1:
                return (kk90) ((c1y0) obj3).a((qop) obj, (gl90) obj2);
            case 2:
                return (tf51) ((nkx0) obj3).a((qop) obj, (bct) obj2);
            case 3:
                return (r2g) ((c1y0) obj3).a((qop) obj, (jbt) obj2);
            case 4:
                return (anc0) ((c1y0) obj3).a((qop) obj, (act) obj2);
            case 5:
                return (mk90) ((c1y0) obj3).a((qop) obj, (zbt) obj2);
            case 6:
                return (p160) ((c1y0) obj3).a((qop) obj, (tbt) obj2);
            case 7:
                return (hk90) ((c1y0) obj3).a((qop) obj, (gl90) obj2);
            case 8:
                return (anc0) ((c1y0) obj3).a((qop) obj, (act) obj2);
            case 9:
                return (ic3) ((nkx0) obj3).a((c8c0) obj, (izu0) obj2);
            case 10:
                return (r2g) ((c1y0) obj3).a((qop) obj, (jbt) obj2);
            case 11:
                return (r2g) ((jf11) obj3).c((qop) obj, (jbt) obj2);
            case 12:
                return (mk90) ((jf11) obj3).c((qop) obj, (zbt) obj2);
            case 13:
                return (anc0) ((jf11) obj3).c((qop) obj, (act) obj2);
            case 14:
                return (tf51) ((jf11) obj3).c((qop) obj, (bct) obj2);
            case 15:
                return (r2g) ((jf11) obj3).c((qop) obj, (jbt) obj2);
            case 16:
                return (r2g) ((jf11) obj3).c((qop) obj, (jbt) obj2);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return (r2g) ((jf11) obj3).c((qop) obj, (jbt) obj2);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (fv50) ((jf11) obj3).c((qop) obj, (lbt) obj2);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return (fv50) ((jf11) obj3).c((qop) obj, (lbt) obj2);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return (anc0) ((jf11) obj3).c((qop) obj, (act) obj2);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return (qhv0) ((jf11) obj3).c((shv0) obj, (rhv0) obj2);
            case 22:
                return (mk90) ((hq81) obj3).a((qop) obj, (zbt) obj2);
            case 23:
                return (fv50) ((hq81) obj3).a((qop) obj, (lbt) obj2);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return (e73) ((uh61) obj3).a((qop) obj, (gzu0) obj2);
            case 25:
                return (p160) ((hq81) obj3).a((qop) obj, (tbt) obj2);
            case 26:
                return (nk90) ((uh61) obj3).a((qop) obj, (gl90) obj2);
            case 27:
                return (qk90) ((uh61) obj3).a((qop) obj, (gl90) obj2);
            case 28:
                return (zk90) ((uh61) obj3).a((qop) obj, (gl90) obj2);
            default:
                return (r2g) ((hq81) obj3).a((qop) obj, (jbt) obj2);
        }
    }

    public final String b() {
        switch (this.a) {
            case 0:
                return "Prompted recsplanation";
            case 1:
                return "Recsplanation card in footer for prompted playlists";
            case 2:
                return "prompted playlist ungenerated empty section";
            case 3:
                return "prompted playlist view prompt";
            case 4:
                return "provided sort reconciliation";
            case 5:
                return "standard queue";
            case 6:
                return "radio";
            case 7:
                return "reactions";
            case 8:
                return "Reaction lens for playlist collaboration";
            case 9:
                return "recommended music videos";
            case 10:
                return "refine";
            case 11:
                return "standard select";
            case 12:
                return "standard selection";
            case 13:
                return "standard selection restore";
            case 14:
                return "session control chips section";
            case 15:
                return "session control modify";
            case 16:
                return "session control video";
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return "standard settings";
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return "standard settings";
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return "share";
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return "standard screenshot detection";
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return "standard signaling";
            case 22:
                return "smart shuffle click";
            case 23:
                return "smart shuffle";
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return "songdna covers";
            case 25:
                return "songdna covers";
            case 26:
                return "songdna cover";
            case 27:
                return "songdna covers";
            case 28:
                return "songdna covers";
            default:
                return "standard sort";
        }
    }
}
