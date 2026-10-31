package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rzd0 {
    public final i8h1 a;
    public final h7l0 b;

    public rzd0(i8h1 i8h1Var, lik1 lik1Var) {
        this.a = i8h1Var;
        this.b = new h7l0(lik1Var.a, (byte) 29);
    }

    public final String a(qzd0 qzd0Var) {
        return b(qzd0Var).a.a;
    }

    public final tv80 b(qzd0 qzd0Var) {
        char c;
        String str;
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        y6h1 y6h1Var = this.b.b;
        boolean zEquals = qzd0Var.equals(gzd0.a);
        b7x b7xVar = b7x.a;
        i8h1 i8h1Var = this.a;
        if (zEquals) {
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            x6h1 x6h1VarC2 = x6h1VarC.a().c();
            x6h1VarC2.i.add(new a7h1("toolbar", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            x6h1 x6h1VarC3 = x6h1VarC2.a().c();
            x6h1VarC3.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC3.j = false;
            return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        }
        if (qzd0Var.equals(nzd0.a)) {
            return c();
        }
        if (qzd0Var instanceof kzd0) {
            kzd0 kzd0Var = (kzd0) qzd0Var;
            String str2 = kzd0Var.a;
            if (kzd0Var.b) {
                x6h1 x6h1VarC4 = y6h1Var.c();
                x6h1VarC4.i.add(new a7h1("controls_section", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                x6h1 x6h1VarC5 = x6h1VarC4.a().c();
                x6h1VarC5.i.add(new a7h1("play_stop_button", "locked", (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:upsell:premium_in_app_destination?displayReason=kpop_upsell:listening_parties")), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis());
            } else {
                x6h1 x6h1VarC6 = y6h1Var.c();
                x6h1VarC6.i.add(new a7h1("controls_section", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                x6h1 x6h1VarC7 = x6h1VarC6.a().c();
                x6h1VarC7.i.add(new a7h1("play_stop_button", "unlocked", (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = false;
                w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str2)), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis());
            }
            return i8h1Var.m(w7h1Var2, (xj61) null);
        }
        if (qzd0Var instanceof ozd0) {
            String str3 = ((ozd0) qzd0Var).a;
            x6h1 x6h1VarC8 = y6h1Var.c();
            x6h1VarC8.i.add(new a7h1("controls_section", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC8.j = false;
            x6h1 x6h1VarC9 = x6h1VarC8.a().c();
            x6h1VarC9.i.add(new a7h1("play_stop_button", "unlocked", (Integer) null, (String) null, (String) null));
            x6h1VarC9.j = false;
            return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("stop", 1, Collections.singletonMap("item_to_be_stopped", str3)), x6h1VarC9.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        }
        if (qzd0Var instanceof mzd0) {
            x6h1 x6h1VarC10 = y6h1Var.c();
            x6h1VarC10.i.add(new a7h1("controls_section", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC10.j = false;
            x6h1 x6h1VarC11 = x6h1VarC10.a().c();
            x6h1VarC11.i.add(new a7h1("rsvp_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC11.j = false;
            return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC11.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        }
        if (qzd0Var instanceof izd0) {
            String str4 = ((izd0) qzd0Var).a;
            x6h1 x6h1VarC12 = y6h1Var.c();
            x6h1VarC12.i.add(new a7h1("controls_section", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC12.j = false;
            x6h1 x6h1VarC13 = x6h1VarC12.a().c();
            x6h1VarC13.i.add(new a7h1("listen_on_web_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC13.j = false;
            return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str4)), x6h1VarC13.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        }
        if (qzd0Var instanceof jzd0) {
            if (((jzd0) qzd0Var).a) {
                x6h1 x6h1VarC14 = y6h1Var.c();
                x6h1VarC14.i.add(new a7h1("controls_section", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC14.j = false;
                x6h1 x6h1VarC15 = x6h1VarC14.a().c();
                x6h1VarC15.i.add(new a7h1("notify_me_button", "locked", (Integer) null, (String) null, (String) null));
                x6h1VarC15.j = false;
                w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC15.a(), r6h1.c, System.currentTimeMillis());
            } else {
                x6h1 x6h1VarC16 = y6h1Var.c();
                x6h1VarC16.i.add(new a7h1("controls_section", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC16.j = false;
                x6h1 x6h1VarC17 = x6h1VarC16.a().c();
                x6h1VarC17.i.add(new a7h1("notify_me_button", "unlocked", (Integer) null, (String) null, (String) null));
                x6h1VarC17.j = false;
                w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC17.a(), r6h1.c, System.currentTimeMillis());
            }
            return i8h1Var.m(w7h1Var, (xj61) null);
        }
        if (qzd0Var instanceof pzd0) {
            String str5 = ((pzd0) qzd0Var).a;
            x6h1 x6h1VarC18 = y6h1Var.c();
            x6h1VarC18.i.add(new a7h1("controls_section", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC18.j = false;
            x6h1 x6h1VarC19 = x6h1VarC18.a().c();
            x6h1VarC19.i.add(new a7h1("view_event_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC19.j = false;
            return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5)), x6h1VarC19.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        }
        if (qzd0Var.equals(ezd0.a)) {
            x6h1 x6h1VarC20 = y6h1Var.c();
            x6h1VarC20.i.add(new a7h1("controls_section", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC20.j = false;
            x6h1 x6h1VarC21 = x6h1VarC20.a().c();
            x6h1VarC21.i.add(new a7h1("add_to_calendar_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC21.j = false;
            return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC21.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        }
        if (qzd0Var instanceof fzd0) {
            int iC = l1d.C(((fzd0) qzd0Var).a);
            if (iC == 0) {
                c = 2;
            } else {
                if (iC != 1) {
                    eg.o();
                    return null;
                }
                c = 1;
            }
            x6h1 x6h1VarC22 = y6h1Var.c();
            if (c == 1) {
                str = "get_on_the_list";
            } else {
                if (c != 2) {
                    throw null;
                }
                str = "notify_me";
            }
            x6h1VarC22.i.add(new a7h1("successful_action_modal", str, (Integer) null, (String) null, (String) null));
            x6h1VarC22.j = true;
            x6h1 x6h1VarC23 = x6h1VarC22.a().c();
            x6h1VarC23.i.add(new a7h1("add_to_calendar_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC23.j = false;
            return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC23.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        }
        if (!(qzd0Var instanceof hzd0)) {
            if (!(qzd0Var instanceof lzd0)) {
                eg.o();
                return null;
            }
            String str6 = ((lzd0) qzd0Var).a;
            x6h1 x6h1VarC24 = y6h1Var.c();
            x6h1VarC24.i.add(new a7h1("posted_by", (String) null, (Integer) null, str6, (String) null));
            x6h1VarC24.j = false;
            return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str6)), x6h1VarC24.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        }
        String str7 = ((hzd0) qzd0Var).a;
        x6h1 x6h1VarC25 = y6h1Var.c();
        x6h1VarC25.i.add(new a7h1("host_section", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC25.j = false;
        x6h1 x6h1VarC26 = x6h1VarC25.a().c();
        x6h1VarC26.i.add(new a7h1("host_row", (String) null, 0, (String) null, (String) null));
        x6h1VarC26.j = false;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str7)), x6h1VarC26.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public final tv80 c() {
        x6h1 x6h1VarC = this.b.b.c();
        x6h1VarC.i.add(new a7h1("controls_section", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("share_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA = x6h1VarC2.a();
        b7x b7xVar = b7x.a;
        return this.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }
}
