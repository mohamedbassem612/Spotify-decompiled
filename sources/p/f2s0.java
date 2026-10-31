package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class f2s0 extends hab0 implements zu30 {
    public static final f2s0 N0;
    public static final f2s0 O0;
    public static final f2s0 P0;
    public static final f2s0 Q0;
    public static final f2s0 R0;
    public static final f2s0 S0;
    public static final f2s0 T0;
    public static final f2s0 U0;
    public static final f2s0 V0;
    public static final f2s0 W0;
    public static final f2s0 X;
    public static final f2s0 X0;
    public static final f2s0 Y;
    public static final f2s0 Y0;
    public static final f2s0 Z;
    public static final f2s0 Z0;
    public static final f2s0 a1;
    public static final f2s0 b;
    public static final f2s0 b1;
    public static final f2s0 c;
    public static final f2s0 c1;
    public static final f2s0 d;
    public static final f2s0 d1;
    public static final f2s0 e;
    public static final f2s0 e1;
    public static final f2s0 f;
    public static final f2s0 g;
    public static final f2s0 h;
    public static final f2s0 i;
    public static final f2s0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new f2s0(i2, (byte) 0);
        c = new f2s0(i2, (byte) 1);
        d = new f2s0(i2, (byte) 2);
        e = new f2s0(i2, (byte) 3);
        f = new f2s0(i2, (byte) 4);
        g = new f2s0(i2, (byte) 5);
        h = new f2s0(i2, (byte) 6);
        i = new f2s0(i2, (byte) 7);
        t = new f2s0(i2, (byte) 8);
        X = new f2s0(i2, (byte) 9);
        Y = new f2s0(i2, (byte) 10);
        Z = new f2s0(i2, (byte) 11);
        N0 = new f2s0(i2, (byte) 12);
        O0 = new f2s0(i2, (byte) 13);
        P0 = new f2s0(i2, (byte) 14);
        Q0 = new f2s0(i2, (byte) 15);
        R0 = new f2s0(i2, (byte) 16);
        S0 = new f2s0(i2, (byte) 17);
        T0 = new f2s0(i2, (byte) 18);
        U0 = new f2s0(i2, (byte) 19);
        V0 = new f2s0(i2, (byte) 20);
        W0 = new f2s0(i2, (byte) 21);
        X0 = new f2s0(i2, (byte) 22);
        Y0 = new f2s0(i2, (byte) 23);
        Z0 = new f2s0(i2, (byte) 24);
        a1 = new f2s0(i2, (byte) 25);
        b1 = new f2s0(i2, (byte) 26);
        c1 = new f2s0(i2, (byte) 27);
        d1 = new f2s0(i2, (byte) 28);
        e1 = new f2s0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f2s0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        String str;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        char c2;
        String str2;
        w7h1 w7h1Var4;
        byte b2 = this.a;
        int i2 = 3;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                z1s0 z1s0Var = (z1s0) obj4;
                y6h1 y6h1Var = ((ixl0) obj).a;
                if (z1s0Var instanceof y1s0) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("install_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!(z1s0Var instanceof w1s0)) {
                        if (z1s0Var instanceof x1s0) {
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("connect_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "")), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
            case 1:
                ((Number) obj3).intValue();
                return new o6m0(new p6m0((byte) 0));
            case 2:
                o6m0 o6m0Var = (o6m0) obj;
                f7s0 f7s0Var = (f7s0) obj4;
                List list = ((k7s0) obj2).b;
                int i3 = f7s0Var.b;
                char c3 = ((j7s0) o7h.t0(i3, list)) instanceof h7s0 ? (char) 1 : (char) 2;
                Integer numValueOf = Integer.valueOf(i3);
                x6h1 x6h1VarC3 = o6m0Var.a.c();
                if (c3 == 1) {
                    str = "empty";
                } else {
                    if (c3 != 2) {
                        throw null;
                    }
                    str = "populated";
                }
                x6h1VarC3.i.add(new a7h1("period_item", (String) null, numValueOf, (String) null, str));
                x6h1VarC3.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", l1d.l(f7s0Var.a, "spotify:listeningstats:"))), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
            case 3:
                gll0 gll0Var = (gll0) obj;
                ebt0 ebt0Var = (ebt0) obj4;
                if (!(ebt0Var instanceof wat0)) {
                    return null;
                }
                x6h1 x6h1VarC4 = gll0Var.a.c();
                x6h1VarC4.i.add(new a7h1("primary_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                y6h1 y6h1VarA = x6h1VarC4.a();
                String str3 = ((wat0) ebt0Var).a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3 != null ? str3 : "")), y6h1VarA, r6h1.c, System.currentTimeMillis());
            case 4:
                ((Number) obj3).intValue();
                return new n7l0(new o7l0());
            case 5:
                y6h1 y6h1Var2 = ((kbl0) obj).a;
                int i4 = ((mgs0) obj2).a;
                int iOrdinal = ((lgs0) obj4).ordinal();
                if (iOrdinal == 0) {
                    Integer numValueOf2 = Integer.valueOf(i4);
                    x6h1 x6h1VarC5 = y6h1Var2.c();
                    x6h1VarC5.i.add(new a7h1("accept_button", (String) null, numValueOf2, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis());
                }
                if (iOrdinal != 1) {
                    eg.o();
                    return null;
                }
                Integer numValueOf3 = Integer.valueOf(i4);
                x6h1 x6h1VarC6 = y6h1Var2.c();
                x6h1VarC6.i.add(new a7h1("cancel_button", (String) null, numValueOf3, (String) null, (String) null));
                x6h1VarC6.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
            case 6:
                b6m0 b6m0Var = (b6m0) obj;
                eis0 eis0Var = (jis0) obj4;
                y6h1 y6h1Var3 = b6m0Var.a;
                r6h1 r6h1Var = b6m0Var.b.a;
                if (eis0Var instanceof eis0) {
                    String str4 = eis0Var.a;
                    x6h1 x6h1VarC7 = y6h1Var3.c();
                    x6h1VarC7.i.add(new a7h1("entity_row", (String) null, (Integer) null, str4, (String) null));
                    x6h1VarC7.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4)), x6h1VarC7.a(), r6h1Var, System.currentTimeMillis());
                } else if (eis0Var instanceof gis0) {
                    gis0 gis0Var = (gis0) eis0Var;
                    String str5 = gis0Var.b;
                    Integer numValueOf4 = Integer.valueOf(gis0Var.a);
                    x6h1 x6h1VarC8 = y6h1Var3.c();
                    x6h1VarC8.i.add(new a7h1("profile_item", (String) null, numValueOf4, str5, (String) null));
                    x6h1VarC8.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5)), x6h1VarC8.a(), r6h1Var, System.currentTimeMillis());
                } else if (eis0Var.equals(fis0.a)) {
                    x6h1 x6h1VarC9 = y6h1Var3.c();
                    x6h1VarC9.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC9.a(), r6h1Var, System.currentTimeMillis());
                } else if (eis0Var.equals(iis0.a)) {
                    w7h1Var2 = new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var3, r6h1Var, System.currentTimeMillis());
                } else {
                    if (!eis0Var.equals(his0.a)) {
                        eg.o();
                        return null;
                    }
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1Var3, r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 7:
                pms0 pms0Var = (pms0) obj2;
                ((Number) obj3).intValue();
                g5l0 g5l0Var = new g5l0((r6h1) obj4, (byte) 16);
                if (pms0Var.equals(mms0.a)) {
                    return g5l0Var;
                }
                if (pms0Var instanceof nms0) {
                    return new wbl0(g5l0Var);
                }
                if (pms0Var instanceof oms0) {
                    return new xbl0(g5l0Var);
                }
                eg.o();
                return null;
            case 8:
                n8h1 n8h1Var = (n8h1) obj;
                int iOrdinal2 = ((kms0) obj4).ordinal();
                if (iOrdinal2 == 0) {
                    wbl0 wbl0Var = n8h1Var instanceof wbl0 ? (wbl0) n8h1Var : null;
                    if (wbl0Var == null) {
                        return null;
                    }
                    x6h1 x6h1VarC10 = wbl0Var.a.c();
                    x6h1VarC10.i.add(new a7h1("request_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("submit", 1, b7xVar), x6h1VarC10.a(), wbl0Var.b.b, System.currentTimeMillis());
                }
                if (iOrdinal2 != 1) {
                    eg.o();
                    return null;
                }
                xbl0 xbl0Var = n8h1Var instanceof xbl0 ? (xbl0) n8h1Var : null;
                if (xbl0Var == null) {
                    return null;
                }
                x6h1 x6h1VarC11 = xbl0Var.a.c();
                x6h1VarC11.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC11.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("discard_changes", 1, b7xVar), x6h1VarC11.a(), xbl0Var.b.b, System.currentTimeMillis());
            case 9:
                ((Number) obj3).intValue();
                int iOrdinal3 = ((vms0) obj).b.ordinal();
                if (iOrdinal3 != 0) {
                    if (iOrdinal3 == 1) {
                        i2 = 1;
                    } else if (iOrdinal3 == 2) {
                        i2 = 2;
                    } else {
                        if (iOrdinal3 != 3) {
                            eg.o();
                            return null;
                        }
                        i2 = 4;
                    }
                }
                return new ybl0(i2);
            case 10:
                y6h1 y6h1Var4 = ((ybl0) obj).a;
                int iOrdinal4 = ((ums0) obj4).ordinal();
                if (iOrdinal4 == 0) {
                    x6h1 x6h1VarC12 = y6h1Var4.c();
                    x6h1VarC12.i.add(new a7h1("request_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC12.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("submit", 1, b7xVar), x6h1VarC12.a(), r6h1.c, System.currentTimeMillis());
                }
                if (iOrdinal4 == 1) {
                    x6h1 x6h1VarC13 = y6h1Var4.c();
                    x6h1VarC13.i.add(new a7h1("leave_jam_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC13.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("leave_social_listening_session", 1, b7xVar), x6h1VarC13.a(), r6h1.c, System.currentTimeMillis());
                }
                if (iOrdinal4 != 2) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC14 = y6h1Var4.c();
                x6h1VarC14.i.add(new a7h1("system_dismiss", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC14.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC14.a(), r6h1.c, System.currentTimeMillis());
            case 11:
                int iIntValue = ((Number) obj3).intValue();
                r6h1 r6h1Var2 = (r6h1) obj4;
                y6h1 y6h1Var5 = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-genpods-personal-apps-settings";
                x6h1VarI.f = "1.0.0";
                x6h1VarI.g = "22.0.0";
                y6h1 y6h1VarA2 = x6h1VarI.a();
                Integer numValueOf5 = Integer.valueOf(iIntValue);
                r6h1 r6h1Var3 = r6h1.c;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var2.a);
                arrayList.add(y6h1VarA2);
                r6h1 r6h1Var4 = new r6h1(arrayList, r6h1Var2.b);
                vcl vclVar = ((prs0) obj).a;
                return new g9l0(vclVar.e ? 2 : 1, numValueOf5, vclVar.a, r6h1Var4);
            case 12:
                g9l0 g9l0Var = (g9l0) obj;
                if (((ors0) obj4).equals(ors0.a)) {
                    return g9l0Var.h();
                }
                eg.o();
                return null;
            case 13:
                ((Number) obj3).intValue();
                return new p9l0(new g5l0((r6h1) obj4, (byte) 12));
            case 14:
                p9l0 p9l0Var = (p9l0) obj;
                if (!((qrs0) obj4).equals(qrs0.a)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC15 = p9l0Var.a.c();
                x6h1VarC15.i.add(new a7h1("retry_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC15.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC15.a(), p9l0Var.b.b, System.currentTimeMillis());
            case 15:
                ((Number) obj3).intValue();
                return new ysk0(((lus0) obj).a, (r6h1) obj4);
            case 16:
                ysk0 ysk0Var = (ysk0) obj;
                qus0 qus0Var = (qus0) obj4;
                r6h1 r6h1Var5 = ysk0Var.a;
                y6h1 y6h1Var6 = ysk0Var.b;
                if (qus0Var instanceof pus0) {
                    x6h1 x6h1VarC16 = y6h1Var6.c();
                    x6h1VarC16.i.add(new a7h1("product_card", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC16.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC16.a(), r6h1Var5, System.currentTimeMillis());
                } else {
                    if (!(qus0Var instanceof ous0)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC17 = y6h1Var6.c();
                    x6h1VarC17.i.add(new a7h1("pre_purchase_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC17.j = true;
                    x6h1 x6h1VarC18 = x6h1VarC17.a().c();
                    x6h1VarC18.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC18.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC18.a(), r6h1Var5, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 17:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "")), ((crk0) obj).a, r6h1.c, System.currentTimeMillis());
            case 18:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "")), ((frk0) obj).a, r6h1.c, System.currentTimeMillis());
            case 19:
                k1t0 k1t0Var = (k1t0) obj;
                ((Number) obj3).intValue();
                if (k1t0Var instanceof h1t0) {
                    return new d9l0(new e9l0(r6h1.c), (byte) 0);
                }
                if (k1t0Var instanceof j1t0) {
                    return new d9l0(new e9l0(r6h1.c), (byte) 1);
                }
                if (k1t0Var instanceof i1t0) {
                    return new d9l0(new e9l0(r6h1.c), (byte) 1);
                }
                eg.o();
                return null;
            case 20:
                return null;
            case 21:
                ((Number) obj3).intValue();
                return new jxl0(new opl0((r6h1) obj4, (byte) 15));
            case 22:
                jxl0 jxl0Var = (jxl0) obj;
                int iOrdinal5 = ((p2t0) obj4).a.ordinal();
                if (iOrdinal5 == 0) {
                    c2 = 3;
                } else if (iOrdinal5 == 1) {
                    c2 = 2;
                } else {
                    if (iOrdinal5 != 2) {
                        eg.o();
                        return null;
                    }
                    c2 = 1;
                }
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                mmr0 mmr0Var = new mmr0("setting_name", "library_pin_section_layout");
                if (c2 == 1) {
                    str2 = "compact_grid";
                } else if (c2 == 2) {
                    str2 = "grid";
                } else {
                    if (c2 != 3) {
                        throw null;
                    }
                    str2 = "list";
                }
                return new w7h1("", "", z7h1Var, new x7h1("set_multiple_choice_setting", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("option_selected", str2)})), jxl0Var.a, jxl0Var.b.b, System.currentTimeMillis());
            case 23:
                ((Number) obj3).intValue();
                return new bhl0((r6h1) obj4);
            case 24:
                bhl0 bhl0Var = (bhl0) obj;
                j3t0 j3t0Var = (j3t0) obj3;
                r6h1 r6h1Var6 = bhl0Var.a;
                y6h1 y6h1Var7 = bhl0Var.b;
                int iOrdinal6 = ((h3t0) obj4).ordinal();
                if (iOrdinal6 == 0) {
                    w7h1Var4 = j3t0Var.a ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_disable", 1, b7xVar), y6h1Var7, r6h1Var6, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), y6h1Var7, r6h1Var6, System.currentTimeMillis());
                } else {
                    if (iOrdinal6 != 1) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC19 = y6h1Var7.c();
                    x6h1VarC19.i.add(new a7h1("os_setting_disabled_message", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC19.j = true;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("open_os_settings", 1, b7xVar), x6h1VarC19.a(), r6h1Var6, System.currentTimeMillis());
                }
                return w7h1Var4;
            case 25:
                ((Number) obj3).intValue();
                return yz10.e(((i7t0) obj).n);
            case 26:
                f7t0 f7t0Var = (f7t0) obj;
                ((Number) obj3).intValue();
                r6h1 r6h1Var7 = r6h1.c;
                nqk0 nqk0Var = new nqk0(new yok0((byte) 7));
                int i5 = f7t0Var.b;
                return new ltk0(nqk0Var, Integer.valueOf(i5), i5 == 0 ? 1 : 2, f7t0Var.a.j);
            case 27:
                m7t0 m7t0Var = (m7t0) obj4;
                String str6 = ((i7t0) obj3).n;
                if (m7t0Var instanceof j7t0) {
                    return yz10.f(0, str6.concat(":disclaimer_link"), ((j7t0) m7t0Var).a);
                }
                if (m7t0Var instanceof k7t0) {
                    return yz10.f(0, str6.concat(":primary_button"), ((k7t0) m7t0Var).a);
                }
                if (m7t0Var instanceof l7t0) {
                    return yz10.f(0, str6.concat(":secondary_button"), ((l7t0) m7t0Var).a);
                }
                eg.o();
                return null;
            case 28:
                return null;
            default:
                ((Number) obj3).intValue();
                return new epk0((r6h1) obj4);
        }
    }
}
