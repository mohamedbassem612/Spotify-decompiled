package p;

import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class v0t extends hab0 implements zu30 {
    public static final v0t N0;
    public static final v0t O0;
    public static final v0t P0;
    public static final v0t Q0;
    public static final v0t R0;
    public static final v0t S0;
    public static final v0t T0;
    public static final v0t U0;
    public static final v0t V0;
    public static final v0t W0;
    public static final v0t X;
    public static final v0t X0;
    public static final v0t Y;
    public static final v0t Y0;
    public static final v0t Z;
    public static final v0t Z0;
    public static final v0t a1;
    public static final v0t b;
    public static final v0t b1;
    public static final v0t c;
    public static final v0t c1;
    public static final v0t d;
    public static final v0t d1;
    public static final v0t e;
    public static final v0t e1;
    public static final v0t f;
    public static final v0t g;
    public static final v0t h;
    public static final v0t i;
    public static final v0t t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new v0t(i2, (byte) 0);
        c = new v0t(i2, (byte) 1);
        d = new v0t(i2, (byte) 2);
        e = new v0t(i2, (byte) 3);
        f = new v0t(i2, (byte) 4);
        g = new v0t(i2, (byte) 5);
        h = new v0t(i2, (byte) 6);
        i = new v0t(i2, (byte) 7);
        t = new v0t(i2, (byte) 8);
        X = new v0t(i2, (byte) 9);
        Y = new v0t(i2, (byte) 10);
        Z = new v0t(i2, (byte) 11);
        N0 = new v0t(i2, (byte) 12);
        O0 = new v0t(i2, (byte) 13);
        P0 = new v0t(i2, (byte) 14);
        Q0 = new v0t(i2, (byte) 15);
        R0 = new v0t(i2, (byte) 16);
        S0 = new v0t(i2, (byte) 17);
        T0 = new v0t(i2, (byte) 18);
        U0 = new v0t(i2, (byte) 19);
        V0 = new v0t(i2, (byte) 20);
        W0 = new v0t(i2, (byte) 21);
        X0 = new v0t(i2, (byte) 22);
        Y0 = new v0t(i2, (byte) 23);
        Z0 = new v0t(i2, (byte) 24);
        a1 = new v0t(i2, (byte) 25);
        b1 = new v0t(i2, (byte) 26);
        c1 = new v0t(i2, (byte) 27);
        d1 = new v0t(i2, (byte) 28);
        e1 = new v0t(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0t(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        bb71 bb71Var;
        u771 u771Var;
        t771 t771Var;
        wa71 wa71Var;
        w7h1 w7h1Var4;
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        String w7h1Var5 = null;
        switch (b2) {
            case 0:
                rtm1 rtm1Var = (rtm1) obj;
                ((Number) obj3).intValue();
                r6h1 r6h1Var = (r6h1) obj4;
                if ((rtm1Var instanceof otm1) || (rtm1Var instanceof ntm1)) {
                    return new f5m0(null, r6h1Var);
                }
                if (rtm1Var.equals(qtm1.a)) {
                    return new f5m0("initial-search", r6h1Var);
                }
                if (rtm1Var instanceof ptm1) {
                    return new f5m0("no-search-results", r6h1Var);
                }
                eg.o();
                return null;
            case 1:
                return null;
            case 2:
                vtm1 vtm1Var = (vtm1) obj;
                return new g5m0(vtm1Var.b ? 2 : 1, Integer.valueOf(((Number) obj3).intValue()), vtm1Var.a.b(), (r6h1) obj4);
            case 3:
                g5m0 g5m0Var = (g5m0) obj;
                return ((utm1) obj4).a ? g5m0Var.h() : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("clear_filter", 1, b7xVar), g5m0Var.b, g5m0Var.a, System.currentTimeMillis());
            case 4:
                ((Number) obj3).intValue();
                return new h5m0((r6h1) obj4);
            case 5:
                h5m0 h5m0Var = (h5m0) obj;
                ytm1 ytm1Var = (ytm1) obj4;
                r6h1 r6h1Var2 = h5m0Var.a;
                y6h1 y6h1Var = h5m0Var.b;
                if (ytm1Var.equals(wtm1.a)) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("clear_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = true;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("clear_filter", 1, b7xVar), x6h1VarC.a(), r6h1Var2, System.currentTimeMillis());
                } else {
                    if (!ytm1Var.equals(xtm1.a)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("view_filters_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = true;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1Var2, System.currentTimeMillis());
                }
                return w7h1Var;
            case 6:
                ((Number) obj3).intValue();
                return new o5m0((r6h1) obj4);
            case 7:
                ((Number) obj3).intValue();
                return new o7l0();
            case 8:
                ((Number) obj3).intValue();
                return new r7l0();
            case 9:
                c8t c8tVar = (c8t) obj4;
                y6h1 y6h1Var2 = ((r7l0) obj).a;
                if (c8tVar instanceof b8t) {
                    x6h1 x6h1VarC3 = y6h1Var2.c();
                    x6h1VarC3.i.add(new a7h1("delete_account_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("delete_account", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
                }
                if (c8tVar instanceof a8t) {
                    x6h1 x6h1VarC4 = y6h1Var2.c();
                    x6h1VarC4.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
                }
                if ((c8tVar instanceof z7t) || (c8tVar instanceof x7t) || (c8tVar instanceof y7t)) {
                    return null;
                }
                eg.o();
                return null;
            case 10:
                ((Number) obj3).intValue();
                return new gml0(new fjl0((r6h1) obj4, (byte) 7));
            case 11:
                het hetVar = (het) obj;
                ((Number) obj3).intValue();
                return new w3l0(hetVar.b, hetVar.a);
            case 12:
                het hetVar2 = (het) obj2;
                eet eetVar = (fet) obj4;
                y6h1 y6h1Var3 = ((w3l0) obj).a;
                if (eetVar.equals(cet.a)) {
                    x6h1 x6h1VarC5 = y6h1Var3.c();
                    x6h1VarC5.i.add(new a7h1("description", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                    x6h1VarC6.i.add(new a7h1("full_label", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    x6h1 x6h1VarC7 = x6h1VarC6.a().c();
                    x6h1VarC7.i.add(new a7h1("see_less_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis());
                }
                if (eetVar.equals(det.a)) {
                    x6h1 x6h1VarC8 = y6h1Var3.c();
                    x6h1VarC8.i.add(new a7h1("description", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    x6h1 x6h1VarC9 = x6h1VarC8.a().c();
                    x6h1VarC9.i.add(new a7h1("collapsed_label", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    x6h1 x6h1VarC10 = x6h1VarC9.a().c();
                    x6h1VarC10.i.add(new a7h1("see_more_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC10.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!(eetVar instanceof eet)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC11 = y6h1Var3.c();
                    x6h1VarC11.i.add(new a7h1("description", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC11.j = false;
                    x6h1 x6h1VarC12 = x6h1VarC11.a().c();
                    x6h1VarC12.i.add(new a7h1("full_label", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC12.j = false;
                    y6h1 y6h1VarA = x6h1VarC12.a();
                    String str = hetVar2.a;
                    x6h1 x6h1VarC13 = y6h1VarA.c();
                    x6h1VarC13.i.add(new a7h1("timestamp", (String) null, (Integer) null, str, (String) null));
                    x6h1VarC13.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC13.a();
                    int i2 = (int) eetVar.a;
                    z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                    String strValueOf = String.valueOf(i2);
                    if (strValueOf == null) {
                        strValueOf = "";
                    }
                    mmr0 mmr0Var = new mmr0("ms_to_seek_to", strValueOf);
                    String strValueOf2 = String.valueOf(0);
                    w7h1Var2 = new w7h1("", "", z7h1Var, new x7h1("seek_to_time", 2, sqg0.J(new mmr0[]{mmr0Var, new mmr0("position_ms", strValueOf2 != null ? strValueOf2 : "")})), y6h1VarA2, r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 13:
                ubl0 ubl0Var = (ubl0) obj;
                ret retVar = (ret) obj2;
                if (vet.a[((pet) obj4).ordinal()] == 1) {
                    String str2 = retVar.c;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), ubl0Var.a, r6h1.c, System.currentTimeMillis());
                } else {
                    eg.o();
                }
                return w7h1Var5;
            case 14:
                ((Number) obj3).intValue();
                return new q3l0(((set) obj).a, (r6h1) obj4);
            case 15:
                q3l0 q3l0Var = (q3l0) obj;
                qet qetVar = (qet) obj4;
                r6h1 r6h1Var3 = q3l0Var.a;
                y6h1 y6h1Var4 = q3l0Var.b;
                if (qetVar instanceof oet) {
                    x6h1 x6h1VarC14 = y6h1Var4.c();
                    x6h1VarC14.i.add(new a7h1("external_link", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC14.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", ((oet) qetVar).a)), x6h1VarC14.a(), r6h1Var3, System.currentTimeMillis());
                } else if (qetVar instanceof net) {
                    x6h1 x6h1VarC15 = y6h1Var4.c();
                    x6h1VarC15.i.add(new a7h1("see_more_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC15.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC15.a(), r6h1Var3, System.currentTimeMillis());
                } else {
                    if (!(qetVar instanceof met)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC16 = y6h1Var4.c();
                    x6h1VarC16.i.add(new a7h1("see_more_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC16.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC16.a(), r6h1Var3, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 16:
                return new rtk0(Integer.valueOf(((Number) obj3).intValue()), ((elt) obj).a, (r6h1) obj4);
            case 17:
                rtk0 rtk0Var = (rtk0) obj;
                String str3 = ((flt) obj3).b;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3 != null ? str3 : "")), rtk0Var.b, rtk0Var.a, System.currentTimeMillis());
            case 18:
                return new ryl0(Integer.valueOf(((Number) obj3).intValue()), (String) null, ((wlt) obj2).a(), (r6h1) obj4);
            case 19:
                ryl0 ryl0Var = (ryl0) obj;
                wlt wltVar = (wlt) obj3;
                if (((rlt) obj4) instanceof rlt) {
                    return ryl0Var.a(wltVar.a());
                }
                eg.o();
                return null;
            case 20:
                ((Number) obj4).intValue();
                x340 x340Var = (b0k) obj3;
                x340Var.i0(-1051437128);
                dnt dntVar = new dnt((wl71) obj2);
                x340Var.r(false);
                return dntVar;
            case 21:
                lqk0 lqk0Var = (lqk0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ((z6u) obj4).a)), lqk0Var.a, lqk0Var.b.a, System.currentTimeMillis());
            case 22:
                ((Number) obj3).intValue();
                return new mqk0((r6h1) obj4);
            case 23:
                mqk0 mqk0Var = (mqk0) obj;
                r6h1 r6h1Var4 = mqk0Var.a;
                y6h1 y6h1Var5 = mqk0Var.b;
                if (((p7u) obj3).a == 1) {
                    x6h1 x6h1VarC17 = y6h1Var5.c();
                    x6h1VarC17.i.add(new a7h1("disclaimer_icon", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC17.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC17.a(), r6h1Var4, System.currentTimeMillis());
                }
                x6h1 x6h1VarC18 = y6h1Var5.c();
                x6h1VarC18.i.add(new a7h1("disclaimer_icon", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC18.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC18.a(), r6h1Var4, System.currentTimeMillis());
            case 24:
                ((Number) obj4).intValue();
                x340 x340Var2 = (b0k) obj3;
                x340Var2.i0(-1015493728);
                fl71 fl71Var = ((pl71) obj2).f;
                fl71 fl71Var2 = fl71Var instanceof fl71 ? fl71Var : null;
                if (fl71Var2 != null && (bb71Var = (bb71) o7h.s0(fl71Var2.a)) != null && (u771Var = bb71Var.a) != null && (t771Var = u771Var.a) != null && (wa71Var = t771Var.a) != null) {
                    w7h1Var5 = wa71Var.a;
                }
                s7u s7uVar = new s7u(w7h1Var5);
                x340Var2.r(false);
                return s7uVar;
            case 25:
                oeu oeuVar = (oeu) obj;
                ((Number) obj3).intValue();
                return new e8l0(new h7l0(cbp1.r(oeuVar.c), oeuVar.b));
            case 26:
                e8l0 e8l0Var = (e8l0) obj;
                if (((neu) obj4).equals(neu.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), e8l0Var.a, r6h1.c, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 27:
                Integer numValueOf = Integer.valueOf(((Number) obj3).intValue());
                ji0 ji0Var = ((jiu) obj).a;
                return new ppk0(numValueOf, ji0Var.h, gq0.e(ji0Var.a), (r6h1) obj4);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                ppk0 ppk0Var = (ppk0) obj;
                miu miuVar = (miu) obj4;
                r6h1 r6h1Var5 = ppk0Var.a;
                y6h1 y6h1Var6 = ppk0Var.b;
                String str4 = ((jiu) obj2).a.e;
                if (miuVar.equals(nsd.a)) {
                    x6h1 x6h1VarC19 = y6h1Var6.c();
                    x6h1VarC19.i.add(new a7h1("body", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC19.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str4 != null ? str4 : "")), x6h1VarC19.a(), r6h1Var5, System.currentTimeMillis());
                } else {
                    if (!miuVar.equals(qxc.a)) {
                        if ((miuVar instanceof ur10) || miuVar.equals(ew70.a) || miuVar.equals(qs70.a)) {
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC20 = y6h1Var6.c();
                    x6h1VarC20.i.add(new a7h1("body", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC20.j = false;
                    x6h1 x6h1VarC21 = x6h1VarC20.a().c();
                    x6h1VarC21.i.add(new a7h1("cta_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC21.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str4 != null ? str4 : "")), x6h1VarC21.a(), r6h1Var5, System.currentTimeMillis());
                }
                return w7h1Var4;
            default:
                Integer numValueOf2 = Integer.valueOf(((Number) obj3).intValue());
                fq0 fq0Var = ((diu) obj).a;
                return new ppk0(numValueOf2, fq0Var.k(), gq0.e(fq0Var.a()), (r6h1) obj4);
        }
    }
}
