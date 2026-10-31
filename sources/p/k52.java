package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k52 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k52(iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        cf2 cf2Var = cf2.a;
        df2 df2Var = df2.a;
        ef2 ef2Var = ef2.a;
        jb2 jb2Var = jb2.a;
        jb2 jb2Var2 = jb2.b;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(a52.a);
                break;
            case 1:
                iu30Var.invoke(z42.a);
                break;
            case 2:
                iu30Var.invoke(w42.a);
                break;
            case 3:
                iu30Var.invoke(khb1.a);
                break;
            case 4:
                iu30Var.invoke(jhb1.a);
                break;
            case 5:
                iu30Var.invoke(r72.a);
                break;
            case 6:
                iu30Var.invoke(jb2Var);
                break;
            case 7:
                iu30Var.invoke(jb2Var2);
                break;
            case 8:
                iu30Var.invoke(jb2Var);
                break;
            case 9:
                iu30Var.invoke(jb2Var2);
                break;
            case 10:
                iu30Var.invoke(jb2Var);
                break;
            case 11:
                iu30Var.invoke(jb2Var2);
                break;
            case 12:
                iu30Var.invoke(rd2.a);
                break;
            case 13:
                iu30Var.invoke(cf2Var);
                break;
            case 14:
                iu30Var.invoke(df2Var);
                break;
            case 15:
                iu30Var.invoke(ef2Var);
                break;
            case 16:
                iu30Var.invoke(cf2Var);
                break;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                iu30Var.invoke(df2Var);
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                iu30Var.invoke(ef2Var);
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                iu30Var.invoke(qg2.a);
                break;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                iu30Var.invoke(ng2.a);
                break;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                iu30Var.invoke(mg2.a);
                break;
            case 22:
                iu30Var.invoke(zl2.a);
                break;
            case 23:
                iu30Var.invoke(bm2.a);
                break;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                iu30Var.invoke(am2.a);
                break;
            case 25:
                iu30Var.invoke(fm2.a);
                break;
            case 26:
                iu30Var.invoke(d63.a);
                break;
            case 27:
                iu30Var.invoke(e63.a);
                break;
            case 28:
                iu30Var.invoke(h73.a);
                break;
            default:
                iu30Var.invoke(de3.a);
                break;
        }
        return rih1Var;
    }
}
