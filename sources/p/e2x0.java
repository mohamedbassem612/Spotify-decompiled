package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.metadata.proto.Metadata;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.pending_events.esperanto.proto.CommitPendingEventResponse;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e2x0 implements Function, av30, s2i1, np80, Predicate, qs91, t6a1, BiFunction, Init, ya {
    public static final e2x0 a1;
    public static final e2x0 b1;
    public static final e2x0 c1;
    public final /* synthetic */ byte a;
    public static final e2x0 b = new e2x0((byte) 0);
    public static final e2x0 c = new e2x0((byte) 1);
    public static final e2x0 d = new e2x0((byte) 2);
    public static final e2x0 e = new e2x0((byte) 3);
    public static final e2x0 f = new e2x0((byte) 4);
    public static final e2x0 g = new e2x0((byte) 5);
    public static final e2x0 h = new e2x0((byte) 6);
    public static final e2x0 i = new e2x0((byte) 7);
    public static final e2x0 t = new e2x0((byte) 8);
    public static final e2x0 X = new e2x0((byte) 9);
    public static final e2x0 Y = new e2x0((byte) 10);
    public static final e2x0 Z = new e2x0((byte) 11);
    public static final e2x0 N0 = new e2x0((byte) 12);
    public static final e2x0 O0 = new e2x0((byte) 13);
    public static final e2x0 P0 = new e2x0((byte) 14);
    public static final e2x0 Q0 = new e2x0((byte) 15);
    public static final e2x0 R0 = new e2x0((byte) 16);
    public static final e2x0 S0 = new e2x0((byte) 17);
    public static final e2x0 T0 = new e2x0((byte) 18);
    public static final e2x0 U0 = new e2x0((byte) 19);
    public static final e2x0 V0 = new e2x0((byte) 20);
    public static final e2x0 W0 = new e2x0((byte) 21);
    public static final e2x0 X0 = new e2x0((byte) 22);
    public static final e2x0 Y0 = new e2x0((byte) 23);
    public static final e2x0 Z0 = new e2x0((byte) 24);
    public static final e2x0 d1 = new e2x0((byte) 26);
    public static final e2x0 e1 = new e2x0((byte) 27);

    static {
        byte b2 = 25;
        a1 = new e2x0(b2);
        b1 = new e2x0(b2);
        c1 = new e2x0(b2);
    }

    public boolean accept(Object obj) {
        return ((ksk) obj).c == le30.b;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return t2x0.a;
            case 1:
                yvx0 yvx0Var = (yvx0) obj;
                return new mmr0(yvx0Var.a, Boolean.valueOf(yvx0Var.c));
            case 2:
                return new l8z0(b7x.a);
            case 3:
                ccg1 ccg1Var = (ccg1) obj;
                return new mmr0(Boolean.valueOf(ccg1Var.m), Integer.valueOf(ccg1Var.h));
            case 4:
                return ((th61) obj).a;
            case 5:
            case 7:
            case 9:
            case 14:
            case 15:
            case 16:
            default:
                eww0 eww0Var = (eww0) o7h.s0((List) obj);
                if (eww0Var == null) {
                    return "";
                }
                String str = eww0Var.c;
                if (str != null) {
                    String str2 = ihc1.y0(str) ? null : str;
                    if (str2 != null) {
                        return str2;
                    }
                }
                return eww0Var.a;
            case 6:
                return new z0n1(false);
            case 8:
                return ((on3) obj).d;
            case 10:
                Object obj2 = ((cma1) obj).a;
                if (obj2 != null) {
                    return (Boolean) obj2;
                }
                hhg1.n("Required value was null.");
                return null;
            case 11:
                Boolean bool = (Boolean) ((mmr0) obj).b;
                bool.booleanValue();
                return new i5w0(bool);
            case 12:
                return new g8o0((Throwable) obj, (bk8) null);
            case 13:
                return ((PlayerState) obj).contextUri();
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return Boolean.valueOf(((kdn) obj).a);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (Completable) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                Metadata.Track track = (Metadata.Track) obj;
                String strA = f9a.a(track.r().t());
                String strA2 = f9a.a(((Metadata.Artist) o7h.q0(track.getArtistList())).r().t());
                Set set = s4b1.f;
                if (strA2.length() != 22) {
                    hhg1.n("Failed requirement.");
                    return null;
                }
                if (strA.length() != 22) {
                    hhg1.n("Failed requirement.");
                    return null;
                }
                return new ern0(uic.x("spotify:artist:" + strA2 + ":play:" + strA));
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                CommitPendingEventResponse commitPendingEventResponse = (CommitPendingEventResponse) obj;
                return commitPendingEventResponse.o() ? CompletableEmpty.a : Completable.j(new c9h1("Can't commit pending event", commitPendingEventResponse.n()));
        }
    }

    public First e0(Object obj) {
        d4m1 d4m1Var = (d4m1) obj;
        return First.c(d4m1Var, Collections.singleton(new k2m1(d4m1Var.a)));
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        String str3;
        String str4 = (String) linkedHashMap.get("upsell_type");
        if (str4 == null || (str3 = (String) linkedHashMap.get("track_id")) == null || str3.length() != 22) {
            return null;
        }
        int length = str3.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str3.charAt(i2);
            if (('a' > cCharAt || cCharAt >= '{') && (('A' > cCharAt || cCharAt >= '[') && ('0' > cCharAt || cCharAt >= ':'))) {
                return null;
            }
        }
        return new qj11(str4, str3, xkg0Var, str2, str);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 9:
                return !((uv00) obj).f;
            default:
                return ((feh) obj) instanceof beh;
        }
    }

    public /* synthetic */ e2x0(byte b2) {
        this.a = b2;
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 22:
                return new awj1((List) obj, (zvj1) obj2);
            default:
                return new mmr0(((spq0) obj).h(), ((spq0) obj2).h());
        }
    }
}
