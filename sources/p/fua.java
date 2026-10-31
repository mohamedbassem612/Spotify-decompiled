package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fua extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ffe1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fua(ffe1 ffe1Var, byte b) {
        super(0);
        this.a = b;
        this.b = ffe1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b7x b7xVar = b7x.a;
        ffe1 ffe1Var = this.b;
        switch (b) {
            case 0:
                i8h1 i8h1Var = (i8h1) ((z1p) ffe1Var.c).get();
                x6h1 x6h1VarC = ((yok0) ffe1Var.b).b.c();
                x6h1VarC.i.add(new a7h1("payment_method_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("no_action", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
            case 1:
                i8h1 i8h1Var2 = (i8h1) ((z1p) ffe1Var.c).get();
                x6h1 x6h1VarC2 = ((yok0) ffe1Var.b).b.c();
                x6h1VarC2.i.add(new a7h1("price_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("no_action", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
            default:
                i8h1 i8h1Var3 = (i8h1) ((z1p) ffe1Var.c).get();
                x6h1 x6h1VarC3 = ((yok0) ffe1Var.b).b.c();
                x6h1VarC3.i.add(new a7h1("billing_date_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("no_action", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
        }
        return rih1Var;
    }
}
