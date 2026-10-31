package p;

import android.util.Log;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerError;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import spotify.socialgraph.esperanto.proto.FollowedUsersResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ws10 implements BiFunction, Function, s2i1, ldf0, Init, Predicate {
    public static x390 i;
    public final /* synthetic */ byte a;
    public static final ws10 b = new ws10(0);
    public static final ws10 c = new ws10(1);
    public static final ws10 d = new ws10(2);
    public static final /* synthetic */ ws10 e = new ws10(3);
    public static final ws10 f = new ws10(4);
    public static final ws10 g = new ws10(5);
    public static final ws10 h = new ws10(6);
    public static final ws10 t = new ws10(7);
    public static final ws10 X = new ws10(8);
    public static final ws10 Y = new ws10(9);
    public static final ws10 Z = new ws10(10);
    public static final ws10 N0 = new ws10(11);
    public static final ws10 O0 = new ws10(12);
    public static final ws10 P0 = new ws10(13);
    public static final ws10 Q0 = new ws10(14);
    public static final ws10 R0 = new ws10(15);
    public static final ws10 S0 = new ws10(16);
    public static final ws10 T0 = new ws10(17);
    public static final ws10 U0 = new ws10(18);
    public static final ws10 V0 = new ws10(19);
    public static final ws10 W0 = new ws10(20);
    public static final ws10 X0 = new ws10(21);
    public static final ws10 Y0 = new ws10(22);
    public static final ws10 Z0 = new ws10(23);
    public static final ws10 a1 = new ws10(24);
    public static final ws10 b1 = new ws10(25);
    public static final ws10 c1 = new ws10(26);
    public static final ws10 d1 = new ws10(27);
    public static final ws10 e1 = new ws10(29);

    public /* synthetic */ ws10(byte b2) {
        this.a = b2;
    }

    public static knv0 b(ze3 ze3Var, Function0 function0, int i2) {
        if ((i2 & 1) != 0) {
            ze3Var = null;
        }
        fns fnsVar = igu.a;
        llm llmVarE = smo1.e(flo1.l(b3s.c, guo1.B()));
        mif1 mif1Var = mif1.o1;
        isr0 isr0Var = new isr0(function0, (byte) 27);
        if (ze3Var == null) {
            ze3Var = new ekb((byte) 17);
        }
        return new knv0(new h191(isr0Var, mif1Var, Collections.singletonList(new vdd(z6x.a, (lnm) null, (byte) 1)), ze3Var, llmVarE));
    }

    public void a(int i2) {
        if (4 > i2) {
            Log.isLoggable("FirebaseCrashlytics", i2);
        }
    }

    public Object apply(Object obj) {
        boolean z = false;
        switch (this.a) {
            case 1:
                FollowedUsersResponse followedUsersResponse = (FollowedUsersResponse) obj;
                int statusCode = followedUsersResponse.n().getStatusCode();
                if (statusCode < 200 || statusCode > 299) {
                    Single singleError = Single.error(new Throwable(ab80.n("getUsers failed with status code ", " and reason ", statusCode, followedUsersResponse.n().o())));
                    singleError.getClass();
                    return singleError;
                }
                Single singleJust = Single.just(followedUsersResponse.o());
                singleJust.getClass();
                return singleJust;
            case 4:
                return new lu60((kv60) null);
            case 5:
                return Boolean.valueOf(((uut0) obj).a != 1);
            case 7:
                return Integer.valueOf(((eww0) obj).g);
            case 9:
                return ((PlayerError) obj).error();
            case 13:
                return zki0.b;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsOffline.EstimateMusicVideoDownloadSizeResponse.p(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.offline_esperanto.proto.EsOffline.EstimateMusicVideoDownloadSizeResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return ((z310) obj).a;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                PlayerState playerState = (PlayerState) obj;
                ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                String strUri = contextTrack != null ? contextTrack.uri() : null;
                if (strUri == null) {
                    strUri = "";
                }
                return new mmr0(strUri, playerState.playbackId().e(""));
            case 22:
                return Boolean.TRUE;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                PlayerState playerState2 = (PlayerState) obj;
                if (playerState2.isPlaying() && !playerState2.isPaused()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                return (Long) ((spq0) obj).e(0L);
        }
    }

    public void c() {
        a(3);
    }

    public void d() {
        a(6);
    }

    public void e() {
        d();
    }

    public First e0(Object obj) {
        switch (this.a) {
            case 12:
                return First.b((ygg0) obj);
            default:
                s5k0 s5k0Var = (s5k0) obj;
                s5k0Var.getClass();
                s5k0 s5k0VarA = s5k0.a(s5k0Var, (ArrayList) null, aub1.a, 3);
                List list = s5k0Var.a;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((fy00) it.next()).b);
                }
                return First.c(s5k0VarA, Collections.singleton(new x4k0(arrayList)));
        }
    }

    public void f() {
        a(4);
    }

    public void g() {
        a(2);
    }

    public void h() {
        a(5);
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        int i2 = 0;
        switch (this.a) {
            case 2:
                String str3 = (String) linkedHashMap.get("session_id");
                if (str3 == null) {
                    return null;
                }
                return new ja40(str3, str2, str, xkg0Var);
            case 15:
                String str4 = (String) linkedHashMap.get("track_id");
                if (str4 == null || str4.length() != 22) {
                    return null;
                }
                int length = str4.length();
                while (i2 < length) {
                    char cCharAt = str4.charAt(i2);
                    if (('a' > cCharAt || cCharAt >= '{') && (('A' > cCharAt || cCharAt >= '[') && ('0' > cCharAt || cCharAt >= ':'))) {
                        return null;
                    }
                    i2++;
                }
                return new jan0(str4, xkg0Var, str2, str);
            case 26:
                return new vyu0(xkg0Var, str2, str);
            default:
                String str5 = (String) linkedHashMap.get("playlist_id");
                if (str5 == null || str5.length() != 22) {
                    return null;
                }
                int length2 = str5.length();
                while (i2 < length2) {
                    char cCharAt2 = str5.charAt(i2);
                    if (('a' > cCharAt2 || cCharAt2 >= '{') && (('A' > cCharAt2 || cCharAt2 >= '[') && ('0' > cCharAt2 || cCharAt2 >= ':'))) {
                        return null;
                    }
                    i2++;
                }
                return new txu0(str5, xkg0Var, str2, str);
        }
    }

    public void j() {
        a(5);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 16:
                return ((sy21) obj).a.Q0;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return ((PlayerState) obj).track().c();
            default:
                return !((fuc) obj).e;
        }
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return new pdm(true, false, false, true, false, ((Boolean) obj).booleanValue(), false, false, false, false, ((Boolean) obj2).booleanValue(), false, false, 245670);
            case 8:
                return new mmr0((tal) obj, (nq6) obj2);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return o7h.N0((List) obj2, (List) obj);
            default:
                return new n131(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
        }
    }
}
