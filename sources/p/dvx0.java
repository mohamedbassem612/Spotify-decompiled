package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dvx0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fvx0 b;
    public final /* synthetic */ n360 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dvx0(fvx0 fvx0Var, n360 n360Var, byte b) {
        super(0);
        this.a = b;
        this.b = fvx0Var;
        this.c = n360Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b7x b7xVar = b7x.a;
        n360 n360Var = this.c;
        fvx0 fvx0Var = this.b;
        switch (b) {
            case 0:
                mtx0 mtx0Var = fvx0Var.a;
                String strA = n360Var.a();
                x6h1 x6h1VarC = mtx0Var.b.b.c();
                x6h1VarC.i.add(new a7h1("chat_view_group", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("back_button", strA, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                mtx0Var.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                fvx0Var.e.accept(mrx0.a);
                break;
            default:
                mtx0 mtx0Var2 = fvx0Var.a;
                String strA2 = n360Var.a();
                x6h1 x6h1VarC3 = mtx0Var2.b.b.c();
                x6h1VarC3.i.add(new a7h1("more_options_button", strA2, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                mtx0Var2.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                fvx0Var.e.accept(csx0.a);
                break;
        }
        return rih1Var;
    }
}
