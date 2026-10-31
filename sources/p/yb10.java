package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.genalphagraduation.graduationapi.KidsGraduationException;
import com.spotify.lyrics.serviceretrofit.proto.v3.LyricsWrapperResponse;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yb10 implements BiPredicate, Function, l0i, usi1, BiFunction, Predicate, xlo0, Function3, s2i1, Function4 {
    public final /* synthetic */ byte a;
    public static final yb10 b = new yb10(0);
    public static final yb10 c = new yb10(1);
    public static final yb10 d = new yb10(2);
    public static final yb10 e = new yb10(3);
    public static final yb10 f = new yb10(4);
    public static final yb10 g = new yb10(5);
    public static final yb10 h = new yb10(6);
    public static final yb10 i = new yb10(7);
    public static final yb10 t = new yb10(8);
    public static final yb10 X = new yb10(9);
    public static final yb10 Y = new yb10(10);
    public static final yb10 Z = new yb10(11);
    public static final yb10 N0 = new yb10(12);
    public static final yb10 O0 = new yb10(13);
    public static final yb10 P0 = new yb10(14);
    public static final yb10 Q0 = new yb10(15);
    public static final yb10 R0 = new yb10(16);
    public static final yb10 S0 = new yb10(17);
    public static final yb10 T0 = new yb10(18);
    public static final yb10 U0 = new yb10(19);
    public static final yb10 V0 = new yb10(20);
    public static final yb10 W0 = new yb10(21);
    public static final yb10 X0 = new yb10(22);
    public static final yb10 Y0 = new yb10(23);
    public static final yb10 Z0 = new yb10(24);
    public static final yb10 a1 = new yb10(25);
    public static final yb10 b1 = new yb10(26);
    public static final yb10 c1 = new yb10(27);
    public static final yb10 d1 = new yb10(28);
    public static final yb10 e1 = new yb10(29);

    public /* synthetic */ yb10(byte b2) {
        this.a = b2;
    }

    public Object N(Object obj, Object obj2, Object obj3, Object obj4) {
        return new zpu0((iqi0) obj, ((th61) obj2).a, ((Boolean) obj3).booleanValue(), (List) obj4);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                return Boolean.valueOf(((YourLibraryResponse) obj).n().size() == 0);
            case 3:
                return ((Throwable) obj) instanceof KidsGraduationException.GraduationGeoIpMismatchException ? new c100(2) : new c100(1);
            case 4:
                Map map = (Map) obj;
                return Boolean.valueOf(y7y0.t("is-seadragon", map) || y7y0.t("is-highlights-and-stats", map));
            case 6:
                return Boolean.valueOf(!((gbl) obj).c);
            case 7:
                jn41 jn41Var = (ln41) obj;
                return jn41Var instanceof jn41 ? new a0b0(((ui8) jn41Var.a).d()) : b0b0.a;
            case 8:
                return new w7c0((Map) obj);
            case 11:
                return new jaf0(((Boolean) obj).booleanValue());
            case 12:
                return rtf0.a((LyricsWrapperResponse) obj);
            case 25:
                return ((PlayerState) obj).contextUri();
            default:
                return new a2w0(((Boolean) obj).booleanValue());
        }
    }

    public Object h(eha0 eha0Var, float f2) {
        return Integer.valueOf(Math.round(pha0.d(eha0Var) * f2));
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        switch (this.a) {
            case 21:
                return new hwr0(str2, str, xkg0Var);
            case 22:
                String str3 = (String) linkedHashMap.get("preset_id");
                if (str3 == null) {
                    return null;
                }
                return new rss0(str3, str2, str, xkg0Var);
            default:
                String str4 = (String) linkedHashMap.get("primary_id");
                if (str4 == null) {
                    return null;
                }
                return new yxu0(str4, xkg0Var, str2, str);
        }
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 18:
                spq0 spq0Var = (spq0) obj;
                rsy0 rsy0Var = (rsy0) obj2;
                fpy0 fpy0Var = (fpy0) obj3;
                if (!spq0Var.c() || ((l0l) spq0Var.b()).l()) {
                    return fpy0Var != fpy0.a ? jsy0.a : rsy0Var;
                }
                return isy0.a;
            default:
                mmr0 mmr0Var = (mmr0) obj2;
                return new p810((String) mmr0Var.a, ((jo70) mmr0Var.b).a, (List) obj, y7y0.A((Map) obj3));
        }
    }

    public boolean test(Object obj) {
        boolean zR;
        switch (this.a) {
            case 10:
                return ((vge0) obj) != vge0.a;
            case 14:
                zR = ((uv00) obj).f;
                break;
            case 19:
                zR = ((YourLibraryResponse) obj).q().r();
                break;
            case 20:
                Logger.e((Throwable) obj, "Go: Failed to open Spotify login page", new Object[0]);
                return true;
            case 23:
                return ((py21) obj).c() != null;
            default:
                zR = ((Boolean) obj).booleanValue();
                break;
        }
        return !zR;
    }

    public boolean test(Object obj, Object obj2) {
        ContextTrack contextTrack = (ContextTrack) obj;
        ContextTrack contextTrack2 = (ContextTrack) obj2;
        return u890.j(contextTrack.uri(), contextTrack2.uri()) && s3o1.v(contextTrack, false) == s3o1.v(contextTrack2, false);
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 9:
                return new mmr0((psd0) obj, (bp90) obj2);
            case 13:
                return new nmr0((PlayerState) obj, (sp91) obj2);
            default:
                return new mmr0((String) obj, (Long) obj2);
        }
    }
}
