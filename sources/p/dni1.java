package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dni1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fni1 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dni1(fni1 fni1Var, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = fni1Var;
        this.c = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        b7x b7xVar = b7x.a;
        fni1 fni1Var = this.b;
        switch (b) {
            case 0:
                ymi1 ymi1VarC = fni1Var.c();
                i8h1 i8h1Var = ymi1VarC.a;
                brl0 brl0Var = ymi1VarC.c;
                brl0Var.getClass();
                x6h1 x6h1VarC = brl0Var.b.c();
                x6h1VarC.i.add(new a7h1("retry_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(pmi1.a);
                break;
            default:
                ymi1 ymi1VarC2 = fni1Var.c();
                i8h1 i8h1Var2 = ymi1VarC2.a;
                brl0 brl0Var2 = ymi1VarC2.c;
                brl0Var2.getClass();
                x6h1 x6h1VarC2 = brl0Var2.b.c();
                x6h1VarC2.i.add(new a7h1("show_qr_code_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(wmi1.a);
                break;
        }
        return rih1Var;
    }
}
