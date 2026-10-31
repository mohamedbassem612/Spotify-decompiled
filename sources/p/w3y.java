package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w3y extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ otu b;
    public final /* synthetic */ g5y c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w3y(otu otuVar, g5y g5yVar, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = otuVar;
        this.c = g5yVar;
        this.d = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        b7x b7xVar = b7x.a;
        g5y g5yVar = this.c;
        otu otuVar = this.b;
        switch (b) {
            case 0:
                String str = g5yVar.a;
                x6h1 x6h1VarC = ((txk0) otuVar.c).b.c();
                x6h1VarC.i.add(new a7h1("language_confirmation_dialog", (String) null, (Integer) null, (String) null, str));
                x6h1VarC.j = true;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("language_change_accept_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                iu30Var.invoke(new p4y(((i8h1) otuVar.b).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("select_language", 1, sqg0.J(new mmr0[]{new mmr0("language_selected", str), new mmr0("browser_language", "")})), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a));
                break;
            default:
                String str2 = g5yVar.a;
                x6h1 x6h1VarC3 = ((txk0) otuVar.c).b.c();
                x6h1VarC3.i.add(new a7h1("language_confirmation_dialog", (String) null, (Integer) null, (String) null, str2));
                x6h1VarC3.j = true;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("language_change_cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                ((i8h1) otuVar.b).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("discard_changes", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(o4y.a);
                break;
        }
        return rih1Var;
    }
}
