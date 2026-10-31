package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jd1 implements i0v0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ jd1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object a(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return (r2g) ((g21) obj3).c((qop) obj, (jbt) obj2);
            case 1:
                return (tf51) ((g21) obj3).c((qop) obj, (bct) obj2);
            case 2:
                return (fv50) ((g21) obj3).c((qop) obj, (lbt) obj2);
            case 3:
                return (mk90) ((g21) obj3).c((qop) obj, (zbt) obj2);
            case 4:
                return (r2g) ((g21) obj3).c((qop) obj, (jbt) obj2);
            case 5:
                return (ok90) ((g21) obj3).c((qop) obj, (gl90) obj2);
            case 6:
                return (e73) ((c9r) obj3).a((qop) obj, (gzu0) obj2);
            case 7:
                return (tf51) ((c9r) obj3).a((qop) obj, (bct) obj2);
            case 8:
                return (tf51) ((c9r) obj3).a((qop) obj, (bct) obj2);
            case 9:
                return (py50) ((c9r) obj3).a((qop) obj, (pbt) obj2);
            case 10:
                return (lz50) ((g21) obj3).c((qop) obj, (qbt) obj2);
            case 11:
                return (p160) ((g21) obj3).c((qop) obj, (tbt) obj2);
            case 12:
                return (s160) ((g21) obj3).c((qop) obj, (vbt) obj2);
            case 13:
                return (tf51) ((g21) obj3).c((qop) obj, (bct) obj2);
            case 14:
                return (tf51) ((g21) obj3).c((qop) obj, (bct) obj2);
            case 15:
                return (akj0) ((g21) obj3).c((qop) obj, (gzu0) obj2);
            case 16:
                return (qhv0) ((g21) obj3).c((shv0) obj, (rhv0) obj2);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return (ic3) ((c9r) obj3).a((c8c0) obj, (izu0) obj2);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (tf51) ((g21) obj3).c((qop) obj, (bct) obj2);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return (zqw) ((g21) obj3).c((qop) obj, (fl90) obj2);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return (tf51) ((g21) obj3).c((qop) obj, (bct) obj2);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return (tf51) ((g21) obj3).c((qop) obj, (bct) obj2);
            case 22:
                return (qhv0) ((g21) obj3).c((shv0) obj, (rhv0) obj2);
            case 23:
                return (mk90) ((g21) obj3).c((qop) obj, (zbt) obj2);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return (tf51) ((vq6) obj3).a((qop) obj, (bct) obj2);
            case 25:
                return (tf51) ((vq6) obj3).a((qop) obj, (bct) obj2);
            case 26:
                return (ic3) ((um5) obj3).b((c8c0) obj, (izu0) obj2);
            case 27:
                return (zqw) ((vq6) obj3).a((qop) obj, (fl90) obj2);
            case 28:
                return (ml90) ((um5) obj3).b((qop) obj, (gzu0) obj2);
            default:
                return (zqw) ((vq6) obj3).a((qop) obj, (fl90) obj2);
        }
    }

    public final String b() {
        switch (this.a) {
            case 0:
                return "standard add";
            case 1:
                return "standard add more";
            case 2:
                return "aligned curation add to";
            case 3:
                return "aligned curation add to";
            case 4:
                return "advanced curation";
            case 5:
                return "recently added";
            case 6:
                return "album";
            case 7:
                return "album empty";
            case 8:
                return "album copyrights";
            case 9:
                return "album";
            case 10:
                return "album";
            case 11:
                return "album";
            case 12:
                return "album";
            case 13:
                return "album listening party";
            case 14:
                return "album merch carousel";
            case 15:
                return "album";
            case 16:
                return "album not on demand";
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return "album";
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return "recommended playlist carousel";
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return "album track";
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return "album release date";
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return "Album unlock card";
            case 22:
                return "algosharing";
            case 23:
                return "Allowlist request on click, long press and context menu";
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return "artist link row";
            case 25:
                return "album artist list";
            case 26:
                return "artist music videos";
            case 27:
                return "audio book";
            case 28:
                return "audio book show v4";
            default:
                return "audiobook release row";
        }
    }
}
