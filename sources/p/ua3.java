package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ua3 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mr20[] b;

    public /* synthetic */ ua3(mr20[] mr20VarArr, byte b) {
        this.a = b;
        this.b = mr20VarArr;
    }

    public final Object invoke() {
        byte b = this.a;
        mr20[] mr20VarArr = this.b;
        switch (b) {
            case 0:
                return new k1r[mr20VarArr.length];
            case 1:
                return new mmr0[mr20VarArr.length];
            case 2:
                return new mmr0[mr20VarArr.length];
            case 3:
                return new List[mr20VarArr.length];
            case 4:
                return new mmr0[mr20VarArr.length];
            case 5:
                return new List[mr20VarArr.length];
            case 6:
                return new Boolean[mr20VarArr.length];
            case 7:
                return new Set[mr20VarArr.length];
            case 8:
                return new yho0[mr20VarArr.length];
            case 9:
                return new List[mr20VarArr.length];
            case 10:
                return new hd80[mr20VarArr.length];
            case 11:
                return new mmr0[mr20VarArr.length];
            case 12:
                return new List[mr20VarArr.length];
            case 13:
                return new gd80[mr20VarArr.length];
            case 14:
                return new x0a0[mr20VarArr.length];
            case 15:
                return new ki90[mr20VarArr.length];
            case 16:
                return new List[mr20VarArr.length];
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new mmr0[mr20VarArr.length];
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new lax[mr20VarArr.length];
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new mmr0[mr20VarArr.length];
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new pmd[mr20VarArr.length];
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new Object[mr20VarArr.length];
            case 22:
                return new k1r[mr20VarArr.length];
            case 23:
                return new ly50[mr20VarArr.length];
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new mmr0[mr20VarArr.length];
            case 25:
                return new xgc0[mr20VarArr.length];
            case 26:
                return new zo50[mr20VarArr.length];
            case 27:
                return new mmr0[mr20VarArr.length];
            case 28:
                return new jhm[mr20VarArr.length];
            default:
                return new mmr0[mr20VarArr.length];
        }
    }
}
