package p;

import com.spotify.mdata.cosmos.proto.InvalidateCacheResponse;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.PlayerState;
import com.spotify.profile.profile.proto.PlaylistlistResponse;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import spotify.your_library.esperanto.proto.IsCuratedItem;
import spotify.your_library.esperanto.proto.IsCuratedResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e710 implements Function, Predicate, Init, s2i1, av30, l0i, Function3 {
    public final /* synthetic */ byte a;
    public static final e710 b = new e710(0);
    public static final e710 c = new e710(1);
    public static final e710 d = new e710(2);
    public static final e710 e = new e710(3);
    public static final e710 f = new e710(4);
    public static final e710 g = new e710(5);
    public static final e710 h = new e710(6);
    public static final e710 i = new e710(7);
    public static final e710 t = new e710(8);
    public static final e710 X = new e710(9);
    public static final e710 Y = new e710(10);
    public static final e710 Z = new e710(11);
    public static final e710 N0 = new e710(12);
    public static final e710 O0 = new e710(13);
    public static final e710 P0 = new e710(14);
    public static final e710 Q0 = new e710(15);
    public static final e710 R0 = new e710(16);
    public static final e710 S0 = new e710(17);
    public static final e710 T0 = new e710(18);
    public static final e710 U0 = new e710(19);
    public static final e710 V0 = new e710(20);
    public static final e710 W0 = new e710(21);
    public static final e710 X0 = new e710(22);
    public static final e710 Y0 = new e710(23);
    public static final e710 Z0 = new e710(24);
    public static final e710 a1 = new e710(25);
    public static final e710 b1 = new e710(26);
    public static final e710 c1 = new e710(27);
    public static final e710 d1 = new e710(28);
    public static final e710 e1 = new e710(29);

    public /* synthetic */ e710(byte b2) {
        this.a = b2;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return new beh(l1d.m("quickstart-pivot error: ", ((Throwable) obj).getMessage()));
            case 1:
            case 2:
            case 3:
            case 8:
            case 11:
            case 12:
            case 13:
            case 15:
            case 18:
            case 19:
            case 21:
            case 22:
            default:
                return new u300((wuz) obj);
            case 4:
                return Boolean.valueOf(((Map) obj).values().contains(Boolean.TRUE));
            case 5:
                IsCuratedItem isCuratedItem = (IsCuratedItem) o7h.s0(((IsCuratedResponse) obj).q());
                return isCuratedItem == null ? IsCuratedItem.o() : isCuratedItem;
            case 6:
                return new c4a0(((Boolean) obj).booleanValue());
            case 7:
                return Boolean.valueOf(((th61) obj).b);
            case 9:
                return Boolean.valueOf(((fqd0) obj).e);
            case 10:
                Boolean bool = (Boolean) ((cma1) obj).a;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            case 14:
                byte[] bArr = (byte[]) obj;
                try {
                    return InvalidateCacheResponse.n(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.mdata.cosmos.proto.InvalidateCacheResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 16:
                Boolean bool2 = (Boolean) ((cma1) obj).a;
                return Boolean.valueOf(bool2 != null ? bool2.booleanValue() : true);
            case 17:
                return ((e2p0) obj).f;
            case 20:
                return new qxo0((k900) obj);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return ((tjm) obj).d();
            case 24:
                mmr0 mmr0Var = (mmr0) obj;
                t380 t380Var = (t380) mmr0Var.a;
                spq0 spq0Var = (spq0) mmr0Var.b;
                t380Var.getClass();
                if (!t380Var.isEmpty()) {
                    return new kta1(t380Var);
                }
                Float f2 = (Float) spq0Var.h();
                return (f2 != null ? f2.floatValue() : 0.0f) == 0.0f ? lta1.a : jta1.a;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return j5.a;
            case 26:
                PlaylistlistResponse.PlaylistList playlistList = (PlaylistlistResponse.PlaylistList) ((sy21) obj).b;
                return playlistList == null ? PlaylistlistResponse.PlaylistList.n() : playlistList;
        }
    }

    public First e0(Object obj) {
        return First.b((p850) obj);
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        String str3;
        switch (this.a) {
            case 8:
                return new y6c0(xkg0Var, str2, str);
            case 22:
                return new mss0(str2, str, xkg0Var);
            default:
                String str4 = (String) linkedHashMap.get("playlist_id");
                if (str4 != null && gho1.n(str4) && (str3 = (String) linkedHashMap.get("track_id")) != null && gho1.n(str3)) {
                    return new qyu0(str4, str3, xkg0Var, str2, str);
                }
                return null;
        }
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        return new z310(o7h.N0((List) obj3, o7h.N0((List) obj2, (List) obj)), (f410) null, (m510) null, (String) null);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 1:
                return ((String) obj).length() > 0;
            case 2:
                return !((uv00) obj).f;
            case 11:
                return ((spq0) obj).c();
            case 12:
                return ((PlayerState) obj).track().c();
            case 13:
                return ((spq0) obj).c();
            case 18:
                return !((List) obj).isEmpty();
            default:
                return !((uv00) obj).f;
        }
    }
}
