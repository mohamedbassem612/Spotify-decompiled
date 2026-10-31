package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wel1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wel1(iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        wnk0 wnk0Var = wnk0.a;
        ijf1 ijf1Var = ijf1.b;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(wnk0Var);
                break;
            case 1:
                iu30Var.invoke(ijf1.a);
                break;
            case 2:
                iu30Var.invoke(ijf1Var);
                break;
            case 3:
                iu30Var.invoke(wnk0Var);
                break;
            case 4:
                iu30Var.invoke(ijf1Var);
                break;
            case 5:
                iu30Var.invoke(jhb1.a);
                break;
            case 6:
                iu30Var.invoke(khb1.a);
                break;
            case 7:
                iu30Var.invoke(d63.a);
                break;
            case 8:
                iu30Var.invoke(e63.a);
                break;
            case 9:
                iu30Var.invoke(c5m1.a);
                break;
            case 10:
                iu30Var.invoke(w6m1.a);
                break;
            case 11:
                iu30Var.invoke(Boolean.TRUE);
                break;
            case 12:
                iu30Var.invoke(s7m1.a);
                break;
            case 13:
                iu30Var.invoke(mvm1.e);
                break;
            case 14:
                iu30Var.invoke(mvm1.f);
                break;
            case 15:
                iu30Var.invoke(mvm1.d);
                break;
            case 16:
                iu30Var.invoke(mvm1.c);
                break;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                iu30Var.invoke(cym1.a);
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                iu30Var.invoke(tzm1.a);
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                iu30Var.invoke(wzm1.a);
                break;
            default:
                iu30Var.invoke(a3n1.a);
                break;
        }
        return rih1Var;
    }
}
