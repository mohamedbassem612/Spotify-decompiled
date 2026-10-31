package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class osr0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ poj0 b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ osr0(poj0 poj0Var, ven0 ven0Var, byte b) {
        super(0);
        this.a = b;
        this.b = poj0Var;
        this.c = ven0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.c;
        b7x b7xVar = b7x.a;
        poj0 poj0Var = this.b;
        switch (b) {
            case 0:
                i8h1 i8h1Var = (i8h1) ((idd1) poj0Var.d).getValue();
                x6h1 x6h1VarC = ((h7l0) poj0Var.c).b.c();
                x6h1VarC.i.add(new a7h1("remove_parent_or_guardian_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                ven0Var.setValue(Boolean.TRUE);
                break;
            default:
                i8h1 i8h1Var2 = (i8h1) ((idd1) poj0Var.d).getValue();
                b8l0 b8l0Var = (b8l0) ((idd1) poj0Var.e).getValue();
                b8l0Var.getClass();
                x6h1 x6h1VarC2 = b8l0Var.b.c();
                x6h1VarC2.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), b8l0Var.a, System.currentTimeMillis()), (xj61) null);
                ven0Var.setValue(Boolean.FALSE);
                break;
        }
        return rih1Var;
    }
}
