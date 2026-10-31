package p;

import com.spotify.scrollsita.v1.Section;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m1c1 extends hab0 implements zu30 {
    public static final m1c1 N0;
    public static final m1c1 O0;
    public static final m1c1 P0;
    public static final m1c1 Q0;
    public static final m1c1 R0;
    public static final m1c1 S0;
    public static final m1c1 T0;
    public static final m1c1 U0;
    public static final m1c1 V0;
    public static final m1c1 W0;
    public static final m1c1 X;
    public static final m1c1 X0;
    public static final m1c1 Y;
    public static final m1c1 Y0;
    public static final m1c1 Z;
    public static final m1c1 Z0;
    public static final m1c1 a1;
    public static final m1c1 b;
    public static final m1c1 b1;
    public static final m1c1 c;
    public static final m1c1 c1;
    public static final m1c1 d;
    public static final m1c1 d1;
    public static final m1c1 e;
    public static final m1c1 e1;
    public static final m1c1 f;
    public static final m1c1 g;
    public static final m1c1 h;
    public static final m1c1 i;
    public static final m1c1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new m1c1(i2, (byte) 0);
        c = new m1c1(i2, (byte) 1);
        d = new m1c1(i2, (byte) 2);
        e = new m1c1(i2, (byte) 3);
        f = new m1c1(i2, (byte) 4);
        g = new m1c1(i2, (byte) 5);
        h = new m1c1(i2, (byte) 6);
        i = new m1c1(i2, (byte) 7);
        t = new m1c1(i2, (byte) 8);
        X = new m1c1(i2, (byte) 9);
        Y = new m1c1(i2, (byte) 10);
        Z = new m1c1(i2, (byte) 11);
        N0 = new m1c1(i2, (byte) 12);
        O0 = new m1c1(i2, (byte) 13);
        P0 = new m1c1(i2, (byte) 14);
        Q0 = new m1c1(i2, (byte) 15);
        R0 = new m1c1(i2, (byte) 16);
        S0 = new m1c1(i2, (byte) 17);
        T0 = new m1c1(i2, (byte) 18);
        U0 = new m1c1(i2, (byte) 19);
        V0 = new m1c1(i2, (byte) 20);
        W0 = new m1c1(i2, (byte) 21);
        X0 = new m1c1(i2, (byte) 22);
        Y0 = new m1c1(i2, (byte) 23);
        Z0 = new m1c1(i2, (byte) 24);
        a1 = new m1c1(i2, (byte) 25);
        b1 = new m1c1(i2, (byte) 26);
        c1 = new m1c1(i2, (byte) 27);
        d1 = new m1c1(i2, (byte) 28);
        e1 = new m1c1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1c1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        String str;
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        byte b2 = this.a;
        int i2 = 7;
        b7x b7xVar = b7x.a;
        w7h1 w7h1Var4 = null;
        switch (b2) {
            case 0:
                ((Number) obj3).intValue();
                r6h1 r6h1Var = r6h1.c;
                return new mxl0(new qrl0((byte) 7));
            case 1:
                h1c1 h1c1Var = (h1c1) obj4;
                y6h1 y6h1Var = ((mxl0) obj).a;
                if (h1c1Var instanceof g1c1) {
                    char c2 = ((g1c1) h1c1Var).a.b ? (char) 1 : (char) 2;
                    z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                    mmr0 mmr0Var = new mmr0("setting_name", "storage_location");
                    if (c2 == 1) {
                        str = "device_storage";
                    } else {
                        if (c2 != 2) {
                            throw null;
                        }
                        str = "sd_card";
                    }
                    return new w7h1("", "", z7h1Var, new x7h1("set_multiple_choice_setting", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("option_selected", str)})), y6h1Var, r6h1.c, System.currentTimeMillis());
                }
                if ((h1c1Var instanceof f1c1) || (h1c1Var instanceof e1c1)) {
                    return null;
                }
                if (h1c1Var instanceof d1c1) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("confirmation_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    x6h1 x6h1VarC2 = x6h1VarC.a().c();
                    x6h1VarC2.i.add(new a7h1("confirm_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                }
                if (!(h1c1Var instanceof c1c1)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC3 = y6h1Var.c();
                x6h1VarC3.i.add(new a7h1("confirmation_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
            case 2:
                m6c1 m6c1Var = (m6c1) obj;
                ((Number) obj3).intValue();
                return new b4m0(Integer.valueOf(m6c1Var.h.a), m6c1Var.a, (r6h1) obj4);
            case 3:
                b4m0 b4m0Var = (b4m0) obj;
                m6c1 m6c1Var2 = (m6c1) obj2;
                if (((j6c1) obj4).equals(j6c1.a)) {
                    return b4m0Var.a(m6c1Var2.h.b);
                }
                eg.o();
                return null;
            case 4:
                ((Number) obj3).intValue();
                return new z1m0((r6h1) obj4);
            case 5:
                z1m0 z1m0Var = (z1m0) obj;
                if (qjc1.a[((njc1) obj4).ordinal()] == 1) {
                    String str2 = nik1.d7.a;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), z1m0Var.b, z1m0Var.a, System.currentTimeMillis());
                } else {
                    eg.o();
                }
                return w7h1Var4;
            case 6:
                ((Number) obj3).intValue();
                return yz10.e(((coc1) obj).r);
            case 7:
                azl0 azl0Var = (azl0) obj;
                x6h1 x6h1VarC5 = azl0Var.a.c();
                x6h1VarC5.i.add(new a7h1("manage_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:account-management:plan-overview")), x6h1VarC5.a(), azl0Var.b.a, System.currentTimeMillis());
            case 8:
                tnc1 tnc1Var = (tnc1) obj4;
                return yz10.f(0, tnc1Var.a, tnc1Var.b);
            case 9:
                ((Number) obj3).intValue();
                return new a2m0((r6h1) obj4);
            case 10:
                a2m0 a2m0Var = (a2m0) obj;
                zbb0 zbb0Var = (zbb0) obj4;
                r6h1 r6h1Var2 = a2m0Var.a;
                y6h1 y6h1Var2 = a2m0Var.b;
                if (zbb0Var.equals(wbb0.a)) {
                    return a2m0Var.h();
                }
                if (zbb0Var instanceof xbb0) {
                    String str3 = ((xbb0) zbb0Var).a;
                    x6h1 x6h1VarC6 = y6h1Var2.c();
                    x6h1VarC6.i.add(new a7h1("subtitles_row", str3, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC6.a(), r6h1Var2, System.currentTimeMillis());
                } else {
                    if (!zbb0Var.equals(ybb0.a)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC7 = y6h1Var2.c();
                    x6h1VarC7.i.add(new a7h1("subtitles_row", "off", (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC7.a(), r6h1Var2, System.currentTimeMillis());
                }
                return w7h1Var;
            case 11:
                ((Number) obj3).intValue();
                return new a2m0((r6h1) obj4);
            case 12:
                a2m0 a2m0Var2 = (a2m0) obj;
                zrc1 zrc1Var = (zrc1) obj4;
                r6h1 r6h1Var3 = a2m0Var2.a;
                y6h1 y6h1Var3 = a2m0Var2.b;
                if (zrc1Var instanceof xrc1) {
                    String str4 = ((xrc1) zrc1Var).a;
                    x6h1 x6h1VarC8 = y6h1Var3.c();
                    x6h1VarC8.i.add(new a7h1("subtitles_row", str4, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC8.a(), r6h1Var3, System.currentTimeMillis());
                } else {
                    if (zrc1Var.equals(wrc1.a)) {
                        return a2m0Var2.h();
                    }
                    if (!zrc1Var.equals(yrc1.a)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC9 = y6h1Var3.c();
                    x6h1VarC9.i.add(new a7h1("subtitles_row", "off", (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC9.a(), r6h1Var3, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 13:
                ((Number) obj3).intValue();
                lsc1 lsc1Var = ((msc1) obj2).a;
                return new tkl0(lsc1Var.b, String.valueOf(lsc1Var.d), lsc1Var.c);
            case 14:
                if (obj4 != null) {
                    bhn0.d();
                }
                return null;
            case 15:
                ((Number) obj3).intValue();
                return new pyl0(new mjl0(new qyl0((r6h1) obj4)));
            case 16:
                pyl0 pyl0Var = (pyl0) obj;
                x6h1 x6h1VarC10 = pyl0Var.a.c();
                x6h1VarC10.i.add(new a7h1("go_to_settings_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC10.j = false;
                y6h1 y6h1VarA = x6h1VarC10.a();
                String str5 = nik1.e1.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5 != null ? str5 : "")), y6h1VarA, pyl0Var.b.c.a, System.currentTimeMillis());
            case 17:
                htc1 htc1Var = (htc1) obj;
                int iIntValue = ((Number) obj3).intValue();
                lql0 lql0Var = new lql0(new pql0(), (byte) 3);
                Integer numValueOf = Integer.valueOf(iIntValue);
                switch (l1d.C(htc1Var.g)) {
                    case 0:
                        i2 = 8;
                        break;
                    case 1:
                        i2 = 3;
                        break;
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 1;
                        break;
                    case 4:
                        i2 = 6;
                        break;
                    case 5:
                        i2 = 4;
                        break;
                    case 6:
                        i2 = 5;
                        break;
                    case 7:
                        break;
                    case 8:
                        i2 = 9;
                        break;
                    default:
                        eg.o();
                        return null;
                }
                return new oql0(lql0Var, numValueOf, i2, htc1Var.a);
            case 18:
                y6h1 y6h1Var4 = ((oql0) obj).a;
                xis0 xis0Var = ((ftc1) obj4).a;
                if (xis0Var instanceof xis0) {
                    if (!u890.j(xis0Var.a, ris0.b)) {
                        return null;
                    }
                    x6h1 x6h1VarC11 = y6h1Var4.c();
                    x6h1VarC11.i.add(new a7h1("add_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC11.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC11.a(), r6h1.c, System.currentTimeMillis());
                }
                if (!xis0Var.equals(yis0.a)) {
                    return null;
                }
                x6h1 x6h1VarC12 = y6h1Var4.c();
                x6h1VarC12.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC12.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC12.a(), r6h1.c, System.currentTimeMillis());
            case 19:
                iuc1 iuc1Var = (iuc1) obj;
                ((Number) obj3).intValue();
                return new xql0(Integer.valueOf(iuc1Var.b), iuc1Var.a.a, (r6h1) obj4);
            case 20:
                xql0 xql0Var = (xql0) obj;
                if (((huc1) obj4).equals(huc1.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("text_edit", 1, Collections.singletonMap("field_to_be_changed", "")), xql0Var.b, xql0Var.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 21:
                ((Number) obj3).intValue();
                return new krl0(Integer.valueOf(((tuc1) obj).b), (r6h1) obj4);
            case 22:
                krl0 krl0Var = (krl0) obj;
                suc1 suc1Var = (suc1) obj4;
                r6h1 r6h1Var4 = krl0Var.a;
                y6h1 y6h1Var5 = krl0Var.b;
                if (suc1Var.equals(quc1.a)) {
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("text_edit", 1, Collections.singletonMap("field_to_be_changed", "")), y6h1Var5, r6h1Var4, System.currentTimeMillis());
                } else {
                    if (!suc1Var.equals(ruc1.a)) {
                        eg.o();
                        return null;
                    }
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("copy_to_clipboard", 1, b7xVar), y6h1Var5, r6h1Var4, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 23:
                ((Number) obj3).intValue();
                return new lrl0(Integer.valueOf(((hvc1) obj).b), (r6h1) obj4);
            case 24:
                lrl0 lrl0Var = (lrl0) obj;
                if (((gvc1) obj4).equals(gvc1.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), lrl0Var.b, lrl0Var.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 25:
                b2m0 b2m0Var = (b2m0) obj;
                iys0 iys0Var = ((zvc1) obj2).a;
                if (iys0Var.j) {
                    return b2m0Var.h();
                }
                String str6 = iys0Var.f;
                return str6 != null ? b2m0Var.a(str6) : b2m0Var.i();
            case 26:
                return null;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return null;
            case 28:
                azc1 azc1Var = (azc1) obj;
                ((Number) obj3).intValue();
                return new b4m0(Integer.valueOf(azc1Var.f.a), azc1Var.a, (r6h1) obj4);
            default:
                b4m0 b4m0Var2 = (b4m0) obj;
                azc1 azc1Var2 = (azc1) obj2;
                if (((wyc1) obj4).equals(wyc1.a)) {
                    return b4m0Var2.a(azc1Var2.f.b);
                }
                eg.o();
                return null;
        }
    }
}
