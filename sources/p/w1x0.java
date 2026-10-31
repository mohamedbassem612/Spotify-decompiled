package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.ContextTrack;
import com.spotify.signup.signup.v2.proto.CompleteAccountCreationResponse;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w1x0 implements Function, Predicate, BiFunction, b1h1, yn00, v0i, bu11 {
    public final /* synthetic */ byte a;
    public static final w1x0 b = new w1x0(0);
    public static final w1x0 c = new w1x0(1);
    public static final w1x0 d = new w1x0(2);
    public static final w1x0 e = new w1x0(3);
    public static final w1x0 f = new w1x0(4);
    public static final w1x0 g = new w1x0(5);
    public static final w1x0 h = new w1x0(6);
    public static final w1x0 i = new w1x0(7);
    public static final w1x0 t = new w1x0(8);
    public static final f341 X = new f341((byte) 7);
    public static final f341 Y = new f341((byte) 8);
    public static final f341 Z = new f341((byte) 9);
    public static final f341 N0 = new f341((byte) 10);
    public static final f341 O0 = new f341((byte) 11);
    public static final w1x0 P0 = new w1x0(10);
    public static final w1x0 Q0 = new w1x0(11);
    public static final w1x0 R0 = new w1x0(12);
    public static final w1x0 S0 = new w1x0(13);
    public static final w1x0 T0 = new w1x0(14);
    public static final w1x0 U0 = new w1x0(15);
    public static final w1x0 V0 = new w1x0(16);
    public static final w1x0 W0 = new w1x0(17);
    public static final w1x0 X0 = new w1x0(18);
    public static final w1x0 Y0 = new w1x0(19);
    public static final w1x0 Z0 = new w1x0(20);
    public static final w1x0 a1 = new w1x0(21);
    public static final w1x0 b1 = new w1x0(22);
    public static final w1x0 c1 = new w1x0(23);
    public static final w1x0 d1 = new w1x0(24);
    public static final /* synthetic */ w1x0 e1 = new w1x0(25);
    public static final w1x0 f1 = new w1x0(26);
    public static final w1x0 g1 = new w1x0(27);

    public /* synthetic */ w1x0(byte b2) {
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ac  */
    public Object apply(Object obj) {
        boolean z;
        switch (this.a) {
            case 0:
                return o2x0.a;
            case 1:
            case 2:
            case 6:
            case 7:
            case 9:
            case 10:
            case 15:
            case 16:
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
            default:
                return new q1l1(new m231(new RuntimeException("Failure received during IDT exchange.")));
            case 3:
                int iOrdinal = ((g301) obj).ordinal();
                if (iOrdinal == 0) {
                    return l301.a;
                }
                if (iOrdinal == 1) {
                    return t301.a;
                }
                eg.o();
                return null;
            case 4:
                List<tv00> listB = ((uv00) obj).b(z1g1.class);
                int iS = zno1.s(q7h.U(listB, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (tv00 tv00Var : listB) {
                    String str = tv00Var.a;
                    z1g1 z1g1Var = tv00Var.b;
                    String str2 = z1g1Var != null ? z1g1Var.e : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    linkedHashMap.put(str, str2);
                }
                return linkedHashMap;
            case 5:
                String strA0 = l4o1.a0((ContextTrack) obj, "album_uri");
                return strA0 == null ? "" : strA0;
            case 8:
                return e2l1.a;
            case 11:
                nf81 nf81Var = (nf81) obj;
                spq0 spq0Var = nf81Var.c;
                u3u0 u3u0Var = (u3u0) spq0Var.h();
                if ((u3u0Var != null ? u3u0Var.a : null) != null) {
                    u3u0 u3u0Var2 = (u3u0) spq0Var.h();
                    z = (u3u0Var2 != null ? u3u0Var2.b : null) != null;
                }
                return new xd41(z ? ((u3u0) spq0Var.b()).a : (Boolean) nf81Var.a.h(), z ? ((u3u0) spq0Var.b()).b : (Boolean) nf81Var.b.h());
            case 12:
                return new on81((CompleteAccountCreationResponse) obj);
            case 13:
                return new wi91((nl91) obj);
            case 14:
                return new txe0((w341) obj);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                n57.g("Unexpected error monitoring downloads", (Throwable) obj);
                return Boolean.FALSE;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                dkf1 dkf1Var = (dkf1) obj;
                return Flowable.H(dkf1Var, new dkf1(dkf1Var.a, dkf1Var.b, false));
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                Logger.e((Throwable) obj, "Failed to lookup track when trying to navigate to an album.", new Object[0]);
                Set set = s4b1.f;
                return Single.just(uic.x("spotify:home"));
            case 22:
                y1k1 y1k1Var = (y1k1) ((Optional) obj).orElse(null);
                uvj1 uvj1VarX = y1k1Var != null ? l4p1.x(y1k1Var) : null;
                return (uvj1VarX == null ? -1 : vvj1.a[uvj1VarX.ordinal()]) == -1 ? wvj1.a : new yvj1(uvj1VarX, y1k1Var);
        }
    }

    public y0h1 b(ac11 ac11Var) {
        return null;
    }

    public xu30 d() {
        return o40.U0;
    }

    public h3h1 e(String str) {
        return null;
    }

    public h3h1 f(String str) {
        return null;
    }

    public w7h1 g(n8h1 n8h1Var, unb1 unb1Var, String str) {
        return ((nyk0) n8h1Var).h(str);
    }

    public h3h1 h(String str) {
        return null;
    }

    public h3h1 j(String str) {
        return null;
    }

    public h3h1 k(String str) {
        return null;
    }

    public Object m(dxy dxyVar) {
        return new drm0(dxyVar.c(lzy0.a(crm0.class)));
    }

    public w7h1 n(n8h1 n8h1Var, unb1 unb1Var, String str) {
        return ((nyk0) n8h1Var).j(str);
    }

    public w7h1 o(n8h1 n8h1Var, String str) {
        return ((nyk0) n8h1Var).h(str);
    }

    public w7h1 p(n8h1 n8h1Var, String str) {
        return ((nyk0) n8h1Var).g();
    }

    public h3h1 q() {
        return null;
    }

    public ao00 r(UUID uuid) {
        return h9v.a();
    }

    public w7h1 s(n8h1 n8h1Var, unb1 unb1Var, String str) {
        return ((nyk0) n8h1Var).g();
    }

    public h3h1 t(String str) {
        return null;
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 1:
                return ((Boolean) obj).booleanValue();
            case 2:
                return !((uv00) obj).f;
            case 6:
                return ((th61) obj).b;
            default:
                return ((cma1) obj).b == 1;
        }
    }

    public Object apply(Object obj, Object obj2) {
        zcs0 zcs0Var;
        yg8 yg8Var;
        boolean z;
        km kmVar;
        String str;
        String str2;
        boolean z2 = true;
        switch (this.a) {
            case 7:
                ll8 ll8Var = (nl8) obj;
                Boolean bool = (Boolean) obj2;
                boolean z3 = !ll8Var.a();
                zcs0 zcs0Var2 = new zcs0((String) null);
                String str3 = "";
                km kmVar2 = new km("", "");
                if (ll8Var instanceof ll8) {
                    ll8 ll8Var2 = ll8Var;
                    Map map = ll8Var2.a;
                    String str4 = (String) map.get("payment-state");
                    if (str4 != null) {
                        zcs0Var2 = new zcs0(str4);
                    }
                    String str5 = (String) map.get("type");
                    if (str5 == null) {
                        str5 = "";
                    }
                    String str6 = (String) map.get("streaming");
                    boolean z4 = str6 != null ? Boolean.parseBoolean(str6) : false;
                    str = (String) map.get("country_code");
                    if (str == null) {
                        str = "";
                    }
                    String str7 = ll8Var2.b;
                    String str8 = (String) map.get("account-id");
                    zcs0Var = zcs0Var2;
                    str3 = str7;
                    z = z4;
                    str2 = str5;
                    kmVar = new km(str7, str8 != null ? str8 : "");
                    yg8Var = null;
                } else {
                    zcs0Var = zcs0Var2;
                    yg8Var = ll8Var instanceof ml8 ? ((ml8) ll8Var).a : null;
                    z = false;
                    kmVar = kmVar2;
                    str = "";
                    str2 = str;
                }
                return new th61(str3, z3, yg8Var, str, bool.booleanValue(), z, zcs0Var, str2, kmVar, 28);
            case 15:
                return (Integer) obj2;
            case 16:
                return new mmr0((Boolean) obj, (ub10) obj2);
            default:
                Boolean bool2 = (Boolean) obj2;
                if (!((Boolean) obj).booleanValue() && !bool2.booleanValue()) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
        }
    }
}
