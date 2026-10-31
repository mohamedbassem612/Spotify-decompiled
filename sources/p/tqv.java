package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tqv extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vqv b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tqv(vqv vqvVar, Function0 function0, byte b) {
        super(0);
        this.a = b;
        this.b = vqvVar;
        this.c = function0;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        b7x b7xVar = b7x.a;
        vqv vqvVar = this.b;
        switch (b) {
            case 0:
                jut jutVar = vqvVar.c;
                i8h1 i8h1Var = (i8h1) jutVar.c;
                x6h1 x6h1VarC = ((txk0) jutVar.b).b.c();
                x6h1VarC.i.add(new a7h1("bottom_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("select_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                function0.invoke();
                break;
            default:
                jut jutVar2 = vqvVar.c;
                i8h1 i8h1Var2 = (i8h1) jutVar2.c;
                x6h1 x6h1VarC3 = ((txk0) jutVar2.b).b.c();
                x6h1VarC3.i.add(new a7h1("bottom_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("exit_select_mode_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                function0.invoke();
                break;
        }
        return rih1Var;
    }
}
