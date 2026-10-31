package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.tome.pageactivity.PageActivity;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ud20 implements Predicate, s2i1, Function, com.spotify.mobius.functions.Function, Init, mog0, Function3, BiFunction, k1q0 {
    public final /* synthetic */ byte a;
    public static final ud20 b = new ud20(0);
    public static final ud20 c = new ud20(1);
    public static final ud20 d = new ud20(2);
    public static final ud20 e = new ud20(3);
    public static final ud20 f = new ud20(4);
    public static final ud20 g = new ud20(5);
    public static final ud20 h = new ud20(6);
    public static final ud20 i = new ud20(7);
    public static final ud20 t = new ud20(8);
    public static final ud20 X = new ud20(9);
    public static final ud20 Y = new ud20(10);
    public static final ud20 Z = new ud20(11);
    public static final ud20 N0 = new ud20(12);
    public static final ud20 O0 = new ud20(13);
    public static final ud20 P0 = new ud20(14);
    public static final ud20 Q0 = new ud20(15);
    public static final ud20 R0 = new ud20(16);
    public static final ud20 S0 = new ud20(17);
    public static final ud20 T0 = new ud20(18);
    public static final ud20 U0 = new ud20(19);
    public static final ud20 V0 = new ud20(21);
    public static final ud20 W0 = new ud20(22);
    public static final ud20 X0 = new ud20(23);
    public static final ud20 Y0 = new ud20(24);
    public static final ud20 Z0 = new ud20(25);
    public static final ud20 a1 = new ud20(26);
    public static final ud20 b1 = new ud20(27);
    public static final ud20 c1 = new ud20(28);
    public static final ud20 d1 = new ud20(29);

    public /* synthetic */ ud20(byte b2) {
        this.a = b2;
    }

    public static Intent e(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setClassName(context.getApplicationContext(), PageActivity.class.getName());
        intent.setFlags(536870912);
        return intent;
    }

    public void a(nog0 nog0Var, log0 log0Var, Object obj) {
        ((tog0) log0Var).c = obj;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 3:
                return new k5b(((vc90) obj).a);
            case 4:
                List list = (List) obj;
                int iS = zno1.s(q7h.U(list, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj2 : list) {
                    linkedHashMap.put(((eww0) obj2).a, obj2);
                }
                return linkedHashMap;
            case 5:
                return crn0.a;
            case 6:
            case 10:
            case 12:
            case 13:
            case 14:
            case 15:
            case 20:
            case 22:
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
            case 26:
            default:
                return Boolean.valueOf(y7y0.u("has-audiobooks-subscription", (Map) obj, false));
            case 7:
                return ((Uri) obj).toString();
            case 8:
                return new tn3((zoc0) obj);
            case 9:
                return new dw11(new px11((yw11) obj));
            case 11:
                return new sif0(((Boolean) obj).booleanValue());
            case 16:
                return new xzo0((d7l) obj);
            case 17:
                return (Maybe) obj;
            case 18:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsOffline.SetOfflinePlaybackAllowedResponse.o(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.offline_esperanto.proto.EsOffline.SetOfflinePlaybackAllowedResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 19:
                return Boolean.valueOf(((EsOffline.HasResourceResponse) obj).n());
            case 21:
                tfw tfwVar = (tfw) obj;
                return Observable.just(tfwVar).delay(tfwVar.a.toMillis(), TimeUnit.MILLISECONDS).map(kc20.W0);
            case 24:
                return new cse1((srt0) obj);
            case 27:
                return Boolean.valueOf(y7y0.t("has-podcasts-available", (Map) obj));
        }
    }

    public rog0 b() {
        return rog0.a;
    }

    public log0 c(nog0 nog0Var, Object obj, int i2, log0 log0Var) {
        tog0 tog0Var = (tog0) log0Var;
        return tog0Var == null ? new tog0(obj, i2) : new sog0(obj, i2, tog0Var);
    }

    public log0 d(nog0 nog0Var, log0 log0Var, log0 log0Var2) {
        tog0 tog0Var = (tog0) log0Var;
        tog0 tog0Var2 = (tog0) log0Var2;
        Object obj = ((hog0) tog0Var).a;
        int i2 = ((hog0) tog0Var).b;
        tog0 tog0Var3 = tog0Var2 == null ? new tog0(obj, i2) : new sog0(obj, i2, tog0Var2);
        tog0Var3.c = tog0Var.c;
        return tog0Var3;
    }

    public First e0(Object obj) {
        switch (this.a) {
            case 10:
                return First.b((qze0) obj);
            case 13:
                return First.b((fpi0) obj);
            default:
                ucm1 ucm1Var = (ucm1) obj;
                rcf rcfVar = ucm1Var.a;
                xj61 xj61Var = new xj61();
                if (rcfVar instanceof rcf) {
                    xj61Var.add(new gcm1(rcfVar.a()));
                }
                if (ucm1Var.b) {
                    xj61Var.add(kcm1.e);
                }
                return First.c(ucm1Var, cwl1.j(xj61Var));
        }
    }

    public rog0 f() {
        return rog0.a;
    }

    public nog0 h(ipg0 ipg0Var, int i2) {
        return new uog0(ipg0Var, i2);
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        switch (this.a) {
            case 2:
                return new sc40(xkg0Var, str2, str);
            default:
                String str3 = (String) linkedHashMap.get("playlist_id");
                if (str3 != null && str3.length() == 22) {
                    int length = str3.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        char cCharAt = str3.charAt(i2);
                        if (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || ('0' <= cCharAt && cCharAt < ':'))) {
                        }
                    }
                    return new dyu0(str3, xkg0Var, str2, str);
                }
                return null;
        }
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        return new yvg1((Long) obj, (Boolean) obj2, (Map) obj3);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 1:
                return ((sy21) obj).a.Q0;
            case 15:
                return ((th61) obj).b;
            default:
                return ((g0u0) obj).b != l650.a;
        }
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        nk80 nk80VarI = hsl1Var.a.i(647);
        int i2 = nk80VarI.b;
        int i3 = nk80VarI.d;
        view.setPadding(nk80VarI.a, i2, nk80VarI.c, i3);
        return hsl1.b;
    }

    public Object apply(Object obj, Object obj2) {
        return new fvf1(((Number) obj).longValue(), ((Number) obj2).longValue());
    }
}
