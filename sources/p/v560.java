package p;

import android.content.Intent;
import android.net.Uri;
import com.spotify.authentication.login5esperanto.EsAuthnPlatformRequired;
import com.spotify.challenges.v1.api.pub.proto.GetSessionResponse;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformContextItemsResponse;
import com.spotify.connect.esperanto.proto.CommonMessages;
import com.spotify.contentdelivery.downloadimpl.NullTransportException;
import com.spotify.cosmos.util.proto.ArtistCollectionState;
import com.spotify.cosmos.util.proto.EpisodePlayState;
import com.spotify.episode.episodeassociationsimpl.proto.EpisodeassociationsResponse$GetComponentsResponse;
import com.spotify.player.esperanto.proto.EsQueue;
import com.spotify.player.esperanto.proto.EsResponseWithReasons;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import spotify.autodownload.esperanto.proto.EpisodeLimitResponse;
import spotify.collection.esperanto.proto.CollectionDecorateResponse;
import spotify.collection.esperanto.proto.CollectionEpisode;
import spotify.collection.esperanto.proto.CollectionTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class v560 implements k10, Function, Predicate, BiPredicate, jrn0, g4u, av30, BiFunction {
    public final /* synthetic */ byte a;
    public static final v560 b = new v560(1);
    public static final v560 c = new v560(2);
    public static final v560 d = new v560(3);
    public static final v560 e = new v560(4);
    public static final v560 f = new v560(5);
    public static final v560 g = new v560(6);
    public static final v560 h = new v560(7);
    public static final v560 i = new v560(8);
    public static final v560 t = new v560(9);
    public static final v560 X = new v560(10);
    public static final v560 Y = new v560(11);
    public static final v560 Z = new v560(12);
    public static final v560 N0 = new v560(13);
    public static final v560 O0 = new v560(14);
    public static final v560 P0 = new v560(15);
    public static final v560 Q0 = new v560(16);
    public static final v560 R0 = new v560(17);
    public static final v560 S0 = new v560(18);
    public static final v560 T0 = new v560(19);
    public static final v560 U0 = new v560(20);
    public static final v560 V0 = new v560(21);
    public static final v560 W0 = new v560(22);
    public static final v560 X0 = new v560(23);
    public static final v560 Y0 = new v560(24);
    public static final v560 Z0 = new v560(25);
    public static final v560 a1 = new v560(26);
    public static final v560 b1 = new v560(27);
    public static final v560 c1 = new v560(28);
    public static final v560 d1 = new v560(29);

    public /* synthetic */ v560(byte b2) {
        this.a = b2;
    }

    public Object apply(Object obj) {
        Boolean boolValueOf;
        EpisodePlayState episodePlayStateS;
        boolean z;
        boolean isPlayable = false;
        switch (this.a) {
            case 2:
                return new mn81((GetSessionResponse) obj);
            case 3:
                return new drn0(new Intent("android.intent.action.VIEW", (Uri) obj));
            case 4:
            case 5:
            case 6:
            case 8:
            case 12:
            case 14:
            case 19:
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
            case 24:
            default:
                h290<CollectionTrack> h290VarT = ((CollectionDecorateResponse) obj).t();
                int iS = zno1.s(q7h.U(h290VarT, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (CollectionTrack collectionTrack : h290VarT) {
                    String link = collectionTrack.getLink();
                    boolean is19PlusOnly = collectionTrack.s().getIs19PlusOnly();
                    boolean isExplicit = collectionTrack.s().getIsExplicit();
                    if (collectionTrack.r().getIsBanned()) {
                        z = true;
                    } else {
                        h290 h290VarP = collectionTrack.p();
                        if (!h290VarP.isEmpty()) {
                            Iterator it = h290VarP.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((ArtistCollectionState) it.next()).getIsBanned()) {
                                        z = true;
                                    }
                                }
                            }
                        }
                        z = false;
                    }
                    linkedHashMap.put(link, new wy00(is19PlusOnly, z, isExplicit, collectionTrack.s().getPlayable()));
                }
                return linkedHashMap;
            case 7:
                return new t87(((Boolean) obj).booleanValue());
            case 9:
                byte[] bArr = (byte[]) obj;
                try {
                    return EpisodeLimitResponse.o(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as spotify.autodownload.esperanto.proto.EpisodeLimitResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 10:
                zf9 zf9Var = (zf9) obj;
                return new lj9(zf9Var.a, zf9Var.b);
            case 11:
                eww0 eww0Var = (eww0) obj;
                return new gdi1(new v4i1(eww0Var.a, eww0Var.b, eww0Var.f));
            case 13:
                return Boolean.valueOf(y7y0.z((Map) obj));
            case 15:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return CollectionPlatformContextItemsResponse.n(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.collection_platform.esperanto.proto.CollectionPlatformContextItemsResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 16:
                return new loh((ace0) obj);
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
                    return EsQueue.Queue.v(bArr4);
                } catch (Exception e5) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.player.esperanto.proto.EsQueue.Queue: '", Base64.getEncoder().encodeToString(bArr4), "' (Base64)"), e5);
                    return null;
                }
            case 20:
                oy21 oy21Var = (py21) obj;
                if (oy21Var instanceof ly21) {
                    boolValueOf = Boolean.FALSE;
                } else {
                    if (!(oy21Var instanceof oy21)) {
                        eg.o();
                        return null;
                    }
                    boolValueOf = Boolean.valueOf(((wsc0) oy21Var.a).f.w.b);
                }
                return boolValueOf;
            case 21:
                return (oyn) obj;
            case 22:
                CollectionEpisode collectionEpisode = (CollectionEpisode) o7h.s0(((CollectionDecorateResponse) obj).p());
                if (collectionEpisode != null && (episodePlayStateS = collectionEpisode.s()) != null) {
                    isPlayable = episodePlayStateS.getIsPlayable();
                }
                return Boolean.valueOf(isPlayable);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                Throwable th = (Throwable) obj;
                return th instanceof NullTransportException ? Single.just(Boolean.FALSE) : Single.error(th);
            case 26:
                return ((PlayerState) obj).contextUri();
            case 27:
                sy21 sy21Var = (sy21) obj;
                uz21 uz21Var = sy21Var.c;
                if (uz21Var != null) {
                    k220.i(uz21Var.f());
                    return null;
                }
                EpisodeassociationsResponse$GetComponentsResponse episodeassociationsResponse$GetComponentsResponse = (EpisodeassociationsResponse$GetComponentsResponse) sy21Var.b;
                if (episodeassociationsResponse$GetComponentsResponse != null) {
                    return episodeassociationsResponse$GetComponentsResponse;
                }
                eg.m("Response body can't be null");
                return null;
            case 28:
                return m6p1.q((EsResponseWithReasons.ResponseWithReasons) obj);
        }
    }

    public irn0 l(Intent intent, th61 th61Var) {
        Set set = s4b1.f;
        String strK = zjy.k(intent);
        if (strK == null) {
            strK = "";
        }
        return new hrn0(i8c.class, new s8c(strK, th61Var.a), a6w0.a);
    }

    public boolean test(Object obj, Object obj2) {
        switch (this.a) {
            case 5:
                PlayerState playerState = (PlayerState) obj;
                PlayerState playerState2 = (PlayerState) obj2;
                ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                ContextTrack contextTrack2 = (ContextTrack) playerState2.track().h();
                if (u890.j(contextTrack != null ? contextTrack.uri() : null, contextTrack2 != null ? contextTrack2.uri() : null)) {
                    if (u890.j(contextTrack != null ? l4o1.a0(contextTrack, "pointer.uri") : null, contextTrack2 != null ? l4o1.a0(contextTrack2, "pointer.uri") : null)) {
                        if (u890.j(contextTrack != null ? Boolean.valueOf(l4o1.I(contextTrack)) : null, contextTrack2 != null ? Boolean.valueOf(l4o1.I(contextTrack2)) : null) && u890.j(playerState.contextUri(), playerState2.contextUri())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return !((Integer) obj).equals((Integer) obj2);
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 4:
                return !((uv00) obj).f;
            case 5:
            default:
                return ((EsAuthnPlatformRequired.AuthnPlatformRequiredProceedResult) obj).o();
            case 6:
                PlayerState playerState = (PlayerState) obj;
                return playerState.isPlaying() && playerState.track().c();
        }
    }

    public Object apply(Object obj, Object obj2) {
        PlayerState playerState = (PlayerState) obj;
        l0l l0lVar = (l0l) obj2;
        if (playerState.isPlaying() && !playerState.isPaused()) {
            return j5.a;
        }
        return new i5w0(l0lVar);
    }
}
