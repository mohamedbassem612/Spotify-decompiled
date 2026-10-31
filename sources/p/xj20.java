package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.pending_events.esperanto.proto.CommitPendingEventResponse;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$GetDeviceSettingsResponse;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import spotify.collection.esperanto.proto.CollectionDecorateResponse;
import spotify.collection.esperanto.proto.CollectionTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xj20 implements Function, BiFunction, jy50, Predicate, Init, av30, n8n, Function3, s2i1 {
    public final /* synthetic */ byte a;
    public static final xj20 b = new xj20(0);
    public static final xj20 c = new xj20(1);
    public static final xj20 d = new xj20(2);
    public static final xj20 e = new xj20(3);
    public static final xj20 f = new xj20(4);
    public static final xj20 g = new xj20(5);
    public static final xj20 h = new xj20(6);
    public static final xj20 i = new xj20(7);
    public static final xj20 t = new xj20(8);
    public static final xj20 X = new xj20(9);
    public static final xj20 Y = new xj20(10);
    public static final xj20 Z = new xj20(11);
    public static final xj20 N0 = new xj20(12);
    public static final xj20 O0 = new xj20(13);
    public static final /* synthetic */ xj20 P0 = new xj20(14);
    public static final xj20 Q0 = new xj20(15);
    public static final xj20 R0 = new xj20(16);
    public static final xj20 S0 = new xj20(17);
    public static final xj20 T0 = new xj20(18);
    public static final xj20 U0 = new xj20(19);
    public static final xj20 V0 = new xj20(20);
    public static final xj20 W0 = new xj20(21);
    public static final xj20 X0 = new xj20(22);
    public static final xj20 Y0 = new xj20(23);
    public static final xj20 Z0 = new xj20(24);
    public static final xj20 a1 = new xj20(25);
    public static final xj20 b1 = new xj20(26);
    public static final xj20 c1 = new xj20(27);
    public static final xj20 d1 = new xj20(28);
    public static final xj20 e1 = new xj20(29);

    public /* synthetic */ xj20(byte b2) {
        this.a = b2;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return new ebe0((Boolean) obj);
            case 1:
            case 3:
            case 4:
            case 6:
            case 8:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 24:
            case 26:
            case 27:
            default:
                List list = (List) obj;
                xb41 xb41Var = (xb41) list.get(0);
                int i2 = ((xb41) list.get(1)).a;
                if (i2 == 2) {
                    return gzw0.a;
                }
                if (i2 == 3) {
                    return ezw0.a;
                }
                return (xb41Var.a == 2 && i2 == 1) ? hzw0.a : fzw0.a;
            case 2:
                return Boolean.valueOf(!yto.j((String) obj));
            case 5:
                return new k3a0(((Boolean) obj).booleanValue());
            case 7:
                qo3 qo3Var = (qo3) obj;
                return new tg60(qo3Var.d > 0, qo3Var.e, qo3Var.f);
            case 9:
                h290<CollectionTrack> h290VarT = ((CollectionDecorateResponse) obj).t();
                int iS = zno1.s(q7h.U(h290VarT, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (CollectionTrack collectionTrack : h290VarT) {
                    linkedHashMap.put(collectionTrack.s().getLink(), collectionTrack);
                }
                return linkedHashMap;
            case 10:
                ContextTrack contextTrack = (ContextTrack) ((PlayerState) obj).track().h();
                String strUri = contextTrack != null ? contextTrack.uri() : null;
                return strUri == null ? "" : strUri;
            case 11:
                return (Long) ((spq0) obj).b();
            case 12:
                return new mxg0(((Boolean) obj).booleanValue());
            case 13:
                dwx0 dwx0Var = (dwx0) obj;
                return new yvg1(Boolean.valueOf(dwx0Var.e), Boolean.valueOf(dwx0Var.j), Boolean.valueOf(dwx0Var.l));
            case 15:
                return (sy21) ((mmr0) obj).b;
            case 16:
                return ((ContextTrack) ((PlayerState) obj).track().b()).uri();
            case 21:
                byte[] bArr = (byte[]) obj;
                try {
                    return CommitPendingEventResponse.p(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.pending_events.esperanto.proto.CommitPendingEventResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 22:
                Logger.d("PlanOverviewPubSubEventSource", new Object[]{(Throwable) obj, "Error in transition pubsub"});
                return Observable.empty();
            case 23:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return PlaybackSettingsEsperantoService$GetDeviceSettingsResponse.p(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService.GetDeviceSettingsResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 25:
                return Boolean.valueOf(y7y0.t("apply-child-content-restrictions", (Map) obj));
            case 28:
                return new puv0((mvv0) obj);
        }
    }

    public First e0(Object obj) {
        return First.b((s8w) obj);
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        switch (this.a) {
            case 20:
                return new y8r0(xkg0Var, str2, str);
            default:
                String str3 = (String) linkedHashMap.get("folder_uri");
                if (str3 == null) {
                    return null;
                }
                return new hxu0(str3, xkg0Var, str2, str);
        }
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        return sqg0.O(sqg0.O((Map) obj, (Map) obj2), (Map) obj3);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 4:
                return !((uv00) obj).f;
            case 8:
                return !((uv00) obj).f;
            case 17:
                ewi0 ewi0Var = (ewi0) obj;
                return (ewi0Var instanceof cwi0) || (ewi0Var instanceof xvi0);
            case 19:
                return ((PlayerState) obj).playOrigin().featureClasses().contains("social_play");
            case 24:
                return !((sp91) obj).i.isEmpty();
            default:
                return ((uv00) obj).c();
        }
    }

    public Object apply(Object obj, Object obj2) {
        return ((Boolean) obj2).booleanValue() ? new hvq0(ivq0.b, false) : (hvq0) obj;
    }
}
