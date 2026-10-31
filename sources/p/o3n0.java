package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class o3n0 {
    public final i8h1 a;
    public final zbl0 b;

    public o3n0(i8h1 i8h1Var, zbl0 zbl0Var) {
        this.a = i8h1Var;
        this.b = zbl0Var;
    }

    public final void a() {
        zbl0 zbl0Var = this.b;
        zbl0Var.getClass();
        x6h1 x6h1VarC = zbl0Var.a.c();
        x6h1VarC.i.add(new a7h1("error_modal", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("error_modal_primary_action", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA = x6h1VarC2.a();
        b7x b7xVar = b7x.a;
        this.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public final void b() {
        zbl0 zbl0Var = this.b;
        zbl0Var.getClass();
        x6h1 x6h1VarC = zbl0Var.a.c();
        x6h1VarC.i.add(new a7h1("error_modal", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).b = r6h1.c;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        this.a.f(k7h1Var.a(), (Set) null);
    }
}
