package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ib50 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nb50 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ib50(nb50 nb50Var, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = nb50Var;
        this.c = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        b7x b7xVar = b7x.a;
        nb50 nb50Var = this.b;
        switch (b) {
            case 0:
                i8h1 i8h1Var = (i8h1) nb50Var.a.get();
                ksk0 ksk0Var = nb50Var.b;
                x6h1 x6h1VarC = ksk0Var.c.c();
                x6h1VarC.i.add(new a7h1("done_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), ksk0Var.b, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(o000.c);
                break;
            case 1:
                i8h1 i8h1Var2 = (i8h1) nb50Var.a.get();
                wqk0 wqk0Var = nb50Var.c;
                x6h1 x6h1VarC2 = wqk0Var.c.c();
                x6h1VarC2.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), wqk0Var.b, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(o000.b);
                break;
            default:
                i8h1 i8h1Var3 = (i8h1) nb50Var.a.get();
                wqk0 wqk0Var2 = nb50Var.c;
                x6h1 x6h1VarC3 = wqk0Var2.c.c();
                x6h1VarC3.i.add(new a7h1("try_again_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC3.a(), wqk0Var2.b, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(o000.c);
                break;
        }
        return rih1Var;
    }
}
