package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wk1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk1(Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        switch (b) {
            case 8:
                this.b = function0;
                this.c = i;
                super(2);
                break;
            default:
                this.b = function0;
                this.c = i;
                break;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        Function0 function0 = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                i8p1.a(function0, b0kVar, czo1.p(i | 1));
                break;
            case 1:
                t4n1.b(function0, b0kVar, czo1.p(i | 1));
                break;
            case 2:
                loo1.m(function0, b0kVar, czo1.p(i | 1));
                break;
            case 3:
                hxo1.f(function0, b0kVar, czo1.p(i | 1));
                break;
            case 4:
                r6p1.f(function0, b0kVar, czo1.p(i | 1));
                break;
            case 5:
                e130.b(i, czo1.p(1), function0, b0kVar);
                break;
            case 6:
                s8p1.d(i, czo1.p(1), function0, b0kVar);
                break;
            case 7:
                kqn1.e(function0, b0kVar, czo1.p(i | 1));
                break;
            case 8:
                ltn1.h(function0, b0kVar, czo1.p(i | 1));
                break;
            case 9:
                xyn1.k(function0, b0kVar, czo1.p(i | 1));
                break;
            case 10:
                nz80.i(function0, b0kVar, czo1.p(i | 1));
                break;
            case 11:
                obg1.f(function0, b0kVar, czo1.p(i | 1));
                break;
            case 12:
                obg1.g(function0, b0kVar, czo1.p(i | 1));
                break;
            case 13:
                mth1.j(function0, b0kVar, czo1.p(i | 1));
                break;
            case 14:
                vyo1.e(function0, b0kVar, czo1.p(i | 1));
                break;
            case 15:
                vyo1.k(function0, b0kVar, czo1.p(i | 1));
                break;
            case 16:
                azo1.e(function0, b0kVar, czo1.p(i | 1));
                break;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                xzo1.f(i, czo1.p(1), function0, b0kVar);
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                zzo1.b(function0, b0kVar, czo1.p(i | 1));
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                slk0.b(i, czo1.p(1), function0, b0kVar);
                break;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                wqn1.f(function0, b0kVar, czo1.p(i | 1));
                break;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                wqn1.i(function0, b0kVar, czo1.p(i | 1));
                break;
            case 22:
                zho1.o(function0, b0kVar, czo1.p(i | 1));
                break;
            case 23:
                ejo1.g(function0, b0kVar, czo1.p(i | 1));
                break;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                wro1.r(function0, b0kVar, czo1.p(i | 1));
                break;
            case 25:
                c0p1.a(i, czo1.p(1), function0, b0kVar);
                break;
            case 26:
                wro1.y(function0, b0kVar, czo1.p(i | 1));
                break;
            case 27:
                wro1.z(function0, b0kVar, czo1.p(i | 1));
                break;
            case 28:
                wro1.z(function0, b0kVar, czo1.p(i | 1));
                break;
            default:
                zro1.d(function0, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wk1(int i, Function0 function0, int i2, byte b) {
        super(2);
        this.a = b;
        this.c = i;
        this.b = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wk1(byte b, int i, Function0 function0, boolean z) {
        super(2);
        this.a = b;
        this.b = function0;
        this.c = i;
    }
}
