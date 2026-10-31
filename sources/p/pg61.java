package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.smartshuffle.signals.SendSignalFailedException;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pg61 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pg61(String str, byte b) {
        super(1);
        this.a = b;
        this.b = str;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        String str = this.b;
        switch (b) {
            case 0:
                e261 e261Var = (e261) obj;
                b261.C(e261Var, new af5(str));
                b261.A(e261Var, str);
                return rih1Var;
            case 1:
                g2l0 g2l0Var = (g2l0) obj;
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                if (str == null) {
                    str = "";
                }
                return new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), g2l0Var.a, r6h1.c, System.currentTimeMillis());
            case 2:
                return u890.j(((sq61) obj).getId(), str) ? new tq61(1.0f) : uq61.a;
            case 3:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), ((f0l0) obj).a, r6h1.c, System.currentTimeMillis());
            case 4:
                return Boolean.valueOf(u890.j(((wu61) obj).b, str));
            case 5:
                return new v171(str, ((p271) obj).b);
            case 6:
                ((qv00) obj).a(str, xkk1.class, false);
                return rih1Var;
            case 7:
                return new h2l0((i3l0) obj, str);
            case 8:
                ((qv00) obj).a(str, jo70.class, false);
                return rih1Var;
            case 9:
                ((qv00) obj).a(str, d7u0.class, false);
                return rih1Var;
            case 10:
                ((qv00) obj).a(str, jo70.class, false);
                return rih1Var;
            case 11:
                return new h2l0((i3l0) obj, str);
            case 12:
                b261.n((e261) obj, str);
                return rih1Var;
            case 13:
                e261 e261Var2 = (e261) obj;
                b261.c(e261Var2);
                b261.n(e261Var2, str);
                return rih1Var;
            case 14:
                ((qv00) obj).a(str, va81.class, false);
                return rih1Var;
            case 15:
                ((qv00) obj).a(str, iam.class, false);
                return rih1Var;
            case 16:
                ((qv00) obj).a(str, zoy0.class, false);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                qv00 qv00Var = (qv00) obj;
                qv00Var.a(str, jo70.class, false);
                qv00Var.a(str, hll.class, false);
                qv00Var.a(str, xkk1.class, false);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ((qv00) obj).a(str, jo70.class, false);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                Logger.d(gvg.h("Failed loading playlist ", str, ", error: ", ((jy21) obj).b()), new Object[0]);
                return j5.a;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                b261.n((e261) obj, str);
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                b261.n((e261) obj, str);
                return rih1Var;
            case 22:
                b261.n((e261) obj, str);
                return rih1Var;
            case 23:
                e261 e261Var3 = (e261) obj;
                b261.c(e261Var3);
                b261.n(e261Var3, str);
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                Logger.d(gvg.h("Failed sending signal ", str, ", ", ((jy21) obj).b()), new Object[0]);
                return Completable.j(new SendSignalFailedException());
            case 25:
                Logger.b(f4i1.f("Smart Shuffle signal ", str, " sent successfully"), new Object[0]);
                return CompletableEmpty.a;
            case 26:
                b261.n((e261) obj, str);
                return rih1Var;
            case 27:
                b261.n((e261) obj, str);
                return rih1Var;
            case 28:
                b261.n((e261) obj, str);
                return rih1Var;
            default:
                e261 e261Var4 = (e261) obj;
                b261.t(e261Var4, 0);
                b261.d(e261Var4);
                if (str.length() > 0) {
                    b261.n(e261Var4, str);
                }
                return rih1Var;
        }
    }
}
