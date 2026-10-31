package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hnw implements View.OnClickListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ jnw b;

    public hnw(boolean z, jnw jnwVar) {
        this.a = z;
        this.b = jnwVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z = this.a;
        jnw jnwVar = this.b;
        if (z) {
            jnwVar.dismiss();
            return;
        }
        jnwVar.i1().a(new mhv0("samsung_effortless_login_sheet", "samsung_effortless_login_started", ew80.c, "none"));
        uba ubaVar = jnwVar.W1;
        if (ubaVar == null) {
            u890.C("ubiLogger");
            throw null;
        }
        evl0 evl0Var = jnwVar.X1;
        if (evl0Var == null) {
            u890.C("eventFactory");
            throw null;
        }
        x6h1 x6h1VarC = evl0Var.a.c();
        x6h1VarC.i.add(new a7h1("login_with_samsung_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        ubaVar.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("login", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()));
        ynw ynwVar = jnwVar.f2;
        if (ynwVar == null) {
            u890.C("viewModel");
            throw null;
        }
        ynwVar.e.m(new m19("", "", 2, ""));
        ynwVar.f.b(ynwVar.b.a().flatMap(new j3v((Object) ynwVar, (byte) 3)).doOnError(new xnw(ynwVar, (byte) 0)).subscribeOn(ynwVar.d).observeOn(ynwVar.c).subscribe(new xnw(ynwVar, (byte) 1), new xnw(ynwVar, (byte) 2)));
    }
}
