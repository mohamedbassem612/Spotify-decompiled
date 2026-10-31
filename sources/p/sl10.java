package p;

import com.google.protobuf.Empty;
import com.spotify.connectivity.product_state.esperanto.proto.GetValuesResponse;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.offline_esperanto.proto.EsOffline$BulkRedownloadCancelResponse;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.recentlyplayed.recentlyplayed.RecentlyPlayedEntity;
import com.spotify.recentlyplayed.recentlyplayed.RecentlyPlayedResponse;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sl10 implements Function, s2i1, Init, z8n0, BiFunction, Predicate, nco {
    public static final sl10 b;
    public static final sl10 c;
    public static final sl10 d;
    public static final sl10 e;
    public final /* synthetic */ byte a;
    public static final sl10 f = new sl10(1);
    public static final sl10 g = new sl10(2);
    public static final sl10 h = new sl10(3);
    public static final sl10 i = new sl10(4);
    public static final pd90 t = new pd90(null);
    public static final sl10 X = new sl10(6);
    public static final sl10 Y = new sl10(7);
    public static final sl10 Z = new sl10(8);
    public static final sl10 N0 = new sl10(9);
    public static final sl10 O0 = new sl10(10);
    public static final sl10 P0 = new sl10(11);
    public static final sl10 Q0 = new sl10(12);
    public static final sl10 R0 = new sl10(14);
    public static final sl10 S0 = new sl10(15);
    public static final sl10 T0 = new sl10(16);
    public static final sl10 U0 = new sl10(17);
    public static final sl10 V0 = new sl10(18);
    public static final sl10 W0 = new sl10(19);
    public static final sl10 X0 = new sl10(20);
    public static final sl10 Y0 = new sl10(21);
    public static final sl10 Z0 = new sl10(22);
    public static final sl10 a1 = new sl10(23);
    public static final sl10 b1 = new sl10(24);
    public static final sl10 c1 = new sl10(25);
    public static final sl10 d1 = new sl10(26);
    public static final sl10 e1 = new sl10(27);
    public static final sl10 f1 = new sl10(28);
    public static final sl10 g1 = new sl10(29);

    static {
        byte b2 = 0;
        b = new sl10(b2);
        c = new sl10(b2);
        d = new sl10(b2);
        e = new sl10(b2);
    }

    public /* synthetic */ sl10(byte b2) {
        this.a = b2;
    }

    public static Set a(boolean z, boolean z2) {
        return dm61.B0(new aq21[]{new zp21(nbw0.class), new yp21(xkk1.class), new zp21(jo70.class), new zp21(yo60.class), z2 ? new zp21(mtl.class) : null, z ? new yp21(e2k1.class) : null, null});
    }

    public static Set b() {
        return f46.S0(new aq21[]{new yp21(w281.class), new yp21(xkk1.class), new zp21(nbw0.class)});
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                return mq3.a;
            case 2:
            case 5:
            case 6:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 22:
            case 23:
            case 27:
            default:
                byte[] bArr = (byte[]) obj;
                try {
                    return GetValuesResponse.p(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.connectivity.product_state.esperanto.proto.GetValuesResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 3:
                return o000.d;
            case 4:
                return new zt60(ts60.b);
            case 7:
                return new m5e0((Throwable) obj);
            case 8:
                return Boolean.valueOf(((w8c0) obj).a(w8c0.d));
            case 9:
                return kyd0.a;
            case 10:
                return ((th61) obj).b ? wte0.a : wte0.b;
            case 11:
                return new uaf0(((Boolean) obj).booleanValue());
            case 17:
                return ((PlayerState) obj).track();
            case 18:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return EsOffline$BulkRedownloadCancelResponse.n(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.offline_esperanto.proto.EsOffline.BulkRedownloadCancelResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 19:
                return ((Empty) obj).toByteArray();
            case 20:
                return ((atq0) obj).a;
            case 21:
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            case 24:
                return (String) ((spq0) obj).b();
            case 25:
                return (ContextTrack) ((spq0) obj).b();
            case 26:
                return new b211(((wsc0) obj).f.g ? 1 : 2);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return ((wpb) obj).b;
        }
    }

    public First e0(Object obj) {
        switch (this.a) {
            case 12:
                return First.b((ofg0) obj);
            default:
                kak0 kak0Var = (kak0) obj;
                kak0Var.getClass();
                lhg1 lhg1Var = kak0Var.S0;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                ruq0 ruq0Var = lhg1Var.b;
                linkedHashSet.add(new m0k0(ruq0Var.c, ruq0Var.d, o2p1.o(kak0Var)));
                if (kak0Var.e instanceof odm0) {
                    return First.c(kak0Var, linkedHashSet);
                }
                if (lhg1Var.a.a == b8w0.b) {
                    return First.c(kak0Var, linkedHashSet);
                }
                linkedHashSet.add(new r0k0(lhg1Var, (String) null, kak0Var.f == null, 0L, kak0Var.b(), 8));
                return First.c(kak0.a(kak0Var, (pdm0) null, (Boolean) null, rcu0.a, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, (lhg1) null, (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -65, 1048575), linkedHashSet);
        }
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        switch (this.a) {
            case 2:
                String str3 = (String) linkedHashMap.get("session_id");
                if (str3 == null) {
                    return null;
                }
                return new ha40(str3, xkg0Var, str2, str);
            case 6:
                return new k6a0(xkg0Var, str2, str);
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
                return new hyu0(str4, xkg0Var, str2, str);
        }
    }

    public boolean test(Object obj) {
        mmr0 mmr0Var = (mmr0) obj;
        RecentlyPlayedResponse recentlyPlayedResponse = (RecentlyPlayedResponse) mmr0Var.a;
        if (((Boolean) mmr0Var.b).booleanValue()) {
            return true;
        }
        Iterator it = recentlyPlayedResponse.getItems().iterator();
        while (it.hasNext()) {
            if (((RecentlyPlayedEntity) it.next()).getDerivedData().i) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                if (this == b) {
                    return "FULLSTACK";
                }
                if (this == c) {
                    return "OPEN_XR";
                }
                if (this != d) {
                    return this != e ? "UNKNOWN" : "PROJECTED";
                }
                return "SPATIAL";
            default:
                return super.toString();
        }
    }

    public Object apply(Object obj, Object obj2) {
        return new uuo0(((Boolean) obj2).booleanValue());
    }
}
