package p;

import com.spotify.scrollsita.v1.Section;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lta0 extends hab0 implements zu30 {
    public static final lta0 N0;
    public static final lta0 O0;
    public static final lta0 P0;
    public static final lta0 Q0;
    public static final lta0 R0;
    public static final lta0 S0;
    public static final lta0 T0;
    public static final lta0 U0;
    public static final lta0 V0;
    public static final lta0 W0;
    public static final lta0 X;
    public static final lta0 X0;
    public static final lta0 Y;
    public static final lta0 Y0;
    public static final lta0 Z;
    public static final lta0 Z0;
    public static final lta0 a1;
    public static final lta0 b;
    public static final lta0 b1;
    public static final lta0 c;
    public static final lta0 c1;
    public static final lta0 d;
    public static final lta0 d1;
    public static final lta0 e;
    public static final lta0 e1;
    public static final lta0 f;
    public static final lta0 g;
    public static final lta0 h;
    public static final lta0 i;
    public static final lta0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new lta0(i2, (byte) 0);
        c = new lta0(i2, (byte) 1);
        d = new lta0(i2, (byte) 2);
        e = new lta0(i2, (byte) 3);
        f = new lta0(i2, (byte) 4);
        g = new lta0(i2, (byte) 5);
        h = new lta0(i2, (byte) 6);
        i = new lta0(i2, (byte) 7);
        t = new lta0(i2, (byte) 8);
        X = new lta0(i2, (byte) 9);
        Y = new lta0(i2, (byte) 10);
        Z = new lta0(i2, (byte) 11);
        N0 = new lta0(i2, (byte) 12);
        O0 = new lta0(i2, (byte) 13);
        P0 = new lta0(i2, (byte) 14);
        Q0 = new lta0(i2, (byte) 15);
        R0 = new lta0(i2, (byte) 16);
        S0 = new lta0(i2, (byte) 17);
        T0 = new lta0(i2, (byte) 18);
        U0 = new lta0(i2, (byte) 19);
        V0 = new lta0(i2, (byte) 20);
        W0 = new lta0(i2, (byte) 21);
        X0 = new lta0(i2, (byte) 22);
        Y0 = new lta0(i2, (byte) 23);
        Z0 = new lta0(i2, (byte) 24);
        a1 = new lta0(i2, (byte) 25);
        b1 = new lta0(i2, (byte) 26);
        c1 = new lta0(i2, (byte) 27);
        d1 = new lta0(i2, (byte) 28);
        e1 = new lta0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lta0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        char c2;
        String str;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        byte b2 = this.a;
        gxb0 gxb0Var = gxb0.a;
        dxb0 dxb0Var = dxb0.a;
        b7x b7xVar = b7x.a;
        w7h1 w7h1Var4 = null;
        switch (b2) {
            case 0:
                sra0 sra0Var = (sra0) obj4;
                y6h1 y6h1Var = ((ifl0) obj).a;
                if (sra0Var instanceof nra0) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("send_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("send_message", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
                } else if (sra0Var instanceof gra0) {
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("expand_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    y6h1 y6h1VarA = x6h1VarC2.a();
                    String str2 = nik1.w6.a;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), y6h1VarA, r6h1.c, System.currentTimeMillis());
                } else {
                    if (!(sra0Var instanceof ira0)) {
                        return null;
                    }
                    x6h1 x6h1VarC3 = y6h1Var.c();
                    x6h1VarC3.i.add(new a7h1("mic_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
            case 1:
                b2m0 b2m0Var = (b2m0) obj;
                String str3 = ((vta0) obj2).a.f;
                return str3 != null ? b2m0Var.a(str3) : b2m0Var.i();
            case 2:
                g7e g7eVar = (g7e) obj;
                ((Number) obj3).intValue();
                return new ptk0(Integer.valueOf(g7eVar.d), g7eVar.a, (r6h1) obj4);
            case 3:
                ptk0 ptk0Var = (ptk0) obj;
                g7e g7eVar2 = (g7e) obj2;
                if (((f7e) obj4) instanceof f7e) {
                    String str4 = g7eVar2.b;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4 != null ? str4 : "")), ptk0Var.b, ptk0Var.a, System.currentTimeMillis());
                } else {
                    eg.o();
                }
                return w7h1Var4;
            case 4:
                return new quk0(Integer.valueOf(((Number) obj3).intValue()), ((k9e) obj).a, (r6h1) obj4);
            case 5:
                return null;
            case 6:
                ((Number) obj3).intValue();
                return new mkl0((r6h1) obj4);
            case 7:
                mkl0 mkl0Var = (mkl0) obj;
                lab0 lab0Var = (lab0) obj2;
                if (((kab0) obj4).equals(kab0.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:page-match:landing:".concat(lab0Var.a))), mkl0Var.b, mkl0Var.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 8:
                ((Number) obj3).intValue();
                return new t6m0(new ksk0((byte) 24), 1);
            case 9:
                return null;
            case 10:
                ((Number) obj3).intValue();
                return new ahl0((r6h1) obj4);
            case 11:
                ahl0 ahl0Var = (ahl0) obj;
                r6h1 r6h1Var = ahl0Var.a;
                y6h1 y6h1Var2 = ahl0Var.b;
                return ((bfb0) obj3).a ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_disable", 1, b7xVar), y6h1Var2, r6h1Var, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), y6h1Var2, r6h1Var, System.currentTimeMillis());
            case 12:
                k6m0 k6m0Var = (k6m0) obj;
                bwb0 bwb0Var = (bwb0) obj4;
                Integer numValueOf = Integer.valueOf(bwb0Var.a);
                String str5 = bwb0Var.b;
                x6h1 x6h1VarC4 = k6m0Var.a.c();
                x6h1VarC4.i.add(new a7h1("top_chart_item", (String) null, numValueOf, str5, "social"));
                x6h1VarC4.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5)), x6h1VarC4.a(), k6m0Var.b.a, System.currentTimeMillis());
            case 13:
                opk0 opk0Var = (opk0) obj;
                hxb0 hxb0Var = (hxb0) obj4;
                ji0 ji0Var = ((cxb0) obj3).a;
                if (!hxb0Var.equals(dxb0Var) && !hxb0Var.equals(gxb0Var)) {
                    eg.o();
                    return null;
                }
                String str6 = ji0Var.h;
                String str7 = ji0Var.e;
                x6h1 x6h1VarC5 = opk0Var.a.c();
                x6h1VarC5.i.add(new a7h1("cta_card", str6, (Integer) null, str7, (String) null));
                x6h1VarC5.j = true;
                y6h1 y6h1VarA2 = x6h1VarC5.a();
                String str8 = ji0Var.e;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str8 != null ? str8 : "")), y6h1VarA2, r6h1.c, System.currentTimeMillis());
            case 14:
                cxb0 cxb0Var = (cxb0) obj3;
                hxb0 hxb0Var2 = (hxb0) obj4;
                ji0 ji0Var2 = cxb0Var.a;
                String str9 = ji0Var2.h;
                String str10 = cxb0Var.d;
                x6h1 x6h1VarC6 = ((tol0) obj).a.c();
                x6h1VarC6.i.add(new a7h1("cta_card", str9, (Integer) null, str10, ""));
                x6h1VarC6.j = true;
                y6h1 y6h1VarA3 = x6h1VarC6.a();
                String str11 = ji0Var2.e;
                if (hxb0Var2.equals(dxb0Var)) {
                    Set set = s4b1.f;
                    return uic.u(str11) ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str11)), y6h1VarA3, r6h1.c, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str11)), y6h1VarA3, r6h1.c, System.currentTimeMillis());
                }
                if (!hxb0Var2.equals(gxb0Var)) {
                    eg.o();
                    return null;
                }
                String str12 = ji0Var2.h;
                x6h1 x6h1VarC7 = y6h1VarA3.c();
                x6h1VarC7.i.add(new a7h1("cta_button", str12, (Integer) null, str10, (String) null));
                x6h1VarC7.j = true;
                y6h1 y6h1VarA4 = x6h1VarC7.a();
                Set set2 = s4b1.f;
                return uic.u(str11) ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str11)), y6h1VarA4, r6h1.c, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str11)), y6h1VarA4, r6h1.c, System.currentTimeMillis());
            case 15:
                ((Number) obj3).intValue();
                return (n8h1) ((eyb0) obj2).h.b;
            case 16:
                opk0 opk0Var2 = (opk0) obj;
                i8h1 i8h1Var = (i8h1) obj2;
                j01 j01Var = (zxb0) obj4;
                if (j01Var instanceof j01) {
                    ji0 ji0Var3 = j01Var.a;
                    String str13 = ji0Var3.h;
                    String str14 = ji0Var3.e;
                    x6h1 x6h1VarC8 = opk0Var2.a.c();
                    x6h1VarC8.i.add(new a7h1("cta_card", str13, (Integer) null, str14, (String) null));
                    x6h1VarC8.j = true;
                    y6h1 y6h1VarA5 = x6h1VarC8.a();
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA5;
                    ((xjn) k7h1Var).b = r6h1.c;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    i8h1Var.f(k7h1Var.a(), (Set) null);
                }
                return null;
            case 17:
                i8h1 i8h1Var2 = (i8h1) obj2;
                j01 j01Var2 = (zxb0) obj4;
                y6h1 y6h1Var3 = ((tol0) obj).a;
                vxb0 vxb0Var = ((eyb0) obj3).a;
                if (j01Var2 instanceof j01) {
                    String str15 = j01Var2.a.h;
                    String str16 = vxb0Var.a;
                    x6h1 x6h1VarC9 = y6h1Var3.c();
                    x6h1VarC9.i.add(new a7h1("cta_card", str15, (Integer) null, str16, ""));
                    x6h1VarC9.j = true;
                    y6h1 y6h1VarA6 = x6h1VarC9.a();
                    k7h1 k7h1Var2 = new k7h1();
                    ((xjn) k7h1Var2).a = y6h1VarA6;
                    ((xjn) k7h1Var2).b = r6h1.c;
                    ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                    i8h1Var2.f(k7h1Var2.a(), (Set) null);
                    return null;
                }
                if (j01Var2 instanceof ik51) {
                    String str17 = vxb0Var.a;
                    x6h1 x6h1VarC10 = y6h1Var3.c();
                    x6h1VarC10.i.add(new a7h1("see_all_row", (String) null, (Integer) null, str17, (String) null));
                    x6h1VarC10.j = true;
                    y6h1 y6h1VarA7 = x6h1VarC10.a();
                    lik1 lik1Var = nik1.X2;
                    Set set3 = s4b1.f;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", lik1Var + ":episode:" + uic.x(vxb0Var.a).j())), y6h1VarA7, r6h1.c, System.currentTimeMillis());
                }
                if (!(j01Var2 instanceof lk51)) {
                    if (j01Var2 instanceof n8h) {
                        return null;
                    }
                    eg.o();
                    return null;
                }
                String str18 = vxb0Var.a;
                x6h1 x6h1VarC11 = y6h1Var3.c();
                x6h1VarC11.i.add(new a7h1("see_all_row", (String) null, (Integer) null, str18, (String) null));
                x6h1VarC11.j = true;
                y6h1 y6h1VarA8 = x6h1VarC11.a();
                k7h1 k7h1Var3 = new k7h1();
                ((xjn) k7h1Var3).a = y6h1VarA8;
                ((xjn) k7h1Var3).b = r6h1.c;
                ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var2.f(k7h1Var3.a(), (Set) null);
                return null;
            case 18:
                i8h1 i8h1Var3 = (i8h1) obj2;
                j01 j01Var3 = (zxb0) obj4;
                y6h1 y6h1Var4 = ((opk0) obj).a;
                vxb0 vxb0Var2 = ((eyb0) obj3).a;
                if (j01Var3 instanceof j01) {
                    ji0 ji0Var4 = j01Var3.a;
                    String str19 = ji0Var4.h;
                    String str20 = ji0Var4.e;
                    x6h1 x6h1VarC12 = y6h1Var4.c();
                    x6h1VarC12.i.add(new a7h1("cta_card", str19, (Integer) null, str20, (String) null));
                    x6h1VarC12.j = true;
                    y6h1 y6h1VarA9 = x6h1VarC12.a();
                    k7h1 k7h1Var4 = new k7h1();
                    ((xjn) k7h1Var4).a = y6h1VarA9;
                    ((xjn) k7h1Var4).b = r6h1.c;
                    ((xjn) k7h1Var4).c = Long.valueOf(System.currentTimeMillis());
                    i8h1Var3.f(k7h1Var4.a(), (Set) null);
                    return null;
                }
                if (j01Var3 instanceof ik51) {
                    String str21 = vxb0Var2.a;
                    x6h1 x6h1VarC13 = y6h1Var4.c();
                    x6h1VarC13.i.add(new a7h1("see_all_row", (String) null, (Integer) null, str21, (String) null));
                    x6h1VarC13.j = true;
                    y6h1 y6h1VarA10 = x6h1VarC13.a();
                    String str22 = nik1.Z2.a;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str22 != null ? str22 : "")), y6h1VarA10, r6h1.c, System.currentTimeMillis());
                }
                if (!(j01Var3 instanceof lk51)) {
                    if (j01Var3 instanceof n8h) {
                        return null;
                    }
                    eg.o();
                    return null;
                }
                String str23 = vxb0Var2.a;
                x6h1 x6h1VarC14 = y6h1Var4.c();
                x6h1VarC14.i.add(new a7h1("see_all_row", (String) null, (Integer) null, str23, (String) null));
                x6h1VarC14.j = true;
                y6h1 y6h1VarA11 = x6h1VarC14.a();
                k7h1 k7h1Var5 = new k7h1();
                ((xjn) k7h1Var5).a = y6h1VarA11;
                ((xjn) k7h1Var5).b = r6h1.c;
                ((xjn) k7h1Var5).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var3.f(k7h1Var5.a(), (Set) null);
                return null;
            case 19:
                ((Number) obj3).intValue();
                return new exl0(new opl0((r6h1) obj4, (byte) 13));
            case 20:
                exl0 exl0Var = (exl0) obj;
                int iOrdinal = ((d7c0) obj4).a.ordinal();
                if (iOrdinal == 0) {
                    c2 = 2;
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    c2 = 1;
                }
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                mmr0 mmr0Var = new mmr0("setting_name", "library_layout");
                if (c2 == 1) {
                    str = "grid";
                } else {
                    if (c2 != 2) {
                        throw null;
                    }
                    str = "list";
                }
                return new w7h1("", "", z7h1Var, new x7h1("set_multiple_choice_setting", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("option_selected", str)})), exl0Var.a, exl0Var.b.b, System.currentTimeMillis());
            case 21:
                ((Number) obj3).intValue();
                return new d4l0(((tcc0) obj).a, (r6h1) obj4);
            case 22:
                d4l0 d4l0Var = (d4l0) obj;
                String str24 = ((ucc0) obj3).e;
                if (ycc0.a[((rcc0) obj4).ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                if (str24.length() > 0) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str24)), d4l0Var.b, d4l0Var.a, System.currentTimeMillis());
                }
                return null;
            case 23:
                ((Number) obj3).intValue();
                return new jml0((r6h1) obj4);
            case 24:
                jml0 jml0Var = (jml0) obj;
                if (cdc0.a[((adc0) obj4).ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC15 = jml0Var.b.c();
                x6h1VarC15.i.add(new a7h1("add_songs_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC15.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC15.a(), jml0Var.a, System.currentTimeMillis());
            case 25:
                ((Number) obj3).intValue();
                return new k5m0(new mjl0(new uqk0((r6h1) obj4, (byte) 4)));
            case 26:
                j5m0 j5m0Var = (j5m0) obj;
                k5m0 k5m0Var = j5m0Var.b;
                y6h1 y6h1Var5 = j5m0Var.a;
                int iOrdinal2 = ((pec0) obj4).ordinal();
                if (iOrdinal2 == 0) {
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("filter", 1, b7xVar), y6h1Var5, k5m0Var.b.c.b, System.currentTimeMillis());
                } else {
                    if (iOrdinal2 != 1) {
                        eg.o();
                        return null;
                    }
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("clear_filter", 1, b7xVar), y6h1Var5, k5m0Var.b.c.b, System.currentTimeMillis());
                }
                return w7h1Var2;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                ((Number) obj3).intValue();
                return new acl0((r6h1) obj4);
            case 28:
                acl0 acl0Var = (acl0) obj;
                r6h1 r6h1Var2 = acl0Var.a;
                y6h1 y6h1Var6 = acl0Var.b;
                int iOrdinal3 = ((yec0) obj4).ordinal();
                if (iOrdinal3 == 0) {
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1Var6, r6h1Var2, System.currentTimeMillis());
                } else {
                    if (iOrdinal3 != 1) {
                        eg.o();
                        return null;
                    }
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var6, r6h1Var2, System.currentTimeMillis());
                }
                return w7h1Var3;
            default:
                q4m0 q4m0Var = (q4m0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), q4m0Var.a, q4m0Var.b.c.a, System.currentTimeMillis());
        }
    }
}
