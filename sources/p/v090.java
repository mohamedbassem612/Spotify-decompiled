package p;

import android.content.DialogInterface;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class v090 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ wp20 a;
    public final /* synthetic */ dsk0 b;
    public final /* synthetic */ p410 c;
    public final /* synthetic */ p811 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function0 g;

    public v090(wp20 wp20Var, dsk0 dsk0Var, p410 p410Var, p811 p811Var, Function0 function0, Function0 function1, Function0 function2) {
        this.a = wp20Var;
        this.b = dsk0Var;
        this.c = p410Var;
        this.d = p811Var;
        this.e = function0;
        this.f = function1;
        this.g = function2;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        i8h1 i8h1Var = (i8h1) this.a.d;
        x6h1 x6h1VarC = this.b.b.c();
        x6h1VarC.i.add(new a7h1("not_now_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
        CompositeDisposable compositeDisposable = (CompositeDisposable) this.c.h;
        if (!compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
        t090 t090Var = (t090) this.d.a;
        if (t090Var == null) {
            this.e.invoke();
            return;
        }
        if (t090Var.equals(r090.a)) {
            this.f.invoke();
        } else if (t090Var.equals(s090.a)) {
            this.g.invoke();
        } else {
            eg.o();
        }
    }
}
