package p;

import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class njs extends hab0 implements zu30 {
    public static final njs N0;
    public static final njs O0;
    public static final njs P0;
    public static final njs Q0;
    public static final njs R0;
    public static final njs S0;
    public static final njs T0;
    public static final njs U0;
    public static final njs V0;
    public static final njs W0;
    public static final njs X;
    public static final njs X0;
    public static final njs Y;
    public static final njs Y0;
    public static final njs Z;
    public static final njs Z0;
    public static final njs a1;
    public static final njs b;
    public static final njs b1;
    public static final njs c;
    public static final njs c1;
    public static final njs d;
    public static final njs d1;
    public static final njs e;
    public static final njs e1;
    public static final njs f;
    public static final njs g;
    public static final njs h;
    public static final njs i;
    public static final njs t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new njs(i2, (byte) 0);
        c = new njs(i2, (byte) 1);
        d = new njs(i2, (byte) 2);
        e = new njs(i2, (byte) 3);
        f = new njs(i2, (byte) 4);
        g = new njs(i2, (byte) 5);
        h = new njs(i2, (byte) 6);
        i = new njs(i2, (byte) 7);
        t = new njs(i2, (byte) 8);
        X = new njs(i2, (byte) 9);
        Y = new njs(i2, (byte) 10);
        Z = new njs(i2, (byte) 11);
        N0 = new njs(i2, (byte) 12);
        O0 = new njs(i2, (byte) 13);
        P0 = new njs(i2, (byte) 14);
        Q0 = new njs(i2, (byte) 15);
        R0 = new njs(i2, (byte) 16);
        S0 = new njs(i2, (byte) 17);
        T0 = new njs(i2, (byte) 18);
        U0 = new njs(i2, (byte) 19);
        V0 = new njs(i2, (byte) 20);
        W0 = new njs(i2, (byte) 21);
        X0 = new njs(i2, (byte) 22);
        Y0 = new njs(i2, (byte) 23);
        Z0 = new njs(i2, (byte) 24);
        a1 = new njs(i2, (byte) 25);
        b1 = new njs(i2, (byte) 26);
        c1 = new njs(i2, (byte) 27);
        d1 = new njs(i2, (byte) 28);
        e1 = new njs(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ njs(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        w7h1 w7h1Var4;
        w7h1 w7h1Var5;
        w7h1 w7h1Var6;
        byte b2 = this.a;
        int i2 = 2;
        b7x b7xVar = b7x.a;
        w7h1 w7h1Var7 = null;
        switch (b2) {
            case 0:
                ((Number) obj3).intValue();
                return new e5m0((r6h1) obj4);
            case 1:
                e5m0 e5m0Var = (e5m0) obj;
                nc21 nc21Var = (nc21) obj2;
                mc21 mc21Var = (mc21) obj4;
                r6h1 r6h1Var = e5m0Var.a;
                y6h1 y6h1Var = e5m0Var.b;
                if (mc21Var instanceof jc21) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), r6h1Var, System.currentTimeMillis());
                } else if (mc21Var instanceof lc21) {
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("save_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    y6h1 y6h1VarA = x6h1VarC2.a();
                    String str = nc21Var.a;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("rename_folder", 1, Collections.singletonMap("uri", str != null ? str : "")), y6h1VarA, r6h1Var, System.currentTimeMillis());
                } else {
                    if (!(mc21Var instanceof kc21)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC3 = y6h1Var.c();
                    x6h1VarC3.i.add(new a7h1("name_field", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("text_edit", 1, Collections.singletonMap("field_to_be_changed", ((kc21) mc21Var).a)), x6h1VarC3.a(), r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var;
            case 2:
                ge21 ge21Var = (ge21) obj;
                ((Number) obj3).intValue();
                return new g5m0(1, Integer.valueOf(ge21Var.b), ge21Var.a.a.getId(), (r6h1) obj4);
            case 3:
                g5m0 g5m0Var = (g5m0) obj;
                if (qjs.a[((fe21) obj4).ordinal()] == 1) {
                    return g5m0Var.h();
                }
                eg.o();
                return null;
            case 4:
                ((Number) obj3).intValue();
                return new zqk0((r6h1) obj4);
            case 5:
                zqk0 zqk0Var = (zqk0) obj;
                r6h1 r6h1Var2 = zqk0Var.a;
                y6h1 y6h1Var2 = zqk0Var.b;
                String str2 = ((ils) obj2).a;
                int iOrdinal = ((hls) obj4).ordinal();
                if (iOrdinal == 0) {
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", str2 != null ? str2 : "")), y6h1Var2, r6h1Var2, System.currentTimeMillis());
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_like", 1, Collections.singletonMap("item_no_longer_liked", str2 != null ? str2 : "")), y6h1Var2, r6h1Var2, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 6:
                ((Number) obj3).intValue();
                r6h1 r6h1Var3 = (r6h1) obj4;
                int iOrdinal2 = ((ems) obj).a.ordinal();
                if (iOrdinal2 == 0) {
                    i2 = 3;
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        eg.o();
                        return null;
                    }
                    i2 = 1;
                }
                return new ywl0(i2, r6h1Var3);
            case 7:
                ywl0 ywl0Var = (ywl0) obj;
                dms dmsVar = (dms) obj4;
                r6h1 r6h1Var4 = ywl0Var.a;
                y6h1 y6h1Var3 = ywl0Var.b;
                if (dmsVar instanceof cms) {
                    x6h1 x6h1VarC4 = y6h1Var3.c();
                    x6h1VarC4.i.add(new a7h1("update_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC4.a(), r6h1Var4, System.currentTimeMillis());
                } else {
                    if (!(dmsVar instanceof bms)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC5 = y6h1Var3.c();
                    x6h1VarC5.i.add(new a7h1("see_all_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = true;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC5.a(), r6h1Var4, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 8:
                ((Number) obj3).intValue();
                return new axl0((r6h1) obj4);
            case 9:
                return null;
            case 10:
                ((Number) obj3).intValue();
                return new r5m0((r6h1) obj4);
            case 11:
                r5m0 r5m0Var = (r5m0) obj;
                d451 d451Var = (d451) obj4;
                r6h1 r6h1Var5 = r5m0Var.a;
                y6h1 y6h1Var4 = r5m0Var.b;
                if (d451Var.equals(a451.a)) {
                    x6h1 x6h1VarC6 = y6h1Var4.c();
                    x6h1VarC6.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC6.a(), r6h1Var5, System.currentTimeMillis());
                } else if (d451Var.equals(b451.a)) {
                    x6h1 x6h1VarC7 = y6h1Var4.c();
                    x6h1VarC7.i.add(new a7h1("text_filter_clear_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("text_clear", 1, b7xVar), x6h1VarC7.a(), r6h1Var5, System.currentTimeMillis());
                } else {
                    if (!(d451Var instanceof c451)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC8 = y6h1Var4.c();
                    x6h1VarC8.i.add(new a7h1("input_field", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC8.a();
                    String str3 = ((c451) d451Var).a;
                    w7h1Var4 = new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("change_search_query", 1, Collections.singletonMap("search_query_string", str3 != null ? str3 : "")), y6h1VarA2, r6h1Var5, System.currentTimeMillis());
                }
                return w7h1Var4;
            case 12:
                tw81 tw81Var = (tw81) obj;
                ((Number) obj3).intValue();
                kyk0 kyk0Var = new kyk0(tw81Var.b.a, (r6h1) obj4);
                s6l s6lVar = tw81Var.a;
                return new jyk0(kyk0Var, s6lVar.d, s6lVar.e, s6lVar.f);
            case 13:
                jyk0 jyk0Var = (jyk0) obj;
                tw81 tw81Var2 = (tw81) obj2;
                sw81 sw81Var = (sw81) obj4;
                if (sw81Var.equals(qw81.a)) {
                    return (w7h1) tw81Var2.a.c.b.invoke(jyk0Var);
                }
                if (sw81Var.equals(rw81.a)) {
                    return new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), jyk0Var.a, jyk0Var.b.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 14:
                int iIntValue = ((Number) obj3).intValue();
                brl0 brl0Var = new brl0((byte) 7);
                int iOrdinal3 = ((t591) obj).a.ordinal();
                if (iOrdinal3 == 0) {
                    i2 = 1;
                } else if (iOrdinal3 != 1) {
                    eg.o();
                    return null;
                }
                return new a0m0(brl0Var, i2, Integer.valueOf(iIntValue));
            case 15:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), ((a0m0) obj).a, r6h1.c, System.currentTimeMillis());
            case 16:
                ((Number) obj3).intValue();
                return new axk0((r6h1) obj4);
            case 17:
                axk0 axk0Var = (axk0) obj;
                qw91 qw91Var = (qw91) obj2;
                if (crs.a[((pw91) obj4).ordinal()] == 1) {
                    String str4 = qw91Var.a;
                    w7h1Var7 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_hide_entity", 1, Collections.singletonMap("entity_to_remove_hide", str4 != null ? str4 : "")), axk0Var.b, axk0Var.a, System.currentTimeMillis());
                } else {
                    eg.o();
                }
                return w7h1Var7;
            case 18:
                ((Number) obj3).intValue();
                return new bxk0((r6h1) obj4);
            case 19:
                bxk0 bxk0Var = (bxk0) obj;
                bx91 bx91Var = (bx91) obj2;
                if (krs.a[((ax91) obj4).ordinal()] == 1) {
                    String str5 = bx91Var.a;
                    w7h1Var7 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("exclude_from_recommendations", 1, Collections.singletonMap("context_to_be_excluded", str5 != null ? str5 : "")), bxk0Var.b, bxk0Var.a, System.currentTimeMillis());
                } else {
                    eg.o();
                }
                return w7h1Var7;
            case 20:
                ((Number) obj3).intValue();
                return new s5m0(new t5m0((r6h1) obj4), ((gia1) obj).b.name());
            case 21:
                s5m0 s5m0Var = (s5m0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("sort", 1, b7xVar), s5m0Var.a, s5m0Var.b.a, System.currentTimeMillis());
            case 22:
                ((Number) obj3).intValue();
                return new t5m0((r6h1) obj4);
            case 23:
                return null;
            case 24:
                zia1 zia1Var = (zia1) obj;
                ((Number) obj3).intValue();
                return new d5m0(zia1Var.a.a, zia1Var.b.a().a, (r6h1) obj4);
            case 25:
                d5m0 d5m0Var = (d5m0) obj;
                zia1 zia1Var2 = (zia1) obj2;
                r6h1 r6h1Var6 = d5m0Var.a;
                y6h1 y6h1Var5 = d5m0Var.b;
                int iOrdinal4 = ((yia1) obj4).ordinal();
                if (iOrdinal4 == 0) {
                    String str6 = zia1Var2.a.a;
                    x6h1 x6h1VarC9 = y6h1Var5.c();
                    x6h1VarC9.i.add(new a7h1("sort_button", str6, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = true;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC9.a(), r6h1Var6, System.currentTimeMillis());
                } else {
                    if (iOrdinal4 != 1) {
                        if (iOrdinal4 == 2) {
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    String str7 = zia1Var2.b.a;
                    x6h1 x6h1VarC10 = y6h1Var5.c();
                    x6h1VarC10.i.add(new a7h1("view_density_toggle", str7, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = true;
                    y6h1 y6h1VarA3 = x6h1VarC10.a();
                    w7h1Var5 = zia1Var2.d ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA3, r6h1Var6, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_element_toggle", 1, b7xVar), y6h1VarA3, r6h1Var6, System.currentTimeMillis());
                }
                return w7h1Var5;
            case 26:
                return null;
            case 27:
                ((Number) obj3).intValue();
                return new lyk0(new py9(((stk1) obj).a, (r6h1) obj4, (byte) 24));
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                lyk0 lyk0Var = (lyk0) obj;
                rtk1 rtk1Var = (rtk1) obj4;
                y6h1 y6h1Var6 = lyk0Var.a;
                r6h1 r6h1Var7 = lyk0Var.b.b;
                if (rtk1Var instanceof ntk1) {
                    int i3 = (int) ((ntk1) rtk1Var).a;
                    z7h1 z7h1Var = new z7h1("drag", 1, b7xVar);
                    String strValueOf = String.valueOf(i3);
                    w7h1Var6 = new w7h1("", "", z7h1Var, new x7h1("set_volume", 1, Collections.singletonMap("new_volume_percentage", strValueOf != null ? strValueOf : "")), y6h1Var6, r6h1Var7, System.currentTimeMillis());
                } else if (rtk1Var instanceof ptk1) {
                    w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("decrease_volume", 1, b7xVar), y6h1Var6, r6h1Var7, System.currentTimeMillis());
                } else {
                    if (!(rtk1Var instanceof qtk1)) {
                        if (rtk1Var instanceof otk1) {
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("increase_volume", 1, b7xVar), y6h1Var6, r6h1Var7, System.currentTimeMillis());
                }
                return w7h1Var6;
            default:
                h3m0 h3m0Var = (h3m0) obj;
                rwk1 rwk1Var = (rwk1) obj2;
                jwk1 jwk1Var = (jwk1) obj4;
                if (!(rwk1Var instanceof nwk1)) {
                    if (rwk1Var instanceof owk1) {
                        return null;
                    }
                    eg.o();
                    return null;
                }
                if (!jwk1Var.equals(jwk1.a)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC11 = h3m0Var.a.c();
                x6h1VarC11.i.add(new a7h1("vote_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC11.j = false;
                y6h1 y6h1VarA4 = x6h1VarC11.a();
                String str8 = ((nwk1) rwk1Var).b.d;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str8 != null ? str8 : "")), y6h1VarA4, h3m0Var.b.c.a, System.currentTimeMillis());
        }
    }
}
