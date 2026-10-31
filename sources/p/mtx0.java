package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mtx0 {
    public final i8h1 a;
    public final pdl0 b;

    public mtx0(lik1 lik1Var, n6r0 n6r0Var, i8h1 i8h1Var) {
        this.a = i8h1Var;
        this.b = new pdl0(n6r0Var.path(), lik1Var.a, (byte) 10);
    }

    public final void a() {
        x6h1 x6h1VarC = this.b.b.c();
        x6h1VarC.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        this.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }
}
