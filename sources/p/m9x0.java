package p;

import android.content.Context;
import com.google.protobuf.Any;
import com.spotify.adsinternal.adscore.model.Format;
import com.spotify.contextmenu.platform.ContextMenuContentLoadException;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.outcome.outcomeapi.exceptions.HttpError;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;
import com.spotify.player.model.PlayerState;
import com.spotify.watchfeedentrypoints.common.v1.VideoFile;
import com.spotify.watchfeedentrypoints.component.item.v1.WatchFeedVideoCarouselComponent;
import com.spotify.watchfeedextensions.component.item.v1.WatchFeedVideoCardComponent;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Function6;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import j$.util.Base64;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import spotify.your_library.esperanto.proto.IsCuratedResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m9x0 implements Function, Init, wo01, mj31, BiFunction, av30, Function6, Function4 {
    public final /* synthetic */ byte a;
    public static final m9x0 b = new m9x0(0);
    public static final m9x0 c = new m9x0(1);
    public static final m9x0 d = new m9x0(2);
    public static final m9x0 e = new m9x0(3);
    public static final m9x0 f = new m9x0(4);
    public static final m9x0 g = new m9x0(5);
    public static final m9x0 h = new m9x0(6);
    public static final m9x0 i = new m9x0(7);
    public static final m9x0 t = new m9x0(8);
    public static final m9x0 X = new m9x0(9);
    public static final m9x0 Y = new m9x0(10);
    public static final m9x0 Z = new m9x0(11);
    public static final m9x0 N0 = new m9x0(12);
    public static final m9x0 O0 = new m9x0(13);
    public static final m9x0 P0 = new m9x0(14);
    public static final m9x0 Q0 = new m9x0(15);
    public static final m9x0 R0 = new m9x0(16);
    public static final m9x0 S0 = new m9x0(17);
    public static final m9x0 T0 = new m9x0(18);
    public static final m9x0 U0 = new m9x0(19);
    public static final m9x0 V0 = new m9x0(20);
    public static final m9x0 W0 = new m9x0(21);
    public static final t8e1 X0 = new t8e1((byte) 20);
    public static final m9x0 Y0 = new m9x0(23);
    public static final m9x0 Z0 = new m9x0(24);
    public static final m9x0 a1 = new m9x0(25);
    public static final m9x0 b1 = new m9x0(26);

    public /* synthetic */ m9x0(byte b2) {
        this.a = b2;
    }

    public static ji0 a(m9x0 m9x0Var, String str, String str2, Map map, fgh0 fgh0Var, String str3, String str4, String str5, Format format, String str6, Map map2, int i2) {
        String str7 = (i2 & 1) != 0 ? "adId" : str;
        String str8 = (i2 & 4) != 0 ? "" : str2;
        String str9 = (i2 & 16) != 0 ? "" : "https://spotify.com";
        int i3 = i2 & 64;
        Map map3 = b7x.a;
        return new ji0(str7, "", str8, "", str9, 1, i3 != 0 ? map3 : map, (i2 & 128) != 0 ? new fgh0(6, Collections.singletonList(new gq70(0, 0, new p57("image_url"))), (List) null) : fgh0Var, (i2 & 256) != 0 ? "" : str3, (i2 & 512) != 0 ? "" : str4, (i2 & 1024) != 0 ? "" : str5, false, false, (i2 & 8192) != 0 ? Format.DUMMY : format, false, z6x.a, (65536 & i2) != 0 ? "" : str6, (i2 & 131072) != 0 ? map3 : map2, 2);
    }

    public static cj4 b(Context context, String str, String str2) {
        File dir = context.getDir("remote-config", 0);
        if (str2.length() > 0) {
            File file = new File(dir, str2);
            if (!file.exists()) {
                file.mkdirs();
            }
            dir = file;
        }
        if (!dir.exists()) {
            dir.mkdirs();
        }
        return new cj4(new File(dir, str));
    }

    public /* bridge */ /* synthetic */ Object N(Object obj, Object obj2, Object obj3, Object obj4) {
        return rih1.a;
    }

    public Object apply(Object obj) {
        zbl1 zbl1Var;
        ljj1 jjj1Var;
        int i2 = 1;
        switch (this.a) {
            case 0:
                return Observable.empty();
            case 1:
                return crn0.a;
            case 2:
            case 3:
            case 6:
            case 8:
            case 9:
            case 15:
            case 18:
            case 20:
            case 21:
            case 22:
            default:
                byte[] bArr = (byte[]) obj;
                try {
                    return IsCuratedResponse.r(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as spotify.your_library.esperanto.proto.IsCuratedResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 4:
                return Boolean.valueOf(l4o1.Y((ContextTrack) obj));
            case 5:
                PlayerState playerState = (PlayerState) obj;
                ContextTrack contextTrack = (ContextTrack) playerState.track().b();
                contextTrack.getClass();
                String strA0 = l4o1.a0(contextTrack, ContextTrack$Metadata.KEY_CONTEXT_URI);
                String strContextUri = (strA0 == null || strA0.length() == 0) ? null : strA0;
                if (strContextUri == null) {
                    strContextUri = playerState.contextUri();
                }
                return new yvg1(contextTrack, strContextUri, contextTrack.uid());
            case 7:
                return new lb41(false);
            case 10:
                Throwable contextMenuContentLoadException = (Throwable) obj;
                if (contextMenuContentLoadException instanceof HttpError) {
                    contextMenuContentLoadException = new ContextMenuContentLoadException(contextMenuContentLoadException);
                }
                return Single.error(contextMenuContentLoadException);
            case 11:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                return Observable.just(new rp81(new fxw(zBooleanValue)), new wp81(zBooleanValue));
            case 12:
                return ((PlayerState) obj).restrictions().disallowSkippingNextReasons();
            case 13:
                return Boolean.valueOf(y7y0.G((Map) obj));
            case 14:
                sy21 sy21Var = (sy21) obj;
                ry21 ry21Var = sy21Var.a;
                if (ry21Var.Q0) {
                    Object obj2 = sy21Var.b;
                    obj2.getClass();
                    return new t3a1((ga61) obj2);
                }
                if (ry21Var.d == 404) {
                    Arrays.copyOf(new Object[0], 0);
                    return new t3a1(ga61.C);
                }
                Arrays.copyOf(new Object[0], 0);
                return s3a1.a;
            case 16:
                egi1 egi1Var = (egi1) obj;
                egi1Var.getClass();
                return new dbc1(egi1Var);
            case 17:
                lhe1 lhe1Var = (lhe1) obj;
                lhe1Var.getClass();
                return new mie1(lhe1Var, true);
            case 19:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getValue();
                    if (str == null) {
                        str = (String) entry.getKey();
                    }
                    arrayList.add(str);
                }
                return arrayList;
            case 23:
                pal1 pal1Var = (qal1) obj;
                if (pal1Var instanceof pal1) {
                    WatchFeedVideoCarouselComponent watchFeedVideoCarouselComponent = pal1Var.a;
                    if (!watchFeedVideoCarouselComponent.getItemsList().isEmpty()) {
                        String title = watchFeedVideoCarouselComponent.getTitle();
                        List<Any> itemsList = watchFeedVideoCarouselComponent.getItemsList();
                        ArrayList arrayList2 = new ArrayList();
                        for (Any any : itemsList) {
                            if (u890.j(any.p(), "type.googleapis.com/spotify.watchfeedentrypoints.component.item.v1.WatchFeedVideoCardComponent")) {
                                WatchFeedVideoCardComponent watchFeedVideoCardComponentW = WatchFeedVideoCardComponent.w(any.q());
                                String title2 = watchFeedVideoCardComponentW.getTitle();
                                String subtitle = watchFeedVideoCardComponentW.getSubtitle();
                                String strR = watchFeedVideoCardComponentW.r();
                                String strN = watchFeedVideoCardComponentW.n();
                                String strT = watchFeedVideoCardComponentW.t();
                                boolean isExplicit = watchFeedVideoCardComponentW.getIsExplicit();
                                boolean zP = watchFeedVideoCardComponentW.p();
                                Float fValueOf = watchFeedVideoCardComponentW.v() ? Float.valueOf((float) watchFeedVideoCardComponentW.s()) : null;
                                VideoFile videoFileU = watchFeedVideoCardComponentW.u();
                                int i3 = p6l1.a[videoFileU.q().ordinal()];
                                if (i3 == i2) {
                                    jjj1Var = new jjj1(videoFileU.p(), videoFileU.o(), videoFileU.getUri());
                                } else if (i3 != 2) {
                                    jjj1Var = null;
                                } else {
                                    jjj1Var = new kjj1(videoFileU.p(), videoFileU.o(), videoFileU.getUri());
                                }
                                zbl1Var = new zbl1(title2, subtitle, strR, strN, strT, isExplicit, zP, fValueOf, jjj1Var, watchFeedVideoCardComponentW.q(), watchFeedVideoCardComponentW.o(), watchFeedVideoCardComponentW.getEntityUri(), watchFeedVideoCardComponentW.getEntityUri());
                            } else {
                                title = title;
                                zbl1Var = null;
                            }
                            if (zbl1Var != null) {
                                arrayList2.add(zbl1Var);
                            }
                            title = title;
                            i2 = 1;
                        }
                        return Maybe.e(new val1(new acl1(title, arrayList2)));
                    }
                }
                return MaybeEmpty.a;
        }
    }

    public Object c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return new ksf1(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue(), ((Boolean) obj5).booleanValue(), ((Boolean) obj6).booleanValue());
    }

    public First e0(Object obj) {
        return First.b((hcz0) obj);
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 8:
                return new mmr0((fvf1) obj, (Boolean) obj2);
            case 9:
                return p7h.M(new List[]{(List) obj, (List) obj2});
            default:
                return new ota1(((Number) obj).intValue(), (nta1) obj2);
        }
    }
}
