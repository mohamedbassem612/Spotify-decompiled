package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class av8 implements i0v0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ av8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object a(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return (anc0) ((vq6) obj3).a((qop) obj, (act) obj2);
            case 1:
                return (fv50) ((vq6) obj3).a((qop) obj, (lbt) obj2);
            case 2:
                return (tf51) ((vq6) obj3).a((qop) obj, (bct) obj2);
            case 3:
                return (e0t) ((vq6) obj3).a((qop) obj, (xbt) obj2);
            case 4:
                return (fv50) ((vq6) obj3).a((qop) obj, (lbt) obj2);
            case 5:
                return (ik90) ((vq6) obj3).a((qop) obj, (gl90) obj2);
            case 6:
                return (hk90) ((vq6) obj3).a((qop) obj, (gl90) obj2);
            case 7:
                return (ic3) ((q58) obj3).b((c8c0) obj, (izu0) obj2);
            case 8:
                return (tf51) ((vq6) obj3).a((qop) obj, (bct) obj2);
            case 9:
                return (tf51) ((vq6) obj3).a((qop) obj, (bct) obj2);
            case 10:
                return (tf51) ((vq6) obj3).a((qop) obj, (bct) obj2);
            case 11:
                return (tf51) ((vq6) obj3).a((qop) obj, (bct) obj2);
            case 12:
                return (xne) ((q58) obj3).b((qop) obj, (gzu0) obj2);
            case 13:
                return (p160) ((lpd) obj3).b((qop) obj, (tbt) obj2);
            case 14:
                return (nk90) ((q58) obj3).b((qop) obj, (gl90) obj2);
            case 15:
                return (zk90) ((q58) obj3).b((qop) obj, (gl90) obj2);
            case 16:
                return (al90) ((q58) obj3).b((qop) obj, (gl90) obj2);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return (tf51) ((lpd) obj3).b((qop) obj, (bct) obj2);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (mk90) ((lpd) obj3).b((qop) obj, (zbt) obj2);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return (tf51) ((q58) obj3).b((qop) obj, (bct) obj2);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return (tf51) ((lpd) obj3).b((qop) obj, (bct) obj2);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return (r2g) ((eqg) obj3).a((qop) obj, (jbt) obj2);
            case 22:
                return (py50) ((lpd) obj3).b((qop) obj, (pbt) obj2);
            case 23:
                return (ok90) ((lpd) obj3).b((qop) obj, (gl90) obj2);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return (anc0) ((lpd) obj3).b((qop) obj, (act) obj2);
            case 25:
                return (tf51) ((lpd) obj3).b((qop) obj, (bct) obj2);
            case 26:
                return (jk90) ((lpd) obj3).b((qop) obj, (gl90) obj2);
            case 27:
                return (tf51) ((lpd) obj3).b((qop) obj, (bct) obj2);
            case 28:
                return (tf51) ((lpd) obj3).b((qop) obj, (bct) obj2);
            default:
                return (fv50) ((eqg) obj3).a((qop) obj, (lbt) obj2);
        }
    }

    public final String b() {
        switch (this.a) {
            case 0:
                return "standard auto lens";
            case 1:
                return "auto mix";
            case 2:
                return "blend add more";
            case 3:
                return "blend";
            case 4:
                return "blend invite friends";
            case 5:
                return "blend";
            case 6:
                return "blend profile";
            case 7:
                return "blend";
            case 8:
                return "blend referrals upsell";
            case 9:
                return "blend social prompting chips";
            case 10:
                return "blend social prompting description";
            case 11:
                return "standard bottom actions";
            case 12:
                return "charts";
            case 13:
                return "charts";
            case 14:
                return "charts";
            case 15:
                return "charts";
            case 16:
                return "charts";
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return "standard chip bar actions";
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return "standard click";
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return "Clips Empty View";
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return "clips filter and sort";
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return "clips filter chips";
            case 22:
                return "clips";
            case 23:
                return "collaboration badge";
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return "standard colors";
            case 25:
                return "concerts near you disclaimer";
            case 26:
                return "Concerts near you";
            case 27:
                return "concerts near you promo";
            case 28:
                return "standard content empty";
            default:
                return "standard context menu";
        }
    }
}
