package p;

import android.content.DialogInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ezs0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ zhq0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ lik1 c;

    public ezs0(zhq0 zhq0Var, int i, lik1 lik1Var) {
        this.a = zhq0Var;
        this.b = i;
        this.c = lik1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        n0u n0uVar = (n0u) this.a.c;
        ezl0 ezl0Var = new ezl0(f4i1.c(this.b, "pin_limit_reached_"), n0u.a(this.c), (byte) 5);
        x6h1 x6h1VarC = ezl0Var.c.c();
        x6h1VarC.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        n0uVar.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, ezl0Var.b, System.currentTimeMillis()), (xj61) null);
    }
}
