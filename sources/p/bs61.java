package p;

import android.content.DialogInterface;
import io.reactivex.rxjava3.subjects.SingleSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bs61 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ l811 a;
    public final /* synthetic */ SingleSubject b;
    public final /* synthetic */ String c;
    public final /* synthetic */ cs61 d;

    public bs61(l811 l811Var, SingleSubject singleSubject, String str, cs61 cs61Var) {
        this.a = l811Var;
        this.b = singleSubject;
        this.c = str;
        this.d = cs61Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (!this.a.a) {
            this.b.onSuccess(new qp61(this.c));
        }
        ax7 ax7Var = this.d.c;
        i8h1 i8h1Var = (i8h1) ax7Var.a.get();
        uol0 uol0Var = ax7Var.b;
        uol0Var.getClass();
        x6h1 x6h1VarC = uol0Var.b.c();
        x6h1VarC.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, uol0Var.a, System.currentTimeMillis()), (xj61) null);
    }
}
