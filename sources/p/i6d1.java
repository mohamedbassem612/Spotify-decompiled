package p;

import com.spotify.scrollsita.v1.Section;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i6d1 extends hab0 implements zu30 {
    public static final i6d1 N0;
    public static final i6d1 O0;
    public static final i6d1 P0;
    public static final i6d1 Q0;
    public static final i6d1 R0;
    public static final i6d1 S0;
    public static final i6d1 T0;
    public static final i6d1 U0;
    public static final i6d1 V0;
    public static final i6d1 W0;
    public static final i6d1 X;
    public static final i6d1 X0;
    public static final i6d1 Y;
    public static final i6d1 Y0;
    public static final i6d1 Z;
    public static final i6d1 Z0;
    public static final i6d1 a1;
    public static final i6d1 b;
    public static final i6d1 b1;
    public static final i6d1 c;
    public static final i6d1 c1;
    public static final i6d1 d;
    public static final i6d1 d1;
    public static final i6d1 e;
    public static final i6d1 e1;
    public static final i6d1 f;
    public static final i6d1 g;
    public static final i6d1 h;
    public static final i6d1 i;
    public static final i6d1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new i6d1(i2, (byte) 0);
        c = new i6d1(i2, (byte) 1);
        d = new i6d1(i2, (byte) 2);
        e = new i6d1(i2, (byte) 3);
        f = new i6d1(i2, (byte) 4);
        g = new i6d1(i2, (byte) 5);
        h = new i6d1(i2, (byte) 6);
        i = new i6d1(i2, (byte) 7);
        t = new i6d1(i2, (byte) 8);
        X = new i6d1(i2, (byte) 9);
        Y = new i6d1(i2, (byte) 10);
        Z = new i6d1(i2, (byte) 11);
        N0 = new i6d1(i2, (byte) 12);
        O0 = new i6d1(i2, (byte) 13);
        P0 = new i6d1(i2, (byte) 14);
        Q0 = new i6d1(i2, (byte) 15);
        R0 = new i6d1(i2, (byte) 16);
        S0 = new i6d1(i2, (byte) 17);
        T0 = new i6d1(i2, (byte) 18);
        U0 = new i6d1(i2, (byte) 19);
        V0 = new i6d1(i2, (byte) 20);
        W0 = new i6d1(i2, (byte) 21);
        X0 = new i6d1(i2, (byte) 22);
        Y0 = new i6d1(i2, (byte) 23);
        Z0 = new i6d1(i2, (byte) 24);
        a1 = new i6d1(i2, (byte) 25);
        b1 = new i6d1(i2, (byte) 26);
        c1 = new i6d1(i2, (byte) 27);
        d1 = new i6d1(i2, (byte) 28);
        e1 = new i6d1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i6d1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        y6d1 y6d1Var;
        Float fValueOf;
        w7h1 w7h1Var2;
        int i2;
        char c2;
        char c3;
        Object obj5;
        char c4;
        char c5;
        String str;
        String str2;
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        w7h1 w7h1Var3 = null;
        switch (b2) {
            case 0:
                g7d1 g7d1Var = (g7d1) obj2;
                ((Number) obj3).intValue();
                r6h1 r6h1Var = (r6h1) obj4;
                String strE = gq0.e(g7d1Var.a);
                String str3 = g7d1Var.g;
                return new cqk0(str3 != null ? str3 : "", strE, r6h1Var);
            case 1:
                cqk0 cqk0Var = (cqk0) obj;
                g7d1 g7d1Var2 = (g7d1) obj3;
                p6d1 p6d1Var = (v6d1) obj4;
                r6h1 r6h1Var2 = cqk0Var.a;
                y6h1 y6h1Var = cqk0Var.b;
                if (p6d1Var instanceof p6d1) {
                    List list = g7d1Var2.b;
                    p6d1 p6d1Var2 = p6d1Var;
                    int i3 = p6d1Var2.b;
                    z6d1 z6d1Var = (z6d1) o7h.t0(p6d1Var2.a, list);
                    String str4 = (z6d1Var == null || (y6d1Var = (y6d1) o7h.t0(i3, z6d1Var.e)) == null) ? "unknown" : y6d1Var.b;
                    Integer numValueOf = Integer.valueOf(i3);
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("survey_option", (String) null, numValueOf, (String) null, str4));
                    x6h1VarC.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC.a(), r6h1Var2, System.currentTimeMillis());
                } else if (p6d1Var instanceof q6d1) {
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("submit_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1Var2, System.currentTimeMillis());
                } else {
                    if ((p6d1Var instanceof n6d1) || (p6d1Var instanceof t6d1) || (p6d1Var instanceof s6d1) || (p6d1Var instanceof r6d1) || (p6d1Var instanceof o6d1)) {
                        return null;
                    }
                    if (!(p6d1Var instanceof u6d1)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC3 = y6h1Var.c();
                    x6h1VarC3.i.add(new a7h1("post_survey_action_button", (String) null, (Integer) null, "spotify:internal:ads:preferred-ad-categories", (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:internal:ads:preferred-ad-categories")), x6h1VarC3.a(), r6h1Var2, System.currentTimeMillis());
                }
                return w7h1Var;
            case 2:
                nyl0 nyl0Var = (nyl0) obj;
                if (((b9d1) obj4) instanceof b9d1) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), nyl0Var.a, nyl0Var.b.b, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 3:
                n8h1 n8h1Var = (n8h1) obj;
                bcd1 bcd1Var = (bcd1) obj4;
                ltl0 ltl0Var = n8h1Var instanceof ltl0 ? (ltl0) n8h1Var : null;
                if (!bcd1Var.equals(bcd1.a)) {
                    eg.o();
                    return null;
                }
                if (ltl0Var != null) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), ltl0Var.a, ltl0Var.b.b.b.a, System.currentTimeMillis());
                }
                return null;
            case 4:
                ((Number) obj3).intValue();
                return new bkl0(((xcd1) obj).a, (r6h1) obj4);
            case 5:
                bkl0 bkl0Var = (bkl0) obj;
                xcd1 xcd1Var = (xcd1) obj2;
                ycd1 ycd1Var = (ycd1) obj3;
                if (!((wcd1) obj4).equals(wcd1.a)) {
                    eg.o();
                    return null;
                }
                Float f2 = ycd1Var.d;
                if (f2 != null) {
                    float fFloatValue = f2.floatValue();
                    Float f3 = ycd1Var.a.b;
                    fValueOf = Float.valueOf(fFloatValue * (f3 != null ? f3.floatValue() : 1.0f));
                } else {
                    fValueOf = null;
                }
                if (fValueOf == null) {
                    return null;
                }
                r6h1 r6h1VarB = bkl0Var.b();
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-playlist-speed-sync-button";
                x6h1VarI.f = "1.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1 x6h1VarC4 = x6h1VarI.a().c();
                x6h1VarC4.i.add(new a7h1("sync_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                y6h1 y6h1VarA = x6h1VarC4.a();
                String str5 = xcd1Var.a;
                int iU = jch0.U(fValueOf.floatValue());
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                if (str5 == null) {
                    str5 = "";
                }
                mmr0 mmr0Var = new mmr0("currently_played_item", str5);
                String strValueOf = String.valueOf(iU);
                return new w7h1("", "", z7h1Var, new x7h1("set_playback_speed", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("playback_speed", strValueOf != null ? strValueOf : "")})), y6h1VarA, r6h1VarB, System.currentTimeMillis());
            case 6:
                return null;
            case 7:
                rpd1 rpd1Var = (rpd1) obj;
                ((Number) obj3).intValue();
                r6h1 r6h1Var3 = (r6h1) obj4;
                String str6 = rpd1Var.c;
                String str7 = rpd1Var.d;
                if (ihc1.y0(str7)) {
                    str7 = str6;
                }
                return new dvl0(str7, str6, rpd1Var.a, r6h1Var3);
            case 8:
                return ((dvl0) obj).a(((rpd1) obj2).a);
            case 9:
                psd1 psd1Var = (psd1) obj;
                ((Number) obj3).intValue();
                r6h1 r6h1Var4 = (r6h1) obj4;
                String str8 = psd1Var.a;
                String str9 = psd1Var.d;
                if (str9 == null) {
                    str9 = psd1Var.e;
                }
                if (str9 != null) {
                    return new k2m0(str8, str9, r6h1Var4);
                }
                return psd1Var.c != null ? new j2m0(2, str8, r6h1Var4) : new j2m0(1, str8, r6h1Var4);
            case 10:
                k2m0 k2m0Var = (n8h1) obj;
                psd1 psd1Var2 = (psd1) obj2;
                osd1 osd1Var = (osd1) obj4;
                if (osd1Var instanceof nsd1) {
                    k2m0 k2m0Var2 = k2m0Var instanceof k2m0 ? k2m0Var : null;
                    if (k2m0Var2 == null) {
                        return null;
                    }
                    String str10 = psd1Var2.d;
                    if (str10 == null) {
                        str10 = psd1Var2.e;
                    }
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str10 != null ? str10 : "")), k2m0Var2.b, k2m0Var2.a, System.currentTimeMillis());
                }
                if (osd1Var instanceof msd1) {
                    k2m0 k2m0Var3 = k2m0Var instanceof k2m0 ? k2m0Var : null;
                    if (k2m0Var3 == null) {
                        return null;
                    }
                    x6h1 x6h1VarC5 = k2m0Var3.b.c();
                    x6h1VarC5.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC5.a(), k2m0Var3.a, System.currentTimeMillis());
                }
                if (!osd1Var.equals(lsd1.a)) {
                    eg.o();
                    return null;
                }
                j2m0 j2m0Var = k2m0Var instanceof j2m0 ? (j2m0) k2m0Var : null;
                if (j2m0Var == null) {
                    return null;
                }
                x6h1 x6h1VarC6 = j2m0Var.b.c();
                x6h1VarC6.i.add(new a7h1("cancel_friend_request_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("delete_chat", 1, b7xVar), x6h1VarC6.a(), j2m0Var.a, System.currentTimeMillis());
            case 11:
                ((Number) obj3).intValue();
                return new n2m0(new brl0((byte) 13), ((lvd1) obj).a);
            case 12:
                return null;
            case 13:
                ((Number) obj3).intValue();
                return new xtk0(new xok0((byte) 10));
            case 14:
                ((Number) obj3).intValue();
                return new hxk0();
            case 15:
                lyd1 lyd1Var = (lyd1) obj4;
                y6h1 y6h1Var3 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-comments-interactivity-terms-sheet";
                x6h1VarI2.f = "2.0.0";
                x6h1VarI2.g = "22.0.0";
                y6h1 y6h1VarA2 = x6h1VarI2.a();
                if (lyd1Var instanceof jyd1) {
                    x6h1 x6h1VarC7 = y6h1VarA2.c();
                    x6h1VarC7.i.add(new a7h1("confirm_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis());
                }
                if (!(lyd1Var instanceof kyd1)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC8 = y6h1VarA2.c();
                x6h1VarC8.i.add(new a7h1("text_link", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", ((kyd1) lyd1Var).a)), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis());
            case 16:
                ((Number) obj3).intValue();
                return new y5l0((r6h1) obj4);
            case 17:
                y5l0 y5l0Var = (y5l0) obj;
                u0e1 u0e1Var = (u0e1) obj3;
                t0e1 t0e1Var = (t0e1) obj4;
                r6h1 r6h1Var5 = y5l0Var.a;
                y6h1 y6h1Var4 = y5l0Var.b;
                if (t0e1Var instanceof r0e1) {
                    int iOrdinal = ((r0e1) t0e1Var).a.ordinal();
                    if (iOrdinal == 0) {
                        c4 = 2;
                        c5 = 1;
                    } else if (iOrdinal != 1) {
                        c4 = 2;
                        if (iOrdinal == 2) {
                            c5 = 2;
                        } else {
                            if (iOrdinal != 3) {
                                eg.o();
                                return null;
                            }
                            c5 = 3;
                        }
                    } else {
                        c4 = 2;
                        c5 = 4;
                    }
                    x6h1 x6h1VarC9 = y6h1Var4.c();
                    if (c5 == 1) {
                        str = "classic";
                    } else if (c5 == c4) {
                        str = "narrow";
                    } else if (c5 == 3) {
                        str = "slanted";
                    } else {
                        if (c5 != 4) {
                            throw null;
                        }
                        str = "wide";
                    }
                    x6h1VarC9.i.add(new a7h1("font_enum", str, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC9.a(), r6h1Var5, System.currentTimeMillis());
                } else if (t0e1Var instanceof p0e1) {
                    int i4 = u0e1Var.b;
                    x6h1 x6h1VarC10 = y6h1Var4.c();
                    x6h1VarC10.i.add(new a7h1("alignment_toggle", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    y6h1 y6h1VarA3 = x6h1VarC10.a();
                    int iC = l1d.C(i4);
                    if (iC == 0) {
                        i2 = 2;
                        c2 = 2;
                    } else if (iC != 1) {
                        i2 = 2;
                        if (iC != 2) {
                            eg.o();
                            return null;
                        }
                        c2 = 3;
                    } else {
                        i2 = 2;
                        c2 = 1;
                    }
                    int iC2 = l1d.C(i4);
                    if (iC2 == 0) {
                        c3 = 1;
                    } else if (iC2 == 1) {
                        c3 = 3;
                    } else {
                        if (iC2 != i2) {
                            eg.o();
                            return null;
                        }
                        c3 = 2;
                    }
                    z7h1 z7h1Var2 = new z7h1("hit", 1, b7xVar);
                    String str11 = "centre_alignment";
                    if (c2 == 1) {
                        obj5 = "centre_alignment";
                    } else if (c2 == 2) {
                        obj5 = "left_alignment";
                    } else {
                        if (c2 != 3) {
                            throw null;
                        }
                        obj5 = "right_alignment";
                    }
                    mmr0 mmr0Var2 = new mmr0("state_before_toggle", obj5);
                    if (c3 != 1) {
                        if (c3 == 2) {
                            str11 = "left_alignment";
                        } else {
                            if (c3 != 3) {
                                throw null;
                            }
                            str11 = "right_alignment";
                        }
                    }
                    w7h1Var2 = new w7h1("", "", z7h1Var2, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var2, new mmr0("state_after_toggle", str11)})), y6h1VarA3, r6h1Var5, System.currentTimeMillis());
                } else if (t0e1Var instanceof s0e1) {
                    mmr0 mmr0Var3 = u0e1Var.c ? new mmr0(x5l0.UPPERCASE, w5l0.LOWERCASE) : new mmr0(x5l0.LOWERCASE, w5l0.UPPERCASE);
                    x5l0 x5l0Var = (x5l0) mmr0Var3.a;
                    w5l0 w5l0Var = (w5l0) mmr0Var3.b;
                    x6h1 x6h1VarC11 = y6h1Var4.c();
                    x6h1VarC11.i.add(new a7h1("font_case_toggle", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC11.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{new mmr0("state_before_toggle", x5l0Var.a), new mmr0("state_after_toggle", w5l0Var.a)})), x6h1VarC11.a(), r6h1Var5, System.currentTimeMillis());
                } else {
                    if (!(t0e1Var instanceof q0e1)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC12 = y6h1Var4.c();
                    x6h1VarC12.i.add(new a7h1("dismiss_interaction", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC12.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("drag", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC12.a(), r6h1Var5, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 18:
                ((Number) obj3).intValue();
                return new usl0((r6h1) obj4);
            case 19:
                return null;
            case 20:
                ((Number) obj3).intValue();
                return new ocl0();
            case 21:
                x6h1 x6h1VarC13 = ((ocl0) obj).a.c();
                x6h1VarC13.i.add(new a7h1("send_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC13.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("send_message", 1, b7xVar), x6h1VarC13.a(), r6h1.c, System.currentTimeMillis());
            case 22:
                ((Number) obj3).intValue();
                return new rfl0((r6h1) obj4);
            case 23:
                rfl0 rfl0Var = (rfl0) obj;
                mde1 mde1Var = (mde1) obj3;
                jde1 jde1Var = (lde1) obj4;
                if (jde1Var.equals(ide1.a)) {
                    return null;
                }
                if (!(jde1Var instanceof jde1)) {
                    if ((jde1Var instanceof gde1) || jde1Var.equals(hde1.a) || (jde1Var instanceof kde1)) {
                        return null;
                    }
                    eg.o();
                    return null;
                }
                ode1 ode1Var = mde1Var.d;
                uvg1 uvg1Var = ode1Var.a.a;
                long j = uvg1Var.b;
                long j2 = uvg1Var.c;
                int i5 = (int) uvg1Var.a;
                oce1 oce1Var = (oce1) ode1Var.b.get(jde1Var.a);
                char c6 = Math.abs(oce1Var.a - ((long) i5)) < Math.abs(oce1Var.a - j) ? (char) 2 : (char) 1;
                x6h1 x6h1VarC14 = rfl0Var.b.c();
                if (c6 == 1) {
                    str2 = "end";
                } else {
                    if (c6 != 2) {
                        throw null;
                    }
                    str2 = "start";
                }
                x6h1VarC14.i.add(new a7h1("selection", (String) null, (Integer) null, (String) null, str2));
                x6h1VarC14.j = false;
                y6h1 y6h1VarA4 = x6h1VarC14.a();
                int i6 = (int) j;
                int i7 = (int) j2;
                z7h1 z7h1Var3 = new z7h1("hit", 1, b7xVar);
                String strValueOf2 = String.valueOf(i5);
                if (strValueOf2 == null) {
                    strValueOf2 = "";
                }
                mmr0 mmr0Var4 = new mmr0("start_time_ms", strValueOf2);
                String strValueOf3 = String.valueOf(i6);
                if (strValueOf3 == null) {
                    strValueOf3 = "";
                }
                mmr0 mmr0Var5 = new mmr0("end_time_ms", strValueOf3);
                String strValueOf4 = String.valueOf(i7);
                return new w7h1("", "", z7h1Var3, new x7h1("end_content_trim", 1, sqg0.J(new mmr0[]{mmr0Var4, mmr0Var5, new mmr0("total_recording_duration_ms", strValueOf4 != null ? strValueOf4 : "")})), y6h1VarA4, rfl0Var.a, System.currentTimeMillis());
            case 24:
                n8h1 n8h1Var2 = (n8h1) obj;
                sde1 sde1Var = (sde1) obj2;
                mtl0 mtl0Var = n8h1Var2 instanceof mtl0 ? (mtl0) n8h1Var2 : null;
                if (mtl0Var != null && sde1Var.h) {
                    String str12 = sde1Var.a;
                    x6h1 x6h1VarC15 = mtl0Var.a.c();
                    x6h1VarC15.i.add(new a7h1("click_to_seek", str12, (Integer) null, (String) null, (String) null));
                    x6h1VarC15.j = false;
                    y6h1 y6h1VarA5 = x6h1VarC15.a();
                    int i8 = sde1Var.c;
                    z7h1 z7h1Var4 = new z7h1("hit", 1, b7xVar);
                    String strValueOf5 = String.valueOf(i8);
                    w7h1Var3 = new w7h1("", "", z7h1Var4, new x7h1("seek_to_time", 1, Collections.singletonMap("ms_to_seek_to", strValueOf5 != null ? strValueOf5 : "")), y6h1VarA5, mtl0Var.b.b.a, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 25:
                n8h1 n8h1Var3 = (n8h1) obj;
                wde1 wde1Var = (wde1) obj2;
                vde1 vde1Var = (vde1) obj4;
                mtl0 mtl0Var2 = n8h1Var3 instanceof mtl0 ? (mtl0) n8h1Var3 : null;
                if (mtl0Var2 != null) {
                    if (!vde1Var.equals(vde1.a)) {
                        eg.o();
                    } else if (wde1Var.g) {
                        String str13 = wde1Var.a;
                        x6h1 x6h1VarC16 = mtl0Var2.a.c();
                        x6h1VarC16.i.add(new a7h1("click_to_seek", str13, (Integer) null, (String) null, (String) null));
                        x6h1VarC16.j = false;
                        y6h1 y6h1VarA6 = x6h1VarC16.a();
                        int i9 = wde1Var.b;
                        z7h1 z7h1Var5 = new z7h1("hit", 1, b7xVar);
                        String strValueOf6 = String.valueOf(i9);
                        w7h1Var3 = new w7h1("", "", z7h1Var5, new x7h1("seek_to_time", 1, Collections.singletonMap("ms_to_seek_to", strValueOf6 != null ? strValueOf6 : "")), y6h1VarA6, mtl0Var2.b.b.a, System.currentTimeMillis());
                    }
                }
                return w7h1Var3;
            case 26:
                ((Number) obj3).intValue();
                return new xxk0(new yxk0((byte) 0));
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                xxk0 xxk0Var = (xxk0) obj;
                String string = ((tfe1) obj2).b.toString();
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", string != null ? string : "")), xxk0Var.a, xxk0Var.b.b, System.currentTimeMillis());
            case 28:
                uke1 uke1Var = (uke1) obj4;
                y6h1 y6h1Var5 = ((jul0) obj).a;
                if (uke1Var.equals(ske1.a)) {
                    x6h1 x6h1VarC17 = y6h1Var5.c();
                    x6h1VarC17.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC17.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC17.a(), r6h1.c, System.currentTimeMillis());
                }
                if (!uke1Var.equals(tke1.a)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC18 = y6h1Var5.c();
                x6h1VarC18.i.add(new a7h1("explore_premium_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC18.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:premium-destination")), x6h1VarC18.a(), r6h1.c, System.currentTimeMillis());
            default:
                kul0 kul0Var = (kul0) obj;
                nhb1 nhb1Var = (nhb1) obj3;
                lhb1 lhb1Var = (lhb1) obj4;
                if (!lhb1Var.equals(jhb1.a)) {
                    if (lhb1Var.equals(khb1.a)) {
                        return kul0Var.h();
                    }
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC19 = kul0Var.b.c();
                x6h1VarC19.i.add(new a7h1("explore_premium_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC19.j = false;
                y6h1 y6h1VarA7 = x6h1VarC19.a();
                String strM = flo1.m(nhb1Var, "spotify:upsell:premium_in_app_destination");
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strM != null ? strM : "")), y6h1VarA7, kul0Var.a, System.currentTimeMillis());
        }
    }
}
