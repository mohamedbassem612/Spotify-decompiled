package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k3n extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a4n b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k3n(a4n a4nVar, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = a4nVar;
        this.c = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        b7x b7xVar = b7x.a;
        a4n a4nVar = this.b;
        switch (b) {
            case 0:
                i8h1 i8h1Var = (i8h1) a4nVar.c.getValue();
                x6h1 x6h1VarC = a4nVar.b.b.c();
                x6h1VarC.i.add(new a7h1("error_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("try_again_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(x3n.a);
                break;
            default:
                i8h1 i8h1Var2 = (i8h1) a4nVar.c.getValue();
                x6h1 x6h1VarC3 = a4nVar.b.b.c();
                x6h1VarC3.i.add(new a7h1("error_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(u3n.a);
                break;
        }
        return rih1Var;
    }
}
