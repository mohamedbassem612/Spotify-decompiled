package p;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cn1 implements Callable {
    public final /* synthetic */ en1 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    public cn1(en1 en1Var, String str, int i) {
        this.a = en1Var;
        this.b = str;
        this.c = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        pv80 pv80Var = (pv80) this.a.c;
        i8h1 i8h1Var = pv80Var.a;
        r6h1 r6h1Var = pv80Var.b;
        Integer numValueOf = Integer.valueOf(this.c);
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-playlist-entity-item-list-item";
        x6h1VarI.f = "3.0.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.c = numValueOf;
        x6h1VarI.d = this.b;
        x6h1 x6h1VarC = x6h1VarI.a().c();
        x6h1VarC.i.add(new a7h1("curated_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, r6h1Var, System.currentTimeMillis()), (xj61) null);
    }
}
