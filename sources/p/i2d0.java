package p;

import android.content.Context;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i2d0 extends hab0 implements zu30 {
    public static final i2d0 N0;
    public static final i2d0 O0;
    public static final i2d0 P0;
    public static final i2d0 Q0;
    public static final i2d0 R0;
    public static final i2d0 S0;
    public static final i2d0 T0;
    public static final i2d0 U0;
    public static final i2d0 V0;
    public static final i2d0 W0;
    public static final i2d0 X;
    public static final i2d0 X0;
    public static final i2d0 Y;
    public static final i2d0 Y0;
    public static final i2d0 Z;
    public static final i2d0 Z0;
    public static final i2d0 a1;
    public static final i2d0 b;
    public static final i2d0 b1;
    public static final i2d0 c;
    public static final i2d0 c1;
    public static final i2d0 d;
    public static final i2d0 d1;
    public static final i2d0 e;
    public static final i2d0 e1;
    public static final i2d0 f;
    public static final i2d0 g;
    public static final i2d0 h;
    public static final i2d0 i;
    public static final i2d0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new i2d0(i2, (byte) 0);
        c = new i2d0(i2, (byte) 1);
        d = new i2d0(i2, (byte) 2);
        e = new i2d0(i2, (byte) 3);
        f = new i2d0(i2, (byte) 4);
        g = new i2d0(i2, (byte) 5);
        h = new i2d0(i2, (byte) 6);
        i = new i2d0(i2, (byte) 7);
        t = new i2d0(i2, (byte) 8);
        X = new i2d0(i2, (byte) 9);
        Y = new i2d0(i2, (byte) 10);
        Z = new i2d0(i2, (byte) 11);
        N0 = new i2d0(i2, (byte) 12);
        O0 = new i2d0(i2, (byte) 13);
        P0 = new i2d0(i2, (byte) 14);
        Q0 = new i2d0(i2, (byte) 15);
        R0 = new i2d0(i2, (byte) 16);
        S0 = new i2d0(i2, (byte) 17);
        T0 = new i2d0(i2, (byte) 18);
        U0 = new i2d0(i2, (byte) 19);
        V0 = new i2d0(i2, (byte) 20);
        W0 = new i2d0(i2, (byte) 21);
        X0 = new i2d0(i2, (byte) 22);
        Y0 = new i2d0(i2, (byte) 23);
        Z0 = new i2d0(i2, (byte) 24);
        a1 = new i2d0(i2, (byte) 25);
        b1 = new i2d0(i2, (byte) 26);
        c1 = new i2d0(i2, (byte) 27);
        d1 = new i2d0(i2, (byte) 28);
        e1 = new i2d0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i2d0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        Object obj5;
        byte b2 = this.a;
        int i2 = 2;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                ((Number) obj3).intValue();
                return new dcl0((r6h1) obj4);
            case 1:
                dcl0 dcl0Var = (dcl0) obj;
                String str = ((h2d0) obj2).c;
                if (!((g2d0) obj4).equals(g2d0.a)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC = dcl0Var.b.c();
                x6h1VarC.i.add(new a7h1("navigate_button", (String) null, (Integer) null, str, (String) null));
                x6h1VarC.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC.a(), dcl0Var.a, System.currentTimeMillis());
            case 2:
                ((Number) obj3).intValue();
                return new hbl0();
            case 3:
                y6h1 y6h1Var = ((hbl0) obj).a;
                int iOrdinal = ((w5d0) obj4).ordinal();
                if (iOrdinal == 0) {
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("got_it_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                } else if (iOrdinal == 1) {
                    x6h1 x6h1VarC3 = y6h1Var.c();
                    x6h1VarC3.i.add(new a7h1("manage_access_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    y6h1 y6h1VarA = x6h1VarC3.a();
                    String str2 = nik1.u4.a;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), y6h1VarA, r6h1.c, System.currentTimeMillis());
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC4 = y6h1Var.c();
                    x6h1VarC4.i.add(new a7h1("system_dismiss", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
            case 4:
                ((Number) obj3).intValue();
                return new ibl0();
            case 5:
                y6h1 y6h1Var2 = ((ibl0) obj).a;
                int iOrdinal2 = ((z6d0) obj4).ordinal();
                if (iOrdinal2 == 0) {
                    x6h1 x6h1VarC5 = y6h1Var2.c();
                    x6h1VarC5.i.add(new a7h1("got_it_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (iOrdinal2 != 1) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC6 = y6h1Var2.c();
                    x6h1VarC6.i.add(new a7h1("system_dismiss", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 6:
                ((Boolean) obj2).getClass();
                ((Number) obj3).intValue();
                return new w4m0((r6h1) obj4);
            case 7:
                w4m0 w4m0Var = (w4m0) obj;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                if (u7d0.a[((r7d0) obj4).ordinal()] == 1) {
                    return zBooleanValue ? w4m0Var.e(2, 1) : w4m0Var.e(1, 2);
                }
                eg.o();
                return null;
            case 8:
                ((Number) obj3).intValue();
                return new v4m0((String) null, (String) null, (r6h1) obj4);
            case 9:
                u4m0 u4m0Var = (u4m0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:collection:your-episodes:settings")), u4m0Var.a, u4m0Var.b.c.c.a, System.currentTimeMillis());
            case 10:
                swl0 swl0Var = (swl0) obj;
                u9d0 u9d0Var = (u9d0) obj4;
                if (u9d0Var instanceof t9d0) {
                    return swl0Var.a(nik1.u4.a);
                }
                if (u9d0Var instanceof s9d0) {
                    return null;
                }
                eg.o();
                return null;
            case 11:
                hcl0 hcl0Var = (hcl0) obj;
                if (((vad0) obj4) instanceof uad0) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), hcl0Var.a, r6h1.c, System.currentTimeMillis());
                }
                return null;
            case 12:
                ((Number) obj3).intValue();
                return new jcl0(new h7l0((byte) 27));
            case 13:
                return null;
            case 14:
                ((Number) obj3).intValue();
                return new ucl0();
            case 15:
                ucl0 ucl0Var = (ucl0) obj;
                x6h1 x6h1VarC7 = ucl0Var.b.c();
                x6h1VarC7.i.add(new a7h1("turn_on_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC7.a(), ucl0Var.a, System.currentTimeMillis());
            case 16:
                tfd0 tfd0Var = (tfd0) obj4;
                y6h1 y6h1Var3 = ((zvk0) obj).a;
                if (tfd0Var.equals(sfd0.a)) {
                    x6h1 x6h1VarC8 = y6h1Var3.c();
                    x6h1VarC8.i.add(new a7h1("turn_on_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis());
                }
                if (!tfd0Var.equals(rfd0.a)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC9 = y6h1Var3.c();
                x6h1VarC9.i.add(new a7h1("not_now_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC9.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC9.a(), r6h1.c, System.currentTimeMillis());
            case 17:
                ((Number) obj3).intValue();
                return new o7l0();
            case 18:
                o7l0 o7l0Var = (o7l0) obj;
                khd0 khd0Var = (khd0) obj2;
                jhd0 jhd0Var = (jhd0) obj4;
                if (!(jhd0Var instanceof jhd0)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC10 = o7l0Var.a.c();
                x6h1VarC10.i.add(new a7h1("listening_activity_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC10.j = false;
                y6h1 y6h1VarA2 = x6h1VarC10.a();
                char c2 = khd0Var.a ? (char) 2 : (char) 1;
                char c3 = jhd0Var.a ? (char) 2 : (char) 1;
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                String str3 = "listening_activity_off";
                if (c2 == 1) {
                    obj5 = "listening_activity_off";
                } else {
                    if (c2 != 2) {
                        throw null;
                    }
                    obj5 = "listening_activity_on";
                }
                mmr0 mmr0Var = new mmr0("state_before_toggle", obj5);
                if (c3 != 1) {
                    if (c3 != 2) {
                        throw null;
                    }
                    str3 = "listening_activity_on";
                }
                return new w7h1("", "", z7h1Var, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("state_after_toggle", str3)})), y6h1VarA2, r6h1.c, System.currentTimeMillis());
            case 19:
                ljd0 ljd0Var = (ljd0) obj;
                r6h1 r6h1Var = (r6h1) obj4;
                Integer numValueOf = Integer.valueOf(((Number) obj3).intValue());
                int iC = l1d.C(ljd0Var.b);
                if (iC == 0) {
                    i2 = 3;
                } else if (iC != 1) {
                    if (iC != 2) {
                        eg.o();
                        return null;
                    }
                    i2 = 1;
                }
                return new wcl0(i2, numValueOf, ljd0Var.a, r6h1Var);
            case 20:
                wcl0 wcl0Var = (wcl0) obj;
                ljd0 ljd0Var2 = (ljd0) obj2;
                gjd0 gjd0Var = (gjd0) obj4;
                String str4 = ljd0Var2.a;
                if (gjd0Var instanceof ejd0) {
                    return wcl0Var.a(str4);
                }
                if (!(gjd0Var instanceof fjd0)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC11 = wcl0Var.b.c();
                x6h1VarC11.i.add(new a7h1("room_description", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC11.j = false;
                y6h1 y6h1VarA3 = x6h1VarC11.a();
                i2 = ljd0Var2.f ? 1 : 2;
                x6h1 x6h1VarC12 = y6h1VarA3.c();
                x6h1VarC12.i.add(new a7h1("primary_action_button", z9l0.e(i2), (Integer) null, (String) null, (String) null));
                x6h1VarC12.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4 != null ? str4 : "")), x6h1VarC12.a(), wcl0Var.a, System.currentTimeMillis());
            case 21:
                ojd0 ojd0Var = (ojd0) obj2;
                ((Number) obj3).intValue();
                return new xcl0(Integer.valueOf(ojd0Var.e), ojd0Var.a, (r6h1) obj4);
            case 22:
                xcl0 xcl0Var = (xcl0) obj;
                ojd0 ojd0Var2 = (ojd0) obj3;
                if (!((njd0) obj4).equals(njd0.a)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC13 = xcl0Var.b.c();
                x6h1VarC13.i.add(new a7h1("card_container", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC13.j = false;
                y6h1 y6h1VarA4 = x6h1VarC13.a();
                String str5 = ojd0Var2.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5 != null ? str5 : "")), y6h1VarA4, xcl0Var.a, System.currentTimeMillis());
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((Number) obj3).intValue();
                r6h1 r6h1Var2 = cld0.e;
                int iOrdinal3 = ((bld0) obj).a.ordinal();
                if (iOrdinal3 == 0) {
                    i2 = 1;
                } else if (iOrdinal3 != 1) {
                    eg.o();
                    return null;
                }
                return new ycl0(i2, r6h1Var2);
            case 24:
                ycl0 ycl0Var = (ycl0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:upsell:premium_in_app_destination?displayReason=kpop_upsell:listening_parties")), ycl0Var.b, ycl0Var.a, System.currentTimeMillis());
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                zyl0 zyl0Var = (zyl0) obj;
                emd0 emd0Var = (emd0) obj4;
                Integer numValueOf2 = Integer.valueOf(emd0Var.a);
                String str6 = emd0Var.b;
                x6h1 x6h1VarC14 = zyl0Var.a.c();
                x6h1VarC14.i.add(new a7h1("stats_card", (String) null, numValueOf2, str6, (String) null));
                x6h1VarC14.j = true;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str6)), x6h1VarC14.a(), zyl0Var.b.a, System.currentTimeMillis());
            case 26:
                return null;
            case 27:
                return new zm0((Context) obj2);
            case 28:
                return new tpd0((Context) obj2, (byte) 0);
            default:
                return new tpd0((Context) obj2, (byte) 1);
        }
    }
}
