package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ldd0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mr20[] b;

    public /* synthetic */ ldd0(mr20[] mr20VarArr, byte b) {
        this.a = b;
        this.b = mr20VarArr;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new e331[this.b.length];
            case 1:
                return new k1r[this.b.length];
            case 2:
                return new Boolean[this.b.length];
            case 3:
                return new List[this.b.length];
            case 4:
                return new mmr0[this.b.length];
            case 5:
                return new usn0[this.b.length];
            case 6:
                return new mmr0[this.b.length];
            case 7:
                return new vyo0[this.b.length];
            case 8:
                return new mmr0[this.b.length];
            case 9:
                return new k1r[this.b.length];
            case 10:
                return new mmr0[this.b.length];
            case 11:
                return new List[this.b.length];
            case 12:
                return new p0v0[this.b.length];
            case 13:
                return new mmr0[this.b.length];
            case 14:
                return new Object[this.b.length];
            case 15:
                return new mmr0[this.b.length];
            case 16:
                return new k1r[this.b.length];
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new sq61[this.b.length];
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new Boolean[this.b.length];
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new av61[this.b.length];
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new wu61[this.b.length];
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new mmr0[this.b.length];
            case 22:
                return new n7a1[this.b.length];
            case 23:
                return new xkk1[this.b.length];
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new List[this.b.length];
            case 25:
                return new mmr0[this.b.length];
            default:
                return new ojl[this.b.length];
        }
    }
}
