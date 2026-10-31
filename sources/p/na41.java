package p;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class na41 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mzr0 b;

    public /* synthetic */ na41(mzr0 mzr0Var, byte b) {
        this.a = b;
        this.b = mzr0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        mzr0 mzr0Var = this.b;
        switch (b) {
            case 0:
                nt21 nt21Var = (nt21) mzr0Var.a;
                i8h1 i8h1Var = (i8h1) nt21Var.b;
                x6h1 x6h1VarC = ((tdl0) nt21Var.c).b.c();
                x6h1VarC.i.add(new a7h1("save_profile_failed_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("retry", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                String str = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
                ((Function0) mzr0Var.c).invoke();
                break;
            default:
                nt21 nt21Var2 = (nt21) mzr0Var.a;
                i8h1 i8h1Var2 = (i8h1) nt21Var2.b;
                x6h1 x6h1VarC3 = ((tdl0) nt21Var2.c).b.c();
                x6h1VarC3.i.add(new a7h1("save_profile_failed_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("cancel", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                String str2 = i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
                ((Function0) mzr0Var.b).invoke();
                break;
        }
    }
}
