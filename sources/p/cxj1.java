package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cxj1 extends hab0 implements zu30 {
    public static final cxj1 N0;
    public static final cxj1 O0;
    public static final cxj1 P0;
    public static final cxj1 Q0;
    public static final cxj1 R0;
    public static final cxj1 S0;
    public static final cxj1 T0;
    public static final cxj1 U0;
    public static final cxj1 V0;
    public static final cxj1 W0;
    public static final cxj1 X;
    public static final cxj1 X0;
    public static final cxj1 Y;
    public static final cxj1 Y0;
    public static final cxj1 Z;
    public static final cxj1 Z0;
    public static final cxj1 a1;
    public static final cxj1 b;
    public static final cxj1 b1;
    public static final cxj1 c;
    public static final cxj1 c1;
    public static final cxj1 d;
    public static final cxj1 d1;
    public static final cxj1 e;
    public static final cxj1 e1;
    public static final cxj1 f;
    public static final cxj1 g;
    public static final cxj1 h;
    public static final cxj1 i;
    public static final cxj1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new cxj1(i2, (byte) 0);
        c = new cxj1(i2, (byte) 1);
        d = new cxj1(i2, (byte) 2);
        e = new cxj1(i2, (byte) 3);
        f = new cxj1(i2, (byte) 4);
        g = new cxj1(i2, (byte) 5);
        h = new cxj1(i2, (byte) 6);
        i = new cxj1(i2, (byte) 7);
        t = new cxj1(i2, (byte) 8);
        X = new cxj1(i2, (byte) 9);
        Y = new cxj1(i2, (byte) 10);
        Z = new cxj1(i2, (byte) 11);
        N0 = new cxj1(i2, (byte) 12);
        O0 = new cxj1(i2, (byte) 13);
        P0 = new cxj1(i2, (byte) 14);
        Q0 = new cxj1(i2, (byte) 15);
        R0 = new cxj1(i2, (byte) 16);
        S0 = new cxj1(i2, (byte) 17);
        T0 = new cxj1(i2, (byte) 18);
        U0 = new cxj1(i2, (byte) 19);
        V0 = new cxj1(i2, (byte) 20);
        W0 = new cxj1(i2, (byte) 21);
        X0 = new cxj1(i2, (byte) 22);
        Y0 = new cxj1(i2, (byte) 23);
        Z0 = new cxj1(i2, (byte) 24);
        a1 = new cxj1(i2, (byte) 25);
        b1 = new cxj1(i2, (byte) 26);
        c1 = new cxj1(i2, (byte) 27);
        d1 = new cxj1(i2, (byte) 28);
        e1 = new cxj1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cxj1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        w7h1 w7h1Var3 = null;
        switch (b2) {
            case 0:
                return null;
            case 1:
                ((Number) obj3).intValue();
                return new whl0((r6h1) obj4);
            case 2:
                whl0 whl0Var = (whl0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), whl0Var.b, whl0Var.a, System.currentTimeMillis());
            case 3:
                ((Number) obj3).intValue();
                return new o7l0();
            case 4:
                ((Number) obj3).intValue();
                return new ehl0((r6h1) obj4);
            case 5:
                ehl0 ehl0Var = (ehl0) obj;
                String str = nik1.L6.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), ehl0Var.b, ehl0Var.a, System.currentTimeMillis());
            case 6:
                kvl0 kvl0Var = (kvl0) obj;
                y6k1 y6k1Var = (y6k1) obj2;
                if (((x6k1) obj4).equals(x6k1.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", l1d.m("spotify:search:", y6k1Var.a))), kvl0Var.a, r6h1.c, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 7:
                ((Number) obj3).intValue();
                return new yql0(8, (r6h1) obj4);
            case 8:
                yql0 yql0Var = (yql0) obj;
                if (((bak1) obj4).equals(bak1.a)) {
                    return yql0Var.a("spotify:internal:bluejay:error");
                }
                eg.o();
                return null;
            case 9:
                ((Number) obj3).intValue();
                return new yql0(8, (r6h1) obj4);
            case 10:
                yql0 yql0Var2 = (yql0) obj;
                if (((iak1) obj4).equals(iak1.a)) {
                    return yql0Var2.a("spotify:internal:magpie:error");
                }
                eg.o();
                return null;
            case 11:
                ((Number) obj3).intValue();
                return new irl0((r6h1) obj4);
            case 12:
                ((Number) obj3).intValue();
                return new g3m0((r6h1) obj4);
            case 13:
                g3m0 g3m0Var = (g3m0) obj;
                cnk1 cnk1Var = (cnk1) obj4;
                r6h1 r6h1Var = g3m0Var.a;
                y6h1 y6h1Var = g3m0Var.b;
                if (cnk1Var instanceof ymk1) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("delete_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("discard_changes", 1, b7xVar), x6h1VarC.a(), r6h1Var, System.currentTimeMillis());
                } else if (cnk1Var instanceof ank1) {
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("submit_voice_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("send_message", 1, b7xVar), x6h1VarC2.a(), r6h1Var, System.currentTimeMillis());
                } else {
                    if (!(cnk1Var instanceof bnk1)) {
                        if ((cnk1Var instanceof vmk1) || (cnk1Var instanceof xmk1) || (cnk1Var instanceof wmk1) || (cnk1Var instanceof zmk1)) {
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC3 = y6h1Var.c();
                    x6h1VarC3.i.add(new a7h1("respond_with_voice_toggle", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_element_toggle", 1, b7xVar), x6h1VarC3.a(), r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var;
            case 14:
                ((Number) obj3).intValue();
                return new yql0(9, (r6h1) obj4);
            case 15:
                yql0 yql0Var3 = (yql0) obj;
                if (((wpk1) obj4).equals(wpk1.a)) {
                    return yql0Var3.a("spotify:internal:bluejay:update-voice");
                }
                eg.o();
                return null;
            case 16:
                bdl0 bdl0Var = (bdl0) obj;
                dvk1 dvk1Var = (dvk1) obj2;
                qyk1 qyk1Var = (syk1) obj3;
                if (!((yuk1) obj4).equals(uuk1.a) || dvk1Var.c) {
                    return null;
                }
                qyk1 qyk1Var2 = qyk1Var instanceof qyk1 ? qyk1Var : null;
                if ((qyk1Var2 != null ? qyk1Var2.f : 0) == 1) {
                    return null;
                }
                x6h1 x6h1VarC4 = bdl0Var.b.c();
                x6h1VarC4.i.add(new a7h1("upsell_button", (String) null, (Integer) null, "spotify:upsell:premium_in_app_destination?displayReason=kpop_upsell:listening_parties", (String) null));
                x6h1VarC4.j = true;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:upsell:premium_in_app_destination?displayReason=kpop_upsell:listening_parties")), x6h1VarC4.a(), bdl0Var.a, System.currentTimeMillis());
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ((Number) obj3).intValue();
                return ((bvk1) obj).a;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ((Number) obj3).intValue();
                return new i3m0(new j3m0((r6h1) obj4), ((uwk1) obj).d);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                i3m0 i3m0Var = (i3m0) obj;
                uwk1 uwk1Var = (uwk1) obj2;
                if (((twk1) obj4).equals(twk1.a)) {
                    String str2 = uwk1Var.c;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), i3m0Var.a, i3m0Var.b.a, System.currentTimeMillis());
                } else {
                    eg.o();
                }
                return w7h1Var3;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ((Number) obj3).intValue();
                return new l3m0(new brl0((byte) 22), ((kxk1) obj).a);
            case 22:
                if (obj4 != null) {
                    bhn0.d();
                }
                return null;
            case 23:
                r5l1 r5l1Var = (r5l1) obj2;
                ((Number) obj3).intValue();
                r6h1 r6h1Var2 = (r6h1) obj4;
                if (r5l1Var instanceof q5l1) {
                    return new m3m0(((q5l1) r5l1Var).a, r6h1Var2);
                }
                if (r5l1Var.equals(p5l1.a)) {
                    return new z8s((byte) 8);
                }
                eg.o();
                return null;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                m3m0 m3m0Var = (n8h1) obj;
                r5l1 r5l1Var2 = (r5l1) obj3;
                if (!(((n5l1) obj4) instanceof n5l1)) {
                    eg.o();
                    return null;
                }
                if (r5l1Var2 instanceof q5l1) {
                    return m3m0Var.a(((q5l1) r5l1Var2).a);
                }
                return null;
            case 25:
                n3m0 n3m0Var = (n3m0) obj;
                k7l1 k7l1Var = (k7l1) obj3;
                if (((i7l1) obj4).equals(i7l1.a)) {
                    return n3m0Var.a(k7l1Var.d);
                }
                eg.o();
                return null;
            case 26:
                if (obj4 != null) {
                    bhn0.d();
                }
                return null;
            case 27:
                ((Number) obj3).intValue();
                return new t3m0();
            case 28:
                lhb1 lhb1Var = (lhb1) obj4;
                y6h1 y6h1Var2 = ((t3m0) obj).a;
                if (lhb1Var.equals(jhb1.a)) {
                    x6h1 x6h1VarC5 = y6h1Var2.c();
                    x6h1VarC5.i.add(new a7h1("explore_premium_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    y6h1 y6h1VarA = x6h1VarC5.a();
                    String str3 = ahl1.h;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3 != null ? str3 : "")), y6h1VarA, r6h1.c, System.currentTimeMillis());
                } else {
                    if (!lhb1Var.equals(khb1.a)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC6 = y6h1Var2.c();
                    x6h1VarC6.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var2;
            default:
                ((Number) obj3).intValue();
                return new u3m0((r6h1) obj4);
        }
    }
}
