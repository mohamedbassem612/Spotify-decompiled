package p;

import android.os.SystemClock;
import com.google.protobuf.Empty;
import com.spotify.accessory.categorizer.CategorizerResponse;
import com.spotify.ad.detection.esperanto.proto.AdDetectionOuterClass;
import com.spotify.authentication.login5esperanto.EsAccessTokenClient;
import com.spotify.collection_esperanto.proto.Status;
import com.spotify.connectivity.auth.clienttoken.esperanto.proto.EsClientToken;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function5;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q9w implements Function, s2i1, l3j0, Function5, BiFunction, Predicate, av30, BiPredicate, eky {
    public final /* synthetic */ byte a;
    public static final q9w b = new q9w(0);
    public static final q9w c = new q9w(1);
    public static final q9w d = new q9w(2);
    public static final uz1 e = new uz1((piz) null);
    public static final q9w f = new q9w(4);
    public static final q9w g = new q9w(5);
    public static final q9w h = new q9w(6);
    public static final q9w i = new q9w(7);
    public static final q9w t = new q9w(8);
    public static final q9w X = new q9w(9);
    public static final q9w Y = new q9w(10);
    public static final q9w Z = new q9w(11);
    public static final q9w N0 = new q9w(12);
    public static final q9w O0 = new q9w(13);
    public static final q9w P0 = new q9w(14);
    public static final q9w Q0 = new q9w(15);
    public static final q9w R0 = new q9w(16);
    public static final q9w S0 = new q9w(17);
    public static final q9w T0 = new q9w(18);
    public static final q9w U0 = new q9w(19);
    public static final q9w V0 = new q9w(20);
    public static final q9w W0 = new q9w(21);
    public static final q9w X0 = new q9w(22);
    public static final q9w Y0 = new q9w(23);
    public static final q9w Z0 = new q9w(24);
    public static final q9w a1 = new q9w(25);
    public static final q9w b1 = new q9w(26);
    public static final q9w c1 = new q9w(27);
    public static final q9w d1 = new q9w(28);
    public static final q9w e1 = new q9w(29);

    public /* synthetic */ q9w(byte b2) {
        this.a = b2;
    }

    public static long b() {
        return System.currentTimeMillis();
    }

    public static long c() {
        return SystemClock.elapsedRealtime();
    }

    public boolean a(ArrayList arrayList) {
        return true;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsAccessTokenClient.AccessTokenResponse.q(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.authentication.login5esperanto.EsAccessTokenClient.AccessTokenResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 2:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return AdDetectionOuterClass.SubscribeCanonicalToUserTimestampResponse.p(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.ad.detection.esperanto.proto.AdDetectionOuterClass.SubscribeCanonicalToUserTimestampResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 13:
            case 18:
            case 21:
            case 22:
            case 24:
            case 27:
            default:
                Throwable th = (Throwable) obj;
                return u890.j(th.getMessage(), "404") ? f900.a : new e900(th);
            case 6:
                return b7x.a;
            case 9:
                return ((xq8) obj).b;
            case 10:
                return new x49((bc20) obj);
            case 11:
                return Boolean.FALSE;
            case 12:
                String category = ((CategorizerResponse) obj).getCategory();
                category.getClass();
                return category;
            case 14:
                return (String) ((spq0) obj).b();
            case 15:
                return spq0.d(((EsClientToken.EncryptedClientToken) obj).n());
            case 16:
                byte[] bArr3 = (byte[]) obj;
                try {
                    return Status.p(bArr3);
                } catch (Exception e4) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.collection_esperanto.proto.Status: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e4);
                    return null;
                }
            case 17:
                byte[] bArr4 = (byte[]) obj;
                try {
                    return Empty.q(bArr4);
                } catch (Exception e5) {
                    bhn0.o(f4i1.f("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr4), "' (Base64)"), e5);
                    return null;
                }
            case 19:
                return ((th61) obj).a;
            case 20:
                return ((Boolean) obj).booleanValue() ? new hrn0(cyq.class, aqr0.a, a6w0.a) : crn0.a;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return (jxw0) obj;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return ((Boolean) obj).booleanValue() ? rou.a : qou.a;
            case 26:
                return ((s0w) obj).n;
            case 28:
                return Boolean.FALSE;
        }
    }

    public Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return o7h.N0((List) obj5, o7h.N0((List) obj4, o7h.N0((List) obj3, o7h.N0((List) obj2, (List) obj))));
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        switch (this.a) {
            case 4:
                return new e03(xkg0Var, str2, str);
            default:
                return new agc(xkg0Var, str2, str);
        }
    }

    public boolean test(Object obj, Object obj2) {
        l0l l0lVar = (l0l) obj;
        l0l l0lVar2 = (l0l) obj2;
        return u890.j(l0lVar.getName(), l0lVar2.getName()) && u890.j(l0lVar.j(), l0lVar2.j()) && l0lVar.F() && l0lVar2.F();
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 18:
                return !((uv00) obj).f;
            default:
                mmr0 mmr0Var = (mmr0) obj;
                if (k8c0.ON_DESTROY == mmr0Var.a) {
                    ypq0 ypq0Var = (ypq0) mmr0Var.b;
                    ypq0Var.getClass();
                    if (ypq0Var instanceof xpq0) {
                        return true;
                    }
                }
                return false;
        }
    }

    public Object apply(Object obj, Object obj2) {
        return new mmr0((a48) obj, (String) obj2);
    }
}
