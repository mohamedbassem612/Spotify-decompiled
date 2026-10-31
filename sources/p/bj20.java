package p;

import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.karaoke.esperanto.proto.KaraokePostVocalVolumeResponse;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.on_demand_set.proto.ResponseStatus;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bj20 implements v0i, Function, Predicate, e670, aad0, vvi0, n8n, np80, Function4, s2i1, jrn0 {
    public final /* synthetic */ byte a;
    public static final bj20 b = new bj20(0);
    public static final bj20 c = new bj20(1);
    public static final bj20 d = new bj20(2);
    public static final bj20 e = new bj20(3);
    public static final bj20 f = new bj20(4);
    public static final bj20 g = new bj20(5);
    public static final bj20 h = new bj20(6);
    public static final bj20 i = new bj20(7);
    public static final bj20 t = new bj20(8);
    public static final bj20 X = new bj20(9);
    public static final bj20 Y = new bj20(10);
    public static final bj20 Z = new bj20(11);
    public static final bj20 N0 = new bj20(12);
    public static final bj20 O0 = new bj20(13);
    public static final /* synthetic */ bj20 P0 = new bj20(14);
    public static final bj20 Q0 = new bj20(15);
    public static final bj20 R0 = new bj20(16);
    public static final bj20 S0 = new bj20(17);
    public static final bj20 T0 = new bj20(18);
    public static final bj20 U0 = new bj20(19);
    public static final bj20 V0 = new bj20(20);
    public static final bj20 W0 = new bj20(21);
    public static final bj20 X0 = new bj20(22);
    public static final bj20 Y0 = new bj20(23);
    public static final bj20 Z0 = new bj20(24);
    public static final bj20 a1 = new bj20(25);
    public static final bj20 b1 = new bj20(26);
    public static final bj20 c1 = new bj20(27);
    public static final bj20 d1 = new bj20(28);
    public static final bj20 e1 = new bj20(29);

    public /* synthetic */ bj20(byte b2) {
        this.a = b2;
    }

    public Object N(Object obj, Object obj2, Object obj3, Object obj4) {
        return new meu0((PlayerState) obj, (rp91) obj2, (ktl) obj3, ((Boolean) obj4).booleanValue());
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                return new pdm(true, false, false, true, false, ((Boolean) obj).booleanValue(), false, false, false, false, false, false, false, 228898);
            case 2:
                return new e331(new m231((Throwable) obj));
            case 3:
            case 4:
            case 8:
            case 13:
            case 14:
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
            default:
                return ((wsc0) ((py21) obj).d()).f;
            case 5:
                return new i3a0(((Boolean) obj).booleanValue());
            case 6:
                byte[] bArr = (byte[]) obj;
                try {
                    return KaraokePostVocalVolumeResponse.n(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.karaoke.esperanto.proto.KaraokePostVocalVolumeResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 7:
                Object obj2 = ((e331) obj).a;
                if (obj2 instanceof m231) {
                    obj2 = z6x.a;
                }
                return (List) obj2;
            case 9:
                return new kd7(((Boolean) obj).booleanValue());
            case 10:
                return Boolean.valueOf(y7y0.t("is-pigeon", (Map) obj));
            case 11:
                return ((PlayerState) obj).track();
            case 12:
                return new gxg0(((Boolean) obj).booleanValue());
            case 15:
                PlayerState playerState = (PlayerState) obj;
                return new m5o0(playerState.contextUri(), playerState.track());
            case 16:
                return new a0p0(((Boolean) obj).booleanValue());
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return ((ewi0) obj).a();
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return EsOffline.GetItemsResponse.o(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.offline_esperanto.proto.EsOffline.GetItemsResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                byte[] bArr3 = (byte[]) obj;
                try {
                    return ResponseStatus.p(bArr3);
                } catch (Exception e4) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.on_demand_set.proto.ResponseStatus: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e4);
                    return null;
                }
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                xew xewVar = (xew) obj;
                Observable observableJust = Observable.just(xewVar);
                xewVar.getClass();
                return observableJust.delay(20000L, TimeUnit.MILLISECONDS).map(aj20.W0);
            case 22:
                return xat0.a;
            case 23:
                return new i9u0(((Long) obj).longValue());
        }
    }

    public int h(y570 y570Var) {
        return 2131428831;
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
        return new gxu0(str3, xkg0Var, str2, str);
    }

    public irn0 l(Intent intent, th61 th61Var) {
        Set set = s4b1.f;
        String strZ = uic.z(uic.x(intent.getDataString()).h()).z();
        if (strZ != null) {
            return new frn0(pzm.f("key.showuri", strZ, "username", th61Var.a), g7v0.class);
        }
        Logger.d(f4i1.f("No route for uri: ", intent.getDataString(), ". Did you forget to set the correct show settings uri?"), new Object[0]);
        return crn0.a;
    }

    public Object m(dxy dxyVar) {
        return qgo1.q((Executor) dxyVar.d(new lzy0(g8b.class, Executor.class)));
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 3:
                return ((fpy0) obj) != fpy0.a;
            case 28:
                return !((Map) obj).isEmpty();
            default:
                return ((Boolean) obj).booleanValue();
        }
    }
}
