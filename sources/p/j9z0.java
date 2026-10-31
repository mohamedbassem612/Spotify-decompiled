package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j9z0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j9z0(iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        y601 y601Var = y601.a;
        x601 x601Var = x601.a;
        w601 w601Var = w601.a;
        ka01 ka01Var = ka01.a;
        ja01 ja01Var = ja01.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(i9z0.a);
                return rih1Var;
            case 1:
                iu30Var.invoke(k9z0.a);
                return rih1Var;
            case 2:
                iu30Var.invoke(faz0.a);
                return rih1Var;
            case 3:
                iu30Var.invoke(ncz0.a);
                return rih1Var;
            case 4:
                iu30Var.invoke(diz0.a);
                return rih1Var;
            case 5:
                iu30Var.invoke(ckz0.a);
                return rih1Var;
            case 6:
                iu30Var.invoke(otz0.a);
                return rih1Var;
            case 7:
                iu30Var.invoke(rtz0.a);
                return rih1Var;
            case 8:
                iu30Var.invoke(gzz0.a);
                return rih1Var;
            case 9:
                iu30Var.invoke(azz0.a);
                return rih1Var;
            case 10:
                iu30Var.invoke(p101.a);
                return rih1Var;
            case 11:
                iu30Var.invoke(q201.a);
                return rih1Var;
            case 12:
                iu30Var.invoke(o301.a);
                return rih1Var;
            case 13:
                iu30Var.invoke(x601Var);
                return Boolean.TRUE;
            case 14:
                iu30Var.invoke(y601Var);
                return Boolean.TRUE;
            case 15:
                iu30Var.invoke(w601Var);
                return rih1Var;
            case 16:
                iu30Var.invoke(y601Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                iu30Var.invoke(x601Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                iu30Var.invoke(w601Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                iu30Var.invoke(ja01Var);
                return Boolean.TRUE;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                iu30Var.invoke(ka01Var);
                return Boolean.TRUE;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                iu30Var.invoke(ia01.a);
                return rih1Var;
            case 22:
                iu30Var.invoke(ka01Var);
                return rih1Var;
            case 23:
                iu30Var.invoke(ja01Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                iu30Var.invoke(nd01.a);
                return rih1Var;
            case 25:
                iu30Var.invoke(wg01.a);
                return rih1Var;
            case 26:
                iu30Var.invoke(bh01.a);
                return rih1Var;
            case 27:
                iu30Var.invoke(ch01.a);
                return rih1Var;
            case 28:
                iu30Var.invoke(wh01.a);
                return rih1Var;
            default:
                iu30Var.invoke(wk01.a);
                return rih1Var;
        }
    }
}
