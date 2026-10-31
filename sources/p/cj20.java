package p;

import com.spotify.karaoke.esperanto.proto.KaraokeSubEventsResponse;
import com.spotify.offline_esperanto.proto.EsOffline$GetOfflinePlaybackStatusResponse;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.profile.completionsheetimpl.datasource.ProfileCompletionConfigException;
import com.spotify.profileconfig.proto.v1.ProfileCompletionResponse;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import j$.util.Base64;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cj20 implements v0i, Function, Predicate, g670, aad0, BiPredicate, s2i1 {
    public final /* synthetic */ byte a;
    public static final cj20 b = new cj20(0);
    public static final cj20 c = new cj20(1);
    public static final cj20 d = new cj20(2);
    public static final cj20 e = new cj20(3);
    public static final cj20 f = new cj20(4);
    public static final cj20 g = new cj20(5);
    public static final cj20 h = new cj20(6);
    public static final cj20 i = new cj20(7);
    public static final cj20 t = new cj20(8);
    public static final cj20 X = new cj20(9);
    public static final cj20 Y = new cj20(10);
    public static final cj20 Z = new cj20(11);
    public static final cj20 N0 = new cj20(12);
    public static final cj20 O0 = new cj20(13);
    public static final cj20 P0 = new cj20(14);
    public static final cj20 Q0 = new cj20(15);
    public static final cj20 R0 = new cj20(16);
    public static final cj20 S0 = new cj20(17);
    public static final cj20 T0 = new cj20(18);
    public static final cj20 U0 = new cj20(19);
    public static final /* synthetic */ cj20 V0 = new cj20(20);
    public static final cj20 W0 = new cj20(21);
    public static final cj20 X0 = new cj20(22);
    public static final cj20 Y0 = new cj20(23);
    public static final cj20 Z0 = new cj20(24);
    public static final cj20 a1 = new cj20(25);
    public static final cj20 b1 = new cj20(26);
    public static final cj20 c1 = new cj20(27);
    public static final cj20 d1 = new cj20(28);
    public static final cj20 e1 = new cj20(29);

    public /* synthetic */ cj20(byte b2) {
        this.a = b2;
    }

    public boolean a(y570 y570Var) {
        String strA = y570Var.a();
        return strA != null && ihc1.h0(strA, "tab-container", false);
    }

    public Object apply(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 1:
                return (ContextTrack) ((spq0) obj).b();
            case 2:
                Optional optional = (Optional) obj;
                if (!optional.isPresent()) {
                    return new bse1(2131963214);
                }
                int iOrdinal = ((gp20) optional.get()).ordinal();
                if (iOrdinal == 0) {
                    return new bse1(2131963213);
                }
                if (iOrdinal == 1) {
                    return new bse1(2131963214);
                }
                eg.o();
                return null;
            case 3:
            case 4:
            case 8:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
            case 20:
            case 22:
            case 26:
            default:
                sy21 sy21Var = (sy21) obj;
                ProfileCompletionResponse profileCompletionResponse = (ProfileCompletionResponse) sy21Var.b;
                ry21 ry21Var = sy21Var.a;
                return (!ry21Var.Q0 || profileCompletionResponse == null) ? Single.error(new ProfileCompletionConfigException(f4i1.c(ry21Var.d, "Failed to fetch profile completion config with error code: "))) : Single.just(new xww0(profileCompletionResponse.n()));
            case 5:
                return new j3a0((re9) obj);
            case 6:
                byte[] bArr = (byte[]) obj;
                try {
                    return KaraokeSubEventsResponse.p(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.karaoke.esperanto.proto.KaraokeSubEventsResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 7:
                return new e331(new m231((Throwable) obj));
            case 9:
                return new kd7(false);
            case 13:
                return new gq3((List) obj);
            case 16:
                return new d0p0((ibu0) obj);
            case 18:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return EsOffline$GetOfflinePlaybackStatusResponse.o(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.offline_esperanto.proto.EsOffline.GetOfflinePlaybackStatusResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 19:
                return Boolean.TRUE;
            case 21:
                io70 io70Var = ((jo70) obj).e;
                return io70Var != null ? Maybe.e(io70Var.b) : MaybeEmpty.a;
            case 23:
                return (String) ((spq0) obj).e("");
            case 24:
                ContextTrack contextTrack = (ContextTrack) ((PlayerState) obj).track().h();
                String strB0 = contextTrack != null ? l4o1.b0(contextTrack) : null;
                return strB0 == null ? "" : strB0;
            case 25:
                return new kby((String) null, -1);
            case 27:
                Map map = (Map) obj;
                if (!y7y0.t("has-podcasts-available", map) && !y7y0.x(map)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 28:
                return Boolean.valueOf(y7y0.F((Map) obj));
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
        return new zxu0(str3, xkg0Var, str2, str);
    }

    public Object m(dxy dxyVar) {
        return qgo1.q((Executor) dxyVar.d(new lzy0(sdh1.class, Executor.class)));
    }

    public boolean test(Object obj, Object obj2) {
        PlayerState playerState = (PlayerState) obj;
        PlayerState playerState2 = (PlayerState) obj2;
        ContextTrack contextTrack = (ContextTrack) playerState.track().b();
        ContextTrack contextTrack2 = (ContextTrack) playerState2.track().b();
        contextTrack.getClass();
        String strA0 = l4o1.a0(contextTrack, "context_uri");
        String strContextUri = null;
        if (strA0 == null || strA0.length() == 0) {
            strA0 = null;
        }
        if (strA0 == null) {
            strA0 = playerState.contextUri();
        }
        contextTrack2.getClass();
        String strA1 = l4o1.a0(contextTrack2, "context_uri");
        if (strA1 != null && strA1.length() != 0) {
            strContextUri = strA1;
        }
        if (strContextUri == null) {
            strContextUri = playerState2.contextUri();
        }
        return u890.j(contextTrack.uri(), contextTrack2.uri()) && u890.j(contextTrack.uid(), contextTrack2.uid()) && u890.j(strA0, strContextUri) && l4o1.J(contextTrack) == l4o1.J(contextTrack2);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 3:
                return !(((ese1) obj) instanceof vre1);
            case 10:
                return ((cma1) obj).b == 1;
            case 11:
                return ((PlayerState) obj).track().c();
            case 12:
                return ((tc91) obj) instanceof sc91;
            case 14:
                return ((sy21) obj).a.Q0;
            case 17:
                ewi0 ewi0Var = (ewi0) obj;
                return (ewi0Var instanceof cwi0) || (ewi0Var instanceof xvi0);
            default:
                return ((tw) obj).b instanceof ww;
        }
    }
}
