package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class v1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v1(String str, byte b) {
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
                b261.n((e261) obj, str);
                return rih1Var;
            case 1:
                qv00 qv00Var = (qv00) obj;
                qv00Var.a(str, xkk1.class, false);
                qv00Var.a(str, jo70.class, false);
                return rih1Var;
            case 2:
                b261.n((e261) obj, str);
                return rih1Var;
            case 3:
                b261.n((e261) obj, str);
                return rih1Var;
            case 4:
                b261.n((e261) obj, str);
                return rih1Var;
            case 5:
                b261.n((e261) obj, str);
                return rih1Var;
            case 6:
                return Collections.singleton(str);
            case 7:
                b261.n((e261) obj, str);
                return rih1Var;
            case 8:
                b261.n((e261) obj, str);
                return rih1Var;
            case 9:
                b261.n((e261) obj, str);
                return rih1Var;
            case 10:
                ((e261) obj).b(zyd1.e, str);
                return rih1Var;
            case 11:
                r1l0 r1l0Var = (r1l0) obj;
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                if (str == null) {
                    str = "";
                }
                return new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), r1l0Var.a, r6h1.c, System.currentTimeMillis());
            case 12:
                b261.n((e261) obj, str);
                return rih1Var;
            case 13:
                return new w7h1("", "", new z7h1("double_hit", 1, b7xVar), new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", str)), ((p3m0) obj).a, r6h1.c, System.currentTimeMillis());
            case 14:
                b261.n((e261) obj, str);
                return rih1Var;
            case 15:
                return ((uyk0) obj).e(str);
            case 16:
                ((qv00) obj).a(str, uio.class, false);
                return rih1Var;
            case 17:
                b261.n((e261) obj, str);
                return rih1Var;
            case 18:
                ((qv00) obj).a(str, tlr0.class, false);
                return rih1Var;
            case 19:
                b261.n((e261) obj, str);
                return rih1Var;
            case 20:
                ((qv00) obj).a(str, jo70.class, false);
                return rih1Var;
            case 21:
                b261.n((e261) obj, str);
                return rih1Var;
            case 22:
                b261.n((e261) obj, str);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                b261.n((e261) obj, str);
                return rih1Var;
            case 24:
                b261.n((e261) obj, str);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                qm31 qm31Var = (qm31) obj;
                boolean z = qm31Var.b;
                String str2 = qm31Var.a;
                return z ? xcg1.i(str2, " ", str) : str2;
            case 26:
                b261.n((e261) obj, str);
                return rih1Var;
            case 27:
                ((qv00) obj).a(str, gh3.class, false);
                return rih1Var;
            case 28:
                ((qv00) obj).a(str, zoy0.class, false);
                return rih1Var;
            default:
                ((qv00) obj).a(str, zd3.class, false);
                return rih1Var;
        }
    }
}
