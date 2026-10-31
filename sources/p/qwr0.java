package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qwr0 {
    public final i8p a;
    public final h7l0 b;
    public final b7l0 c;
    public final idd1 d = new idd1(new pwr0(this, (byte) 0));

    public qwr0(i8p i8pVar, h7l0 h7l0Var, b7l0 b7l0Var) {
        this.a = i8pVar;
        this.b = h7l0Var;
        this.c = b7l0Var;
    }

    public final tv80 a(String str) {
        i8h1 i8h1Var = (i8h1) this.d.getValue();
        x6h1 x6h1VarC = this.b.b.c();
        x6h1VarC.i.add(new a7h1("done_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public final void b(String str) {
        i8h1 i8h1Var = (i8h1) this.d.getValue();
        x6h1 x6h1VarC = this.b.b.c();
        x6h1VarC.i.add(new a7h1("safety_center_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }
}
