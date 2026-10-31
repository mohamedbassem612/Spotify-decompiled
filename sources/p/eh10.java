package p;

import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoContainsResponse;
import com.spotify.lyrics.serviceretrofit.proto.v3.LyricsWrapperResponse;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.ondemandselector.proto.OndemandResponse;
import com.spotify.player.model.PlayerState;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class eh10 implements BiPredicate, Function, l0i, Init, Predicate, xlo0, BiFunction, s2i1 {
    public final /* synthetic */ byte a;
    public static final eh10 b = new eh10(0);
    public static final eh10 c = new eh10(1);
    public static final eh10 d = new eh10(2);
    public static final eh10 e = new eh10(3);
    public static final eh10 f = new eh10(4);
    public static final eh10 g = new eh10(5);
    public static final eh10 h = new eh10(6);
    public static final eh10 i = new eh10(7);
    public static final eh10 t = new eh10(8);
    public static final eh10 X = new eh10(9);
    public static final eh10 Y = new eh10(10);
    public static final eh10 Z = new eh10(11);
    public static final eh10 N0 = new eh10(12);
    public static final eh10 O0 = new eh10(13);
    public static final eh10 P0 = new eh10(14);
    public static final eh10 Q0 = new eh10(15);
    public static final eh10 R0 = new eh10(16);
    public static final eh10 S0 = new eh10(17);
    public static final eh10 T0 = new eh10(18);
    public static final eh10 U0 = new eh10(19);
    public static final eh10 V0 = new eh10(20);
    public static final eh10 W0 = new eh10(21);
    public static final eh10 X0 = new eh10(22);
    public static final eh10 Y0 = new eh10(23);
    public static final eh10 Z0 = new eh10(24);
    public static final eh10 a1 = new eh10(25);
    public static final eh10 b1 = new eh10(26);
    public static final eh10 c1 = new eh10(27);
    public static final eh10 d1 = new eh10(28);
    public static final eh10 e1 = new eh10(29);

    public /* synthetic */ eh10(byte b2) {
        this.a = b2;
    }

    public Object apply(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 1:
                return Boolean.valueOf(((dma1) obj).h(vk20.e, false));
            case 2:
            case 3:
            case 5:
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 21:
            case 22:
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
            case 27:
            default:
                Boolean bool = (Boolean) o7h.s0(((CollectionPlatformEsperantoContainsResponse) obj).o().p());
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            case 4:
                qo3 qo3Var = (qo3) obj;
                return new tg60(qo3Var.d > 0, qo3Var.e, qo3Var.f);
            case 6:
                return new d4a0(((Boolean) obj).booleanValue());
            case 7:
                jn41 jn41Var = (ln41) obj;
                return jn41Var instanceof jn41 ? new xza0(((vuk) jn41Var.a).f()) : yza0.a;
            case 8:
                return new x7c0(nfd.a, (Boolean) obj);
            case 10:
                return Boolean.valueOf(((gfb) obj).a);
            case 11:
                return new kaf0(((Boolean) obj).booleanValue());
            case 12:
                return rtf0.a((LyricsWrapperResponse) obj);
            case 17:
                dlb dlbVar = ((rzh) obj).c;
                if (!(dlbVar instanceof blb) && !(dlbVar instanceof clb)) {
                    if (!(dlbVar instanceof zkb) && !(dlbVar instanceof alb)) {
                        eg.o();
                        return null;
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 19:
                return Boolean.valueOf(((tal) obj) instanceof sal);
            case 20:
                OndemandResponse ondemandResponse = (OndemandResponse) obj;
                return new tgq0(o7h.p1(ondemandResponse.getUrisList()), ondemandResponse.o());
            case 24:
                return (String) ((spq0) obj).e("");
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return ((PlayerState) obj).track();
            case 26:
                return o4p1.o((PlayerState) obj);
            case 28:
                return Boolean.valueOf(!((List) obj).isEmpty());
        }
    }

    public First e0(Object obj) {
        return First.c((c950) obj, Collections.singleton(abw.a));
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        String str3;
        switch (this.a) {
            case 21:
                String str4 = (String) linkedHashMap.get("teen_id");
                if (str4 == null) {
                    return null;
                }
                return new iwr0(str4, str2, str, xkg0Var);
            case 22:
                String str5 = (String) linkedHashMap.get("preset_id");
                if (str5 == null) {
                    return null;
                }
                return new sss0(str5, xkg0Var, str2, str);
            default:
                String str6 = (String) linkedHashMap.get("playlist_id");
                if (str6 != null && gho1.n(str6) && (str3 = (String) linkedHashMap.get("episode_id")) != null && gho1.n(str3)) {
                    return new pyu0(str6, str3, xkg0Var, str2, str);
                }
                return null;
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 5:
                spq0 spq0Var = (spq0) obj;
                return !spq0Var.c() || ((l0l) spq0Var.b()).l();
            case 9:
                gud0 gud0Var = (gud0) obj;
                return ((gud0Var instanceof std0) || (gud0Var instanceof ttd0)) ? false : true;
            case 13:
                return ((PlayerState) obj).track().c();
            case 14:
                return ((PlayerState) obj) != PlayerState.EMPTY;
            default:
                return ((feh) obj) instanceof beh;
        }
    }

    public boolean test(Object obj, Object obj2) {
        PlayerState playerState = (PlayerState) obj;
        PlayerState playerState2 = (PlayerState) obj2;
        return u890.j(playerState.track(), playerState2.track()) && u890.j(playerState.restrictions(), playerState2.restrictions());
    }

    public Object apply(Object obj, Object obj2) {
        Object next;
        spq0 spq0Var = (spq0) obj;
        spq0 spq0Var2 = (spq0) obj2;
        pp90 pp90Var = (pp90) spq0Var2.h();
        Boolean boolValueOf = null;
        String str = pp90Var != null ? pp90Var.h.b.c : null;
        pp90 pp90Var2 = (pp90) spq0Var2.h();
        if (pp90Var2 != null) {
            Iterator it = pp90Var2.c.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!u890.j(((hp90) next).c, str));
            hp90 hp90Var = (hp90) next;
            if (hp90Var != null) {
                boolValueOf = Boolean.valueOf(hp90Var.e);
            }
        }
        return new lkp0(new d2l((l0l) spq0Var.h(), boolValueOf));
    }
}
