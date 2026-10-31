package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sgz {
    public final kly0 a;
    public final usr0 b;

    public sgz(jly0 jly0Var, usr0 usr0Var) {
        this.a = jly0Var;
        this.b = usr0Var;
    }

    public final void a(String str) {
        r6h1 r6h1VarA = this.b.a();
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-your-library-error-dialog";
        x6h1VarI.f = "1.0.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.e = str;
        x6h1 x6h1VarC = x6h1VarI.a().c();
        x6h1VarC.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        ((i8h1) this.a.get()).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1VarA, System.currentTimeMillis()), (xj61) null);
    }
}
