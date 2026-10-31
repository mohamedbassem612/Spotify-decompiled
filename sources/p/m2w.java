package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class m2w extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jut b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m2w(jut jutVar, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = jutVar;
        this.c = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        b7x b7xVar = b7x.a;
        jut jutVar = this.b;
        switch (b) {
            case 0:
                i8h1 i8h1Var = (i8h1) ((ynb0) jutVar.b).get();
                x6h1 x6h1VarC = ((tdl0) jutVar.c).b.c();
                x6h1VarC.i.add(new a7h1("confirm_discard_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("discard_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(b3w.a);
                break;
            case 1:
                i8h1 i8h1Var2 = (i8h1) ((ynb0) jutVar.b).get();
                x6h1 x6h1VarC3 = ((tdl0) jutVar.c).b.c();
                x6h1VarC3.i.add(new a7h1("confirm_discard_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("keep_editing_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(c3w.a);
                break;
            default:
                i8h1 i8h1Var3 = (i8h1) ((ynb0) jutVar.b).get();
                x6h1 x6h1VarC5 = ((tdl0) jutVar.c).b.c();
                x6h1VarC5.i.add(new a7h1("toolbar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                x6h1VarC6.i.add(new a7h1("save_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(f3w.a);
                break;
        }
        return rih1Var;
    }
}
