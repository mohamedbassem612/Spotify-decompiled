package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ivo0 {
    public final kly0 a;
    public final pdl0 b;

    public ivo0(caq caqVar, pdl0 pdl0Var) {
        this.a = caqVar;
        this.b = pdl0Var;
    }

    public final void a(wm5 wm5Var) {
        mmr0 mmr0Var;
        y6h1 y6h1Var = this.b.b;
        boolean zEquals = wm5Var.equals(hv80.e);
        kly0 kly0Var = this.a;
        b7x b7xVar = b7x.a;
        if (zEquals) {
            i8h1 i8h1Var = (i8h1) kly0Var.get();
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("notifications_bottom_sheet", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            x6h1 x6h1VarC2 = x6h1VarC.a().c();
            x6h1VarC2.i.add(new a7h1("cta_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
            return;
        }
        if (!(wm5Var instanceof iv80)) {
            if (!wm5Var.equals(hv80.f)) {
                eg.o();
                return;
            }
            i8h1 i8h1Var2 = (i8h1) kly0Var.get();
            x6h1 x6h1VarC3 = y6h1Var.c();
            x6h1VarC3.i.add(new a7h1("notifications_bottom_sheet", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC3.j = false;
            x6h1 x6h1VarC4 = x6h1VarC3.a().c();
            x6h1VarC4.i.add(new a7h1("dialog_dismissed", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC4.j = false;
            i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
            return;
        }
        iv80 iv80Var = (iv80) wm5Var;
        int iC = l1d.C(iv80Var.e);
        if (iC == 0) {
            x6h1 x6h1VarC5 = y6h1Var.c();
            x6h1VarC5.i.add(new a7h1("notifications_bottom_sheet", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC5.j = false;
            x6h1 x6h1VarC6 = x6h1VarC5.a().c();
            x6h1VarC6.i.add(new a7h1("email_channel_toggle", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC6.j = false;
            y6h1 y6h1VarA = x6h1VarC6.a();
            z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
            x7h1 x7h1Var = new x7h1("enable_notification_category_in_channel", 1, sqg0.J(new mmr0[]{new mmr0("notification_channel_to_be_enabled", "email"), new mmr0("notification_category_to_be_enabled", "in_person_concerts_and_events")}));
            r6h1 r6h1Var = r6h1.c;
            mmr0Var = new mmr0(new w7h1("", "", z7h1Var, x7h1Var, y6h1VarA, r6h1Var, System.currentTimeMillis()), new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("disable_notification_category_in_channel", 1, sqg0.J(new mmr0[]{new mmr0("notification_channel_to_be_disabled", "email"), new mmr0("notification_category_to_be_disabled", "in_person_concerts_and_events")})), y6h1VarA, r6h1Var, System.currentTimeMillis()));
        } else {
            if (iC != 1) {
                eg.o();
                return;
            }
            x6h1 x6h1VarC7 = y6h1Var.c();
            x6h1VarC7.i.add(new a7h1("notifications_bottom_sheet", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC7.j = false;
            x6h1 x6h1VarC8 = x6h1VarC7.a().c();
            x6h1VarC8.i.add(new a7h1("push_channel_toggle", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC8.j = false;
            y6h1 y6h1VarA2 = x6h1VarC8.a();
            z7h1 z7h1Var2 = new z7h1("hit", 1, b7xVar);
            x7h1 x7h1Var2 = new x7h1("enable_notification_category_in_channel", 1, sqg0.J(new mmr0[]{new mmr0("notification_channel_to_be_enabled", "push"), new mmr0("notification_category_to_be_enabled", "in_person_concerts_and_events")}));
            r6h1 r6h1Var2 = r6h1.c;
            mmr0Var = new mmr0(new w7h1("", "", z7h1Var2, x7h1Var2, y6h1VarA2, r6h1Var2, System.currentTimeMillis()), new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("disable_notification_category_in_channel", 1, sqg0.J(new mmr0[]{new mmr0("notification_channel_to_be_disabled", "push"), new mmr0("notification_category_to_be_disabled", "in_person_concerts_and_events")})), y6h1VarA2, r6h1Var2, System.currentTimeMillis()));
        }
        w7h1 w7h1Var = (w7h1) mmr0Var.a;
        w7h1 w7h1Var2 = (w7h1) mmr0Var.b;
        if (!iv80Var.f) {
            w7h1Var = w7h1Var2;
        }
        ((i8h1) kly0Var.get()).m(w7h1Var, (xj61) null);
    }
}
