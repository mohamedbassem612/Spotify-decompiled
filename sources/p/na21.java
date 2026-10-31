package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class na21 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k811 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ na21(k811 k811Var, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = k811Var;
        this.c = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        b7x b7xVar = b7x.a;
        k811 k811Var = this.b;
        switch (b) {
            case 0:
                i8h1 i8h1Var = (i8h1) ((idd1) k811Var.c).getValue();
                x6h1 x6h1VarC = ((h7l0) k811Var.d).b.c();
                x6h1VarC.i.add(new a7h1("remove_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("submit", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(ea21.a);
                break;
            default:
                i8h1 i8h1Var2 = (i8h1) ((idd1) k811Var.c).getValue();
                x6h1 x6h1VarC2 = ((h7l0) k811Var.d).b.c();
                x6h1VarC2.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(da21.a);
                break;
        }
        return rih1Var;
    }
}
