package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class twa1 implements i0v0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ twa1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object a(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return (anc0) ((hq81) obj3).a((qop) obj, (act) obj2);
            case 1:
                return (ik90) ((hq81) obj3).a((qop) obj, (gl90) obj2);
            case 2:
                return (yu50) ((hq81) obj3).a((qop) obj, (rbt) obj2);
            case 3:
                return (py50) ((uh61) obj3).a((qop) obj, (pbt) obj2);
            case 4:
                return (u260) ((hq81) obj3).a((qop) obj, (ybt) obj2);
            case 5:
                return (uv50) ((hq81) obj3).a((qop) obj, (obt) obj2);
            case 6:
                return (yu50) ((hq81) obj3).a((qop) obj, (rbt) obj2);
            case 7:
                return (py50) ((hq81) obj3).a((qop) obj, (pbt) obj2);
            case 8:
                return (lz50) ((hq81) obj3).a((qop) obj, (qbt) obj2);
            case 9:
                return (yz50) ((hq81) obj3).a((qop) obj, (sbt) obj2);
            case 10:
                return (p160) ((hq81) obj3).a((qop) obj, (tbt) obj2);
            case 11:
                return (s160) ((hq81) obj3).a((qop) obj, (vbt) obj2);
            case 12:
                return (ik90) ((hq81) obj3).a((qop) obj, (gl90) obj2);
            case 13:
                return (jeb1) ((hq81) obj3).a((qop) obj, (gl90) obj2);
            case 14:
                return (qk90) ((uh61) obj3).a((qop) obj, (gl90) obj2);
            case 15:
                return (hk90) ((hq81) obj3).a((qop) obj, (gl90) obj2);
            case 16:
                return (hk90) ((hq81) obj3).a((qop) obj, (gl90) obj2);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return (hk90) ((hq81) obj3).a((qop) obj, (gl90) obj2);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (hk90) ((hq81) obj3).a((qop) obj, (gl90) obj2);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return (zk90) ((ifb1) obj3).a((qop) obj, (gl90) obj2);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return (al90) ((ifb1) obj3).a((qop) obj, (gl90) obj2);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return (ml90) ((ifb1) obj3).a((qop) obj, (gzu0) obj2);
            case 22:
                return (akj0) ((uh61) obj3).a((qop) obj, (gzu0) obj2);
            case 23:
                return (ic3) ((uh61) obj3).a((c8c0) obj, (izu0) obj2);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return (tf51) ((ifb1) obj3).a((qop) obj, (bct) obj2);
            case 25:
                return (zk90) ((uh61) obj3).a((qop) obj, (gl90) obj2);
            case 26:
                return (py50) ((ifb1) obj3).a((qop) obj, (pbt) obj2);
            case 27:
                return (p160) ((ifb1) obj3).a((qop) obj, (tbt) obj2);
            case 28:
                return (r2g) ((ifb1) obj3).a((qop) obj, (jbt) obj2);
            default:
                return (ic3) ((uh61) obj3).a((c8c0) obj, (izu0) obj2);
        }
    }

    public final String b() {
        switch (this.a) {
            case 0:
                return "speed disclosure";
            case 1:
                return "speed";
            case 2:
                return "sponsored playlist";
            case 3:
                return "sponsored playlist";
            case 4:
                return "sponsored playlist mute";
            case 5:
                return "standard";
            case 6:
                return "standard";
            case 7:
                return "standard";
            case 8:
                return "standard";
            case 9:
                return "standard";
            case 10:
                return "standard";
            case 11:
                return "standard";
            case 12:
                return "standard";
            case 13:
                return "standard";
            case 14:
                return "standard";
            case 15:
                return "standard";
            case 16:
                return "standard add to";
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return "standard ban";
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return "standard profile";
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return "standard";
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return "standard";
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return "standard";
            case 22:
                return "standard";
            case 23:
                return "standard";
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return "stream ad leave behind";
            case 25:
                return "sts imported";
            case 26:
                return "sts kungsholmen";
            case 27:
                return "sts kungsholmen";
            case 28:
                return "sts kungsholmen import";
            default:
                return "sts kungsholmen";
        }
    }
}
