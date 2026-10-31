package p;

import com.spotify.familyviewservice.v1.AddChildToPlanResponse;
import com.spotify.kidsgraduation.v1.GetPrivacyPolicyAcceptanceResponse;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.nowplayingmini.nowplayingmini.NowPlayingMiniMode;
import com.spotify.offline_playable_cache_esperanto.proto.EsOfflinePlayableCache;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xi10 implements Function, usi1, s2i1, Init, BiFunction, Predicate, Producer {
    public final /* synthetic */ byte a;
    public static final xi10 b = new xi10(0);
    public static final xi10 c = new xi10(1);
    public static final xi10 d = new xi10(2);
    public static final xi10 e = new xi10(3);
    public static final xi10 f = new xi10(4);
    public static final xi10 g = new xi10(5);
    public static final xi10 h = new xi10(6);
    public static final xi10 i = new xi10(7);
    public static final xi10 t = new xi10(8);
    public static final xi10 X = new xi10(9);
    public static final xi10 Y = new xi10(10);
    public static final xi10 Z = new xi10(11);
    public static final xi10 N0 = new xi10(12);
    public static final xi10 O0 = new xi10(13);
    public static final xi10 P0 = new xi10(14);
    public static final xi10 Q0 = new xi10(15);
    public static final xi10 R0 = new xi10(16);
    public static final xi10 S0 = new xi10(17);
    public static final xi10 T0 = new xi10(18);
    public static final xi10 U0 = new xi10(19);
    public static final xi10 V0 = new xi10(20);
    public static final xi10 W0 = new xi10(21);
    public static final xi10 X0 = new xi10(22);
    public static final xi10 Y0 = new xi10(23);
    public static final xi10 Z0 = new xi10(24);
    public static final xi10 a1 = new xi10(25);
    public static final xi10 b1 = new xi10(26);
    public static final xi10 c1 = new xi10(27);
    public static final xi10 d1 = new xi10(28);
    public static final xi10 e1 = new xi10(29);

    public /* synthetic */ xi10(byte b2) {
        this.a = b2;
    }

    public Object apply(Object obj) {
        n950 n950Var;
        String str = null;
        switch (this.a) {
            case 0:
                return ((AddChildToPlanResponse) obj).n();
            case 1:
            case 2:
            case 4:
            case 10:
            case 12:
            case 14:
            case 22:
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
            default:
                return Boolean.valueOf(yto.j((String) obj));
            case 3:
                return new ma50(((Boolean) obj).booleanValue());
            case 5:
                return ((th61) obj).a;
            case 6:
                zd9 zd9Var = (zd9) obj;
                if (!zd9Var.b) {
                    str = "bt_permission_missing";
                } else if (!zd9Var.a) {
                    str = "bt_unavailable";
                }
                return new f4a0(str);
            case 7:
                GetPrivacyPolicyAcceptanceResponse getPrivacyPolicyAcceptanceResponse = (GetPrivacyPolicyAcceptanceResponse) obj;
                int i2 = e0b0.a[getPrivacyPolicyAcceptanceResponse.o().ordinal()];
                if (i2 != -1) {
                    if (i2 == 1) {
                        n950Var = l950.a;
                    } else if (i2 == 2) {
                        n950Var = m950.a;
                    } else if (i2 == 3) {
                        n950Var = n950.a;
                    } else if (i2 != 4 && i2 != 5) {
                        eg.o();
                        return null;
                    }
                    return new rpw0(n950Var, getPrivacyPolicyAcceptanceResponse.n());
                }
                hhg1.n("Unsupported privacy policy type");
                return null;
            case 8:
                return new x7c0(qf90.a, (Boolean) obj);
            case 9:
                return Boolean.valueOf(y7y0.A((Map) obj));
            case 11:
                PlayerState playerState = (PlayerState) obj;
                return new vdu0(!playerState.isPaused(), k1u.r(playerState).bitrateLevel(), k1u.r(playerState).targetBitrateLevel(), k1u.r(playerState).targetBitrateAvailable(), k1u.r(playerState).strategy(), k1u.r(playerState).hifiStatus());
            case 13:
                return (PlayerState) ((spq0) obj).b();
            case 15:
                return ((dzm0) obj).a;
            case 16:
                String str2 = (String) obj;
                return spq0.a(str2.length() != 0 ? str2 : null);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return (String) ((spq0) obj).b();
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new pkp0((gbl) obj);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsOfflinePlayableCache.RemoveTrackResponse.n(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.offline_playable_cache_esperanto.proto.EsOfflinePlayableCache.RemoveTrackResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return ((l3c1) obj).e;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return Observable.fromIterable(((ms80) obj).a);
            case 23:
                return new t300(((Boolean) obj).booleanValue());
            case 25:
                return ((PlayerState) obj).restrictions();
            case 26:
                return ((wsc0) ((py21) obj).d()).f;
        }
    }

    public First e0(Object obj) {
        switch (this.a) {
            case 10:
                return First.c((vme0) obj, Collections.singleton(sje0.c));
            default:
                return First.b((tvf0) obj);
        }
    }

    public Object get() {
        WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
        return new ImmediateWorkRunner();
    }

    public Object h(eha0 eha0Var, float f2) {
        return Float.valueOf(pha0.d(eha0Var) * f2);
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        String str3;
        String str4;
        switch (this.a) {
            case 2:
                return new da40(str2, str, xkg0Var);
            case 22:
                String str5 = (String) linkedHashMap.get("preset_id");
                if (str5 == null) {
                    return null;
                }
                return new oss0(str5, xkg0Var, str2, str);
            default:
                String str6 = (String) linkedHashMap.get("user_name");
                if (str6 == null || (str3 = (String) linkedHashMap.get("playlist_id")) == null || !gho1.n(str3) || (str4 = (String) linkedHashMap.get("track_id")) == null || !gho1.n(str4)) {
                    return null;
                }
                return new azu0(str6, str3, str4, str2, str, xkg0Var);
        }
    }

    public boolean test(Object obj) {
        return ((PlayerState) obj).track().c();
    }

    public Object apply(Object obj, Object obj2) {
        return new osj0((NowPlayingMiniMode) obj, ((Number) obj2).intValue());
    }
}
