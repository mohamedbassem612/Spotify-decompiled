package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z5g1 implements n5g1 {
    public final i8h1 a;
    public final pfs b;

    public z5g1(i8h1 i8h1Var, pfs pfsVar) {
        this.a = i8h1Var;
        this.b = pfsVar;
    }

    public final tv80 a(String str) {
        yol0 yol0VarA = this.b.a();
        x6h1 x6h1VarC = yol0VarA.b.c();
        x6h1VarC.i.add(new a7h1("trailer", (String) null, (Integer) null, str, (String) null));
        x6h1VarC.j = true;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA = x6h1VarC2.a();
        b7x b7xVar = b7x.a;
        return this.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, yol0VarA.a, System.currentTimeMillis()), (xj61) null);
    }
}
