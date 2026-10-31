package p;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n3o0 extends hab0 implements zu30 {
    public static final n3o0 N0;
    public static final n3o0 O0;
    public static final n3o0 P0;
    public static final n3o0 Q0;
    public static final n3o0 R0;
    public static final n3o0 S0;
    public static final n3o0 T0;
    public static final n3o0 U0;
    public static final n3o0 V0;
    public static final n3o0 W0;
    public static final n3o0 X;
    public static final n3o0 X0;
    public static final n3o0 Y;
    public static final n3o0 Y0;
    public static final n3o0 Z;
    public static final n3o0 Z0;
    public static final n3o0 a1;
    public static final n3o0 b;
    public static final n3o0 b1;
    public static final n3o0 c;
    public static final n3o0 c1;
    public static final n3o0 d;
    public static final n3o0 d1;
    public static final n3o0 e;
    public static final n3o0 e1;
    public static final n3o0 f;
    public static final n3o0 g;
    public static final n3o0 h;
    public static final n3o0 i;
    public static final n3o0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new n3o0(i2, (byte) 0);
        c = new n3o0(i2, (byte) 1);
        d = new n3o0(i2, (byte) 2);
        e = new n3o0(i2, (byte) 3);
        f = new n3o0(i2, (byte) 4);
        g = new n3o0(i2, (byte) 5);
        h = new n3o0(i2, (byte) 6);
        i = new n3o0(i2, (byte) 7);
        t = new n3o0(i2, (byte) 8);
        X = new n3o0(i2, (byte) 9);
        Y = new n3o0(i2, (byte) 10);
        Z = new n3o0(i2, (byte) 11);
        N0 = new n3o0(i2, (byte) 12);
        O0 = new n3o0(i2, (byte) 13);
        P0 = new n3o0(i2, (byte) 14);
        Q0 = new n3o0(i2, (byte) 15);
        R0 = new n3o0(i2, (byte) 16);
        S0 = new n3o0(i2, (byte) 17);
        T0 = new n3o0(i2, (byte) 18);
        U0 = new n3o0(i2, (byte) 19);
        V0 = new n3o0(i2, (byte) 20);
        W0 = new n3o0(i2, (byte) 21);
        X0 = new n3o0(i2, (byte) 22);
        Y0 = new n3o0(i2, (byte) 23);
        Z0 = new n3o0(i2, (byte) 24);
        a1 = new n3o0(i2, (byte) 25);
        b1 = new n3o0(i2, (byte) 26);
        c1 = new n3o0(i2, (byte) 27);
        d1 = new n3o0(i2, (byte) 28);
        e1 = new n3o0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n3o0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        mmr0 mmr0Var;
        w7h1 w7h1Var3;
        w7h1 w7h1Var4;
        w7h1 w7h1Var5;
        w7h1 w7h1Var6;
        w7h1 w7h1Var7;
        byte b2 = this.a;
        s710 s710Var = s710.a;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                ((Number) obj3).intValue();
                int iOrdinal = ((pao0) obj).a.ordinal();
                if (iOrdinal == 0) {
                    i2 = 3;
                } else if (iOrdinal == 1) {
                    i2 = 2;
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    i2 = 1;
                }
                return new s4l0(new t4l0(i2));
            case 4:
                s4l0 s4l0Var = (s4l0) obj;
                if (((oao0) obj4).equals(oao0.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:new:playlist")), s4l0Var.a, r6h1.c, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 5:
                ((Number) obj3).intValue();
                return new r4l0((r6h1) obj4);
            case 6:
                r4l0 r4l0Var = (r4l0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:new:playlist")), r4l0Var.b, r4l0Var.a, System.currentTimeMillis());
            case 7:
                ((Number) obj3).intValue();
                return new k3m0(new brl0((byte) 20), ((beo0) obj).a);
            case 8:
                return null;
            case 9:
                km61 km61Var = (km61) obj;
                Integer num = (Integer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                boolean z4 = num != null && iIntValue > num.intValue();
                if (!z4 || iIntValue != 6) {
                    z = false;
                    if (z4 && iIntValue == 5) {
                        km61.a(km61Var, "wifiWarning", (Bundle) null, false, 6);
                    } else {
                        z2 = true;
                    }
                    return Boolean.valueOf(z2);
                }
                z = false;
                km61.a(km61Var, "internalQualityWifiWarning", (Bundle) null, false, 6);
                z2 = z;
                return Boolean.valueOf(z2);
            case 10:
                km61 km61Var2 = (km61) obj;
                Integer num2 = (Integer) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                boolean z5 = num2 != null && iIntValue2 > num2.intValue();
                if (z5 && iIntValue2 == 6) {
                    km61.a(km61Var2, "internalQualityWifiWarning", (Bundle) null, false, 6);
                    z3 = false;
                } else if (z5 && iIntValue2 == 5) {
                    km61.a(km61Var2, "wifiWarning", (Bundle) null, false, 6);
                    z3 = false;
                } else {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 11:
                ((Number) obj3).intValue();
                return new anl0(3, ((ggo0) obj2).a.b);
            case 12:
                r231 r231Var = (r231) obj2;
                y6h1 y6h1Var = ((anl0) obj).a;
                int iOrdinal2 = ((fgo0) obj4).ordinal();
                if (iOrdinal2 == 0) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("home_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:home")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (iOrdinal2 != 1) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("remove_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    y6h1 y6h1VarA = x6h1VarC2.a();
                    String str = r231Var.b;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("delete_playlist", 1, Collections.singletonMap("playlist_to_be_deleted", str == null ? "" : str)), y6h1VarA, r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
            case 13:
                ((Number) obj3).intValue();
                return new j3l0(((rho0) obj).a.a.a, (r6h1) obj4);
            case 14:
                j3l0 j3l0Var = (j3l0) obj;
                qho0 qho0Var = (qho0) obj4;
                r6h1 r6h1Var = j3l0Var.a;
                y6h1 y6h1Var2 = j3l0Var.b;
                if (qho0Var instanceof pho0) {
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var2, r6h1Var, System.currentTimeMillis());
                } else {
                    if (!(qho0Var instanceof oho0)) {
                        eg.o();
                        return null;
                    }
                    oho0 oho0Var = (oho0) qho0Var;
                    String str2 = oho0Var.a;
                    x6h1 x6h1VarC3 = y6h1Var2.c();
                    x6h1VarC3.i.add(new a7h1("author_button", (String) null, (Integer) null, str2, (String) null));
                    x6h1VarC3.j = true;
                    y6h1 y6h1VarA2 = x6h1VarC3.a();
                    String str3 = oho0Var.a;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3 == null ? "" : str3)), y6h1VarA2, r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 15:
                return new as0((Context) obj2, (iu30) obj4, (byte) 19);
            case 16:
                vol0 vol0Var = (vol0) obj;
                amo0 amo0Var = ((bmo0) obj3).b;
                if (amo0Var.equals(zlo0.a)) {
                    mmr0Var = new mmr0(xol0.DISABLED, wol0.ENABLED);
                } else {
                    if (!amo0Var.equals(ylo0.a)) {
                        eg.o();
                        return null;
                    }
                    mmr0Var = new mmr0(xol0.ENABLED, wol0.DISABLED);
                }
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{new mmr0("state_before_toggle", ((xol0) mmr0Var.a).a), new mmr0("state_after_toggle", ((wol0) mmr0Var.b).a)})), vol0Var.a, vol0Var.b.c.c.a, System.currentTimeMillis());
            case 17:
                ((Number) obj3).intValue();
                return new evk0((r6h1) obj4);
            case 18:
                evk0 evk0Var = (evk0) obj;
                joo0 joo0Var = (joo0) obj3;
                eoo0 eoo0Var = (eoo0) obj4;
                r6h1 r6h1Var2 = evk0Var.a;
                y6h1 y6h1Var3 = evk0Var.b;
                if (!eoo0Var.equals(doo0.a)) {
                    if (!eoo0Var.equals(coo0.a)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC4 = y6h1Var3.c();
                    x6h1VarC4.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1Var2, System.currentTimeMillis());
                    return w7h1Var3;
                }
                x6h1 x6h1VarC5 = y6h1Var3.c();
                x6h1VarC5.i.add(new a7h1("action_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                y6h1 y6h1VarA3 = x6h1VarC5.a();
                int iC = l1d.C(joo0Var.d);
                if (iC == 0) {
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("open_os_settings", 1, b7xVar), y6h1VarA3, r6h1Var2, System.currentTimeMillis());
                } else if (iC == 1) {
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA3, r6h1Var2, System.currentTimeMillis());
                } else {
                    if (iC != 2) {
                        if (iC != 3) {
                            eg.o();
                        }
                        return null;
                    }
                    String str4 = nik1.F2.a;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4 == null ? "" : str4)), y6h1VarA3, r6h1Var2, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 19:
                ((Number) obj3).intValue();
                return new ixk0();
            case 20:
                ppo0 ppo0Var = (ppo0) obj4;
                y6h1 y6h1Var4 = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-comments-notification-opt-in";
                x6h1VarI.f = "2.0.0";
                x6h1VarI.g = "22.0.0";
                y6h1 y6h1VarA4 = x6h1VarI.a();
                if (ppo0Var instanceof kpo0) {
                    x6h1 x6h1VarC6 = y6h1VarA4.c();
                    x6h1VarC6.i.add(new a7h1("notification_opt_in_sheet", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    x6h1 x6h1VarC7 = x6h1VarC6.a().c();
                    x6h1VarC7.i.add(new a7h1("confirm_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis());
                } else if (ppo0Var instanceof npo0) {
                    x6h1 x6h1VarC8 = y6h1VarA4.c();
                    x6h1VarC8.i.add(new a7h1("notification_opt_in_sheet", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    x6h1 x6h1VarC9 = x6h1VarC8.a().c();
                    x6h1VarC9.i.add(new a7h1("dismiss", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC9.a(), r6h1.c, System.currentTimeMillis());
                } else if (ppo0Var instanceof lpo0) {
                    x6h1 x6h1VarC10 = y6h1VarA4.c();
                    x6h1VarC10.i.add(new a7h1("system_notification_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    x6h1 x6h1VarC11 = x6h1VarC10.a().c();
                    x6h1VarC11.i.add(new a7h1("accept_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC11.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", "android.settings.APP_NOTIFICATION_SETTINGS")), x6h1VarC11.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!(ppo0Var instanceof mpo0)) {
                        if (!(ppo0Var instanceof opo0)) {
                            eg.o();
                        }
                        return null;
                    }
                    x6h1 x6h1VarC12 = y6h1VarA4.c();
                    x6h1VarC12.i.add(new a7h1("system_notification_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC12.j = false;
                    x6h1 x6h1VarC13 = x6h1VarC12.a().c();
                    x6h1VarC13.i.add(new a7h1("reject_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC13.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC13.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var4;
            case 21:
                h0p0 h0p0Var = (h0p0) obj;
                izo0 izo0Var = (izo0) obj2;
                fzo0 fzo0Var = (fzo0) obj4;
                y6h1 y6h1Var5 = h0p0Var.a;
                v7u0 v7u0Var = ((jzo0) obj3).b;
                long j = v7u0Var.c;
                long j2 = v7u0Var.b;
                String str5 = v7u0Var.a;
                if (fzo0Var instanceof czo0) {
                    x6h1 x6h1VarC14 = y6h1Var5.c();
                    x6h1VarC14.i.add(new a7h1("horizontal_layout", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC14.j = false;
                    x6h1 x6h1VarC15 = x6h1VarC14.a().c();
                    x6h1VarC15.i.add(new a7h1("track_carousel", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC15.j = false;
                    y6h1 y6h1VarA5 = x6h1VarC15.a();
                    int i3 = (int) j;
                    z7h1 z7h1Var = new z7h1("swipe_right", 1, b7xVar);
                    mmr0 mmr0Var2 = new mmr0("item_to_be_skipped", str5);
                    String strValueOf = String.valueOf((int) j2);
                    if (strValueOf == null) {
                        strValueOf = "";
                    }
                    mmr0 mmr0Var3 = new mmr0("position_ms", strValueOf);
                    String strValueOf2 = String.valueOf(i3);
                    w7h1Var5 = new w7h1("", "", z7h1Var, new x7h1("skip_to_previous", 2, sqg0.J(new mmr0[]{mmr0Var2, mmr0Var3, new mmr0("total_content_ms", strValueOf2 == null ? "" : strValueOf2)})), y6h1VarA5, r6h1.c, System.currentTimeMillis());
                } else {
                    if (!(fzo0Var instanceof dzo0)) {
                        if (!(fzo0Var instanceof ezo0)) {
                            if (!(fzo0Var instanceof bzo0)) {
                                eg.o();
                            } else if (izo0Var.a) {
                                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                                return h0p0Var.a(yon1.X2().c);
                            }
                        }
                        return null;
                    }
                    x6h1 x6h1VarC16 = y6h1Var5.c();
                    x6h1VarC16.i.add(new a7h1("horizontal_layout", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC16.j = false;
                    x6h1 x6h1VarC17 = x6h1VarC16.a().c();
                    x6h1VarC17.i.add(new a7h1("track_carousel", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC17.j = false;
                    y6h1 y6h1VarA6 = x6h1VarC17.a();
                    int i4 = (int) j;
                    z7h1 z7h1Var2 = new z7h1("swipe_left", 1, b7xVar);
                    mmr0 mmr0Var4 = new mmr0("item_to_be_skipped", str5);
                    String strValueOf3 = String.valueOf((int) j2);
                    if (strValueOf3 == null) {
                        strValueOf3 = "";
                    }
                    mmr0 mmr0Var5 = new mmr0("position_ms", strValueOf3);
                    String strValueOf4 = String.valueOf(i4);
                    w7h1Var5 = new w7h1("", "", z7h1Var2, new x7h1("skip_to_next", 2, sqg0.J(new mmr0[]{mmr0Var4, mmr0Var5, new mmr0("total_content_ms", strValueOf4 == null ? "" : strValueOf4)})), y6h1VarA6, r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var5;
            case 22:
                Context context = (Context) obj2;
                return new i1p0(ago1.o(context, 2130968772, 0), context, (ViewGroup) obj3, (iu30) obj4);
            case 23:
                ((Number) obj3).intValue();
                return new o4m0();
            case 24:
                o4m0 o4m0Var = (o4m0) obj;
                gmm1 gmm1Var = (gmm1) obj4;
                y6h1 y6h1Var6 = o4m0Var.a;
                String str6 = ((w9p0) obj3).a;
                r6h1 r6h1VarB = o4m0Var.b();
                y6h1 y6h1Var7 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-xr-glasses-touch-controls";
                x6h1VarI2.f = "2.1.0";
                x6h1VarI2.g = "22.0.0";
                y6h1 y6h1VarA7 = x6h1VarI2.a();
                if (gmm1Var.equals(wlm1.a)) {
                    x6h1 x6h1VarC18 = y6h1Var6.c();
                    x6h1VarC18.i.add(new a7h1("play_pause_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC18.j = false;
                    w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("resume", 1, Collections.singletonMap("item_to_be_resumed", str6 != null ? str6 : "")), x6h1VarC18.a(), r6h1.c, System.currentTimeMillis());
                } else if (gmm1Var.equals(ulm1.a)) {
                    x6h1 x6h1VarC19 = y6h1Var6.c();
                    x6h1VarC19.i.add(new a7h1("play_pause_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC19.j = false;
                    w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("pause", 1, Collections.singletonMap("item_to_be_paused", str6 != null ? str6 : "")), x6h1VarC19.a(), r6h1.c, System.currentTimeMillis());
                } else if (gmm1Var.equals(dmm1.a)) {
                    x6h1 x6h1VarC20 = y6h1Var6.c();
                    x6h1VarC20.i.add(new a7h1("skip_next_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC20.j = false;
                    w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("skip_to_next", 2, sqg0.J(new mmr0[]{new mmr0("item_to_be_skipped", str6 == null ? "" : str6), new mmr0("position_ms", ""), new mmr0("total_content_ms", "")})), x6h1VarC20.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!gmm1Var.equals(fmm1.a)) {
                        if (gmm1Var.equals(bmm1.a)) {
                            x6h1 x6h1VarC21 = y6h1Var6.c();
                            x6h1VarC21.i.add(new a7h1("skip_next_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC21.j = false;
                            y6h1 y6h1VarA8 = x6h1VarC21.a();
                            z7h1 z7h1Var3 = new z7h1("hit", 1, b7xVar);
                            String strValueOf5 = String.valueOf(15000);
                            w7h1Var7 = new w7h1("", "", z7h1Var3, new x7h1("seek_by_time", 1, Collections.singletonMap("ms_seeked_offset", strValueOf5 != null ? strValueOf5 : "")), y6h1VarA8, r6h1.c, System.currentTimeMillis());
                        } else if (gmm1Var.equals(zlm1.a)) {
                            x6h1 x6h1VarC22 = y6h1Var6.c();
                            x6h1VarC22.i.add(new a7h1("skip_previous_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC22.j = false;
                            y6h1 y6h1VarA9 = x6h1VarC22.a();
                            z7h1 z7h1Var4 = new z7h1("hit", 1, b7xVar);
                            String strValueOf6 = String.valueOf(15000);
                            w7h1Var7 = new w7h1("", "", z7h1Var4, new x7h1("seek_by_time", 1, Collections.singletonMap("ms_seeked_offset", strValueOf6 != null ? strValueOf6 : "")), y6h1VarA9, r6h1.c, System.currentTimeMillis());
                        } else {
                            if (gmm1Var.equals(slm1.a)) {
                                x6h1 x6h1VarC23 = y6h1Var6.c();
                                x6h1VarC23.i.add(new a7h1("lyrics_button", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC23.j = false;
                                y6h1 y6h1VarA10 = x6h1VarC23.a();
                                AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", yon1.G1("XRPROJECTED_LYRICS", "xrprojected/lyrics", 2248, "xrprojected").c)), y6h1VarA10, r6h1.c, System.currentTimeMillis());
                            }
                            if (gmm1Var.equals(vlm1.a)) {
                                x6h1 x6h1VarC24 = y6h1VarA7.c();
                                x6h1VarC24.i.add(new a7h1("play_pause_gesture", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC24.j = false;
                                w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("resume", 1, Collections.singletonMap("item_to_be_resumed", str6 != null ? str6 : "")), x6h1VarC24.a(), r6h1VarB, System.currentTimeMillis());
                            } else if (gmm1Var.equals(tlm1.a)) {
                                x6h1 x6h1VarC25 = y6h1VarA7.c();
                                x6h1VarC25.i.add(new a7h1("play_pause_gesture", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC25.j = false;
                                w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("pause", 1, Collections.singletonMap("item_to_be_paused", str6 != null ? str6 : "")), x6h1VarC25.a(), r6h1VarB, System.currentTimeMillis());
                            } else if (gmm1Var.equals(cmm1.a)) {
                                x6h1 x6h1VarC26 = y6h1VarA7.c();
                                x6h1VarC26.i.add(new a7h1("skip_next_gesture", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC26.j = false;
                                w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("skip_to_next", 2, sqg0.J(new mmr0[]{new mmr0("item_to_be_skipped", str6 == null ? "" : str6), new mmr0("position_ms", ""), new mmr0("total_content_ms", "")})), x6h1VarC26.a(), r6h1VarB, System.currentTimeMillis());
                            } else if (gmm1Var.equals(emm1.a)) {
                                x6h1 x6h1VarC27 = y6h1VarA7.c();
                                x6h1VarC27.i.add(new a7h1("skip_previous_gesture", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC27.j = false;
                                w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("skip_to_previous", 2, sqg0.J(new mmr0[]{new mmr0("item_to_be_skipped", str6 == null ? "" : str6), new mmr0("position_ms", ""), new mmr0("total_content_ms", "")})), x6h1VarC27.a(), r6h1VarB, System.currentTimeMillis());
                            } else if (gmm1Var.equals(amm1.a)) {
                                x6h1 x6h1VarC28 = y6h1VarA7.c();
                                x6h1VarC28.i.add(new a7h1("skip_next_gesture", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC28.j = false;
                                y6h1 y6h1VarA11 = x6h1VarC28.a();
                                z7h1 z7h1Var5 = new z7h1("hit", 1, b7xVar);
                                String strValueOf7 = String.valueOf(15000);
                                w7h1Var6 = new w7h1("", "", z7h1Var5, new x7h1("seek_by_time", 1, Collections.singletonMap("ms_seeked_offset", strValueOf7 != null ? strValueOf7 : "")), y6h1VarA11, r6h1VarB, System.currentTimeMillis());
                            } else {
                                if (!gmm1Var.equals(ylm1.a)) {
                                    return null;
                                }
                                x6h1 x6h1VarC29 = y6h1VarA7.c();
                                x6h1VarC29.i.add(new a7h1("skip_previous_gesture", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC29.j = false;
                                y6h1 y6h1VarA12 = x6h1VarC29.a();
                                z7h1 z7h1Var6 = new z7h1("hit", 1, b7xVar);
                                String strValueOf8 = String.valueOf(15000);
                                w7h1Var6 = new w7h1("", "", z7h1Var6, new x7h1("seek_by_time", 1, Collections.singletonMap("ms_seeked_offset", strValueOf8 != null ? strValueOf8 : "")), y6h1VarA12, r6h1VarB, System.currentTimeMillis());
                            }
                        }
                        return w7h1Var7;
                    }
                    x6h1 x6h1VarC30 = y6h1Var6.c();
                    x6h1VarC30.i.add(new a7h1("skip_previous_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC30.j = false;
                    w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("skip_to_previous", 2, sqg0.J(new mmr0[]{new mmr0("item_to_be_skipped", str6 == null ? "" : str6), new mmr0("position_ms", ""), new mmr0("total_content_ms", "")})), x6h1VarC30.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var6;
            case 25:
                etl0 etl0Var = (etl0) obj;
                why whyVar = (why) obj2;
                uhy uhyVar = (uhy) obj4;
                if (uhyVar.equals(thy.a)) {
                    return etl0Var.a(whyVar.g);
                }
                if (uhyVar.equals(shy.a)) {
                    return etl0Var.h();
                }
                eg.o();
                return null;
            case 26:
                dtl0 dtl0Var = (dtl0) obj;
                t710 t710Var = (t710) obj2;
                if (((s710) obj4).equals(s710Var)) {
                    String str7 = t710Var.b;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str7 != null ? str7 : "")), dtl0Var.a, dtl0Var.b.b.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 27:
                ftl0 ftl0Var = (ftl0) obj;
                t710 t710Var2 = (t710) obj2;
                if (((s710) obj4).equals(s710Var)) {
                    String str8 = t710Var2.b;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str8 != null ? str8 : "")), ftl0Var.a, ftl0Var.b.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 28:
                yxl0 yxl0Var = (yxl0) obj;
                kmp0 kmp0Var = (kmp0) obj3;
                if (!(((imp0) obj4) instanceof imp0)) {
                    eg.o();
                    return null;
                }
                String str9 = kmp0Var.d.a.a.a.a;
                z7h1 z7h1Var7 = new z7h1("hit", 1, b7xVar);
                if (str9 == null) {
                    str9 = "";
                }
                return new w7h1("", "", z7h1Var7, new x7h1("share", 2, sqg0.J(new mmr0[]{new mmr0("entity_to_be_shared", str9), new mmr0("share_id", "")})), yxl0Var.a, yxl0Var.b.b.a, System.currentTimeMillis());
            default:
                ((Number) obj3).intValue();
                return new kwl0(1);
        }
    }
}
