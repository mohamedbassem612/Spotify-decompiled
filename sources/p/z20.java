package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z20 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z20(iu30 iu30Var, boolean z, byte b) {
        super(0);
        this.a = b;
        this.c = iu30Var;
        this.b = z;
    }

    public final Object invoke() {
        byte b = this.a;
        cmm1 cmm1Var = cmm1.a;
        amm1 amm1Var = amm1.a;
        emm1 emm1Var = emm1.a;
        ylm1 ylm1Var = ylm1.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    iu30Var.invoke(q7x0.Z);
                }
                break;
            case 1:
                if (!z) {
                    iu30Var.invoke(q7x0.t);
                }
                break;
            case 2:
                if (!z) {
                    iu30Var.invoke(q7x0.i);
                }
                break;
            case 3:
                if (z) {
                    iu30Var.invoke(tw50.a);
                }
                break;
            case 4:
                iu30Var.invoke(z ? vq0.b : vq0.a);
                break;
            case 5:
                iu30Var.invoke(z ? vo9.a : wo9.a);
                break;
            case 6:
                iu30Var.invoke(new b6f(z));
                break;
            case 7:
                iu30Var.invoke(Boolean.valueOf(!z));
                break;
            case 8:
                iu30Var.invoke(new yhh(z));
                break;
            case 9:
                iu30Var.invoke(z ? x920.b : x920.a);
                break;
            case 10:
                if (z) {
                    iu30Var.invoke(gbz0.a);
                }
                break;
            case 11:
                if (!z) {
                    iu30Var.invoke(hls.a);
                } else {
                    iu30Var.invoke(hls.b);
                }
                break;
            case 12:
                iu30Var.invoke(z ? cvu.a : cvu.b);
                break;
            case 13:
                iu30Var.invoke(z ? bvu.a : bvu.b);
                break;
            case 14:
                iu30Var.invoke(Boolean.valueOf(!z));
                break;
            case 15:
                if (!z) {
                    iu30Var.invoke(bmy.a);
                } else {
                    iu30Var.invoke(amy.a);
                }
                break;
            case 16:
                if (z) {
                    iu30Var.invoke(cpd1.a);
                }
                break;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                iu30Var.invoke(Boolean.valueOf(!z));
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                iu30Var.invoke(Boolean.valueOf(!z));
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                if (!z) {
                    iu30Var.invoke(cmm1Var);
                } else {
                    iu30Var.invoke(amm1Var);
                }
                break;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                if (!z) {
                    iu30Var.invoke(emm1Var);
                } else {
                    iu30Var.invoke(ylm1Var);
                }
                break;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                if (!z) {
                    iu30Var.invoke(cmm1Var);
                } else {
                    iu30Var.invoke(amm1Var);
                }
                break;
            case 22:
                if (!z) {
                    iu30Var.invoke(emm1Var);
                } else {
                    iu30Var.invoke(ylm1Var);
                }
                break;
            case 23:
                iu30Var.invoke(new mbd1(!z));
                break;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                iu30Var.invoke(z ? piw0.b : piw0.a);
                break;
            case 25:
                iu30Var.invoke(Boolean.valueOf(!z));
                break;
            case 26:
                iu30Var.invoke(Boolean.valueOf(z));
                break;
            case 27:
                if (z) {
                    iu30Var.invoke(n301.a);
                }
                break;
            case 28:
                if (z) {
                    iu30Var.invoke(l301.a);
                }
                break;
            default:
                if (z) {
                    iu30Var.invoke(t301.a);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z20(boolean z, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = z;
        this.c = iu30Var;
    }
}
