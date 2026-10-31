package p;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j9b implements o86 {
    public final i8h1 a;
    public final q9l0 b;
    public final wqk0 c;

    public j9b(i8h1 i8h1Var, int i) {
        this.a = i8h1Var;
        int iC = l1d.C(i);
        int i2 = 1;
        if (iC != 0) {
            if (iC != 1) {
                eg.o();
                throw null;
            }
            i2 = 2;
        }
        q9l0 q9l0Var = new q9l0(i2);
        this.b = q9l0Var;
        this.c = new wqk0(q9l0Var.b(), (byte) 18);
    }

    public final tv80 a() {
        x6h1 x6h1VarC = this.b.a.c();
        x6h1VarC.i.add(new a7h1("disclaimer_link", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        return this.a.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "usage_limits")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public final tv80 b() {
        x6h1 x6h1VarC = this.b.a.c();
        x6h1VarC.i.add(new a7h1("disclosure_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        return this.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public final tv80 c(String str) {
        return null;
    }

    public final void d() {
        wqk0 wqk0Var = this.c;
        x6h1 x6h1VarC = wqk0Var.c.c();
        x6h1VarC.i.add(new a7h1("save_for_next_episode_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        this.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, wqk0Var.b, System.currentTimeMillis()), (xj61) null);
    }

    public final tv80 e(String str) {
        x6h1 x6h1VarC = this.b.a.c();
        x6h1VarC.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        return this.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public final void f() {
        this.a.f(this.c.e(), (Set) null);
    }

    public final tv80 g() {
        x6h1 x6h1VarC = this.b.a.c();
        x6h1VarC.i.add(new a7h1("primary_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        return this.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("submit", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public final void h() {
        wqk0 wqk0Var = this.c;
        x6h1 x6h1VarC = wqk0Var.c.c();
        x6h1VarC.i.add(new a7h1("generate_now_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        this.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("create_episode", 1, b7xVar), y6h1VarA, wqk0Var.b, System.currentTimeMillis()), (xj61) null);
    }
}
