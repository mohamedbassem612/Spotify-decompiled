package p;

import com.google.protobuf.BoolValue;
import com.google.protobuf.Empty;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerQueue;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import com.spotify.prefs.esperanto.proto.EsPrefs;
import com.spotify.yourupdates.domain.models.ApplicationState;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uh21 implements Function, Function3, Predicate, s2i1, BiFunction, pnb {
    public final /* synthetic */ byte a;
    public static final uh21 b = new uh21(0);
    public static final uh21 c = new uh21(1);
    public static final uh21 d = new uh21(2);
    public static final uh21 e = new uh21(3);
    public static final uh21 f = new uh21(4);
    public static final uh21 g = new uh21(5);
    public static final uh21 h = new uh21(6);
    public static final uh21 i = new uh21(7);
    public static final a2g t = new a2g((byte) 3);
    public static final uh21 X = new uh21(9);
    public static final uh21 Y = new uh21(10);
    public static final uh21 Z = new uh21(11);
    public static final uh21 N0 = new uh21(12);
    public static final uh21 O0 = new uh21(13);
    public static final uh21 P0 = new uh21(14);
    public static final uh21 Q0 = new uh21(15);
    public static final uh21 R0 = new uh21(16);
    public static final uh21 S0 = new uh21(17);
    public static final uh21 T0 = new uh21(18);
    public static final uh21 U0 = new uh21(19);
    public static final uh21 V0 = new uh21(20);
    public static final uh21 W0 = new uh21(21);
    public static final uh21 X0 = new uh21(22);
    public static final uh21 Y0 = new uh21(23);
    public static final uh21 Z0 = new uh21(24);
    public static final uh21 a1 = new uh21(25);
    public static final uh21 b1 = new uh21(26);
    public static final uh21 c1 = new uh21(27);
    public static final uh21 d1 = new uh21(28);
    public static final uh21 e1 = new uh21(29);

    public /* synthetic */ uh21(byte b2) {
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b5  */
    public Object apply(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 1:
                return (eww0) ((spq0) obj).b();
            case 2:
            case 4:
            case 7:
            case 8:
            case 10:
            case 12:
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
            case 23:
            default:
                return Boolean.FALSE;
            case 3:
                return ((PlayerQueue) obj).nextTracks();
            case 5:
                return Boolean.valueOf(((yj4) obj).b);
            case 6:
                return new y0n1(((Boolean) obj).booleanValue() ? ApplicationState.FOREGROUND : ApplicationState.BACKGROUND);
            case 9:
                return new CompletableFromAction(new jt8((dma1) obj, (byte) 0));
            case 11:
                oy21 oy21Var = (py21) obj;
                if (oy21Var instanceof ly21) {
                    return MaybeEmpty.a;
                }
                if (oy21Var instanceof oy21) {
                    return Maybe.e(((wsc0) oy21Var.a).f);
                }
                eg.o();
                return null;
            case 13:
                return yhm0.m((a5j0) obj);
            case 14:
                return crn0.a;
            case 15:
                return new p1h((qnb1) obj);
            case 16:
                ry21 ry21Var = ((sy21) obj).a;
                if (ry21Var.Q0) {
                    return rih1.a;
                }
                eg.m(f4i1.c(ry21Var.d, "Failed to delete comment - Status: "));
                return null;
            case 17:
                byte[] bArr = (byte[]) obj;
                try {
                    return Empty.q(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                PlayerState playerState = (PlayerState) obj;
                String str = (String) ((ContextTrack) playerState.track().b()).metadata().get("station_title");
                String str2 = (String) ((ContextTrack) playerState.track().b()).metadata().get("station_subtitle");
                if ((str != null && str.length() != 0) || (str2 != null && str2.length() != 0)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 20:
                List<w2u0> list = (List) obj;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (w2u0 w2u0Var : list) {
                    boolean z2 = w2u0Var instanceof v2u0;
                    or11 or11Var = or11.a;
                    if (!z2) {
                        if (!(w2u0Var instanceof w2u0)) {
                            eg.o();
                            return null;
                        }
                        i1z i1zVar = w2u0Var.a;
                        int i2 = i1zVar.E;
                        or11 or11Var2 = mr11.a;
                        if (i2 == 3 || i2 == 4) {
                            or11Var = or11Var2;
                        } else {
                            b9v0 b9v0VarA = i1zVar.D.a(b9v0.class);
                            if (b9v0VarA != null && b9v0VarA.d) {
                                or11Var = nr11.a;
                            } else if (!i1zVar.o) {
                                or11Var = or11Var2;
                            }
                        }
                    }
                    arrayList.add(or11Var);
                }
                return arrayList;
            case 21:
                return Observable.just(Boolean.FALSE);
            case 22:
                return Boolean.valueOf(((kdn) obj).a);
            case 24:
                return new blt((String) obj, (alt) null);
            case 25:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return BoolValue.q(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.google.protobuf.BoolValue: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 26:
                Logger.e((Throwable) obj, "Error calling submitCheckout()", new Object[0]);
                return e500.a;
            case 27:
                ContextTrack contextTrack = (ContextTrack) ((PlayerState) obj).track().b();
                return new yvg1(contextTrack.uri(), Boolean.valueOf(l4o1.P(contextTrack)), Boolean.valueOf(l4o1.U(contextTrack)));
            case 28:
                return Long.valueOf(((EsPrefs.Value) obj).p());
        }
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        String str3 = (String) linkedHashMap.get("artist_id");
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
        String str4 = (String) linkedHashMap.get("category");
        if (str4 == null) {
            return null;
        }
        return new py6(str3, str4, str2, str, xkg0Var);
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        return new yvg1((String) obj, (Restrictions) obj2, (fvf1) obj3);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 4:
                wv00 wv00Var = (uv00) obj;
                return wv00Var.c() || !wv00Var.f;
            default:
                l0l l0lVar = (l0l) obj;
                return (l0lVar.l() || l0lVar.C()) ? false : true;
        }
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 10:
                return new ye9((xe9) obj2, ((ye9) obj).b);
            default:
                return new mmr0((Throwable) obj, (Integer) obj2);
        }
    }
}
