package p;

import android.content.Context;
import com.spotify.scrollsita.v1.Section;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kle1 extends hab0 implements zu30 {
    public static final kle1 N0;
    public static final kle1 O0;
    public static final kle1 P0;
    public static final kle1 Q0;
    public static final kle1 R0;
    public static final kle1 S0;
    public static final kle1 T0;
    public static final kle1 U0;
    public static final kle1 V0;
    public static final kle1 W0;
    public static final kle1 X;
    public static final kle1 X0;
    public static final kle1 Y;
    public static final kle1 Y0;
    public static final kle1 Z;
    public static final kle1 Z0;
    public static final kle1 a1;
    public static final kle1 b;
    public static final kle1 b1;
    public static final kle1 c;
    public static final kle1 c1;
    public static final kle1 d;
    public static final kle1 d1;
    public static final kle1 e;
    public static final kle1 e1;
    public static final kle1 f;
    public static final kle1 g;
    public static final kle1 h;
    public static final kle1 i;
    public static final kle1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new kle1(i2, (byte) 0);
        c = new kle1(i2, (byte) 1);
        d = new kle1(i2, (byte) 2);
        e = new kle1(i2, (byte) 3);
        f = new kle1(i2, (byte) 4);
        g = new kle1(i2, (byte) 5);
        h = new kle1(i2, (byte) 6);
        i = new kle1(i2, (byte) 7);
        t = new kle1(i2, (byte) 8);
        X = new kle1(i2, (byte) 9);
        Y = new kle1(i2, (byte) 10);
        Z = new kle1(i2, (byte) 11);
        N0 = new kle1(i2, (byte) 12);
        O0 = new kle1(i2, (byte) 13);
        P0 = new kle1(i2, (byte) 14);
        Q0 = new kle1(i2, (byte) 15);
        R0 = new kle1(i2, (byte) 16);
        S0 = new kle1(i2, (byte) 17);
        T0 = new kle1(i2, (byte) 18);
        U0 = new kle1(i2, (byte) 19);
        V0 = new kle1(i2, (byte) 20);
        W0 = new kle1(i2, (byte) 21);
        X0 = new kle1(i2, (byte) 22);
        Y0 = new kle1(i2, (byte) 23);
        Z0 = new kle1(i2, (byte) 24);
        a1 = new kle1(i2, (byte) 25);
        b1 = new kle1(i2, (byte) 26);
        c1 = new kle1(i2, (byte) 27);
        d1 = new kle1(i2, (byte) 28);
        e1 = new kle1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kle1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        w7h1 w7h1Var4;
        w7h1 w7h1Var5;
        w7h1 w7h1Var6;
        w7h1 w7h1Var7;
        w7h1 w7h1Var8;
        w7h1 w7h1Var9;
        w7h1 w7h1Var10;
        byte b2 = this.a;
        jlf1 jlf1Var = jlf1.a;
        klf1 klf1Var = klf1.a;
        ilf1 ilf1Var = ilf1.a;
        llf1 llf1Var = llf1.a;
        nlf1 nlf1Var = nlf1.a;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                ((Number) obj3).intValue();
                return new lul0();
            case 1:
                nhb1 nhb1Var = (nhb1) obj3;
                lhb1 lhb1Var = (lhb1) obj4;
                y6h1 y6h1Var = ((lul0) obj).a;
                if (!lhb1Var.equals(jhb1.a)) {
                    if (!lhb1Var.equals(khb1.a)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
                }
                x6h1 x6h1VarC2 = y6h1Var.c();
                x6h1VarC2.i.add(new a7h1("explore_premium_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                String strM = flo1.m(nhb1Var, "spotify:premium-destination");
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                if (strM == null) {
                    strM = "";
                }
                return new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strM)), y6h1VarA, r6h1.c, System.currentTimeMillis());
            case 2:
                ((Number) obj3).intValue();
                return new r6m0();
            case 3:
                if (!(((sse1) obj4) instanceof rse1)) {
                    return null;
                }
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-your-listening-timeline";
                x6h1VarI.f = "12.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1 x6h1VarC3 = x6h1VarI.a().c();
                x6h1VarC3.i.add(new a7h1("quick_scroll", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                return new w7h1("", "", new z7h1("drag", 1, b7xVar), new x7h1("quick_scroll", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
            case 4:
                ((Number) obj3).intValue();
                return new pfl0(((bue1) obj).a);
            case 5:
                return null;
            case 6:
                ((Number) obj3).intValue();
                return new kkl0(((o2f1) obj).c);
            case 7:
                kkl0 kkl0Var = (kkl0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), kkl0Var.b, kkl0Var.a, System.currentTimeMillis());
            case 8:
                ((Number) obj3).intValue();
                return new tml0((r6h1) obj4);
            case 9:
                return new syl0(Integer.valueOf(((Number) obj3).intValue()), "top-collaborators", "unranked", (r6h1) obj4);
            case 10:
                x8f1 x8f1Var = (x8f1) obj4;
                r6h1 r6h1VarB = ((syl0) obj).b();
                Integer numValueOf = Integer.valueOf(x8f1Var.c);
                String str = x8f1Var.b;
                y6h1 y6h1Var3 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-shelf-card";
                x6h1VarI2.f = "4.0.0";
                x6h1VarI2.g = "22.0.0";
                x6h1VarI2.c = numValueOf;
                x6h1VarI2.e = null;
                x6h1VarI2.d = str;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", x8f1Var.a)), x6h1VarI2.a(), r6h1VarB, System.currentTimeMillis());
            case 11:
                return new x1m0(Integer.valueOf(((Number) obj3).intValue()), ((pdf1) obj).a, (r6h1) obj4);
            case 12:
                return null;
            case 13:
                w1m0 w1m0Var = (w1m0) obj;
                jef1 jef1Var = (jef1) obj4;
                r6h1 r6h1Var = w1m0Var.a;
                y6h1 y6h1Var4 = w1m0Var.b;
                if (jef1Var instanceof hef1) {
                    Set set = s4b1.f;
                    String str2 = ((hef1) jef1Var).a;
                    if (uic.u(str2)) {
                        x6h1 x6h1VarC4 = y6h1Var4.c();
                        x6h1VarC4.i.add(new a7h1("link", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC4.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC4.a(), r6h1Var, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC5 = y6h1Var4.c();
                        x6h1VarC5.i.add(new a7h1("link", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC5.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str2)), x6h1VarC5.a(), r6h1Var, System.currentTimeMillis());
                    }
                } else {
                    if (!(jef1Var instanceof ief1)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC6 = y6h1Var4.c();
                    x6h1VarC6.i.add(new a7h1("share_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC6.a(), r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var;
            case 14:
                oef1 oef1Var = (oef1) obj;
                r6h1 r6h1Var2 = (r6h1) obj4;
                Integer numValueOf2 = Integer.valueOf(((Number) obj3).intValue());
                String str3 = oef1Var.b;
                String str4 = (String) o7h.s0(oef1Var.d);
                return new w1m0(str3, numValueOf2, "", str4 == null ? "" : str4, r6h1Var2);
            case 15:
                w1m0 w1m0Var2 = (w1m0) obj;
                r6h1 r6h1Var3 = w1m0Var2.a;
                y6h1 y6h1Var5 = w1m0Var2.b;
                Set set2 = s4b1.f;
                String str5 = ((ref1) obj4).a;
                if (uic.u(str5)) {
                    x6h1 x6h1VarC7 = y6h1Var5.c();
                    x6h1VarC7.i.add(new a7h1("link", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5)), x6h1VarC7.a(), r6h1Var3, System.currentTimeMillis());
                }
                x6h1 x6h1VarC8 = y6h1Var5.c();
                x6h1VarC8.i.add(new a7h1("link", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str5)), x6h1VarC8.a(), r6h1Var3, System.currentTimeMillis());
            case 16:
                ((Number) obj3).intValue();
                return new dcl0((r6h1) obj4);
            case 17:
                dcl0 dcl0Var = (dcl0) obj;
                egf1 egf1Var = (egf1) obj2;
                y6h1 y6h1Var6 = dcl0Var.b;
                if (!((dgf1) obj4).equals(dgf1.a)) {
                    eg.o();
                    return null;
                }
                if (egf1Var.a) {
                    x6h1 x6h1VarC9 = y6h1Var6.c();
                    x6h1VarC9.i.add(new a7h1("expand_collapse_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC9.a(), dcl0Var.a, System.currentTimeMillis());
                }
                x6h1 x6h1VarC10 = y6h1Var6.c();
                x6h1VarC10.i.add(new a7h1("expand_collapse_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC10.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC10.a(), dcl0Var.a, System.currentTimeMillis());
            case 18:
                return new tyl0(Integer.valueOf(((Number) obj3).intValue()), ((jif1) obj).a, (r6h1) obj4);
            case 19:
                tyl0 tyl0Var = (tyl0) obj;
                kif1 kif1Var = (kif1) obj3;
                if (((iif1) obj4).equals(iif1.a)) {
                    return tyl0Var.a(kif1Var.a);
                }
                eg.o();
                return null;
            case 20:
                bwl0 bwl0Var = (bwl0) obj;
                qlf1 qlf1Var = (qlf1) obj3;
                olf1 olf1Var = (olf1) obj4;
                y6h1 y6h1Var7 = bwl0Var.a;
                boolean z = qlf1Var.q;
                boolean z2 = qlf1Var.g;
                String str6 = qlf1Var.a;
                String str7 = ((plf1) obj2).b;
                if (olf1Var instanceof mlf1) {
                    if (!qlf1Var.j) {
                        if (w2g0.r(qlf1Var)) {
                            return bwl0Var.i();
                        }
                        if ((!qlf1Var.A || qlf1Var.f34p) && z2) {
                            z7h1 z7h1Var2 = new z7h1("hit", 1, b7xVar);
                            if (str6 == null) {
                                str6 = "";
                            }
                            w7h1Var2 = new w7h1("", "", z7h1Var2, new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str6)), y6h1Var7, r6h1.c, System.currentTimeMillis());
                        }
                    }
                    return bwl0Var.a(str6);
                }
                if (olf1Var.equals(nlf1Var)) {
                    if (!w2g0.r(qlf1Var) && z2) {
                        w7h1Var2 = new w7h1("", "", new z7h1("long_hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var7, r6h1.c, System.currentTimeMillis());
                    }
                    return null;
                }
                if (olf1Var.equals(llf1Var)) {
                    x6h1 x6h1VarC11 = y6h1Var7.c();
                    x6h1VarC11.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC11.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC11.a(), r6h1.c, System.currentTimeMillis());
                } else if (olf1Var.equals(ilf1Var)) {
                    if (!z) {
                        x6h1 x6h1VarC12 = y6h1Var7.c();
                        x6h1VarC12.i.add(new a7h1("add_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC12.j = false;
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", str7 == null ? "" : str7)), x6h1VarC12.a(), r6h1.c, System.currentTimeMillis());
                    }
                    x6h1 x6h1VarC13 = y6h1Var7.c();
                    x6h1VarC13.i.add(new a7h1("add_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC13.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC13.a(), r6h1.c, System.currentTimeMillis());
                } else if (olf1Var.equals(klf1Var)) {
                    z7h1 z7h1Var3 = new z7h1("swipe", 1, b7xVar);
                    if (str6 == null) {
                        str6 = "";
                    }
                    w7h1Var2 = new w7h1("", "", z7h1Var3, new x7h1("add_item_to_queue", 1, Collections.singletonMap("item_to_add_to_queue", str6)), y6h1Var7, r6h1.c, System.currentTimeMillis());
                } else {
                    if (!olf1Var.equals(jlf1Var)) {
                        eg.o();
                        return null;
                    }
                    if (z) {
                        w7h1Var2 = new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var7, r6h1.c, System.currentTimeMillis());
                    } else {
                        w7h1Var2 = new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", str7 == null ? "" : str7)), y6h1Var7, r6h1.c, System.currentTimeMillis());
                    }
                }
                return w7h1Var3;
                return w7h1Var2;
            case 21:
                wvl0 wvl0Var = (wvl0) obj;
                qlf1 qlf1Var2 = (qlf1) obj3;
                olf1 olf1Var2 = (olf1) obj4;
                y6h1 y6h1Var8 = wvl0Var.a;
                boolean z3 = qlf1Var2.q;
                boolean z4 = qlf1Var2.g;
                String str8 = qlf1Var2.a;
                String str9 = ((plf1) obj2).b;
                if (olf1Var2 instanceof mlf1) {
                    if (!qlf1Var2.j) {
                        if (w2g0.r(qlf1Var2)) {
                            return wvl0Var.i();
                        }
                        if ((!qlf1Var2.A || qlf1Var2.f34p) && z4) {
                            z7h1 z7h1Var4 = new z7h1("hit", 1, b7xVar);
                            if (str8 == null) {
                                str8 = "";
                            }
                            w7h1Var4 = new w7h1("", "", z7h1Var4, new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str8)), y6h1Var8, r6h1.c, System.currentTimeMillis());
                        }
                    }
                    return wvl0Var.a(str8);
                }
                if (olf1Var2.equals(nlf1Var)) {
                    if (!w2g0.r(qlf1Var2) && z4) {
                        w7h1Var4 = new w7h1("", "", new z7h1("long_hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var8, r6h1.c, System.currentTimeMillis());
                    }
                    return null;
                }
                if (olf1Var2.equals(llf1Var)) {
                    x6h1 x6h1VarC14 = y6h1Var8.c();
                    x6h1VarC14.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC14.j = false;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC14.a(), r6h1.c, System.currentTimeMillis());
                } else if (olf1Var2.equals(ilf1Var)) {
                    if (!z3) {
                        x6h1 x6h1VarC15 = y6h1Var8.c();
                        x6h1VarC15.i.add(new a7h1("add_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC15.j = false;
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", str9 == null ? "" : str9)), x6h1VarC15.a(), r6h1.c, System.currentTimeMillis());
                    }
                    x6h1 x6h1VarC16 = y6h1Var8.c();
                    x6h1VarC16.i.add(new a7h1("add_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC16.j = false;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC16.a(), r6h1.c, System.currentTimeMillis());
                } else if (olf1Var2.equals(klf1Var)) {
                    z7h1 z7h1Var5 = new z7h1("swipe", 1, b7xVar);
                    if (str8 == null) {
                        str8 = "";
                    }
                    w7h1Var4 = new w7h1("", "", z7h1Var5, new x7h1("add_item_to_queue", 1, Collections.singletonMap("item_to_add_to_queue", str8)), y6h1Var8, r6h1.c, System.currentTimeMillis());
                } else {
                    if (!olf1Var2.equals(jlf1Var)) {
                        eg.o();
                        return null;
                    }
                    if (z3) {
                        w7h1Var4 = new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var8, r6h1.c, System.currentTimeMillis());
                    } else {
                        w7h1Var4 = new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", str9 == null ? "" : str9)), y6h1Var8, r6h1.c, System.currentTimeMillis());
                    }
                }
                return w7h1Var5;
                return w7h1Var4;
            case 22:
                ewl0 ewl0Var = (ewl0) obj;
                qlf1 qlf1Var3 = (qlf1) obj3;
                olf1 olf1Var3 = (olf1) obj4;
                y6h1 y6h1Var9 = ewl0Var.a;
                boolean z5 = qlf1Var3.g;
                String str10 = qlf1Var3.a;
                String str11 = ((plf1) obj2).b;
                if (olf1Var3 instanceof mlf1) {
                    if (!qlf1Var3.j) {
                        if (w2g0.r(qlf1Var3)) {
                            w7h1Var7 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var9, r6h1.c, System.currentTimeMillis());
                        } else if ((!qlf1Var3.A || qlf1Var3.f34p) && z5) {
                            z7h1 z7h1Var6 = new z7h1("hit", 1, b7xVar);
                            if (str10 == null) {
                                str10 = "";
                            }
                            w7h1Var7 = new w7h1("", "", z7h1Var6, new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str10)), y6h1Var9, r6h1.c, System.currentTimeMillis());
                        }
                    }
                    return ewl0Var.a(str10);
                }
                if (!olf1Var3.equals(nlf1Var)) {
                    if (olf1Var3.equals(llf1Var)) {
                        x6h1 x6h1VarC17 = y6h1Var9.c();
                        x6h1VarC17.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC17.j = false;
                        w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC17.a(), r6h1.c, System.currentTimeMillis());
                    } else if (olf1Var3.equals(ilf1Var)) {
                        if (!qlf1Var3.q) {
                            x6h1 x6h1VarC18 = y6h1Var9.c();
                            x6h1VarC18.i.add(new a7h1("add_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC18.j = false;
                            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", str11 == null ? "" : str11)), x6h1VarC18.a(), r6h1.c, System.currentTimeMillis());
                        }
                        x6h1 x6h1VarC19 = y6h1Var9.c();
                        x6h1VarC19.i.add(new a7h1("add_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC19.j = false;
                        w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC19.a(), r6h1.c, System.currentTimeMillis());
                    } else if (!olf1Var3.equals(klf1Var) && !olf1Var3.equals(jlf1Var)) {
                        eg.o();
                    }
                    return w7h1Var6;
                }
                if (!w2g0.r(qlf1Var3) && z5) {
                    w7h1Var7 = new w7h1("", "", new z7h1("long_hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var9, r6h1.c, System.currentTimeMillis());
                }
                return null;
                return w7h1Var7;
            case 23:
                x0m0 x0m0Var = (x0m0) obj;
                mmf1 mmf1Var = (mmf1) obj4;
                r6h1 r6h1Var4 = x0m0Var.a;
                y6h1 y6h1Var10 = x0m0Var.b;
                String str12 = ((nmf1) obj2).a;
                if (mmf1Var instanceof hmf1) {
                    if (((hmf1) mmf1Var).a) {
                        x6h1 x6h1VarC20 = y6h1Var10.c();
                        x6h1VarC20.i.add(new a7h1("data_sources_row", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC20.j = false;
                        w7h1Var8 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC20.a(), r6h1Var4, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC21 = y6h1Var10.c();
                        x6h1VarC21.i.add(new a7h1("data_sources_row", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC21.j = false;
                        w7h1Var8 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC21.a(), r6h1Var4, System.currentTimeMillis());
                    }
                } else if (mmf1Var instanceof lmf1) {
                    x6h1 x6h1VarC22 = y6h1Var10.c();
                    x6h1VarC22.i.add(new a7h1("song_credits_row", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC22.j = false;
                    w7h1Var8 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", f4i1.f("spotify:internal:track:", (String) o7h.A0(ihc1.Q0(str12, new String[]{":"}, 0, 6)), ":dna:feedback:credits"))), x6h1VarC22.a(), r6h1Var4, System.currentTimeMillis());
                } else if (mmf1Var instanceof jmf1) {
                    x6h1 x6h1VarC23 = y6h1Var10.c();
                    x6h1VarC23.i.add(new a7h1("samples_or_covers_row", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC23.j = false;
                    w7h1Var8 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", f4i1.f("spotify:internal:track:", (String) o7h.A0(ihc1.Q0(str12, new String[]{":"}, 0, 6)), ":dna:feedback:samples"))), x6h1VarC23.a(), r6h1Var4, System.currentTimeMillis());
                } else if (mmf1Var instanceof kmf1) {
                    x6h1 x6h1VarC24 = y6h1Var10.c();
                    x6h1VarC24.i.add(new a7h1("something_else_row", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC24.j = false;
                    w7h1Var8 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", f4i1.f("spotify:internal:track:", (String) o7h.A0(ihc1.Q0(str12, new String[]{":"}, 0, 6)), ":dna:feedback:other"))), x6h1VarC24.a(), r6h1Var4, System.currentTimeMillis());
                } else {
                    if (!(mmf1Var instanceof imf1)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC25 = y6h1Var10.c();
                    x6h1VarC25.i.add(new a7h1("learn_how_row", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC25.j = false;
                    w7h1Var8 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", "https://artists.spotify.com/c/song-dna-reporting")), x6h1VarC25.a(), r6h1Var4, System.currentTimeMillis());
                }
                return w7h1Var8;
            case 24:
                ((Number) obj3).intValue();
                return new ejl0((r6h1) obj4);
            case 25:
                ejl0 ejl0Var = (ejl0) obj;
                mof1 mof1Var = (mof1) obj3;
                hof1 hof1Var = (hof1) obj4;
                r6h1 r6h1Var5 = ejl0Var.a;
                y6h1 y6h1Var11 = ejl0Var.b;
                if (u890.j(mof1Var.l, ((nof1) obj2).a())) {
                    int iOrdinal = hof1Var.ordinal();
                    if (iOrdinal == 0) {
                        String str13 = mof1Var.j;
                        if (str13 != null) {
                            x6h1 x6h1VarC26 = y6h1Var11.c();
                            x6h1VarC26.i.add(new a7h1("title_label", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC26.j = false;
                            w7h1Var9 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str13)), x6h1VarC26.a(), r6h1Var5, System.currentTimeMillis());
                            return w7h1Var9;
                        }
                    } else if (iOrdinal == 1) {
                        String str14 = mof1Var.k;
                        if (str14 != null) {
                            x6h1 x6h1VarC27 = y6h1Var11.c();
                            x6h1VarC27.i.add(new a7h1("artist_label", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC27.j = false;
                            w7h1Var9 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str14)), x6h1VarC27.a(), r6h1Var5, System.currentTimeMillis());
                            return w7h1Var9;
                        }
                    } else {
                        eg.o();
                    }
                }
                return null;
            case 26:
                return new uof1((jo70) obj, (jo70) obj2, (mtl) obj3, (Boolean) obj4);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                jo70 jo70Var = (jo70) obj;
                mtl mtlVar = (mtl) obj2;
                Boolean bool = (Boolean) obj3;
                jo70 jo70Var2 = (jo70) obj4;
                if (jo70Var == null) {
                    jo70Var = new jo70((String) null, (String) null, (String) null, (List) null, (io70) null, 31);
                }
                if (mtlVar == null) {
                    mtlVar = new mtl();
                }
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                if (jo70Var2 == null) {
                    jo70Var2 = new jo70((String) null, (String) null, (String) null, (List) null, (io70) null, 31);
                }
                return new vof1(jo70Var, mtlVar, zBooleanValue, jo70Var2);
            case 28:
                return new n2o((Context) obj2, (iu30) obj4, (byte) 2);
            default:
                k6m0 k6m0Var = (k6m0) obj;
                brf1 brf1Var = (brf1) obj4;
                r6h1 r6h1Var6 = k6m0Var.b.a;
                y6h1 y6h1Var12 = k6m0Var.a;
                if (brf1Var instanceof arf1) {
                    arf1 arf1Var = (arf1) brf1Var;
                    Integer numValueOf3 = Integer.valueOf(arf1Var.a);
                    String str15 = arf1Var.b;
                    x6h1 x6h1VarC28 = y6h1Var12.c();
                    x6h1VarC28.i.add(new a7h1("top_chart_item", (String) null, numValueOf3, str15, "non_social"));
                    x6h1VarC28.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC28.a();
                    String str16 = arf1Var.b;
                    z7h1 z7h1Var7 = new z7h1("hit", 1, b7xVar);
                    if (str16 == null) {
                        str16 = "";
                    }
                    w7h1Var10 = new w7h1("", "", z7h1Var7, new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str16)), y6h1VarA2, r6h1Var6, System.currentTimeMillis());
                } else {
                    if (!(brf1Var instanceof yqf1)) {
                        return null;
                    }
                    yqf1 yqf1Var = (yqf1) brf1Var;
                    Integer numValueOf4 = Integer.valueOf(yqf1Var.a);
                    String str17 = yqf1Var.b;
                    x6h1 x6h1VarC29 = y6h1Var12.c();
                    x6h1VarC29.i.add(new a7h1("top_chart_item", (String) null, numValueOf4, str17, "non_social"));
                    x6h1VarC29.j = false;
                    x6h1 x6h1VarC30 = x6h1VarC29.a().c();
                    x6h1VarC30.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC30.j = false;
                    w7h1Var10 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC30.a(), r6h1Var6, System.currentTimeMillis());
                }
                return w7h1Var10;
        }
    }
}
