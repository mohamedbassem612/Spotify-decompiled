package p;

import android.content.Intent;
import com.spotify.authentication.login5esperanto.EsAuthnPlatformRequired;
import com.spotify.base.java.logging.Logger;
import com.spotify.connectivity.product_state.esperanto.proto.PutValuesSyncResponse;
import com.spotify.mobius.Next;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.search.esperanto.proto.OfflineSearchResponse;
import com.spotify.tap.playback.TapPlaybackException;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableJust;
import j$.util.Base64;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zz10 implements Function, Predicate, jrn0, BiPredicate, s2i1, BiFunction {
    public final /* synthetic */ byte a;
    public static final zz10 b = new zz10(0);
    public static final zz10 c = new zz10(1);
    public static final zz10 d = new zz10(2);
    public static final zz10 e = new zz10(3);
    public static final zz10 f = new zz10(4);
    public static final zz10 g = new zz10(5);
    public static final zz10 h = new zz10(6);
    public static final zz10 i = new zz10(7);
    public static final zz10 t = new zz10(8);
    public static final zz10 X = new zz10(9);
    public static final zz10 Y = new zz10(10);
    public static final zz10 Z = new zz10(11);
    public static final zz10 N0 = new zz10(12);
    public static final zz10 O0 = new zz10(13);
    public static final zz10 P0 = new zz10(15);
    public static final zz10 Q0 = new zz10(16);
    public static final zz10 R0 = new zz10(17);
    public static final zz10 S0 = new zz10(18);
    public static final zz10 T0 = new zz10(19);
    public static final zz10 U0 = new zz10(20);
    public static final zz10 V0 = new zz10(21);
    public static final zz10 W0 = new zz10(22);
    public static final zz10 X0 = new zz10(23);
    public static final zz10 Y0 = new zz10(24);
    public static final zz10 Z0 = new zz10(25);
    public static final zz10 a1 = new zz10(26);
    public static final zz10 b1 = new zz10(27);
    public static final zz10 c1 = new zz10(28);
    public static final zz10 d1 = new zz10(29);

    public /* synthetic */ zz10(byte b2) {
        this.a = b2;
    }

    public static Next a(Next next) {
        boolean zD = next.d();
        b7k0 b7k0Var = b7k0.a;
        if (!zD) {
            return Next.a(dm61.x0(new h1k0(b7k0Var), next.b()));
        }
        return Next.i(next.g(), dm61.x0(new h1k0(b7k0Var), next.b()));
    }

    public static Next b(Next next, kak0 kak0Var, iu30 iu30Var) {
        if (!next.d()) {
            return next;
        }
        kak0 kak0Var2 = (kak0) next.g();
        return Next.i(kak0Var2, dm61.x0(new h1k0(new d7k0(o2p1.f(kak0Var), o2p1.f(kak0Var2), (woo) iu30Var.invoke(kak0Var2))), next.b()));
    }

    public static Next c(Next next, kak0 kak0Var, woo wooVar) {
        if (!next.d()) {
            return next;
        }
        kak0 kak0Var2 = (kak0) next.g();
        return Next.i(kak0Var2, dm61.x0(new h1k0(new d7k0(o2p1.f(kak0Var), o2p1.f(kak0Var2), wooVar)), next.b()));
    }

    public static Next e(Next next, kak0 kak0Var) {
        if (!next.d()) {
            return next;
        }
        kak0 kak0Var2 = (kak0) next.g();
        return Next.i(kak0Var2, dm61.x0(new h1k0(new g7k0(o2p1.f(kak0Var), o2p1.f(kak0Var2))), next.b()));
    }

    public static Next f(Next next) {
        if (!next.d()) {
            return next;
        }
        kak0 kak0Var = (kak0) next.g();
        kak0Var.getClass();
        kak0 kak0VarA = kak0.a(kak0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, null, null, null, false, false, null, false, null, null, null, null, kak0Var.w1 + 1, null, null, -1, 983039);
        return Next.i(kak0VarA, dm61.x0(new h1k0(new h7k0(o2p1.f(kak0VarA))), next.b()));
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return v300.a;
            case 1:
                return new i5w0((List) obj);
            case 2:
                return Boolean.valueOf(((lfd) obj).b);
            case 3:
            case 7:
            case 14:
            case 15:
            case 16:
            case 23:
            case 26:
            case 27:
            default:
                PutValuesSyncResponse putValuesSyncResponse = (PutValuesSyncResponse) obj;
                return putValuesSyncResponse.n() != 0 ? Completable.j(new IOException(f4i1.c(putValuesSyncResponse.n(), "Failed to update product state. Error code: "))) : CompletableEmpty.a;
            case 4:
                return ni70.c;
            case 5:
                return Boolean.valueOf(((wsc0) obj).f.g);
            case 6:
                l9a0 l9a0Var = l9a0.d;
                FlowableJust flowableJust = n9a0.a;
                double dMin = Math.min(Math.log((((((Double) obj).doubleValue() - 0.0d) / 1.0d) * 0.66d) + 0.0d + 1.0d), 1.0d);
                vxa1 vxa1Var = l9a0Var.a;
                return new l9a0(new vxa1(m9a0.b(dMin, 1.0d)), new vxa1(m9a0.b(dMin, 0.4d)), new vxa1(m9a0.b(dMin, 0.1d)));
            case 8:
                return ((th61) obj).a;
            case 9:
                return (eww0) ((spq0) obj).b();
            case 10:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsAuthnPlatformRequired.AuthnPlatformRequiredProceedResult.p(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.authentication.login5esperanto.EsAuthnPlatformRequired.AuthnPlatformRequiredProceedResult: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 11:
                return new pef0((a9h) obj);
            case 12:
                int iOrdinal = ((n2o0) obj).ordinal();
                if (iOrdinal == 0) {
                    return g4o0.b;
                }
                if (iOrdinal == 1 || iOrdinal == 2) {
                    return g4o0.c;
                }
                eg.o();
                return null;
            case 13:
                return ski0.a;
            case 17:
                ContextTrack contextTrack = (ContextTrack) ((spq0) obj).h();
                if (contextTrack == null) {
                    return "";
                }
                if (!l4o1.U(contextTrack)) {
                    return contextTrack.uri();
                }
                String strA0 = l4o1.a0(contextTrack, "pointer.uri");
                return strA0 == null ? contextTrack.uri() : strA0;
            case 18:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return EsOffline.GetListsContainingItemResponse.o(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.offline_esperanto.proto.EsOffline.GetListsContainingItemResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 19:
                byte[] bArr3 = (byte[]) obj;
                try {
                    return OfflineSearchResponse.q(bArr3);
                } catch (Exception e4) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.search.esperanto.proto.OfflineSearchResponse: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e4);
                    return null;
                }
            case 20:
                return (List) obj;
            case 21:
                mdz mdzVar = (mdz) o7h.s0((List) obj);
                return Boolean.valueOf(mdzVar != null && mdzVar.r.length() > 0);
            case 22:
                return (Single) obj;
            case 24:
                return new qk91((jdu0) obj);
            case 25:
                return (Long) ((spq0) obj).b();
            case 28:
                Object obj2 = ((cma1) obj).a;
                return obj2 == null ? j5.a : new i5w0(new l560((String) obj2));
        }
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        String str3 = (String) linkedHashMap.get("playlist_id");
        if (str3 == null || str3.length() != 22) {
            return null;
        }
        int length = str3.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str3.charAt(i2);
            if (('a' > cCharAt || cCharAt >= '{') && (('A' > cCharAt || cCharAt >= '[') && ('0' > cCharAt || cCharAt >= ':'))) {
                return null;
            }
        }
        return new fyu0(str3, xkg0Var, str2, str);
    }

    public irn0 l(Intent intent, th61 th61Var) {
        String stringExtra;
        String stringExtra2 = intent.getStringExtra("kids_avatar_picker_username");
        if (stringExtra2 == null || (stringExtra = intent.getStringExtra("kids_avatar_picker_display_name")) == null) {
            return crn0.a;
        }
        String stringExtra3 = intent.getStringExtra("kids_avatar_picker_image");
        int intExtra = intent.getIntExtra("kids_avatar_picker_color", -1);
        Integer numValueOf = Integer.valueOf(intExtra);
        if (intExtra == -1) {
            numValueOf = null;
        }
        return new hrn0(i1b0.class, new k1b0(stringExtra2, stringExtra, numValueOf, stringExtra3), new c6w0(1, false, ed5.c, 10));
    }

    public boolean test(Object obj, Object obj2) {
        PlayerState playerState = (PlayerState) obj;
        PlayerState playerState2 = (PlayerState) obj2;
        return u890.j(playerState.track(), playerState2.track()) && u890.j(playerState.prevTracks(), playerState2.prevTracks()) && u890.j(playerState.nextTracks(), playerState2.nextTracks()) && u890.j(playerState.restrictions(), playerState2.restrictions()) && u890.j(playerState.positionAsOfTimestamp(), playerState2.positionAsOfTimestamp()) && u890.j(playerState.playbackSpeed(), playerState2.playbackSpeed()) && playerState.isPaused() == playerState2.isPaused() && u890.j(playerState.duration(), playerState2.duration());
    }

    public boolean test(Object obj) {
        boolean zY0;
        switch (this.a) {
            case 3:
                zY0 = ihc1.y0((String) obj);
                break;
            case 15:
                zY0 = ((uv00) obj).f;
                break;
            default:
                Throwable th = (Throwable) obj;
                if (th instanceof TapPlaybackException) {
                    Logger.e(th, "Go: Playback failed", new Object[0]);
                } else {
                    Logger.e(th, "Go: Error occurred while trying to play music", new Object[0]);
                }
                return true;
        }
        return !zY0;
    }

    public Object apply(Object obj, Object obj2) {
        return (n331) obj2;
    }
}
