package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c8w {
    public final blp a;
    public final urk0 b;

    public c8w(blp blpVar, urk0 urk0Var) {
        this.a = blpVar;
        this.b = urk0Var;
    }

    public final tv80 a(String str) {
        i8h1 i8h1Var = (i8h1) this.a.get();
        x6h1 x6h1VarC = this.b.b.c();
        x6h1VarC.i.add(new a7h1("add_account_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public final void b(String str) {
        i8h1 i8h1Var = (i8h1) this.a.get();
        x6h1 x6h1VarC = this.b.b.c();
        x6h1VarC.i.add(new a7h1("parental_controls_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public final void c(String str) {
        i8h1 i8h1Var = (i8h1) this.a.get();
        x6h1 x6h1VarC = this.b.b.c();
        x6h1VarC.i.add(new a7h1("safety_center_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }
}
