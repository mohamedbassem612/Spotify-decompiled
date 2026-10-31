package p;

import androidx.compose.ui.graphics.Brush;
import com.google.protobuf.Empty;
import com.spotify.connectivity.product_state.esperanto.proto.PutValuesSyncResponse;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.offline_esperanto.proto.EsOffline$DownloadResponse;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.recentlyplayed.recentlyplayed.RecentlyPlayedResponse;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ok10 implements s2i1, Function, Init, BiFunction, Predicate {
    public final /* synthetic */ byte a;
    public static final ok10 b = new ok10(0);
    public static final ok10 c = new ok10(1);
    public static final ok10 d = new ok10(2);
    public static final ok10 e = new ok10(3);
    public static final ok10 f = new ok10(4);
    public static final ok10 g = new ok10(6);
    public static final ok10 h = new ok10(7);
    public static final ok10 i = new ok10(8);
    public static final ok10 t = new ok10(9);
    public static final ok10 X = new ok10(11);
    public static final ok10 Y = new ok10(12);
    public static final ok10 Z = new ok10(13);
    public static final ok10 N0 = new ok10(14);
    public static final ok10 O0 = new ok10(15);
    public static final ok10 P0 = new ok10(16);
    public static final ok10 Q0 = new ok10(17);
    public static final ok10 R0 = new ok10(18);
    public static final ok10 S0 = new ok10(19);
    public static final ok10 T0 = new ok10(20);
    public static final ok10 U0 = new ok10(21);
    public static final ok10 V0 = new ok10(22);
    public static final ok10 W0 = new ok10(23);
    public static final ok10 X0 = new ok10(24);
    public static final ok10 Y0 = new ok10(25);
    public static final ok10 Z0 = new ok10(26);
    public static final ok10 a1 = new ok10(27);
    public static final ok10 b1 = new ok10(28);
    public static final ok10 c1 = new ok10(29);

    public /* synthetic */ ok10(byte b2) {
        this.a = b2;
    }

    public static hpe0 a(boolean z, lql lqlVar) {
        kql kqlVar = kql.a;
        if (z || u890.j(lqlVar, kqlVar) || u890.j(lqlVar, hql.a)) {
            return u890.j(lqlVar, kqlVar) ? gpe0.a : fpe0.a;
        }
        return null;
    }

    public static hpe0 b(boolean z, lql lqlVar) {
        if (z) {
            return u890.j(lqlVar, kql.a) ? gpe0.a : fpe0.a;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0030 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0031 A[RETURN] */
    public static Object c(Brush brush, Brush brush2, float f2) {
        if (u890.j(brush, brush2)) {
            if (f2 < 0.5f) {
                return brush;
            }
            return brush2;
        }
        Object objB = brush instanceof n790 ? ((n790) brush).b(f2, brush2) : null;
        if (objB == null && (brush2 instanceof n790)) {
            objB = ((n790) brush2).b(1.0f - f2, brush);
        }
        if (objB != null) {
            return objB;
        }
        if (f2 < 0.5f) {
            return brush;
        }
        return brush2;
    }

    public Object apply(Object obj) {
        String strJ;
        String str;
        String str2 = null;
        switch (this.a) {
            case 1:
                return ((on3) obj).d;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 10:
            case 12:
            case 13:
            case 14:
            case 20:
            case 22:
            case 24:
            default:
                byte[] bArr = (byte[]) obj;
                try {
                    return PutValuesSyncResponse.o(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.connectivity.product_state.esperanto.proto.PutValuesSyncResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 7:
                return new f5e0(new v9h(null, (List) obj));
            case 8:
                return new x7c0(x9v0.a, (Boolean) obj);
            case 9:
                PlayerState playerState = (PlayerState) obj;
                String strContextUri = playerState.contextUri();
                Set set = s4b1.f;
                s4b1 s4b1VarX = uic.x(strContextUri);
                if (s4b1VarX.c != blc0.ea) {
                    s4b1VarX = null;
                }
                if (s4b1VarX == null || (strJ = s4b1VarX.j()) == null) {
                    strJ = null;
                }
                if (strJ == null) {
                    jxu0 jxu0VarC = oxu0.a.c(strContextUri);
                    jxu0 jxu0Var = jxu0VarC instanceof jxu0 ? jxu0VarC : null;
                    if (jxu0Var != null) {
                        if (!u890.j(jxu0Var.a, "listening-party") || !cmd0.a.e(jxu0Var.b)) {
                            jxu0Var = null;
                        }
                        if (jxu0Var != null && (str = jxu0Var.b) != null) {
                            str2 = str;
                        }
                    }
                } else {
                    str2 = strJ;
                }
                String strConcat = str2 != null ? "spotify:room:".concat(str2) : playerState.contextUri();
                strConcat.getClass();
                return new iyd0(strConcat, playerState.isPlaying() && !playerState.isPaused());
            case 11:
                return new paf0(((Boolean) obj).booleanValue());
            case 15:
                return Boolean.valueOf(((a4n0) obj) == a4n0.b);
            case 16:
                return ((Boolean) obj).booleanValue() ? tuo0.a : suo0.a;
            case 17:
                return PlayerState.EMPTY;
            case 18:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return EsOffline$DownloadResponse.o(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.offline_esperanto.proto.EsOffline.DownloadResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 19:
                return ((Empty) obj).toByteArray();
            case 21:
                return yz40.b;
            case 23:
                Object[] objArr = (Object[]) obj;
                ArrayList arrayList = new ArrayList(objArr.length);
                for (Object obj2 : objArr) {
                    arrayList.add((mmr0) obj2);
                }
                return arrayList;
            case 25:
                return sqg0.U(((PlayerState) obj).contextMetadata());
            case 26:
                return (wsc0) ((py21) obj).d();
        }
    }

    public First e0(Object obj) {
        switch (this.a) {
            case 3:
                return First.b((eb50) obj);
            default:
                return First.b((ceg0) obj);
        }
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        String str3;
        switch (this.a) {
            case 0:
                String str4 = (String) linkedHashMap.get("event_id");
                if (str4 == null) {
                    return null;
                }
                return new nk10(str4, xkg0Var, str2, str);
            case 2:
                String str5 = (String) linkedHashMap.get("session_id");
                if (str5 == null) {
                    return null;
                }
                return new ga40(str5, str2, str, xkg0Var);
            case 6:
                String str6 = (String) linkedHashMap.get("source");
                if (str6 == null) {
                    return null;
                }
                return new p6a0(str6, xkg0Var, str2, str);
            default:
                String str7 = (String) linkedHashMap.get("primary_id");
                if (str7 == null || (str3 = (String) linkedHashMap.get("secondary_id")) == null) {
                    return null;
                }
                return new nxu0(str7, str3, str2, str, xkg0Var);
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 20:
                return ((atq0) obj) instanceof zsq0;
            default:
                return ((spq0) obj).c();
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0048  */
    public Object apply(Object obj, Object obj2) {
        long jLongValue;
        switch (this.a) {
            case 4:
                ContextTrack contextTrack = (ContextTrack) obj2;
                long j = ((fvf1) obj).a;
                if (l4o1.U(contextTrack)) {
                    String strA0 = l4o1.a0(contextTrack, "segment.position_as_of_timestamp");
                    Long lValueOf = strA0 != null ? Long.valueOf(Long.parseLong(strA0)) : null;
                    if (lValueOf != null) {
                        jLongValue = lValueOf.longValue();
                    } else {
                        jLongValue = j;
                    }
                } else {
                    jLongValue = j;
                }
                return new mmr0(Long.valueOf(j), Long.valueOf(jLongValue));
            case 13:
                return new mmr0((ContextTrack) obj, (fvf1) obj2);
            case 22:
                return new mmr0((RecentlyPlayedResponse) obj, (Boolean) obj2);
            default:
                return new mmr0((Boolean) obj, (Boolean) obj2);
        }
    }
}
