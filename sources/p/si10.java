package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.familygatedcontent.v1.RequestFeatureResponse;
import com.spotify.kidsgraduation.v1.PendingGraduationResponse;
import com.spotify.kidsgraduation.v1.Profile;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class si10 implements Function, eq20, Init, Predicate, s2i1, Producer {
    public final /* synthetic */ byte a;
    public static final si10 b = new si10(0);
    public static final si10 c = new si10(1);
    public static final si10 d = new si10(2);
    public static final si10 e = new si10(3);
    public static final si10 f = new si10(4);
    public static final si10 g = new si10(5);
    public static final si10 h = new si10(6);
    public static final si10 i = new si10(7);
    public static final si10 t = new si10(8);
    public static final si10 X = new si10(9);
    public static final si10 Y = new si10(10);
    public static final si10 Z = new si10(11);
    public static final si10 N0 = new si10(12);
    public static final si10 O0 = new si10(13);
    public static final si10 P0 = new si10(14);
    public static final si10 Q0 = new si10(15);
    public static final si10 R0 = new si10(16);
    public static final si10 S0 = new si10(17);
    public static final si10 T0 = new si10(18);
    public static final si10 U0 = new si10(19);
    public static final si10 V0 = new si10(20);
    public static final si10 W0 = new si10(21);
    public static final si10 X0 = new si10(22);
    public static final si10 Y0 = new si10(23);
    public static final si10 Z0 = new si10(24);
    public static final si10 a1 = new si10(25);
    public static final si10 b1 = new si10(26);
    public static final si10 c1 = new si10(27);
    public static final si10 d1 = new si10(28);
    public static final si10 e1 = new si10(29);

    public /* synthetic */ si10(byte b2) {
        this.a = b2;
    }

    public Object apply(Object obj) {
        z = false;
        boolean z = false;
        switch (this.a) {
            case 0:
                return ((RequestFeatureResponse) obj).n();
            case 1:
            case 3:
            case 5:
            case 9:
            case 12:
            case 13:
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
            case 22:
            default:
                String str = (String) ((Map) obj).get("allow-kids-account-selection");
                return str == null ? "false" : str;
            case 2:
                return Boolean.valueOf(yto.j((String) obj));
            case 4:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Object[]) obj) {
                    if (obj2 instanceof rg60) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((rg60) it.next()).a);
                }
                return arrayList2;
            case 6:
                return new e4a0((Set) obj);
            case 7:
                PendingGraduationResponse pendingGraduationResponse = (PendingGraduationResponse) obj;
                Profile profileP = pendingGraduationResponse.p();
                return new bgs0(new dww0(profileP.getName(), profileP.hasImageUri() ? profileP.o() : null), pendingGraduationResponse.getMinGraduationAge(), pendingGraduationResponse.o(), (pendingGraduationResponse.q() && pendingGraduationResponse.n().p()) ? new fct0(pendingGraduationResponse.n().o().o()) : ect0.a);
            case 8:
                return new x7c0(kf90.a, (Boolean) obj);
            case 10:
                return Double.valueOf(((k0u) ((spq0) obj).b()).a);
            case 11:
                return new naf0(((Boolean) obj).booleanValue());
            case 14:
                return l4o1.b0((ContextTrack) obj);
            case 15:
                return Boolean.valueOf(((Restrictions) obj).disallowSeekingReasons().isEmpty());
            case 16:
                return ((jno0) obj).a;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return (ContextTrack) ((spq0) obj).b();
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new okp0((List) obj);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                Logger.e((Throwable) obj, "Failed observing offline state", new Object[0]);
                return Boolean.FALSE;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return pnq0.c;
            case 23:
                return Boolean.valueOf(((feh) obj) instanceof ceh);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return (ContextTrack) ((PlayerState) obj).track().b();
            case 25:
                PlayerState playerState = (PlayerState) obj;
                if (playerState.isPlaying() && !playerState.isPaused()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 26:
                return ((PlayerState) obj).contextUri();
        }
    }

    public a8b0 c(rgy0 rgy0Var, String str, qx81 qx81Var, qx81 qx81Var2) {
        throw new IllegalArgumentException("This method should not be used.");
    }

    public First e0(Object obj) {
        return First.b((s950) obj);
    }

    public Object get() {
        WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
        return new ImmediateWorkRunner();
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        String str3;
        String str4;
        switch (this.a) {
            case 9:
                String str5 = (String) linkedHashMap.get("dialog_type");
                if (str5 == null) {
                    return null;
                }
                return new avd0(str5, xkg0Var, str2, str);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                String str6 = (String) linkedHashMap.get("child_id");
                if (str6 == null) {
                    return null;
                }
                return new gwr0(str6, str2, str, xkg0Var);
            case 22:
                String str7 = (String) linkedHashMap.get("preset_id");
                if (str7 == null) {
                    return null;
                }
                return new nss0(str7, str2, str, xkg0Var);
            default:
                String str8 = (String) linkedHashMap.get("user_name");
                if (str8 == null || (str3 = (String) linkedHashMap.get("playlist_id")) == null || !gho1.n(str3) || (str4 = (String) linkedHashMap.get("track_id")) == null || !gho1.n(str4)) {
                    return null;
                }
                return new zyu0(str8, str3, str4, str2, str, xkg0Var);
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 5:
                return ((th61) obj).b;
            case 12:
                return voo1.p((th61) obj);
            default:
                return ((spq0) obj).c();
        }
    }
}
