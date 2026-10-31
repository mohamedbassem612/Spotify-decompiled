package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.podcast.endpointsimpl.experimental.show.exceptions.BookUriRedirectException;
import com.spotify.podcast.endpointsimpl.experimental.show.exceptions.CountryRestrictedException;
import com.spotify.podcast.endpointsimpl.experimental.show.exceptions.RequiredMetadataMissingException;
import com.spotify.podcast.endpointsimpl.experimental.show.exceptions.ShowEsperantoEndpointException;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cl1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl1(dgb dgbVar, String str, boolean z) {
        super(1);
        this.a = (byte) 8;
        this.c = str;
        this.b = z;
    }

    public final Object invoke(Object obj) throws Exception {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.b;
        String str = this.c;
        switch (b) {
            case 0:
                o3m0 o3m0Var = (o3m0) obj;
                return z ? o3m0Var.i(str) : o3m0Var.j(str);
            case 1:
                r2l0 r2l0Var = (r2l0) obj;
                return z ? r2l0Var.h(str) : r2l0Var.e(str);
            case 2:
                e261 e261Var = (e261) obj;
                b261.y(e261Var, z);
                if (str != null) {
                    b261.A(e261Var, str);
                }
                return rih1Var;
            case 3:
                y6h1 y6h1Var = ((s2l0) obj).a;
                return !z ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("hide_entity", 1, Collections.singletonMap("entity_to_hide", str)), y6h1Var, r6h1.c, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_hide_entity", 1, Collections.singletonMap("entity_to_remove_hide", str)), y6h1Var, r6h1.c, System.currentTimeMillis());
            case 4:
                y6h1 y6h1Var2 = ((t2l0) obj).a;
                if (z) {
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_hide_entity", 1, Collections.singletonMap("entity_to_remove_hide", str != null ? str : "")), y6h1Var2, r6h1.c, System.currentTimeMillis());
                } else {
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("hide_entity", 1, Collections.singletonMap("entity_to_hide", str != null ? str : "")), y6h1Var2, r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
            case 5:
                t7d t7dVar = (t7d) obj;
                return z ? new p7d(str, t7dVar) : new q7d(str, t7dVar);
            case 6:
                e261 e261Var2 = (e261) obj;
                if (z) {
                    b261.n(e261Var2, str);
                }
                return rih1Var;
            case 7:
                e261 e261Var3 = (e261) obj;
                b261.n(e261Var3, str);
                if (!z) {
                    b261.a(e261Var3);
                }
                return rih1Var;
            case 8:
                g281 g281Var = ((c481) obj).a;
                f281 f281Var = g281Var.t;
                tu00 tu00Var = g281Var.y;
                ma8 ma8VarA = tu00Var.a(ma8.class);
                iam iamVarA = tu00Var.a(iam.class);
                zoy0 zoy0VarA = tu00Var.a(zoy0.class);
                if (z && iamVarA == null) {
                    return new RequiredMetadataMissingException(Collections.singletonList(hz00.X2), str);
                }
                if ((iamVarA != null ? iamVarA.a : 0) != 8 || zoy0VarA == null || !l4o1.R(zoy0VarA)) {
                    att0 att0VarA = tu00Var.a(att0.class);
                    r1p1 r1p1Var = att0VarA != null ? att0VarA.b : null;
                    yst0 yst0Var = yst0.d;
                    if (u890.j(r1p1Var, yst0Var)) {
                        if (u890.j(ma8VarA != null ? ma8VarA.b : null, la8.b)) {
                            return new BookUriRedirectException(l1d.m("spotify:show:", str), ma8VarA.a);
                        }
                    }
                    att0 att0VarA2 = tu00Var.a(att0.class);
                    if (u890.j(att0VarA2 != null ? att0VarA2.b : null, yst0Var)) {
                        return new CountryRestrictedException();
                    }
                    if (g281Var.a.length() == 0) {
                        return new ShowEsperantoEndpointException(l1d.m("Show response with empty uri for show ID: ", str));
                    }
                    if (f281Var == f281.d || f281Var == f281.c) {
                        return new ShowEsperantoEndpointException("This media type is not supported: " + f281Var);
                    }
                }
                return null;
            case 9:
                q2l0 q2l0Var = (q2l0) obj;
                return z ? q2l0Var.h(str) : q2l0Var.e(str);
            case 10:
                q2l0 q2l0Var2 = (q2l0) obj;
                return z ? q2l0Var2.h(str) : q2l0Var2.e(str);
            case 11:
                q2l0 q2l0Var3 = (q2l0) obj;
                return z ? q2l0Var3.h(str) : q2l0Var3.e(str);
            case 12:
                q2l0 q2l0Var4 = (q2l0) obj;
                return z ? q2l0Var4.h(str) : q2l0Var4.e(str);
            case 13:
                q2l0 q2l0Var5 = (q2l0) obj;
                return z ? q2l0Var5.h(str) : q2l0Var5.e(str);
            case 14:
                d441 d441VarG1 = ((y341) obj).g1("UPDATE liked_songs_filter_tags_entity SET isSelected = ? WHERE id = ?");
                try {
                    d441VarG1.r(1, z ? 1L : 0L);
                    d441VarG1.K(2, str);
                    d441VarG1.f1();
                    return rih1Var;
                } finally {
                    d441VarG1.close();
                }
            case 15:
                r2l0 r2l0Var2 = (r2l0) obj;
                return !z ? r2l0Var2.e(str) : r2l0Var2.h(str);
            case 16:
                r2l0 r2l0Var3 = (r2l0) obj;
                return z ? r2l0Var3.h(str) : r2l0Var3.e(str);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                r2l0 r2l0Var4 = (r2l0) obj;
                return z ? r2l0Var4.h(str) : r2l0Var4.e(str);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                y6h1 y6h1Var3 = ((u2l0) obj).a;
                if (z) {
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("include_in_recommendations", 1, Collections.singletonMap("context_to_be_included", str != null ? str : "")), y6h1Var3, r6h1.c, System.currentTimeMillis());
                } else {
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("exclude_from_recommendations", 1, Collections.singletonMap("context_to_be_excluded", str != null ? str : "")), y6h1Var3, r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var2;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                e261 e261Var4 = (e261) obj;
                b261.c(e261Var4);
                if (z) {
                    b261.A(e261Var4, str);
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                e261 e261Var5 = (e261) obj;
                b261.y(e261Var5, z);
                if (z) {
                    b261.A(e261Var5, str);
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                y6h1 y6h1Var4 = ((azk0) obj).a;
                if (z) {
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("hide_playlist_on_profile", 1, Collections.singletonMap("playlist_to_be_hidden", str != null ? str : "")), y6h1Var4, r6h1.c, System.currentTimeMillis());
                } else {
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("show_playlist_on_profile", 1, Collections.singletonMap("playlist_to_be_shown", str != null ? str : "")), y6h1Var4, r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 22:
                y6h1 y6h1Var5 = ((y0l0) obj).a;
                return z ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), y6h1Var5, r6h1.c, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var5, r6h1.c, System.currentTimeMillis());
            case 23:
                q2l0 q2l0Var6 = (q2l0) obj;
                return z ? q2l0Var6.h(str) : q2l0Var6.e(str);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                e261 e261Var6 = (e261) obj;
                e261Var6.b(uxs0.a, Boolean.valueOf(z));
                e261Var6.b(uxs0.b, str);
                return rih1Var;
            case 25:
                o3m0 o3m0Var2 = (o3m0) obj;
                return z ? o3m0Var2.i(str) : o3m0Var2.j(str);
            case 26:
                e261 e261Var7 = (e261) obj;
                b261.x(e261Var7, 0);
                b261.y(e261Var7, z);
                b261.n(e261Var7, str);
                return rih1Var;
            case 27:
                e261 e261Var8 = (e261) obj;
                b261.x(e261Var8, 0);
                b261.y(e261Var8, z);
                b261.n(e261Var8, str);
                return rih1Var;
            case 28:
                qv00 qv00Var = (qv00) obj;
                qv00Var.a(str, jo70.class, false);
                if (z) {
                    qv00Var.a(str, hll.class, false);
                }
                return rih1Var;
            default:
                e261 e261Var9 = (e261) obj;
                b261.n(e261Var9, str);
                if (!z) {
                    b261.a(e261Var9);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cl1(String str, boolean z, byte b) {
        super(1);
        this.a = b;
        this.c = str;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cl1(boolean z, String str, byte b) {
        super(1);
        this.a = b;
        this.b = z;
        this.c = str;
    }
}
