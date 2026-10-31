package p;

import android.graphics.PointF;
import com.spotify.authentication.login5esperanto.EsCodeRequired;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.offline_esperanto.proto.EsOffline$HasResourceResponse;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.prefs.esperanto.proto.EsPrefs;
import com.spotify.scrollsita.v1.Section;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sa20 implements Function, BiFunction, Init, Producer, s2i1, quw0 {
    public final /* synthetic */ byte a;
    public static final sa20 b = new sa20(0);
    public static final sa20 c = new sa20(1);
    public static final sa20 d = new sa20(2);
    public static final sa20 e = new sa20(3);
    public static final sa20 f = new sa20(4);
    public static final sa20 g = new sa20(5);
    public static final sa20 h = new sa20(6);
    public static final sa20 i = new sa20(7);
    public static final sa20 t = new sa20(8);
    public static final sa20 X = new sa20(9);
    public static final sa20 Y = new sa20(10);
    public static final sa20 Z = new sa20(11);
    public static final sa20 N0 = new sa20(12);
    public static final sa20 O0 = new sa20(13);
    public static final sa20 P0 = new sa20(14);
    public static final sa20 Q0 = new sa20(15);
    public static final sa20 R0 = new sa20(16);
    public static final sa20 S0 = new sa20(17);
    public static final sa20 T0 = new sa20(18);
    public static final sa20 U0 = new sa20(19);
    public static final sa20 V0 = new sa20(20);
    public static final sa20 W0 = new sa20(21);
    public static final sa20 X0 = new sa20(22);
    public static final sa20 Y0 = new sa20(23);
    public static final sa20 Z0 = new sa20(24);
    public static final sa20 a1 = new sa20(25);
    public static final sa20 b1 = new sa20(26);
    public static final sa20 c1 = new sa20(27);
    public static final sa20 d1 = new sa20(28);
    public static final sa20 e1 = new sa20(29);

    public /* synthetic */ sa20(byte b2) {
        this.a = b2;
    }

    public Object apply(Object obj) {
        String str;
        int i2 = 0;
        switch (this.a) {
            case 0:
                yoa1 yoa1Var = (yoa1) obj;
                List list = yoa1Var.b;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((r8s0) it.next()).a);
                }
                return new i5w0(new q3c1(yoa1Var.a, arrayList, yoa1Var.c, yoa1Var.d, yoa1Var.e, yoa1Var.f, yoa1Var.g));
            case 1:
            case 13:
            case 14:
            case 15:
            case 20:
            case 26:
            default:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsPrefs.PrefValues.q(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.prefs.esperanto.proto.EsPrefs.PrefValues: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 2:
                return Boolean.valueOf(((lfd) obj).c);
            case 3:
                return t3p1.D((nwq0) obj);
            case 4:
                return Observable.empty();
            case 5:
                return new mk91(((Boolean) obj).booleanValue());
            case 6:
                List list2 = (List) obj;
                if (list2.size() <= 1) {
                    return Flowable.H(list2.get(0), list2.get(0));
                }
                Object obj2 = list2.get(0);
                PointF pointF = m9a0.b;
                return Flowable.H(obj2, Double.valueOf((0.5d * ((Number) list2.get(1)).doubleValue()) + (((Number) list2.get(0)).doubleValue() * 0.5d)));
            case 7:
                return Boolean.valueOf(((th61) obj).b);
            case 8:
                return new eq3((htc0) obj);
            case 9:
                return new ed7((String) null, (String) null, (String) null, false, (List) null, (List) null, 63);
            case 10:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return EsCodeRequired.CodeRequiredResendResult.p(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.authentication.login5esperanto.EsCodeRequired.CodeRequiredResendResult: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 11:
                return ((PlayerState) obj).track();
            case 12:
                lwu lwuVar = (lwu) obj;
                if (lwuVar.equals(jwu.a)) {
                    return Observable.just(sjg0.a);
                }
                if (lwuVar instanceof kwu) {
                    return Observable.just(new tjg0(((kwu) lwuVar).a));
                }
                eg.o();
                return null;
            case 16:
                return Boolean.valueOf(y7y0.L((Map) obj));
            case 17:
                gqa1 gqa1Var = (gqa1) o7h.r0(((Map) obj).values());
                return gqa1Var == null ? eqa1.a : gqa1Var;
            case 18:
                byte[] bArr3 = (byte[]) obj;
                try {
                    return EsOffline$HasResourceResponse.o(bArr3);
                } catch (Exception e4) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.offline_esperanto.proto.EsOffline.HasResourceResponse: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e4);
                    return null;
                }
            case 19:
                return CompletableEmpty.a;
            case 21:
                return new d500(((faw) obj).b);
            case 22:
                return new z310((List) obj, (f410) null, (m510) null, (String) null);
            case 23:
                return l4o1.b0((ContextTrack) obj);
            case 24:
                PlayerState playerState = (PlayerState) obj;
                if (playerState.isBuffering()) {
                    str = "buffering";
                } else if (playerState.isPaused()) {
                    str = "paused";
                } else {
                    str = playerState.isPlaying() ? "playing" : "loading";
                }
                return new c2l1(str, o4p1.o(playerState));
            case 25:
                return (Long) ((spq0) obj).e(0L);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : ((z310) obj).a) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        p7h.T();
                        throw null;
                    }
                    u310 u310Var = (u310) obj3;
                    if (i2 >= 10 || !(u310Var.G == 1 || i2 == 0)) {
                        return new z310(arrayList2, (f410) null, (m510) null, (String) null);
                    }
                    arrayList2.add(u310Var);
                    i2 = i3;
                }
                return new z310(arrayList2, (f410) null, (m510) null, (String) null);
        }
    }

    public First e0(Object obj) {
        return First.b((bmi0) obj);
    }

    public Object get() {
        WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
        return new ImmediateWorkRunner();
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
        return new eyu0(str3, xkg0Var, str2, str);
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 1:
                spq0 spq0Var = (spq0) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    Set set = s4b1.f;
                    s4b1 s4b1VarX = uic.x((String) entry.getKey());
                    String strS = s4b1VarX.s();
                    if (s4b1VarX.c == blc0.ee && strS != null && spq0Var.c()) {
                        linkedHashMap.put(entry.getKey(), q730.a((q730) entry.getValue(), ((List) spq0Var.b()).contains(strS), 0, 14));
                    } else {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return sqg0.U(linkedHashMap);
            case 15:
                return new mmr0((Integer) obj, (Boolean) obj2);
            default:
                return new mmr0((List) obj, ((z310) obj2).a);
        }
    }
}
