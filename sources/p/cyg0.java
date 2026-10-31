package p;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cyg0 {
    public final i8h1 a;
    public final String b = nik1.i2.a;

    public cyg0(i8h1 i8h1Var) {
        this.a = i8h1Var;
    }

    public final hfl0 a(String str) {
        if (str.length() == 0) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            str = yon1.M2().c;
        }
        return new hfl0(str, this.b);
    }

    public final void b(String str, boolean z) {
        w7h1 w7h1Var;
        y6h1 y6h1Var = a(str).a;
        b7x b7xVar = b7x.a;
        if (z) {
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("dismiss", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            w7h1Var = new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
        } else {
            x6h1 x6h1VarC2 = y6h1Var.c();
            x6h1VarC2.i.add(new a7h1("dismiss", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
        }
        this.a.m(w7h1Var, (xj61) null);
    }

    public final tv80 c(int i, String str, String str2) {
        w7h1 w7h1Var;
        y6h1 y6h1Var = a(str2).a;
        int iC = l1d.C(i);
        b7x b7xVar = b7x.a;
        if (iC == 0) {
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("cover_art", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
        } else if (iC == 1) {
            x6h1 x6h1VarC2 = y6h1Var.c();
            x6h1VarC2.i.add(new a7h1("cta_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
        } else if (iC == 2) {
            x6h1 x6h1VarC3 = y6h1Var.c();
            x6h1VarC3.i.add(new a7h1("learn_more_button", (String) null, (Integer) null, str, (String) null));
            x6h1VarC3.j = false;
            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str != null ? str : "")), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
        } else if (iC == 3) {
            x6h1 x6h1VarC4 = y6h1Var.c();
            x6h1VarC4.i.add(new a7h1("whats_this_link_text", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC4.j = false;
            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
        } else if (iC == 4) {
            x6h1 x6h1VarC5 = y6h1Var.c();
            x6h1VarC5.i.add(new a7h1("like_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC5.j = false;
            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", str != null ? str : "")), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis());
        } else {
            if (iC != 5) {
                eg.o();
                return null;
            }
            x6h1 x6h1VarC6 = y6h1Var.c();
            x6h1VarC6.i.add(new a7h1("like_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC6.j = false;
            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_like", 1, Collections.singletonMap("item_no_longer_liked", str != null ? str : "")), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
        }
        return this.a.m(w7h1Var, (xj61) null);
    }

    public final void d(String str, String str2) {
        w7h1 w7h1Var;
        y6h1 y6h1Var = a(str2).a;
        b7x b7xVar = b7x.a;
        if (str != null) {
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("opt_out_updates", (String) null, (Integer) null, (String) null, str));
            x6h1VarC.j = false;
            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
        } else {
            x6h1 x6h1VarC2 = y6h1Var.c();
            x6h1VarC2.i.add(new a7h1("opt_out_artist", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
        }
        this.a.m(w7h1Var, (xj61) null);
    }
}
