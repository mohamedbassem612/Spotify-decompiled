package p;

import com.spotify.checkout.proto.model.v1.proto.GetCheckoutPageResponse;
import com.spotify.checkout.proto.model.v1.proto.Redirect;
import com.spotify.checkout.proto.model.v1.proto.n;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fki0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fki0(String str, byte b) {
        super(1);
        this.a = b;
        this.b = str;
    }

    public final Object invoke(Object obj) throws Exception {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        String str = this.b;
        switch (b) {
            case 0:
                b261.n((e261) obj, str);
                return rih1Var;
            case 1:
                return new y0l0((i3l0) obj, str);
            case 2:
                b261.n((e261) obj, str);
                return rih1Var;
            case 3:
                d441 d441VarG1 = ((y341) obj).g1("DELETE FROM messages WHERE `trigger` = ? AND messageId = -1");
                try {
                    d441VarG1.K(1, str);
                    d441VarG1.f1();
                    return rih1Var;
                } finally {
                    d441VarG1.close();
                }
            case 4:
                qv00 qv00Var = (qv00) obj;
                qv00Var.a(str, vn71.class, false);
                qv00Var.a(str, aw21.class, false);
                qv00Var.a(str, xv91.class, false);
                return rih1Var;
            case 5:
                return new uov0(str, (String) obj, true);
            case 6:
                return new uov0(str, (String) obj, true);
            case 7:
                str.getClass();
                b261.n((e261) obj, str);
                return rih1Var;
            case 8:
                ((qv00) obj).a(str, wuj0.class, false);
                return rih1Var;
            case 9:
                cnl0 cnl0Var = (cnl0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), cnl0Var.a, cnl0Var.b.b, System.currentTimeMillis());
            case 10:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), ((d0l0) obj).a, r6h1.c, System.currentTimeMillis());
            case 11:
                b261.n((e261) obj, str);
                return rih1Var;
            case 12:
                b261.n((e261) obj, str);
                return rih1Var;
            case 13:
                b261.n((e261) obj, str);
                return rih1Var;
            case 14:
                b261.n((e261) obj, str);
                return rih1Var;
            case 15:
                n nVarW = GetCheckoutPageResponse.w();
                k711 k711VarO = Redirect.o();
                k711VarO.n(str);
                nVarW.t(k711VarO);
                return nVarW.build();
            case 16:
                ((qv00) obj).a(str, xkk1.class, false);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ((qv00) obj).a(str, xkk1.class, false);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new t671(22, this.b, null, null, "music-video-prerelease", Collections.singletonList(gan0.a), false);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                b261.n((e261) obj, str);
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                qv00 qv00Var2 = (qv00) obj;
                qv00Var2.a(str, jo70.class, false);
                qv00Var2.a(str, hll.class, false);
                qv00Var2.a(str, xkk1.class, false);
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return Boolean.valueOf(u890.j((String) obj, str));
            case 22:
                b261.n((e261) obj, str);
                return rih1Var;
            case 23:
                return ((o3m0) obj).a(str);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                b261.n((e261) obj, str);
                return rih1Var;
            case 25:
                b261.n((e261) obj, str);
                return rih1Var;
            case 26:
                e261 e261Var = (e261) obj;
                b261.x(e261Var, 0);
                b261.n(e261Var, str);
                return rih1Var;
            case 27:
                ((qv00) obj).a(str, t8p0.class, true);
                return rih1Var;
            case 28:
                qv00 qv00Var3 = (qv00) obj;
                qv00Var3.a(str, jo70.class, false);
                qv00Var3.a(str, xkk1.class, false);
                return rih1Var;
            default:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), ((g1l0) obj).a, r6h1.c, System.currentTimeMillis());
        }
    }
}
