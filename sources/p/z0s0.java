package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z0s0 {
    public final i8h1 a;
    public final d4e0 b;
    public final lvc c;

    public z0s0(i8h1 i8h1Var, d4e0 d4e0Var, lvc lvcVar) {
        this.a = i8h1Var;
        this.b = d4e0Var;
        this.c = lvcVar;
    }

    public final void a(slc0 slc0Var) {
        py9 py9Var = (py9) this.b.b;
        x6h1 x6h1VarC = py9Var.c.c();
        x6h1VarC.i.add(new a7h1("nudge", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("link_account_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA = x6h1VarC2.a();
        b7x b7xVar = b7x.a;
        this.c.a(slc0Var, "google_assistant", "", this.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, py9Var.b, System.currentTimeMillis()), (xj61) null).a.a, 1, 6);
    }

    public final void b() {
        py9 py9Var = (py9) this.b.b;
        x6h1 x6h1VarC = py9Var.c.c();
        x6h1VarC.i.add(new a7h1("nudge", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("not_now_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA = x6h1VarC2.a();
        b7x b7xVar = b7x.a;
        this.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, py9Var.b, System.currentTimeMillis()), (xj61) null);
    }

    public final void c(slc0 slc0Var) {
        py9 py9Var = (py9) this.b.b;
        x6h1 x6h1VarC = py9Var.c.c();
        x6h1VarC.i.add(new a7h1("nudge", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).b = py9Var.b;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        this.c.e(3, this.a.f(k7h1Var.a(), (Set) null).a.a, "google_assistant", "", slc0Var);
    }
}
