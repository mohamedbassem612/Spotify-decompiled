package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rtf extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ttf b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rtf(ttf ttfVar, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = ttfVar;
        this.c = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        b7x b7xVar = b7x.a;
        ttf ttfVar = this.b;
        switch (b) {
            case 0:
                qtf qtfVar = (qtf) ttfVar.f.getValue();
                i8h1 i8h1Var = qtfVar.a;
                x6h1 x6h1VarC = qtfVar.b.b.c();
                x6h1VarC.i.add(new a7h1("action_button", "ask_to_join", (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("submit", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(nuf.a);
                break;
            default:
                qtf qtfVar2 = (qtf) ttfVar.f.getValue();
                i8h1 i8h1Var2 = qtfVar2.a;
                x6h1 x6h1VarC2 = qtfVar2.b.b.c();
                x6h1VarC2.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(huf.a);
                break;
        }
        return rih1Var;
    }
}
