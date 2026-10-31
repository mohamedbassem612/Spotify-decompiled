package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rt61 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vt61 b;
    public final /* synthetic */ cir0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rt61(vt61 vt61Var, cir0 cir0Var, byte b) {
        super(0);
        this.a = b;
        this.b = vt61Var;
        this.c = cir0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        l231 l231Var = l231.a;
        cir0 cir0Var = this.c;
        vt61 vt61Var = this.b;
        switch (b) {
            case 0:
                i8h1 i8h1Var = vt61Var.b;
                oxl0 oxl0Var = vt61Var.i;
                x6h1 x6h1VarC = oxl0Var.b.c();
                x6h1VarC.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                b7x b7xVar = b7x.a;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), y6h1VarA, oxl0Var.c.b, System.currentTimeMillis()), (xj61) null);
                if (!vt61Var.e.b) {
                    vt61Var.a.e();
                } else {
                    ot61 ot61Var = (ot61) vt61Var.h.get();
                    tbr0 tbr0VarC = cir0Var.c();
                    ot61Var.getClass();
                    tbr0VarC.a(l231Var);
                }
                break;
            default:
                ot61 ot61Var2 = (ot61) vt61Var.h.get();
                tbr0 tbr0VarC2 = cir0Var.c();
                ot61Var2.getClass();
                tbr0VarC2.a(l231Var);
                break;
        }
        return rih1Var;
    }
}
