package p;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.protobuf.BoolValue;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoContainsResponse;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoItemsResponse;
import com.spotify.connect.esperanto.proto.CommonMessages;
import com.spotify.episode.episodeassociationsimpl.proto.EpisodeassociationsResponse$Component;
import com.spotify.episode.episodeassociationsimpl.proto.EpisodeassociationsResponse$GetComponentsResponse;
import com.spotify.episode.episodeassociationsimpl.proto.EpisodeassociationsResponse$LinkedEntitiesComponent;
import com.spotify.episode.episodeassociationsimpl.proto.EpisodeassociationsResponse$RelatedContentComponent;
import com.spotify.player.esperanto.proto.EsContextPlayerError;
import com.spotify.player.esperanto.proto.EsResponseWithReasons;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import spotify.autodownload.esperanto.proto.EnabledShowsCountResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public class fmv implements Function, Predicate, av30, BiFunction, Function3 {
    public static volatile Handler N0;
    public final /* synthetic */ byte a;
    public static final fmv b = new fmv(1);
    public static final fmv c = new fmv(2);
    public static final fmv d = new fmv(3);
    public static final fmv e = new fmv(4);
    public static final fmv f = new fmv(5);
    public static final fmv g = new fmv(6);
    public static final fmv h = new fmv(7);
    public static final fmv i = new fmv(8);
    public static final fmv t = new fmv(9);
    public static final fmv X = new fmv(10);
    public static final fmv Y = new fmv(11);
    public static final fmv Z = new fmv(12);
    public static final q58 O0 = new q58((byte) 21);
    public static final fmv P0 = new fmv(14);
    public static final fmv Q0 = new fmv(15);
    public static final fmv R0 = new fmv(16);
    public static final fmv S0 = new fmv(17);
    public static final fmv T0 = new fmv(18);
    public static final fmv U0 = new fmv(19);
    public static final fmv V0 = new fmv(20);
    public static final fmv W0 = new fmv(21);
    public static final fmv X0 = new fmv(22);
    public static final fmv Y0 = new fmv(23);
    public static final fmv Z0 = new fmv(25);
    public static final fmv a1 = new fmv(26);
    public static final fmv b1 = new fmv(27);
    public static final fmv c1 = new fmv(28);
    public static final fmv d1 = new fmv(29);

    public /* synthetic */ fmv(byte b2) {
        this.a = b2;
    }

    public static e5u c() {
        return new e5u((p3v) null, "wrap");
    }

    public void a(float f2, float f3, float f4, bx61 bx61Var) {
        bx61Var.c(f2, 0.0f);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                return new i5w0((Map) obj);
            case 2:
                return new g8o0((Throwable) obj, (bk8) null);
            case 3:
                String str = (String) ((ContextTrack) ((PlayerState) obj).track().b()).metadata().get("advertiser");
                return str == null ? "" : str;
            case 4:
                return ((hi90) obj).d;
            case 5:
                return Boolean.valueOf(((String) obj).equals("1"));
            case 6:
                return Boolean.valueOf(((nc6) obj) instanceof mc6);
            case 7:
                return Boolean.valueOf(y7y0.t("obfuscate-restricted-tracks", (Map) obj));
            case 8:
            case 12:
            case 13:
            case 14:
            case 22:
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
            case 24:
            default:
                return m6p1.q((EsResponseWithReasons.ResponseWithReasons) obj);
            case 9:
                byte[] bArr = (byte[]) obj;
                try {
                    return EnabledShowsCountResponse.o(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as spotify.autodownload.esperanto.proto.EnabledShowsCountResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 10:
                yf9 yf9Var = (yf9) obj;
                return new kj9(yf9Var.a, yf9Var.b, v1p1.q(yf9Var.c, "Write"), yf9Var.d);
            case 11:
                return (eww0) ((spq0) obj).b();
            case 15:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return CollectionPlatformEsperantoItemsResponse.o(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoItemsResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 16:
                return new eph((ace0) obj);
            case 17:
                byte[] bArr3 = (byte[]) obj;
                try {
                    return CommonMessages.StatusResponse.o(bArr3);
                } catch (Exception e4) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.connect.esperanto.proto.CommonMessages.StatusResponse: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e4);
                    return null;
                }
            case 18:
                byte[] bArr4 = (byte[]) obj;
                try {
                    return EsContextPlayerError.ContextPlayerError.o(bArr4);
                } catch (Exception e5) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.player.esperanto.proto.EsContextPlayerError.ContextPlayerError: '", Base64.getEncoder().encodeToString(bArr4), "' (Base64)"), e5);
                    return null;
                }
            case 19:
                btn btnVar = (btn) obj;
                return new mmr0(btnVar.a, Boolean.valueOf(btnVar.h));
            case 20:
                Boolean bool = (Boolean) o7h.s0(((CollectionPlatformEsperantoContainsResponse) obj).o().p());
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            case 21:
                return (oyn) obj;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return Boolean.valueOf(((BoolValue) obj).getValue());
            case 26:
                return new kyz(((Boolean) obj).booleanValue());
        }
    }

    public Handler b() {
        Handler handler;
        Handler handler2 = N0;
        if (handler2 != null && handler2.getLooper().getThread().isAlive()) {
            return handler2;
        }
        synchronized (this) {
            try {
                handler = N0;
                if (handler == null || !handler.getLooper().getThread().isAlive()) {
                    HandlerThread handlerThread = new HandlerThread("broadcast-delivery");
                    handlerThread.start();
                    Handler handler3 = new Handler(handlerThread.getLooper());
                    N0 = handler3;
                    handler = handler3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        EpisodeassociationsResponse$GetComponentsResponse episodeassociationsResponse$GetComponentsResponse = (EpisodeassociationsResponse$GetComponentsResponse) obj;
        x1z x1zVar = (x1z) obj2;
        Map map = (Map) obj3;
        h290 h290VarN = episodeassociationsResponse$GetComponentsResponse.n();
        ArrayList arrayList = new ArrayList();
        Iterator it = h290VarN.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            EpisodeassociationsResponse$LinkedEntitiesComponent episodeassociationsResponse$LinkedEntitiesComponentN = ((EpisodeassociationsResponse$Component) it.next()).n();
            h290 h290VarO = episodeassociationsResponse$LinkedEntitiesComponentN != null ? episodeassociationsResponse$LinkedEntitiesComponentN.o() : null;
            if (h290VarO != null) {
                arrayList.add(h290VarO);
            }
        }
        ArrayList arrayListA = w1z.a(q7h.V(arrayList), episodeassociationsResponse$GetComponentsResponse.getEntityUri(), x1zVar, map);
        h290 h290VarN2 = episodeassociationsResponse$GetComponentsResponse.n();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = h290VarN2.iterator();
        while (it2.hasNext()) {
            EpisodeassociationsResponse$RelatedContentComponent episodeassociationsResponse$RelatedContentComponentO = ((EpisodeassociationsResponse$Component) it2.next()).o();
            h290 h290VarO2 = episodeassociationsResponse$RelatedContentComponentO != null ? episodeassociationsResponse$RelatedContentComponentO.o() : null;
            if (h290VarO2 != null) {
                arrayList2.add(h290VarO2);
            }
        }
        return new z1z(arrayListA, w1z.a(q7h.V(arrayList2), episodeassociationsResponse$GetComponentsResponse.getEntityUri(), x1zVar, map));
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 8:
                return ((Boolean) obj).booleanValue();
            case 14:
                return ((PlayerState) obj).track().c();
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return ((List) obj).size() > 1;
            default:
                return !((uv00) obj).f;
        }
    }

    public Object apply(Object obj, Object obj2) {
        return new m031(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
    }
}
