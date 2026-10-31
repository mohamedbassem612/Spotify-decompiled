package p;

import com.spotify.authentication.login5esperanto.EsCodeRequired;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.prefs.esperanto.proto.EsPrefs;
import com.spotify.profile.mainprofilesections.playlists.PlaylistResponse;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class a020 implements Function3, BiFunction, Function, Init, s2i1, quw0 {
    public final /* synthetic */ byte a;
    public static final a020 b = new a020(0);
    public static final a020 c = new a020(1);
    public static final a020 d = new a020(2);
    public static final a020 e = new a020(3);
    public static final a020 f = new a020(4);
    public static final a020 g = new a020(5);
    public static final a020 h = new a020(6);
    public static final a020 i = new a020(7);
    public static final a020 t = new a020(8);
    public static final a020 X = new a020(9);
    public static final a020 Y = new a020(10);
    public static final a020 Z = new a020(11);
    public static final a020 N0 = new a020(12);
    public static final a020 O0 = new a020(13);
    public static final a020 P0 = new a020(14);
    public static final a020 Q0 = new a020(15);
    public static final a020 R0 = new a020(16);
    public static final a020 S0 = new a020(17);
    public static final a020 T0 = new a020(18);
    public static final a020 U0 = new a020(19);
    public static final a020 V0 = new a020(20);
    public static final a020 W0 = new a020(21);
    public static final a020 X0 = new a020(22);
    public static final a020 Y0 = new a020(23);
    public static final a020 Z0 = new a020(24);
    public static final a020 a1 = new a020(25);
    public static final a020 b1 = new a020(26);
    public static final a020 c1 = new a020(27);
    public static final a020 d1 = new a020(28);
    public static final a020 e1 = new a020(29);

    public /* synthetic */ a020(byte b2) {
        this.a = b2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object apply(Object obj) throws ntj0 {
        switch (this.a) {
            case 2:
                return Boolean.valueOf(((lfd) obj).c);
            case 3:
            case 6:
            case 14:
            case 15:
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
            case 26:
            default:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsPrefs.PrefValues.q(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.prefs.esperanto.proto.EsPrefs.PrefValues: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 4:
                return b7x.a;
            case 5:
                return Boolean.FALSE;
            case 7:
                Object obj2 = ((e331) obj).a;
                if (e331.a(obj2) == null) {
                    List list = (List) obj2;
                    if (!list.isEmpty()) {
                        return new idb0(list);
                    }
                }
                return jdb0.a;
            case 8:
                return j5.a;
            case 9:
                hey heyVar = (hey) obj;
                return new ed7((String) null, heyVar.a, (String) null, false, heyVar.b, (List) null, 45);
            case 10:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return EsCodeRequired.CodeRequiredProceedResult.p(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.authentication.login5esperanto.EsCodeRequired.CodeRequiredProceedResult: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 11:
                return oef0.a;
            case 12:
                return ojg0.a;
            case 13:
                return sli0.b;
            case 16:
                PlayerState playerState = (PlayerState) obj;
                return f46.i0(new ContextTrack[]{o7h.C0(playerState.prevTracks()), playerState.track().h(), o7h.s0(playerState.nextTracks())});
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return Collections.singletonList((ContextTrack) obj);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                byte[] bArr3 = (byte[]) obj;
                try {
                    return EsOffline.OfflineLicenseInfo.o(bArr3);
                } catch (Exception e4) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.offline_esperanto.proto.EsOffline.OfflineLicenseInfo: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e4);
                    return null;
                }
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new z310((List) obj, null, null, null);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new e320(new r0c0());
            case 22:
                return new z310((List) obj, null, null, null);
            case 23:
                return Boolean.valueOf(l4o1.P((ContextTrack) obj));
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                PlayerState playerState2 = (PlayerState) obj;
                Integer numU = w3p1.u(playerState2, "narration.background.color");
                String str = (String) playerState2.contextMetadata().get("narration.background.image");
                Integer numU2 = w3p1.u(playerState2, "narration.jellyfish.top.color");
                Integer numU3 = w3p1.u(playerState2, "narration.jellyfish.mid.color");
                Integer numU4 = w3p1.u(playerState2, "narration.jellyfish.bottom.color");
                Integer numU5 = w3p1.u(playerState2, "narration.jump.icon.color");
                int iIntValue = numU5 != null ? numU5.intValue() : ((Number) sah.a.getValue()).intValue();
                Integer numU6 = w3p1.u(playerState2, "narration.jump.background.color");
                int iIntValue2 = numU6 != null ? numU6.intValue() : sah.a();
                Integer numU7 = w3p1.u(playerState2, "narration.jump.border.color");
                return new qpu(numU, str, numU2, numU3, numU4, iIntValue, iIntValue2, numU7 != null ? numU7.intValue() : sah.a());
            case 25:
                return (ContextTrack) ((spq0) obj).b();
            case 27:
                sy21 sy21Var = (sy21) obj;
                ry21 ry21Var = sy21Var.a;
                if (!ry21Var.Q0) {
                    throw new ntj0(String.format("Something went wrong while trying to load the Playlist section\n               in the profile platform. Status code: %s\n            ", Arrays.copyOf(new Object[]{Integer.valueOf(ry21Var.d)}, 1)));
                }
                Object obj3 = sy21Var.b;
                obj3.getClass();
                return (PlaylistResponse.PlaylistList) obj3;
        }
    }

    public First e0(Object obj) {
        zgk0 zgk0Var = (zgk0) obj;
        zgk0Var.getClass();
        return First.c(zgk0.a(zgk0Var, (ArrayList) null, (String) null, ytb1.a, false, 47), Collections.singleton(new sfk0(zgk0Var.b)));
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        return new gyu0(xkg0Var, str2, str);
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        return new xz10((String) obj, (PlayerState) obj2, (sy00) obj3);
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 1:
                return sqg0.O((Map) obj, (Map) obj2);
            case 3:
                return new se50((ub10) obj, ((Number) obj2).intValue());
            case 6:
                return (Double) obj;
            case 15:
                return new ocn0(yto.j((String) obj), yto.j((String) obj2));
            default:
                return Boolean.valueOf(((Boolean) obj).booleanValue() || ((Boolean) obj2).booleanValue());
        }
    }
}
