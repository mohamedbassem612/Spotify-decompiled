package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mm1 extends hab0 implements zu30 {
    public static final mm1 N0;
    public static final mm1 O0;
    public static final mm1 P0;
    public static final mm1 Q0;
    public static final mm1 R0;
    public static final mm1 S0;
    public static final mm1 T0;
    public static final mm1 U0;
    public static final mm1 V0;
    public static final mm1 W0;
    public static final mm1 X;
    public static final mm1 X0;
    public static final mm1 Y;
    public static final mm1 Y0;
    public static final mm1 Z;
    public static final mm1 Z0;
    public static final mm1 a1;
    public static final mm1 b;
    public static final mm1 b1;
    public static final mm1 c;
    public static final mm1 c1;
    public static final mm1 d;
    public static final mm1 d1;
    public static final mm1 e;
    public static final mm1 e1;
    public static final mm1 f;
    public static final mm1 g;
    public static final mm1 h;
    public static final mm1 i;
    public static final mm1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new mm1(i2, (byte) 0);
        c = new mm1(i2, (byte) 1);
        d = new mm1(i2, (byte) 2);
        e = new mm1(i2, (byte) 3);
        f = new mm1(i2, (byte) 4);
        g = new mm1(i2, (byte) 5);
        h = new mm1(i2, (byte) 6);
        i = new mm1(i2, (byte) 7);
        t = new mm1(i2, (byte) 8);
        X = new mm1(i2, (byte) 9);
        Y = new mm1(i2, (byte) 10);
        Z = new mm1(i2, (byte) 11);
        N0 = new mm1(i2, (byte) 12);
        O0 = new mm1(i2, (byte) 13);
        P0 = new mm1(i2, (byte) 14);
        Q0 = new mm1(i2, (byte) 15);
        R0 = new mm1(i2, (byte) 16);
        S0 = new mm1(i2, (byte) 17);
        T0 = new mm1(i2, (byte) 18);
        U0 = new mm1(i2, (byte) 19);
        V0 = new mm1(i2, (byte) 20);
        W0 = new mm1(i2, (byte) 21);
        X0 = new mm1(i2, (byte) 22);
        Y0 = new mm1(i2, (byte) 23);
        Z0 = new mm1(i2, (byte) 24);
        a1 = new mm1(i2, (byte) 25);
        b1 = new mm1(i2, (byte) 26);
        c1 = new mm1(i2, (byte) 27);
        d1 = new mm1(i2, (byte) 28);
        e1 = new mm1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mm1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        char c2;
        String str;
        w7h1 w7h1Var3;
        w7h1 w7h1Var4;
        byte b2 = this.a;
        int i2 = 2;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                ((Number) obj3).intValue();
                return new mml0(new fjl0((r6h1) obj4, (byte) 8));
            case 1:
                mml0 mml0Var = (mml0) obj;
                y6h1 y6h1Var = mml0Var.a;
                fjl0 fjl0Var = mml0Var.b;
                String str2 = ((bm1) obj2).a;
                int iOrdinal = ((xl1) obj4).ordinal();
                if (iOrdinal == 0) {
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("follow", 1, Collections.singletonMap("item_to_be_followed", str2 != null ? str2 : "")), y6h1Var, fjl0Var.b, System.currentTimeMillis());
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("unfollow", 1, Collections.singletonMap("item_to_be_unfollowed", str2 != null ? str2 : "")), y6h1Var, fjl0Var.b, System.currentTimeMillis());
                }
                return w7h1Var;
            case 2:
                yml0 yml0Var = (yml0) obj;
                cm1 cm1Var = (cm1) obj3;
                vl1 vl1Var = (vl1) obj4;
                y6h1 y6h1Var2 = yml0Var.b;
                if (vl1Var instanceof ul1) {
                    x6h1 x6h1VarC = y6h1Var2.c();
                    x6h1VarC.i.add(new a7h1("curated_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), yml0Var.a, System.currentTimeMillis());
                } else {
                    if (!(vl1Var instanceof tl1)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC2 = y6h1Var2.c();
                    x6h1VarC2.i.add(new a7h1("add_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    y6h1 y6h1VarA = x6h1VarC2.a();
                    String str3 = ((tl1) vl1Var).a;
                    String str4 = cm1Var.b;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("add_to_playlist", 2, sqg0.J(new mmr0[]{new mmr0("playlist", str3), new mmr0("item_to_be_added", str4 != null ? str4 : "")})), y6h1VarA, yml0Var.a, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 3:
                yml0 yml0Var2 = (yml0) obj;
                ((Number) obj4).intValue();
                return yml0Var2;
            case 4:
                ((Number) obj3).intValue();
                return new awk0(new ksk0((byte) 1));
            case 5:
                awk0 awk0Var = (awk0) obj;
                rm1 rm1Var = (rm1) obj4;
                if (rm1Var.equals(pm1.a) || rm1Var.equals(om1.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), awk0Var.a, awk0Var.b.b, System.currentTimeMillis());
                }
                if (rm1Var.equals(qm1.a)) {
                    return null;
                }
                eg.o();
                return null;
            case 6:
                ((Number) obj3).intValue();
                return new hol0(new fjl0((r6h1) obj4, (byte) 22));
            case 7:
                hol0 hol0Var = (hol0) obj;
                String str5 = nik1.F1.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5 != null ? str5 : "")), hol0Var.a, hol0Var.b.b, System.currentTimeMillis());
            case 8:
                ((Number) obj3).intValue();
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return new gpk0(yon1.B3().c);
            case 9:
                gpk0 gpk0Var = (gpk0) obj;
                hu1 hu1Var = (iu1) obj4;
                if (!(hu1Var instanceof hu1)) {
                    if (hu1Var.equals(gu1.a)) {
                        return null;
                    }
                    eg.o();
                    return null;
                }
                if (!hu1Var.a.equals(u7c0.a)) {
                    return null;
                }
                x6h1 x6h1VarC3 = gpk0Var.a.c();
                x6h1VarC3.i.add(new a7h1("manage_default_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                y6h1 y6h1VarA2 = x6h1VarC3.a();
                String str6 = nik1.k1.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str6 != null ? str6 : "")), y6h1VarA2, r6h1.c, System.currentTimeMillis());
            case 10:
                ((Number) obj3).intValue();
                AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                return new gpk0(yon1.B3().c);
            case 11:
                gpk0 gpk0Var2 = (gpk0) obj;
                bt1 bt1Var = (bt1) obj4;
                if (!(bt1Var instanceof xs1)) {
                    return null;
                }
                x6h1 x6h1VarC4 = gpk0Var2.a.c();
                x6h1VarC4.i.add(new a7h1("sort_option_sheet", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                y6h1 y6h1VarA3 = x6h1VarC4.a();
                int iOrdinal2 = ((xs1) bt1Var).a.ordinal();
                if (iOrdinal2 == 0) {
                    c2 = 1;
                } else if (iOrdinal2 == 1) {
                    c2 = 2;
                } else if (iOrdinal2 == 2) {
                    c2 = 4;
                } else {
                    if (iOrdinal2 != 3) {
                        eg.o();
                        return null;
                    }
                    c2 = 3;
                }
                x6h1 x6h1VarC5 = y6h1VarA3.c();
                if (c2 == 1) {
                    str = "alphabetical";
                } else if (c2 == 2) {
                    str = "recently_added_rank";
                } else if (c2 == 3) {
                    str = "recently_played_rank";
                } else {
                    if (c2 != 4) {
                        throw null;
                    }
                    str = "recently_updated_rank";
                }
                x6h1VarC5.i.add(new a7h1("sort_option", str, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("sort", 1, b7xVar), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis());
            case 12:
                ((Number) obj3).intValue();
                return new hpk0((r6h1) obj4);
            case 13:
                hpk0 hpk0Var = (hpk0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("add_item_to_queue", 1, Collections.singletonMap("item_to_add_to_queue", ((ky1) obj2).a)), hpk0Var.b, hpk0Var.a, System.currentTimeMillis());
            case 14:
                ((Number) obj3).intValue();
                return new iol0(new fjl0((r6h1) obj4, (byte) 22));
            case 15:
                iol0 iol0Var = (iol0) obj;
                int i3 = ((qt51) obj4).a;
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                String strValueOf = String.valueOf(i3);
                return new w7h1("", "", z7h1Var, new x7h1("add_items_to_queue", 2, Collections.singletonMap("number_of_items_to_add_to_queue", strValueOf != null ? strValueOf : "")), iol0Var.a, iol0Var.b.b, System.currentTimeMillis());
            case 16:
                ((Number) obj3).intValue();
                return new vrl0((r6h1) obj4);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return ((vrl0) obj).e(((qy1) obj2).a);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ((Number) obj3).intValue();
                return yz10.d(0, ((h02) obj).g, "");
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                a02 a02Var = (c02) obj4;
                if (!(a02Var instanceof a02)) {
                    if (a02Var instanceof b02) {
                        b02 b02Var = (b02) a02Var;
                        return yz10.f(0, b02Var.a, b02Var.b);
                    }
                    eg.o();
                    return null;
                }
                a02 a02Var2 = a02Var;
                String str7 = a02Var2.a;
                p60 p60Var = a02Var2.b;
                i20 i20Var = p60Var.k;
                if (i20Var instanceof i20) {
                    return yz10.f(0, str7, i20Var.a);
                }
                if (i20Var.equals(b6j0.b)) {
                    return yz10.f(0, str7, p60Var.e);
                }
                if (!(i20Var instanceof j20)) {
                    eg.o();
                    return null;
                }
                mmr0 mmr0VarG = yz10.g(str7);
                return null;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ((Number) obj3).intValue();
                return new fqk0();
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                kb2 kb2Var = (kb2) obj2;
                y6h1 y6h1Var3 = ((fqk0) obj).a;
                int iOrdinal3 = ((jb2) obj4).ordinal();
                if (iOrdinal3 == 0) {
                    x6h1 x6h1VarC6 = y6h1Var3.c();
                    x6h1VarC6.i.add(new a7h1("verify_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", kb2Var.a.a)), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
                } else if (iOrdinal3 == 1) {
                    x6h1 x6h1VarC7 = y6h1Var3.c();
                    x6h1VarC7.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (iOrdinal3 != 2) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC8 = y6h1Var3.c();
                    x6h1VarC8.i.add(new a7h1("read_more", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", "https://support.spotify.com/article/age-restricted-content-age-check/")), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 22:
                swl0 swl0Var = (swl0) obj;
                sd2 sd2Var = (sd2) obj4;
                if (sd2Var instanceof rd2) {
                    vb2.a.getClass();
                    return swl0Var.a(ub2.b);
                }
                if (sd2Var instanceof qd2) {
                    return null;
                }
                eg.o();
                return null;
            case 23:
                kzl0 kzl0Var = (kzl0) obj;
                vb2.a.getClass();
                String str8 = ub2.b;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str8 != null ? str8 : "")), kzl0Var.a, r6h1.c, System.currentTimeMillis());
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ((Number) obj3).intValue();
                int iOrdinal4 = ((gf2) obj).a.ordinal();
                if (iOrdinal4 == 0) {
                    i2 = 1;
                } else if (iOrdinal4 != 1) {
                    eg.o();
                    return null;
                }
                return new eqk0(i2);
            case 25:
                ff2 ff2Var = (ff2) obj4;
                y6h1 y6h1Var4 = ((eqk0) obj).a;
                if (ff2Var.equals(df2.a)) {
                    x6h1 x6h1VarC9 = y6h1Var4.c();
                    x6h1VarC9.i.add(new a7h1("get_parental_consent_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:age-assurance:request-parental-consent")), x6h1VarC9.a(), r6h1.c, System.currentTimeMillis());
                } else if (ff2Var.equals(cf2.a)) {
                    x6h1 x6h1VarC10 = y6h1Var4.c();
                    x6h1VarC10.i.add(new a7h1("confirm_id_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", "https://age-assurance.spotify.com/collect/start")), x6h1VarC10.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!ff2Var.equals(ef2.a)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC11 = y6h1Var4.c();
                    x6h1VarC11.i.add(new a7h1("logout_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC11.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("logout", 1, b7xVar), x6h1VarC11.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var4;
            case 26:
                r6h1 r6h1Var = (r6h1) obj4;
                Integer numValueOf = Integer.valueOf(((Number) obj3).intValue());
                String str9 = ((pw2) obj).b;
                return new hqk0(numValueOf, str9 != null ? str9 : "", r6h1Var);
            case 27:
                hqk0 hqk0Var = (hqk0) obj;
                lw2 lw2Var = (mw2) obj4;
                if (lw2Var instanceof lw2) {
                    return hqk0Var.a(lw2Var.a);
                }
                if (lw2Var instanceof kw2) {
                    return hqk0Var.a(((kw2) lw2Var).a);
                }
                eg.o();
                return null;
            case 28:
                ((Number) obj3).intValue();
                r6h1 r6h1Var2 = (r6h1) obj4;
                String str10 = ((g43) obj).b;
                y6h1 y6h1Var5 = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-watch-feed-pivots";
                x6h1VarI.f = "1.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.d = str10;
                y6h1 y6h1VarA4 = x6h1VarI.a();
                Collections.singletonList("watchfeedpivots");
                r6h1 r6h1Var3 = r6h1.c;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var2.a);
                arrayList.add(y6h1VarA4);
                return new s3m0(str10, new r6h1(arrayList, r6h1Var2.b));
            default:
                s3m0 s3m0Var = (s3m0) obj;
                e43 e43Var = (f43) obj4;
                if (e43Var instanceof e43) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", e43Var.a)), s3m0Var.b, s3m0Var.a, System.currentTimeMillis());
                }
                return null;
        }
    }
}
