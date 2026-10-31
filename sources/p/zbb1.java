package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zbb1 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zbb1(xpw xpwVar, byte b) {
        super(4);
        this.a = b;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        w7h1 w7h1Var4;
        Object obj5;
        char c;
        String str;
        w7h1 w7h1Var5;
        byte b = this.a;
        int i = 2;
        b7x b7xVar = b7x.a;
        switch (b) {
            case 0:
                qml0 qml0Var = (qml0) obj;
                sbb1 sbb1Var = (sbb1) obj2;
                if (ybb1.a[((jbb1) obj4).ordinal()] == 1) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", aqv.a(sbb1Var.a))), qml0Var.a, qml0Var.b.b, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 1:
                tml0 tml0Var = (tml0) obj;
                mcb1 mcb1Var = (mcb1) obj2;
                kcb1 kcb1Var = (kcb1) obj4;
                r6h1 r6h1Var = tml0Var.a;
                y6h1 y6h1Var = tml0Var.b;
                if (kcb1Var instanceof jcb1) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("sort_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), r6h1Var, System.currentTimeMillis());
                } else {
                    if (kcb1Var instanceof icb1) {
                        return null;
                    }
                    if (!(kcb1Var instanceof hcb1)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("edit_name_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ktv.d(mcb1Var.a))), x6h1VarC2.a(), r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var;
            case 2:
                m6m0 m6m0Var = (m6m0) obj;
                ksb1 ksb1Var = (ksb1) obj2;
                String strE = qsb1.e(ksb1Var.b.a, ksb1Var.c);
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strE != null ? strE : "")), m6m0Var.a, m6m0Var.b.c.b, System.currentTimeMillis());
            case 3:
                x6h1 x6h1VarC3 = ((o7l0) obj).a.c();
                x6h1VarC3.i.add(new a7h1("remove_parental_controls_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", c0c1.e((b0c1) obj2))), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
            case 4:
                ((Number) obj3).intValue();
                int iC = l1d.C(((ywc1) obj).a);
                if (iC == 0) {
                    i = 1;
                } else if (iC != 1) {
                    eg.o();
                    return null;
                }
                return new q9l0(i);
            case 5:
                k6m0 k6m0Var = (k6m0) obj;
                n8f1 n8f1Var = (n8f1) obj2;
                l8f1 l8f1Var = (l8f1) obj4;
                r6h1 r6h1Var2 = k6m0Var.b.a;
                y6h1 y6h1Var2 = k6m0Var.a;
                if (l8f1Var instanceof h8f1) {
                    List items = n8f1Var.getItems();
                    h8f1 h8f1Var = (h8f1) l8f1Var;
                    String str2 = h8f1Var.b;
                    int i2 = h8f1Var.a;
                    int i3 = z72.i(i2, items);
                    Integer numValueOf = Integer.valueOf(i2);
                    x6h1 x6h1VarC4 = y6h1Var2.c();
                    x6h1VarC4.i.add(new a7h1("top_chart_item", (String) null, numValueOf, str2, z3m0.h(i3)));
                    x6h1VarC4.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC4.a(), r6h1Var2, System.currentTimeMillis());
                } else if (l8f1Var instanceof i8f1) {
                    List items2 = n8f1Var.getItems();
                    i8f1 i8f1Var = (i8f1) l8f1Var;
                    int i4 = i8f1Var.a;
                    int i5 = z72.i(i4, items2);
                    Integer numValueOf2 = Integer.valueOf(i4);
                    String str3 = i8f1Var.b;
                    x6h1 x6h1VarC5 = y6h1Var2.c();
                    x6h1VarC5.i.add(new a7h1("top_chart_item", (String) null, numValueOf2, str3, z3m0.h(i5)));
                    x6h1VarC5.j = false;
                    x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                    x6h1VarC6.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC6.a(), r6h1Var2, System.currentTimeMillis());
                } else if (l8f1Var instanceof k8f1) {
                    List items3 = n8f1Var.getItems();
                    k8f1 k8f1Var = (k8f1) l8f1Var;
                    int i6 = k8f1Var.a;
                    int i7 = z72.i(i6, items3);
                    Integer numValueOf3 = Integer.valueOf(i6);
                    String str4 = k8f1Var.b;
                    x6h1 x6h1VarC7 = y6h1Var2.c();
                    x6h1VarC7.i.add(new a7h1("top_chart_item", (String) null, numValueOf3, str4, z3m0.h(i7)));
                    x6h1VarC7.j = false;
                    x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                    x6h1VarC8.i.add(new a7h1("face_pile", (String) null, (Integer) null, (String) null, "1"));
                    x6h1VarC8.j = false;
                    y6h1 y6h1VarA = x6h1VarC8.a();
                    String str5 = k8f1Var.b;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5 != null ? str5 : "")), y6h1VarA, r6h1Var2, System.currentTimeMillis());
                } else {
                    if (!(l8f1Var instanceof j8f1)) {
                        eg.o();
                        return null;
                    }
                    List items4 = n8f1Var.getItems();
                    j8f1 j8f1Var = (j8f1) l8f1Var;
                    int i8 = j8f1Var.a;
                    int i9 = z72.i(i8, items4);
                    Integer numValueOf4 = Integer.valueOf(i8);
                    String str6 = j8f1Var.b;
                    x6h1 x6h1VarC9 = y6h1Var2.c();
                    x6h1VarC9.i.add(new a7h1("top_chart_item", (String) null, numValueOf4, str6, z3m0.h(i9)));
                    x6h1VarC9.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC9.a();
                    String strValueOf = String.valueOf(((q8f1) n8f1Var.getItems().get(i8)).t.size());
                    x6h1 x6h1VarC10 = y6h1VarA2.c();
                    x6h1VarC10.i.add(new a7h1("face_pile", (String) null, (Integer) null, (String) null, strValueOf));
                    x6h1VarC10.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC10.a(), r6h1Var2, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 6:
                k6m0 k6m0Var2 = (k6m0) obj;
                wff1 wff1Var = (wff1) obj2;
                uff1 uff1Var = (uff1) obj4;
                r6h1 r6h1Var3 = k6m0Var2.b.a;
                y6h1 y6h1Var3 = k6m0Var2.a;
                if (uff1Var instanceof tff1) {
                    List items5 = wff1Var.getItems();
                    tff1 tff1Var = (tff1) uff1Var;
                    int i10 = tff1Var.a;
                    int iF = pt.F(i10, items5);
                    Integer numValueOf5 = Integer.valueOf(i10);
                    String str7 = tff1Var.b;
                    x6h1 x6h1VarC11 = y6h1Var3.c();
                    x6h1VarC11.i.add(new a7h1("top_chart_item", (String) null, numValueOf5, str7, z3m0.h(iF)));
                    x6h1VarC11.j = false;
                    y6h1 y6h1VarA3 = x6h1VarC11.a();
                    String str8 = tff1Var.b;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str8 != null ? str8 : "")), y6h1VarA3, r6h1Var3, System.currentTimeMillis());
                } else if (uff1Var instanceof pff1) {
                    List items6 = wff1Var.getItems();
                    pff1 pff1Var = (pff1) uff1Var;
                    int i11 = pff1Var.a;
                    int iF2 = pt.F(i11, items6);
                    Integer numValueOf6 = Integer.valueOf(i11);
                    String str9 = pff1Var.b;
                    x6h1 x6h1VarC12 = y6h1Var3.c();
                    x6h1VarC12.i.add(new a7h1("top_chart_item", (String) null, numValueOf6, str9, z3m0.h(iF2)));
                    x6h1VarC12.j = false;
                    x6h1 x6h1VarC13 = x6h1VarC12.a().c();
                    x6h1VarC13.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC13.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC13.a(), r6h1Var3, System.currentTimeMillis());
                } else if (uff1Var instanceof rff1) {
                    List items7 = wff1Var.getItems();
                    rff1 rff1Var = (rff1) uff1Var;
                    int i12 = rff1Var.a;
                    int iF3 = pt.F(i12, items7);
                    Integer numValueOf7 = Integer.valueOf(i12);
                    String str10 = rff1Var.b;
                    x6h1 x6h1VarC14 = y6h1Var3.c();
                    x6h1VarC14.i.add(new a7h1("top_chart_item", (String) null, numValueOf7, str10, z3m0.h(iF3)));
                    x6h1VarC14.j = false;
                    x6h1 x6h1VarC15 = x6h1VarC14.a().c();
                    x6h1VarC15.i.add(new a7h1("face_pile", (String) null, (Integer) null, (String) null, "1"));
                    x6h1VarC15.j = false;
                    y6h1 y6h1VarA4 = x6h1VarC15.a();
                    String str11 = rff1Var.b;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str11 != null ? str11 : "")), y6h1VarA4, r6h1Var3, System.currentTimeMillis());
                } else {
                    if (!(uff1Var instanceof qff1)) {
                        return null;
                    }
                    List items8 = wff1Var.getItems();
                    qff1 qff1Var = (qff1) uff1Var;
                    int i13 = qff1Var.a;
                    int iF4 = pt.F(i13, items8);
                    Integer numValueOf8 = Integer.valueOf(i13);
                    String str12 = qff1Var.b;
                    x6h1 x6h1VarC16 = y6h1Var3.c();
                    x6h1VarC16.i.add(new a7h1("top_chart_item", (String) null, numValueOf8, str12, z3m0.h(iF4)));
                    x6h1VarC16.j = false;
                    y6h1 y6h1VarA5 = x6h1VarC16.a();
                    String strValueOf2 = String.valueOf(((zff1) wff1Var.getItems().get(i13)).Y.size());
                    x6h1 x6h1VarC17 = y6h1VarA5.c();
                    x6h1VarC17.i.add(new a7h1("face_pile", (String) null, (Integer) null, (String) null, strValueOf2));
                    x6h1VarC17.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC17.a(), r6h1Var3, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 7:
                nrl0 nrl0Var = (nrl0) obj;
                jah1 jah1Var = (jah1) obj2;
                if (!((iah1) obj4).equals(iah1.a)) {
                    eg.o();
                    return null;
                }
                if (jah1Var.c) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:internal:magpie:edit-ucp-prompt")), nrl0Var.b, nrl0Var.a, System.currentTimeMillis());
                }
                return null;
            case 8:
                mrl0 mrl0Var = (mrl0) obj;
                tbh1 tbh1Var = (tbh1) obj2;
                sbh1 sbh1Var = (sbh1) obj4;
                r6h1 r6h1Var4 = mrl0Var.a;
                y6h1 y6h1Var4 = mrl0Var.b;
                if (!tbh1Var.d) {
                    return null;
                }
                if (sbh1Var.equals(qbh1.a)) {
                    return mrl0Var.a("spotify:internal:magpie:edit-ucp-prompt");
                }
                if (sbh1Var.equals(rbh1.a)) {
                    if (tbh1Var.c) {
                        return mrl0Var.a("spotify:internal:magpie:edit-ucp-prompt");
                    }
                    x6h1 x6h1VarC18 = y6h1Var4.c();
                    x6h1VarC18.i.add(new a7h1("update_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC18.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("refresh_content", 1, b7xVar), x6h1VarC18.a(), r6h1Var4, System.currentTimeMillis());
                } else {
                    if (!sbh1Var.equals(pbh1.a)) {
                        eg.o();
                        return null;
                    }
                    if (tbh1Var.g) {
                        return null;
                    }
                    x6h1 x6h1VarC19 = y6h1Var4.c();
                    x6h1VarC19.i.add(new a7h1("delete_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC19.j = false;
                    y6h1 y6h1VarA6 = x6h1VarC19.a();
                    String str13 = tbh1Var.b.a;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("delete_prompt", 1, Collections.singletonMap("prompt_to_be_deleted", str13 != null ? str13 : "")), y6h1VarA6, r6h1Var4, System.currentTimeMillis());
                }
                return w7h1Var4;
            case 9:
                ((Number) obj3).intValue();
                g5l0 g5l0Var = new g5l0((r6h1) obj4, (byte) 4);
                String str14 = ((cxc0) obj).f.a;
                return (str14.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || str14.equals("spotify:collection:tracks") || str14.equals("spotify:internal:collection:tracks") || (nhc1.Y(str14, "spotify:user:", false) && nhc1.R(str14, ":collection", false))) ? new v6l0(new u6l0(g5l0Var, (byte) 1), str14) : new w6l0(new u6l0(g5l0Var, (byte) 2), str14);
            case 10:
                sdl0 sdl0Var = (sdl0) obj;
                hyi1 hyi1Var = (hyi1) obj2;
                gyi1 gyi1Var = (gyi1) obj4;
                if (gyi1Var.equals(fyi1.a)) {
                    String strE2 = hyi1Var.c;
                    if (strE2 == null) {
                        strE2 = b7u.e(hyi1Var.a, hyi1Var.b, hyi1Var.d);
                    }
                    return sdl0Var.e(strE2);
                }
                if (gyi1Var instanceof eyi1) {
                    return sdl0Var.e(((eyi1) gyi1Var).a);
                }
                eg.o();
                return null;
            case 11:
                tfl0 tfl0Var = (tfl0) obj;
                nli0 nli0Var = (nli0) obj4;
                if (!(nli0Var instanceof nli0)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC20 = tfl0Var.b.c();
                x6h1VarC20.i.add(new a7h1("managed_group", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC20.j = false;
                x6h1 x6h1VarC21 = x6h1VarC20.a().c();
                x6h1VarC21.i.add(new a7h1("video_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC21.j = false;
                y6h1 y6h1VarA7 = x6h1VarC21.a();
                boolean z = nli0Var.a;
                char c2 = z ? (char) 1 : (char) 2;
                char c3 = z ? (char) 2 : (char) 1;
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                String str15 = "video_off";
                if (c2 == 1) {
                    obj5 = "video_off";
                } else {
                    if (c2 != 2) {
                        throw null;
                    }
                    obj5 = "video_on";
                }
                mmr0 mmr0Var = new mmr0("state_before_toggle", obj5);
                if (c3 != 1) {
                    if (c3 != 2) {
                        throw null;
                    }
                    str15 = "video_on";
                }
                return new w7h1("", "", z7h1Var, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("state_after_toggle", str15)})), y6h1VarA7, tfl0Var.a, System.currentTimeMillis());
            case 12:
                ((Number) obj3).intValue();
                r6h1 r6h1Var5 = (r6h1) obj4;
                l090 l090VarA = ((xpj1) obj2).a();
                if (l090VarA != null) {
                    if (l090VarA instanceof k090) {
                        i = 1;
                    } else if (!(l090VarA instanceof j090)) {
                        eg.o();
                        return null;
                    }
                }
                return new jjl0(i, r6h1Var5);
            case 13:
                dhl0 dhl0Var = (dhl0) obj;
                yvj1 yvj1Var = ((dwj1) obj4).a;
                if (yvj1Var.equals(wvj1.a)) {
                    c = 1;
                } else {
                    if (!(yvj1Var instanceof yvj1)) {
                        eg.o();
                        return null;
                    }
                    int iOrdinal = yvj1Var.a.ordinal();
                    if (iOrdinal == 0) {
                        c = 5;
                    } else if (iOrdinal == 1) {
                        c = 2;
                    } else if (iOrdinal == 2) {
                        c = 4;
                    } else {
                        if (iOrdinal != 3) {
                            eg.o();
                            return null;
                        }
                        c = 3;
                    }
                }
                z7h1 z7h1Var2 = new z7h1("hit", 1, b7xVar);
                mmr0 mmr0Var2 = new mmr0("setting_name", "video_quality_option");
                if (c == 1) {
                    str = "auto";
                } else if (c == 2) {
                    str = "high";
                } else if (c == 3) {
                    str = "low";
                } else if (c == 4) {
                    str = "medium";
                } else {
                    if (c != 5) {
                        throw null;
                    }
                    str = "very_high";
                }
                return new w7h1("", "", z7h1Var2, new x7h1("set_multiple_choice_setting", 1, sqg0.J(new mmr0[]{mmr0Var2, new mmr0("option_selected", str)})), dhl0Var.a, r6h1.c, System.currentTimeMillis());
            case 14:
                x6h1 x6h1VarC22 = ((o7l0) obj).a.c();
                x6h1VarC22.i.add(new a7h1("video_settings_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC22.j = false;
                y6h1 y6h1VarA8 = x6h1VarC22.a();
                String strE3 = k1k1.e((j1k1) obj2);
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strE3 != null ? strE3 : "")), y6h1VarA8, r6h1.c, System.currentTimeMillis());
            case 15:
                lys lysVar = (lys) obj;
                n6k1 n6k1Var = (n6k1) obj3;
                if (((k6k1) obj4) == k6k1.a) {
                    return lysVar.a.a((String) ihc1.Q0(n6k1Var.a.b, new String[]{"?"}, 0, 6).get(0));
                }
                eg.o();
                return null;
            case 16:
                irl0 irl0Var = (irl0) obj;
                hek1 hek1Var = (hek1) obj3;
                fek1 fek1Var = (fek1) obj4;
                r6h1 r6h1Var6 = irl0Var.a;
                y6h1 y6h1Var5 = irl0Var.b;
                if (fek1Var instanceof cek1) {
                    if (pt.G(hek1Var)) {
                        x6h1 x6h1VarC23 = y6h1Var5.c();
                        x6h1VarC23.i.add(new a7h1("prompt_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC23.j = true;
                        w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC23.a(), r6h1Var6, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC24 = y6h1Var5.c();
                        x6h1VarC24.i.add(new a7h1("prompt_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC24.j = true;
                        w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:internal:magpie")), x6h1VarC24.a(), r6h1Var6, System.currentTimeMillis());
                    }
                } else {
                    if (!(fek1Var instanceof eek1)) {
                        if (fek1Var instanceof dek1) {
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC25 = y6h1Var5.c();
                    x6h1VarC25.i.add(new a7h1("prompt_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC25.j = true;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:internal:magpie")), x6h1VarC25.a(), r6h1Var6, System.currentTimeMillis());
                }
                return w7h1Var5;
            default:
                n8h1 n8h1Var = (n8h1) obj;
                eym1 eym1Var = (eym1) obj4;
                if (eym1Var instanceof cym1) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:account-management:your-premium")), ((tzl0) n8h1Var).a, r6h1.c, System.currentTimeMillis());
                }
                if (eym1Var instanceof dym1) {
                    return null;
                }
                eg.o();
                return null;
        }
    }
}
