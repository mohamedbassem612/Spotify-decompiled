package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x850 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sp00 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x850(sp00 sp00Var, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = sp00Var;
        this.c = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        d100 d100Var = d100.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        b7x b7xVar = b7x.a;
        sp00 sp00Var = this.b;
        switch (b) {
            case 0:
                i8h1 i8h1Var = (i8h1) ((idd1) sp00Var.e).getValue();
                wqk0 wqk0Var = (wqk0) sp00Var.c;
                x6h1 x6h1VarC = wqk0Var.c.c();
                x6h1VarC.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), wqk0Var.b, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(d100Var);
                break;
            case 1:
                i8h1 i8h1Var2 = (i8h1) ((idd1) sp00Var.e).getValue();
                wqk0 wqk0Var2 = (wqk0) sp00Var.c;
                x6h1 x6h1VarC2 = wqk0Var2.c.c();
                x6h1VarC2.i.add(new a7h1("try_again_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC2.a(), wqk0Var2.b, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(f100.a);
                break;
            default:
                i8h1 i8h1Var3 = (i8h1) ((idd1) sp00Var.e).getValue();
                wqk0 wqk0Var3 = (wqk0) sp00Var.d;
                x6h1 x6h1VarC3 = wqk0Var3.c.c();
                x6h1VarC3.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), wqk0Var3.b, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(d100Var);
                break;
        }
        return rih1Var;
    }
}
