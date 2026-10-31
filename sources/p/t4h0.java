package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t4h0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j2e0 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t4h0(j2e0 j2e0Var, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = j2e0Var;
        this.c = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        h3h0 h3h0Var = h3h0.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        j2e0 j2e0Var = this.b;
        switch (b) {
            case 0:
                j2e0Var.n();
                iu30Var.invoke(h3h0Var);
                break;
            case 1:
                i8h1 i8h1Var = (i8h1) j2e0Var.b;
                x6h1 x6h1VarC = ((tdl0) j2e0Var.c).b.c();
                x6h1VarC.i.add(new a7h1("history_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(a3h0.a);
                break;
            case 2:
                j2e0Var.n();
                iu30Var.invoke(h3h0Var);
                break;
            default:
                i8h1 i8h1Var2 = (i8h1) j2e0Var.b;
                x6h1 x6h1VarC2 = ((tdl0) j2e0Var.c).b.c();
                x6h1VarC2.i.add(new a7h1("skip_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(r3h0.a);
                break;
        }
        return rih1Var;
    }
}
