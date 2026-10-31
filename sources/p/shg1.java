package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class shg1 {
    public final dlp a;
    public final ksk0 b;
    public final b7l0 c;
    public final idd1 d = new idd1(new vvr0(this, (byte) 1));

    public shg1(dlp dlpVar, ksk0 ksk0Var, b7l0 b7l0Var) {
        this.a = dlpVar;
        this.b = ksk0Var;
        this.c = b7l0Var;
    }

    public final tv80 a(String str) {
        i8h1 i8h1Var = (i8h1) this.d.getValue();
        ksk0 ksk0Var = this.b;
        x6h1 x6h1VarC = ksk0Var.c.c();
        x6h1VarC.i.add(new a7h1("next_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC.a(), ksk0Var.b, System.currentTimeMillis()), (xj61) null);
    }

    public final void b(String str) {
        i8h1 i8h1Var = (i8h1) this.d.getValue();
        ksk0 ksk0Var = this.b;
        x6h1 x6h1VarC = ksk0Var.c.c();
        x6h1VarC.i.add(new a7h1("privacy_policy_link", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str)), x6h1VarC.a(), ksk0Var.b, System.currentTimeMillis()), (xj61) null);
    }

    public final void c(String str) {
        i8h1 i8h1Var = (i8h1) this.d.getValue();
        ksk0 ksk0Var = this.b;
        x6h1 x6h1VarC = ksk0Var.c.c();
        x6h1VarC.i.add(new a7h1("support_site_link", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str)), x6h1VarC.a(), ksk0Var.b, System.currentTimeMillis()), (xj61) null);
    }
}
