package p;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class clf0 extends hab0 implements zu30 {
    public static final clf0 N0;
    public static final clf0 O0;
    public static final clf0 P0;
    public static final clf0 Q0;
    public static final clf0 R0;
    public static final clf0 S0;
    public static final clf0 T0;
    public static final clf0 U0;
    public static final clf0 V0;
    public static final clf0 W0;
    public static final clf0 X;
    public static final clf0 X0;
    public static final clf0 Y;
    public static final clf0 Y0;
    public static final clf0 Z;
    public static final clf0 Z0;
    public static final clf0 a1;
    public static final clf0 b;
    public static final clf0 b1;
    public static final clf0 c;
    public static final clf0 c1;
    public static final clf0 d;
    public static final clf0 d1;
    public static final clf0 e;
    public static final clf0 e1;
    public static final clf0 f;
    public static final clf0 g;
    public static final clf0 h;
    public static final clf0 i;
    public static final clf0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new clf0(i2, (byte) 0);
        c = new clf0(i2, (byte) 1);
        d = new clf0(i2, (byte) 2);
        e = new clf0(i2, (byte) 3);
        f = new clf0(i2, (byte) 4);
        g = new clf0(i2, (byte) 5);
        h = new clf0(i2, (byte) 6);
        i = new clf0(i2, (byte) 7);
        t = new clf0(i2, (byte) 8);
        X = new clf0(i2, (byte) 9);
        Y = new clf0(i2, (byte) 10);
        Z = new clf0(i2, (byte) 11);
        N0 = new clf0(i2, (byte) 12);
        O0 = new clf0(i2, (byte) 13);
        P0 = new clf0(i2, (byte) 14);
        Q0 = new clf0(i2, (byte) 15);
        R0 = new clf0(i2, (byte) 16);
        S0 = new clf0(i2, (byte) 17);
        T0 = new clf0(i2, (byte) 18);
        U0 = new clf0(i2, (byte) 19);
        V0 = new clf0(i2, (byte) 20);
        W0 = new clf0(i2, (byte) 21);
        X0 = new clf0(i2, (byte) 22);
        Y0 = new clf0(i2, (byte) 23);
        Z0 = new clf0(i2, (byte) 24);
        a1 = new clf0(i2, (byte) 25);
        b1 = new clf0(i2, (byte) 26);
        c1 = new clf0(i2, (byte) 27);
        d1 = new clf0(i2, (byte) 28);
        e1 = new clf0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ clf0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        boolean z;
        char c2;
        char c3;
        String str;
        w7h1 w7h1Var4;
        int i2;
        int i3;
        Object obj5;
        w7h1 w7h1Var5;
        w7h1 w7h1Var6;
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                ((Number) obj3).intValue();
                return new vel0(((zkf0) obj2).a.d, (r6h1) obj4);
            case 1:
                ((Number) obj3).intValue();
                return new xel0(new g5l0((r6h1) obj4, (byte) 19));
            case 2:
                return null;
            case 3:
                ((Number) obj3).intValue();
                return new n4m0();
            case 4:
                qtf0 qtf0Var = (qtf0) obj3;
                glm1 glm1Var = (glm1) obj4;
                String str2 = qtf0Var.a;
                r6h1 r6h1VarB = ((n4m0) obj).b();
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-xr-glasses-touch-controls";
                x6h1VarI.f = "2.1.0";
                x6h1VarI.g = "22.0.0";
                y6h1 y6h1VarA = x6h1VarI.a();
                if (glm1Var.equals(dlm1.a)) {
                    if (qtf0Var.t) {
                        x6h1 x6h1VarC = y6h1VarA.c();
                        x6h1VarC.i.add(new a7h1("play_pause_gesture", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("pause", 1, Collections.singletonMap("item_to_be_paused", str2 != null ? str2 : "")), x6h1VarC.a(), r6h1VarB, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC2 = y6h1VarA.c();
                        x6h1VarC2.i.add(new a7h1("play_pause_gesture", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC2.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("resume", 1, Collections.singletonMap("item_to_be_resumed", str2 != null ? str2 : "")), x6h1VarC2.a(), r6h1VarB, System.currentTimeMillis());
                    }
                } else if (glm1Var.equals(clm1.a)) {
                    x6h1 x6h1VarC3 = y6h1VarA.c();
                    x6h1VarC3.i.add(new a7h1("skip_next_gesture", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC3.a();
                    z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                    if (str2 == null) {
                        str2 = "";
                    }
                    w7h1Var = new w7h1("", "", z7h1Var, new x7h1("skip_to_next", 2, sqg0.J(new mmr0[]{new mmr0("item_to_be_skipped", str2), new mmr0("position_ms", ""), new mmr0("total_content_ms", "")})), y6h1VarA2, r6h1VarB, System.currentTimeMillis());
                } else {
                    if (!glm1Var.equals(elm1.a)) {
                        return null;
                    }
                    x6h1 x6h1VarC4 = y6h1VarA.c();
                    x6h1VarC4.i.add(new a7h1("skip_previous_gesture", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    y6h1 y6h1VarA3 = x6h1VarC4.a();
                    z7h1 z7h1Var2 = new z7h1("hit", 1, b7xVar);
                    if (str2 == null) {
                        str2 = "";
                    }
                    w7h1Var = new w7h1("", "", z7h1Var2, new x7h1("skip_to_previous", 2, sqg0.J(new mmr0[]{new mmr0("item_to_be_skipped", str2), new mmr0("position_ms", ""), new mmr0("total_content_ms", "")})), y6h1VarA3, r6h1VarB, System.currentTimeMillis());
                }
                return w7h1Var;
            case 5:
                ((Number) obj3).intValue();
                return new s1m0(((ypf0) obj).a);
            case 6:
                iqf0 iqf0Var = (iqf0) obj3;
                gqf0 gqf0Var = (gqf0) obj4;
                y6h1 y6h1Var2 = ((s1m0) obj).a;
                if (gqf0Var instanceof dqf0) {
                    x6h1 x6h1VarC5 = y6h1Var2.c();
                    x6h1VarC5.i.add(new a7h1("search_bar", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("focus_input_field", 1, b7xVar), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (gqf0Var instanceof bqf0) {
                        x6h1 x6h1VarC6 = y6h1Var2.c();
                        x6h1VarC6.i.add(new a7h1("search_bar", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC6.j = false;
                        return new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("change_search_query", 1, Collections.singletonMap("search_query_string", ((bqf0) gqf0Var).a)), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
                    }
                    if (!(gqf0Var instanceof cqf0)) {
                        int i4 = -1;
                        if (gqf0Var instanceof eqf0) {
                            Iterator it = iqf0Var.c.iterator();
                            int i5 = 0;
                            while (it.hasNext()) {
                                if (u890.j(((zpf0) it.next()).a, ((eqf0) gqf0Var).a)) {
                                    i4 = i5;
                                    x6h1 x6h1VarC7 = y6h1Var2.c();
                                    x6h1VarC7.i.add(new a7h1("filter_carousel", (String) null, (Integer) null, (String) null, (String) null));
                                    x6h1VarC7.j = false;
                                    y6h1 y6h1VarA4 = x6h1VarC7.a();
                                    String str3 = ((eqf0) gqf0Var).a;
                                    Integer numValueOf = Integer.valueOf(i4);
                                    x6h1 x6h1VarC8 = y6h1VarA4.c();
                                    x6h1VarC8.i.add(new a7h1("chip", str3, numValueOf, (String) null, (String) null));
                                    x6h1VarC8.j = false;
                                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis());
                                } else {
                                    i5++;
                                }
                            }
                            x6h1 x6h1VarC9 = y6h1Var2.c();
                            x6h1VarC9.i.add(new a7h1("filter_carousel", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC9.j = false;
                            y6h1 y6h1VarA5 = x6h1VarC9.a();
                            String str4 = ((eqf0) gqf0Var).a;
                            Integer numValueOf2 = Integer.valueOf(i4);
                            x6h1 x6h1VarC10 = y6h1VarA5.c();
                            x6h1VarC10.i.add(new a7h1("chip", str4, numValueOf2, (String) null, (String) null));
                            x6h1VarC10.j = false;
                            w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC10.a(), r6h1.c, System.currentTimeMillis());
                        } else {
                            if (!(gqf0Var instanceof fqf0)) {
                                if (gqf0Var instanceof aqf0) {
                                    return null;
                                }
                                eg.o();
                                return null;
                            }
                            Iterator it2 = iqf0Var.b.iterator();
                            int i6 = 0;
                            while (it2.hasNext()) {
                                if (u890.j((String) it2.next(), ((fqf0) gqf0Var).a)) {
                                    i4 = i6;
                                    x6h1 x6h1VarC11 = y6h1Var2.c();
                                    x6h1VarC11.i.add(new a7h1("sticker_grid", (String) null, (Integer) null, (String) null, (String) null));
                                    x6h1VarC11.j = false;
                                    y6h1 y6h1VarA6 = x6h1VarC11.a();
                                    Integer numValueOf3 = Integer.valueOf(i4);
                                    x6h1 x6h1VarC12 = y6h1VarA6.c();
                                    x6h1VarC12.i.add(new a7h1("sticker", (String) null, numValueOf3, (String) null, (String) null));
                                    x6h1VarC12.j = false;
                                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC12.a(), r6h1.c, System.currentTimeMillis());
                                } else {
                                    i6++;
                                }
                            }
                            x6h1 x6h1VarC13 = y6h1Var2.c();
                            x6h1VarC13.i.add(new a7h1("sticker_grid", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC13.j = false;
                            y6h1 y6h1VarA7 = x6h1VarC13.a();
                            Integer numValueOf4 = Integer.valueOf(i4);
                            x6h1 x6h1VarC14 = y6h1VarA7.c();
                            x6h1VarC14.i.add(new a7h1("sticker", (String) null, numValueOf4, (String) null, (String) null));
                            x6h1VarC14.j = false;
                            w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC14.a(), r6h1.c, System.currentTimeMillis());
                        }
                        return w7h1Var2;
                    }
                    x6h1 x6h1VarC15 = y6h1Var2.c();
                    x6h1VarC15.i.add(new a7h1("clear_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC15.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("text_clear", 1, b7xVar), x6h1VarC15.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 7:
                ((Number) obj3).intValue();
                return new wtk0(new xok0((byte) 10));
            case 8:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", "https://www.ftc.go.kr/selectBizOvrCommPop.do?apvPermMgtNo=2024%EA%B3%B5%EC%A0%950007")), ((wtk0) obj).a, r6h1.c, System.currentTimeMillis());
            case 9:
                ((Number) obj3).intValue();
                return xyn1.r(((n2g0) obj).a, (r6h1) obj4);
            case 10:
                mv61 mv61Var = (mv61) obj;
                n2g0 n2g0Var = (n2g0) obj2;
                if (((m2g0) obj4) == m2g0.a) {
                    return mv61Var.a.a(n2g0Var.b.a);
                }
                eg.o();
                return null;
            case 11:
                ((Number) obj3).intValue();
                return new efl0((String) o7h.p0(((s3g0) obj).a), (r6h1) obj4);
            case 12:
                efl0 efl0Var = (efl0) obj;
                q3g0 q3g0Var = (q3g0) obj4;
                r6h1 r6h1Var = efl0Var.a;
                y6h1 y6h1Var3 = efl0Var.b;
                String str5 = "public";
                if (q3g0Var instanceof p3g0) {
                    x6h1 x6h1VarC16 = y6h1Var3.c();
                    x6h1VarC16.i.add(new a7h1("confirm_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC16.j = false;
                    y6h1 y6h1VarA8 = x6h1VarC16.a();
                    int iOrdinal = ((p3g0) q3g0Var).a.ordinal();
                    if (iOrdinal != 0) {
                        i2 = 1;
                        if (iOrdinal == 1) {
                            eg.m("Private is not a permission change");
                            return null;
                        }
                        if (iOrdinal != 2) {
                            eg.o();
                            return null;
                        }
                        i3 = 1;
                    } else {
                        i2 = 1;
                        i3 = 2;
                    }
                    z7h1 z7h1Var3 = new z7h1("hit", i2, b7xVar);
                    mmr0 mmr0Var = new mmr0("state_before_toggle", "private");
                    if (i3 == i2) {
                        str5 = "only_members";
                    } else if (i3 != 2) {
                        throw null;
                    }
                    w7h1Var4 = new w7h1("", "", z7h1Var3, new x7h1("toggle_state", i2, sqg0.J(new mmr0[]{mmr0Var, new mmr0("state_after_toggle", str5)})), y6h1VarA8, r6h1Var, System.currentTimeMillis());
                } else if (q3g0Var.equals(m3g0.a)) {
                    x6h1 x6h1VarC17 = y6h1Var3.c();
                    x6h1VarC17.i.add(new a7h1("confirm_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC17.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC17.a(), r6h1Var, System.currentTimeMillis());
                } else if (q3g0Var.equals(n3g0.a)) {
                    x6h1 x6h1VarC18 = y6h1Var3.c();
                    x6h1VarC18.i.add(new a7h1("outside_area", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC18.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC18.a(), r6h1Var, System.currentTimeMillis());
                } else {
                    if (!(q3g0Var instanceof o3g0)) {
                        eg.o();
                        return null;
                    }
                    int iOrdinal2 = ((o3g0) q3g0Var).a.ordinal();
                    if (iOrdinal2 != 0) {
                        z = true;
                        if (iOrdinal2 != 1) {
                            c2 = 2;
                            if (iOrdinal2 != 2) {
                                eg.o();
                                return null;
                            }
                            c3 = 1;
                        } else {
                            c2 = 2;
                            c3 = 2;
                        }
                    } else {
                        z = true;
                        c2 = 2;
                        c3 = 3;
                    }
                    x6h1 x6h1VarC19 = y6h1Var3.c();
                    if (c3 != z) {
                        if (c3 == c2) {
                            str = "private";
                        } else if (c3 != 3) {
                            throw null;
                        }
                        x6h1VarC19.i.add(new a7h1("permission_option_row", str, (Integer) null, (String) null, (String) null));
                        x6h1VarC19.j = false;
                        w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC19.a(), r6h1Var, System.currentTimeMillis());
                    } else {
                        str5 = "only_members";
                    }
                    str = str5;
                    x6h1VarC19.i.add(new a7h1("permission_option_row", str, (Integer) null, (String) null, (String) null));
                    x6h1VarC19.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC19.a(), r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var4;
            case 13:
                ((Number) obj3).intValue();
                return new x4l0(new py9((r6h1) obj4, (byte) 27));
            case 14:
                ((Number) obj3).intValue();
                return new y4l0((r6h1) obj4);
            case 15:
                ((Number) obj3).intValue();
                return new o7l0();
            case 16:
                return null;
            case 17:
                ((Number) obj3).intValue();
                return new o7l0();
            case 18:
                return null;
            case 19:
                return new w8l0(Integer.valueOf(((Number) obj3).intValue()), ((jeg0) obj).a.a, new nqk0(new h7l0((byte) 14)));
            case 20:
                w8l0 w8l0Var = (w8l0) obj;
                ieg0 ieg0Var = (ieg0) obj4;
                char c4 = ((jeg0) obj2).a.c ? (char) 2 : (char) 1;
                char c5 = ieg0Var.a ? (char) 2 : (char) 1;
                z7h1 z7h1Var4 = new z7h1("hit", 1, b7xVar);
                String str6 = "requests_off";
                if (c4 == 1) {
                    obj5 = "requests_off";
                } else {
                    if (c4 != 2) {
                        throw null;
                    }
                    obj5 = "requests_on";
                }
                mmr0 mmr0Var2 = new mmr0("state_before_toggle", obj5);
                if (c5 != 1) {
                    if (c5 != 2) {
                        throw null;
                    }
                    str6 = "requests_on";
                }
                return new w7h1("", "", z7h1Var4, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var2, new mmr0("state_after_toggle", str6)})), w8l0Var.a, r6h1.c, System.currentTimeMillis());
            case 21:
                meg0 meg0Var = (meg0) obj;
                ((Number) obj3).intValue();
                return new a9l0(Integer.valueOf(meg0Var.a), meg0Var.b, new nqk0(new h7l0((byte) 19), (byte) 0));
            case 22:
                a9l0 a9l0Var = (a9l0) obj;
                meg0 meg0Var2 = (meg0) obj2;
                if (((leg0) obj4).equals(leg0.a)) {
                    String strA = meg0Var2.a();
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strA != null ? strA : "")), a9l0Var.a, r6h1.c, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 23:
                ((Number) obj3).intValue();
                return new c9l0(new h7l0((byte) 19));
            case 24:
                c9l0 c9l0Var = (c9l0) obj;
                if (((vfg0) obj4).equals(vfg0.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), c9l0Var.a, r6h1.c, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 25:
                return new w0m0(Integer.valueOf(((Number) obj3).intValue()), ((ilg0) obj).a, (r6h1) obj4);
            case 26:
                w0m0 w0m0Var = (w0m0) obj;
                ilg0 ilg0Var = (ilg0) obj2;
                nlg0 nlg0Var = (plg0) obj3;
                glg0 glg0Var = (glg0) obj4;
                r6h1 r6h1Var2 = w0m0Var.a;
                y6h1 y6h1Var4 = w0m0Var.b;
                if (nlg0Var instanceof olg0) {
                    return null;
                }
                if (!(nlg0Var instanceof nlg0)) {
                    eg.o();
                    return null;
                }
                if (glg0Var.equals(elg0.a)) {
                    if (ilg0Var.h != null) {
                        x6h1 x6h1VarC20 = y6h1Var4.c();
                        x6h1VarC20.i.add(new a7h1("info_view", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC20.j = false;
                        w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", l1d.m("spotify:internal:dna:contributor:", (String) o7h.A0(ihc1.Q0(ilg0Var.a, new String[]{":"}, 0, 6))))), x6h1VarC20.a(), r6h1Var2, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC21 = y6h1Var4.c();
                        x6h1VarC21.i.add(new a7h1("info_view", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC21.j = false;
                        w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC21.a(), r6h1Var2, System.currentTimeMillis());
                    }
                } else if (glg0Var instanceof dlg0) {
                    x6h1 x6h1VarC22 = y6h1Var4.c();
                    x6h1VarC22.i.add(new a7h1("info_view", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC22.j = false;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", nlg0Var.a.a.concat(":dna"))), x6h1VarC22.a(), r6h1Var2, System.currentTimeMillis());
                } else {
                    if (!glg0Var.equals(flg0.a)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC23 = y6h1Var4.c();
                    x6h1VarC23.i.add(new a7h1("story_view", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC23.j = false;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC23.a(), r6h1Var2, System.currentTimeMillis());
                }
                return w7h1Var5;
            case 27:
                return new emg0((jo70) obj, (k1r) obj2, (z6a1) obj4, (List) obj3, (xm6) null);
            case 28:
                r6h1 r6h1Var3 = (r6h1) obj4;
                Integer numValueOf5 = Integer.valueOf(((Number) obj3).intValue());
                String str7 = ((fmg0) obj).b;
                return new w0m0(numValueOf5, str7 != null ? str7 : "", r6h1Var3);
            default:
                w0m0 w0m0Var2 = (w0m0) obj;
                fmg0 fmg0Var = (fmg0) obj2;
                dmg0 dmg0Var = (dmg0) obj4;
                r6h1 r6h1Var4 = w0m0Var2.a;
                y6h1 y6h1Var5 = w0m0Var2.b;
                String str8 = fmg0Var.b;
                String str9 = ((gmg0) obj3).a;
                if (dmg0Var.equals(bmg0.a)) {
                    if (fmg0Var.k == null || str8 == null) {
                        x6h1 x6h1VarC24 = y6h1Var5.c();
                        x6h1VarC24.i.add(new a7h1("info_view", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC24.j = false;
                        w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC24.a(), r6h1Var4, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC25 = y6h1Var5.c();
                        x6h1VarC25.i.add(new a7h1("info_view", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC25.j = false;
                        w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", l1d.m("spotify:internal:dna:contributor:", (String) o7h.A0(ihc1.Q0(str8, new String[]{":"}, 0, 6))))), x6h1VarC25.a(), r6h1Var4, System.currentTimeMillis());
                    }
                } else if (dmg0Var instanceof amg0) {
                    if (str9 == null) {
                        return null;
                    }
                    x6h1 x6h1VarC26 = y6h1Var5.c();
                    x6h1VarC26.i.add(new a7h1("info_view", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC26.j = false;
                    w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str9.concat(":dna"))), x6h1VarC26.a(), r6h1Var4, System.currentTimeMillis());
                } else {
                    if (!dmg0Var.equals(cmg0.a)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC27 = y6h1Var5.c();
                    x6h1VarC27.i.add(new a7h1("story_view", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC27.j = false;
                    w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC27.a(), r6h1Var4, System.currentTimeMillis());
                }
                return w7h1Var6;
        }
    }
}
