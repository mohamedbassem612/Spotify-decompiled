package p;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.scrollsita.v1.Section;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vrf1 extends hab0 implements zu30 {
    public static final vrf1 N0;
    public static final vrf1 O0;
    public static final vrf1 P0;
    public static final vrf1 Q0;
    public static final vrf1 R0;
    public static final vrf1 S0;
    public static final vrf1 T0;
    public static final vrf1 U0;
    public static final vrf1 V0;
    public static final vrf1 W0;
    public static final vrf1 X;
    public static final vrf1 X0;
    public static final vrf1 Y;
    public static final vrf1 Y0;
    public static final vrf1 Z;
    public static final vrf1 Z0;
    public static final vrf1 a1;
    public static final vrf1 b;
    public static final vrf1 b1;
    public static final vrf1 c;
    public static final vrf1 c1;
    public static final vrf1 d;
    public static final vrf1 d1;
    public static final vrf1 e;
    public static final vrf1 e1;
    public static final vrf1 f;
    public static final vrf1 g;
    public static final vrf1 h;
    public static final vrf1 i;
    public static final vrf1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new vrf1(i2, (byte) 0);
        c = new vrf1(i2, (byte) 1);
        d = new vrf1(i2, (byte) 2);
        e = new vrf1(i2, (byte) 3);
        f = new vrf1(i2, (byte) 4);
        g = new vrf1(i2, (byte) 5);
        h = new vrf1(i2, (byte) 6);
        i = new vrf1(i2, (byte) 7);
        t = new vrf1(i2, (byte) 8);
        X = new vrf1(i2, (byte) 9);
        Y = new vrf1(i2, (byte) 10);
        Z = new vrf1(i2, (byte) 11);
        N0 = new vrf1(i2, (byte) 12);
        O0 = new vrf1(i2, (byte) 13);
        P0 = new vrf1(i2, (byte) 14);
        Q0 = new vrf1(i2, (byte) 15);
        R0 = new vrf1(i2, (byte) 16);
        S0 = new vrf1(i2, (byte) 17);
        T0 = new vrf1(i2, (byte) 18);
        U0 = new vrf1(i2, (byte) 19);
        V0 = new vrf1(i2, (byte) 20);
        W0 = new vrf1(i2, (byte) 21);
        X0 = new vrf1(i2, (byte) 22);
        Y0 = new vrf1(i2, (byte) 23);
        Z0 = new vrf1(i2, (byte) 24);
        a1 = new vrf1(i2, (byte) 25);
        b1 = new vrf1(i2, (byte) 26);
        c1 = new vrf1(i2, (byte) 27);
        d1 = new vrf1(i2, (byte) 28);
        e1 = new vrf1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vrf1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        String str;
        String str2;
        w7h1 w7h1Var3;
        w7h1 w7h1Var4;
        byte b2 = this.a;
        cvf1 cvf1Var = cvf1.a;
        String str3 = "";
        b7x b7xVar = b7x.a;
        int i2 = 1;
        w7h1 w7h1Var5 = null;
        switch (b2) {
            case 0:
                trf1 trf1Var = (trf1) obj;
                ((Number) obj3).intValue();
                r6h1 r6h1Var = (r6h1) obj4;
                String str4 = trf1Var.f;
                String str5 = trf1Var.g;
                if (ihc1.y0(str5)) {
                    str5 = str4;
                }
                return new o1m0(str5, str4, trf1Var.a, r6h1Var);
            case 1:
                o1m0 o1m0Var = (o1m0) obj;
                trf1 trf1Var2 = (trf1) obj2;
                srf1 srf1Var = (srf1) obj4;
                r6h1 r6h1Var2 = o1m0Var.a;
                y6h1 y6h1Var = o1m0Var.b;
                if (srf1Var instanceof prf1) {
                    if (trf1Var2.c) {
                        x6h1 x6h1VarC = y6h1Var.c();
                        x6h1VarC.i.add(new a7h1("show_less_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), r6h1Var2, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC2 = y6h1Var.c();
                        x6h1VarC2.i.add(new a7h1("show_more_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC2.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1Var2, System.currentTimeMillis());
                    }
                } else {
                    if ((srf1Var instanceof orf1) || (srf1Var instanceof qrf1)) {
                        return null;
                    }
                    if (srf1Var instanceof nrf1) {
                        x6h1 x6h1VarC3 = y6h1Var.c();
                        x6h1VarC3.i.add(new a7h1("save_as_playlist_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC3.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("create_playlist", 1, b7xVar), x6h1VarC3.a(), r6h1Var2, System.currentTimeMillis());
                    } else {
                        if (!(srf1Var instanceof rrf1)) {
                            eg.o();
                            return null;
                        }
                        x6h1 x6h1VarC4 = y6h1Var.c();
                        x6h1VarC4.i.add(new a7h1("view_playlist_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC4.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ((rrf1) srf1Var).a)), x6h1VarC4.a(), r6h1Var2, System.currentTimeMillis());
                    }
                }
                return w7h1Var;
            case 2:
                ((Number) obj3).intValue();
                return new erl0((r6h1) obj4);
            case 3:
                erl0 erl0Var = (erl0) obj;
                x6h1 x6h1VarC5 = erl0Var.b.c();
                x6h1VarC5.i.add(new a7h1("citation_link", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", ((bsf1) obj4).a)), x6h1VarC5.a(), erl0Var.a, System.currentTimeMillis());
            case 4:
                fuf1 fuf1Var = (fuf1) obj;
                ((Number) obj3).intValue();
                String str6 = fuf1Var.a;
                if (fuf1Var.b.equals(cvf1Var)) {
                    return new eul0(new ful0(str6));
                }
                eg.o();
                return null;
            case 5:
                duf1 duf1Var = (euf1) obj4;
                y6h1 y6h1Var2 = ((eul0) obj).a;
                String str7 = ((guf1) obj3).a;
                if (duf1Var.equals(buf1.a)) {
                    w7h1Var2 = new w7h1("", "", new z7h1("auto", 1, b7xVar), new x7h1("play_preview", 1, Collections.singletonMap("item_to_be_previewed", str7)), y6h1Var2, r6h1.c, System.currentTimeMillis());
                } else if (duf1Var.equals(cuf1.a)) {
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play_preview", 1, Collections.singletonMap("item_to_be_previewed", str7)), y6h1Var2, r6h1.c, System.currentTimeMillis());
                } else {
                    if (!(duf1Var instanceof duf1)) {
                        eg.o();
                        return null;
                    }
                    int i3 = (int) duf1Var.a;
                    z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                    String strValueOf = String.valueOf(i3);
                    w7h1Var2 = new w7h1("", "", z7h1Var, new x7h1("stop_preview", 1, Collections.singletonMap("duration_ms", strValueOf != null ? strValueOf : "")), y6h1Var2, r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 6:
                luf1 luf1Var = (luf1) obj;
                ((Number) obj3).intValue();
                String str8 = luf1Var.a;
                if (luf1Var.b.equals(cvf1Var)) {
                    return new ful0(str8);
                }
                eg.o();
                return null;
            case 7:
                ful0 ful0Var = (ful0) obj;
                if (tuf1.a[((juf1) obj4).ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC6 = ful0Var.a.c();
                x6h1VarC6.i.add(new a7h1("explore_premium_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                y6h1 y6h1VarA = x6h1VarC6.a();
                String str9 = nik1.b2.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str9 != null ? str9 : "")), y6h1VarA, r6h1.c, System.currentTimeMillis());
            case 8:
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
                x6h1 x6h1VarC7 = kul0Var.b.c();
                x6h1VarC7.i.add(new a7h1("explore_premium_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = false;
                y6h1 y6h1VarA2 = x6h1VarC7.a();
                String strM = flo1.m(nhb1Var, "spotify:upsell:premium_in_app_destination");
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strM != null ? strM : "")), y6h1VarA2, kul0Var.a, System.currentTimeMillis());
            case 9:
                return new j1m0(Integer.valueOf(((Number) obj3).intValue()), ((hyf1) obj).a, (r6h1) obj4);
            case 10:
                j1m0 j1m0Var = (j1m0) obj;
                myf1 myf1Var = (myf1) obj3;
                if (!(((uxf1) obj4) instanceof uxf1)) {
                    eg.o();
                    return null;
                }
                if (!(myf1Var instanceof jyf1) || (str = ((jyf1) myf1Var).e) == null) {
                    return null;
                }
                return j1m0Var.a(str.concat(":dna"));
            case 11:
                jvl0 jvl0Var = (jvl0) obj;
                nyf1 nyf1Var = (nyf1) obj3;
                ayf1 ayf1Var = (ayf1) obj4;
                boolean z = nyf1Var.u;
                j9k1 j9k1Var = nyf1Var.h;
                boolean z2 = nyf1Var.p;
                boolean z3 = nyf1Var.f;
                String str10 = nyf1Var.a;
                boolean z4 = ayf1Var instanceof wxf1;
                gql gqlVar = gql.b;
                if (z4) {
                    if (nyf1Var.i) {
                        return jvl0Var.a(str10);
                    }
                    if (!j9k1Var.equals(gqlVar) || z) {
                        return jvl0Var.j();
                    }
                    if (!nyf1Var.z || nyf1Var.n) {
                        return z3 ? jvl0Var.i(str10) : jvl0Var.a(str10);
                    }
                    return jvl0Var.a(str10);
                }
                if (ayf1Var.equals(xxf1.a)) {
                    if (j9k1Var.equals(gqlVar) && !z && z3) {
                        return jvl0Var.g();
                    }
                    return null;
                }
                if (ayf1Var.equals(txf1.a)) {
                    x6h1 x6h1VarC8 = jvl0Var.a.c();
                    x6h1VarC8.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis());
                }
                if (ayf1Var.equals(rxf1.a)) {
                    return jvl0Var.l(str10);
                }
                if (ayf1Var.equals(qxf1.a)) {
                    return z2 ? jvl0Var.n() : jvl0Var.m(str10);
                }
                if (ayf1Var.equals(pxf1.a)) {
                    qgl0 qgl0Var = new qgl0(jvl0Var);
                    return z2 ? qgl0Var.r() : qgl0Var.l(str10);
                }
                eg.o();
                return null;
            case 12:
                kzf1 kzf1Var = (kzf1) obj;
                ((Number) obj3).intValue();
                return new wrl0(Integer.valueOf(kzf1Var.b), kzf1Var.a, new mjl0(new xrl0()));
            case 13:
                return null;
            case 14:
                nzf1 nzf1Var = (nzf1) obj;
                ((Number) obj3).intValue();
                return new wrl0(Integer.valueOf(nzf1Var.b), nzf1Var.a, new mjl0(new xrl0()));
            case 15:
                return null;
            case 16:
                return null;
            case 17:
                y4g1 y4g1Var = (y4g1) obj;
                ((Number) obj3).intValue();
                r6h1 r6h1Var3 = (r6h1) obj4;
                y6h1 y6h1Var3 = (y6h1) o7h.s0(r6h1Var3.a);
                if (y6h1Var3 != null && (str2 = y6h1Var3.h.b) != null) {
                    str3 = str2;
                }
                return new apl0(str3, y4g1Var.a, r6h1Var3);
            case 18:
                apl0 apl0Var = (apl0) obj;
                a5g1 a5g1Var = (b5g1) obj3;
                x4g1 x4g1Var = (x4g1) obj4;
                r6h1 r6h1Var4 = apl0Var.a;
                y6h1 y6h1Var4 = apl0Var.b;
                if (!(a5g1Var instanceof a5g1)) {
                    return null;
                }
                if (x4g1Var.equals(x4g1.a)) {
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("pause", 1, Collections.singletonMap("item_to_be_paused", a5g1Var.a.a)), y6h1Var4, r6h1Var4, System.currentTimeMillis());
                } else {
                    if (!x4g1Var.equals(x4g1.b)) {
                        eg.o();
                        return null;
                    }
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", a5g1Var.a.a)), y6h1Var4, r6h1Var4, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 19:
                return new vh((Context) obj2, new k441((iu30) obj4));
            case 20:
                h6l0 h6l0Var = (h6l0) obj;
                if (((wag1) obj4).equals(wag1.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), h6l0Var.a, h6l0Var.b.b, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 21:
                n8h1 n8h1Var = (n8h1) obj;
                uhy uhyVar = (uhy) obj4;
                ktl0 ktl0Var = n8h1Var instanceof ktl0 ? (ktl0) n8h1Var : null;
                if (uhyVar.equals(thy.a)) {
                    if (ktl0Var != null) {
                        return ktl0Var.h();
                    }
                    return null;
                }
                if (!uhyVar.equals(shy.a)) {
                    eg.o();
                    return null;
                }
                if (ktl0Var != null) {
                    return ktl0Var.h();
                }
                return null;
            case 22:
                return new as0((Context) obj2, (ViewGroup) obj3, (byte) 26);
            case 23:
                ((Number) obj3).intValue();
                return new bul0();
            case 24:
                ((Number) obj3).intValue();
                return new tfl0((r6h1) obj4);
            case 25:
                gtl0 gtl0Var = (gtl0) obj;
                vmg1 vmg1Var = (vmg1) obj3;
                if (((tmg1) obj4).equals(tmg1.a)) {
                    String str11 = vmg1Var.b;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("select_language", 1, sqg0.J(new mmr0[]{new mmr0("language_selected", str11 != null ? str11 : ""), new mmr0("browser_language", upn1.p())})), gtl0Var.a, gtl0Var.b.c.b.a, System.currentTimeMillis());
                } else {
                    eg.o();
                }
                return w7h1Var5;
            case 26:
                ((Number) obj3).intValue();
                return new o2m0(new p2m0(new brl0((byte) 17), (byte) 0));
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                spg1 spg1Var = (spg1) obj4;
                y6h1 y6h1Var5 = ((o2m0) obj).a;
                if (spg1Var.equals(rpg1.a)) {
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var5, r6h1.c, System.currentTimeMillis());
                } else {
                    if (!spg1Var.equals(qpg1.a)) {
                        eg.o();
                        return null;
                    }
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1Var5, r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var4;
            case 28:
                ((Number) obj3).intValue();
                dn90 dn90Var = ((kqg1) obj).a;
                if (dn90Var instanceof gqg1) {
                    i2 = 4;
                } else if (dn90Var instanceof eqg1) {
                    i2 = 2;
                } else if (dn90Var instanceof fqg1) {
                    i2 = 3;
                } else if (!(dn90Var instanceof dqg1)) {
                    eg.o();
                    return null;
                }
                r6h1 r6h1Var5 = r6h1.c;
                return new ujl0(i2);
            default:
                ujl0 ujl0Var = (ujl0) obj;
                jqg1 jqg1Var = (jqg1) obj4;
                if (jqg1Var instanceof hqg1) {
                    String str12 = oqg1.f;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str12 != null ? str12 : "")), ujl0Var.a, r6h1.c, System.currentTimeMillis());
                } else if (!(jqg1Var instanceof iqg1)) {
                    eg.o();
                }
                return w7h1Var5;
        }
    }
}
