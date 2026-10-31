package p;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class njf0 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i8h1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ njf0(i8h1 i8h1Var, byte b) {
        super(4);
        this.a = b;
        this.b = i8h1Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        Object obj5;
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        char c;
        String str;
        w7h1 w7h1Var4;
        w7h1 w7h1Var5;
        w7h1 w7h1Var6;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        i8h1 i8h1Var = this.b;
        switch (b) {
            case 0:
                ojf0 ojf0Var = (ojf0) obj3;
                mif0 mif0Var = (mjf0) obj4;
                pfm0 pfm0Var = ojf0Var.O0;
                dof1 dof1Var = ojf0Var.a;
                String str2 = dof1Var.d;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-lyrics-fullscreen";
                x6h1VarI.f = "8.2.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.d = str2;
                y6h1 y6h1VarA = x6h1VarI.a();
                List listSingletonList = Collections.singletonList("lyrics/fullscreen");
                if (!(mif0Var instanceof dif0)) {
                    if (mif0Var instanceof eif0) {
                        x6h1 x6h1VarC = y6h1VarA.c();
                        x6h1VarC.i.add(new a7h1("header_view", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC.j = false;
                        x6h1 x6h1VarC2 = x6h1VarC.a().c();
                        x6h1VarC2.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC2.j = false;
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                    } else {
                        if (mif0Var instanceof yif0) {
                            mif0 mif0Var2 = (yif0) mif0Var;
                            if (mif0Var2 instanceof xif0) {
                                mmr0 mmr0Var = ((xif0) mif0Var2).a ? new mmr0(rel0.c, qel0.b) : new mmr0(rel0.b, qel0.c);
                                rel0 rel0Var = (rel0) mmr0Var.a;
                                qel0 qel0Var = (qel0) mmr0Var.b;
                                x6h1 x6h1VarC3 = y6h1VarA.c();
                                x6h1VarC3.i.add(new a7h1("control_panel_view", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC3.j = false;
                                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                                x6h1VarC4.i.add(new a7h1("vocal_removal_button", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC4.j = true;
                                w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{new mmr0("state_before_toggle", rel0Var.a), new mmr0("state_after_toggle", qel0Var.a)})), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
                                return w7h1Var;
                            }
                            if (mif0Var2 instanceof kif0) {
                                x6h1 x6h1VarC5 = y6h1VarA.c();
                                x6h1VarC5.i.add(new a7h1("context_menu", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC5.j = false;
                                x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                                x6h1VarC6.i.add(new a7h1("more_actions_sheet", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC6.j = false;
                                x6h1 x6h1VarC7 = x6h1VarC6.a().c();
                                x6h1VarC7.i.add(new a7h1("report_problem_item", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC7.j = false;
                                w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "")), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis());
                            } else if (mif0Var2 instanceof lif0) {
                                x6h1 x6h1VarC8 = y6h1VarA.c();
                                x6h1VarC8.i.add(new a7h1("context_menu", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC8.j = false;
                                x6h1 x6h1VarC9 = x6h1VarC8.a().c();
                                x6h1VarC9.i.add(new a7h1("more_actions_sheet", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC9.j = false;
                                x6h1 x6h1VarC10 = x6h1VarC9.a().c();
                                x6h1VarC10.i.add(new a7h1("translate_lyrics_item", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC10.j = false;
                                w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "")), x6h1VarC10.a(), r6h1.c, System.currentTimeMillis());
                            } else if (mif0Var2 instanceof mif0) {
                                int iOrdinal = mif0Var2.a.ordinal();
                                if (iOrdinal == 0) {
                                    c = 1;
                                } else if (iOrdinal == 1) {
                                    c = 3;
                                } else if (iOrdinal == 2) {
                                    c = 4;
                                } else {
                                    if (iOrdinal != 3) {
                                        eg.o();
                                        return null;
                                    }
                                    c = 2;
                                }
                                x6h1 x6h1VarC11 = y6h1VarA.c();
                                x6h1VarC11.i.add(new a7h1("context_menu", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC11.j = false;
                                x6h1 x6h1VarC12 = x6h1VarC11.a().c();
                                x6h1VarC12.i.add(new a7h1("report_problem_sheet", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC12.j = false;
                                x6h1 x6h1VarC13 = x6h1VarC12.a().c();
                                if (c == 1) {
                                    str = "all_lyrics_are_wrong";
                                } else if (c == 2) {
                                    str = "lyrics_not_synced_properly";
                                } else if (c == 3) {
                                    str = "some_lyrics_are_wrong";
                                } else {
                                    if (c != 4) {
                                        throw null;
                                    }
                                    str = "some_translations_are_wrong";
                                }
                                x6h1VarC13.i.add(new a7h1("lyrics_problem_item", (String) null, (Integer) null, (String) null, str));
                                x6h1VarC13.j = false;
                                w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC13.a(), r6h1.c, System.currentTimeMillis());
                            } else {
                                if ((mif0Var2 instanceof hif0) && u890.j((iim) o7h.C0(ojf0Var.X), cim.a)) {
                                    x6h1 x6h1VarC14 = y6h1VarA.c();
                                    x6h1VarC14.i.add(new a7h1("context_menu", (String) null, (Integer) null, (String) null, (String) null));
                                    x6h1VarC14.j = false;
                                    x6h1 x6h1VarC15 = x6h1VarC14.a().c();
                                    x6h1VarC15.i.add(new a7h1("report_problem_sheet", (String) null, (Integer) null, (String) null, (String) null));
                                    x6h1VarC15.j = false;
                                    x6h1 x6h1VarC16 = x6h1VarC15.a().c();
                                    x6h1VarC16.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                                    x6h1VarC16.j = false;
                                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC16.a(), r6h1.c, System.currentTimeMillis());
                                }
                                obj5 = null;
                            }
                            return w7h1Var4;
                        }
                        if (mif0Var instanceof fjf0) {
                            fjf0 fjf0Var = (fjf0) mif0Var;
                            if (fjf0Var.equals(bjf0.a)) {
                                x6h1 x6h1VarC17 = y6h1VarA.c();
                                x6h1VarC17.i.add(new a7h1("report_corrections_bottom_sheet", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC17.j = true;
                                y6h1 y6h1VarA2 = x6h1VarC17.a();
                                k7h1 k7h1Var = new k7h1();
                                ((xjn) k7h1Var).a = y6h1VarA2;
                                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                                k7h1Var.e = listSingletonList;
                                i8h1Var.f(k7h1Var.a(), (Set) null);
                            } else if (fjf0Var.equals(zif0.a)) {
                                x6h1 x6h1VarC18 = y6h1VarA.c();
                                x6h1VarC18.i.add(new a7h1("report_corrections_bottom_sheet", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC18.j = true;
                                x6h1 x6h1VarC19 = x6h1VarC18.a().c();
                                x6h1VarC19.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC19.j = false;
                                w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC19.a(), r6h1.c, System.currentTimeMillis());
                            } else if (fjf0Var.equals(djf0.a)) {
                                x6h1 x6h1VarC20 = y6h1VarA.c();
                                x6h1VarC20.i.add(new a7h1("report_corrections_bottom_sheet", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC20.j = true;
                                x6h1 x6h1VarC21 = x6h1VarC20.a().c();
                                x6h1VarC21.i.add(new a7h1("submit_button", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC21.j = false;
                                w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC21.a(), r6h1.c, System.currentTimeMillis());
                            } else if (fjf0Var.equals(cjf0.a)) {
                                x6h1 x6h1VarC22 = y6h1VarA.c();
                                x6h1VarC22.i.add(new a7h1("report_corrections_bottom_sheet", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC22.j = true;
                                x6h1 x6h1VarC23 = x6h1VarC22.a().c();
                                x6h1VarC23.i.add(new a7h1("formatting_tips_button", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC23.j = false;
                                w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC23.a(), r6h1.c, System.currentTimeMillis());
                            } else if (!fjf0Var.equals(ajf0.a) && !(fjf0Var instanceof ejf0)) {
                                eg.o();
                            }
                            return null;
                        }
                        if (!(mif0Var instanceof ijf0)) {
                            obj5 = null;
                            if (mif0Var instanceof ljf0) {
                                ljf0 ljf0Var = (ljf0) mif0Var;
                                if (ljf0Var instanceof kjf0) {
                                    mmr0 mmr0Var2 = ((kjf0) ljf0Var).a == xlk1.c ? new mmr0(tel0.c, sel0.b) : new mmr0(tel0.b, sel0.c);
                                    tel0 tel0Var = (tel0) mmr0Var2.a;
                                    sel0 sel0Var = (sel0) mmr0Var2.b;
                                    x6h1 x6h1VarC24 = y6h1VarA.c();
                                    x6h1VarC24.i.add(new a7h1("control_panel_view", (String) null, (Integer) null, (String) null, (String) null));
                                    x6h1VarC24.j = false;
                                    x6h1 x6h1VarC25 = x6h1VarC24.a().c();
                                    x6h1VarC25.i.add(new a7h1("vocal_removal_volume_button", (String) null, (Integer) null, (String) null, (String) null));
                                    x6h1VarC25.j = true;
                                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{new mmr0("state_before_toggle", tel0Var.a), new mmr0("state_after_toggle", sel0Var.a)})), x6h1VarC25.a(), r6h1.c, System.currentTimeMillis());
                                    return w7h1Var;
                                }
                                if (!(ljf0Var instanceof jjf0)) {
                                    eg.o();
                                }
                            }
                        } else if (!(pfm0Var instanceof jfm0) && (((ijf0) mif0Var) instanceof gjf0)) {
                            String str3 = dof1Var.d;
                            r6h1 r6h1Var = r6h1.c;
                            r6h1 r6h1Var2 = new r6h1(kk0.l(y6h1VarA), (u8h1) null);
                            x6h1 x6h1VarI2 = i3o1.i();
                            x6h1VarI2.h = "music";
                            x6h1VarI2.a = "mobile-lyrics-sharing";
                            x6h1VarI2.f = "1.1.0";
                            x6h1VarI2.g = "22.0.0";
                            x6h1VarI2.d = str3;
                            x6h1 x6h1VarC26 = x6h1VarI2.a().c();
                            x6h1VarC26.i.add(new a7h1("share_lyrics_selection_view", (String) null, (Integer) null, str3, (String) null));
                            x6h1VarC26.j = true;
                            x6h1 x6h1VarC27 = x6h1VarC26.a().c();
                            x6h1VarC27.i.add(new a7h1("next_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC27.j = false;
                            w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "")), x6h1VarC27.a(), r6h1Var2, System.currentTimeMillis());
                            return w7h1Var2;
                        }
                        obj5 = null;
                    }
                    return w7h1Var3;
                }
                if (pfm0Var instanceof kfm0) {
                    String str4 = dof1Var.d;
                    r6h1 r6h1Var3 = r6h1.c;
                    r6h1 r6h1Var4 = new r6h1(kk0.l(y6h1VarA), (u8h1) null);
                    y6h1 y6h1Var2 = y6h1.i;
                    x6h1 x6h1VarI3 = i3o1.i();
                    x6h1VarI3.h = "music";
                    x6h1VarI3.a = "mobile-lyrics-sharing";
                    x6h1VarI3.f = "1.1.0";
                    x6h1VarI3.g = "22.0.0";
                    x6h1VarI3.d = str4;
                    x6h1 x6h1VarC28 = x6h1VarI3.a().c();
                    x6h1VarC28.i.add(new a7h1("share_lyrics_selection_view", (String) null, (Integer) null, str4, (String) null));
                    x6h1VarC28.j = true;
                    x6h1 x6h1VarC29 = x6h1VarC28.a().c();
                    x6h1VarC29.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC29.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC29.a(), r6h1Var4, System.currentTimeMillis());
                    return w7h1Var2;
                }
                if (!(pfm0Var instanceof jfm0)) {
                    x6h1 x6h1VarC30 = y6h1VarA.c();
                    x6h1VarC30.i.add(new a7h1("header_view", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC30.j = false;
                    x6h1 x6h1VarC31 = x6h1VarC30.a().c();
                    x6h1VarC31.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC31.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC31.a(), r6h1.c, System.currentTimeMillis());
                    return w7h1Var3;
                }
                obj5 = null;
                return obj5;
            case 1:
                xxl0 xxl0Var = (xxl0) obj;
                if (((tg71) obj4) instanceof fg71) {
                    x6h1 x6h1VarC32 = xxl0Var.a.c();
                    x6h1VarC32.i.add(new a7h1("error_view", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC32.j = true;
                    y6h1 y6h1VarA3 = x6h1VarC32.a();
                    k7h1 k7h1Var2 = new k7h1();
                    ((xjn) k7h1Var2).a = y6h1VarA3;
                    ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                    k7h1Var2.e = xxl0Var.b;
                    i8h1Var.f(k7h1Var2.a(), (Set) null);
                }
                return null;
            case 2:
                d3m0 d3m0Var = (d3m0) obj;
                muj1 muj1Var = (muj1) obj4;
                r6h1 r6h1Var5 = d3m0Var.a;
                y6h1 y6h1Var3 = d3m0Var.b;
                if (muj1Var instanceof huj1) {
                    huj1 huj1Var = (huj1) muj1Var;
                    Integer numValueOf = Integer.valueOf(huj1Var.a);
                    String str5 = huj1Var.b;
                    x6h1 x6h1VarC33 = y6h1Var3.c();
                    x6h1VarC33.i.add(new a7h1("video_preview_card", (String) null, numValueOf, str5, (String) null));
                    x6h1VarC33.j = true;
                    y6h1 y6h1VarA4 = x6h1VarC33.a();
                    String str6 = huj1Var.b;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str6 != null ? str6 : "")), y6h1VarA4, r6h1Var5, System.currentTimeMillis());
                } else {
                    if (muj1Var instanceof iuj1) {
                        return null;
                    }
                    if (muj1Var instanceof juj1) {
                        juj1 juj1Var = (juj1) muj1Var;
                        Integer numValueOf2 = Integer.valueOf(juj1Var.a);
                        String str7 = juj1Var.b;
                        x6h1 x6h1VarC34 = y6h1Var3.c();
                        x6h1VarC34.i.add(new a7h1("video_preview_card", (String) null, numValueOf2, str7, (String) null));
                        x6h1VarC34.j = true;
                        x6h1 x6h1VarC35 = x6h1VarC34.a().c();
                        x6h1VarC35.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC35.j = false;
                        w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC35.a(), r6h1Var5, System.currentTimeMillis());
                    } else {
                        if (muj1Var instanceof luj1) {
                            luj1 luj1Var = (luj1) muj1Var;
                            Integer numValueOf3 = Integer.valueOf(luj1Var.a);
                            String str8 = luj1Var.b;
                            x6h1 x6h1VarC36 = y6h1Var3.c();
                            x6h1VarC36.i.add(new a7h1("video_preview_card", (String) null, numValueOf3, str8, (String) null));
                            x6h1VarC36.j = true;
                            y6h1 y6h1VarA5 = x6h1VarC36.a();
                            k7h1 k7h1Var3 = new k7h1();
                            ((xjn) k7h1Var3).a = y6h1VarA5;
                            ((xjn) k7h1Var3).b = r6h1Var5;
                            ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                            i8h1Var.f(k7h1Var3.a(), (Set) null);
                            return null;
                        }
                        if (!(muj1Var instanceof kuj1)) {
                            eg.o();
                            return null;
                        }
                        kuj1 kuj1Var = (kuj1) muj1Var;
                        Integer numValueOf4 = Integer.valueOf(kuj1Var.a);
                        String str9 = kuj1Var.b;
                        x6h1 x6h1VarC37 = y6h1Var3.c();
                        x6h1VarC37.i.add(new a7h1("video_preview_card", (String) null, numValueOf4, str9, (String) null));
                        x6h1VarC37.j = true;
                        w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", kuj1Var.c)), x6h1VarC37.a(), r6h1Var5, System.currentTimeMillis());
                    }
                }
                return w7h1Var5;
            default:
                d3m0 d3m0Var2 = (d3m0) obj;
                ktj1 ktj1Var = (ktj1) obj4;
                r6h1 r6h1Var6 = d3m0Var2.a;
                y6h1 y6h1Var4 = d3m0Var2.b;
                if (ktj1Var instanceof etj1) {
                    etj1 etj1Var = (etj1) ktj1Var;
                    Integer numValueOf5 = Integer.valueOf(etj1Var.a);
                    String str10 = etj1Var.b;
                    x6h1 x6h1VarC38 = y6h1Var4.c();
                    x6h1VarC38.i.add(new a7h1("video_preview_card", (String) null, numValueOf5, str10, (String) null));
                    x6h1VarC38.j = true;
                    y6h1 y6h1VarA6 = x6h1VarC38.a();
                    String str11 = etj1Var.b;
                    w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str11 != null ? str11 : "")), y6h1VarA6, r6h1Var6, System.currentTimeMillis());
                } else {
                    if (ktj1Var instanceof ftj1) {
                        return null;
                    }
                    if (ktj1Var instanceof gtj1) {
                        gtj1 gtj1Var = (gtj1) ktj1Var;
                        Integer numValueOf6 = Integer.valueOf(gtj1Var.a);
                        String str12 = gtj1Var.b;
                        x6h1 x6h1VarC39 = y6h1Var4.c();
                        x6h1VarC39.i.add(new a7h1("video_preview_card", (String) null, numValueOf6, str12, (String) null));
                        x6h1VarC39.j = true;
                        x6h1 x6h1VarC40 = x6h1VarC39.a().c();
                        x6h1VarC40.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC40.j = false;
                        w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC40.a(), r6h1Var6, System.currentTimeMillis());
                    } else {
                        if (ktj1Var.equals(itj1.a)) {
                            return null;
                        }
                        if (ktj1Var instanceof jtj1) {
                            jtj1 jtj1Var = (jtj1) ktj1Var;
                            Integer numValueOf7 = Integer.valueOf(jtj1Var.a);
                            String str13 = jtj1Var.b;
                            x6h1 x6h1VarC41 = y6h1Var4.c();
                            x6h1VarC41.i.add(new a7h1("video_preview_card", (String) null, numValueOf7, str13, (String) null));
                            x6h1VarC41.j = true;
                            y6h1 y6h1VarA7 = x6h1VarC41.a();
                            k7h1 k7h1Var4 = new k7h1();
                            ((xjn) k7h1Var4).a = y6h1VarA7;
                            ((xjn) k7h1Var4).b = r6h1Var6;
                            ((xjn) k7h1Var4).c = Long.valueOf(System.currentTimeMillis());
                            i8h1Var.f(k7h1Var4.a(), (Set) null);
                            return null;
                        }
                        if (!(ktj1Var instanceof htj1)) {
                            eg.o();
                            return null;
                        }
                        htj1 htj1Var = (htj1) ktj1Var;
                        Integer numValueOf8 = Integer.valueOf(htj1Var.a);
                        String str14 = htj1Var.b;
                        x6h1 x6h1VarC42 = y6h1Var4.c();
                        x6h1VarC42.i.add(new a7h1("video_preview_card", (String) null, numValueOf8, str14, (String) null));
                        x6h1VarC42.j = true;
                        w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", htj1Var.c)), x6h1VarC42.a(), r6h1Var6, System.currentTimeMillis());
                    }
                }
                return w7h1Var6;
        }
    }
}
