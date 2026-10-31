package p;

import android.content.DialogInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o8b implements DialogInterface.OnCancelListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ mp8 b;

    public o8b(boolean z, mp8 mp8Var) {
        this.a = z;
        this.b = mp8Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        zwg zwgVar = (zwg) this.b.b;
        b7x b7xVar = b7x.a;
        if (!this.a) {
            q59 q59VarS = zwgVar.s();
            i8h1 i8h1Var = (i8h1) q59VarS.b;
            x6h1 x6h1VarC = ((rrk0) q59VarS.c).b.c();
            x6h1VarC.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
            return;
        }
        ((lzn0) zwgVar.a).e();
        q59 q59VarS2 = zwgVar.s();
        i8h1 i8h1Var2 = (i8h1) q59VarS2.b;
        x6h1 x6h1VarC2 = ((rrk0) q59VarS2.c).b.c();
        x6h1VarC2.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }
}
