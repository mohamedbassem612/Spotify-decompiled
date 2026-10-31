package p;

import com.spotify.lyrics.serviceretrofit.proto.ColorLyricsResponse;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessagePresentationStatus;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$ShuffleState;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponse;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponseEntity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f610 implements Function, s2i1, Predicate, n8n, com.spotify.mobius.functions.Function, l0i, za21, av30, qct0 {
    public final /* synthetic */ byte a;
    public static final f610 b = new f610(0);
    public static final f610 c = new f610(1);
    public static final f610 d = new f610(2);
    public static final f610 e = new f610(3);
    public static final f610 f = new f610(4);
    public static final /* synthetic */ f610 g = new f610(5);
    public static final f610 h = new f610(6);
    public static final f610 i = new f610(7);
    public static final f610 t = new f610(8);
    public static final f610 X = new f610(9);
    public static final f610 Y = new f610(11);
    public static final f610 Z = new f610(12);
    public static final f610 N0 = new f610(13);
    public static final f610 O0 = new f610(14);
    public static final f610 P0 = new f610(15);
    public static final f610 Q0 = new f610(16);
    public static final f610 R0 = new f610(17);
    public static final f610 S0 = new f610(18);
    public static final f610 T0 = new f610(19);
    public static final f610 U0 = new f610(20);
    public static final f610 V0 = new f610(22);
    public static final f610 W0 = new f610(23);
    public static final f610 X0 = new f610(24);
    public static final f610 Y0 = new f610(25);
    public static final f610 Z0 = new f610(26);
    public static final f610 a1 = new f610(27);
    public static final f610 b1 = new f610(28);
    public static final f610 c1 = new f610(29);

    public /* synthetic */ f610(byte b2) {
        this.a = b2;
    }

    public static h190 b(mr20 mr20Var) {
        return new h190(mr20Var, (byte) 1);
    }

    public static m6e0 c(Observable observable) {
        return new m6e0(observable, u0e0.X0, fnc0.Z0);
    }

    public static o6e0 e(p6e0[] p6e0VarArr, iu30 iu30Var) {
        return new o6e0(iu30Var, f46.I(p6e0VarArr));
    }

    public static vir0 g(boolean z) {
        return z ? sir0.a : new tir0(3);
    }

    public static h190 j(Object obj) {
        return new h190(obj, (byte) 2);
    }

    public lap1 a(ie30 ie30Var) {
        String str = ie30Var.p;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new to5((byte) 0);
                case "application/x-icy":
                    return new ul70();
                case "application/id3":
                    return new zl70((xl70) null);
                case "application/x-emsg":
                    return new to5((byte) 1);
                case "application/x-scte35":
                    return new qxa1();
            }
        }
        hhg1.n(l1d.m("Attempted to create decoder for unsupported MIME type: ", str));
        return null;
    }

    public Object apply(Object obj) {
        u7l t7lVar;
        Integer numC0;
        boolean z = true;
        Boolean boolValueOf = null;
        switch (this.a) {
            case 0:
                h290 h290VarO = ((YourLibraryContainsResponse) obj).o();
                if (h290VarO.isEmpty()) {
                    z = false;
                } else {
                    Iterator it = h290VarO.iterator();
                    while (it.hasNext()) {
                        if (((YourLibraryContainsResponseEntity) it.next()).o()) {
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                ima1 ima1Var = (dma1) obj;
                bma1 bma1Var = dk20.a;
                return yoi1.i(ima1Var.q(bma1Var), o6x.a).map(b610.c).startWithItem(Boolean.valueOf(ima1Var.h(bma1Var, false)));
            case 2:
            case 4:
            case 5:
            case 10:
            case 14:
            case 15:
            case 16:
            case 19:
            case 20:
            case 21:
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
            case 26:
            case 27:
            default:
                return new luv0(((Boolean) obj).booleanValue());
            case 3:
                return p000.b;
            case 6:
                return foo1.r((Set) obj);
            case 7:
                gwe0 gwe0Var = (gwe0) obj;
                if (gwe0Var instanceof fwe0) {
                    return ((fwe0) gwe0Var).a;
                }
                if (gwe0Var.equals(ewe0.a) || gwe0Var.equals(ewe0.b) || gwe0Var.equals(ewe0.c)) {
                    eg.m("Failed to retrieve child credential");
                    return null;
                }
                eg.o();
                return null;
            case 8:
                return v3c0.a;
            case 9:
                t1p0 t1p0Var = (t1p0) obj;
                t1p0Var.getClass();
                hbu0 hbu0Var = t1p0Var.a;
                if (hbu0Var instanceof gbu0) {
                    return eqd0.a;
                }
                if (!(hbu0Var instanceof hbu0)) {
                    eg.o();
                    return null;
                }
                hbu0 hbu0Var2 = hbu0Var;
                gjf1 gjf1Var = hbu0Var2.a;
                j5u0 j5u0Var = hbu0Var2.b;
                String str = gjf1Var.e;
                String str2 = gjf1Var.b;
                qbn qbnVar = new qbn(str, nhc1.Y(str2, "spotify:room", false));
                String str3 = (String) gjf1Var.k.get("iteration");
                sqd0 sqd0Var = new sqd0(((str3 == null || (numC0 = nhc1.c0(str3)) == null) ? 0 : numC0.intValue()) == 0 && j5u0Var.d != 0.0f, gjf1Var.a, new hqd0(gjf1Var, (byte) 0), new hqd0(gjf1Var, (byte) 1));
                d7l d7lVar = t1p0Var.c;
                if (d7lVar instanceof a7l) {
                    t7lVar = s7l.a;
                } else if (d7lVar instanceof y6l) {
                    t7lVar = new r7l(((y6l) d7lVar).a);
                } else if (d7lVar instanceof x6l) {
                    t7lVar = q7l.a;
                } else {
                    if (!(d7lVar instanceof w6l)) {
                        eg.o();
                        return null;
                    }
                    t7lVar = new t7l(((w6l) d7lVar).a);
                }
                return new fqd0(qbnVar, sqd0Var, t7lVar, new s1p0(str2, t1p0Var.b, d7lVar, b7x.a), j5u0Var.a);
            case 11:
                return new eaf0(((Boolean) obj).booleanValue());
            case 12:
                return b9h.a((ColorLyricsResponse) obj);
            case 13:
                return new feh0(((tv4) obj).a);
            case 17:
                e2p0 e2p0Var = (e2p0) obj;
                return new mmr0(e2p0Var.a, e2p0Var.b);
            case 18:
                return new mmr0((tip0) obj, Boolean.FALSE);
            case 22:
                return new i5w0((Long) obj);
            case 24:
                PlaybackSettingsEsperantoService$ShuffleState playbackSettingsEsperantoService$ShuffleState = (PlaybackSettingsEsperantoService$ShuffleState) obj;
                Boolean boolValueOf2 = playbackSettingsEsperantoService$ShuffleState.q() ? Boolean.valueOf(playbackSettingsEsperantoService$ShuffleState.o()) : null;
                if (playbackSettingsEsperantoService$ShuffleState.p()) {
                    boolValueOf = Boolean.valueOf(playbackSettingsEsperantoService$ShuffleState.n() == b4u0.RECOMMENDATION);
                }
                return new u3u0(boolValueOf2, boolValueOf);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return j5.a;
            case 28:
                return nbv0.d;
        }
    }

    public boolean f(beg begVar, iit iitVar) {
        return true;
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        int i2 = 0;
        switch (this.a) {
            case 2:
                String str3 = (String) linkedHashMap.get("show_id");
                if (str3 == null || str3.length() != 22) {
                    return null;
                }
                int length = str3.length();
                while (i2 < length) {
                    char cCharAt = str3.charAt(i2);
                    if (('a' > cCharAt || cCharAt >= '{') && (('A' > cCharAt || cCharAt >= '[') && ('0' > cCharAt || cCharAt >= ':'))) {
                        return null;
                    }
                    i2++;
                }
                return new m440(str3, xkg0Var, str2, str);
            default:
                String str4 = (String) linkedHashMap.get("playlist_id");
                if (str4 == null || str4.length() != 22) {
                    return null;
                }
                int length2 = str4.length();
                while (i2 < length2) {
                    char cCharAt2 = str4.charAt(i2);
                    if (('a' > cCharAt2 || cCharAt2 >= '{') && (('A' > cCharAt2 || cCharAt2 >= '[') && ('0' > cCharAt2 || cCharAt2 >= ':'))) {
                        return null;
                    }
                    i2++;
                }
                return new syu0(str4, str2, str, xkg0Var);
        }
    }

    public boolean k(ie30 ie30Var) {
        String str = ie30Var.p;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 4:
                return ((String) obj).length() > 0;
            case 19:
                return !((uv00) obj).f;
            case 20:
                MessagePresentationStatus messagePresentationStatus = (MessagePresentationStatus) obj;
                return (messagePresentationStatus instanceof MessagePresentationStatus.Presented) || (messagePresentationStatus instanceof MessagePresentationStatus.Dismissed) || (messagePresentationStatus instanceof MessagePresentationStatus.Discarded);
            default:
                wv00 wv00Var = (uv00) obj;
                return wv00Var.c() || !wv00Var.f;
        }
    }

    public void d() {
    }

    public void h() {
    }

    public void l(boolean z) {
    }
}
