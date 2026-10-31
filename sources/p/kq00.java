package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kq00 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kq00(String str, byte b) {
        super(1);
        this.a = b;
        this.b = str;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.b;
        switch (b) {
            case 0:
                e261 e261Var = (e261) obj;
                b261.x(e261Var, 0);
                b261.n(e261Var, str);
                return rih1Var;
            case 1:
                ((qv00) obj).a(str, xkk1.class, false);
                return rih1Var;
            case 2:
                ((qv00) obj).a(str, uio.class, false);
                return rih1Var;
            case 3:
                ((qv00) obj).a(str, z1g1.class, false);
                return rih1Var;
            case 4:
                ((qv00) obj).a(str, jvd0.class, false);
                return rih1Var;
            case 5:
                qv00 qv00Var = (qv00) obj;
                qv00Var.a(str, mdz.class, false);
                qv00Var.a(str, jo70.class, false);
                return rih1Var;
            case 6:
                ((qv00) obj).a(str, w281.class, false);
                return rih1Var;
            case 7:
                ((qv00) obj).a(str, xkk1.class, false);
                return rih1Var;
            case 8:
                return new cmb(str);
            case 9:
                return Collections.singleton(str);
            case 10:
                return new swh(str);
            case 11:
                str.getClass();
                b261.n((e261) obj, str);
                return rih1Var;
            case 12:
                Logger.d(gvg.h("Failed loading playlist ", str, ", error: ", ((jy21) obj).b()), new Object[0]);
                return j5.a;
            case 13:
                b261.n((e261) obj, str);
                return rih1Var;
            case 14:
                b261.n((e261) obj, str);
                return rih1Var;
            case 15:
                b261.n((e261) obj, str);
                return rih1Var;
            case 16:
                b261.n((e261) obj, str);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                e261 e261Var2 = (e261) obj;
                b261.x(e261Var2, 0);
                b261.n(e261Var2, str);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                e261 e261Var3 = (e261) obj;
                b261.c(e261Var3);
                b261.n(e261Var3, str);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                b261.n((e261) obj, str);
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                b261.n((e261) obj, str);
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                b261.n((e261) obj, str);
                return rih1Var;
            case 22:
                return Boolean.valueOf(u890.j(((mmr0) obj).a, str));
            case 23:
                ((qv00) obj).a(str, l1z.class, false);
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                qv00 qv00Var2 = (qv00) obj;
                qv00Var2.a(str, w281.class, false);
                qv00Var2.a(str, den.class, false);
                return rih1Var;
            case 25:
                qv00 qv00Var3 = (qv00) obj;
                qv00Var3.a(str, tlr0.class, false);
                qv00Var3.a(str, w281.class, false);
                return rih1Var;
            case 26:
                ((qv00) obj).a(str, v740.class, false);
                return rih1Var;
            case 27:
                ((qv00) obj).a(str, l1z.class, false);
                return rih1Var;
            case 28:
                ((qv00) obj).b(w281.class, Collections.singletonList(str), true);
                return rih1Var;
            default:
                qv00 qv00Var4 = (qv00) obj;
                qv00Var4.a(str, jo70.class, false);
                qv00Var4.a(str, xkk1.class, false);
                qv00Var4.a(str, hzy.class, false);
                return rih1Var;
        }
    }
}
