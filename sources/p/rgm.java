package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rgm implements i0v0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ rgm(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object a(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return (mk90) ((lpd) obj3).b((qop) obj, (zbt) obj2);
            case 1:
                return (u260) ((eqg) obj3).a((qop) obj, (ybt) obj2);
            case 2:
                return (qk90) ((eqg) obj3).a((qop) obj, (gl90) obj2);
            case 3:
                return (ml90) ((eqg) obj3).a((qop) obj, (gzu0) obj2);
            case 4:
                return (akj0) ((eqg) obj3).a((qop) obj, (gzu0) obj2);
            case 5:
                return (r2g) ((lpd) obj3).b((qop) obj, (jbt) obj2);
            case 6:
                return (jk90) ((lpd) obj3).b((qop) obj, (gl90) obj2);
            case 7:
                return (tf51) ((thn) obj3).c((qop) obj, (bct) obj2);
            case 8:
                return (yz50) ((thn) obj3).c((qop) obj, (sbt) obj2);
            case 9:
                qop qopVar = (qop) obj;
                qopVar.getClass();
                ((wbt) obj2).getClass();
                return new v7r(qopVar.d(), new nu((byte) 7));
            case 10:
                return (anc0) ((thn) obj3).c((qop) obj, (act) obj2);
            case 11:
                return (fv50) ((thn) obj3).c((qop) obj, (lbt) obj2);
            case 12:
                return (anc0) ((thn) obj3).c((qop) obj, (act) obj2);
            case 13:
                return (r2g) ((thn) obj3).c((qop) obj, (jbt) obj2);
            case 14:
                return (r2g) ((thn) obj3).c((qop) obj, (jbt) obj2);
            case 15:
                return (lz50) ((thn) obj3).c((qop) obj, (qbt) obj2);
            case 16:
                return (tf51) ((thn) obj3).c((qop) obj, (bct) obj2);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return (tf51) ((thn) obj3).c((qop) obj, (bct) obj2);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (rq21) ((thn) obj3).c((sq21) obj, (jq21) obj2);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return (fv50) ((nay) obj3).a((qop) obj, (lbt) obj2);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ((qop) obj).getClass();
                ((gzu0) obj2).getClass();
                return new uo7((byte) 2);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return (zqw) ((nay) obj3).a((qop) obj, (fl90) obj2);
            case 22:
                return (ml90) ((nay) obj3).a((qop) obj, (gzu0) obj2);
            case 23:
                return (zqw) ((nay) obj3).a((qop) obj, (fl90) obj2);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return (tf51) ((nay) obj3).a((qop) obj, (bct) obj2);
            case 25:
                return (r2g) ((nay) obj3).a((qop) obj, (jbt) obj2);
            case 26:
                return (tf51) ((bf70) obj3).b((qop) obj, (bct) obj2);
            case 27:
                return (tf51) ((bf70) obj3).b((qop) obj, (bct) obj2);
            case 28:
                return (xne) ((bf70) obj3).b((qop) obj, (gzu0) obj2);
            default:
                return (p160) ((bf70) obj3).b((qop) obj, (tbt) obj2);
        }
    }

    public final String b() {
        switch (this.a) {
            case 0:
                return "standard context menu";
            case 1:
                return "standard context menu trailing action";
            case 2:
                return "contextual flair badge";
            case 3:
                return "contextual flair item extension";
            case 4:
                return "contextual flair playlist extension";
            case 5:
                return "Contribution notes toggle";
            case 6:
                return "Contribution notes";
            case 7:
                return "daylist discover";
            case 8:
                return "daylist";
            case 9:
                return "daylist";
            case 10:
                return "standard deleted by owner";
            case 11:
                return "standard download";
            case 12:
                return "standard dsa personalized recommendations disabled";
            case 13:
                return "standard duplicate";
            case 14:
                return "standard edit";
            case 15:
                return "editorial";
            case 16:
                return "Embedded ad mid section";
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return "Embedded ad";
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return "endless";
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return "watch feed";
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return "entity segment";
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return "entity segments release row";
            case 22:
                return "episode segments";
            case 23:
                return "episode release row";
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return "standard extender";
            case 25:
                return "standard history";
            case 26:
                return "inline entity explorer row";
            case 27:
                return "kallax create";
            case 28:
                return "kallax";
            default:
                return "kallax";
        }
    }
}
