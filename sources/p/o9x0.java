package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.protobuf.Empty;
import com.spotify.ad.detection.esperanto.proto.AdDetectionOuterClass;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.recently_played_esperanto.proto.GetRecentlyPlayedResponse;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import com.spotify.your_library_esperanto.proto.AlsoAvailableOfflineResponse;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import j$.util.Base64;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o9x0 implements Function, BiFunction, com.spotify.mobius.functions.Function, uta1, xoe1, vq8 {
    public final /* synthetic */ byte a;
    public static final o9x0 b = new o9x0((byte) 0);
    public static final o9x0 c = new o9x0((byte) 1);
    public static final o9x0 d = new o9x0((byte) 2);
    public static final o9x0 e = new o9x0((byte) 3);
    public static final o9x0 f = new o9x0((byte) 4);
    public static final o9x0 g = new o9x0((byte) 5);
    public static final o9x0 h = new o9x0((byte) 7);
    public static final o9x0 i = new o9x0((byte) 8);
    public static final o9x0 t = new o9x0((byte) 9);
    public static final o9x0 X = new o9x0((byte) 10);
    public static final o9x0 Y = new o9x0((byte) 11);
    public static final o9x0 Z = new o9x0((byte) 12);
    public static final o9x0 N0 = new o9x0((byte) 13);
    public static final o9x0 O0 = new o9x0((byte) 14);
    public static final o9x0 P0 = new o9x0((byte) 15);
    public static final o9x0 Q0 = new o9x0((byte) 16);
    public static final o9x0 R0 = new o9x0((byte) 17);
    public static final o9x0 S0 = new o9x0((byte) 18);
    public static final o9x0 T0 = new o9x0((byte) 19);
    public static final o9x0 U0 = new o9x0((byte) 21);
    public static final o9x0 V0 = new o9x0((byte) 22);
    public static final o9x0 W0 = new o9x0((byte) 23);
    public static final o9x0 X0 = new o9x0((byte) 24);
    public static final o9x0 Y0 = new o9x0((byte) 25);
    public static final o9x0 Z0 = new o9x0((byte) 26);

    public o9x0(rn0 rn0Var) {
        this.a = (byte) 27;
    }

    public static hxh1 g(String str) {
        if (str.equals("Pdf")) {
            return gxh1.a;
        }
        if (str.equals("Image")) {
            return fxh1.a;
        }
        return null;
    }

    public static boolean i(pe peVar) {
        return !peVar.b(7) || peVar.e();
    }

    public spq0 a(Uri uri, br8 br8Var) {
        return j5.a;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return new uax0((j8x0) obj);
            case 1:
                byte[] bArr = (byte[]) obj;
                try {
                    return Empty.q(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 2:
                return Boolean.valueOf(((nta1) obj) instanceof mta1);
            case 3:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return GetRecentlyPlayedResponse.q(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.recently_played_esperanto.proto.GetRecentlyPlayedResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 4:
                return (ContextTrack) ((spq0) obj).b();
            case 5:
                return Boolean.valueOf(u890.j(((pr61) obj).c, prm1.t.c.c));
            case 6:
            case 7:
            case 12:
            case 15:
            case 17:
            case 20:
            case 21:
            default:
                AdDetectionOuterClass.MapTimestampResponse mapTimestampResponse = (AdDetectionOuterClass.MapTimestampResponse) obj;
                return (mapTimestampResponse.n() || !mapTimestampResponse.p()) ? ppg0.a : new opg0(mapTimestampResponse.o().o());
            case 8:
                return (fvf1) ((mmr0) obj).a;
            case 9:
                return new tp61((zq61) obj);
            case 10:
                ContextTrack contextTrack = (ContextTrack) obj;
                if (l4o1.D(contextTrack)) {
                    return l4m.a;
                }
                return l4o1.K(contextTrack) ? l4m.b : l4m.c;
            case 11:
                return ((qq81) obj).d;
            case 13:
                return new to91(Boolean.valueOf(((sm81) obj).a));
            case 14:
                return new p3a1(k1u.v((Throwable) obj));
            case 16:
                return (Long) ((spq0) obj).b();
            case 18:
                return Boolean.valueOf(y7y0.z((Map) obj));
            case 19:
                return Boolean.FALSE;
            case 22:
                return ((PlayerState) obj).playbackQuality();
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                l2u0 l2u0Var = (l2u0) obj;
                return l2u0Var.a ? Observable.interval(50L, TimeUnit.MILLISECONDS).map(new ghk1(l2u0Var, (byte) 2)) : Observable.just(Long.valueOf(l2u0Var.j));
            case 24:
                byte[] bArr3 = (byte[]) obj;
                try {
                    return AlsoAvailableOfflineResponse.o(bArr3);
                } catch (Exception e4) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.your_library_esperanto.proto.AlsoAvailableOfflineResponse: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e4);
                    return null;
                }
        }
    }

    public voe1 b() {
        return new voe1(sjm0.a());
    }

    public Bundle c(String str, String str2, int i2, String str3) {
        throw new UnsupportedOperationException("Google Assistant linking does not support access tokens");
    }

    public Intent d(nhz nhzVar, String str, String str2) {
        return null;
    }

    public Bundle e(String str, String str2, String str3) {
        return cy30.g("extra_token", str);
    }

    public Intent f(Bundle bundle) {
        Intent intent = new Intent();
        intent.putExtras(bundle);
        return intent;
    }

    public spq0 h(Uri uri, nhz nhzVar, String str) {
        return j5.a;
    }

    public long j() {
        return sjm0.a();
    }

    public String toString() {
        switch (this.a) {
            case 17:
                int i2 = sjm0.b;
                return "TimeSource(System.nanoTime())";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ o9x0(byte b2) {
        this.a = b2;
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 7:
                float fFloatValue = ((Number) obj2).floatValue();
                String str = ((w080) obj).a;
                if (str.length() == 0) {
                    str = null;
                }
                return new nb41(true, str, fFloatValue);
            case 12:
                PlayerState playerState = (PlayerState) obj;
                return new d791((fvf1) obj2, playerState.restrictions(), (String) playerState.playbackId().h());
            default:
                return new mmr0((ContextTrack) obj, (twj1) obj2);
        }
    }
}
