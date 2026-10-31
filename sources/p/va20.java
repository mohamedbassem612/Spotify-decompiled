package p;

import android.graphics.Bitmap;
import android.graphics.Color;
import androidx.core.graphics.drawable.IconCompat;
import com.google.protobuf.Empty;
import com.spotify.memberinvite.model.v1.proto.PayloadResponse;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.offline.utilcore.LicenseStatusException;
import com.spotify.offline_esperanto.proto.EsOffline$LicenseStatusResponse;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class va20 implements Function, Predicate, BiFunction, Init, av30, s2i1, Function4 {
    public final /* synthetic */ byte a;
    public static final va20 b = new va20(0);
    public static final va20 c = new va20(1);
    public static final va20 d = new va20(3);
    public static final va20 e = new va20(4);
    public static final va20 f = new va20(5);
    public static final va20 g = new va20(6);
    public static final va20 h = new va20(7);
    public static final va20 i = new va20(8);
    public static final va20 t = new va20(9);
    public static final va20 X = new va20(10);
    public static final va20 Y = new va20(11);
    public static final va20 Z = new va20(12);
    public static final va20 N0 = new va20(13);
    public static final va20 O0 = new va20(14);
    public static final va20 P0 = new va20(15);
    public static final va20 Q0 = new va20(16);
    public static final va20 R0 = new va20(17);
    public static final va20 S0 = new va20(18);
    public static final va20 T0 = new va20(19);
    public static final va20 U0 = new va20(20);
    public static final va20 V0 = new va20(21);
    public static final va20 W0 = new va20(22);
    public static final va20 X0 = new va20(23);
    public static final va20 Y0 = new va20(24);
    public static final va20 Z0 = new va20(25);
    public static final va20 a1 = new va20(26);
    public static final va20 b1 = new va20(27);
    public static final va20 c1 = new va20(28);
    public static final va20 d1 = new va20(29);

    public /* synthetic */ va20(byte b2) {
        this.a = b2;
    }

    public static LinkedHashMap a(wb40 wb40Var) {
        Map map = wb40Var.d;
        List<lc40> list = wb40Var.c;
        int iS = zno1.s(q7h.U(list, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (lc40 lc40Var : list) {
            linkedHashMap.put(lc40Var.a, Boolean.valueOf(lc40Var.d));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Boolean bool = (Boolean) entry.getValue();
            bool.getClass();
            if (!u890.j(linkedHashMap.get(str), bool)) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap2;
    }

    public Object N(Object obj, Object obj2, Object obj3, Object obj4) {
        md2 md2Var = (md2) obj4;
        return new g910(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), md2Var.a, md2Var.b);
    }

    public Object apply(Object obj) throws LicenseStatusException {
        Integer numValueOf = null;
        switch (this.a) {
            case 0:
                bb10 bb10Var = (bb10) obj;
                String str = bb10Var.a;
                List list = bb10Var.b;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((r8s0) it.next()).a);
                }
                return new i5w0(new j3c1(bb10Var.c, bb10Var.d, str, arrayList));
            case 1:
            case 2:
            case 4:
            case 8:
            case 10:
            case 14:
            case 20:
            case 22:
            default:
                vov0 vov0Var = (vov0) obj;
                if (vov0Var.equals(tov0.a)) {
                    return MaybeEmpty.a;
                }
                if (vov0Var instanceof uov0) {
                    return Maybe.e(vov0Var);
                }
                eg.o();
                return null;
            case 3:
                xn40 xn40Var = (zn40) obj;
                if (!(xn40Var instanceof xn40)) {
                    eg.o();
                    return null;
                }
                xn40 xn40Var2 = xn40Var;
                String str2 = xn40Var2.b;
                String str3 = xn40Var2.c;
                String str4 = xn40Var2.d;
                List<jji0> list2 = xn40Var2.e;
                ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                for (jji0 jji0Var : list2) {
                    arrayList2.add(new dji0(jji0Var.a, jji0Var.b, jji0Var.c, jji0Var.d));
                }
                return new jqi0(str2, str3, str4, arrayList2);
            case 5:
                return Single.just(new kcg1(z6x.a));
            case 6:
                return new byt0((x3s0) obj);
            case 7:
                return IconCompat.c((Bitmap) obj);
            case 9:
                return new u401((Throwable) obj);
            case 11:
                return new pif0(new vpf0((a9h) obj));
            case 12:
                return crn0.a;
            case 13:
                PayloadResponse payloadResponse = (PayloadResponse) obj;
                return new dni0(payloadResponse.getTitle(), payloadResponse.p(), payloadResponse.o(), new l371(payloadResponse.q().getTitle(), payloadResponse.q().getMessage(), payloadResponse.q().o(), payloadResponse.n()));
            case 15:
                return ((th61) obj).a;
            case 16:
                return ((jzo0) obj).a;
            case 17:
                PlayerState playerState = (PlayerState) obj;
                return Boolean.valueOf(playerState.isPlaying() || playerState.isPaused());
            case 18:
                byte[] bArr = (byte[]) obj;
                try {
                    return Empty.q(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 19:
                EsOffline$LicenseStatusResponse esOffline$LicenseStatusResponse = (EsOffline$LicenseStatusResponse) obj;
                if (esOffline$LicenseStatusResponse.n() == 0) {
                    return new f8c0(esOffline$LicenseStatusResponse.p(), esOffline$LicenseStatusResponse.o());
                }
                throw new LicenseStatusException(l1d.l(esOffline$LicenseStatusResponse.n(), "LicenseStatus error: "));
            case 21:
                HttpException httpException = (Throwable) obj;
                return (!(httpException instanceof HttpException) || httpException.a >= 500) ? Single.error(httpException) : Single.just(new e331(new m231(httpException)));
            case 23:
                return CompletableEmpty.a;
            case 24:
                ContextTrack contextTrack = (ContextTrack) ((PlayerState) obj).track().h();
                int iIntValue = -7829368;
                if (contextTrack != null) {
                    String strY = l4o1.y(contextTrack);
                    if (strY != null) {
                        String strH0 = ihc1.H0(strY, "#");
                        if (ihc1.y0(strH0)) {
                            strH0 = null;
                        }
                        if (strH0 != null) {
                            try {
                                numValueOf = Integer.valueOf(Color.parseColor("#".concat(ihc1.l0(6, strH0).concat(ihc1.c1(6, strH0)))));
                                break;
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                    }
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    }
                }
                return Observable.just(new oo50(iIntValue));
            case 25:
                return (Long) ((spq0) obj).e(0L);
        }
    }

    public First e0(Object obj) {
        switch (this.a) {
            case 10:
                return First.b((lye0) obj);
            default:
                return First.b((ihm0) obj);
        }
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
        return new cyu0(str3, xkg0Var, str2, str);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 1:
                return ((sy21) obj).a.Q0;
            case 4:
                return ((spq0) obj).c();
            case 22:
                return ((kow) obj) instanceof iow;
            default:
                mmr0 mmr0Var = (mmr0) obj;
                return ((String) mmr0Var.a).length() == 0 && ((String) mmr0Var.b).length() > 0;
        }
    }

    public Object apply(Object obj, Object obj2) {
        voc0 voc0Var = (voc0) obj;
        voc0 voc0Var2 = (voc0) obj2;
        return voc0Var2.a >= voc0Var.a ? voc0Var2 : voc0Var;
    }
}
