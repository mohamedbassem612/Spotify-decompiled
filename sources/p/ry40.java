package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ry40 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ry40(String str, byte b) {
        super(1);
        this.a = b;
        this.b = str;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        String str = this.b;
        switch (b) {
            case 0:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), ((gzk0) obj).a, r6h1.c, System.currentTimeMillis());
            case 1:
                return ((j0l0) obj).a(str);
            case 2:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("create_radio", 1, Collections.singletonMap("based_on_item", str != null ? str : "")), ((szk0) obj).a, r6h1.c, System.currentTimeMillis());
            case 3:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), ((k0l0) obj).a, r6h1.c, System.currentTimeMillis());
            case 4:
                b261.B((e261) obj, str);
                return rih1Var;
            case 5:
                e261 e261Var = (e261) obj;
                b261.B(e261Var, "GranularRatingsCard");
                b261.n(e261Var, str);
                return rih1Var;
            case 6:
                b261.A((e261) obj, str);
                return rih1Var;
            case 7:
                b261.n((e261) obj, str);
                return rih1Var;
            case 8:
                b261.n((e261) obj, str);
                return rih1Var;
            case 9:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("hide_entity", 1, Collections.singletonMap("entity_to_hide", str != null ? str : "")), ((n0l0) obj).a, r6h1.c, System.currentTimeMillis());
            case 10:
                b261.n((e261) obj, str);
                return rih1Var;
            case 11:
                return ((c2l0) obj).e(str);
            case 12:
                if (((Number) obj).intValue() == 204) {
                    return new IOException("Could not find ".concat(str));
                }
                return null;
            case 13:
                ((qv00) obj).a(str, jo70.class, false);
                return rih1Var;
            case 14:
                return ((o3m0) obj).a(str);
            case 15:
                b261.n((e261) obj, str);
                return rih1Var;
            case 16:
                b261.n((e261) obj, str);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                e261 e261Var2 = (e261) obj;
                b261.n(e261Var2, str);
                b261.c(e261Var2);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                b261.n((e261) obj, str);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                b261.n((e261) obj, str);
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return Boolean.valueOf(!u890.j(((qo90) obj).a, str != null ? str : null));
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                List list = ((qo90) obj).d;
                if ((list instanceof Collection) && list.isEmpty()) {
                    z = true;
                } else {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (u890.j(((po90) it.next()).b, str)) {
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 22:
                e261 e261Var3 = (e261) obj;
                b261.n(e261Var3, str);
                b261.t(e261Var3, 0);
                return rih1Var;
            case 23:
                b261.n((e261) obj, str);
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                b261.n((e261) obj, str);
                return rih1Var;
            case 25:
                b261.n((e261) obj, str);
                return rih1Var;
            case 26:
                ((qv00) obj).a(str, muf0.class, false);
                return rih1Var;
            case 27:
                return Boolean.valueOf(u890.j(((rxc0) obj).a, str));
            case 28:
                return Boolean.valueOf(((xxc0) obj).a.equals(str));
            default:
                return ((o3m0) obj).i(str);
        }
    }
}
