package p;

import com.spotify.allboarding.allboardingimpl.presentation.summary.SummaryFragment;
import com.spotify.allboarding.allboardingimpl.search.SearchFragment;
import com.spotify.allboarding.allboardingimpl.skip.SkipDialogFragment;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uww0 implements ni30 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ uww0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final zf30 a() {
        byte b = 26;
        byte b2 = 27;
        byte b3 = 5;
        byte b4 = 10;
        byte b5 = 11;
        byte b6 = 3;
        switch (this.a) {
            case 0:
                return new rww0(new pjq0(this, (byte) 25));
            case 1:
                return new fmx0(new pjq0(this, (byte) 29));
            case 2:
                return new i501(new c1y0(this, b));
            case 3:
                return new y901(new c1y0(this, b2));
            case 4:
                return new j421(new jf11(this, b6));
            case 5:
                return new zj21(new jf11((Object) this, (byte) 4));
            case 6:
                return new im21(new jf11(this, b3));
            case 7:
                return new mh41(new jf11((Object) this, (byte) 9));
            case 8:
                return new SearchFragment(new jf11(this, b4));
            case 9:
                return new s871(new jf11((Object) this, (byte) 23));
            case 10:
                return new uj81(new jf11(this, b));
            case 11:
                return new kk81(new jf11(this, b2));
            case 12:
                return new qk81(new jf11((Object) this, (byte) 28));
            case 13:
                return new fq81(new hq81(this, (byte) 0));
            case 14:
                return new SkipDialogFragment(new hq81(this, (byte) 1));
            case 15:
                return new ia91(new hq81(this, (byte) 2));
            case 16:
                return new un91(new hq81(this, b3));
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new qq91(new hq81(this, (byte) 6));
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new hga1(new hq81(this, (byte) 8));
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new lqa1(new hq81(this, b4));
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new fva1(new hq81(this, b5));
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new fib1(new ifb1(this, (byte) 3));
            case 22:
                return new SummaryFragment(new ifb1(this, (byte) 12));
            case 23:
                return new l0d1(new ifb1(this, (byte) 13));
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ifb1 ifb1Var = new ifb1(this, (byte) 15);
                oyd1 oyd1Var = new oyd1();
                oyd1Var.b2 = ifb1Var;
                return oyd1Var;
            case 25:
                return new kii1(new iyh1(this, (byte) 3));
            case 26:
                return new c5l1(new iyh1(this, (byte) 11));
            default:
                s24 s24Var = (s24) this.b;
                return new t1n0((Map) s24Var.b, (wbr0) s24Var.d, (vbr0) s24Var.e, (sbr0) s24Var.f, (rbr0) s24Var.g, (n431) s24Var.h, (fkk1) s24Var.t, (o7r0) s24Var.c, (kly0) s24Var.N0, (sg30) s24Var.i, (lzn0) s24Var.X, (lnn0) s24Var.Y, ((z45) ((kly0) s24Var.Z).get()).a());
        }
    }
}
