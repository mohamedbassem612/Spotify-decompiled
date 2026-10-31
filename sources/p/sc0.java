package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sc0 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oj80 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sc0(oj80 oj80Var, byte b) {
        super(4);
        this.a = b;
        this.b = oj80Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        sqk0 sqk0Var;
        w7h1 w7h1Var;
        byte b = this.a;
        oj80 oj80Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                r6h1 r6h1Var = (r6h1) obj4;
                qc0 qc0Var = (qc0) ((spq0) obj2).h();
                return qc0Var != null ? new rc0(new sqk0(new g5l0(r6h1Var, (byte) 14), qc0Var.g.a), oj80Var, qc0Var) : ak20.c;
            default:
                p360 p360Var = (p360) obj;
                oc0 oc0Var = (oc0) obj4;
                qc0 qc0Var2 = (qc0) ((spq0) obj3).h();
                if (qc0Var2 == null || (sqk0Var = p360Var.get()) == null) {
                    return null;
                }
                rjn rjnVar = (rjn) oj80Var.b;
                r6h1 r6h1Var2 = sqk0Var.c.b;
                y6h1 y6h1Var = sqk0Var.b;
                boolean zEquals = oc0Var.equals(hc0.a);
                b7x b7xVar = b7x.a;
                if (zEquals) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("device_picker_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "devicepicker view")), x6h1VarC.a(), r6h1Var2, System.currentTimeMillis());
                } else if (oc0Var.equals(kc0.a)) {
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("invite_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1Var2, System.currentTimeMillis());
                } else if (oc0Var instanceof lc0) {
                    x6h1 x6h1VarC3 = y6h1Var.c();
                    x6h1VarC3.i.add(new a7h1("facepile_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "participantlist view")), x6h1VarC3.a(), r6h1Var2, System.currentTimeMillis());
                } else if (oc0Var.equals(mc0.a)) {
                    boolean z = qc0Var2.g.b;
                    if (z) {
                        x6h1 x6h1VarC4 = y6h1Var.c();
                        x6h1VarC4.i.add(new a7h1("end_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC4.j = true;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("stop_hosting_social_listening_session", 1, b7xVar), x6h1VarC4.a(), r6h1Var2, System.currentTimeMillis());
                    } else {
                        if (z) {
                            eg.o();
                            return null;
                        }
                        x6h1 x6h1VarC5 = y6h1Var.c();
                        x6h1VarC5.i.add(new a7h1("leave_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC5.j = true;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("leave_social_listening_session", 1, b7xVar), x6h1VarC5.a(), r6h1Var2, System.currentTimeMillis());
                    }
                } else if (oc0Var.equals(ic0.a)) {
                    x6h1 x6h1VarC6 = y6h1Var.c();
                    x6h1VarC6.i.add(new a7h1("add_songs_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = true;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "addsongs view")), x6h1VarC6.a(), r6h1Var2, System.currentTimeMillis());
                } else {
                    if (oc0Var.equals(jc0.a)) {
                        x6h1 x6h1VarC7 = ((yok0) rjnVar.b).b.c();
                        x6h1VarC7.i.add(new a7h1("capped_premium_queue_banner", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC7.j = true;
                        y6h1 y6h1VarA = x6h1VarC7.a();
                        String str = nik1.b2.a;
                        z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                        if (str == null) {
                            str = "";
                        }
                        return new w7h1("", "", z7h1Var, new x7h1("show_paywall", 1, Collections.singletonMap("paywalled_item", str)), y6h1VarA, r6h1.c, System.currentTimeMillis());
                    }
                    if (!oc0Var.equals(nc0.a)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC8 = y6h1Var.c();
                    x6h1VarC8.i.add(new a7h1("settings_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = true;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC8.a(), r6h1Var2, System.currentTimeMillis());
                }
                return w7h1Var;
        }
    }
}
