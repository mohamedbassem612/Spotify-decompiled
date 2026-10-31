package p;

import android.net.Uri;
import android.view.View;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.offline.offlineplugin_proto.e;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.pending_events.esperanto.proto.AddPendingEventResponse;
import com.spotify.playback_esperanto.proto.PlaybackEsperanto;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.profile.completionsheetimpl.datasource.ProfileCompletionConfigException;
import com.spotify.profile.profile.proto.ArtistlistResponse$ArtistList;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dj20 implements v0i, BiFunction, Function, jy50, Init, Predicate, k1q0, av30, Function3, s2i1 {
    public final /* synthetic */ byte a;
    public static final dj20 b = new dj20(0);
    public static final dj20 c = new dj20(1);
    public static final dj20 d = new dj20(2);
    public static final dj20 e = new dj20(3);
    public static final dj20 f = new dj20(4);
    public static final dj20 g = new dj20(5);
    public static final dj20 h = new dj20(6);
    public static final dj20 i = new dj20(7);
    public static final dj20 t = new dj20(8);
    public static final dj20 X = new dj20(10);
    public static final dj20 Y = new dj20(11);
    public static final dj20 Z = new dj20(12);
    public static final dj20 N0 = new dj20(13);
    public static final dj20 O0 = new dj20(14);
    public static final dj20 P0 = new dj20(15);
    public static final dj20 Q0 = new dj20(16);
    public static final dj20 R0 = new dj20(17);
    public static final dj20 S0 = new dj20(18);
    public static final dj20 T0 = new dj20(19);
    public static final dj20 U0 = new dj20(21);
    public static final dj20 V0 = new dj20(22);
    public static final dj20 W0 = new dj20(23);
    public static final dj20 X0 = new dj20(24);
    public static final dj20 Y0 = new dj20(25);
    public static final dj20 Z0 = new dj20(26);
    public static final dj20 a1 = new dj20(27);
    public static final dj20 b1 = new dj20(28);
    public static final dj20 c1 = new dj20(29);

    public /* synthetic */ dj20(byte b2) {
        this.a = b2;
    }

    public static c5e0 a(Object obj) {
        return new c5e0(obj);
    }

    public static String b(String str, String str2, long j, long j2, sg90 sg90Var) {
        ArrayList arrayListO = p7h.O(new String[]{l1d.l(j2, "chapterOffsetMs=")});
        String strH = h(sg90Var);
        if (strH != null) {
            arrayListO.add(strH);
        }
        String strY0 = o7h.y0(arrayListO, "&", (String) null, (String) null, (iu30) null, 62);
        StringBuilder sbN = gvg.n("spotify:page-match:add-page-number:", str, ":", str2, ":");
        sbN.append(j);
        sbN.append("?");
        sbN.append(strY0);
        return sbN.toString();
    }

    public static String c(sg90 sg90Var, int i2, String str, String str2, Long l, Long l2) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add("audiobookURI=" + Uri.encode("spotify:show:".concat(str)));
        }
        if (str2 != null && l != null && l2 != null) {
            arrayList.add("chapterID=" + Uri.encode(str2));
            arrayList.add("timestampMs=" + l);
            arrayList.add("chapterOffsetMs=" + l2);
        }
        String strH = h(sg90Var);
        if (strH != null) {
            arrayList.add(strH);
        }
        arrayList.add(g(i2));
        return "spotify:page-match:barcode-scan?".concat(o7h.y0(arrayList, "&", (String) null, (String) null, (iu30) null, 62));
    }

    public static String d(int i2, String str, String str2, String str3, sg90 sg90Var) {
        if ((i2 & 4) != 0) {
            str3 = null;
        }
        if ((i2 & 8) != 0) {
            sg90Var = null;
        }
        String strConcat = "spotify:page-match:error:".concat(str);
        ArrayList arrayList = new ArrayList();
        if (str2 != null) {
            arrayList.add("errorType=" + Uri.encode(str2));
        }
        if (str3 != null) {
            arrayList.add("debugMessage=" + Uri.encode(str3));
        }
        String strH = h(sg90Var);
        if (strH != null) {
            arrayList.add(strH);
        }
        arrayList.add(g(1));
        return f4i1.f(strConcat, "?", o7h.y0(arrayList, "&", (String) null, (String) null, (iu30) null, 62));
    }

    public static String e(String str, sg90 sg90Var) {
        String strConcat = "spotify:page-match:inbound-scan:".concat(str);
        String strH = h(sg90Var);
        return strH != null ? f4i1.f(strConcat, "?", strH) : strConcat;
    }

    public static String f(String str, String str2, long j, long j2, sg90 sg90Var) {
        String strEncode = Uri.encode(String.valueOf(j));
        ArrayList arrayListO = p7h.O(new String[]{l1d.l(j2, "chapterOffsetMs=")});
        String strH = h(sg90Var);
        if (strH != null) {
            arrayListO.add(strH);
        }
        arrayListO.add(g(1));
        return l1d.q(gvg.n("spotify:page-match:success:", str, ":", str2, ":"), strEncode, "?", o7h.y0(arrayListO, "&", (String) null, (String) null, (iu30) null, 62));
    }

    public static String g(int i2) {
        String str;
        if (i2 == 1) {
            str = "page";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "barcode";
        }
        return l1d.m("initialScanner=", Uri.encode(str));
    }

    public static String h(sg90 sg90Var) {
        String strM;
        if (sg90Var != null) {
            if (sg90Var instanceof og90) {
                strM = l1d.m("connected:", ((og90) sg90Var).a);
            } else if (sg90Var.equals(rg90.a)) {
                strM = "skipped";
            } else if (sg90Var.equals(pg90.a)) {
                strM = "remove";
            } else {
                eg.o();
            }
            return l1d.m("isbn=", Uri.encode(strM));
        }
        return null;
    }

    public static sg90 j(s4b1 s4b1Var) {
        String queryParameter;
        Uri uri = s4b1Var.a;
        if (uri == null || (queryParameter = uri.getQueryParameter("isbn")) == null) {
            return null;
        }
        if (nhc1.Y(queryParameter, "connected:", false) && queryParameter.length() > 10) {
            return new og90(ihc1.U0(queryParameter, "connected:", queryParameter));
        }
        if (queryParameter.equals("skipped")) {
            return rg90.a;
        }
        if (queryParameter.equals("remove")) {
            return pg90.a;
        }
        return null;
    }

    public static f5e0 k(Object obj) {
        return new f5e0(obj);
    }

    public static m5e0 q(Throwable th) {
        return new m5e0(th);
    }

    public Object apply(Object obj) {
        boolean z = true;
        boolean z2 = false;
        switch (this.a) {
            case 2:
                uov0 uov0Var = (vov0) obj;
                if (!uov0Var.equals(tov0.a)) {
                    if (!(uov0Var instanceof uov0)) {
                        eg.o();
                        return null;
                    }
                    z2 = uov0Var.c;
                }
                return Boolean.valueOf(z2);
            case 3:
            case 6:
            case 9:
            case 11:
            case 12:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 25:
            case 26:
            default:
                ry21 ry21Var = ((sy21) obj).a;
                return ry21Var.Q0 ? CompletableEmpty.a : Completable.j(new ProfileCompletionConfigException(f4i1.c(ry21Var.d, "Failed to report profile completion dismissal with error code: ")));
            case 4:
                return ((e) obj).build();
            case 5:
                return Boolean.valueOf(!((gbl) obj).c);
            case 7:
                return ((PlayerState) obj).contextUri();
            case 8:
                return ((egd0) obj).b;
            case 10:
                Boolean bool = (Boolean) ((cma1) obj).a;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            case 13:
                return spq0.a(((dwx0) obj).d);
            case 14:
                ArtistlistResponse$ArtistList artistlistResponse$ArtistList = (ArtistlistResponse$ArtistList) ((sy21) obj).b;
                return artistlistResponse$ArtistList == null ? ArtistlistResponse$ArtistList.n() : artistlistResponse$ArtistList;
            case 18:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsOffline.TotalProgressResponse.p(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.offline_esperanto.proto.EsOffline.TotalProgressResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 21:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return AddPendingEventResponse.r(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.pending_events.esperanto.proto.AddPendingEventResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 22:
                return gat0.a;
            case 23:
                byte[] bArr3 = (byte[]) obj;
                try {
                    return PlaybackEsperanto.DuckResponse.n(bArr3);
                } catch (Exception e4) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.playback_esperanto.proto.PlaybackEsperanto.DuckResponse: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e4);
                    return null;
                }
            case 24:
                return ((PlayerState) obj).contextUri();
            case 27:
                Map map = (Map) obj;
                if (!y7y0.t("has-podcasts-available", map) && !y7y0.x(map)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 28:
                return new puv0((mvv0) obj);
        }
    }

    public First e0(Object obj) {
        return First.b((d4n) obj);
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
        return new ayu0(str3, xkg0Var, str2, str);
    }

    public Object m(dxy dxyVar) {
        return qgo1.q((Executor) dxyVar.d(new lzy0(sdh1.class, Executor.class)));
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        return new q5o0((String) obj, (sm81) obj2, (f7h) obj3);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 11:
                return ((spq0) obj).c();
            case 16:
                return ((PlayerState) obj).track().c();
            case 17:
                ewi0 ewi0Var = (ewi0) obj;
                return (ewi0Var instanceof cwi0) || (ewi0Var instanceof xvi0);
            case 19:
                return !((PlayerState) obj).isPaused();
            default:
                return !((uv00) obj).f;
        }
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        nk80 nk80VarI = hsl1Var.a.i(647);
        view.setPadding(nk80VarI.a, nk80VarI.b, nk80VarI.c, nk80VarI.d);
        return hsl1.b;
    }

    public static void l() {
    }

    public static void o() {
    }

    public static void p() {
    }

    public Object apply(Object obj, Object obj2) {
        return (ContextTrack) obj;
    }
}
