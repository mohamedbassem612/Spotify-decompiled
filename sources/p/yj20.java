package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.pending_events.esperanto.proto.ReplacePendingEventResponse;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService;
import com.spotify.player.model.PlayerState;
import com.spotify.profile.profile.proto.ProfilemodelRequest;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yj20 implements Function, Predicate, jy50, Init, av30, iw91, BiFunction, s2i1, tbt0 {
    public final /* synthetic */ byte a;
    public static final yj20 b = new yj20(0);
    public static final yj20 c = new yj20(1);
    public static final yj20 d = new yj20(2);
    public static final yj20 e = new yj20(3);
    public static final yj20 f = new yj20(5);
    public static final yj20 g = new yj20(6);
    public static final yj20 h = new yj20(7);
    public static final yj20 i = new yj20(8);
    public static final yj20 t = new yj20(9);
    public static final yj20 X = new yj20(10);
    public static final yj20 Y = new yj20(11);
    public static final yj20 Z = new yj20(12);
    public static final yj20 N0 = new yj20(13);
    public static final yj20 O0 = new yj20(15);
    public static final yj20 P0 = new yj20(16);
    public static final yj20 Q0 = new yj20(17);
    public static final yj20 R0 = new yj20(18);
    public static final yj20 S0 = new yj20(19);
    public static final yj20 T0 = new yj20(20);
    public static final yj20 U0 = new yj20(21);
    public static final yj20 V0 = new yj20(22);
    public static final yj20 W0 = new yj20(23);
    public static final yj20 X0 = new yj20(24);
    public static final yj20 Y0 = new yj20(25);
    public static final yj20 Z0 = new yj20(26);
    public static final yj20 a1 = new yj20(27);
    public static final yj20 b1 = new yj20(28);
    public static final yj20 c1 = new yj20(29);

    public /* synthetic */ yj20(byte b2) {
        this.a = b2;
    }

    public static int a(zk4 zk4Var) {
        return zk4Var.b();
    }

    public static void b() {
        jnm0 jnm0Var = jnm0.a;
    }

    public Object apply(Object obj) {
        int i2;
        Object obj2;
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                Logger.e(th, "Failed to load notification flow shown state", new Object[0]);
                return new wae0(th);
            case 1:
                List list = (List) obj;
                int iS = zno1.s(q7h.U(list, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj3 : list) {
                    linkedHashMap.put(((eww0) obj3).a, obj3);
                }
                return linkedHashMap;
            case 2:
            case 3:
            case 4:
            case 6:
            case 8:
            case 12:
            case 14:
            case 15:
            case 18:
            case 20:
            case 22:
            case 26:
            case 27:
            default:
                sy21 sy21Var = (sy21) obj;
                return (!sy21Var.a.Q0 || (obj2 = sy21Var.b) == null) ? l2x0.a : new k2x0((ProfilemodelRequest.Profile) obj2);
            case 5:
                return new l3a0(((Boolean) obj).booleanValue());
            case 7:
                return new up3((List) obj);
            case 9:
                return b7x.a;
            case 10:
                axp0 axp0Var = (axp0) o7h.s0(((cxp0) obj).a);
                return Boolean.valueOf((axp0Var != null ? axp0Var.b : null) instanceof hwp0);
            case 11:
                bgf0 bgf0Var = (bgf0) obj;
                List<off0> list2 = bgf0Var.b;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                for (off0 off0Var : list2) {
                    long j = off0Var.a;
                    String str = off0Var.b;
                    List<uff0> list3 = off0Var.c;
                    ArrayList arrayList2 = new ArrayList(q7h.U(list3, 10));
                    for (uff0 uff0Var : list3) {
                        arrayList2.add(new cef0(uff0Var.a, uff0Var.b));
                    }
                    arrayList.add(new aef0(j, str, arrayList2));
                }
                int iC = l1d.C(bgf0Var.c);
                int i3 = 1;
                if (iC != 0) {
                    i2 = 2;
                    if (iC != 1) {
                        if (iC != 2) {
                            eg.o();
                            return null;
                        }
                        i3 = 3;
                        i2 = i3;
                    }
                } else {
                    i2 = i3;
                }
                boolean z = bgf0Var.f;
                String str2 = bgf0Var.e;
                List<xff0> list4 = bgf0Var.d;
                ArrayList arrayList3 = new ArrayList(q7h.U(list4, 10));
                for (xff0 xff0Var : list4) {
                    arrayList3.add(new def0(xff0Var.a, xff0Var.b, xff0Var.c));
                }
                rff0 rff0Var = bgf0Var.g;
                bef0 bef0Var = new bef0(rff0Var.a, rff0Var.b, rff0Var.c);
                lff0 lff0Var = bgf0Var.h;
                int i4 = lff0Var.a;
                int i5 = lff0Var.b;
                int i6 = lff0Var.c;
                return new a9h(arrayList, i2, arrayList3, str2, z, bef0Var, new eef0(bgf0Var.i.a), 0, new bff0(i4, i4, i6, i5, i6, false), 384);
            case 13:
                return spq0.a(((dwx0) obj).d);
            case 16:
                ru50 ru50Var = (ru50) obj;
                String str3 = ru50Var.a;
                j1p0 j1p0Var = ru50Var.b;
                return new tu50(str3, j1p0Var.a, j1p0Var.b, j1p0Var.c);
            case 17:
                cwi0 cwi0Var = (ewi0) obj;
                return cwi0Var instanceof cwi0 ? new v23(cwi0Var) : new u23((xvi0) cwi0Var);
            case 19:
                return ((PlayerState) obj).track();
            case 21:
                byte[] bArr = (byte[]) obj;
                try {
                    return ReplacePendingEventResponse.p(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.pending_events.esperanto.proto.ReplacePendingEventResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 23:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return PlaybackSettingsEsperantoService.ShuffleState.r(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService.ShuffleState: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 24:
                return ((sp91) obj).a;
            case 25:
                return Boolean.valueOf(y7y0.t("is-euterpe", (Map) obj));
            case 28:
                return new kuv0((mvv0) obj);
        }
    }

    public First e0(Object obj) {
        return First.b((n2c0) obj);
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        String str3;
        String str4;
        switch (this.a) {
            case 20:
                String str5 = (String) linkedHashMap.get("audiobook_id");
                if (str5 == null || !gho1.n(str5) || (str3 = (String) linkedHashMap.get("chapter_id")) == null || !gho1.n(str3) || (str4 = (String) linkedHashMap.get("timestamp_ms")) == null) {
                    return null;
                }
                return new x8r0(str5, str3, str4, str2, str, xkg0Var);
            default:
                return new lxu0(xkg0Var, str2, str);
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 2:
                return ((Boolean) obj).booleanValue();
            case 8:
                return ((Boolean) obj).booleanValue();
            case 12:
                return ((spq0) obj).c();
            default:
                return ((i1z) obj).z != null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 15:
                return "NoDeclaredBrand";
            default:
                return super.toString();
        }
    }

    public Object apply(Object obj, Object obj2) {
        Map map = (Map) obj;
        Map map2 = (Map) obj2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            EsOffline.Context context = (EsOffline.Context) entry.getValue();
            EsOffline.Progress progress = (EsOffline.Progress) map2.get(entry.getKey());
            int i2 = ypp0.a[context.q().ordinal()];
            g2v e2vVar = f2v.a;
            switch (i2) {
                case -1:
                case 1:
                case 7:
                    break;
                case 0:
                default:
                    eg.o();
                    return null;
                case 2:
                    e2vVar = d2v.a;
                    break;
                case 3:
                    e2vVar = c2v.a;
                    break;
                case 4:
                    e2vVar = new e2v((progress != null ? progress.t() : 0.0f) / 100.0f);
                    break;
                case 5:
                case 6:
                    e2vVar = g2v.a;
                    break;
            }
            linkedHashMap.put(key, e2vVar);
        }
        return linkedHashMap;
    }
}
