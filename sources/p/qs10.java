package p;

import android.content.Intent;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.offline_esperanto.proto.EsOffline$BulkRedownloadStartResponse;
import com.spotify.playability.esperanto.proto.EsPlayability$GetLocallyPlayableResponse;
import com.spotify.player.model.PlayerState;
import com.spotify.recentlyplayed.recentlyplayed.RecentlyPlayedEntity;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import spotify.socialgraph.esperanto.proto.FollowResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qs10 implements k1q0, Function, s2i1, Init, ldf0, jrn0, Predicate, BiFunction {
    public static volatile qs10 Z;
    public final /* synthetic */ byte a;
    public static final qs10 b = new qs10((byte) 0);
    public static final qs10 c = new qs10((byte) 1);
    public static final qs10 d = new qs10((byte) 2);
    public static final qs10 e = new qs10((byte) 3);
    public static final qs10 f = new qs10((byte) 4);
    public static final qs10 g = new qs10((byte) 5);
    public static final qs10 h = new qs10((byte) 6);
    public static final qs10 i = new qs10((byte) 7);
    public static final qs10 t = new qs10((byte) 8);
    public static final qs10 X = new qs10((byte) 9);
    public static final Object Y = new Object();
    public static final qs10 N0 = new qs10((byte) 11);
    public static final qs10 O0 = new qs10((byte) 12);
    public static final qs10 P0 = new qs10((byte) 13);
    public static final qs10 Q0 = new qs10((byte) 14);
    public static final qs10 R0 = new qs10((byte) 15);
    public static final qs10 S0 = new qs10((byte) 16);
    public static final qs10 T0 = new qs10((byte) 17);
    public static final qs10 U0 = new qs10((byte) 18);
    public static final qs10 V0 = new qs10((byte) 19);
    public static final qs10 W0 = new qs10((byte) 20);
    public static final qs10 X0 = new qs10((byte) 21);
    public static final qs10 Y0 = new qs10((byte) 22);
    public static final qs10 Z0 = new qs10((byte) 23);
    public static final qs10 a1 = new qs10((byte) 24);
    public static final qs10 b1 = new qs10((byte) 25);
    public static final qs10 c1 = new qs10((byte) 26);
    public static final qs10 d1 = new qs10((byte) 27);
    public static final qs10 e1 = new qs10((byte) 28);
    public static final qs10 f1 = new qs10((byte) 29);

    public qs10(int i2) {
        this.a = (byte) 10;
    }

    public static qs10 a() {
        qs10 qs10Var;
        synchronized (Y) {
            try {
                if (Z == null) {
                    Z = new qs10((byte) 10);
                }
                qs10Var = Z;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qs10Var;
    }

    public static void b(qs10 qs10Var) {
        synchronized (Y) {
            try {
                if (Z == null) {
                    Z = qs10Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String c(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                return ((FollowResponse) obj).n();
            case 4:
                return new fu60(xs60.b);
            case 5:
                return new lk91(((Boolean) obj).booleanValue());
            case 7:
                return (eww0) ((spq0) obj).b();
            case 8:
                Logger.e((Throwable) obj, "Assisted Curation: Failed to fetch Liked Songs", new Object[0]);
                return b7x.a;
            case 9:
                return new pqd0(qqd0.b);
            case 12:
                return Boolean.valueOf(yto.j((String) obj));
            case 13:
                return new ali0(eso1.N((hki0) obj));
            case 14:
                return new q7z0(false, false);
            case 16:
                return new xuo0((k5a1) obj);
            case 18:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsOffline$BulkRedownloadStartResponse.o(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.offline_esperanto.proto.EsOffline.BulkRedownloadStartResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 19:
                return new sup0(((jvp0) obj).a);
            case 23:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return EsPlayability$GetLocallyPlayableResponse.n(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.playability.esperanto.proto.EsPlayability.GetLocallyPlayableResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 28:
                return Boolean.valueOf(y7y0.G((Map) obj));
            default:
                return Boolean.valueOf(y7y0.L((Map) obj));
        }
    }

    public First e0(Object obj) {
        return First.b((jc50) obj);
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        switch (this.a) {
            case 2:
                String str3 = (String) linkedHashMap.get("session_id");
                if (str3 == null) {
                    return null;
                }
                return new ka40(str3, str2, str, xkg0Var);
            case 6:
                return new l6a0(xkg0Var, str2, str);
            case 26:
                return new tyu0(xkg0Var, str2, str);
            default:
                String str4 = (String) linkedHashMap.get("playlist_id");
                if (str4 == null || str4.length() != 22) {
                    return null;
                }
                int length = str4.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char cCharAt = str4.charAt(i2);
                    if (('a' > cCharAt || cCharAt >= '{') && (('A' > cCharAt || cCharAt >= '[') && ('0' > cCharAt || cCharAt >= ':'))) {
                        return null;
                    }
                }
                return new sxu0(str4, xkg0Var, str2, str);
        }
    }

    public irn0 l(Intent intent, th61 th61Var) {
        Set set = s4b1.f;
        return new ern0(uic.x(uic.B(uic.x(intent.getDataString()).h()).z() + "?feature=mvcdp"));
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 17:
                return ((PlayerState) obj).track().c();
            case 22:
                return !((RecentlyPlayedEntity) obj).getDerivedData().i;
            case 24:
                return ((PlayerState) obj) != PlayerState.EMPTY;
            default:
                return ((PlayerState) obj).track().c();
        }
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        nk80 nk80VarI = hsl1Var.a.i(647);
        view.setPadding(nk80VarI.a, nk80VarI.b, nk80VarI.c, nk80VarI.d);
        return hsl1.b;
    }

    public /* synthetic */ qs10(byte b2) {
        this.a = b2;
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 20:
                return new aa80(((Integer) obj2).intValue(), obj);
            default:
                return Boolean.valueOf(((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue());
        }
    }
}
