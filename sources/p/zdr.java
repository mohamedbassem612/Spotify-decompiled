package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zdr {
    public final i8h1 a;
    public final d4e0 b;
    public final lvc c;
    public final xov0 d;

    public zdr(i8h1 i8h1Var, d4e0 d4e0Var, lvc lvcVar, xov0 xov0Var) {
        this.a = i8h1Var;
        this.b = d4e0Var;
        this.c = lvcVar;
        this.d = xov0Var;
    }

    public final void a() {
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
}
