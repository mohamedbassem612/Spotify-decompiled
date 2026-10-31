package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ah61 implements uqd0 {
    public final yrd0 a;

    public ah61(yrd0 yrd0Var) {
        this.a = yrd0Var;
    }

    @Override // p.uqd0
    public final void a() {
        yrd0 yrd0Var = this.a;
        i8h1 i8h1Var = yrd0Var.a;
        py9 py9Var = yrd0Var.b;
        x6h1 x6h1VarC = py9Var.c.c();
        x6h1VarC.i.add(new a7h1("session_recorded_dialog", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("close_dialog_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA = x6h1VarC2.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, py9Var.b, System.currentTimeMillis()), (xj61) null);
    }

    @Override // p.uqd0
    public final void c() {
        yrd0 yrd0Var = this.a;
        i8h1 i8h1Var = yrd0Var.a;
        py9 py9Var = yrd0Var.b;
        x6h1 x6h1VarC = py9Var.c.c();
        x6h1VarC.i.add(new a7h1("session_recorded_dialog", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).b = py9Var.b;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        i8h1Var.f(k7h1Var.a(), (Set) null);
    }
}
