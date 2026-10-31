package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xwk1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ywk1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xwk1(ywk1 ywk1Var, byte b) {
        super(0);
        this.a = b;
        this.b = ywk1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b7x b7xVar = b7x.a;
        ywk1 ywk1Var = this.b;
        switch (b) {
            case 0:
                dzp0 dzp0Var = ywk1Var.a;
                i8h1 i8h1Var = (i8h1) ((jly0) dzp0Var.b).get();
                x6h1 x6h1VarC = ((brl0) dzp0Var.c).b.c();
                x6h1VarC.i.add(new a7h1("voting_error_banner", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
            default:
                dzp0 dzp0Var2 = ywk1Var.a;
                i8h1 i8h1Var2 = (i8h1) ((jly0) dzp0Var2.b).get();
                x6h1 x6h1VarC3 = ((brl0) dzp0Var2.c).b.c();
                x6h1VarC3.i.add(new a7h1("voting_error_banner", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("retry_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
        }
        return rih1Var;
    }
}
