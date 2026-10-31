package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lnv extends hab0 implements zu30 {
    public static final lnv N0;
    public static final lnv O0;
    public static final lnv P0;
    public static final lnv Q0;
    public static final lnv R0;
    public static final lnv S0;
    public static final lnv T0;
    public static final lnv U0;
    public static final lnv V0;
    public static final lnv W0;
    public static final lnv X;
    public static final lnv X0;
    public static final lnv Y;
    public static final lnv Y0;
    public static final lnv Z;
    public static final lnv Z0;
    public static final lnv a1;
    public static final lnv b;
    public static final lnv b1;
    public static final lnv c;
    public static final lnv c1;
    public static final lnv d;
    public static final lnv d1;
    public static final lnv e;
    public static final lnv e1;
    public static final lnv f;
    public static final lnv g;
    public static final lnv h;
    public static final lnv i;
    public static final lnv t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new lnv(i2, (byte) 0);
        c = new lnv(i2, (byte) 1);
        d = new lnv(i2, (byte) 2);
        e = new lnv(i2, (byte) 3);
        f = new lnv(i2, (byte) 4);
        g = new lnv(i2, (byte) 5);
        h = new lnv(i2, (byte) 6);
        i = new lnv(i2, (byte) 7);
        t = new lnv(i2, (byte) 8);
        X = new lnv(i2, (byte) 9);
        Y = new lnv(i2, (byte) 10);
        Z = new lnv(i2, (byte) 11);
        N0 = new lnv(i2, (byte) 12);
        O0 = new lnv(i2, (byte) 13);
        P0 = new lnv(i2, (byte) 14);
        Q0 = new lnv(i2, (byte) 15);
        R0 = new lnv(i2, (byte) 16);
        S0 = new lnv(i2, (byte) 17);
        T0 = new lnv(i2, (byte) 18);
        U0 = new lnv(i2, (byte) 19);
        V0 = new lnv(i2, (byte) 20);
        W0 = new lnv(i2, (byte) 21);
        X0 = new lnv(i2, (byte) 22);
        Y0 = new lnv(i2, (byte) 23);
        Z0 = new lnv(i2, (byte) 24);
        a1 = new lnv(i2, (byte) 25);
        b1 = new lnv(i2, (byte) 26);
        c1 = new lnv(i2, (byte) 27);
        d1 = new lnv(i2, (byte) 28);
        e1 = new lnv(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lnv(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        String str;
        w7h1 w7h1Var2;
        byte b2 = this.a;
        int i2 = 2;
        String str2 = "";
        b7x b7xVar = b7x.a;
        w7h1 w7h1Var3 = null;
        switch (b2) {
            case 0:
                ((Number) obj3).intValue();
                return new ypl0();
            case 1:
                knv knvVar = (knv) obj3;
                xmv xmvVar = (ymv) obj4;
                y6h1 y6h1Var = ((ypl0) obj).a;
                if (xmvVar instanceof qmv) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("biography_text", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    return new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("text_edit", 1, Collections.singletonMap("field_to_be_changed", "biography")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
                }
                if (xmvVar instanceof xmv) {
                    int iOrdinal = xmvVar.a.ordinal();
                    if (iOrdinal == 0) {
                        x6h1 x6h1VarC2 = y6h1Var.c();
                        x6h1VarC2.i.add(new a7h1("bio_settings", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC2.j = false;
                        x6h1 x6h1VarC3 = x6h1VarC2.a().c();
                        x6h1VarC3.i.add(new a7h1("self_only_option", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC3.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
                    } else if (iOrdinal == 1) {
                        x6h1 x6h1VarC4 = y6h1Var.c();
                        x6h1VarC4.i.add(new a7h1("bio_settings", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC4.j = false;
                        x6h1 x6h1VarC5 = x6h1VarC4.a().c();
                        x6h1VarC5.i.add(new a7h1("friends_option", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC5.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis());
                    } else {
                        if (iOrdinal != 2) {
                            eg.o();
                            return null;
                        }
                        x6h1 x6h1VarC6 = y6h1Var.c();
                        x6h1VarC6.i.add(new a7h1("bio_settings", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC6.j = false;
                        x6h1 x6h1VarC7 = x6h1VarC6.a().c();
                        x6h1VarC7.i.add(new a7h1("everyone_option", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC7.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis());
                    }
                } else if (xmvVar instanceof umv) {
                    x6h1 x6h1VarC8 = y6h1Var.c();
                    x6h1VarC8.i.add(new a7h1("toolbar", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    x6h1 x6h1VarC9 = x6h1VarC8.a().c();
                    x6h1VarC9.i.add(new a7h1("save_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    y6h1 y6h1VarA = x6h1VarC9.a();
                    String str3 = mnv.d;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3 != null ? str3 : "")), y6h1VarA, r6h1.c, System.currentTimeMillis());
                } else if (xmvVar instanceof pmv) {
                    if (!u890.j(knvVar.b, knvVar.a) || knvVar.d != knvVar.c) {
                        x6h1 x6h1VarC10 = y6h1Var.c();
                        x6h1VarC10.i.add(new a7h1("toolbar", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC10.j = false;
                        x6h1 x6h1VarC11 = x6h1VarC10.a().c();
                        x6h1VarC11.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC11.j = false;
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC11.a(), r6h1.c, System.currentTimeMillis());
                    }
                    x6h1 x6h1VarC12 = y6h1Var.c();
                    x6h1VarC12.i.add(new a7h1("toolbar", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC12.j = false;
                    x6h1 x6h1VarC13 = x6h1VarC12.a().c();
                    x6h1VarC13.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC13.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC13.a(), r6h1.c, System.currentTimeMillis());
                } else if (xmvVar instanceof rmv) {
                    x6h1 x6h1VarC14 = y6h1Var.c();
                    x6h1VarC14.i.add(new a7h1("confirm_discard_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC14.j = false;
                    x6h1 x6h1VarC15 = x6h1VarC14.a().c();
                    x6h1VarC15.i.add(new a7h1("discard_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC15.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC15.a(), r6h1.c, System.currentTimeMillis());
                } else if (xmvVar instanceof smv) {
                    x6h1 x6h1VarC16 = y6h1Var.c();
                    x6h1VarC16.i.add(new a7h1("confirm_discard_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC16.j = false;
                    x6h1 x6h1VarC17 = x6h1VarC16.a().c();
                    x6h1VarC17.i.add(new a7h1("keep_editing_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC17.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC17.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!(xmvVar instanceof tmv)) {
                        if ((xmvVar instanceof wmv) || (xmvVar instanceof vmv)) {
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC18 = y6h1Var.c();
                    x6h1VarC18.i.add(new a7h1("platform_rules_link", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC18.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", "https://www.spotify.com/platform-rules/plain")), x6h1VarC18.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
            case 2:
                ((Number) obj3).intValue();
                return new zll0(new fjl0((r6h1) obj4, (byte) 5));
            case 3:
                ((Number) obj3).intValue();
                return new cpk0(new epk0((r6h1) obj4));
            case 4:
                cpk0 cpk0Var = (cpk0) obj;
                if (((qpv) obj4).equals(qpv.a)) {
                    String str4 = nik1.W1.a;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4 != null ? str4 : "")), cpk0Var.a, cpk0Var.b.a, System.currentTimeMillis());
                } else {
                    eg.o();
                }
                return w7h1Var3;
            case 5:
                ((Number) obj3).intValue();
                return new i9l0(((c2w) obj).a, (r6h1) obj4);
            case 6:
                i9l0 i9l0Var = (i9l0) obj;
                String str5 = ((c2w) obj2).a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5 != null ? str5 : "")), i9l0Var.b, i9l0Var.a, System.currentTimeMillis());
            case 7:
                ((Number) obj3).intValue();
                return new aql0(new fql0(((r4w) obj).b));
            case 8:
                if (obj4 != null) {
                    bhn0.d();
                }
                return null;
            case 9:
                ((Number) obj3).intValue();
                r6h1 r6h1Var = (r6h1) obj4;
                x4i1 x4i1Var = ((d5w) obj).c;
                if (x4i1Var != null && (str = x4i1Var.a) != null) {
                    str2 = str;
                }
                return new rml0(str2, r6h1Var);
            case 10:
                rml0 rml0Var = (rml0) obj;
                a5w a5wVar = (c5w) obj4;
                r6h1 r6h1Var2 = rml0Var.a;
                y6h1 y6h1Var2 = rml0Var.b;
                if (a5wVar instanceof a5w) {
                    x6h1 x6h1VarC19 = y6h1Var2.c();
                    x6h1VarC19.i.add(new a7h1("creator_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC19.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC19.a();
                    String str6 = a5wVar.a;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str6 != null ? str6 : "")), y6h1VarA2, r6h1Var2, System.currentTimeMillis());
                } else if (a5wVar.equals(z4w.a)) {
                    x6h1 x6h1VarC20 = y6h1Var2.c();
                    x6h1VarC20.i.add(new a7h1("collaborators_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC20.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC20.a(), r6h1Var2, System.currentTimeMillis());
                } else {
                    if (!(a5wVar instanceof b5w)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC21 = y6h1Var2.c();
                    x6h1VarC21.i.add(new a7h1("collaborators_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC21.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC21.a(), r6h1Var2, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 11:
                ((Number) obj3).intValue();
                return new zpl0(new fql0(((k5w) obj).b));
            case 12:
                if (obj4 != null) {
                    bhn0.d();
                }
                return null;
            case 13:
                return new o5l0(Integer.valueOf(((Number) obj3).intValue()), ((x5w) obj).b, (r6h1) obj4);
            case 14:
                o5l0 o5l0Var = (o5l0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ((d6w) obj3).c)), o5l0Var.b, o5l0Var.a, System.currentTimeMillis());
            case 15:
                ((Number) obj3).intValue();
                return new aal0(5, "spotify:internal:concerts:editorial-shelf", (r6h1) obj4);
            case 16:
                return ((aal0) obj).h();
            case 17:
                return null;
            case 18:
                return null;
            case 19:
                t6x t6xVar = (t6x) obj;
                ((Number) obj3).intValue();
                r6m0 r6m0Var = new r6m0();
                String str7 = t6xVar.a;
                qc60 qc60Var = t6xVar.d;
                return new q6m0(r6m0Var, str7, Integer.valueOf(qc60Var.a), qc60Var.b, qc60Var.c);
            case 20:
                return null;
            case 21:
                x5m0 x5m0Var = (x5m0) obj;
                if (((z7x) obj4).equals(z7x.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x5m0Var.a, x5m0Var.b.c.b, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 22:
                ((Number) obj3).intValue();
                int iC = l1d.C(((l8x) obj).c);
                if (iC == 0) {
                    i2 = 1;
                } else if (iC != 1) {
                    eg.o();
                    return null;
                }
                return new i8l0(new h7l0((byte) 13), i2);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return null;
            case 24:
                return null;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ((Number) obj3).intValue();
                return new p5l0(new q5l0((r6h1) obj4));
            case 26:
                p5l0 p5l0Var = (p5l0) obj;
                String str8 = q8x.e;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str8 != null ? str8 : "")), p5l0Var.a, p5l0Var.b.a, System.currentTimeMillis());
            case 27:
                return new kdl0(Integer.valueOf(((Number) obj3).intValue()), (r6h1) obj4);
            case 28:
                kdl0 kdl0Var = (kdl0) obj;
                String str9 = ((y8x) obj3).d;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str9 != null ? str9 : "")), kdl0Var.b, kdl0Var.a, System.currentTimeMillis());
            default:
                b9x b9xVar = (b9x) obj;
                ((Number) obj3).intValue();
                String str10 = b9xVar.e;
                int iC2 = l1d.C(b9xVar.d);
                if (iC2 == 0) {
                    return new ttk0(new r6m0(), str10, (byte) 16);
                }
                if (iC2 == 1) {
                    return new ttk0(new r6m0(), str10, (byte) 17);
                }
                if (iC2 == 2) {
                    return new ttk0(new r6m0(), str10, (byte) 18);
                }
                eg.o();
                return null;
        }
    }
}
