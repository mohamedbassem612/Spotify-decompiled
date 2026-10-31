package p;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.webkit.CookieManager;
import com.google.protobuf.Empty;
import com.spotify.authentication.login5esperanto.EsAuthenticateResult;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsAuthStorageResult;
import com.spotify.connectivity.hosts.esperanto.proto.EsHosts;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.connectivity.productstate.ConvertProductStateValueException;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.CacheState;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;
import com.spotify.player.esperanto.proto.EsResponseWithReasons;
import com.spotify.prefs.esperanto.proto.EsPrefs$PrefValues;
import com.spotify.yourupdates.badgingstate.models.BadgingState;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import j$.util.Base64;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class f331 implements Predicate, Function, BiFunction, kdm, Producer, ukb0, wv91, Init {
    public final /* synthetic */ byte a;
    public static final f331 b = new f331(1);
    public static final f331 c = new f331(2);
    public static final f331 d = new f331(3);
    public static final f331 e = new f331(4);
    public static final f331 f = new f331(5);
    public static final f331 g = new f331(6);
    public static final f331 h = new f331(7);
    public static final f331 i = new f331(8);
    public static final f331 t = new f331(9);
    public static final f331 X = new f331(10);
    public static final f331 Y = new f331(11);
    public static final f331 Z = new f331(12);
    public static final f331 N0 = new f331(13);
    public static final f331 O0 = new f331(14);
    public static final f331 P0 = new f331(15);
    public static final f331 Q0 = new f331(16);
    public static final f331 R0 = new f331(17);
    public static final f331 S0 = new f331(18);
    public static final f331 T0 = new f331(19);
    public static final f331 U0 = new f331(20);
    public static final f331 V0 = new f331(21);
    public static final f331 W0 = new f331(23);
    public static final f331 X0 = new f331(24);
    public static final f331 Y0 = new f331(25);
    public static final f331 Z0 = new f331(26);
    public static final f331 a1 = new f331(27);
    public static final f331 b1 = new f331(28);
    public static final f331 c1 = new f331(29);

    public /* synthetic */ f331(byte b2) {
        this.a = b2;
    }

    public static Set b() {
        return as10.f(8, false, false, false, false);
    }

    public zob1 a() {
        return gio1.b(b7x.a);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public Object apply(Object obj) {
        boolean zJ = false;
        switch (this.a) {
            case 2:
                th61 th61Var = (th61) obj;
                if (!th61Var.b || th61Var.d) {
                    return th61Var.c ? yr4.a : yr4.c;
                }
                return yr4.b;
            case 3:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsAuthStorageResult.AuthStorageResult.p(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.connectivity.auth.storage.esperanto.proto.EsAuthStorageResult.AuthStorageResult: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 4:
                zd9 zd9Var = (zd9) obj;
                return new hj9(zd9Var.a, zd9Var.b);
            case 5:
            case 6:
            case 9:
            case 12:
            case 13:
            case 16:
            case 19:
            case 20:
            case 22:
            case 24:
            default:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return EsPrefs$PrefValues.q(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.prefs.esperanto.proto.EsPrefs.PrefValues: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 7:
                ry21 ry21Var = ((sy21) obj).a;
                if (ry21Var.Q0) {
                    return rih1.a;
                }
                eg.m(f4i1.c(ry21Var.d, "Failed to add reaction - Status: "));
                return null;
            case 8:
                byte[] bArr3 = (byte[]) obj;
                try {
                    return Empty.q(bArr3);
                } catch (Exception e4) {
                    bhn0.o(f4i1.f("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e4);
                    return null;
                }
            case 10:
                return new CompletableFromAction(new f72((CookieManager) obj, (byte) 9));
            case 11:
                return ((e1l) obj).b;
            case 14:
                ln41 ln41Var = (ln41) obj;
                if (!(ln41Var instanceof jn41)) {
                    return jow.a;
                }
                RetrofitMaker retrofitMaker = ((ui8) ((jn41) ln41Var).a).b().f;
                b510 b510Var = (b510) retrofitMaker.createWebgateService(b510.class, "android-external-integration-quasar");
                r310 r310Var = (r310) retrofitMaker.createWebgateService(r310.class, "android-external-integration-quasar");
                vgq0 vgq0Var = new vgq0((ugq0) retrofitMaker.createWebgateService(ugq0.class, "android-external-integration-quasar"), (byte) 0);
                ijg ijgVar = (ijg) retrofitMaker.createWebgateService(ijg.class, "android-external-integration-quasar");
                k370 k370Var = new k370();
                k370Var.f(null, "https://partnerapi.spotify.net/");
                return new iow(b510Var, r310Var, vgq0Var, ijgVar, (cf70) retrofitMaker.createCustomHostService(cf70.class, k370Var.b()));
            case 15:
                return m6p1.q((EsResponseWithReasons.ResponseWithReasons) obj);
            case 17:
                try {
                    zJ = yto.j((String) obj);
                    break;
                } catch (ConvertProductStateValueException unused) {
                }
                return Boolean.valueOf(zJ);
            case 18:
                byte[] bArr4 = (byte[]) obj;
                try {
                    return EsHosts.Hosts.q(bArr4);
                } catch (Exception e5) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.connectivity.hosts.esperanto.proto.EsHosts.Hosts: '", Base64.getEncoder().encodeToString(bArr4), "' (Base64)"), e5);
                    return null;
                }
            case 21:
                byte[] bArr5 = (byte[]) obj;
                try {
                    return EsAuthenticateResult.AuthenticateResult.v(bArr5);
                } catch (Exception e6) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.authentication.login5esperanto.EsAuthenticateResult.AuthenticateResult: '", Base64.getEncoder().encodeToString(bArr5), "' (Base64)"), e6);
                    return null;
                }
            case 23:
                return spq0.a(((dzm0) obj).b);
            case 25:
                return Boolean.valueOf(y7y0.L((Map) obj));
            case 26:
                return Single.just(j5.a);
        }
    }

    public Object e(be50 be50Var, lnm lnmVar) {
        long j = be50Var.u;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (j >> 32), (int) (j & 4294967295L), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Canvas canvas2 = v84.a;
        u84 u84Var = new u84();
        u84Var.a = canvas;
        be50Var.c(u84Var, (be50) null);
        return bitmapCreateBitmap;
    }

    @Override // com.spotify.mobius.Init
    public First e0(Object obj) {
        return xio1.q((uhm0) obj);
    }

    @Override // com.spotify.mobius.functions.Producer
    public Object get() {
        return new DispatcherWorker(igu.a);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.a) {
            case 1:
                return ((tv00) obj).b != null;
            case 6:
                List list = (List) obj;
                if ((list instanceof Collection) && list.isEmpty()) {
                    return false;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((l0l) it.next()).l()) {
                        return true;
                    }
                }
                return false;
            case 19:
                return foo1.x(((ge9) obj).b);
            default:
                return !((jdu0) obj).u;
        }
    }

    public String toString() {
        switch (this.a) {
            case 24:
                return "NeverEqualPolicy";
            default:
                return super.toString();
        }
    }

    public boolean x(Object obj, Object obj2) {
        return false;
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 5:
                return Boolean.valueOf(((CacheState) obj) != CacheState.LOADING && ((Boolean) obj2).booleanValue());
            default:
                BadgingState badgingState = (BadgingState) obj;
                Integer num = (Integer) obj2;
                if (num.intValue() > 0) {
                    return new t2a(num.intValue());
                }
                return badgingState == BadgingState.SHOW_BADGE ? u2a.a : v2a.a;
        }
    }
}
