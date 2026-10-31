package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h750 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sp00 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h750(sp00 sp00Var, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = sp00Var;
        this.c = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        b7x b7xVar = b7x.a;
        sp00 sp00Var = this.b;
        switch (b) {
            case 0:
                i8h1 i8h1VarN = sp00Var.n();
                x6h1 x6h1VarC = ((txk0) sp00Var.c).b.c();
                x6h1VarC.i.add(new a7h1("approve_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1VarN.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(ec50.a);
                break;
            case 1:
                i8h1 i8h1VarN2 = sp00Var.n();
                x6h1 x6h1VarC2 = ((txk0) sp00Var.c).b.c();
                x6h1VarC2.i.add(new a7h1("decline_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1VarN2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(zb50.a);
                break;
            default:
                i8h1 i8h1VarN3 = sp00Var.n();
                wqk0 wqk0Var = (wqk0) sp00Var.d;
                x6h1 x6h1VarC3 = wqk0Var.c.c();
                x6h1VarC3.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                i8h1VarN3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), wqk0Var.b, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(cc50.a);
                break;
        }
        return rih1Var;
    }
}
