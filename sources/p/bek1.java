package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bek1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bek1(String str, byte b) {
        super(1);
        this.a = b;
        this.b = str;
    }

    public final Object invoke(Object obj) throws Exception {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.b;
        switch (b) {
            case 0:
                gol0 gol0Var = (gol0) obj;
                z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
                if (str == null) {
                    str = "";
                }
                return new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), gol0Var.a, r6h1.c, System.currentTimeMillis());
            case 1:
                b261.n((e261) obj, str);
                return rih1Var;
            case 2:
                b261.n((e261) obj, str);
                return rih1Var;
            case 3:
                b261.n((e261) obj, str);
                return rih1Var;
            case 4:
                return Single.just(str);
            case 5:
                b261.n((e261) obj, str);
                return rih1Var;
            case 6:
                e261 e261Var = (e261) obj;
                b261.n(e261Var, str);
                b261.x(e261Var, 0);
                return rih1Var;
            case 7:
                e261 e261Var2 = (e261) obj;
                if (str != null) {
                    b261.A(e261Var2, str);
                }
                return rih1Var;
            case 8:
                d441 d441VarG1 = ((y341) obj).g1("SELECT * FROM WiredHeadphoneFilterStateEntity WHERE owner = ?");
                try {
                    d441VarG1.K(1, str);
                    int iW = y7y0.w(d441VarG1, "headphoneIdentifier");
                    int iW2 = y7y0.w(d441VarG1, "owner");
                    int iW3 = y7y0.w(d441VarG1, "externalizationEnabledId");
                    int iW4 = y7y0.w(d441VarG1, "externalizationDisabledId");
                    int iW5 = y7y0.w(d441VarG1, "externalizationEnabled");
                    int iW6 = y7y0.w(d441VarG1, "specificEnabledId");
                    int iW7 = y7y0.w(d441VarG1, "specificDisabledId");
                    int iW8 = y7y0.w(d441VarG1, "specificEnabled");
                    int iW9 = y7y0.w(d441VarG1, "filterName");
                    ArrayList arrayList = new ArrayList();
                    while (d441VarG1.f1()) {
                        arrayList.add(new tul1(d441VarG1.P0(iW), d441VarG1.P0(iW2), d441VarG1.P0(iW3), d441VarG1.P0(iW4), d441VarG1.isNull(iW6) ? null : d441VarG1.P0(iW6), d441VarG1.P0(iW7), d441VarG1.isNull(iW9) ? null : d441VarG1.P0(iW9), ((int) d441VarG1.getLong(iW5)) != 0, ((int) d441VarG1.getLong(iW8)) != 0));
                        break;
                    }
                    return arrayList;
                } finally {
                    d441VarG1.close();
                }
            case 9:
                e261 e261Var3 = (e261) obj;
                b261.n(e261Var3, str);
                b261.c(e261Var3);
                return rih1Var;
            case 10:
                d4m1 d4m1Var = (d4m1) obj;
                Set setO1 = o7h.o1(d4m1Var.t);
                if (setO1.contains(new f3n0(str))) {
                    setO1.remove(new f3n0(str));
                } else {
                    setO1.add(new f3n0(str));
                }
                return d4m1.a(d4m1Var, (ws61) null, (String) null, false, 0, 0, 0, 0, 0, false, (puc) null, 0, 0, 0, false, (String) null, (List) null, setO1, (Integer) null, false, (gzl1) null, false, false, false, false, false, false, false, (qu61) null, -524289);
            case 11:
                return Boolean.valueOf(!((Set) obj).contains(str));
            case 12:
                return Boolean.valueOf(((Set) obj).contains(str));
            case 13:
                b261.n((e261) obj, str);
                return rih1Var;
            case 14:
                b261.n((e261) obj, str);
                return rih1Var;
            case 15:
                b261.C((e261) obj, new af5(str));
                return rih1Var;
            case 16:
                return ((o3m0) obj).a(str);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ((e261) obj).b(whm1.a, str);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                b261.n((e261) obj, str);
                return rih1Var;
            default:
                ((qv00) obj).a(str, uio.class, false);
                return rih1Var;
        }
    }
}
