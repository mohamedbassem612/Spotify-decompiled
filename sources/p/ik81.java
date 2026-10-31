package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ik81 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kk81 b;
    public final /* synthetic */ x2y c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ik81(kk81 kk81Var, x2y x2yVar, byte b) {
        super(0);
        this.a = b;
        this.b = kk81Var;
        this.c = x2yVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        x2y x2yVar = this.c;
        b7x b7xVar = b7x.a;
        kk81 kk81Var = this.b;
        switch (b) {
            case 0:
                mk81 mk81Var = kk81Var.K1;
                if (mk81Var == null) {
                    u890.C("logger");
                    throw null;
                }
                uba ubaVar = mk81Var.a;
                d7l0 d7l0Var = mk81Var.c;
                x6h1 x6h1VarC = d7l0Var.b.c();
                x6h1VarC.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                uba ubaVar2 = ubaVar;
                ubaVar2.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), d7l0Var.a, System.currentTimeMillis()));
                x2yVar.b().accept(v100.a);
                return rih1Var;
            default:
                mk81 mk81Var2 = kk81Var.K1;
                if (mk81Var2 == null) {
                    u890.C("logger");
                    throw null;
                }
                uba ubaVar3 = mk81Var2.a;
                d7l0 d7l0Var2 = mk81Var2.c;
                x6h1 x6h1VarC2 = d7l0Var2.b.c();
                x6h1VarC2.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                uba ubaVar4 = ubaVar3;
                ubaVar4.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), d7l0Var2.a, System.currentTimeMillis()));
                x2yVar.b().accept(a100.a);
                return rih1Var;
        }
    }
}
