package p;

import android.content.Intent;
import android.net.Uri;
import com.spotify.music.podcastinteractivity.polls.proto.ClientPollResponse;
import com.spotify.music.podcastinteractivity.polls.proto.ClientPollsForEntityResponse;
import com.spotify.player.model.PlayerState;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleTransformer;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import spotify.your_library.esperanto.proto.IsCuratedItem;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d710 implements Function, BiFunction, Predicate, av30, SingleTransformer, l0i, yn00, jrn0, s2i1 {
    public final /* synthetic */ byte a;
    public static final d710 b = new d710(0);
    public static final d710 c = new d710(1);
    public static final d710 d = new d710(2);
    public static final d710 e = new d710(3);
    public static final d710 f = new d710(4);
    public static final d710 g = new d710(5);
    public static final d710 h = new d710(6);
    public static final d710 i = new d710(7);
    public static final d710 t = new d710(8);
    public static final d710 X = new d710(9);
    public static final d710 Y = new d710(10);
    public static final d710 Z = new d710(11);
    public static final d710 N0 = new d710(12);
    public static final d710 O0 = new d710(13);
    public static final d710 P0 = new d710(14);
    public static final d710 Q0 = new d710(15);
    public static final d710 R0 = new d710(16);
    public static final d710 S0 = new d710(17);
    public static final d710 T0 = new d710(18);
    public static final d710 U0 = new d710(19);
    public static final d710 V0 = new d710(20);
    public static final d710 W0 = new d710(21);
    public static final d710 X0 = new d710(22);
    public static final d710 Y0 = new d710(23);
    public static final d710 Z0 = new d710(24);
    public static final d710 a1 = new d710(25);
    public static final d710 b1 = new d710(26);
    public static final d710 c1 = new d710(27);
    public static final d710 d1 = new d710(28);
    public static final d710 e1 = new d710(29);

    public /* synthetic */ d710(byte b2) {
        this.a = b2;
    }

    public Object apply(Object obj) {
        boolean z = false;
        switch (this.a) {
            case 0:
                ogz0 ogz0Var = (ogz0) obj;
                if (ogz0Var.equals(mgz0.a)) {
                    return new beh("quickstart-pivot returned NothingToPlay");
                }
                if (ogz0Var.equals(ngz0.a)) {
                    return new ceh();
                }
                eg.o();
                return null;
            case 1:
                return new CompletableFromAction(new jt8((dma1) obj, (byte) 2));
            case 2:
                mmr0 mmr0Var = (mmr0) obj;
                return new exo0((String) mmr0Var.a, (String) mmr0Var.b);
            case 3:
                return new k100(y7w.a);
            case 4:
            case 7:
            case 10:
            case 13:
            case 15:
            case 16:
            case 19:
            case 21:
            case 22:
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
            case 26:
            case 27:
            default:
                return Boolean.FALSE;
            case 5:
                Boolean bool = (Boolean) obj;
                gf90 gf90VarP = IsCuratedItem.p();
                gf90VarP.q(bool.booleanValue());
                gf90VarP.n(bool.booleanValue());
                return gf90VarP.build();
            case 6:
                return Boolean.valueOf(hqq0.Z((l0l) ((spq0) obj).h()));
            case 8:
                n6c0 n6c0Var = (o6c0) obj;
                if (n6c0Var instanceof n6c0) {
                    return new rg60(new dhy("library_import_match_result", n6c0Var));
                }
                if (n6c0Var instanceof m6c0) {
                    return xi10.f;
                }
                eg.o();
                return null;
            case 9:
                return ((fqd0) obj).c;
            case 11:
                return hqq0.L((List) obj);
            case 12:
                return new vqf0(((Float) obj).floatValue());
            case 14:
                mdz mdzVar = (mdz) o7h.s0((List) obj);
                if (mdzVar != null && mdzVar.r.length() > 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 17:
                return ((e2p0) obj).e;
            case 18:
                List<zuc0> list = ((wsc0) ((py21) obj).d()).e;
                ArrayList arrayList = new ArrayList();
                for (zuc0 zuc0Var : list) {
                    k1z k1zVar = zuc0Var.p;
                    String str = ((k1zVar instanceof k1z) && k1zVar.j) ? zuc0Var.c : null;
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                return arrayList;
            case 20:
                return new n9q0(((Boolean) obj).booleanValue());
            case 24:
                PlayerState playerState = (PlayerState) obj;
                return new mmr0(playerState.restrictions().disallowSettingPlaybackSpeedReasons(), playerState.options().playbackSpeed());
            case 28:
                h290 h290VarN = ((ClientPollsForEntityResponse) obj).n();
                return (ClientPollResponse) (h290VarN.size() > 0 ? h290VarN.get(0) : ClientPollResponse.n());
        }
    }

    public Single c(Single single) {
        return Single.defer(new xf0(new p811(), single, (byte) 5));
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        switch (this.a) {
            case 22:
                return new hss0(xkg0Var, str2, str);
            default:
                String str3 = (String) linkedHashMap.get("playlist_id");
                if (str3 != null && str3.length() == 22) {
                    int length = str3.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        char cCharAt = str3.charAt(i2);
                        if (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || ('0' <= cCharAt && cCharAt < ':'))) {
                        }
                    }
                    return new oyu0(str3, xkg0Var, str2, str);
                }
                return null;
        }
    }

    public irn0 l(Intent intent, th61 th61Var) {
        List<String> pathSegments;
        Uri data = intent.getData();
        String str = (data == null || (pathSegments = data.getPathSegments()) == null) ? null : (String) o7h.C0(pathSegments);
        return (str == null || ihc1.y0(str)) ? crn0.a : new hrn0(urr0.class, new wrr0(str), new c6w0(1, true, (hd5) null, 12));
    }

    public ao00 r(UUID uuid) {
        return h9v.a();
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 7:
                th61 th61Var = (th61) obj;
                return th61Var.b && voo1.p(th61Var);
            case 16:
                return ((cma1) obj).b == 1;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return ((g331) obj) instanceof z231;
            default:
                return ((sy21) obj).a.Q0;
        }
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 4:
                return new o910(((Boolean) obj2).booleanValue(), ((Boolean) obj).booleanValue());
            default:
                return new ueu0((String) obj, (int) ((Long) obj2).longValue());
        }
    }
}
