package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fmk0 extends hab0 implements zu30 {
    public static final fmk0 N0;
    public static final fmk0 O0;
    public static final fmk0 P0;
    public static final fmk0 Q0;
    public static final fmk0 R0;
    public static final fmk0 S0;
    public static final fmk0 T0;
    public static final fmk0 U0;
    public static final fmk0 V0;
    public static final fmk0 W0;
    public static final fmk0 X;
    public static final fmk0 X0;
    public static final fmk0 Y;
    public static final fmk0 Y0;
    public static final fmk0 Z;
    public static final fmk0 Z0;
    public static final fmk0 a1;
    public static final fmk0 b;
    public static final fmk0 b1;
    public static final fmk0 c;
    public static final fmk0 c1;
    public static final fmk0 d;
    public static final fmk0 d1;
    public static final fmk0 e;
    public static final fmk0 e1;
    public static final fmk0 f;
    public static final fmk0 g;
    public static final fmk0 h;
    public static final fmk0 i;
    public static final fmk0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new fmk0(i2, (byte) 0);
        c = new fmk0(i2, (byte) 1);
        d = new fmk0(i2, (byte) 2);
        e = new fmk0(i2, (byte) 3);
        f = new fmk0(i2, (byte) 4);
        g = new fmk0(i2, (byte) 5);
        h = new fmk0(i2, (byte) 6);
        i = new fmk0(i2, (byte) 7);
        t = new fmk0(i2, (byte) 8);
        X = new fmk0(i2, (byte) 9);
        Y = new fmk0(i2, (byte) 10);
        Z = new fmk0(i2, (byte) 11);
        N0 = new fmk0(i2, (byte) 12);
        O0 = new fmk0(i2, (byte) 13);
        P0 = new fmk0(i2, (byte) 14);
        Q0 = new fmk0(i2, (byte) 15);
        R0 = new fmk0(i2, (byte) 16);
        S0 = new fmk0(i2, (byte) 17);
        T0 = new fmk0(i2, (byte) 18);
        U0 = new fmk0(i2, (byte) 19);
        V0 = new fmk0(i2, (byte) 20);
        W0 = new fmk0(i2, (byte) 21);
        X0 = new fmk0(i2, (byte) 22);
        Y0 = new fmk0(i2, (byte) 23);
        Z0 = new fmk0(i2, (byte) 24);
        a1 = new fmk0(i2, (byte) 25);
        b1 = new fmk0(i2, (byte) 26);
        c1 = new fmk0(i2, (byte) 27);
        d1 = new fmk0(i2, (byte) 28);
        e1 = new fmk0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fmk0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        String str;
        String str2;
        String str3;
        String str4;
        w7h1 w7h1Var2;
        int i2;
        w7h1 w7h1Var3;
        w7h1 w7h1Var4;
        w7h1 w7h1Var5;
        w7h1 w7h1Var6;
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        w7h1 w7h1Var7 = null;
        switch (b2) {
            case 0:
                mil0 mil0Var = (mil0) obj;
                if (((cmk0) obj4).equals(cmk0.a)) {
                    return new w7h1("", "", new z7h1("auto", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), mil0Var.b, mil0Var.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 1:
                smk0 smk0Var = (smk0) obj2;
                rmk0 rmk0Var = (rmk0) obj4;
                y6h1 y6h1Var = ((xnl0) obj).a;
                List list = smk0Var.a;
                if (rmk0Var instanceof qmk0) {
                    w7h1Var = new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1Var, r6h1.c, System.currentTimeMillis());
                } else if (rmk0Var instanceof lmk0) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("not_now_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (rmk0Var instanceof pmk0) {
                        sr10 sr10Var = (sr10) o7h.t0(smk0Var.d, list);
                        String str5 = (sr10Var == null || (str4 = sr10Var.b) == null) ? "" : str4;
                        x6h1 x6h1VarC2 = y6h1Var.c();
                        x6h1VarC2.i.add(new a7h1("done_button", str5, (Integer) null, (String) null, (String) null));
                        x6h1VarC2.j = false;
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("submit", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                    }
                    if (rmk0Var instanceof mmk0) {
                        int i3 = ((mmk0) rmk0Var).a;
                        sr10 sr10Var2 = (sr10) o7h.t0(i3, list);
                        String str6 = (sr10Var2 == null || (str3 = sr10Var2.b) == null) ? "" : str3;
                        Integer numValueOf = Integer.valueOf(i3);
                        x6h1 x6h1VarC3 = y6h1Var.c();
                        x6h1VarC3.i.add(new a7h1("transition_option", str6, numValueOf, (String) null, (String) null));
                        x6h1VarC3.j = false;
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
                    }
                    if (rmk0Var instanceof nmk0) {
                        int i4 = ((nmk0) rmk0Var).a;
                        sr10 sr10Var3 = (sr10) o7h.t0(i4, list);
                        String str7 = (sr10Var3 == null || (str2 = sr10Var3.b) == null) ? "" : str2;
                        Integer numValueOf2 = Integer.valueOf(i4);
                        x6h1 x6h1VarC4 = y6h1Var.c();
                        x6h1VarC4.i.add(new a7h1("transition_option", str7, numValueOf2, (String) null, (String) null));
                        x6h1VarC4.j = false;
                        y6h1 y6h1VarA = x6h1VarC4.a();
                        r6h1 r6h1Var = r6h1.c;
                        r6h1 r6h1Var2 = new r6h1(kk0.l(y6h1VarA), (u8h1) null);
                        y6h1 y6h1Var2 = y6h1.i;
                        x6h1 x6h1VarI = i3o1.i();
                        x6h1VarI.h = "music";
                        x6h1VarI.a = "mobile-play-button";
                        x6h1VarI.f = "2.0.0";
                        x6h1VarI.g = "22.0.0";
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", "")), x6h1VarI.a(), r6h1Var2, System.currentTimeMillis());
                    } else {
                        if (!(rmk0Var instanceof omk0)) {
                            eg.o();
                            return null;
                        }
                        int i5 = ((omk0) rmk0Var).a;
                        sr10 sr10Var4 = (sr10) o7h.t0(i5, list);
                        String str8 = (sr10Var4 == null || (str = sr10Var4.b) == null) ? "" : str;
                        Integer numValueOf3 = Integer.valueOf(i5);
                        x6h1 x6h1VarC5 = y6h1Var.c();
                        x6h1VarC5.i.add(new a7h1("transition_option", str8, numValueOf3, (String) null, (String) null));
                        x6h1VarC5.j = false;
                        y6h1 y6h1VarA2 = x6h1VarC5.a();
                        r6h1 r6h1Var3 = r6h1.c;
                        r6h1 r6h1Var4 = new r6h1(kk0.l(y6h1VarA2), (u8h1) null);
                        y6h1 y6h1Var3 = y6h1.i;
                        x6h1 x6h1VarI2 = i3o1.i();
                        x6h1VarI2.h = "music";
                        x6h1VarI2.a = "mobile-play-button";
                        x6h1VarI2.f = "2.0.0";
                        x6h1VarI2.g = "22.0.0";
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("pause", 1, Collections.singletonMap("item_to_be_paused", "")), x6h1VarI2.a(), r6h1Var4, System.currentTimeMillis());
                    }
                }
                return w7h1Var;
            case 2:
                ((Number) obj3).intValue();
                return new dkl0((r6h1) obj4);
            case 3:
                h6m0 h6m0Var = (n8h1) obj;
                ikm0 ikm0Var = (lkm0) obj4;
                int iC = l1d.C(((pkm0) obj2).c);
                if (iC != 0) {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    if (ikm0Var instanceof ikm0) {
                        h6m0 h6m0Var2 = h6m0Var;
                        ikm0 ikm0Var2 = ikm0Var;
                        Integer numValueOf4 = Integer.valueOf(ikm0Var2.b);
                        String str9 = ikm0Var2.a;
                        x6h1 x6h1VarC6 = h6m0Var2.a.c();
                        x6h1VarC6.i.add(new a7h1("recommendations_carousel_item", (String) null, numValueOf4, str9, (String) null));
                        x6h1VarC6.j = false;
                        y6h1 y6h1VarA3 = x6h1VarC6.a();
                        String str10 = ikm0Var2.a;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str10 != null ? str10 : "")), y6h1VarA3, h6m0Var2.b.a, System.currentTimeMillis());
                    } else {
                        if (!(ikm0Var instanceof jkm0)) {
                            if (ikm0Var instanceof kkm0) {
                                return null;
                            }
                            eg.o();
                            return null;
                        }
                        h6m0 h6m0Var3 = h6m0Var;
                        jkm0 jkm0Var = (jkm0) ikm0Var;
                        Integer numValueOf5 = Integer.valueOf(jkm0Var.b);
                        String str11 = jkm0Var.a;
                        x6h1 x6h1VarC7 = h6m0Var3.a.c();
                        x6h1VarC7.i.add(new a7h1("recommendations_carousel_item", (String) null, numValueOf5, str11, (String) null));
                        x6h1VarC7.j = false;
                        y6h1 y6h1VarA4 = x6h1VarC7.a();
                        String str12 = jkm0Var.a;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str12 != null ? str12 : "")), y6h1VarA4, h6m0Var3.b.a, System.currentTimeMillis());
                    }
                } else {
                    if (!(ikm0Var instanceof jkm0)) {
                        if (!(ikm0Var instanceof kkm0)) {
                            if (ikm0Var instanceof ikm0) {
                                return null;
                            }
                            eg.o();
                            return null;
                        }
                        i6m0 i6m0Var = (i6m0) h6m0Var;
                        kkm0 kkm0Var = (kkm0) ikm0Var;
                        Integer numValueOf6 = Integer.valueOf(kkm0Var.b);
                        String str13 = kkm0Var.a;
                        x6h1 x6h1VarC8 = i6m0Var.a.c();
                        x6h1VarC8.i.add(new a7h1("recommendations_list_item", (String) null, numValueOf6, str13, (String) null));
                        x6h1VarC8.j = false;
                        x6h1 x6h1VarC9 = x6h1VarC8.a().c();
                        x6h1VarC9.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC9.j = false;
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC9.a(), i6m0Var.b.a, System.currentTimeMillis());
                    }
                    i6m0 i6m0Var2 = (i6m0) h6m0Var;
                    jkm0 jkm0Var2 = (jkm0) ikm0Var;
                    Integer numValueOf7 = Integer.valueOf(jkm0Var2.b);
                    String str14 = jkm0Var2.a;
                    x6h1 x6h1VarC10 = i6m0Var2.a.c();
                    x6h1VarC10.i.add(new a7h1("recommendations_list_item", (String) null, numValueOf7, str14, (String) null));
                    x6h1VarC10.j = false;
                    y6h1 y6h1VarA5 = x6h1VarC10.a();
                    String str15 = jkm0Var2.a;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str15 != null ? str15 : "")), y6h1VarA5, i6m0Var2.b.a, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 4:
                ((Number) obj3).intValue();
                return new gnl0((r6h1) obj4);
            case 5:
                return null;
            case 6:
                ((Number) obj3).intValue();
                return new ndl0((r6h1) obj4);
            case 7:
                ndl0 ndl0Var = (ndl0) obj;
                dqm0 dqm0Var = (fqm0) obj4;
                List list2 = ((gqm0) obj2).a;
                if (dqm0Var.equals(eqm0.a)) {
                    return list2.size() == 1 ? ndl0Var.a((String) o7h.q0(list2)) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), ndl0Var.b, ndl0Var.a, System.currentTimeMillis());
                }
                if (dqm0Var instanceof dqm0) {
                    return ndl0Var.a(dqm0Var.a);
                }
                eg.o();
                return null;
            case 8:
                ((Number) obj3).intValue();
                return new osl0((r6h1) obj4);
            case 9:
                osl0 osl0Var = (osl0) obj;
                r6h1 r6h1Var5 = osl0Var.a;
                y6h1 y6h1Var4 = osl0Var.b;
                if (((bxm0) obj4).a == ((gxm0) obj3).a.b) {
                    x6h1 x6h1VarC11 = y6h1Var4.c();
                    x6h1VarC11.i.add(new a7h1("answer_item", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC11.j = false;
                    x6h1 x6h1VarC12 = x6h1VarC11.a().c();
                    x6h1VarC12.i.add(new a7h1("correct_answer", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC12.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC12.a(), r6h1Var5, System.currentTimeMillis());
                }
                x6h1 x6h1VarC13 = y6h1Var4.c();
                x6h1VarC13.i.add(new a7h1("answer_item", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC13.j = false;
                x6h1 x6h1VarC14 = x6h1VarC13.a().c();
                x6h1VarC14.i.add(new a7h1("incorrect_answer", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC14.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC14.a(), r6h1Var5, System.currentTimeMillis());
            case 10:
                ((Number) obj3).intValue();
                return Boolean.TRUE;
            case 11:
                ((Number) obj3).intValue();
                return Boolean.TRUE;
            case 12:
                ((Number) obj3).intValue();
                return new nil0((r6h1) obj4);
            case 13:
                nil0 nil0Var = (nil0) obj;
                rym0 rym0Var = (rym0) obj3;
                pym0 pym0Var = (pym0) obj4;
                if (!(pym0Var instanceof oym0)) {
                    if (pym0Var instanceof nym0) {
                        i2 = -((nym0) pym0Var).a;
                    } else {
                        eg.o();
                    }
                    return w7h1Var7;
                }
                i2 = ((oym0) pym0Var).a;
                int i6 = (int) rym0Var.b.a;
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                String strValueOf = String.valueOf(i2);
                if (strValueOf == null) {
                    strValueOf = "";
                }
                mmr0 mmr0Var = new mmr0("ms_seeked_offset", strValueOf);
                String strValueOf2 = String.valueOf(i6);
                w7h1Var7 = new w7h1("", "", z7h1Var, new x7h1("seek_by_time", 2, sqg0.J(new mmr0[]{mmr0Var, new mmr0("position_ms", strValueOf2 != null ? strValueOf2 : "")})), nil0Var.b, nil0Var.a, System.currentTimeMillis());
                return w7h1Var7;
            case 14:
                ((Number) obj3).intValue();
                return new zsl0((r6h1) obj4);
            case 15:
                return null;
            case 16:
                return new psl0(Integer.valueOf(((Number) obj3).intValue()), ((t5n0) obj).a, (r6h1) obj4);
            case 17:
                psl0 psl0Var = (psl0) obj;
                o5n0 o5n0Var = (o5n0) obj4;
                r6h1 r6h1Var6 = psl0Var.a;
                y6h1 y6h1Var5 = psl0Var.b;
                if (o5n0Var instanceof m5n0) {
                    x6h1 x6h1VarC15 = y6h1Var5.c();
                    x6h1VarC15.i.add(new a7h1("action_button", (String) null, (Integer) null, (String) null, "play_quiz"));
                    x6h1VarC15.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ((m5n0) o5n0Var).a)), x6h1VarC15.a(), r6h1Var6, System.currentTimeMillis());
                } else {
                    if (!(o5n0Var instanceof n5n0)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC16 = y6h1Var5.c();
                    x6h1VarC16.i.add(new a7h1("action_button", (String) null, (Integer) null, (String) null, "share"));
                    x6h1VarC16.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("share", 2, sqg0.J(new mmr0[]{new mmr0("entity_to_be_shared", ((n5n0) o5n0Var).a), new mmr0("share_id", "music-quiz-share-id")})), x6h1VarC16.a(), r6h1Var6, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 18:
                inl0 inl0Var = (inl0) obj;
                w8n0 w8n0Var = (w8n0) obj4;
                y6h1 y6h1Var6 = inl0Var.a;
                fjl0 fjl0Var = inl0Var.b.c;
                y8n0 y8n0Var = ((a9n0) obj2).a;
                y8n0 y8n0Var2 = y8n0Var instanceof y8n0 ? y8n0Var : null;
                String str16 = y8n0Var2 != null ? y8n0Var2.b : null;
                String str17 = str16 != null ? str16 : "";
                int iOrdinal = w8n0Var.ordinal();
                if (iOrdinal == 0) {
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str17)), y6h1Var6, fjl0Var.b, System.currentTimeMillis());
                } else {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            eg.o();
                            return null;
                        }
                        x6h1 x6h1VarC17 = y6h1Var6.c();
                        x6h1VarC17.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC17.j = false;
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC17.a(), fjl0Var.b, System.currentTimeMillis());
                    }
                    w7h1Var4 = new w7h1("", "", new z7h1("long_hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var6, fjl0Var.b, System.currentTimeMillis());
                }
                return w7h1Var4;
            case 19:
                return new ggl0(Integer.valueOf(((Number) obj3).intValue()), ((gey0) obj).a, (r6h1) obj4);
            case 20:
                ggl0 ggl0Var = (ggl0) obj;
                gey0 gey0Var = (gey0) obj2;
                h700 h700Var = (h700) obj4;
                r6h1 r6h1Var7 = ggl0Var.a;
                y6h1 y6h1Var7 = ggl0Var.b;
                if (h700Var.equals(j400.a)) {
                    String str18 = gey0Var.a;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str18 != null ? str18 : "")), y6h1Var7, r6h1Var7, System.currentTimeMillis());
                } else if (h700Var.equals(m400.a)) {
                    w7h1Var5 = new w7h1("", "", new z7h1("long_hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var7, r6h1Var7, System.currentTimeMillis());
                } else {
                    if (!h700Var.equals(kxz.a)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC18 = y6h1Var7.c();
                    x6h1VarC18.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC18.j = false;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC18.a(), r6h1Var7, System.currentTimeMillis());
                }
                return w7h1Var5;
            case 21:
                ((Number) obj3).intValue();
                return new sfl0((r6h1) obj4);
            case 22:
                sfl0 sfl0Var = (sfl0) obj;
                yfn0 yfn0Var = (yfn0) obj3;
                r6h1 r6h1Var8 = sfl0Var.a;
                y6h1 y6h1Var8 = sfl0Var.b;
                if (yfn0Var.b) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), y6h1Var8, r6h1Var8, System.currentTimeMillis());
                }
                return yfn0Var.a ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("unmute_playback", 1, b7xVar), y6h1Var8, r6h1Var8, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("mute_playback", 1, b7xVar), y6h1Var8, r6h1Var8, System.currentTimeMillis());
            case 23:
                ((Number) obj3).intValue();
                return new x8l0(new y8l0());
            case 24:
                ((Number) obj3).intValue();
                return new p7l0((r6h1) obj4);
            case 25:
                ((Number) obj3).intValue();
                return new tfl0((r6h1) obj4);
            case 26:
                y6h1 y6h1Var9 = ((vbl0) obj).a;
                int iOrdinal2 = ((osn0) obj4).ordinal();
                if (iOrdinal2 == 0) {
                    x6h1 x6h1VarC19 = y6h1Var9.c();
                    x6h1VarC19.i.add(new a7h1("manage_invites_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC19.j = false;
                    y6h1 y6h1VarA6 = x6h1VarC19.a();
                    String str19 = nik1.C2.a;
                    w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str19 != null ? str19 : "")), y6h1VarA6, r6h1.c, System.currentTimeMillis());
                } else {
                    if (iOrdinal2 != 1) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC20 = y6h1Var9.c();
                    x6h1VarC20.i.add(new a7h1("listening_activity_settings_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC20.j = false;
                    y6h1 y6h1VarA7 = x6h1VarC20.a();
                    String str20 = nik1.u4.a;
                    w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str20 != null ? str20 : "")), y6h1VarA7, r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var6;
            case 27:
                ((Number) obj3).intValue();
                return new vtk0(new xok0((byte) 8));
            case 28:
                vtk0 vtk0Var = (vtk0) obj;
                if (e2o0.a[((a2o0) obj4).ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC21 = vtk0Var.a.c();
                x6h1VarC21.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC21.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC21.a(), r6h1.c, System.currentTimeMillis());
            default:
                h3o0 h3o0Var = (h3o0) obj;
                if (j3o0.a[((f3o0) obj4).ordinal()] == 1) {
                    return h3o0Var.d();
                }
                eg.o();
                return null;
        }
    }
}
