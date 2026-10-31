package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wcn extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xcn b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wcn(xcn xcnVar, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = xcnVar;
        this.c = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        b7x b7xVar = b7x.a;
        xcn xcnVar = this.b;
        switch (b) {
            case 0:
                oql oqlVar = xcnVar.b;
                i8h1 i8h1Var = (i8h1) ((kly0) oqlVar.b).get();
                ksk0 ksk0Var = (ksk0) oqlVar.c;
                x6h1 x6h1VarC = ksk0Var.c.c();
                x6h1VarC.i.add(new a7h1("restart_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC.a(), ksk0Var.b, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(rcn.a);
                break;
            default:
                oql oqlVar2 = xcnVar.b;
                i8h1 i8h1Var2 = (i8h1) ((kly0) oqlVar2.b).get();
                ksk0 ksk0Var2 = (ksk0) oqlVar2.c;
                x6h1 x6h1VarC2 = ksk0Var2.c.c();
                x6h1VarC2.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC2.a(), ksk0Var2.b, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(mcn.a);
                break;
        }
        return rih1Var;
    }
}
