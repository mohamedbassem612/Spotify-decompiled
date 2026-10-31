package p;

import com.google.protobuf.Empty;
import com.spotify.ad.detection.esperanto.proto.AdDetectionOuterClass;
import com.spotify.analyzer_esperanto.proto.LoudnessResponseOuterClass;
import com.spotify.audio_sink_chain_wrapper_esperanto.proto.AudioSinkChainWrapperEsperanto$CreateResponse;
import com.spotify.authentication.login5esperanto.EsAccessTokenClient$ErrorResponse;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.connectivity.auth.clienttoken.esperanto.proto.EsClientToken;
import com.spotify.cosmos.util.proto.ArtistCollectionState;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function5;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import j$.util.Base64;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import spotify.collection.esperanto.proto.CollectionGetArtistViewResponse;
import spotify.your_library.esperanto.proto.YourLibraryDecorateResponse;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s9w implements Function, yz1, s2i1, Init, BiFunction, BiPredicate, eky, Function5 {
    public final /* synthetic */ byte a;
    public static final s9w b = new s9w(0);
    public static final s9w c = new s9w(1);
    public static final s9w d = new s9w(2);
    public static final s9w e = new s9w(3);
    public static final s9w f = new s9w(4);
    public static final s9w g = new s9w(5);
    public static final s9w h = new s9w(6);
    public static final s9w i = new s9w(7);
    public static final s9w t = new s9w(8);
    public static final s9w X = new s9w(9);
    public static final s9w Y = new s9w(10);
    public static final s9w Z = new s9w(11);
    public static final s9w N0 = new s9w(12);
    public static final s9w O0 = new s9w(13);
    public static final s9w P0 = new s9w(14);
    public static final s9w Q0 = new s9w(15);
    public static final s9w R0 = new s9w(16);
    public static final s9w S0 = new s9w(17);
    public static final s9w T0 = new s9w(18);
    public static final s9w U0 = new s9w(20);
    public static final s9w V0 = new s9w(21);
    public static final s9w W0 = new s9w(22);
    public static final s9w X0 = new s9w(23);
    public static final s9w Y0 = new s9w(24);
    public static final s9w Z0 = new s9w(25);
    public static final s9w a1 = new s9w(26);
    public static final s9w b1 = new s9w(27);
    public static final s9w c1 = new s9w(28);
    public static final s9w d1 = new s9w(29);

    public /* synthetic */ s9w(byte b2) {
        this.a = b2;
    }

    public static mga f(qum qumVar) {
        fns fnsVar = igu.a;
        return d7p1.f(hvm.a, b3s.c, (vu30) null, new eoc((byte) 26), new s20(qumVar, (byte) 7), (iu30) null, 18);
    }

    public Collection a(beg begVar) {
        return z6x.a;
    }

    public Object apply(Object obj) {
        boolean z = false;
        switch (this.a) {
            case 1:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsAccessTokenClient$ErrorResponse.u(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.authentication.login5esperanto.EsAccessTokenClient.ErrorResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 2:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return AdDetectionOuterClass.SubscribeUserToCanonicalTimestampResponse.p(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.ad.detection.esperanto.proto.AdDetectionOuterClass.SubscribeUserToCanonicalTimestampResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 3:
            case 4:
            case 13:
            case 14:
            case 16:
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
            case 24:
            case 25:
            default:
                h900 h900Var = (h900) obj;
                if (!(h900Var instanceof g900)) {
                    return MaybeEmpty.a;
                }
                g900 g900Var = (g900) h900Var;
                return Maybe.e(new k900(g900Var.a, g900Var.b));
            case 5:
                byte[] bArr3 = (byte[]) obj;
                try {
                    return LoudnessResponseOuterClass.LoudnessResponse.q(bArr3);
                } catch (Exception e4) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.analyzer_esperanto.proto.LoudnessResponseOuterClass.LoudnessResponse: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e4);
                    return null;
                }
            case 6:
                return Boolean.valueOf(((zs4) obj).b);
            case 7:
                ArtistCollectionState artistCollectionStateP = ((CollectionGetArtistViewResponse) obj).n().p();
                return new mmr0(Integer.valueOf(artistCollectionStateP.getNumExplicitlyLikedTracks()), Integer.valueOf(artistCollectionStateP.getNumAlbumsInCollection()));
            case 8:
                byte[] bArr4 = (byte[]) obj;
                try {
                    return AudioSinkChainWrapperEsperanto$CreateResponse.o(bArr4);
                } catch (Exception e5) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.audio_sink_chain_wrapper_esperanto.proto.AudioSinkChainWrapperEsperanto.CreateResponse: '", Base64.getEncoder().encodeToString(bArr4), "' (Base64)"), e5);
                    return null;
                }
            case 9:
                return Boolean.valueOf(((String) obj).equals("1"));
            case 10:
                n57.e("[Puffin] Error getting filter prediction: " + ((Throwable) obj));
                return y49.a;
            case 11:
                YourLibraryDecorateResponse yourLibraryDecorateResponse = (YourLibraryDecorateResponse) obj;
                return yourLibraryDecorateResponse.a() == 1 ? yourLibraryDecorateResponse.n() : YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity.r();
            case 12:
                return new pen(((Boolean) obj).booleanValue());
            case 15:
                byte[] bArr5 = (byte[]) obj;
                try {
                    return EsClientToken.EncryptedClientToken.o(bArr5);
                } catch (Exception e6) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.connectivity.auth.clienttoken.esperanto.proto.EsClientToken.EncryptedClientToken: '", Base64.getEncoder().encodeToString(bArr5), "' (Base64)"), e6);
                    return null;
                }
            case 17:
                byte[] bArr6 = (byte[]) obj;
                try {
                    return Empty.q(bArr6);
                } catch (Exception e7) {
                    bhn0.o(f4i1.f("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr6), "' (Base64)"), e7);
                    return null;
                }
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new uzl(((zyl) obj).a, null, 4);
            case 20:
                return crn0.a;
            case 21:
                Map map = (Map) obj;
                if (map.isEmpty()) {
                    z = true;
                } else {
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        if (!((f7h) ((Map.Entry) it.next()).getValue()).a) {
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 22:
                return (ypq0) ((mmr0) obj).b;
            case 23:
                return new zgx0((Map) obj);
            case 26:
                return Boolean.valueOf(((xb41) obj).a != 1);
        }
    }

    public Collection b(ajn0 ajn0Var, beg begVar) {
        return z6x.a;
    }

    public Collection c(beg begVar) {
        return z6x.a;
    }

    public Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        md2 md2Var = (md2) obj5;
        return new b910((PlayerState) obj, ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue(), md2Var.a, md2Var.b);
    }

    public Collection e(beg begVar) {
        return z6x.a;
    }

    public First e0(Object obj) {
        po41 po41Var = (po41) obj;
        po41Var.getClass();
        return First.b(po41Var);
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        switch (this.a) {
            case 4:
                return new c03(xkg0Var, str2, str);
            default:
                return new egc(xkg0Var, str2, str);
        }
    }

    public boolean test(Object obj, Object obj2) {
        PlayerState playerState = (PlayerState) obj;
        PlayerState playerState2 = (PlayerState) obj2;
        return playerState.isPaused() == playerState2.isPaused() && u890.j(playerState.contextUri(), playerState2.contextUri());
    }

    public Object apply(Object obj, Object obj2) {
        Object next;
        switch (this.a) {
            case 16:
                return sqg0.O((Map) obj, (Map) obj2);
            default:
                spq0 spq0Var = (spq0) obj;
                List list = (List) obj2;
                if (spq0Var.c()) {
                    return spq0Var;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    next = it.next();
                    if (((l0l) next).l()) {
                        return spq0.a(next);
                    }
                }
                next = null;
                return spq0.a(next);
        }
    }
}
