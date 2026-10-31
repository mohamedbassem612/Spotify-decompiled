package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vn91 {
    public final i8h1 a;
    public final idd1 b = new idd1(gr81.i);

    public vn91(i8h1 i8h1Var) {
        this.a = i8h1Var;
    }

    public final void a() {
        z5l0 z5l0Var = (z5l0) this.b.getValue();
        z5l0Var.getClass();
        x6h1 x6h1VarC = z5l0Var.a.c();
        x6h1VarC.i.add(new a7h1("back", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        this.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public final void b() {
        this.a.f(((z5l0) this.b.getValue()).e(), (Set) null);
    }

    public final tv80 c() {
        z5l0 z5l0Var = (z5l0) this.b.getValue();
        z5l0Var.getClass();
        x6h1 x6h1VarC = z5l0Var.a.c();
        x6h1VarC.i.add(new a7h1("shuffle_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        return this.a.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("select_shuffle_mode", 1, sqg0.J(new mmr0[]{new mmr0("previous_mode", "linear"), new mmr0("selected_mode", "shuffle")})), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public final tv80 d() {
        z5l0 z5l0Var = (z5l0) this.b.getValue();
        z5l0Var.getClass();
        x6h1 x6h1VarC = z5l0Var.a.c();
        x6h1VarC.i.add(new a7h1("smart_shuffle_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        return this.a.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("select_shuffle_mode", 1, sqg0.J(new mmr0[]{new mmr0("previous_mode", "linear"), new mmr0("selected_mode", "smart_shuffle")})), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }
}
