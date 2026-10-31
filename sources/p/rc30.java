package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rc30 extends hab0 implements zu30 {
    public static final rc30 N0;
    public static final rc30 O0;
    public static final rc30 P0;
    public static final rc30 Q0;
    public static final rc30 R0;
    public static final rc30 S0;
    public static final rc30 T0;
    public static final rc30 U0;
    public static final rc30 V0;
    public static final rc30 W0;
    public static final rc30 X;
    public static final rc30 X0;
    public static final rc30 Y;
    public static final rc30 Y0;
    public static final rc30 Z;
    public static final rc30 Z0;
    public static final rc30 a1;
    public static final rc30 b;
    public static final rc30 b1;
    public static final rc30 c;
    public static final rc30 c1;
    public static final rc30 d;
    public static final rc30 d1;
    public static final rc30 e;
    public static final rc30 e1;
    public static final rc30 f;
    public static final rc30 g;
    public static final rc30 h;
    public static final rc30 i;
    public static final rc30 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new rc30(i2, (byte) 0);
        c = new rc30(i2, (byte) 1);
        d = new rc30(i2, (byte) 2);
        e = new rc30(i2, (byte) 3);
        f = new rc30(i2, (byte) 4);
        g = new rc30(i2, (byte) 5);
        h = new rc30(i2, (byte) 6);
        i = new rc30(i2, (byte) 7);
        t = new rc30(i2, (byte) 8);
        X = new rc30(i2, (byte) 9);
        Y = new rc30(i2, (byte) 10);
        Z = new rc30(i2, (byte) 11);
        N0 = new rc30(i2, (byte) 12);
        O0 = new rc30(i2, (byte) 13);
        P0 = new rc30(i2, (byte) 14);
        Q0 = new rc30(i2, (byte) 15);
        R0 = new rc30(i2, (byte) 16);
        S0 = new rc30(i2, (byte) 17);
        T0 = new rc30(i2, (byte) 18);
        U0 = new rc30(i2, (byte) 19);
        V0 = new rc30(i2, (byte) 20);
        W0 = new rc30(i2, (byte) 21);
        X0 = new rc30(i2, (byte) 22);
        Y0 = new rc30(i2, (byte) 23);
        Z0 = new rc30(i2, (byte) 24);
        a1 = new rc30(i2, (byte) 25);
        b1 = new rc30(i2, (byte) 26);
        c1 = new rc30(i2, (byte) 27);
        d1 = new rc30(i2, (byte) 28);
        e1 = new rc30(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rc30(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        Object obj5;
        w7h1 w7h1Var3;
        w7h1 w7h1Var4;
        w7h1 w7h1Var5;
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                ((Number) obj3).intValue();
                return new g7l0((r6h1) obj4);
            case 1:
                g7l0 g7l0Var = (g7l0) obj;
                if (!((nc30) obj4).equals(nc30.a)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC = g7l0Var.b.c();
                x6h1VarC.i.add(new a7h1("get_started_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                String str = nik1.i4.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), y6h1VarA, g7l0Var.a, System.currentTimeMillis());
            case 2:
                ((Number) obj3).intValue();
                return new e9l0((r6h1) obj4);
            case 3:
                e9l0 e9l0Var = (e9l0) obj;
                if (((zd30) obj4) != zd30.a) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC2 = e9l0Var.b.c();
                x6h1VarC2.i.add(new a7h1("forgot_your_pin_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", "https://www.spotify.com/account/change-pin/?source=mobile")), x6h1VarC2.a(), e9l0Var.a, System.currentTimeMillis());
            case 4:
                ((Number) obj3).intValue();
                return new fbl0();
            case 5:
                y6h1 y6h1Var = ((fbl0) obj).a;
                int iOrdinal = ((ym30) obj4).ordinal();
                if (iOrdinal == 0) {
                    x6h1 x6h1VarC3 = y6h1Var.c();
                    x6h1VarC3.i.add(new a7h1("explore_premium_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC3.a();
                    String str2 = nik1.b2.a;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("show_paywall", 1, Collections.singletonMap("paywalled_item", str2 != null ? str2 : "")), y6h1VarA2, r6h1.c, System.currentTimeMillis());
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC4 = y6h1Var.c();
                    x6h1VarC4.i.add(new a7h1("system_dismiss", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
            case 6:
                ((Number) obj3).intValue();
                return new gbl0();
            case 7:
                y6h1 y6h1Var2 = ((gbl0) obj).a;
                int iOrdinal2 = ((in30) obj4).ordinal();
                if (iOrdinal2 == 0) {
                    x6h1 x6h1VarC5 = y6h1Var2.c();
                    x6h1VarC5.i.add(new a7h1("explore_premium_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    y6h1 y6h1VarA3 = x6h1VarC5.a();
                    String str3 = nik1.b2.a;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("show_paywall", 1, Collections.singletonMap("paywalled_item", str3 != null ? str3 : "")), y6h1VarA3, r6h1.c, System.currentTimeMillis());
                } else if (iOrdinal2 == 1) {
                    x6h1 x6h1VarC6 = y6h1Var2.c();
                    x6h1VarC6.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (iOrdinal2 != 2) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC7 = y6h1Var2.c();
                    x6h1VarC7.i.add(new a7h1("system_dismiss", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 8:
                ((Number) obj3).intValue();
                return new kwl0(2);
            case 9:
                kwl0 kwl0Var = (kwl0) obj;
                do30 do30Var = (do30) obj2;
                if (fo30.a[((co30) obj4).ordinal()] == 1) {
                    Set set = s4b1.f;
                    obj5 = null;
                    String strZ = uic.C(do30Var.a, null).z();
                    if (strZ != null) {
                        x6h1 x6h1VarC8 = kwl0Var.a.c();
                        x6h1VarC8.i.add(new a7h1("send_friend_request_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC8.j = false;
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("send_friend_request", 1, Collections.singletonMap("user_to_receive_friend_request", strZ)), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis());
                    }
                    hhg1.n("Required value was null.");
                } else {
                    obj5 = null;
                    eg.o();
                }
                return obj5;
            case 10:
                return new mql0(new lql0(new pql0(), (byte) 1), Integer.valueOf(((Number) obj3).intValue()), ((jo30) obj).a);
            case 11:
                jo30 jo30Var = (jo30) obj2;
                y6h1 y6h1Var3 = ((mql0) obj).a;
                xis0 xis0Var = ((io30) obj4).a;
                if (!(xis0Var instanceof xis0)) {
                    if (xis0Var.equals(yis0.a)) {
                        x6h1 x6h1VarC9 = y6h1Var3.c();
                        x6h1VarC9.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC9.j = false;
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC9.a(), r6h1.c, System.currentTimeMillis());
                        return w7h1Var3;
                    }
                    return null;
                }
                if (u890.j(xis0Var.a, uis0.b)) {
                    x6h1 x6h1VarC10 = y6h1Var3.c();
                    x6h1VarC10.i.add(new a7h1("message_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    y6h1 y6h1VarA4 = x6h1VarC10.a();
                    String str4 = jo30Var.a;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4 != null ? str4 : "")), y6h1VarA4, r6h1.c, System.currentTimeMillis());
                    return w7h1Var3;
                }
                return null;
            case 12:
                ((Number) obj3).intValue();
                return rih1.a;
            case 13:
                return null;
            case 14:
                ((Number) obj3).intValue();
                return new x6l0(((yq30) obj2).a, (r6h1) obj4);
            case 15:
                x6l0 x6l0Var = (x6l0) obj;
                String str5 = ((yq30) obj3).a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5 != null ? str5 : "")), x6l0Var.b, x6l0Var.a, System.currentTimeMillis());
            case 16:
                ((Number) obj3).intValue();
                return new jil0((r6h1) obj4);
            case 17:
                jil0 jil0Var = (jil0) obj;
                sr30 sr30Var = (sr30) obj4;
                r6h1 r6h1Var = jil0Var.a;
                y6h1 y6h1Var4 = jil0Var.b;
                if (sr30Var.equals(qr30.a)) {
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var4, r6h1Var, System.currentTimeMillis());
                } else {
                    if (!sr30Var.equals(rr30.a)) {
                        eg.o();
                        return null;
                    }
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1Var4, r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var4;
            case 18:
                qs30 qs30Var = (qs30) obj2;
                ((Number) obj3).intValue();
                uel0 uel0Var = new uel0(qs30Var.a);
                return qs30Var.b ? new fel0(new iel0(uel0Var, (byte) 0)) : new jel0(new iel0(uel0Var, (byte) 1));
            case 19:
                n8h1 n8h1Var = (n8h1) obj;
                return ((qs30) obj3).b ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "")), ((fel0) n8h1Var).a, r6h1.c, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "")), ((jel0) n8h1Var).a, r6h1.c, System.currentTimeMillis());
            case 20:
                us30 us30Var = (us30) obj2;
                ((Number) obj3).intValue();
                uel0 uel0Var2 = new uel0(us30Var.a);
                return us30Var.e ? new hel0(new iel0(uel0Var2, (byte) 0)) : new lel0(new iel0(uel0Var2, (byte) 1), us30Var.c, us30Var.d);
            case 21:
                n8h1 n8h1Var2 = (n8h1) obj;
                us30 us30Var2 = (us30) obj3;
                if (us30Var2.e) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "")), ((hel0) n8h1Var2).a, r6h1.c, System.currentTimeMillis());
                }
                mmr0 mmr0Var = us30Var2.b ? new mmr0(pel0.TRANSLATION_ENABLED, oel0.TRANSLATION_DISABLED) : new mmr0(pel0.TRANSLATION_DISABLED, oel0.TRANSLATION_ENABLED);
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{new mmr0("state_before_toggle", ((pel0) mmr0Var.a).a), new mmr0("state_after_toggle", ((oel0) mmr0Var.b).a)})), ((lel0) n8h1Var2).a, r6h1.c, System.currentTimeMillis());
            case 22:
                ((Number) obj3).intValue();
                return new mel0(new iel0(new uel0(((xs30) obj2).a), (byte) 1));
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                mel0 mel0Var = (mel0) obj;
                mmr0 mmr0Var2 = ((xs30) obj3).b ? new mmr0(rel0.VOCAL_REMOVAL_ENABLED, qel0.VOCAL_REMOVAL_DISABLED) : new mmr0(rel0.VOCAL_REMOVAL_DISABLED, qel0.VOCAL_REMOVAL_ENABLED);
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{new mmr0("state_before_toggle", ((rel0) mmr0Var2.a).a), new mmr0("state_after_toggle", ((qel0) mmr0Var2.b).a)})), mel0Var.a, r6h1.c, System.currentTimeMillis());
            case 24:
                ((Number) obj3).intValue();
                return new nel0(new iel0(new uel0(((at30) obj2).a), (byte) 1));
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                nel0 nel0Var = (nel0) obj;
                mmr0 mmr0Var3 = ((at30) obj3).b == xlk1.c ? new mmr0(tel0.LOW_VOCALS_VOLUME, sel0.HIGH_VOCALS_VOLUME) : new mmr0(tel0.HIGH_VOCALS_VOLUME, sel0.LOW_VOCALS_VOLUME);
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{new mmr0("state_before_toggle", ((tel0) mmr0Var3.a).a), new mmr0("state_after_toggle", ((sel0) mmr0Var3.b).a)})), nel0Var.a, r6h1.c, System.currentTimeMillis());
            case 26:
                ((Number) obj3).intValue();
                return new jsl0((r6h1) obj4);
            case 27:
                jsl0 jsl0Var = (jsl0) obj;
                f040 f040Var = (f040) obj2;
                d040 d040Var = (d040) obj4;
                r6h1 r6h1Var2 = jsl0Var.a;
                y6h1 y6h1Var5 = jsl0Var.b;
                String str6 = f040Var.b;
                if (d040Var.equals(uz30.a)) {
                    if (f040Var.a instanceof ez30) {
                        x6h1 x6h1VarC11 = y6h1Var5.c();
                        x6h1VarC11.i.add(new a7h1("challenge_friend_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC11.j = false;
                        w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("share", 2, sqg0.J(new mmr0[]{new mmr0("entity_to_be_shared", str6), new mmr0("share_id", "music-quiz-share-id")})), x6h1VarC11.a(), r6h1Var2, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC12 = y6h1Var5.c();
                        x6h1VarC12.i.add(new a7h1("share_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC12.j = false;
                        w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("share", 2, sqg0.J(new mmr0[]{new mmr0("entity_to_be_shared", str6), new mmr0("share_id", "music-quiz-share-id")})), x6h1VarC12.a(), r6h1Var2, System.currentTimeMillis());
                    }
                } else {
                    if (!d040Var.equals(zz30.a)) {
                        return null;
                    }
                    x6h1 x6h1VarC13 = y6h1Var5.c();
                    x6h1VarC13.i.add(new a7h1("play_another_quiz_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC13.j = false;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "")), x6h1VarC13.a(), r6h1Var2, System.currentTimeMillis());
                }
                return w7h1Var5;
            case 28:
                return null;
            default:
                return new kjl0(Integer.valueOf(((Number) obj3).intValue()), (r6h1) obj4);
        }
    }
}
