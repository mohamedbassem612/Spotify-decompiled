package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pqv extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vqv b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pqv(vqv vqvVar, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = vqvVar;
        this.c = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        b7x b7xVar = b7x.a;
        vqv vqvVar = this.b;
        switch (b) {
            case 0:
                jut jutVar = vqvVar.c;
                i8h1 i8h1Var = (i8h1) jutVar.c;
                x6h1 x6h1VarC = ((txk0) jutVar.b).b.c();
                x6h1VarC.i.add(new a7h1("navigation_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("save_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(rsv.a);
                break;
            case 1:
                jut jutVar2 = vqvVar.c;
                i8h1 i8h1Var2 = (i8h1) jutVar2.c;
                x6h1 x6h1VarC3 = ((txk0) jutVar2.b).b.c();
                x6h1VarC3.i.add(new a7h1("navigation_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("undo_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("discard_changes", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(ssv.a);
                break;
            case 2:
                jut jutVar3 = vqvVar.c;
                i8h1 i8h1Var3 = (i8h1) jutVar3.c;
                x6h1 x6h1VarC5 = ((txk0) jutVar3.b).b.c();
                x6h1VarC5.i.add(new a7h1("navigation_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                x6h1VarC6.i.add(new a7h1("redo_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(qsv.a);
                break;
            case 3:
                jut jutVar4 = vqvVar.c;
                i8h1 i8h1Var4 = (i8h1) jutVar4.c;
                x6h1 x6h1VarC7 = ((txk0) jutVar4.b).b.c();
                x6h1VarC7.i.add(new a7h1("bottom_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = false;
                x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                x6h1VarC8.i.add(new a7h1("move_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = false;
                i8h1Var4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(Boolean.TRUE);
                break;
            default:
                jut jutVar5 = vqvVar.c;
                i8h1 i8h1Var5 = (i8h1) jutVar5.c;
                x6h1 x6h1VarC9 = ((txk0) jutVar5.b).b.c();
                x6h1VarC9.i.add(new a7h1("bottom_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC9.j = false;
                x6h1 x6h1VarC10 = x6h1VarC9.a().c();
                x6h1VarC10.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC10.j = false;
                i8h1Var5.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC10.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(Boolean.FALSE);
                break;
        }
        return rih1Var;
    }
}
